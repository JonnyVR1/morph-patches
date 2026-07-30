package p153l;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;

/* JADX INFO: loaded from: classes4.dex */
public class muj {
    /* JADX INFO: renamed from: A */
    public static void m160158A(BLiveEffect bLiveEffect) {
        nsh0.m164608j("[live]gift_play", "svga templateUrl serialize failed . id = " + bLiveEffect.f45207id);
    }

    /* JADX INFO: renamed from: B */
    public static void m160159B(GiftTrayData giftTrayData, int i) {
        nsh0.m164608j("[live][gift]trays", "trays comb anim end  comboNum = " + i + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: C */
    public static void m160160C(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live][gift]trays", "trays hide anim start  sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: D */
    public static void m160161D(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live][gift]trays", "trays show anim start  sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: E */
    public static void m160162E(BLiveEffect bLiveEffect, udl0 udl0Var, VideoEffectPlayer videoEffectPlayer, GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "video load fail id = " + bLiveEffect.f45207id + "effectModel = " + udl0Var + "  player = " + videoEffectPlayer + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: F */
    public static void m160163F(lx50 lx50Var) {
        nsh0.m164608j("[live][gift]send", "gift request source = " + lx50Var.m156153c());
    }

    /* JADX INFO: renamed from: G */
    public static void m160164G(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "playGiftLayer animationType = " + giftTrayData.f50967y + " trayType =  " + giftTrayData.f50963u);
    }

    /* JADX INFO: renamed from: H */
    public static void m160165H(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "LiveGiftTrays playLayer. giftLevel = " + giftTrayData.f50946d);
    }

    /* JADX INFO: renamed from: I */
    public static void m160166I(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "play normal effect. id = " + giftTrayData.f50946d);
    }

