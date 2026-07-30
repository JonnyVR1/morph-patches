package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ks2 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public String f14489j;

    /* JADX INFO: renamed from: k */
    public String f14490k;

    /* JADX INFO: renamed from: l */
    public f30<Integer, Object> f14491l;

    /* JADX INFO: renamed from: m */
    public String f14492m;

    /* JADX INFO: renamed from: n */
    public boolean f14493n;

    public ks2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, f30<Integer, Object> f30Var) {
        super(str2, str3, str4);
        this.f3830d = str5;
        this.f3832f = str6;
        this.f3833g = str7;
        this.f3834h = str8;
        this.f14491l = f30Var;
        this.f14492m = str;
        this.f14493n = z;
        this.f3835i = str9;
        this.f14489j = str10;
        this.f14490k = str11;
    }

    /* JADX INFO: renamed from: b */
    public static String m16772b(int i) {
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
        return "BaseVoiceMotionParams{, action2=" + this.f14491l + ", rtcProvider='" + this.f3830d + "', isOnVoice=" + this.f14493n + ", roomId='" + this.f3827a + "', provider='" + this.f3828b + "', businessType='" + this.f3829c + "', rtcProvider='" + this.f3830d + "'}";
    }
}
