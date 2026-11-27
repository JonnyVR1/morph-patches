package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.extensions.InstructionExtensions.replaceInstruction
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction21s
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction35c
import com.android.tools.smali.dexlib2.iface.ClassDef
import com.android.tools.smali.dexlib2.iface.Method
import com.android.tools.smali.dexlib2.iface.instruction.FiveRegisterInstruction
import com.android.tools.smali.dexlib2.iface.instruction.Instruction
import com.android.tools.smali.dexlib2.iface.instruction.NarrowLiteralInstruction
import com.android.tools.smali.dexlib2.iface.instruction.OneRegisterInstruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.instruction.RegisterRangeInstruction
import com.android.tools.smali.dexlib2.iface.instruction.ThreeRegisterInstruction
import com.android.tools.smali.dexlib2.iface.instruction.TwoRegisterInstruction
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference

private val instructionCache = java.util.WeakHashMap<Method, List<Instruction>>()
private fun Method.cachedInstructions(): List<Instruction> =
    instructionCache.getOrPut(this) { implementation?.instructions?.toList() ?: emptyList() }

private const val RETURN_VOID = "return-void"

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_EMPTY_STRING = """
    const-string v0, ""
    return-object v0
"""

private fun isConstructor(method: Method): Boolean =
    method.name == "<init>" || method.name == "<clinit>"

private val WIDE_ONE_REG_OPCODES = setOf(
    Opcode.CONST_WIDE, Opcode.CONST_WIDE_16, Opcode.CONST_WIDE_32, Opcode.CONST_WIDE_HIGH16,
    Opcode.MOVE_RESULT_WIDE, Opcode.MOVE_WIDE, Opcode.MOVE_WIDE_FROM16, Opcode.MOVE_WIDE_16
)

private fun instructionMentionsRegister(instr: Instruction, reg: Int): Boolean {
    if (instr is OneRegisterInstruction) {
        if (instr.registerA == reg) return true
        if ((instr.opcode in WIDE_ONE_REG_OPCODES || instr.opcode == Opcode.RETURN_WIDE) &&
            instr.registerA + 1 == reg) return true
    }
    if (instr is TwoRegisterInstruction) {
        if (instr.registerB == reg) return true
        if (instr.opcode.name.startsWith("move-wide") && instr.registerB + 1 == reg) return true
    }
    if (instr is ThreeRegisterInstruction) {
        if (instr.registerC == reg) return true
        val opName = instr.opcode.name
        if ((opName.contains("-long") || opName.contains("-double")) &&
            (instr.registerB + 1 == reg || instr.registerC + 1 == reg)) return true
    }
    if (instr is FiveRegisterInstruction) {
        val regs = intArrayOf(instr.registerC, instr.registerD, instr.registerE, instr.registerF, instr.registerG)
        for (k in 0 until instr.registerCount) if (regs[k] == reg) return true
    }
    if (instr is RegisterRangeInstruction &&
        reg >= instr.startRegister && reg < instr.startRegister + instr.registerCount) return true
    return false
}

private fun isPureRegisterDefinition(instr: Instruction, reg: Int): Boolean {
    val op = instr.opcode
    val name = op.name
    val isDef = op == Opcode.CONST_4 || op == Opcode.CONST_16 || op == Opcode.CONST ||
        op == Opcode.CONST_HIGH16 || op == Opcode.CONST_STRING || op == Opcode.CONST_STRING_JUMBO ||
        op == Opcode.CONST_CLASS || op == Opcode.MOVE || op == Opcode.MOVE_FROM16 ||
        op == Opcode.MOVE_16 || op == Opcode.MOVE_OBJECT || op == Opcode.MOVE_OBJECT_FROM16 ||
        op == Opcode.MOVE_OBJECT_16 || op == Opcode.MOVE_RESULT || op == Opcode.MOVE_RESULT_OBJECT ||
        op == Opcode.MOVE_EXCEPTION || op == Opcode.NEW_INSTANCE || op == Opcode.NEW_ARRAY ||
        name.startsWith("iget") || name.startsWith("sget") || op in WIDE_ONE_REG_OPCODES
    if (!isDef || instr !is OneRegisterInstruction) return false
    if (instr.registerA == reg) return true
    return op in WIDE_ONE_REG_OPCODES && instr.registerA + 1 == reg
}

