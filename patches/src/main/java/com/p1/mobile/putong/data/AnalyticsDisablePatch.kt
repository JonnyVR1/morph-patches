package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.Method
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

private const val RETURN_VOID = "return-void"

private const val RETURN_EMPTY_STRING = """
    const-string v0, ""
    return-object v0
"""

private const val RETURN_NULL_OBJECT = """
    const/4 v0, 0x0
    return-object v0
"""

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private fun isConstructor(method: Method): Boolean =
    method.name == "<init>" || method.name == "<clinit>"

private val foxStatsClassFingerprint = Fingerprint(
    filters = listOf(string("e_request_none_oaid")),
)

private val beatlesClassFingerprint = Fingerprint(
    filters = listOf(string("com.tantanapp.beatles")),
)

private val oaidClassFingerprint = Fingerprint(
    filters = listOf(string("miit_oaid")),
)

private val rootDetectionClassFingerprint = Fingerprint(
    filters = listOf(string("/system/usr/we-need-root/su")),
)

private val shuMeiClassFingerprint = Fingerprint(
    filters = listOf(string("createSmAntiFraudInit")),
)

private val firebaseAnalyticsClassFingerprint = Fingerprint(
    filters = listOf(string("add_payment_info")),
)

private val uniqueImeiClassFingerprint = Fingerprint(
    filters = listOf(string("UniqueIMEI")),
)

private val uniqueDeviceIdClassFingerprint = Fingerprint(
    filters = listOf(string("UniqueDeviceId")),
)

private val googleAdIdClassFingerprint = Fingerprint(
    filters = listOf(string("com.google.android.gms.ads.identifier.service.START")),
)

private val pushStatsClassFingerprint = Fingerprint(
    filters = listOf(string("mmfile_push_statistic")),
)

private val batteryMetricsClassFingerprint = Fingerprint(
    filters = listOf(string("BatteryMetrics")),
)

private val moLiveApmClassFingerprint = Fingerprint(
    filters = listOf(string("live-PerfTracer")),
)

private val dnsSlaClassFingerprint = Fingerprint(
    filters = listOf(string("DNS_SLA")),
)

private val packageEnumerationClassFingerprint = Fingerprint(
    filters = listOf(string("getInstalledPackages")),
)

private val moTracingClassFingerprint = Fingerprint(
    filters = listOf(string("_getOrCreate"), string("_compressRecordFile")),
)

private val networkMetricsClassFingerprint = Fingerprint(
    filters = listOf(string("setMmcvVersion"), string("setMagicEffectVersion")),
)

private val moLiveApmClassFingerprint2 = Fingerprint(
    filters = listOf(string("getSubmitAlternative")),
)

private val tencentMtaClassFingerprint = Fingerprint(
    filters = listOf(string("com.tencent.stat.StatService")),
)

private val telephonyDeviceIdFingerprint = Fingerprint(
    filters = listOf(string("android.permission.READ_PHONE_STATE"), string("phone")),
)

