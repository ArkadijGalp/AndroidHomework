package space.arkady.homeworklesson1

fun List<User>.userSortByName() = this.sortedBy { user: User -> user.name }


fun List<User>.userAdultSelect() = this.sortedBy { user: User -> user.age >= 18 }