    /* JADX INFO: renamed from: J */
    public static void m160167J(GiftTrayData giftTrayData, String str) {
        nsh0.m164608j("[live]gift_play", "play normal error. id = " + giftTrayData.f50946d + " error msg = " + str + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: K */
    public static void m160168K(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "play normal finish. id = " + giftTrayData.f50946d + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: L */
    public static void m160169L(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "play normal start. id = " + giftTrayData.f50946d + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: M */
    public static void m160170M(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "start play svga = " + bLiveEffect.f45207id + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: N */
    public static void m160171N(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "play video complete. id = " + bLiveEffect.f45207id + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: O */
    public static void m160172O(int i, String str, GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "gift video player error = " + i + " i1 = " + str + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: P */
    public static void m160173P(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "play video onPrepare  id = " + bLiveEffect.f45207id + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: Q */
    public static void m160174Q(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        nsh0.m164608j("[live][gift]trays", "can not find giftItem and request gift " + bLiveGivenGiftBrief.f45233id + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: R */
    public static void m160175R(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "start play video = " + bLiveEffect.f45207id + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: S */
    public static void m160176S(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        nsh0.m164608j("[live][gift]face", "prepare to add face gift. resId = " + bLiveGiftItem.liveResourceId + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: T */
    public static void m160177T(GiftTrayData giftTrayData, LiveGiftTraysPresenter.TrayType trayType) {
        nsh0.m164608j("[live][gift]trays", "ready to play tray anim. giftId =  " + giftTrayData.f50947e + " giftLevel " + giftTrayData.f50946d + " trayType = " + trayType.name());
    }

    /* JADX INFO: renamed from: U */
    public static void m160178U(BLiveEnterRoom bLiveEnterRoom) {
        nsh0.m164608j("[gift]enterRoom", "Receive Enter Room  uid:" + bLiveEnterRoom.uid + " enterRoomEffectId: " + bLiveEnterRoom.enterRoomEffectId);
    }

    /* JADX INFO: renamed from: V */
    public static void m160179V(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        nsh0.m164608j("[live][gift]face", "prepare to add face gift. resId = " + bLiveGiftItem.liveResourceId + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: X */
    public static void m160181X(String str) {
        nsh0.m164608j("[live][gift]send", "giftId = " + str);
    }

    /* JADX INFO: renamed from: Y */
    public static void m160182Y(String str) {
        nsh0.m164608j("[live][gift]send", "send gift can not target gift. giftId = " + str);
    }

    /* JADX INFO: renamed from: Z */
    public static void m160183Z(BLiveGiftItem bLiveGiftItem, Throwable th) {
        nsh0.m164608j("[live][gift]send", "send gift failed . id = " + bLiveGiftItem.f45225id + "  failedCode = " + (th instanceof TantanException.Client.CoreService ? ((TantanException.Client.CoreService) th).code : 404));
    }

    /* JADX INFO: renamed from: a */
    public static void m160184a(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live][gift]trays", "add gift to live gift list. id =  " + giftTrayData.f50947e + " gift level = " + giftTrayData.f50946d);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m160185a0(BLiveGiftItem bLiveGiftItem) {
        nsh0.m164608j("[live][gift]send", "send gift intercept by Confess Gift. Gift id = " + bLiveGiftItem.f45225id);
    }

    /* JADX INFO: renamed from: b */
    public static void m160186b(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        nsh0.m164608j("[live][gift]face", "prepare to add face gift. resId = " + bLiveGiftItem.liveResourceId + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: b0 */
    public static void m160187b0(BLiveGiftItem bLiveGiftItem, String str) {
        nsh0.m164608j("[live][gift]send", "send gift intercept by Confess Gift. Gift id = " + bLiveGiftItem.f45225id + "But failed, failed reason is " + str);
    }

    /* JADX INFO: renamed from: c */
    public static void m160188c(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "add special res = " + bLiveEffect.f45207id + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: c0 */
    public static void m160189c0(BLiveGiftItem bLiveGiftItem) {
        nsh0.m164608j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.f45225id + "Gift type is namingCard.Dialog confirm button is clicked.");
    }

    /* JADX INFO: renamed from: d */
    public static void m160190d() {
        nsh0.m164608j("[live][gift]face", "can not find face gift and pollCDNGiftItems");
    }

    /* JADX INFO: renamed from: d0 */
    public static void m160191d0(BLiveGiftItem bLiveGiftItem, String str) {
        nsh0.m164608j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.f45225id + "Gift type is " + str);
    }

    /* JADX INFO: renamed from: e */
    public static void m160192e() {
        nsh0.m164608j("[live][gift]face", "check face gift map when receive gift bs");
    }

    /* JADX INFO: renamed from: e0 */
    public static void m160193e0(BLiveGiftItem bLiveGiftItem, String str, String str2) {
        nsh0.m164608j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.f45225id + "Gift type is " + str + "reason is " + str2);
    }

    /* JADX INFO: renamed from: f */
    public static void m160194f(BLiveGiftItem bLiveGiftItem) {
        String str;
        if (bLiveGiftItem == null) {
            str = "gift item is null --> interrupt";
        } else {
            str = "gift id is empty. id = " + bLiveGiftItem.f45225id;
        }
        nsh0.m164608j("[live][gift]face", str);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m160195f0(BLiveGiftItem bLiveGiftItem) {
        nsh0.m164608j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.f45225id + "Gift type is unJailCard.Dialog confirm button is clicked.");
    }

    /* JADX INFO: renamed from: g */
    public static void m160196g(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        nsh0.m164608j("[live][gift]trays", "down load effect res. giftId =  " + giftTrayData.f50947e + "  effect type = " + bLiveEffect.type);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m160197g0(BLiveGiftItem bLiveGiftItem, String str, String str2) {
        nsh0.m164608j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.f45225id + "Gift type is " + str + "Dialog is show, " + str2);
    }

    /* JADX INFO: renamed from: h */
    public static void m160198h(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        nsh0.m164608j("[live][gift]trays", "down load effect res failed. giftId =  " + giftTrayData.f50947e + "  effect type = " + bLiveEffect.type);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m160199h0(BLiveGiftItem bLiveGiftItem) {
        nsh0.m164608j("[live][gift]send", "send gift start. id = " + bLiveGiftItem.f45225id);
    }

    /* JADX INFO: renamed from: i */
    public static void m160200i(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        nsh0.m164608j("[live][gift]trays", "down load effect res success . giftId =  " + giftTrayData.f50947e + "  effect type = " + bLiveEffect.type);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m160201i0(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        nsh0.m164608j("[live][gift]send", "send gift success . id = " + bLiveGiftItem.f45225id + " comboId = " + bLiveGivenGiftBrief.comboId + "combo = " + bLiveGivenGiftBrief.combos + " giftSrouce = " + bLiveGivenGiftBrief.giftSource + " sendGiftExtraInfo =  " + bLiveGivenGiftBrief.getSendGiftExtraInfo() + " giftLevel = " + bLiveGiftItem.giftLevel);
    }

    /* JADX INFO: renamed from: j */
    public static void m160202j(BLiveGiftItem bLiveGiftItem) {
        nsh0.m164608j("[live][gift]face", "face gift res download failed. resId = " + bLiveGiftItem.liveResourceId);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m160203j0(String str) {
        nsh0.m164608j("[live][gift]send", "send gift intercept; Gift id is " + str + ". GiftInterceptorWrapperData will be add to giftExtraInfo");
    }

    /* JADX INFO: renamed from: k */
    public static void m160204k(BLiveGiftItem bLiveGiftItem) {
        nsh0.m164608j("[live][gift]face", "face gift res download success. resId = " + bLiveGiftItem.liveResourceId);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m160205k0(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "play video call start method" + bLiveEffect.f45207id + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: l */
    public static void m160206l(String str, GiftTrayData giftTrayData) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" gift res liveResourceId is empty. giftId =  ");
        sb.append(giftTrayData == null ? " null" : Integer.valueOf(giftTrayData.f50947e));
        nsh0.m164608j("[live]gift_play", sb.toString());
    }

    /* JADX INFO: renamed from: l0 */
    public static void m160207l0(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        nsh0.m164608j("[live][gift]trays", "can not find giftItem,and brief pollFromNetwork true . id = " + bLiveGivenGiftBrief.f45233id + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: m */
    public static void m160208m(String str, int i) {
        nsh0.m164608j("[live][gift]resource", "svga resource not exist, effectId = " + str + " from = " + i);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m160209m0(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live][gift]trays", "try to start trays show anim  trayType =  " + giftTrayData.f50963u + " sendGiftExtraInfo =  " + giftTrayData.m75346l() + " gift id = " + giftTrayData.f50947e + "  giftLevel = " + giftTrayData.f50946d);
    }

    /* JADX INFO: renamed from: n */
    public static void m160210n(BLiveEnterRoom bLiveEnterRoom) {
        nsh0.m164608j("[gift]enterRoom", "Play Enter Room  uid:" + bLiveEnterRoom.uid + "  isWealthHierarchy:" + bLiveEnterRoom.isWealthHierarchy + " enterRoomEffectId: " + bLiveEnterRoom.enterRoomEffectId);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m160211n0(boolean z, String str) {
        nsh0.m164608j("[gift]EffectManager", (z ? " unzip success." : "unzip failed.") + "effectId = " + str);
    }

    /* JADX INFO: renamed from: o */
    public static void m160212o(String str) {
        nsh0.m164608j("[live][gift]face", "can not find face gift effect message = " + str);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m160213o0(String str) {
        nsh0.m164608j("[gift]EffectManager", "zip md5 check success. effectId = " + str);
    }

    /* JADX INFO: renamed from: p */
    public static void m160214p() {
        nsh0.m164608j("[live][gift]face", "onFaceGiftEffectNotFindRetry");
    }

    /* JADX INFO: renamed from: q */
    public static void m160215q(String str) {
        nsh0.m164608j("[live][gift]face", "can not find face gift and pollCDNGiftItems  message = " + str);
    }

    /* JADX INFO: renamed from: r */
    public static void m160216r() {
        nsh0.m164608j("[live][gift]face", "onFaceGiftItemNotFindRetry");
    }

    /* JADX INFO: renamed from: s */
    public static void m160217s(LiveMessage liveMessage) {
        nsh0.m164608j("[live][gift]", "gift message received, content = " + liveMessage.messageContent);
    }

    /* JADX INFO: renamed from: t */
    public static void m160218t(LiveMessage liveMessage) {
        if (liveMessage.isLuFinished) {
            return;
        }
        liveMessage.isLuFinished = true;
        nsh0.m164608j("[live][gift]", "gift message show, content = " + liveMessage.messageContent);
    }

    /* JADX INFO: renamed from: u */
    public static void m160219u(String str) {
        nsh0.m164608j("[gift]EffectManager", str);
    }

    /* JADX INFO: renamed from: v */
    public static void m160220v(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "no effect anim when down grade. id = " + giftTrayData.f50947e + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: w */
    public static void m160221w(boolean z) {
        nsh0.m164608j("[live]gift_play", "poll room gift when longLink. roomLongLink = " + z);
    }

    /* JADX INFO: renamed from: x */
    public static void m160222x(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "svga onFinish sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: y */
    public static void m160223y(BLiveEffect bLiveEffect, String str, GiftTrayData giftTrayData) {
        nsh0.m164608j("[gift]EffectManager", "svga load失败 id = " + bLiveEffect.f45207id + str + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: z */
    public static void m160224z(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]gift_play", "svga onStart sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: W */
    public static void m160180W(String str, String str2, String str3, boolean z) {
    }
}
