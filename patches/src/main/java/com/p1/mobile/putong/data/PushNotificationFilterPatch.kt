package com.p1.mobile.putong.data

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

private const val PUSH_MESSAGE_INTENT_FIELD =
    "Lcom/p1/mobile/putong/data/PushMessage;->intent:Ljava/lang/String;"

private val KEEP_PREFIXES = listOf("conversation.", "message.", "call.", "moment.")

private val KEEP_EXACT = listOf(
    "superLike.received",
    "letter.received",
    "secretcrush.received",
    "friendship.request",
    "quickchat.match"
)

private val BLOCK_EXACT = listOf(
    "growth.follow",
    "friend.reminder",
    "rev.low.price",
    "push.arrival.ab.local.push",
    "home.picks",
    "sayHiLiked.received",
    "seenotice.received",
    "gift.received.like",
    "suggested.liked",
    "superLike.invite",
    "boost.end.push",
    "membership.expiration",
    "push.pay.landpage",
    "order.firstPay.fail.sendCoupon",
    "userbag.couponbag.changed",
    "visit.notify",
    "see.picks",
    "common.link",
    "guide.update",
    "soulship.agree",
    "placesv2.challenge"
)

private val BLOCK_PREFIXES = listOf("heartbeat.match.", "lucky.money.")

private fun buildPushFilterInstructions(): Pair<String, Int> {
    val sb = StringBuilder()
    var count = 0
    fun emit(line: String) {
        sb.append(line).append('\n')
        count++
    }
    fun check(key: String, prefix: Boolean, target: String) {
        emit("const-string v1, \"$key\"")
        val method = if (prefix) "startsWith(Ljava/lang/String;)Z" else "equals(Ljava/lang/Object;)Z"
        emit("invoke-virtual {v0, v1}, Ljava/lang/String;->$method")
        emit("move-result v2")
        emit("if-nez v2, $target")
    }

    emit("move-object/from16 v0, p0")
    emit("iget-object v0, v0, $PUSH_MESSAGE_INTENT_FIELD")
    emit("if-eqz v0, :pnf_keep")

    KEEP_PREFIXES.forEach { check(it, true, ":pnf_keep") }
    KEEP_EXACT.forEach { check(it, false, ":pnf_keep") }
    BLOCK_EXACT.forEach { check(it, false, ":pnf_drop") }
    BLOCK_PREFIXES.forEach { check(it, true, ":pnf_drop") }

    emit("goto :pnf_keep")
    sb.append(":pnf_drop\n")
    emit("return-void")
    sb.append(":pnf_keep\n")
    return sb.toString() to count
}

@Suppress("unused")
@JvmField
val pushNotificationFilterPatch = bytecodePatch(
    name = "Push Notification Filter",
    description = "Suppresses marketing and promo push notifications (growth, picks, coupons, membership nags, visit bait) while keeping messages, calls, matches, moments and friend requests. Filtered by PushMessage.intent at the single notification-posting choke point",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val resolver = getSharedResolver()
        val (filterSmali, filterCount) = buildPushFilterInstructions()

        // All 4 notification callers funnel into c0j0.f(PushMessage,PendingIntent,Intent,
        // Action,Action)V. Only 3 generic channels exist, so intent filtering is the only
        // client lever. Keep-list checks run FIRST (early fall-through); blocklist second;
        // unlisted intents are kept. Working regs v0-v2; the original prologue redefines them
        // before reading, so the fall-through is safe. Requires >=3 free scratch registers.
        resolver.getMiscClass("pushPoster")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    AccessFlags.STATIC.isSet(method.accessFlags) && method.returnType == "V" &&
                        method.parameterTypes == listOf(
                            "Lcom/p1/mobile/putong/data/PushMessage;",
                            "Landroid/app/PendingIntent;",
                            "Landroid/content/Intent;",
                            "Landroidx/core/app/NotificationCompat${'$'}Action;",
                            "Landroidx/core/app/NotificationCompat${'$'}Action;"
                        )
                }
                .forEach { method ->
                    val registerCount = method.implementation?.registerCount ?: 0
                    if (registerCount - method.parameterTypes.size < 3) return@forEach
                    method.preflightSmali(filterSmali, filterCount)
                    method.addInstructions(0, filterSmali)
                }
        }
    }
}
