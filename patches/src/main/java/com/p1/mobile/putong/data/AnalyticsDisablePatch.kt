package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.ClassDef
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction21c
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.StringReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

private fun ClassDef.analyticsContainsString(str: String): Boolean {
    return methods.any { method ->
        method.implementation?.instructions?.any { instruction ->
            (instruction as? Instruction21c)?.reference is StringReference &&
            ((instruction as Instruction21c).reference as StringReference).string == str
        } ?: false
    }
}

private fun ClassDef.analyticsCallsMethod(name: String): Boolean {
    return methods.any { method ->
        method.implementation?.instructions?.any { instruction ->
            instruction.opcode.name.startsWith("INVOKE") &&
            (instruction as? ReferenceInstruction)?.reference is MethodReference &&
            ((instruction as ReferenceInstruction).reference as MethodReference).name == name
        } ?: false
    }
}

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
        classDefForEach { classDef ->
            val hasMethods = classDef.methods.any { it.implementation != null }
            if (!hasMethods) return@classDefForEach

            // FoxStatistics (zvf0) - contains "e_request_none_oaid"
            if (classDef.analyticsContainsString("e_request_none_oaid")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
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
                return@classDefForEach
            }

            // AppsFlyer - contains "dmfeSDkpVxP8m6Ys6yJCpn"
            if (classDef.analyticsContainsString("dmfeSDkpVxP8m6Ys6yJCpn")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
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
                return@classDefForEach
            }

            // CleverTap - contains "CleverTap SDK initialized with accountId"
            if (classDef.analyticsContainsString("CleverTap SDK initialized with accountId")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
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
                return@classDefForEach
            }

            // Facebook AppEvents - contains "facebook-core_release"
            if (classDef.analyticsContainsString("facebook-core_release")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
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
                return@classDefForEach
            }

            // Beatles Crash Monitor - contains "com.tantanapp.beatles"
            if (classDef.analyticsContainsString("com.tantanapp.beatles")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name in setOf("init", "install", "start") && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // OAID - contains "miit_oaid"
            if (classDef.analyticsContainsString("miit_oaid")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                        AccessFlags.STATIC.isSet(method.accessFlags) &&
                        method.returnType == "Ljava/lang/String;" &&
                        method.parameterTypes.isEmpty()) {
                        method.addInstructions(0, RETURN_EMPTY_STRING)
                    }
                }
                return@classDefForEach
            }

            // Root detection - contains "/system/usr/we-need-root/su"
            if (classDef.analyticsContainsString("/system/usr/we-need-root/su")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.returnType == "Z" && method.parameterTypes.isEmpty()) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
                return@classDefForEach
            }

            // Emulator detection - contains "runningOnEmulator"
            if (classDef.analyticsContainsString("runningOnEmulator")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.returnType == "Z" && method.parameterTypes.isEmpty()) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
                return@classDefForEach
            }

            // ShuMei anti-fraud - contains "createSmAntiFraudInit"
            if (classDef.analyticsContainsString("createSmAntiFraudInit")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "createSmAntiFraudInit" || 
                        (method.name.contains("init") && method.returnType == "V")) {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // Firebase Crashlytics - contains "CRASHLYTICS_API_KEY"
            if (classDef.analyticsContainsString("CRASHLYTICS_API_KEY")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "getInstance" || method.name == "<init>") {
                        if (method.returnType.startsWith("L")) {
                            method.addInstructions(0, RETURN_NULL_OBJECT)
                        } else if (method.returnType == "V") {
                            method.addInstructions(0, RETURN_VOID)
                        }
                    }
                }
                return@classDefForEach
            }

            // Process enumeration - calls "getInstalledPackages"
            if (classDef.analyticsCallsMethod("getInstalledPackages")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.returnType == "Ljava/util/List;" || method.returnType == "Ljava/util/ArrayList;") {
                        method.addInstructions(0, """
                            new-instance v0, Ljava/util/ArrayList;
                            invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
                            return-object v0
                        """)
                    }
                }
                return@classDefForEach
            }

            // Firebase Analytics - contains "add_payment_info"
            if (classDef.analyticsContainsString("add_payment_info")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name in setOf("logEvent", "setAnalyticsCollectionEnabled", "setUserId", 
                                            "setUserProperty", "resetAnalyticsData", "setCurrentScreen",
                                            "setDefaultEventParameters", "setSessionTimeoutDuration", "setConsent") &&
                        method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // MoTracing (GlobalTracer) - calls "_getOrCreate" and "_compressRecordFile"
            if (classDef.analyticsCallsMethod("_getOrCreate") && classDef.analyticsCallsMethod("_compressRecordFile")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    when {
                        method.returnType == "V" -> method.addInstructions(0, RETURN_VOID)
                        method.returnType == "Z" && method.parameterTypes.isEmpty() -> 
                            method.addInstructions(0, RETURN_FALSE)
                    }
                }
                return@classDefForEach
            }

            // MEStatistics (XEngine) - calls "setMmcvVersion" and "setMagicEffectVersion"
            if (classDef.analyticsCallsMethod("setMmcvVersion") && classDef.analyticsCallsMethod("setMagicEffectVersion")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name in setOf("init", "flush", "report", "realTimeReport", 
                                            "setMMCVVersion", "setMagicEffectVersion", 
                                            "setRecorderSDKVersion", "setUID", "setXEngineVersion") &&
                        method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // Device ID: UniqueIMEI - contains "UniqueIMEI"
            if (classDef.analyticsContainsString("UniqueIMEI")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "getUniqueId" && method.returnType == "Ljava/lang/String;") {
                        method.addInstructions(0, RETURN_EMPTY_STRING)
                    }
                }
                return@classDefForEach
            }

            // Device ID: UniqueDeviceId - contains "UniqueDeviceId"
            if (classDef.analyticsContainsString("UniqueDeviceId")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "getUniqueId" && method.returnType == "Ljava/lang/String;") {
                        method.addInstructions(0, RETURN_EMPTY_STRING)
                    }
                }
                return@classDefForEach
            }

            // Device ID: Google Advertising ID - contains "com.google.android.gms.ads.identifier.service.START"
            if (classDef.analyticsContainsString("com.google.android.gms.ads.identifier.service.START")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "getAdvertisingIdInfo" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Landroid/content/Context;" &&
                        method.returnType.startsWith("L")) {
                        method.addInstructions(0, RETURN_NULL_OBJECT)
                    }
                }
                return@classDefForEach
            }

            // Network Metrics - calls "getSubmitAlternative"
            if (classDef.analyticsCallsMethod("getSubmitAlternative")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // Push Notification Statistics - contains "mmfile_push_statistic"
            if (classDef.analyticsContainsString("mmfile_push_statistic")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name in setOf("init", "logPushEventInfo", "logRegCallback", "forceUpload") &&
                        method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // MediaLog/Battery Metrics - contains "BatteryMetrics"
            if (classDef.analyticsContainsString("BatteryMetrics")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "init" && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // MoLive APM - contains "live-PerfTracer"
            if (classDef.analyticsContainsString("live-PerfTracer")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // DNS SLA Logging - contains "DNS_SLA"
            if (classDef.analyticsContainsString("DNS_SLA")) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name in setOf("init", "flush", "setEnable", "log", "setOnFlushListener") &&
                        method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }
        }
    }
}
