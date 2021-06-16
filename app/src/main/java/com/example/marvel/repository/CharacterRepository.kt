


import android.content.Context
import com.example.marvel.R
import com.example.marvel.constants.MarvelConstants
import com.example.marvel.listener.APIListener
import com.example.marvel.model.character.ResponseCharacterModel
import com.example.marvel.repository.remote.CharacterService
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CharacterRepository(val context: Context) : BaseRepository() {

    private val mRemote = RetrofitClient.createService(CharacterService::class.java)

    fun list(listener: APIListener<ResponseCharacterModel>, limit: Int, offset: Int) {
        val call: Call<ResponseCharacterModel> = mRemote.list(limit, offset)

        if (!isConnectionAvailable(context)) {
            listener.onFailure(context.getString(R.string.ERROR_INTERNET_CONNECTION))
            return
        }

        call.enqueue(object : Callback<ResponseCharacterModel> {
            override fun onFailure(call: Call<ResponseCharacterModel>, t: Throwable) {
                listener.onFailure(context.getString(R.string.ERROR_UNEXPECTED))
            }

            override fun onResponse(
                call: Call<ResponseCharacterModel>,
                response: Response<ResponseCharacterModel>
            ) {
                if (response.code() != MarvelConstants.HTTP.SUCCESS) {
                    val validation =
                        Gson().fromJson(response.errorBody()!!.string(), String::class.java)
                    listener.onFailure(validation)
                } else {
                    response.body()?.let { listener.onSuccess(it) }
                }
            }
        })
    }
}