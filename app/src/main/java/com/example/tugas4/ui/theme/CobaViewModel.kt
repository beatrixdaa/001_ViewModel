package com.example.tugas4.ui.theme

import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.core.app.NotificationCompat.StreamType
import androidx.lifecycle.ViewModel
import com.example.tugas4.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr: String by mutableStateOf("")
        private set
    var noTelp: String by mutableStateOf("")
        private set
    var alamat: String by mutableStateOf("")
        private set
    var jenisKl: String by mutableStateOf("")
        private set



    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow <DataForm> get() = _uiState

    fun insertData(nm: String, tlp: String, almt: String, jk: String) {
        namaUsr = nm
        noTelp = tlp
        alamat = almt
        jenisKl = jk

    }


    fun setJenisK(pilihJK: String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }
}
