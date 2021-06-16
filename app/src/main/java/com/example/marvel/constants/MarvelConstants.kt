package com.example.marvel.constants

class MarvelConstants private constructor() {
//ligando os dados com o bundle
    object BUNDLE {
        const val DESCRIPTION = "description"
        const val ID = "id"
        const val NAME = "name"
        const val THUMBNAIL = "thumbnail"
    }
//referenciando o o htttp como succes
    object HTTP {
        const val SUCCESS = 200
    }
//keys de acesso geradas pelo site da api
    object KEYS {
        const val PRIVATE = "663844bc1a595ee1a75f4e4761a3ae4aa3e89d41"
        const val PUBLIC = "f533d81b11612b628189f8ef8dce2851"
    }
//parametros passados pela api
//hash faz um resumo dos dados que sao passados pelo MD5 que é obrigatório nessa api
//ts vai epgar horas e datas de acesso
    object PARAMS {
        const val API_KEY = "apikey"
        const val HASH = "hash"
        const val LIMIT = "limit"
        const val OFFSET = "offset"
        const val OFFSET_VAL = 6
        const val TS = "ts"
    }

}