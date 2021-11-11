package springKotlin

import org.springframework.http.HttpStatus

class CommitNotFoundException(status:HttpStatus, message: String) : Exception(message)