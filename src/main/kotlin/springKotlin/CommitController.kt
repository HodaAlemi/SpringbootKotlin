package springkotlin

import org.springframework.web.bind.annotation.*
import springKotlin.Commit
import springKotlin.CommitService


@RestController
class CommitController(val service: CommitService) {

    @GetMapping("/commits")
    fun getAllCommits(): List<Commit> = service.getAllCommits()

    @PostMapping
    fun post(@RequestBody payload: List<Commit>): List<Commit> = service.createCommit(payload)

    @DeleteMapping("/commits/{id}")
    fun deleteEmployeesById(@PathVariable("id") commitId: Long): Unit =
        service.deleteCommitById(commitId)

}