@Suppress("unused")
@JvmField
val analyticsDisablePatch = bytecodePatch(
    name = "Analytics Disable",
    description = "Disables all analytics, telemetry, and device fingerprinting for privacy",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefByOrNull("Lcom/appsflyer/AppsFlyerLib;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                val isPublicFinal = AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                                   AccessFlags.FINAL.isSet(method.accessFlags)
                when {
                    isPublicFinal &&
                    method.returnType == "Lcom/appsflyer/AppsFlyerLib;" &&
                    method.parameterTypes == listOf("Ljava/lang/String;", "Lcom/appsflyer/AppsFlyerConversionListener;", "Landroid/content/Context;") ->
                        method.addInstructions(0, RETURN_NULL_OBJECT)

                    isPublicFinal &&
                    method.returnType == "V" &&
                    method.parameterTypes == listOf("Landroid/content/Context;") ->
                        method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/clevertap/android/sdk/CleverTapAPI;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                val isPublicStatic = AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                                    AccessFlags.STATIC.isSet(method.accessFlags)
                when {
                    isPublicStatic &&
                    method.returnType == "Lcom/clevertap/android/sdk/CleverTapAPI;" &&
                    method.parameterTypes == listOf("Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;") ->
                        method.addInstructions(0, RETURN_NULL_OBJECT)

                    isPublicStatic &&
                    method.returnType == "Lcom/clevertap/android/sdk/CleverTapAPI;" &&
                    method.parameterTypes == listOf("Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ljava/lang/String;") ->
                        method.addInstructions(0, RETURN_NULL_OBJECT)
                }
            }
        }

        classDefByOrNull("Lcom/facebook/appevents/AppEventsLogger;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                val isPublicStaticFinal = AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                                         AccessFlags.STATIC.isSet(method.accessFlags) &&
                                         AccessFlags.FINAL.isSet(method.accessFlags)
                when {
                    isPublicStaticFinal &&
                    method.returnType == "V" &&
                    method.parameterTypes == listOf("Landroid/app/Application;") ->
                        method.addInstructions(0, RETURN_VOID)

                    isPublicStaticFinal &&
                    method.returnType == "V" &&
                    method.parameterTypes == listOf("Landroid/app/Application;", "Ljava/lang/String;") ->
                        method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/google/firebase/crashlytics/FirebaseCrashlytics;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (method.name == "getInstance" && method.returnType.startsWith("L")) {
                    method.addInstructions(0, RETURN_NULL_OBJECT)
                }
            }
        }

        foxStatsClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.parameterTypes.size == 2 &&
                    method.parameterTypes[0] == "Landroid/content/Context;" &&
                    method.returnType == "V" -> method.addInstructions(0, RETURN_VOID)

                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Landroid/content/Context;" &&
                    method.returnType == "V" -> method.addInstructions(0, RETURN_VOID)

                    method.name.length == 1 && method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        beatlesClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name in setOf("init", "install", "start") && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        oaidClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                    AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "Ljava/lang/String;" &&
                    method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, RETURN_EMPTY_STRING)
                }
            }
        }

        rootDetectionClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (method.returnType == "Z" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        shuMeiClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name == "createSmAntiFraudInit" ||
                    (method.name.contains("init") && method.returnType == "V")) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        firebaseAnalyticsClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (method.name in setOf("logEvent", "setAnalyticsCollectionEnabled", "setUserId",
                                        "setUserProperty", "resetAnalyticsData", "setCurrentScreen",
                                        "setDefaultEventParameters", "setSessionTimeoutDuration", "setConsent") &&
                    method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        uniqueImeiClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (method.name == "getUniqueId" && method.returnType == "Ljava/lang/String;") {
                    method.addInstructions(0, RETURN_EMPTY_STRING)
                }
            }
        }

        uniqueDeviceIdClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (method.name == "getUniqueId" && method.returnType == "Ljava/lang/String;") {
                    method.addInstructions(0, RETURN_EMPTY_STRING)
                }
            }
        }

        googleAdIdClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (method.name == "getAdvertisingIdInfo" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Landroid/content/Context;" &&
                    method.returnType.startsWith("L")) {
                    method.addInstructions(0, RETURN_NULL_OBJECT)
                }
            }
        }

        pushStatsClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name in setOf("init", "logPushEventInfo", "logRegCallback", "forceUpload") &&
                    method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        batteryMetricsClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name == "init" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        moLiveApmClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name in setOf("init", "start", "enable", "trace", "record", "report", "flush", "stop") &&
                    method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        dnsSlaClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name in setOf("init", "flush", "setEnable", "log", "setOnFlushListener") &&
                    method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Package enumeration - return empty list
        packageEnumerationClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (method.returnType == "Ljava/util/List;" || method.returnType == "Ljava/util/ArrayList;") {
                    method.addInstructions(0, """
                        new-instance v0, Ljava/util/ArrayList;
                        invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
                        return-object v0
                    """)
                }
            }
        }

        // MoTracing - disable tracing methods
        moTracingClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name in setOf("init", "start", "stop", "flush", "trace", "span",
                                        "record", "report", "enable", "disable", "submit",
                                        "_getOrCreate", "_compressRecordFile", "_send",
                                        "_flush", "_record", "_trace") &&
                    method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
                if (method.name in setOf("isEnabled", "isReady", "isRunning", "_isEnabled") &&
                    method.returnType == "Z" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        // Network Metrics - disable metrics methods
        networkMetricsClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name in setOf("init", "flush", "report", "realTimeReport",
                                        "setMMCVVersion", "setMagicEffectVersion",
                                        "setRecorderSDKVersion", "setUID", "setXEngineVersion") &&
                    method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // MoLive APM - disable APM methods
        moLiveApmClassFingerprint2.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name in setOf("init", "start", "enable", "submit", "collect",
                                        "report", "flush", "stop", "setSubmitAlternative",
                                        "getSubmitAlternative") &&
                    method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Sina DeviceId JNI SDK - disable device fingerprinting
        classDefByOrNull("Lcom/sina/deviceidjnisdk/DeviceId;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when (method.returnType) {
                    "Ljava/lang/String;" -> method.addInstructions(0, RETURN_EMPTY_STRING)
                    "V" -> method.addInstructions(0, RETURN_VOID)
                    else -> if (method.returnType.startsWith("L")) {
                        method.addInstructions(0, RETURN_NULL_OBJECT)
                    }
                }
            }
        }

        // Cosmos Photon Push UniqueIDs - disable hardware ID collection
        listOf(
            "Lcom/cosmos/photon/push/uniqueid/UniqueAndroidId;",
            "Lcom/cosmos/photon/push/uniqueid/UniqueIMEI;",
            "Lcom/cosmos/photon/push/uniqueid/UniqueDeviceId;",
            "Lcom/cosmos/photon/push/uniqueid/UniqueSerialNumber;"
        ).forEach { descriptor ->
            classDefByOrNull(descriptor)?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (isConstructor(method)) return@forEach
                    when (method.returnType) {
                        "Ljava/lang/String;" -> method.addInstructions(0, RETURN_EMPTY_STRING)
                        "V" -> method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        // Obfuscated Device Collectors - disable TelephonyManager-based collection
        telephonyDeviceIdFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when (method.returnType) {
                    "Ljava/lang/String;" -> method.addInstructions(0, RETURN_EMPTY_STRING)
                    "V" -> method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Tencent LiteAV Telemetry - disable performance tracking
        classDefByOrNull("Lcom/tencent/liteav/basic/datareport/TXCDRApi;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Tencent MTA StatService - disable user behavior analytics
        tencentMtaClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Cosmos MDLog - disable core logging infrastructure
        classDefByOrNull("Lcom/cosmos/mdlog/MDLog;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when (method.returnType) {
                    "V" -> method.addInstructions(0, RETURN_VOID)
                    "Ljava/lang/String;" -> method.addInstructions(0, RETURN_EMPTY_STRING)
                    else -> if (method.returnType.startsWith("L")) {
                        method.addInstructions(0, RETURN_NULL_OBJECT)
                    }
                }
            }
        }

        // Install Referrer API - disable install attribution tracking
        classDefByOrNull("Lcom/android/installreferrer/api/InstallReferrerClient;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.returnType == "V" -> method.addInstructions(0, RETURN_VOID)
                    method.returnType == "Ljava/lang/String;" -> method.addInstructions(0, RETURN_EMPTY_STRING)
                    method.returnType.startsWith("L") -> method.addInstructions(0, RETURN_NULL_OBJECT)
                }
            }
        }
    }
}
