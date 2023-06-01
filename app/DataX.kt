data class DataX(
    val _id: String,
    val area_name: String,
    val auto_room_navigation: Boolean,
    val floor: String,
    val grid_size: Int,
    val img: List<ImgX>,
    val occupancy: Boolean,
    val occupancy_indication: Boolean,
    val personal_name: String,
    val personal_room: Boolean,
    val ring: List<Int>,
    val temp_max: Int,
    val temp_min: Int,
    val temperature: Int
)