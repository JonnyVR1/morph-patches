package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags

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

private val zvf0ClassFingerprint = Fingerprint(
    filters = listOf(
        string("e_request_none_oaid"),
    ),
)

private val appsFlyerClassFingerprint = Fingerprint(
    filters = listOf(
        string("dmfeSDkpVxP8m6Ys6yJCpn"),
    ),
)

private val appsFlyerInitFingerprint = Fingerprint(
    classFingerprint = appsFlyerClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Lcom/appsflyer/AppsFlyerLib;",
    parameters = listOf(
        "Ljava/lang/String;",
        "Lcom/appsflyer/AppsFlyerConversionListener;",
        "Landroid/content/Context;",
    ),
)

private val appsFlyerStartFingerprint = Fingerprint(
    classFingerprint = appsFlyerClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf("Landroid/content/Context;"),
)

private val cleverTapClassFingerprint = Fingerprint(
    filters = listOf(
        string("CleverTap SDK initialized with accountId"),
    ),
)

private val cleverTapInstanceFingerprint = Fingerprint(
    classFingerprint = cleverTapClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Lcom/clevertap/android/sdk/CleverTapAPI;",
    parameters = listOf(
        "Landroid/content/Context;",
        "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;",
    ),
)

private val cleverTapInstanceWithIdFingerprint = Fingerprint(
    classFingerprint = cleverTapClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Lcom/clevertap/android/sdk/CleverTapAPI;",
    parameters = listOf(
        "Landroid/content/Context;",
        "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;",
        "Ljava/lang/String;",
    ),
)

private val facebookAppEventsClassFingerprint = Fingerprint(
    filters = listOf(
        string("facebook-core_release"),
    ),
)

private val facebookAppEventsInitFingerprint = Fingerprint(
    classFingerprint = facebookAppEventsClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf("Landroid/app/Application;"),
)

private val facebookAppEventsInitWithIdFingerprint = Fingerprint(
    classFingerprint = facebookAppEventsClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf(
        "Landroid/app/Application;",
        "Ljava/lang/String;",
    ),
)

private val beatlesCrashMonitorClassFingerprint = Fingerprint(
    filters = listOf(
        string("com.tantanapp.beatles"),
    ),
)

private val oaidClassFingerprint = Fingerprint(
    filters = listOf(
        string("miit_oaid"),
    ),
)

private val oaidGetterFingerprint = Fingerprint(
    classFingerprint = oaidClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Ljava/lang/String;",
    parameters = emptyList(),
)

// ── dev2: Root detection bypass ──
private val rootDetectionClassFingerprint = Fingerprint(
    filters = listOf(
        string("/system/usr/we-need-root/su"),
    ),
)

// ── dev2: Emulator detection bypass ──
private val emulatorDetectionClassFingerprint = Fingerprint(
    filters = listOf(
        string("runningOnEmulator"),
    ),
)

// ── dev2: ShuMei anti-fraud SDK disable ──
private val shuMeiClassFingerprint = Fingerprint(
    filters = listOf(
        string("createSmAntiFraudInit"),
    ),
)

// ── dev2: Firebase Crashlytics disable ──
private val crashlyticsClassFingerprint = Fingerprint(
    filters = listOf(
        string("CRASHLYTICS_API_KEY"),
    ),
)

// ── dev2: Process enumeration bypass ──
private val processEnumClassFingerprint = Fingerprint(
    filters = listOf(
        methodCall(name = "getInstalledPackages"),
    ),
)

// ── Firebase Analytics disable ──
private val firebaseAnalyticsClassFingerprint = Fingerprint(
    filters = listOf(
        string("add_payment_info"),
    ),
)

// ── MoTracing (GlobalTracer) disable ──
private val globalTracerClassFingerprint = Fingerprint(
    filters = listOf(
        methodCall(name = "_getOrCreate"),
        methodCall(name = "_compressRecordFile"),
    ),
)

// ── MEStatistics (XEngine) disable ──
private val meStatisticsClassFingerprint = Fingerprint(
    filters = listOf(
        methodCall(name = "setMmcvVersion"),
        methodCall(name = "setMagicEffectVersion"),
    ),
)

// ── Device ID: UniqueIMEI ──
private val uniqueImeiClassFingerprint = Fingerprint(
    filters = listOf(
        string("UniqueIMEI"),
    ),
)

// ── Device ID: UniqueDeviceId ──
private val uniqueDeviceIdClassFingerprint = Fingerprint(
    filters = listOf(
        string("UniqueDeviceId"),
    ),
)

