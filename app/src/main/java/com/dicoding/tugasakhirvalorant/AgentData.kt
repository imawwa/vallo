package com.dicoding.tugasakhirvalorant

import android.os.Parcel
import android.os.Parcelable

data class AgentData(
    var agentPhoto:Int = 0,
    var agentName :String = "",
    var agentRole: String = "",
    var agentRealname :String = "",
    var agentGender :String = "",
    var agentNegara :String = "",
    var agentRas:String = "",
    var agentDeskripsi:String = "",
):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),

    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(agentPhoto)
        parcel.writeString(agentName)
        parcel.writeString(agentRole)
        parcel.writeString(agentRealname)
        parcel.writeString(agentGender)
        parcel.writeString(agentNegara)
        parcel.writeString(agentRas)
        parcel.writeString(agentDeskripsi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<AgentData> {
        override fun createFromParcel(parcel: Parcel): AgentData {
            return AgentData(parcel)
        }

        override fun newArray(size: Int): Array<AgentData?> {
            return arrayOfNulls(size)
        }
    }
}
