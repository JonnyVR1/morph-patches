package p149l;

import com.p046p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes13.dex */
public class kur {

    /* JADX INFO: renamed from: a */
    public static String f124707a = "LiveAudioPermissionUtil";

    /* JADX INFO: renamed from: b */
    public static String f124708b = "living_room_business_key";

    /* JADX INFO: renamed from: c */
    public static String f124709c = "living_window_business_key";

    /* JADX INFO: renamed from: d */
    public static String f124710d = "living_square_business_key";

    /* JADX INFO: renamed from: l.kur$a */
    public class C18085a extends jur {
    }

    /* JADX INFO: renamed from: a */
    public static void m147296a() {
        gkh0.m126627j(f124707a, "releaseAudioInLiveWindow:");
        ib1.m135233b().mo135234a(f124709c);
    }

    /* JADX INFO: renamed from: b */
    public static void m147297b() {
        if (vdt.m198092b(2)) {
            gkh0.m126627j(f124707a, "releaseAudioInLivingRoom");
            ib1.m135233b().mo135234a(f124708b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m147298c(boolean z, z91 z91Var) {
        gkh0.m126627j(f124707a, "requestAudioInLiveWindow:" + z);
        ib1.m135233b().mo135238f(f124709c, z ? AudioBusinessType.CHAT_ROOM_WINDOW : AudioBusinessType.NORMAL, z91Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m147299d() {
        if (vdt.m198092b(2)) {
            gkh0.m126627j(f124707a, "requestAudioInLivingRoom");
            ib1.m135233b().mo135238f(f124708b, AudioBusinessType.LIVE_IN_ROOM, new C18085a());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m147300e(z91 z91Var) {
        gkh0.m126627j(f124707a, "requestAudioInNormalLiveSquare:");
        ib1.m135233b().mo135238f(f124710d, AudioBusinessType.NORMAL, z91Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m147301f(z91 z91Var) {
        gkh0.m126627j(f124707a, "requestAudioInNormalLiveWindow:");
        ib1.m135233b().mo135238f(f124709c, AudioBusinessType.NORMAL, z91Var);
    }

    /* JADX INFO: renamed from: g */
    public static void m147302g(boolean z, z91 z91Var) {
        gkh0.m126627j(f124707a, "updateLiveWindowAudioType:" + z);
        ib1.m135233b().mo135239g(f124709c, z ? AudioBusinessType.CHAT_ROOM_WINDOW : AudioBusinessType.NORMAL, z91Var);
    }

    /* JADX INFO: renamed from: h */
    public static void m147303h(z91 z91Var) {
        gkh0.m126627j(f124707a, "updateNormalLivingWindowAudioType:");
        ib1.m135233b().mo135239g(f124709c, AudioBusinessType.NORMAL, z91Var);
    }
}
