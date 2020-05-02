package com.example.jadwalimsakiyah.model

import java.io.Serializable

class ModelMain : Serializable {

    var txtFajr: String? = null
    var txtDhuhr: String? = null
    var txtAsr: String? = null
    var txtMaghrib: String? = null
    var txtIsha: String? = null
    var txtImsak: String? = null

    @JvmField
    var txtDate: String? = null

    @JvmField
    var txtDay: String? = null
    var txtYear: String? = null
    var txtWeekDay: String? = null

}