package com.lkonlesoft.displayinfo

import androidx.annotation.StringRes

sealed class AboutItem(var tittle: String, @StringRes var text: Int, @StringRes var url: Int){
    object AppVer: AboutItem("App version", R.string.app_ver, R.string.rate_link)
    object IconCredit: AboutItem("Sleep icon created by SANB", R.string.icon_credit_text, R.string.icon_link)
    object Privacy: AboutItem("Privacy Policy", R.string.privacy_text, R.string.privacy_link)
    object Contact: AboutItem("© 2023 LKONLE", R.string.contact_text, R.string.contact_link)
}
