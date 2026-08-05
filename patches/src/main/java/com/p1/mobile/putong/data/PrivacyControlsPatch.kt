package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private const val RETURN_VOID = "return-void"

private const val RETURN_LONG_0 = """
    const-wide/16 v0, 0x0
    return-wide v0
"""

// ── Class fingerprints anchored on stable privilege-name strings ──

// vo50: OnlineZone view — references nearby_people + "p_home_nearby,online"
private val nearbyPeopleOnlineClassFingerprint = Fingerprint(
    filters = listOf(
        string("nearby_people"),
        string("p_home_nearby,online"),
    ),
)

// k7y: NearbyPresenter — references nearby_people + "p_meet_nearby,default"
private val nearbyPeopleMeetClassFingerprint = Fingerprint(
    filters = listOf(
        string("nearby_people"),
        string("p_meet_nearby,default"),
    ),
)

// l920: NearbyPresenter view — references nearby_people + D9/bg gate pattern
private val nearbyPeoplePresenterClassFingerprint = Fingerprint(
    filters = listOf(
        string("nearby_people"),
        string("p_suggest_nearby"),
    ),
)

// c220/h120: visitor footprint purchase dialog triggers
private val visitorFootprintGateClassFingerprint = Fingerprint(
    filters = listOf(
        string("visitor_hide_footprint"),
        string("p_navigation_visit,isee"),
    ),
)

// swh0: Read receipt purchase dialog — references p_purchase_read_receipt_confirm_popup
private val readReceiptPurchaseDialogClassFingerprint = Fingerprint(
    filters = listOf(
        string("p_purchase_read_receipt_confirm_popup"),
        string("read_receipt"),
    ),
)

private const val BLIVE_COMMON_CONFIG_CLASS = "Lcom/p1/mobile/putong/live/base/data/BLiveCommonConfig;"
private const val PERMISSION_HELPER_CLASS = "Lcom/p1/mobile/putong/ui/permission/PermissionHelper;"

private val privacyMembershipHideLocationClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/PrivacyMembershipSetting;",
            name = "hideLocation",
        ),
        string("hideLocation"),
    ),
)

private val svipPrivacyHideLocationClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/SvipPrivacySettings;",
            name = "hideLocation",
        ),
        string("hideLocation"),
    ),
)

private val userPrivacySettingsClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/UserPrivacySettings;",
            name = "hideContacts",
        ),
        string("hideContacts"),
    ),
)

private val settingsMomentClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/SettingsMoment;",
            name = "hidePublicMoments",
        ),
        string("hidePublicMoments"),
    ),
)

private data class MethodAnalysis(
    val strings: Set<String>,
    val methodNames: Set<String>,
    val fieldAccesses: Set<Pair<String, String>>,
)

private fun com.android.tools.smali.dexlib2.iface.Method.analyze(): MethodAnalysis {
    val strings = mutableSetOf<String>()
    val methodNames = mutableSetOf<String>()
    val fieldAccesses = mutableSetOf<Pair<String, String>>()

    this.implementation?.instructions?.forEach { instr ->
        if (instr is ReferenceInstruction) {
            when (val ref = instr.reference) {
                is StringReference -> strings.add(ref.string)
                is MethodReference -> methodNames.add(ref.name)
                is FieldReference -> fieldAccesses.add(ref.definingClass to ref.name)
            }
        }
    }

    return MethodAnalysis(strings, methodNames, fieldAccesses)
}

private fun MethodAnalysis.containsString(str: String): Boolean = str in strings
private fun MethodAnalysis.callsMethodNamed(name: String): Boolean = name in methodNames
private fun MethodAnalysis.accessesField(definingClass: String, fieldName: String): Boolean =
    (definingClass to fieldName) in fieldAccesses

