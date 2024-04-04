package id.ac.pnm.ti.utsmobilesatu

// data class Club
data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,
    val efl: Int,
    val ucl: Int,
    val uel: Int
) {
    val totalTrophy: Int
        get() = epl + fa + efl + ucl + uel
}

// extension function recap
fun Club.recap(): String {
    return "${this.name} berhasil meraih $epl trofi EPL, $fa trofi FA, $efl trofi EFL, $ucl trofi UCL, dan $uel trofi UEL"
}