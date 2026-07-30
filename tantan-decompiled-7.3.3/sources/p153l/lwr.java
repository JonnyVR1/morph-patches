package p153l;

import com.p051p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes13.dex */
public class lwr {

    /* JADX INFO: renamed from: a */
    public static String f133853a = "LiveAudioPermissionUtil";

    /* JADX INFO: renamed from: b */
    public static String f133854b = "living_room_business_key";

    /* JADX INFO: renamed from: c */
    public static String f133855c = "living_window_business_key";

    /* JADX INFO: renamed from: d */
    public static String f133856d = "living_square_business_key";

    /* JADX INFO: renamed from: l.lwr$a */
    public class C18476a extends kwr {
    }

    /* JADX INFO: renamed from: a */
    public static void m156093a() {
        nsh0.m164608j(f133853a, "releaseAudioInLiveWindow:");
        pb1.m171472b().mo171473a(f133855c);
    }

    /* JADX INFO: renamed from: b */
    public static void m156094b() {
        if (wft.m206159b(2)) {
            nsh0.m164608j(f133853a, "releaseAudioInLivingRoom");
            pb1.m171472b().mo171473a(f133854b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m156095c(boolean z, ga1 ga1Var) {
        nsh0.m164608j(f133853a, "requestAudioInLiveWindow:" + z);
        pb1.m171472b().mo171477f(f133855c, z ? AudioBusinessType.CHAT_ROOM_WINDOW : AudioBusinessType.NORMAL, ga1Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m156096d() {
        if (wft.m206159b(2)) {
            nsh0.m164608j(f133853a, "requestAudioInLivingRoom");
            pb1.m171472b().mo171477f(f133854b, AudioBusinessType.LIVE_IN_ROOM, new C18476a());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m156097e(ga1 ga1Var) {
        nsh0.m164608j(f133853a, "requestAudioInNormalLiveSquare:");
        pb1.m171472b().mo171477f(f133856d, AudioBusinessType.NORMAL, ga1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m156098f(ga1 ga1Var) {
        nsh0.m164608j(f133853a, "requestAudioInNormalLiveWindow:");
        pb1.m171472b().mo171477f(f133855c, AudioBusinessType.NORMAL, ga1Var);
    }

    /* JADX INFO: renamed from: g */
    public static void m156099g(boolean z, ga1 ga1Var) {
        nsh0.m164608j(f133853a, "updateLiveWindowAudioType:" + z);
        pb1.m171472b().mo171478g(f133855c, z ? AudioBusinessType.CHAT_ROOM_WINDOW : AudioBusinessType.NORMAL, ga1Var);
    }

    /* JADX INFO: renamed from: h */
    public static void m156100h(ga1 ga1Var) {
        nsh0.m164608j(f133853a, "updateNormalLivingWindowAudioType:");
        pb1.m171472b().mo171478g(f133855c, AudioBusinessType.NORMAL, ga1Var);
    }
}
