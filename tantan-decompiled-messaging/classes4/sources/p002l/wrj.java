package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import l.gkh0;
import l.q4l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wrj {
    /* JADX INFO: renamed from: A */
    public static void m25366A(BLiveEffect bLiveEffect) {
        gkh0.j("[live]gift_play", "svga templateUrl serialize failed . id = " + bLiveEffect.id);
    }

    /* JADX INFO: renamed from: B */
    public static void m25367B(GiftTrayData giftTrayData, int i) {
        gkh0.j("[live][gift]trays", "trays comb anim end  comboNum = " + i + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: C */
    public static void m25368C(GiftTrayData giftTrayData) {
        gkh0.j("[live][gift]trays", "trays hide anim start  sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: D */
    public static void m25369D(GiftTrayData giftTrayData) {
        gkh0.j("[live][gift]trays", "trays show anim start  sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: E */
    public static void m25370E(BLiveEffect bLiveEffect, q4l0 q4l0Var, VideoEffectPlayer videoEffectPlayer, GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "video load fail id = " + bLiveEffect.id + "effectModel = " + q4l0Var + "  player = " + videoEffectPlayer + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: F */
    public static void m25371F(fp50 fp50Var) {
        gkh0.j("[live][gift]send", "gift request source = " + fp50Var.m13439c());
    }

    /* JADX INFO: renamed from: G */
    public static void m25372G(GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "playGiftLayer animationType = " + giftTrayData.f6161y + " trayType =  " + giftTrayData.f6157u);
    }

    /* JADX INFO: renamed from: H */
    public static void m25373H(GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "LiveGiftTrays playLayer. giftLevel = " + giftTrayData.f6140d);
    }

    /* JADX INFO: renamed from: I */
    public static void m25374I(GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "play normal effect. id = " + giftTrayData.f6140d);
    }

    /* JADX INFO: renamed from: J */
    public static void m25375J(GiftTrayData giftTrayData, String str) {
        gkh0.j("[live]gift_play", "play normal error. id = " + giftTrayData.f6140d + " error msg = " + str + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: K */
    public static void m25376K(GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "play normal finish. id = " + giftTrayData.f6140d + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: L */
    public static void m25377L(GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "play normal start. id = " + giftTrayData.f6140d + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: M */
    public static void m25378M(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "start play svga = " + bLiveEffect.id + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: N */
    public static void m25379N(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "play video complete. id = " + bLiveEffect.id + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: O */
    public static void m25380O(int i, String str, GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "gift video player error = " + i + " i1 = " + str + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: P */
    public static void m25381P(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "play video onPrepare  id = " + bLiveEffect.id + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: Q */
    public static void m25382Q(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        gkh0.j("[live][gift]trays", "can not find giftItem and request gift " + bLiveGivenGiftBrief.id + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: R */
    public static void m25383R(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "start play video = " + bLiveEffect.id + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: S */
    public static void m25384S(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        gkh0.j("[live][gift]face", "prepare to add face gift. resId = " + bLiveGiftItem.liveResourceId + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: T */
    public static void m25385T(GiftTrayData giftTrayData, LiveGiftTraysPresenter.TrayType trayType) {
        gkh0.j("[live][gift]trays", "ready to play tray anim. giftId =  " + giftTrayData.f6141e + " giftLevel " + giftTrayData.f6140d + " trayType = " + trayType.name());
    }

    /* JADX INFO: renamed from: U */
    public static void m25386U(BLiveEnterRoom bLiveEnterRoom) {
        gkh0.j("[gift]enterRoom", "Receive Enter Room  uid:" + bLiveEnterRoom.uid + " enterRoomEffectId: " + bLiveEnterRoom.enterRoomEffectId);
    }

    /* JADX INFO: renamed from: V */
    public static void m25387V(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        gkh0.j("[live][gift]face", "prepare to add face gift. resId = " + bLiveGiftItem.liveResourceId + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: X */
    public static void m25389X(String str) {
        gkh0.j("[live][gift]send", "giftId = " + str);
    }

    /* JADX INFO: renamed from: Y */
    public static void m25390Y(String str) {
        gkh0.j("[live][gift]send", "send gift can not target gift. giftId = " + str);
    }

    /* JADX INFO: renamed from: Z */
    public static void m25391Z(BLiveGiftItem bLiveGiftItem, Throwable th) {
        gkh0.j("[live][gift]send", "send gift failed . id = " + bLiveGiftItem.id + "  failedCode = " + (th instanceof TantanException.Client.CoreService ? ((TantanException.Client.CoreService) th).code : 404));
    }

    /* JADX INFO: renamed from: a */
    public static void m25392a(GiftTrayData giftTrayData) {
        gkh0.j("[live][gift]trays", "add gift to live gift list. id =  " + giftTrayData.f6141e + " gift level = " + giftTrayData.f6140d);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m25393a0(BLiveGiftItem bLiveGiftItem) {
        gkh0.j("[live][gift]send", "send gift intercept by Confess Gift. Gift id = " + bLiveGiftItem.id);
    }

    /* JADX INFO: renamed from: b */
    public static void m25394b(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        gkh0.j("[live][gift]face", "prepare to add face gift. resId = " + bLiveGiftItem.liveResourceId + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: b0 */
    public static void m25395b0(BLiveGiftItem bLiveGiftItem, String str) {
        gkh0.j("[live][gift]send", "send gift intercept by Confess Gift. Gift id = " + bLiveGiftItem.id + "But failed, failed reason is " + str);
    }

    /* JADX INFO: renamed from: c */
    public static void m25396c(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "add special res = " + bLiveEffect.id + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: c0 */
    public static void m25397c0(BLiveGiftItem bLiveGiftItem) {
        gkh0.j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.id + "Gift type is namingCard.Dialog confirm button is clicked.");
    }

    /* JADX INFO: renamed from: d */
    public static void m25398d() {
        gkh0.j("[live][gift]face", "can not find face gift and pollCDNGiftItems");
    }

    /* JADX INFO: renamed from: d0 */
    public static void m25399d0(BLiveGiftItem bLiveGiftItem, String str) {
        gkh0.j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.id + "Gift type is " + str);
    }

    /* JADX INFO: renamed from: e */
    public static void m25400e() {
        gkh0.j("[live][gift]face", "check face gift map when receive gift bs");
    }

    /* JADX INFO: renamed from: e0 */
    public static void m25401e0(BLiveGiftItem bLiveGiftItem, String str, String str2) {
        gkh0.j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.id + "Gift type is " + str + "reason is " + str2);
    }

    /* JADX INFO: renamed from: f */
    public static void m25402f(BLiveGiftItem bLiveGiftItem) {
        String str;
        if (bLiveGiftItem == null) {
            str = "gift item is null --> interrupt";
        } else {
            str = "gift id is empty. id = " + bLiveGiftItem.id;
        }
        gkh0.j("[live][gift]face", str);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m25403f0(BLiveGiftItem bLiveGiftItem) {
        gkh0.j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.id + "Gift type is unJailCard.Dialog confirm button is clicked.");
    }

    /* JADX INFO: renamed from: g */
    public static void m25404g(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        gkh0.j("[live][gift]trays", "down load effect res. giftId =  " + giftTrayData.f6141e + "  effect type = " + bLiveEffect.type);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m25405g0(BLiveGiftItem bLiveGiftItem, String str, String str2) {
        gkh0.j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.id + "Gift type is " + str + "Dialog is show, " + str2);
    }

    /* JADX INFO: renamed from: h */
    public static void m25406h(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        gkh0.j("[live][gift]trays", "down load effect res failed. giftId =  " + giftTrayData.f6141e + "  effect type = " + bLiveEffect.type);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m25407h0(BLiveGiftItem bLiveGiftItem) {
        gkh0.j("[live][gift]send", "send gift start. id = " + bLiveGiftItem.id);
    }

    /* JADX INFO: renamed from: i */
    public static void m25408i(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        gkh0.j("[live][gift]trays", "down load effect res success . giftId =  " + giftTrayData.f6141e + "  effect type = " + bLiveEffect.type);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m25409i0(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        gkh0.j("[live][gift]send", "send gift success . id = " + bLiveGiftItem.id + " comboId = " + bLiveGivenGiftBrief.comboId + "combo = " + bLiveGivenGiftBrief.combos + " giftSrouce = " + bLiveGivenGiftBrief.giftSource + " sendGiftExtraInfo =  " + bLiveGivenGiftBrief.getSendGiftExtraInfo() + " giftLevel = " + bLiveGiftItem.giftLevel);
    }

    /* JADX INFO: renamed from: j */
    public static void m25410j(BLiveGiftItem bLiveGiftItem) {
        gkh0.j("[live][gift]face", "face gift res download failed. resId = " + bLiveGiftItem.liveResourceId);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m25411j0(String str) {
        gkh0.j("[live][gift]send", "send gift intercept; Gift id is " + str + ". GiftInterceptorWrapperData will be add to giftExtraInfo");
    }

    /* JADX INFO: renamed from: k */
    public static void m25412k(BLiveGiftItem bLiveGiftItem) {
        gkh0.j("[live][gift]face", "face gift res download success. resId = " + bLiveGiftItem.liveResourceId);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m25413k0(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "play video call start method" + bLiveEffect.id + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: l */
    public static void m25414l(String str, GiftTrayData giftTrayData) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" gift res liveResourceId is empty. giftId =  ");
        sb.append(giftTrayData == null ? " null" : Integer.valueOf(giftTrayData.f6141e));
        gkh0.j("[live]gift_play", sb.toString());
    }

    /* JADX INFO: renamed from: l0 */
    public static void m25415l0(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        gkh0.j("[live][gift]trays", "can not find giftItem,and brief pollFromNetwork true . id = " + bLiveGivenGiftBrief.id + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: m */
    public static void m25416m(String str, int i) {
        gkh0.j("[live][gift]resource", "svga resource not exist, effectId = " + str + " from = " + i);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m25417m0(GiftTrayData giftTrayData) {
        gkh0.j("[live][gift]trays", "try to start trays show anim  trayType =  " + giftTrayData.f6157u + " sendGiftExtraInfo =  " + giftTrayData.m7728l() + " gift id = " + giftTrayData.f6141e + "  giftLevel = " + giftTrayData.f6140d);
    }

    /* JADX INFO: renamed from: n */
    public static void m25418n(BLiveEnterRoom bLiveEnterRoom) {
        gkh0.j("[gift]enterRoom", "Play Enter Room  uid:" + bLiveEnterRoom.uid + "  isWealthHierarchy:" + bLiveEnterRoom.isWealthHierarchy + " enterRoomEffectId: " + bLiveEnterRoom.enterRoomEffectId);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m25419n0(boolean z, String str) {
        gkh0.j("[gift]EffectManager", (z ? " unzip success." : "unzip failed.") + "effectId = " + str);
    }

    /* JADX INFO: renamed from: o */
    public static void m25420o(String str) {
        gkh0.j("[live][gift]face", "can not find face gift effect message = " + str);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m25421o0(String str) {
        gkh0.j("[gift]EffectManager", "zip md5 check success. effectId = " + str);
    }

    /* JADX INFO: renamed from: p */
    public static void m25422p() {
        gkh0.j("[live][gift]face", "onFaceGiftEffectNotFindRetry");
    }

    /* JADX INFO: renamed from: q */
    public static void m25423q(String str) {
        gkh0.j("[live][gift]face", "can not find face gift and pollCDNGiftItems  message = " + str);
    }

    /* JADX INFO: renamed from: r */
    public static void m25424r() {
        gkh0.j("[live][gift]face", "onFaceGiftItemNotFindRetry");
    }

    /* JADX INFO: renamed from: s */
    public static void m25425s(LiveMessage liveMessage) {
        gkh0.j("[live][gift]", "gift message received, content = " + liveMessage.messageContent);
    }

    /* JADX INFO: renamed from: t */
    public static void m25426t(LiveMessage liveMessage) {
        if (liveMessage.isLuFinished) {
            return;
        }
        liveMessage.isLuFinished = true;
        gkh0.j("[live][gift]", "gift message show, content = " + liveMessage.messageContent);
    }

    /* JADX INFO: renamed from: u */
    public static void m25427u(String str) {
        gkh0.j("[gift]EffectManager", str);
    }

    /* JADX INFO: renamed from: v */
    public static void m25428v(GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "no effect anim when down grade. id = " + giftTrayData.f6141e + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: w */
    public static void m25429w(boolean z) {
        gkh0.j("[live]gift_play", "poll room gift when longLink. roomLongLink = " + z);
    }

    /* JADX INFO: renamed from: x */
    public static void m25430x(GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "svga onFinish sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: y */
    public static void m25431y(BLiveEffect bLiveEffect, String str, GiftTrayData giftTrayData) {
        gkh0.j("[gift]EffectManager", "svga load失败 id = " + bLiveEffect.id + str + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: z */
    public static void m25432z(GiftTrayData giftTrayData) {
        gkh0.j("[live]gift_play", "svga onStart sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: W */
    public static void m25388W(String str, String str2, String str3, boolean z) {
    }
}
