package springKotlin

import javax.persistence.*

@Entity
@Table(name = "commit")
data class Commit(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "commits_number", nullable = false)
    val commitsNumber: Number,

    @Column(name = "year", nullable = false)
    val year: Number
)

