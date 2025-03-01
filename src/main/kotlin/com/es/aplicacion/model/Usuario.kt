package com.es.aplicacion.model

import org.bson.codecs.pojo.annotations.BsonId
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document("Usuarios")
data class Usuario(
    @BsonId
    val _id : String?,
    val username: String,
    val password: String,
    val email: String,
    val roles: String = "USER",
    @DBRef
    var hogar: Hogar? = null
) {



}