// ── Device ID: Google Advertising ID ──
private val advertisingIdClientClassFingerprint = Fingerprint(
    filters = listOf(
        string("com.google.android.gms.ads.identifier.service.START"),
    ),
)

// ── Network Metrics disable ──
private val networkMetricsClassFingerprint = Fingerprint(
    filters = listOf(
        methodCall(name = "getSubmitAlternative"),
    ),
)

// ── Push Notification Statistics disable ──
private val pushEventStatisticClassFingerprint = Fingerprint(
    filters = listOf(
        string("mmfile_push_statistic"),
    ),
)

// ── MediaLog/Battery Metrics disable ──
private val batteryMetricsClassFingerprint = Fingerprint(
    filters = listOf(
        string("BatteryMetrics"),
    ),
)

// ── MoLive APM disable ──
private val apmPluginClassFingerprint = Fingerprint(
    filters = listOf(
        string("live-PerfTracer"),
    ),
)

// ── DNS SLA Logging disable ──
private val dnsSlaLoggerClassFingerprint = Fingerprint(
    filters = listOf(
        string("DNS_SLA"),
    ),
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
        zvf0ClassFingerprint.matchOrNull()?.classDef?.let { zvf0ClassDef ->
            mutableClassDefBy(zvf0ClassDef).methods.forEach { method ->
                when {
                    method.name == "k" &&
                        method.parameterTypes.size == 2 &&
                        method.parameterTypes[0] == "Landroid/content/Context;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "i" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Landroid/content/Context;" &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name in setOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z") &&
                        method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        appsFlyerClassFingerprint.matchOrNull()?.classDef?.let { appsFlyerClassDef ->
            appsFlyerInitFingerprint.matchOrNull(appsFlyerClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_NULL_OBJECT)
            }
            appsFlyerStartFingerprint.matchOrNull(appsFlyerClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_VOID)
            }
        }

        cleverTapClassFingerprint.matchOrNull()?.classDef?.let { cleverTapClassDef ->
            cleverTapInstanceFingerprint.matchOrNull(cleverTapClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_NULL_OBJECT)
            }
            cleverTapInstanceWithIdFingerprint.matchOrNull(cleverTapClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_NULL_OBJECT)
            }
        }

        facebookAppEventsClassFingerprint.matchOrNull()?.classDef?.let { facebookClassDef ->
            facebookAppEventsInitFingerprint.matchOrNull(facebookClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_VOID)
            }
            facebookAppEventsInitWithIdFingerprint.matchOrNull(facebookClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_VOID)
            }
        }

        beatlesCrashMonitorClassFingerprint.matchOrNull()?.classDef?.let { beatlesClassDef ->
            mutableClassDefBy(beatlesClassDef).methods.forEach { method ->
                if (method.name in setOf("init", "install", "start") &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        oaidClassFingerprint.matchOrNull()?.classDef?.let { oaidClassDef ->
            oaidGetterFingerprint.matchOrNull(oaidClassDef)?.let { match ->
                match.method.addInstructions(0, RETURN_EMPTY_STRING)
            }
        }

        // ── dev2: Root detection bypass ──
        rootDetectionClassFingerprint.matchOrNull()?.classDef?.let { rootClassDef ->
            mutableClassDefBy(rootClassDef).methods.forEach { method ->
                if (method.returnType == "Z" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        // ── dev2: Emulator detection bypass ──
        emulatorDetectionClassFingerprint.matchOrNull()?.classDef?.let { emulatorClassDef ->
            mutableClassDefBy(emulatorClassDef).methods.forEach { method ->
                if (method.returnType == "Z" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        // ── dev2: ShuMei anti-fraud SDK disable ──
        shuMeiClassFingerprint.matchOrNull()?.classDef?.let { shuMeiClassDef ->
            mutableClassDefBy(shuMeiClassDef).methods.forEach { method ->
                if (method.name == "createSmAntiFraudInit" || 
                    (method.name.contains("init") && method.returnType == "V")) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ── dev2: Firebase Crashlytics disable ──
        crashlyticsClassFingerprint.matchOrNull()?.classDef?.let { crashlyticsClassDef ->
            mutableClassDefBy(crashlyticsClassDef).methods.forEach { method ->
                if (method.name == "getInstance" || method.name == "<init>") {
                    if (method.returnType.startsWith("L")) {
                        method.addInstructions(0, RETURN_NULL_OBJECT)
                    } else if (method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        // ── dev2: Process enumeration bypass ──
        processEnumClassFingerprint.matchOrNull()?.classDef?.let { processEnumClassDef ->
            mutableClassDefBy(processEnumClassDef).methods.forEach { method ->
                if (method.returnType == "Ljava/util/List;" || method.returnType == "Ljava/util/ArrayList;") {
                    method.addInstructions(0, """
                        new-instance v0, Ljava/util/ArrayList;
                        invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
                        return-object v0
                    """)
                }
            }
        }

        // ── Firebase Analytics disable ──
        firebaseAnalyticsClassFingerprint.matchOrNull()?.classDef?.let { firebaseClassDef ->
            mutableClassDefBy(firebaseClassDef).methods.forEach { method ->
                when {
                    method.name == "logEvent" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setAnalyticsCollectionEnabled" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setUserId" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setUserProperty" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "resetAnalyticsData" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setCurrentScreen" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setDefaultEventParameters" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setSessionTimeoutDuration" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setConsent" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        // ── MoTracing (GlobalTracer) disable ──
        globalTracerClassFingerprint.matchOrNull()?.classDef?.let { tracerClassDef ->
            mutableClassDefBy(tracerClassDef).methods.forEach { method ->
                when {
                    method.name == "m20323e" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "m20324f" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "m20321a" && method.returnType == "Z" -> {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }
        }

        // ── MEStatistics (XEngine) disable ──
        meStatisticsClassFingerprint.matchOrNull()?.classDef?.let { meStatsClassDef ->
            mutableClassDefBy(meStatsClassDef).methods.forEach { method ->
                when {
                    method.name == "init" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "flush" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "report" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "realTimeReport" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setMMCVVersion" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setMagicEffectVersion" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setRecorderSDKVersion" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setUID" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setXEngineVersion" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        // ── Device ID: UniqueIMEI ──
        uniqueImeiClassFingerprint.matchOrNull()?.classDef?.let { imeiClassDef ->
            mutableClassDefBy(imeiClassDef).methods.forEach { method ->
                if (method.name == "getUniqueId" && method.returnType == "Ljava/lang/String;") {
                    method.addInstructions(0, RETURN_EMPTY_STRING)
                }
            }
        }

        // ── Device ID: UniqueDeviceId ──
        uniqueDeviceIdClassFingerprint.matchOrNull()?.classDef?.let { deviceIdClassDef ->
            mutableClassDefBy(deviceIdClassDef).methods.forEach { method ->
                if (method.name == "getUniqueId" && method.returnType == "Ljava/lang/String;") {
                    method.addInstructions(0, RETURN_EMPTY_STRING)
                }
            }
        }

        // ── Device ID: Google Advertising ID ──
        advertisingIdClientClassFingerprint.matchOrNull()?.classDef?.let { adIdClassDef ->
            mutableClassDefBy(adIdClassDef).methods.forEach { method ->
                if (method.name == "getAdvertisingIdInfo" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Landroid/content/Context;" &&
                    method.returnType.startsWith("L")
                ) {
                    method.addInstructions(0, RETURN_NULL_OBJECT)
                }
            }
        }

        // ── Network Metrics disable ──
        networkMetricsClassFingerprint.matchOrNull()?.classDef?.let { netMetricsClassDef ->
            mutableClassDefBy(netMetricsClassDef).methods.forEach { method ->
                if (method.name == "m19256g" && method.returnType == "V" &&
                    method.parameterTypes.size == 2
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
                if (method.name == "m19259j" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ── Push Notification Statistics disable ──
        pushEventStatisticClassFingerprint.matchOrNull()?.classDef?.let { pushClassDef ->
            mutableClassDefBy(pushClassDef).methods.forEach { method ->
                when {
                    method.name == "init" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "logPushEventInfo" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "logRegCallback" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "forceUpload" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        // ── MediaLog/Battery Metrics disable ──
        batteryMetricsClassFingerprint.matchOrNull()?.classDef?.let { batteryClassDef ->
            mutableClassDefBy(batteryClassDef).methods.forEach { method ->
                if (method.name == "init" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ── MoLive APM disable ──
        apmPluginClassFingerprint.matchOrNull()?.classDef?.let { apmClassDef ->
            mutableClassDefBy(apmClassDef).methods.forEach { method ->
                when {
                    method.name == "m19461O" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "m19462P" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        // ── DNS SLA Logging disable ──
        dnsSlaLoggerClassFingerprint.matchOrNull()?.classDef?.let { dnsClassDef ->
            mutableClassDefBy(dnsClassDef).methods.forEach { method ->
                when {
                    method.name == "init" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "flush" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setEnable" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "log" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                    method.name == "setOnFlushListener" && method.returnType == "V" -> {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }
    }
}
