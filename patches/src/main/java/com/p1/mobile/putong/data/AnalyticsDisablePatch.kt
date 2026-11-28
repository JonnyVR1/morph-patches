package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.ClassDef
import com.android.tools.smali.dexlib2.iface.Method
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference



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

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_EMPTY_JSON = """
    new-instance v0, Lorg/json/JSONObject;
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    return-object v0
"""

private const val RETURN_UPLOAD_DISCARD = """
    sget-object v0, Lcom/tantanapp/beatles/v2/upload/UploadStatus;->DISCARD:Lcom/tantanapp/beatles/v2/upload/UploadStatus;
    return-object v0
"""

private fun isConstructor(method: Method): Boolean =
    method.name == "<init>" || method.name == "<clinit>"

private const val FOX_STATS_DEFAULT_ENV = "Lcom/tantanapp/foxstatistics/DefaultEnvironment;"

@Suppress("unused")
@JvmField
val analyticsDisablePatch = bytecodePatch(
    name = "Analytics Disable",
    description = "Disables all analytics and telemetry for privacy",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val resolver = getSharedResolver()

        // 7.5.6.1: AppsFlyerLib became abstract (init/start have no body); the concrete impl is
        // the stable internal AFb1tSDK. Target it; init still returns the AppsFlyerLib base type.
        classDefByOrNull("Lcom/appsflyer/internal/AFb1tSDK;")?.let { classDef ->
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

        // Facebook AppEventsLogger.activateApp (7.5.6.1 na0.b): outer class obfuscated; resolve
        // via the warning-string anchor. Drop the FINAL requirement (b is not final). FB login
        // init is untouched; only auto-event logging activation is voided.
        resolver.getAnalyticsClass("fbAppEvents")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                val isPublicStatic = AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                                     AccessFlags.STATIC.isSet(method.accessFlags)
                if (isPublicStatic && method.returnType == "V" &&
                    (method.parameterTypes == listOf("Landroid/app/Application;") ||
                        method.parameterTypes == listOf("Landroid/app/Application;", "Ljava/lang/String;"))) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

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

        listOf(
            "Lcom/cosmos/photon/push/uniqueid/UniqueAndroidId;",
            "Lcom/cosmos/photon/push/uniqueid/UniqueIMEI;",
            "Lcom/cosmos/photon/push/uniqueid/UniqueDeviceId;",
            "Lcom/cosmos/photon/push/uniqueid/UniqueSerialNumber;",
            "Lcom/cosmos/photon/push/uniqueid/UniqueMacAddress;"
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

        classDefByOrNull("Lcom/tencent/liteav/basic/datareport/TXCDRApi;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "V") method.addInstructions(0, RETURN_VOID)
            }
        }

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

        resolver.getAnalyticsClass("oaidHelper")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                // 7.5.6.1: init switched Context -> TantanApp (f8e.b(TantanApp)V). Accept any
                // single Context-assignable param (Context / Application / TantanApp).
                if (method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] in setOf(
                        "Landroid/content/Context;",
                        "Landroid/app/Application;",
                        "Lcom/p1/mobile/putong/app/TantanApp;") &&
                    method.returnType == "V" &&
                    AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Fox HTTP sender (7.5.6.1 mmm.b): the single upload choke point for BOTH report and
        // sc-report endpoints. Force true ("upload succeeded") so callers purge their queues and
        // never retry. Replaces the old per-endpoint f970.r/g2f0.o voids AND the lost ofh0.h()
        // enable gate on the old m3m0.b sender (the new sender has no enable check).
        resolver.getAnalyticsClass("foxSender")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "Z" &&
                    method.parameterTypes == listOf("Ljava/lang/String;", "Lcom/google/gson/JsonArray;", "I")) {
                    method.preflightSmali(RETURN_TRUE, 2)
                    method.addInstructions(0, RETURN_TRUE)
                }
            }
        }

        // Beatles install + upload facade (7.5.6.1 c41, re-anchored on "Please init Beatles!!!").
        // Void the xlog UPLOAD enqueue f(List,String,J,lmm)V (the old luw.m backend was inlined
        // into it) AND the push date-range upload entry a(J,String,String)V (sole caller is the
        // shared z31 push dispatcher — voiding c41.a starves the "xlog.upload" pull WITHOUT
        // touching z31.b, which multiplexes lovebuzz/feed/live/pay/member push handling).
        // Local xlog writing (v31.c) and the install itself stay intact.
        resolver.getAnalyticsClass("beatles")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                val isUploadFacade = AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "V" &&
                    method.parameterTypes.size == 4 &&
                    method.parameterTypes[1] == "Ljava/lang/String;" &&
                    method.parameterTypes[2] == "J" &&
                    (method.parameterTypes[0] == "Ljava/util/Date;" ||
                        method.parameterTypes[0] == "Ljava/util/List;")
                val isPushUploadEntry = AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "V" &&
                    method.parameterTypes == listOf("J", "Ljava/lang/String;", "Ljava/lang/String;")
                if (isUploadFacade || isPushUploadEntry) {
                    method.preflightSmali(RETURN_VOID, 1)
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Crash-collector upload transport (7.5.6.1 rmm): the giq event Runnable and ga2
        // attachment Runnable POST to seiya /events + /attachments DIRECTLY through
        // rmm.c(jii,String,ete)UploadStatus, bypassing the c41 facade (device-verified
        // "event upload success ... SUCCESS" at 01:42 with c41 already voided). Return DISCARD:
        // both callers treat it as terminal (no retry, no failure re-enqueue). Event objects
        // still reach the local disk cache — only the network egress is cut.
        resolver.getAnalyticsClass("beatlesUpload")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "Lcom/tantanapp/beatles/v2/upload/UploadStatus;" &&
                    method.parameterTypes.size == 3 &&
                    method.parameterTypes[1] == "Ljava/lang/String;") {
                    method.preflightSmali(RETURN_UPLOAD_DISCARD, 2)
                    method.addInstructions(0, RETURN_UPLOAD_DISCARD)
                }
            }
        }

        // Push click/delivery tracking (7.5.6.1 mb0): the endpoint now lives in a synthetic
        // tracking Runnable whose two cases are both analytics (AppOpenWayStats + client-monitor
        // upload). Void run()V; notification click/delivery HANDLING (PutongAct) is unaffected.
        resolver.getAnalyticsClass("pushTracker")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (method.name == "run" && method.returnType == "V" && method.parameterTypes.isEmpty()) {
                    method.preflightSmali(RETURN_VOID, 1)
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolver.getAnalyticsClass("firebaseAnalytics")?.let { classDef ->
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

        classDefByOrNull("Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                // 7.5.6.1: the Info return type was obfuscated (AdvertisingIdClient$a -> Ll/st;).
                // Derive the Info descriptor + (String,Z)V ctor from the method's actual return
                // type instead of hardcoding a name (gotcha #17). Empty id + limitAdTracking=true.
                if (method.name == "getAdvertisingIdInfo" &&
                    AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.parameterTypes == listOf("Landroid/content/Context;") &&
                    method.returnType.startsWith("L")) {
                    val infoType = method.returnType
                    val infoClass = classDefByOrNull(infoType) ?: return@forEach
                    val hasCtor = infoClass.methods.any {
                        it.name == "<init>" && it.parameterTypes == listOf("Ljava/lang/String;", "Z")
                    }
                    if (!hasCtor) return@forEach
                    val rc = method.implementation?.registerCount ?: 0
                    if (rc < 3) return@forEach
                    val smali = """
                        new-instance v0, $infoType
                        const-string v1, ""
                        const/4 v2, 0x1
                        invoke-direct {v0, v1, v2}, $infoType-><init>(Ljava/lang/String;Z)V
                        return-object v0
                    """.trimIndent()
                    method.preflightSmali(smali, 5)
                    method.addInstructions(0, smali)
                }
            }
        }

        resolver.getAnalyticsClass("pushStats")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name in setOf("init", "logPushEventInfo", "logRegCallback", "forceUpload") &&
                    method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolver.getAnalyticsClass("batteryMetrics")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name == "init" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolver.getAnalyticsClass("moLiveApm")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name in setOf("init", "start", "enable", "trace", "record", "report", "flush", "stop") &&
                    method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolver.getAnalyticsClass("dnsSla")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name in setOf("init", "flush", "setEnable", "log", "setOnFlushListener") &&
                    method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolver.getAnalyticsClass("moTracing")?.let { classDef ->
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

        resolver.getAnalyticsClass("moLiveApm2")?.let { classDef ->
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

        resolver.getAnalyticsClass("coreEventLogger")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                // Exempt the init method(s): 7.5.6.1 init is c(TantanApp,String)V (was Context-first
                // i/j/k). Voiding init leaves the facade Context field null, which non-Fox readers
                // (image loading idd, statistics_store s64) dereference WITHOUT null checks -> NPE.
                val isInit = method.parameterTypes.isNotEmpty() && method.parameterTypes[0] in setOf(
                    "Landroid/content/Context;",
                    "Landroid/app/Application;",
                    "Lcom/p1/mobile/putong/app/TantanApp;")
                if (AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "V" && !isInit) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolver.getAnalyticsClass("fbAutoEvents")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "V" &&
                    method.parameterTypes.size == 2 &&
                    method.parameterTypes[0] == "Landroid/app/Application;" &&
                    method.parameterTypes[1] == "Ljava/lang/String;") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolver.getAnalyticsClass("ga4Collection")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                // 7.5.6.1: the deactivated-metadata gate is dyq.g()I (returns 1 = collection off),
                // not the old iiu0.Q()Z. Force the no-arg ()I carrier of the string to 1.
                if (method.returnType == "I" && method.parameterTypes.isEmpty() &&
                    method.sharedCachedInstructions().any { instr ->
                        instr is ReferenceInstruction &&
                            (instr.reference as? StringReference)?.string == "firebase_analytics_collection_deactivated"
                    }) {
                    method.preflightSmali(RETURN_TRUE, 2)
                    method.addInstructions(0, RETURN_TRUE)
                }
            }
        }

        resolver.getAnalyticsClass("oneIdUploader")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "V" &&
                    method.parameterTypes.size == 2 &&
                    method.parameterTypes[0] == "J") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        resolver.getAnalyticsClass("oneIdStorage")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "V" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Landroid/content/Context;") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/momo/xengine/mestatistics/MEStatisticsImpl;")?.let { classDef ->
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

        classDefByOrNull("Lcom/p1/mobile/putong/app/statistics/AppOpenWayStats;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/tantanapp/beatles/fpsmonitor/FpsMonitor;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (!AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/tantanapp/beatles/anrmonitor/a;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name == "run" && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/tantan/library/svga/tracker/CacheTrackerManager;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/bytedance/realx/base/RXPerformanceMonitorAndroid;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name == "getCurrentPidMemorySize" && method.returnType == "I" ->
                        method.addInstructions(0, RETURN_FALSE)

                    method.name == "getJavaAppMemoryUsage" && method.returnType == "I" ->
                        method.addInstructions(0, RETURN_FALSE)

                    method.name == "getIfRoomsDevice" && method.returnType == "Z" ->
                        method.addInstructions(0, RETURN_FALSE)

                    method.name in setOf("getMemoryState", "getThermalState", "getThreadCount") &&
                    method.returnType == "I" ->
                        method.addInstructions(0, RETURN_FALSE)

                    method.name == "setThermalState" && method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/google/firebase/crashlytics/FirebaseCrashlytics;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name == "init" && AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType.startsWith("L") ->
                        method.addInstructions(0, RETURN_NULL_OBJECT)

                    method.name == "getInstance" && AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType.startsWith("L") ->
                        method.addInstructions(0, RETURN_NULL_OBJECT)

                    method.name in setOf("recordException", "log", "sendUnsentReports", "deleteUnsentReports",
                        "setCrashlyticsCollectionEnabled", "setCustomKey", "setCustomKeys", "setUserId") &&
                    method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)

                    method.name == "isCrashlyticsCollectionEnabled" && method.returnType == "Z" ->
                        method.addInstructions(0, RETURN_FALSE)

                    method.name == "didCrashOnPreviousExecution" && method.returnType == "Z" ->
                        method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        classDefByOrNull("Lcom/google/firebase/crashlytics/internal/common/CrashlyticsCore;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name == "onPreExecute" && method.returnType == "Z" ->
                        method.addInstructions(0, RETURN_FALSE)

                    method.name in setOf("log", "logException") && method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)

                    method.name == "isCrashlyticsCollectionEnabled" && method.returnType == "Z" ->
                        method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        classDefByOrNull("Lcom/apm/lite/nativecrash/NativeImpl;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name == "p" && method.returnType == "Z" && method.parameterTypes.isEmpty() ->
                        method.addInstructions(0, RETURN_FALSE)

                    method.name == "w" && method.returnType == "Z" ->
                        method.addInstructions(0, RETURN_FALSE)

                    method.name == "k" && method.returnType == "Z" && method.parameterTypes.isEmpty() ->
                        method.addInstructions(0, RETURN_FALSE)

                    method.name == "n" && method.returnType == "Z" && method.parameterTypes.isEmpty() ->
                        method.addInstructions(0, RETURN_FALSE)

                    method.returnType == "V" && AccessFlags.STATIC.isSet(method.accessFlags) ->
                        method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/hellogroup/mk/core/log/MKCoreLogManager;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name == "j" && method.returnType == "V" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Lcom/hellogroup/mk/core/log/core/MKLogReporter;" ->
                        method.addInstructions(0, RETURN_VOID)

                    method.name == "d" && AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)

                    method.name == "k" && method.returnType == "Z" ->
                        method.addInstructions(0, RETURN_FALSE)

                    method.name in setOf("c", "g", "h") && method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/hellogroup/mk/core/log/core/MKLogReporter;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when (method.returnType) {
                    "V" -> method.addInstructions(0, RETURN_VOID)
                    "Z" -> method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        classDefByOrNull("Lcom/google/firebase/abt/FirebaseABTesting;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name in setOf("replaceAllExperiments", "removeAllExperiments",
                        "reportActiveExperiment", "validateRunningExperiments") &&
                    method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)

                    method.name == "getAllExperiments" && method.returnType.startsWith("L") ->
                        method.addInstructions(0, RETURN_NULL_OBJECT)
                }
            }
        }

        classDefByOrNull("Lcom/google/firebase/messaging/MessagingAnalytics;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name in setOf("logNotificationDismiss", "logNotificationForeground",
                        "logNotificationOpen", "logNotificationReceived", "logToScion",
                        "logToFirelog", "setDeliveryMetricsExportToBigQuery", "setUserPropertyIfRequired") &&
                    method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)

                    method.name == "deliveryMetricsExportToBigQueryEnabled" && method.returnType == "Z" ->
                        method.addInstructions(0, RETURN_FALSE)

                    method.name in setOf("shouldUploadFirelogAnalytics", "shouldUploadScionMetrics") &&
                    method.returnType == "Z" ->
                        method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        classDefByOrNull("Lcom/cosmos/photon/push/thirdparty/ThirdPartyEventReporter;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when (method.returnType) {
                    "V" -> method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/immomo/android/network/metrics/NetworkMetricsStatistics;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name in setOf("g", "j", "b", "h", "i") && method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/tantanapp/common/network/NetReporter;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when (method.returnType) {
                    "V" -> method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name == "register" && method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)

                    method.name == "addDependency" && method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Firebase Sessions telemetry: getSessionsEnabled() false disables session collection.
        // Stable SDK descriptor. Manifest backstop firebase_sessions_enabled=false is added in
        // GmsCompatibility/PatcherMain; this DEX gate is the locally-verifiable path. FCM and
        // Crashlytics are independent — no functional dependency. The subscription-registry
        // void (FirebaseSessionsDependencies above) is a separate concern and stays.
        classDefByOrNull("Lcom/google/firebase/sessions/settings/SessionsSettings;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (method.name == "getSessionsEnabled" && method.returnType == "Z" &&
                    method.parameterTypes.isEmpty()) {
                    method.preflightSmali(RETURN_FALSE, 2)
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        // Facebook app-settings fetch (7.5.6.1 ru6.a()JSONObject, static no-arg): builds
        // GraphRequest "app" and executes it. Return an EMPTY JSONObject (NOT null — consumers
        // dereference the result; null NPEs FB login). Empty settings fall back to SDK defaults;
        // FB login init (FacebookInitProvider) is untouched.
        resolver.getAnalyticsClass("fbAppSettings")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "Lorg/json/JSONObject;" &&
                    method.parameterTypes.isEmpty()) {
                    method.preflightSmali(RETURN_EMPTY_JSON, 3)
                    method.addInstructions(0, RETURN_EMPTY_JSON)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/app/surveysparrow/SurveySparrowHelper;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name in setOf("i", "n", "r", "l", "o") && method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)

                    method.name == "j" && method.returnType.startsWith("L") ->
                        method.addInstructions(0, RETURN_NULL_OBJECT)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/home/HomeStatisticsHelper;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/ui/jsbridge/implement/TrackBridgeImplementation;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                method.addInstructions(0, RETURN_VOID)
            }
        }

        val omsAdTrackingFingerprint = Fingerprint(
            filters = listOf(string("e_oms_show_event_report")),
        )
        omsAdTrackingFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/putong/util/TrackMediaUploadUtil;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        classDefByOrNull("Lcom/tantanapp/beatles/BeatlesProvider;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name == "query" && method.returnType.startsWith("L") ->
                        method.addInstructions(0, RETURN_NULL_OBJECT)

                    method.name == "onCreate" && method.returnType == "Z" ->
                        method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        classDefByOrNull("Lcom/p1/mobile/backtrace/backtrace/WarmUpService;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name == "onCreate" && method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)

                    method.name == "onBind" && method.returnType.startsWith("L") ->
                        method.addInstructions(0, RETURN_NULL_OBJECT)
                }
            }
        }

        classDefByOrNull("Lcom/core/glcore/util/ErrorDotStatistics;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name == "addErrInfo" && method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)

                    method.name == "getInstance" && method.returnType.startsWith("L") ->
                        method.addInstructions(0, RETURN_NULL_OBJECT)
                }
            }
        }

        // Patchset 2: WiFi MAC block
        classDefByOrNull("Lcom/p1/mobile/putong/core/newui/main/NewMainBaseAct;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.name == "x3" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                    AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "Ljava/lang/String;" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Landroid/content/Context;") {
                    method.addInstructions(0, RETURN_EMPTY_STRING)
                }
            }
        }

        // Patchset 2: APM monitoring disable
        val apmInitFingerprint = Fingerprint(
            filters = listOf(string("beatles_apm_config")),
        )
        apmInitFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "V" &&
                    method.parameterTypes.isEmpty() &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                    AccessFlags.STATIC.isSet(method.accessFlags)) {
                    val accessesApmConfig = method.implementation!!.instructions.any { instr ->
                        instr is ReferenceInstruction &&
                        instr.reference is FieldReference &&
                        (instr.reference as FieldReference).type == "Lcom/p1/mobile/putong/data/ApmConfigSetting;"
                    }
                    if (accessesApmConfig) {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        // Patchset 2: Firebase Analytics events disable
        classDefByOrNull("Lcom/google/firebase/analytics/FirebaseAnalytics;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                when {
                    method.name in setOf("logEvent", "setAnalyticsCollectionEnabled", "setUserId",
                        "setUserProperty", "resetAnalyticsData", "setCurrentScreen",
                        "setDefaultEventParameters", "setSessionTimeoutDuration", "setConsent") &&
                    method.returnType == "V" ->
                        method.addInstructions(0, RETURN_VOID)
                }
            }
        }
    }
}
