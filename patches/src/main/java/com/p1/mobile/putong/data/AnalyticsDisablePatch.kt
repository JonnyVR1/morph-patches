package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction21c
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.StringReference
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

            val strings = mutableSetOf<String>()
            val methodNames = mutableSetOf<String>()

            classDef.methods.forEach { method ->
                method.implementation?.instructions?.forEach { instruction ->
                    if (instruction is Instruction21c && instruction.reference is StringReference) {
                        strings.add((instruction.reference as StringReference).string)
                    }
                    if (instruction is ReferenceInstruction && instruction.reference is MethodReference) {
                        methodNames.add((instruction.reference as MethodReference).name)
                    }
                }
            }

            if (strings.isEmpty() && methodNames.isEmpty()) return@classDefForEach

            // FoxStatistics (zvf0)
            if ("e_request_none_oaid" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
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

            // AppsFlyer
            if ("dmfeSDkpVxP8m6Ys6yJCpn" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
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

            // CleverTap
            if ("CleverTap SDK initialized with accountId" in strings) {
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
                return@classDefForEach
            }

            // Facebook AppEvents
            if ("facebook-core_release" in strings) {
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
                return@classDefForEach
            }

            // Beatles Crash Monitor
            if ("com.tantanapp.beatles" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (method.name in setOf("init", "install", "start") && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // OAID
            if ("miit_oaid" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                        AccessFlags.STATIC.isSet(method.accessFlags) &&
                        method.returnType == "Ljava/lang/String;" &&
                        method.parameterTypes.isEmpty()) {
                        method.addInstructions(0, RETURN_EMPTY_STRING)
                    }
                }
                return@classDefForEach
            }

            // Root detection
            if ("/system/usr/we-need-root/su" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (method.returnType == "Z" && method.parameterTypes.isEmpty()) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
                return@classDefForEach
            }

            // Emulator detection - EXCLUDED: "runningOnEmulator" matches WebRTC audio infrastructure
            // classes (Agora, ByteRTC, MoMo RTC) which are critical for voice/video calls, not analytics

            // ShuMei anti-fraud
            if ("createSmAntiFraudInit" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (method.name == "createSmAntiFraudInit" || 
                        (method.name.contains("init") && method.returnType == "V")) {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // Firebase Crashlytics
            if ("CRASHLYTICS_API_KEY" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
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

            // Process enumeration
            if ("getInstalledPackages" in methodNames) {
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
                return@classDefForEach
            }

            // Firebase Analytics
            if ("add_payment_info" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (method.name in setOf("logEvent", "setAnalyticsCollectionEnabled", "setUserId", 
                                            "setUserProperty", "resetAnalyticsData", "setCurrentScreen",
                                            "setDefaultEventParameters", "setSessionTimeoutDuration", "setConsent") &&
                        method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // MoTracing (GlobalTracer)
            if ("_getOrCreate" in methodNames && "_compressRecordFile" in methodNames) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    when {
                        method.returnType == "V" -> method.addInstructions(0, RETURN_VOID)
                        method.returnType == "Z" && method.parameterTypes.isEmpty() -> 
                            method.addInstructions(0, RETURN_FALSE)
                    }
                }
                return@classDefForEach
            }

            // MEStatistics (XEngine)
            if ("setMmcvVersion" in methodNames && "setMagicEffectVersion" in methodNames) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (method.name in setOf("init", "flush", "report", "realTimeReport", 
                                            "setMMCVVersion", "setMagicEffectVersion", 
                                            "setRecorderSDKVersion", "setUID", "setXEngineVersion") &&
                        method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // Device ID: UniqueIMEI
            if ("UniqueIMEI" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (method.name == "getUniqueId" && method.returnType == "Ljava/lang/String;") {
                        method.addInstructions(0, RETURN_EMPTY_STRING)
                    }
                }
                return@classDefForEach
            }

            // Device ID: UniqueDeviceId
            if ("UniqueDeviceId" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (method.name == "getUniqueId" && method.returnType == "Ljava/lang/String;") {
                        method.addInstructions(0, RETURN_EMPTY_STRING)
                    }
                }
                return@classDefForEach
            }

            // Device ID: Google Advertising ID
            if ("com.google.android.gms.ads.identifier.service.START" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (method.name == "getAdvertisingIdInfo" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Landroid/content/Context;" &&
                        method.returnType.startsWith("L")) {
                        method.addInstructions(0, RETURN_NULL_OBJECT)
                    }
                }
                return@classDefForEach
            }

            // Network Metrics
            if ("getSubmitAlternative" in methodNames) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // Push Notification Statistics
            if ("mmfile_push_statistic" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (method.name in setOf("init", "logPushEventInfo", "logRegCallback", "forceUpload") &&
                        method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // MediaLog/Battery Metrics
            if ("BatteryMetrics" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (method.name == "init" && method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // MoLive APM
            if ("live-PerfTracer" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (method.returnType == "V") {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
                return@classDefForEach
            }

            // DNS SLA Logging
            if ("DNS_SLA" in strings) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
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
