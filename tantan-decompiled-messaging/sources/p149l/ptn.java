package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes13.dex */
public class ptn {
    /* JADX INFO: renamed from: a */
    public static void m171361a() {
        gkh0.m126627j("IntlLiveAudioPermissionUtil", "releaseAudioInLiveWindow:");
        ib1.m135233b().mo135234a("international_living_window_business_key");
    }

    /* JADX INFO: renamed from: b */
    public static void m171362b() {
        gkh0.m126627j("IntlLiveAudioPermissionUtil", "releaseAudioInLivingRoom");
        ib1.m135233b().mo135234a("international_living_room_business_key");
    }

    /* JADX INFO: renamed from: c */
    public static void m171363c(String str, z91 z91Var) {
        AudioBusinessType audioBusinessType = AudioBusinessType.CHAT_ROOM_WINDOW;
        audioBusinessType.setBusinessMsg("voice".equals(str) ? hvc0.m133156c(R$string.f44176j) : hvc0.m133156c(R$string.f44173i));
        gkh0.m126627j("IntlLiveAudioPermissionUtil", "requestAudioInLivingRoom");
        ib1.m135233b().mo135238f("international_living_room_business_key", audioBusinessType, z91Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m171364d(boolean z, z91 z91Var) {
        gkh0.m126627j("IntlLiveAudioPermissionUtil", "updateLiveWindowAudioType:" + z);
        ib1.m135233b().mo135239g("international_living_window_business_key", z ? AudioBusinessType.CHAT_ROOM_WINDOW : AudioBusinessType.NORMAL, z91Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m171365e(z91 z91Var) {
        gkh0.m126627j("IntlLiveAudioPermissionUtil", "updateLivingRoomAudioType");
        ib1.m135233b().mo135239g("international_living_room_business_key", AudioBusinessType.CHAT_ROOM_WINDOW, z91Var);
    }

    /* JADX INFO: renamed from: l.ptn$a */
    public static class C19336a implements z91 {

        /* JADX INFO: renamed from: a */
        public d30 f151185a;

        /* JADX INFO: renamed from: b */
        public d30 f151186b;

        public C19336a(d30 d30Var, d30 d30Var2) {
            this.f151185a = d30Var;
            this.f151186b = d30Var2;
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            gkh0.m126627j("IntlLiveAudioPermissionUtil", "stop:" + audioBusinessType.name() + Constants.SEPARATOR_COMMA + str + Constants.SEPARATOR_COMMA + audioBusinessType2);
            d30 d30Var = this.f151185a;
            if (d30Var != null) {
                d30Var.call();
                this.f151185a = null;
            }
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: c */
        public void mo61467c(String str, AudioBusinessType audioBusinessType, String str2, z91 z91Var) {
            gkh0.m126627j("IntlLiveAudioPermissionUtil", "releaseFocus:" + str + Constants.SEPARATOR_COMMA + audioBusinessType.name());
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            gkh0.m126627j("IntlLiveAudioPermissionUtil", "conflictWith:" + str + Constants.SEPARATOR_COMMA + audioBusinessType.name() + Constants.SEPARATOR_COMMA + str2 + Constants.SEPARATOR_COMMA + audioBusinessType2.name());
            if (!audioBusinessType2.isHighLevelBusiness()) {
                d30 d30Var = this.f151186b;
                if (d30Var != null) {
                    d30Var.call();
                    this.f151186b = null;
                    return;
                }
                return;
            }
            String businessMsg = audioBusinessType2.getBusinessMsg();
            if (audioBusinessType2 == AudioBusinessType.PHONE) {
                businessMsg = hvc0.m133156c(R$string.f44170h);
            }
            lsi0.m151595y(businessMsg);
            d30 d30Var2 = this.f151185a;
            if (d30Var2 != null) {
                d30Var2.call();
                this.f151185a = null;
            }
        }

        @Override // p149l.z91
        public void success() {
            gkh0.m126627j("IntlLiveAudioPermissionUtil", "success");
            d30 d30Var = this.f151186b;
            if (d30Var != null) {
                d30Var.call();
                this.f151186b = null;
            }
        }

        public C19336a() {
        }
    }
}
