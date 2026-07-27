package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
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
    }
}
