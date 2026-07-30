package p149l;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;

/* JADX INFO: loaded from: classes4.dex */
public class wrj {
    /* JADX INFO: renamed from: A */
    public static void m205194A(BLiveEffect bLiveEffect) {
        gkh0.m126627j("[live]gift_play", "svga templateUrl serialize failed . id = " + bLiveEffect.f44359id);
    }

    /* JADX INFO: renamed from: B */
    public static void m205195B(GiftTrayData giftTrayData, int i) {
        gkh0.m126627j("[live][gift]trays", "trays comb anim end  comboNum = " + i + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: C */
    public static void m205196C(GiftTrayData giftTrayData) {
        gkh0.m126627j("[live][gift]trays", "trays hide anim start  sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: D */
    public static void m205197D(GiftTrayData giftTrayData) {
        gkh0.m126627j("[live][gift]trays", "trays show anim start  sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: E */
    public static void m205198E(BLiveEffect bLiveEffect, q4l0 q4l0Var, VideoEffectPlayer videoEffectPlayer, GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "video load fail id = " + bLiveEffect.f44359id + "effectModel = " + q4l0Var + "  player = " + videoEffectPlayer + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: F */
    public static void m205199F(fp50 fp50Var) {
        gkh0.m126627j("[live][gift]send", "gift request source = " + fp50Var.m122559c());
    }

    /* JADX INFO: renamed from: G */
    public static void m205200G(GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "playGiftLayer animationType = " + giftTrayData.f50119y + " trayType =  " + giftTrayData.f50115u);
    }

    /* JADX INFO: renamed from: H */
    public static void m205201H(GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "LiveGiftTrays playLayer. giftLevel = " + giftTrayData.f50098d);
    }

    /* JADX INFO: renamed from: I */
    public static void m205202I(GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "play normal effect. id = " + giftTrayData.f50098d);
    }

    /* JADX INFO: renamed from: J */
    public static void m205203J(GiftTrayData giftTrayData, String str) {
        gkh0.m126627j("[live]gift_play", "play normal error. id = " + giftTrayData.f50098d + " error msg = " + str + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: K */
    public static void m205204K(GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "play normal finish. id = " + giftTrayData.f50098d + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: L */
    public static void m205205L(GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "play normal start. id = " + giftTrayData.f50098d + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: M */
    public static void m205206M(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "start play svga = " + bLiveEffect.f44359id + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: N */
    public static void m205207N(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "play video complete. id = " + bLiveEffect.f44359id + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: O */
    public static void m205208O(int i, String str, GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "gift video player error = " + i + " i1 = " + str + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: P */
    public static void m205209P(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "play video onPrepare  id = " + bLiveEffect.f44359id + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: Q */
    public static void m205210Q(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        gkh0.m126627j("[live][gift]trays", "can not find giftItem and request gift " + bLiveGivenGiftBrief.f44385id + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: R */
    public static void m205211R(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "start play video = " + bLiveEffect.f44359id + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: S */
    public static void m205212S(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        gkh0.m126627j("[live][gift]face", "prepare to add face gift. resId = " + bLiveGiftItem.liveResourceId + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: T */
    public static void m205213T(GiftTrayData giftTrayData, LiveGiftTraysPresenter.TrayType trayType) {
        gkh0.m126627j("[live][gift]trays", "ready to play tray anim. giftId =  " + giftTrayData.f50099e + " giftLevel " + giftTrayData.f50098d + " trayType = " + trayType.name());
    }

    /* JADX INFO: renamed from: U */
    public static void m205214U(BLiveEnterRoom bLiveEnterRoom) {
        gkh0.m126627j("[gift]enterRoom", "Receive Enter Room  uid:" + bLiveEnterRoom.uid + " enterRoomEffectId: " + bLiveEnterRoom.enterRoomEffectId);
    }

    /* JADX INFO: renamed from: V */
    public static void m205215V(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        gkh0.m126627j("[live][gift]face", "prepare to add face gift. resId = " + bLiveGiftItem.liveResourceId + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: X */
    public static void m205217X(String str) {
        gkh0.m126627j("[live][gift]send", "giftId = " + str);
    }

    /* JADX INFO: renamed from: Y */
    public static void m205218Y(String str) {
        gkh0.m126627j("[live][gift]send", "send gift can not target gift. giftId = " + str);
    }

    /* JADX INFO: renamed from: Z */
    public static void m205219Z(BLiveGiftItem bLiveGiftItem, Throwable th) {
        gkh0.m126627j("[live][gift]send", "send gift failed . id = " + bLiveGiftItem.f44377id + "  failedCode = " + (th instanceof TantanException.Client.CoreService ? ((TantanException.Client.CoreService) th).code : 404));
    }

    /* JADX INFO: renamed from: a */
    public static void m205220a(GiftTrayData giftTrayData) {
        gkh0.m126627j("[live][gift]trays", "add gift to live gift list. id =  " + giftTrayData.f50099e + " gift level = " + giftTrayData.f50098d);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m205221a0(BLiveGiftItem bLiveGiftItem) {
        gkh0.m126627j("[live][gift]send", "send gift intercept by Confess Gift. Gift id = " + bLiveGiftItem.f44377id);
    }

    /* JADX INFO: renamed from: b */
    public static void m205222b(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        gkh0.m126627j("[live][gift]face", "prepare to add face gift. resId = " + bLiveGiftItem.liveResourceId + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: b0 */
    public static void m205223b0(BLiveGiftItem bLiveGiftItem, String str) {
        gkh0.m126627j("[live][gift]send", "send gift intercept by Confess Gift. Gift id = " + bLiveGiftItem.f44377id + "But failed, failed reason is " + str);
    }

    /* JADX INFO: renamed from: c */
    public static void m205224c(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "add special res = " + bLiveEffect.f44359id + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: c0 */
    public static void m205225c0(BLiveGiftItem bLiveGiftItem) {
        gkh0.m126627j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.f44377id + "Gift type is namingCard.Dialog confirm button is clicked.");
    }

    /* JADX INFO: renamed from: d */
    public static void m205226d() {
        gkh0.m126627j("[live][gift]face", "can not find face gift and pollCDNGiftItems");
    }

    /* JADX INFO: renamed from: d0 */
    public static void m205227d0(BLiveGiftItem bLiveGiftItem, String str) {
        gkh0.m126627j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.f44377id + "Gift type is " + str);
    }

    /* JADX INFO: renamed from: e */
    public static void m205228e() {
        gkh0.m126627j("[live][gift]face", "check face gift map when receive gift bs");
    }

    /* JADX INFO: renamed from: e0 */
    public static void m205229e0(BLiveGiftItem bLiveGiftItem, String str, String str2) {
        gkh0.m126627j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.f44377id + "Gift type is " + str + "reason is " + str2);
    }

    /* JADX INFO: renamed from: f */
    public static void m205230f(BLiveGiftItem bLiveGiftItem) {
        String str;
        if (bLiveGiftItem == null) {
            str = "gift item is null --> interrupt";
        } else {
            str = "gift id is empty. id = " + bLiveGiftItem.f44377id;
        }
        gkh0.m126627j("[live][gift]face", str);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m205231f0(BLiveGiftItem bLiveGiftItem) {
        gkh0.m126627j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.f44377id + "Gift type is unJailCard.Dialog confirm button is clicked.");
    }

    /* JADX INFO: renamed from: g */
    public static void m205232g(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        gkh0.m126627j("[live][gift]trays", "down load effect res. giftId =  " + giftTrayData.f50099e + "  effect type = " + bLiveEffect.type);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m205233g0(BLiveGiftItem bLiveGiftItem, String str, String str2) {
        gkh0.m126627j("[live][gift]send", "send gift intercept by Packet Gift. Gift id = " + bLiveGiftItem.f44377id + "Gift type is " + str + "Dialog is show, " + str2);
    }

    /* JADX INFO: renamed from: h */
    public static void m205234h(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        gkh0.m126627j("[live][gift]trays", "down load effect res failed. giftId =  " + giftTrayData.f50099e + "  effect type = " + bLiveEffect.type);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m205235h0(BLiveGiftItem bLiveGiftItem) {
        gkh0.m126627j("[live][gift]send", "send gift start. id = " + bLiveGiftItem.f44377id);
    }

    /* JADX INFO: renamed from: i */
    public static void m205236i(GiftTrayData giftTrayData, BLiveEffect bLiveEffect) {
        gkh0.m126627j("[live][gift]trays", "down load effect res success . giftId =  " + giftTrayData.f50099e + "  effect type = " + bLiveEffect.type);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m205237i0(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        gkh0.m126627j("[live][gift]send", "send gift success . id = " + bLiveGiftItem.f44377id + " comboId = " + bLiveGivenGiftBrief.comboId + "combo = " + bLiveGivenGiftBrief.combos + " giftSrouce = " + bLiveGivenGiftBrief.giftSource + " sendGiftExtraInfo =  " + bLiveGivenGiftBrief.getSendGiftExtraInfo() + " giftLevel = " + bLiveGiftItem.giftLevel);
    }

    /* JADX INFO: renamed from: j */
    public static void m205238j(BLiveGiftItem bLiveGiftItem) {
        gkh0.m126627j("[live][gift]face", "face gift res download failed. resId = " + bLiveGiftItem.liveResourceId);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m205239j0(String str) {
        gkh0.m126627j("[live][gift]send", "send gift intercept; Gift id is " + str + ". GiftInterceptorWrapperData will be add to giftExtraInfo");
    }

    /* JADX INFO: renamed from: k */
    public static void m205240k(BLiveGiftItem bLiveGiftItem) {
        gkh0.m126627j("[live][gift]face", "face gift res download success. resId = " + bLiveGiftItem.liveResourceId);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m205241k0(BLiveEffect bLiveEffect, GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "play video call start method" + bLiveEffect.f44359id + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: l */
    public static void m205242l(String str, GiftTrayData giftTrayData) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" gift res liveResourceId is empty. giftId =  ");
        sb.append(giftTrayData == null ? " null" : Integer.valueOf(giftTrayData.f50099e));
        gkh0.m126627j("[live]gift_play", sb.toString());
    }

    /* JADX INFO: renamed from: l0 */
    public static void m205243l0(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        gkh0.m126627j("[live][gift]trays", "can not find giftItem,and brief pollFromNetwork true . id = " + bLiveGivenGiftBrief.f44385id + " sendGiftExtraInfo = " + bLiveGivenGiftBrief.getSendGiftExtraInfo());
    }

    /* JADX INFO: renamed from: m */
    public static void m205244m(String str, int i) {
        gkh0.m126627j("[live][gift]resource", "svga resource not exist, effectId = " + str + " from = " + i);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m205245m0(GiftTrayData giftTrayData) {
        gkh0.m126627j("[live][gift]trays", "try to start trays show anim  trayType =  " + giftTrayData.f50115u + " sendGiftExtraInfo =  " + giftTrayData.m74163l() + " gift id = " + giftTrayData.f50099e + "  giftLevel = " + giftTrayData.f50098d);
    }

    /* JADX INFO: renamed from: n */
    public static void m205246n(BLiveEnterRoom bLiveEnterRoom) {
        gkh0.m126627j("[gift]enterRoom", "Play Enter Room  uid:" + bLiveEnterRoom.uid + "  isWealthHierarchy:" + bLiveEnterRoom.isWealthHierarchy + " enterRoomEffectId: " + bLiveEnterRoom.enterRoomEffectId);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m205247n0(boolean z, String str) {
        gkh0.m126627j("[gift]EffectManager", (z ? " unzip success." : "unzip failed.") + "effectId = " + str);
    }

    /* JADX INFO: renamed from: o */
    public static void m205248o(String str) {
        gkh0.m126627j("[live][gift]face", "can not find face gift effect message = " + str);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m205249o0(String str) {
        gkh0.m126627j("[gift]EffectManager", "zip md5 check success. effectId = " + str);
    }

    /* JADX INFO: renamed from: p */
    public static void m205250p() {
        gkh0.m126627j("[live][gift]face", "onFaceGiftEffectNotFindRetry");
    }

    /* JADX INFO: renamed from: q */
    public static void m205251q(String str) {
        gkh0.m126627j("[live][gift]face", "can not find face gift and pollCDNGiftItems  message = " + str);
    }

    /* JADX INFO: renamed from: r */
    public static void m205252r() {
        gkh0.m126627j("[live][gift]face", "onFaceGiftItemNotFindRetry");
    }

    /* JADX INFO: renamed from: s */
    public static void m205253s(LiveMessage liveMessage) {
        gkh0.m126627j("[live][gift]", "gift message received, content = " + liveMessage.messageContent);
    }

    /* JADX INFO: renamed from: t */
    public static void m205254t(LiveMessage liveMessage) {
        if (liveMessage.isLuFinished) {
            return;
        }
        liveMessage.isLuFinished = true;
        gkh0.m126627j("[live][gift]", "gift message show, content = " + liveMessage.messageContent);
    }

    /* JADX INFO: renamed from: u */
    public static void m205255u(String str) {
        gkh0.m126627j("[gift]EffectManager", str);
    }

    /* JADX INFO: renamed from: v */
    public static void m205256v(GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "no effect anim when down grade. id = " + giftTrayData.f50099e + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: w */
    public static void m205257w(boolean z) {
        gkh0.m126627j("[live]gift_play", "poll room gift when longLink. roomLongLink = " + z);
    }

    /* JADX INFO: renamed from: x */
    public static void m205258x(GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "svga onFinish sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: y */
    public static void m205259y(BLiveEffect bLiveEffect, String str, GiftTrayData giftTrayData) {
        gkh0.m126627j("[gift]EffectManager", "svga load失败 id = " + bLiveEffect.f44359id + str + " sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: z */
    public static void m205260z(GiftTrayData giftTrayData) {
        gkh0.m126627j("[live]gift_play", "svga onStart sendGiftExtraInfo =  " + giftTrayData.m74163l());
    }

    /* JADX INFO: renamed from: W */
    public static void m205216W(String str, String str2, String str3, boolean z) {
    }
}
