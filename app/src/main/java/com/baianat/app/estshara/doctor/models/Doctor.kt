package com.baianat.app.estshara.doctor.models

data class Doctor(
    var id: Int,
    var fullName: String,
    var userName: String,
    var password: String,
    var phoneNumber: String,
    var email: String,
    var speciality: String,
    var urlMasterDegree: String,
    var urlSyndicateId: String,
    var urlProfessionLicence: String
)
