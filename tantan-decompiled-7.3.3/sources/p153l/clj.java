package p153l;

import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;

/* JADX INFO: loaded from: classes4.dex */
public class clj {
    /* JADX INFO: renamed from: a */
    public static void m110622a() {
        nsh0.m164608j("[live]game_gift_play", " onBindGameView ");
    }

    /* JADX INFO: renamed from: b */
    public static void m110623b(String str) {
        nsh0.m164608j("[live]game_gift_play", " onDismissTrayOfGame = " + str);
    }

    /* JADX INFO: renamed from: c */
    public static void m110624c(String str) {
        nsh0.m164608j("[live]game_gift_play", " onGameError error message = " + str);
    }

    /* JADX INFO: renamed from: d */
    public static void m110625d(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]game_gift_play", " onGamePlayEnd = " + giftTrayData.f50967y + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: e */
    public static void m110626e(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]game_gift_play", " onGamePlayStart = " + giftTrayData.f50967y + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: f */
    public static void m110627f(String str) {
        nsh0.m164608j("[live]game_gift_play", " onGameViewRemove  from = " + str);
    }

    /* JADX INFO: renamed from: g */
    public static void m110628g() {
        nsh0.m164608j("[live]game_gift_play", " onRemoveRunnableRunning ");
    }

    /* JADX INFO: renamed from: h */
    public static void m110629h() {
        nsh0.m164608j("[live]game_gift_play", " onStartDelayRemoveRunnable ");
    }

    /* JADX INFO: renamed from: i */
    public static void m110630i(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]game_gift_play", " playGameEffect = " + giftTrayData.f50967y + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: j */
    public static void m110631j(GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]game_gift_play", "playGameEffectComplete play game complete. id = " + giftTrayData.f50967y + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: k */
    public static void m110632k(String str, GiftTrayData giftTrayData) {
        nsh0.m164608j("[live]game_gift_play", "playGameEffectError gift game player error = " + str + " sendGiftExtraInfo =  " + giftTrayData.m75346l());
    }

    /* JADX INFO: renamed from: l */
    public static void m110633l(String str) {
        nsh0.m164608j("[live]game_gift_play", " reportScore = " + str);
    }

    /* JADX INFO: renamed from: m */
    public static void m110634m() {
        nsh0.m164608j("[live]game_gift_play", "startPlayGameEffect start play game ");
    }

    /* JADX INFO: renamed from: n */
    public static void m110635n(String str) {
        nsh0.m164608j("[live]game_gift_play", " stopEngineGame  from = " + str);
    }

    /* JADX INFO: renamed from: o */
    public static void m110636o(String str) {
        nsh0.m164608j("[live]game_gift_play", "traceGameEngineLog play game === " + str);
    }
}
