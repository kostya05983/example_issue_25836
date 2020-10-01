package ru.kontur.example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping(
    value = ["test/"]
)
class ExampleController {

    @GetMapping("not_working")
    fun notWorking(filter: Filter): Mono<String> {
        return Mono.create { it.success("test") }
    }

    @GetMapping("working")
    fun working(
        @RequestParam(name = "types[]") types: List<String>
    ): Mono<String> {
        return Mono.create { it.success("test") }
    }
}