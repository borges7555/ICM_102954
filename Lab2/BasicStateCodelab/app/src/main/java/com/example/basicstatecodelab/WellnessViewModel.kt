package com.example.basicstatecodelab

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) =
        _tasks.find { it.id == item.id }?.let { task ->
            task.checked = checked
        }
}

private fun getWellnessTasks() = listOf(
    WellnessTask(0, "Naruto", true),
    WellnessTask(1, "One Piece", false),
    WellnessTask(2, "Bleach", false),
    WellnessTask(3, "Demon Slayer", false),
    WellnessTask(4, "Attack on Titan", true),
    WellnessTask(5, "Fullmetal Alchemist", false),
    WellnessTask(6, "Jujutsu Kaisen", false),
    WellnessTask(7, "My Hero Academia", false),
    WellnessTask(8, "Black Clover", false),
    WellnessTask(9, "Dragon Ball", false),
    WellnessTask(10, "Death Note", true),
    WellnessTask(11, "Berserk", false),
    WellnessTask(12, "One-Punch Man", false),
    WellnessTask(13, "Hunter x Hunter", true),
    WellnessTask(14, "Fire Force", false),
    WellnessTask(15, "Tower of God", false),
    WellnessTask(16, "Tokyo Ghoul", true),
    WellnessTask(17, "Hell's Paradise", false),
    WellnessTask(18, "Chainsaw Man", false),
    WellnessTask(19, "Blue Lock", false),
    WellnessTask(20, "Haikyu!", true),
    WellnessTask(21, "The God of High School", false),
    WellnessTask(22, "Tokyo Revengers", false),
    WellnessTask(23, "JoJo's Bizarre Adventure", false),
    WellnessTask(24, "Solo Leveling", true),
    WellnessTask(25, "Dr. Stone", false),
    WellnessTask(26, "Mushoku Tensei", false),
    WellnessTask(27, "Boruto", false),
    WellnessTask(28, "Horimiya", true),
    WellnessTask(29, "The Promised Neverland", false)
)
