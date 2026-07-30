package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class ks2 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public String f124411j;

    /* JADX INFO: renamed from: k */
    public String f124412k;

    /* JADX INFO: renamed from: l */
    public f30<Integer, Object> f124413l;

    /* JADX INFO: renamed from: m */
    public String f124414m;

    /* JADX INFO: renamed from: n */
    public boolean f124415n;

    public ks2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, f30<Integer, Object> f30Var) {
        super(str2, str3, str4);
        this.f47788d = str5;
        this.f47790f = str6;
        this.f47791g = str7;
        this.f47792h = str8;
        this.f124413l = f30Var;
        this.f124414m = str;
        this.f124415n = z;
        this.f47793i = str9;
        this.f124411j = str10;
        this.f124412k = str11;
    }

    /* JADX INFO: renamed from: b */
    public static String m147035b(int i) {
        if (i == 1) {
            return "update_volume";
        }
        if (i == 2) {
            return "request_rtc_token";
        }
        if (i != 3) {
            return i != 4 ? "" : "push failed";
        }
        return "sdk self add";
    }

    public String toString() {
        return "BaseVoiceMotionParams{, action2=" + this.f124413l + ", rtcProvider='" + this.f47788d + "', isOnVoice=" + this.f124415n + ", roomId='" + this.f47785a + "', provider='" + this.f47786b + "', businessType='" + this.f47787c + "', rtcProvider='" + this.f47788d + "'}";
    }
}
