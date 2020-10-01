package ru.kontur.example.controller

import org.springframework.web.bind.annotation.RequestParam

data class Filter(
    @RequestParam
    val take: Int = 30,

    @RequestParam(name = "types[]")
    var types: MutableList<String>?
)