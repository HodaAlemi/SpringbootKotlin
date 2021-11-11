package springKotlin

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class CommitService (private val commitRepository: CommitRepository) {

    fun getAllCommits(): List<Commit> = commitRepository.findAll()

    fun createCommit(data: List<Commit>): List<Commit>  {
        data.forEach{ c -> commitRepository.save(c)}
        return data
    }

    fun deleteCommitById(commitId: Long) {
        return if (commitRepository.existsById(commitId)) {
            commitRepository.deleteById(commitId)
        } else throw CommitNotFoundException(HttpStatus.NOT_FOUND, "No matching ID was found")
    }
}