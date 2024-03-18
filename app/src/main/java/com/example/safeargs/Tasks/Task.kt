package com.example.safeargs.Tasks

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Task(
    val name: String,
    val numbers: List<String>
) : Parcelable

