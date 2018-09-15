package com.bzh.dytt.util

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.util.Log

class ThunderHelper {

    fun startThunder(context: Context?, urls: String) {
        context?.startActivity(Intent("android.intent.action.VIEW", Uri.parse(urls)))
    }

    fun checkIsInstall(context: Context?) = try {
        context?.packageManager?.getApplicationInfo(XUN_LEI_PACKAGE_NAME, 0)
        true
    } catch (e: PackageManager.NameNotFoundException) {
        Log.d(TAG, "checkIsInstall() called with: context = [$context]")
        false
    }

    companion object {

        private const val TAG = "ThunderHelper"

        private const val XUN_LEI_PACKAGE_NAME = "com.xunlei.downloadprovider"
    }
}


