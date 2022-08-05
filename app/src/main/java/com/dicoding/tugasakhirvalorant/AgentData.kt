package com.dicoding.tugasakhirvalorant

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AgentData(
    var agentPhoto:Int = 0,
    var agentName :String = "",
    var agentRole: String = "",
    var agentRealname :String = "",
    var agentGender :String = "",
    var agentNegara :String = "",
    var agentRas:String = "",
    var agentDeskripsi:String = "",
):Parcelable
