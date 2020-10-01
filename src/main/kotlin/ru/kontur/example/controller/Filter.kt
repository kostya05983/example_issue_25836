package ru.kontur.example.controller

import org.springframework.web.bind.annotation.RequestParam

data class Filter(
    @RequestParam(name = "types[]")
    var types: MutableList<String>?
)