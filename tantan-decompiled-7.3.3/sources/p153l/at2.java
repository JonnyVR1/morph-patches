package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class at2 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public String f73201j;

    /* JADX INFO: renamed from: k */
    public String f73202k;

    /* JADX INFO: renamed from: l */
    public z20<Integer, Object> f73203l;

    /* JADX INFO: renamed from: m */
    public String f73204m;

    /* JADX INFO: renamed from: n */
    public boolean f73205n;

    public at2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, z20<Integer, Object> z20Var) {
        super(str2, str3, str4);
        this.f48636d = str5;
        this.f48638f = str6;
        this.f48639g = str7;
        this.f48640h = str8;
        this.f73203l = z20Var;
        this.f73204m = str;
        this.f73205n = z;
        this.f48641i = str9;
        this.f73201j = str10;
        this.f73202k = str11;
    }

    /* JADX INFO: renamed from: b */
    public static String m100018b(int i) {
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
        return "BaseVoiceMotionParams{, action2=" + this.f73203l + ", rtcProvider='" + this.f48636d + "', isOnVoice=" + this.f73205n + ", roomId='" + this.f48633a + "', provider='" + this.f48634b + "', businessType='" + this.f48635c + "', rtcProvider='" + this.f48636d + "'}";
    }
}
