package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags

private const val RETURN_VOID = "return-void"

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

@Suppress("unused")
@JvmField
val dialogCleanupPatch = bytecodePatch(
    name = "Dialog Cleanup",
    description = "Removes annoying promotional dialogs: 5-star rating, appstore rating, version upgrade, offline popup, notification permission",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type == "Lcom/p1/mobile/putong/core/ui/gp/a;") {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "o" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        method.returnType == "V"
                    ) {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        mx0ClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "H" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    method.returnType == "V" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                    AccessFlags.FINAL.isSet(method.accessFlags)
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        zrj0ClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "c" &&
                    method.parameterTypes.size == 3 &&
                    method.parameterTypes[0] == "Z" &&
                    method.parameterTypes[1] == "Lcom/p1/mobile/android/app/Act;" &&
                    method.parameterTypes[2] == "Lcom/p1/mobile/putong/data/UpdateApiResult;" &&
                    method.returnType == "V" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                    AccessFlags.STATIC.isSet(method.accessFlags)
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        ok3ClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if ((method.name == "J" &&
                    method.parameterTypes.size == 3 &&
                    method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                    method.returnType == "V" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                    AccessFlags.STATIC.isSet(method.accessFlags)) ||
                    (method.name == "L" &&
                        method.parameterTypes.size == 2 &&
                        method.parameterTypes[0] == "Lcom/p1/mobile/android/app/Act;" &&
                        method.parameterTypes[1] == "I" &&
                        method.returnType == "V" &&
                        AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                        AccessFlags.STATIC.isSet(method.accessFlags))
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        u750ClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if ((method.name == "b" &&
                    method.parameterTypes.size == 1 &&
                    method.returnType == "Z" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags)) ||
                    (method.name == "d" &&
                        method.parameterTypes.size == 1 &&
                        method.returnType == "Z" &&
                        AccessFlags.PUBLIC.isSet(method.accessFlags))
                ) {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        ygh0ClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.name == "N" &&
                    method.parameterTypes.isEmpty() &&
                    method.returnType == "V" &&
                    AccessFlags.PUBLIC.isSet(method.accessFlags) &&
                    AccessFlags.STATIC.isSet(method.accessFlags)
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }
    }
}

private val mx0ClassFingerprint = Fingerprint(
    filters = listOf(
        string("p_appstore_rating_filter_popup"),
        string("showRankGuideDlg"),
    ),
)

private val zrj0ClassFingerprint = Fingerprint(
    filters = listOf(
        string("p_alert_version_upgrade_popup"),
        string("updateDlg"),
    ),
)

private val ok3ClassFingerprint = Fingerprint(
    filters = listOf(
        string("p_offline_popup"),
        string("LikersDialogView"),
    ),
)

private val u750ClassFingerprint = Fingerprint(
    filters = listOf(
        string("p_offline_popup"),
        methodCall(name = "h0"),
    ),
)

private val ygh0ClassFingerprint = Fingerprint(
    filters = listOf(
        string("p_prompt_notification_auth_popup_view"),
        string("no_permission_notice"),
    ),
)