// A register is dead at instruction i if no later instruction reads it before redefining it.
// Conservative: any non-definition mention counts as a read.
private fun isRegisterDeadAfter(instrs: List<Instruction>, i: Int, reg: Int): Boolean {
    for (j in i + 1 until instrs.size) {
        val ins = instrs[j]
        if (isPureRegisterDefinition(ins, reg)) return true
        if (instructionMentionsRegister(ins, reg)) return false
    }
    return true
}

private val apkSignatureVerificationFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(type = "Ljavax/security/auth/x500/X500Principal;"),
        methodCall(name = "getSubjectX500Principal"),
    ),
)

@Suppress("unused")
@JvmField
val privacyEnhancementPatch = bytecodePatch(
    name = "Privacy Enhancement",
    description = "Advanced privacy protections: root/emulator detection bypass, ShuMeng SDK blocking, Facebook SDK emulator detection bypass, APK signature verification bypass, package enumeration prevention, VPN/proxy detection bypass, overlay detection bypass, screenshot-warning nag suppression, telepathy private-photo screenshot enable, contacts upload block, clipboard invite-code read block, MK live-H5 app-enumeration block, WebView mixed-content hardening",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val resolver = getSharedResolver()
        
        val suPathStrings = setOf("/data/local/su", "/system/xbin/su", "/su/bin/su")
        val fbEmulatorStrings = setOf("google_sdk", "Genymotion", "generic", "Emulator")

        val jmd0Class = resolver.getPrivacyClass("jmd0")
        val mmd0Class = resolver.getPrivacyClass("mmd0")
        val ert0Class = resolver.getPrivacyClass("ert0")
        val fbEmulatorClass = resolver.getPrivacyClass("fbEmulator")
        val additionalRootClass = resolver.getPrivacyClass("additionalRoot")
        val shuMengClass = resolver.getPrivacyClass("shuMeng")
        val adClickSubstitutionClass = resolver.getPrivacyClass("adClickSubstitution")

        listOf(jmd0Class, mmd0Class).forEach { classDef ->
            classDef?.let {
                mutableClassDefBy(it).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (isConstructor(method)) return@forEach
                    if (method.returnType == "Z" && method.parameterTypes.isEmpty()) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/tantanapp/beatles/utils/DeviceUtil;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "Ljava/lang/Boolean;" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, """
                        const/4 v0, 0x0
                        invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
                        move-result-object v0
                        return-object v0
                    """)
                }
            }
        }

        ert0Class?.let { classDef ->
            val emulatorStrings = setOf("ranchu", "generic", "emulator")
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                // 7.5.6.1: the (Z)Z twin is gone; the emulator check is now a no-arg ()Z
                // (mjp.a). Force false on the ()Z carrier of the emulator strings (and keep the
                // legacy (Z)Z branch for older layouts).
                val carriesEmulatorStrings = method.cachedInstructions().any { instr ->
                    instr is ReferenceInstruction && instr.reference is StringReference &&
                        (instr.reference as StringReference).string in emulatorStrings
                }
                if (method.returnType == "Z" && method.parameterTypes.isEmpty() && carriesEmulatorStrings) {
                    method.addInstructions(0, RETURN_FALSE)
                }
                if (method.returnType == "Z" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "Z") {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        fbEmulatorClass?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "Z" && method.parameterTypes.isEmpty() && AccessFlags.STATIC.isSet(method.accessFlags)) {
                    val hasEmulatorStrings = method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is StringReference &&
                            (instr.reference as StringReference).string in fbEmulatorStrings
                    }
                    if (hasEmulatorStrings) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }
        }

        shuMengClass?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "V" && method.parameterTypes.isNotEmpty() && method.parameterTypes[0] == "Landroid/content/Context;") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        apkSignatureVerificationFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "Z" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "Landroid/content/Context;" && AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_TRUE)
                }
            }
        }

        adClickSubstitutionClass?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "Ljava/lang/String;" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Ljava/lang/String;" &&
                    method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is StringReference &&
                            (instr.reference as StringReference).string == "\\[(.*?)]"
                    }) {
                    method.addInstructions(0, """
                        move-object/from16 v0, p0
                        return-object v0
                    """)
                }
            }
        }

        additionalRootClass?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "Z" && method.parameterTypes.isEmpty() && AccessFlags.STATIC.isSet(method.accessFlags)) {
                    val hasSuPaths = method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is StringReference &&
                            (instr.reference as StringReference).string in suPathStrings
                    }
                    if (hasSuPaths) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }
        }

        // Screenshot-warning detector nag (pnf0): the static ()Z activation gate u() controls
        // ContentObserver registration at the CoreBusinessModule call site and the per-event
        // re-check. Local dialog + Fox analytics only — no server report, no notification to
        // the other party. Only static no-arg ()Z in the class is the gate (7.5.4).
        resolver.getMiscClass("screenshotWarning")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter {
                    AccessFlags.STATIC.isSet(it.accessFlags) &&
                        it.returnType == "Z" && it.parameterTypes.isEmpty()
                }
                .forEach {
                    it.preflightSmali(RETURN_FALSE, 2)
                    it.addInstructions(0, RETURN_FALSE)
                }
        }

        // FLAG_SECURE removal — Telepathy private-photo preview. Replace the const loading
        // 0x2000 (8192) that feeds Window.addFlags(I)V with 0 in place (same const/16 format,
        // zero offset shift). addFlags(0) is a no-op; status-bar/swipe-back setup stays intact.
        // Does NOT bypass payment or the server burn timer. Only app-code FLAG_SECURE site.
        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/telepathy/photo/TelepathyPrivatePhotoPreviewAct;")?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            classDef.methods.forEach { method ->
                if (method.name != "preCreateView" ||
                    method.parameterTypes != listOf("Landroid/os/Bundle;") ||
                    method.returnType != "V") return@forEach
                val instrs = method.cachedInstructions()
                val mutableMethod = methodMap[method] ?: return@forEach
                for (i in 0 until instrs.size - 1) {
                    val cur = instrs[i]
                    val next = instrs[i + 1]
                    if (cur.opcode == Opcode.CONST_16 && cur is NarrowLiteralInstruction && cur.narrowLiteral == 8192 &&
                        next is ReferenceInstruction &&
                        (next.reference as? MethodReference)?.let {
                            it.definingClass == "Landroid/view/Window;" && it.name == "addFlags"
                        } == true
                    ) {
                        val reg = (cur as OneRegisterInstruction).registerA
                        mutableMethod.replaceInstruction(i, BuilderInstruction21s(Opcode.CONST_16, reg, 0))
                    }
                }
            }
        }

        // Contacts upload block (zf6.q): the READ_CONTACTS permission gate. Forcing false makes
        // v() return rx.c.empty(), starving the sole foreground-triggered sync entry E()
        // (CoreBusinessModule.B0) — no /contacts POST, no raw-number upload. Mutual-contact
        // matching stops (accepted tradeoff); the hideContacts setting is a separate feature.
        resolver.getMiscClass("contactsSync")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter {
                    it.returnType == "Z" && it.parameterTypes.isEmpty() &&
                        it.cachedInstructions().any { instr ->
                            instr is ReferenceInstruction &&
                                (instr.reference as? StringReference)?.string == "android.permission.READ_CONTACTS"
                        }
                }
                .forEach {
                    it.preflightSmali(RETURN_FALSE, 2)
                    it.addInstructions(0, RETURN_FALSE)
                }
        }

        // Clipboard invite-code reads: both the live and campaign classes carry the unique
        // invite regex; empty-string return breaks live-campaign attribution (marketing only).
        // In 7.5.6.1 the regex moved from ()String readers (eev.e3/zq4.m4) into ()V campaign
        // senders (ay1.S1/n1c.u1) — void those too. Clipboard WRITE sites stay untouched.
        resolver.getClipboardInviteClasses().forEach { classDef ->
            mutableClassDefBy(classDef).methods
                .filter {
                    it.parameterTypes.isEmpty() &&
                        (it.returnType == "Ljava/lang/String;" || it.returnType == "V") &&
                        it.cachedInstructions().any { instr ->
                            instr is ReferenceInstruction &&
                                (instr.reference as? StringReference)?.string == "tantan:.*邀请码：[A-Z|1-9]{4,}"
                        }
                }
                .forEach {
                    if (it.returnType == "V") {
                        it.preflightSmali(RETURN_VOID, 1)
                        it.addInstructions(0, RETURN_VOID)
                    } else {
                        it.preflightSmali(RETURN_EMPTY_STRING, 2)
                        it.addInstructions(0, RETURN_EMPTY_STRING)
                    }
                }
        }

        // Sud mini-game JS clipboard channel (stable descriptor): the (Context)String reader
        // calling ClipboardManager.getPrimaryClip. The sibling (Context,String)Z writer stays.
        classDefByOrNull("Ltech/sud/runtime/component/c/c;")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter {
                    AccessFlags.STATIC.isSet(it.accessFlags) &&
                        it.returnType == "Ljava/lang/String;" &&
                        it.parameterTypes.size == 1 &&
                        it.parameterTypes[0] == "Landroid/content/Context;" &&
                        it.cachedInstructions().any { instr ->
                            instr is ReferenceInstruction &&
                                (instr.reference as? MethodReference)?.let { ref ->
                                    ref.definingClass == "Landroid/content/ClipboardManager;" &&
                                        ref.name == "getPrimaryClip"
                                } == true
                        }
                }
                .forEach {
                    it.preflightSmali(RETURN_EMPTY_STRING, 2)
                    it.addInstructions(0, RETURN_EMPTY_STRING)
                }
        }

        // MK live-H5 bridge app enumeration (zv3.x): the checkAppInstalled dispatcher feeding
        // getPackageInfo via inner zv3$c. return-void kills install-targeting; the H5 callback
        // never fires (device-test live H5). callPhone/sendSMS handlers are untouched.
        resolver.getMiscClass("mkBridge")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter {
                    it.returnType == "V" && it.parameterTypes.size == 1 &&
                        it.parameterTypes[0] == "Lorg/json/JSONObject;"
                }
                .forEach {
                    it.preflightSmali(RETURN_VOID, 1)
                    it.addInstructions(0, RETURN_VOID)
                }
        }

        // WebView mixed-content hardening: force MIXED_CONTENT_NEVER_ALLOW (1) at every
        // const-0-fed WebSettings.setMixedContentMode(I)V call. The resolver collects ALL
        // caller classes pre-gate; mode-2 sites (AdMob lw0, Weibo) are excluded by the
        // literal-0 requirement. The naive in-place const edit is NOT safe here: VWebView
        // loads const/4 v2,0 ONCE and reuses v2 for many other settings, so instead insert
        // `const/4 s,1` immediately before the invoke and repoint the invoke at a register
        // proven DEAD at that point (no later read before redefinition). Sites are processed
        // in REVERSE index order so earlier indices stay valid; liveness is judged on the
        // original snapshot (conservative). 7 sites in 7.5.4: MKWebView(1),
        // NormalWebViewActivity(2), LiveMkWebView(1), jb10(1), VWebView(2).
        var mixedContentSites = 0
        resolver.getMixedContentClasses().forEach { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            classDef.methods.forEach { method ->
                val instrs = method.cachedInstructions()
                val mutableMethod = methodMap[method] ?: return@forEach
                val rc = method.implementation?.registerCount ?: return@forEach
                data class Site(val index: Int, val objReg: Int, val argReg: Int, val ref: MethodReference)
                val sites = mutableListOf<Site>()
                for (i in instrs.indices) {
                    val instr = instrs[i]
                    if (instr !is ReferenceInstruction) continue
                    val ref = instr.reference as? MethodReference ?: continue
                    if (ref.definingClass != "Landroid/webkit/WebSettings;" ||
                        ref.name != "setMixedContentMode") continue
                    val objReg: Int
                    val argReg: Int
                    when (instr) {
                        is FiveRegisterInstruction -> {
                            if (instr.registerCount != 2) continue
                            objReg = instr.registerC
                            argReg = instr.registerD
                        }
                        is RegisterRangeInstruction -> {
                            if (instr.registerCount != 2) continue
                            objReg = instr.startRegister
                            argReg = instr.startRegister + 1
                        }
                        else -> continue
                    }
                    // The feeding value must be a literal 0: scan back to the most recent
                    // DEFINITION of argReg, skipping pure uses (other invokes etc. sharing it).
                    var feedsZero = false
                    for (j in i - 1 downTo 0) {
                        val prev = instrs[j]
                        if (isPureRegisterDefinition(prev, argReg)) {
                            feedsZero = prev is NarrowLiteralInstruction && prev.narrowLiteral == 0
                            break
                        }
                        if (!instructionMentionsRegister(prev, argReg)) continue
                        val n = prev.opcode.name
                        val pureUse = n.startsWith("invoke-") || n.startsWith("return") ||
                            n.startsWith("if-") || n.startsWith("iput") || n.startsWith("aput") ||
                            n.startsWith("monitor-") || n.startsWith("filled-new-array") ||
                            n.startsWith("iget") || n.startsWith("sget") || n == "throw"
                        if (!pureUse) break
                    }
                    if (feedsZero) sites.add(Site(i, objReg, argReg, ref))
                }
                for (site in sites.sortedByDescending { it.index }) {
                    var scratch = -1
                    var useConst16 = false
                    for (s in 0 until minOf(rc, 16)) {
                        if (s != site.objReg && isRegisterDeadAfter(instrs, site.index, s)) {
                            scratch = s
                            break
                        }
                    }
                    if (scratch < 0) {
                        useConst16 = true
                        for (s in 0 until minOf(rc, 256)) {
                            if (s != site.objReg && isRegisterDeadAfter(instrs, site.index, s)) {
                                scratch = s
                                break
                            }
                        }
                    }
                    check(scratch >= 0) {
                        "Mixed-content: no dead scratch register at ${classDef.type}.${method.name} instr ${site.index}"
                    }
                    mutableMethod.replaceInstruction(
                        site.index,
                        BuilderInstruction35c(Opcode.INVOKE_VIRTUAL, 2, site.objReg, scratch, 0, 0, 0, site.ref)
                    )
                    mutableMethod.addInstructions(
                        site.index,
                        if (useConst16) "const/16 v$scratch, 0x1" else "const/4 v$scratch, 0x1"
                    )
                    mixedContentSites++
                }
            }
        }
        check(mixedContentSites == 7) {
            "Mixed-content hardening expected 7 const-0 sites in 7.5.4, patched $mixedContentSites " +
                "(resolver under-resolution or format drift — DEX-verify)"
        }

        // VPN/proxy detection (ebi0) and overlay detection (j21.b) are intentionally NOT patched:
        // they are anti-fraud/risk-scoring adjacent (kept per the tracking-only decision), and ebi0
        // has no direct app callers in 7.5.4. The old resolver anchors ("http.proxyHost"/"canDrawOverlays")
        // were method/property names, never const-strings, so those blocks were silent no-ops anyway.
        // Real package enumeration is momosec hje.t (kept) and rm60.a (already dead via bn60 void);
        // the ad-click URL device-id substitution is handled by adClickSubstitution (qm60.F) above.
    }
}
