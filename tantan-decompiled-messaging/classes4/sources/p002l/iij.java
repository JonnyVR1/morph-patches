package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import l.gkh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iij {
    /* JADX INFO: renamed from: a */
    public static void m15179a() {
        gkh0.j("[live]game_gift_play", " onBindGameView ");
    }

    /* JADX INFO: renamed from: b */
    public static void m15180b(String str) {
        gkh0.j("[live]game_gift_play", " onDismissTrayOfGame = " + str);
    }

    /* JADX INFO: renamed from: c */
    public static void m15181c(String str) {
        gkh0.j("[live]game_gift_play", " onGameError error message = " + str);
    }

    /* JADX INFO: renamed from: d */
    public static void m15182d(GiftTrayData giftTrayData) {
        gkh0.j("[live]game_gift_play", " onGamePlayEnd = " + giftTrayData.f6161y + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: e */
    public static void m15183e(GiftTrayData giftTrayData) {
        gkh0.j("[live]game_gift_play", " onGamePlayStart = " + giftTrayData.f6161y + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: f */
    public static void m15184f(String str) {
        gkh0.j("[live]game_gift_play", " onGameViewRemove  from = " + str);
    }

    /* JADX INFO: renamed from: g */
    public static void m15185g() {
        gkh0.j("[live]game_gift_play", " onRemoveRunnableRunning ");
    }

    /* JADX INFO: renamed from: h */
    public static void m15186h() {
        gkh0.j("[live]game_gift_play", " onStartDelayRemoveRunnable ");
    }

    /* JADX INFO: renamed from: i */
    public static void m15187i(GiftTrayData giftTrayData) {
        gkh0.j("[live]game_gift_play", " playGameEffect = " + giftTrayData.f6161y + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: j */
    public static void m15188j(GiftTrayData giftTrayData) {
        gkh0.j("[live]game_gift_play", "playGameEffectComplete play game complete. id = " + giftTrayData.f6161y + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: k */
    public static void m15189k(String str, GiftTrayData giftTrayData) {
        gkh0.j("[live]game_gift_play", "playGameEffectError gift game player error = " + str + " sendGiftExtraInfo =  " + giftTrayData.m7728l());
    }

    /* JADX INFO: renamed from: l */
    public static void m15190l(String str) {
        gkh0.j("[live]game_gift_play", " reportScore = " + str);
    }

    /* JADX INFO: renamed from: m */
    public static void m15191m() {
        gkh0.j("[live]game_gift_play", "startPlayGameEffect start play game ");
    }

    /* JADX INFO: renamed from: n */
    public static void m15192n(String str) {
        gkh0.j("[live]game_gift_play", " stopEngineGame  from = " + str);
    }

    /* JADX INFO: renamed from: o */
    public static void m15193o(String str) {
        gkh0.j("[live]game_gift_play", "traceGameEngineLog play game === " + str);
    }
}
