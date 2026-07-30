package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes13.dex */
public class pvn {
    /* JADX INFO: renamed from: a */
    public static void m173966a() {
        nsh0.m164608j("IntlLiveAudioPermissionUtil", "releaseAudioInLiveWindow:");
        pb1.m171472b().mo171473a("international_living_window_business_key");
    }

    /* JADX INFO: renamed from: b */
    public static void m173967b() {
        nsh0.m164608j("IntlLiveAudioPermissionUtil", "releaseAudioInLivingRoom");
        pb1.m171472b().mo171473a("international_living_room_business_key");
    }

    /* JADX INFO: renamed from: c */
    public static void m173968c(String str, ga1 ga1Var) {
        AudioBusinessType audioBusinessType = AudioBusinessType.CHAT_ROOM_WINDOW;
        audioBusinessType.setBusinessMsg("voice".equals(str) ? k3d0.m148007c(R$string.f45024j) : k3d0.m148007c(R$string.f45021i));
        nsh0.m164608j("IntlLiveAudioPermissionUtil", "requestAudioInLivingRoom");
        pb1.m171472b().mo171477f("international_living_room_business_key", audioBusinessType, ga1Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m173969d(boolean z, ga1 ga1Var) {
        nsh0.m164608j("IntlLiveAudioPermissionUtil", "updateLiveWindowAudioType:" + z);
        pb1.m171472b().mo171478g("international_living_window_business_key", z ? AudioBusinessType.CHAT_ROOM_WINDOW : AudioBusinessType.NORMAL, ga1Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m173970e(ga1 ga1Var) {
        nsh0.m164608j("IntlLiveAudioPermissionUtil", "updateLivingRoomAudioType");
        pb1.m171472b().mo171478g("international_living_room_business_key", AudioBusinessType.CHAT_ROOM_WINDOW, ga1Var);
    }

    /* JADX INFO: renamed from: l.pvn$a */
    public static class C19456a implements ga1 {

        /* JADX INFO: renamed from: a */
        public x20 f154309a;

        /* JADX INFO: renamed from: b */
        public x20 f154310b;

        public C19456a(x20 x20Var, x20 x20Var2) {
            this.f154309a = x20Var;
            this.f154310b = x20Var2;
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            nsh0.m164608j("IntlLiveAudioPermissionUtil", "stop:" + audioBusinessType.name() + Constants.SEPARATOR_COMMA + str + Constants.SEPARATOR_COMMA + audioBusinessType2);
            x20 x20Var = this.f154309a;
            if (x20Var != null) {
                x20Var.call();
                this.f154309a = null;
            }
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: c */
        public void mo62651c(String str, AudioBusinessType audioBusinessType, String str2, ga1 ga1Var) {
            nsh0.m164608j("IntlLiveAudioPermissionUtil", "releaseFocus:" + str + Constants.SEPARATOR_COMMA + audioBusinessType.name());
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            nsh0.m164608j("IntlLiveAudioPermissionUtil", "conflictWith:" + str + Constants.SEPARATOR_COMMA + audioBusinessType.name() + Constants.SEPARATOR_COMMA + str2 + Constants.SEPARATOR_COMMA + audioBusinessType2.name());
            if (!audioBusinessType2.isHighLevelBusiness()) {
                x20 x20Var = this.f154310b;
                if (x20Var != null) {
                    x20Var.call();
                    this.f154310b = null;
                    return;
                }
                return;
            }
            String businessMsg = audioBusinessType2.getBusinessMsg();
            if (audioBusinessType2 == AudioBusinessType.PHONE) {
                businessMsg = k3d0.m148007c(R$string.f45018h);
            }
            o1j0.m165651y(businessMsg);
            x20 x20Var2 = this.f154309a;
            if (x20Var2 != null) {
                x20Var2.call();
                this.f154309a = null;
            }
        }

        @Override // p153l.ga1
        public void success() {
            nsh0.m164608j("IntlLiveAudioPermissionUtil", "success");
            x20 x20Var = this.f154310b;
            if (x20Var != null) {
                x20Var.call();
                this.f154310b = null;
            }
        }

        public C19456a() {
        }
    }
}