@Suppress("unused")
@JvmField
val privacyControlsPatch = bytecodePatch(
    name = "Privacy Controls",
    description = "Unlocks privacy features: hide from nearby, visitor footprint hiding, mysterious mode, nearby people access, read receipt unlock, read receipt dialog suppression, contact access block, location privacy, privacy settings force enable, hide activity time, hide age, hide icon, frozen activity, frozen time, hide distance, core service privacy gate, hide active from SVip, disable ad suggestions, live stealth privacy, online status visibility",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val stableClassTargets = setOf(
            "Lcom/p1/mobile/putong/core/ui/settings/filter/newui/HiddenNearByView;",
            "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;",
            "Lcom/p1/mobile/putong/core/ui/vip/privilege/dlg/PrivilegeContentDlgItemView;",
            "Lcom/p046p1/mobile/putong/core/p053ui/messages/view/IntlMessageReadReceiptsView;",
            BLIVE_COMMON_CONFIG_CLASS,
            PERMISSION_HELPER_CLASS,
            "Lcom/p1/mobile/putong/data/Location;",
            "Lcom/p1/mobile/putong/core/api/CoreServiceImpl;",
            "Lcom/p1/mobile/putong/data/User;",
            "Lcom/p1/mobile/putong/live/base/data/BLiveStealthPrivilege;",
            "Lcom/p1/mobile/putong/core/data/ShowOnlineForWhoIMeet;",
        )
        var stableFound = 0

        classDefForEach { classDef ->
            if (classDef.type !in stableClassTargets) return@classDefForEach
            val mutableClass = mutableClassDefBy(classDef)

            when (classDef.type) {
                "Lcom/p1/mobile/putong/core/ui/settings/filter/newui/HiddenNearByView;" -> {
                    mutableClass.methods.forEach { method ->
                        if (method.name == "s" && method.parameterTypes.isEmpty() && method.returnType == "V") {
                            method.addInstructions(0, RETURN_VOID)
                        }
                    }
                    stableFound++
                }

                "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;" -> {
                    mutableClass.methods.forEach { method ->
                        val analysis = method.analyze()
                        if (analysis.containsString("p_navigation_visit,isee") &&
                            analysis.containsString("visitor_hide_footprint") &&
                            method.returnType == "V"
                        ) {
                            method.addInstructions(0, RETURN_VOID)
                        }
                    }
                    stableFound++
                }

                "Lcom/p1/mobile/putong/core/ui/vip/privilege/dlg/PrivilegeContentDlgItemView;" -> {
                    mutableClass.methods.forEach { method ->
                        val analysis = method.analyze()
                        val targetsPrivacyPrivilege = analysis.containsString("mysterious_mode") ||
                            analysis.containsString("visitor_hide_footprint") ||
                            analysis.containsString("nearby_people") ||
                            analysis.containsString("hide_me_from_nearby")
                        if (targetsPrivacyPrivilege && analysis.callsMethodNamed("Hm") && method.returnType == "V") {
                            method.addInstructions(0, RETURN_VOID)
                        }
                    }
                    stableFound++
                }

                "Lcom/p046p1/mobile/putong/core/p053ui/messages/view/IntlMessageReadReceiptsView;" -> {
                    mutableClass.methods.forEach { method ->
                        val analysis = method.analyze()
                        if (analysis.containsString("bubble_key_intl_read_receipts") && method.returnType == "V") {
                            method.addInstructions(0, RETURN_VOID)
                        }
                    }
                    stableFound++
                }

                BLIVE_COMMON_CONFIG_CLASS -> {
                    mutableClass.methods.forEach { method ->
                        if (method.name == "nullCheck" && method.parameterTypes.isEmpty() && method.returnType == "V") {
                            method.addInstructions(0, """
                                const/4 v0, 0x1
                                iput-boolean v0, p0, Lcom/p1/mobile/putong/live/base/data/BLiveCommonConfig;->on:Z
                            """)
                        }
                    }
                    stableFound++
                }

                PERMISSION_HELPER_CLASS -> {
                    mutableClass.methods.forEach { method ->
                        if (method.name == "b" &&
                            method.parameterTypes.size == 1 &&
                            method.parameterTypes[0] == "[Ljava/lang/String;" &&
                            method.returnType == "Z" &&
                            AccessFlags.STATIC.isSet(method.accessFlags)
                        ) {
                            method.addInstructions(0, """
                                array-length v0, p0
                                if-eqz v0, :cont
                                const/4 v1, 0x0
                                aget-object v1, p0, v1
                                const-string v2, "android.permission.READ_CONTACTS"
                                invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
                                move-result v1
                                if-eqz v1, :cont
                                const/4 v0, 0x0
                                return v0
                                :cont
                            """)
                        }
                    }
                    stableFound++
                }

                "Lcom/p1/mobile/putong/data/Location;" -> {
                    mutableClass.methods.forEach { method ->
                        if ((method.name == "isHideDistance" || method.name == "isHideUpdateTime") &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z"
                        ) {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                    }
                    stableFound++
                }

                "Lcom/p1/mobile/putong/core/api/CoreServiceImpl;" -> {
                    mutableClass.methods.forEach { method ->
                        if (method.name in setOf("hideActiveTime", "hideAge", "hideLocation") &&
                            method.parameterTypes.size == 1 &&
                            method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" &&
                            method.returnType == "Z"
                        ) {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                    }
                    stableFound++
                }

                "Lcom/p1/mobile/putong/data/User;" -> {
                    mutableClass.methods.forEach { method ->
                        if (method.name == "isHideActiveFromSVip" &&
                            method.parameterTypes.isEmpty() && method.returnType == "Z"
                        ) {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                    }
                    stableFound++
                }

                "Lcom/p1/mobile/putong/live/base/data/BLiveStealthPrivilege;" -> {
                    mutableClass.methods.forEach { method ->
                        val analysis = method.analyze()
                        val targetsLiveField = analysis.accessesField("Lcom/p1/mobile/putong/live/base/data/BLiveStealthPrivilege;", "hideConsumeRecord") ||
                            analysis.accessesField("Lcom/p1/mobile/putong/live/base/data/BLiveStealthPrivilege;", "hideLiveAvatar")
                        if (targetsLiveField && method.returnType == "Z" && method.parameterTypes.isEmpty()) {
                            method.addInstructions(0, RETURN_TRUE)
                        }
                    }
                    stableFound++
                }

                "Lcom/p1/mobile/putong/core/data/ShowOnlineForWhoIMeet;" -> {
                    mutableClass.methods.forEach { method ->
                        val analysis = method.analyze()
                        if (analysis.accessesField("Lcom/p1/mobile/putong/core/data/ShowOnlineForWhoIMeet;", "show") &&
                            method.returnType == "Z" &&
                            method.parameterTypes.isEmpty()
                        ) {
                            method.addInstructions(0, RETURN_FALSE)
                        }
                    }
                    stableFound++
                }
            }
        }

        // ── Obfuscated classes resolved via fingerprints ──

        nearbyPeopleOnlineClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                val analysis = method.analyze()
                if (analysis.containsString("p_home_nearby,online") &&
                    analysis.containsString("nearby_people") &&
                    (analysis.callsMethodNamed("D9") || analysis.callsMethodNamed("bg")) &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        nearbyPeopleMeetClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                val analysis = method.analyze()
                if (analysis.containsString("p_meet_nearby,default") &&
                    analysis.containsString("nearby_people") &&
                    analysis.callsMethodNamed("Fs") &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        nearbyPeoplePresenterClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                val analysis = method.analyze()
                if (analysis.containsString("p_suggest_nearby") &&
                    analysis.containsString("nearby_people") &&
                    (analysis.callsMethodNamed("D9") || analysis.callsMethodNamed("bg")) &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        visitorFootprintGateClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                val analysis = method.analyze()
                if (analysis.containsString("visitor_hide_footprint") &&
                    analysis.containsString("p_navigation_visit,isee") &&
                    analysis.callsMethodNamed("wh") &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        readReceiptPurchaseDialogClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                val analysis = method.analyze()
                if (analysis.containsString("p_purchase_read_receipt_confirm_popup") && method.returnType == "V") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        settingsMomentClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    val analysis = method.analyze()
                    analysis.accessesField("Lcom/p1/mobile/putong/data/SettingsMoment;", "hidePublicMoments") &&
                        (method.returnType == "Ljava/lang/Boolean;" || method.returnType == "Z") &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        privacyMembershipHideLocationClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            val privacyMembershipBoolFields = setOf("hideLocation", "hideAge", "hideIcon", "frozenActivity")
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    val returnType = method.returnType
                    if ((returnType != "Ljava/lang/Boolean;" && returnType != "Z") || method.parameterTypes.isNotEmpty()) return@filter false
                    val analysis = method.analyze()
                    privacyMembershipBoolFields.any { field ->
                        analysis.accessesField("Lcom/p1/mobile/putong/core/data/PrivacyMembershipSetting;", field)
                    }
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        svipPrivacyHideLocationClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            val mutableClass = mutableClassDefBy(classDef)
            val svipBoolFields = setOf("hideLocation", "hideAge", "hideIcon")
            mutableClass.methods
                .filter { method ->
                    val returnType = method.returnType
                    if ((returnType != "Ljava/lang/Boolean;" && returnType != "Z") || method.parameterTypes.isNotEmpty()) return@filter false
                    val analysis = method.analyze()
                    svipBoolFields.any { field ->
                        analysis.accessesField("Lcom/p1/mobile/putong/data/SvipPrivacySettings;", field)
                    }
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
            mutableClass.methods
                .filter { method ->
                    if (method.returnType != "J" || method.parameterTypes.isNotEmpty()) return@filter false
                    val analysis = method.analyze()
                    analysis.accessesField("Lcom/p1/mobile/putong/data/SvipPrivacySettings;", "frozenTime")
                }
                .forEach { it.addInstructions(0, RETURN_LONG_0) }
        }

        // ── Privacy Settings Force Enable (single fingerprint, 3 fields) ──
        val userPrivacyTargetFields = setOf("hideContacts", "hideMutualContacts", "hideSchool", "hideActivityTime", "personalizeSuggest", "adsSuggest")
        userPrivacySettingsClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    val returnType = method.returnType
                    if ((returnType != "Ljava/lang/Boolean;" && returnType != "Z") || method.parameterTypes.isNotEmpty()) return@filter false
                    val analysis = method.analyze()
                    userPrivacyTargetFields.any { field ->
                        analysis.accessesField("Lcom/p1/mobile/putong/data/UserPrivacySettings;", field)
                    }
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }
    }
}
