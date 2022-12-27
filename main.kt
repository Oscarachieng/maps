// comment Class
class Comment(val userId: Int, val comment: String)

// List of Comments
val messages: List<Comment> = listOf(
    Comment(23,"Nice code"),
  Comment(24,"Like it"),
  Comment(26,"Whats is going on?")
)

val blockedUsersId: Set<Int> = setOf(93,43,32)

val userIdToRelation: Map<Int, String> = mapOf(
  24 to "Work colleague",
  23 to "Student",
  26 to "Student"
)

fun findingRelation(){
  for (msg in messages){
    if(msg.userId !in blockedUsersId){
       println("${msg.comment} from ${userIdToRelation[msg.userId]}")
    } 
  }

}


fun main() {
  findingRelation()
}