package p149l;

import android.content.Context;
import android.media.AudioManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ld1 {

    /* JADX INFO: renamed from: b */
    private static ld1 f127489b;

    /* JADX INFO: renamed from: a */
    private final AudioManager f127490a;

    private ld1(Context context) {
        this.f127490a = (AudioManager) context.getSystemService(sgw.m184137a(new byte[]{81, 19, 85, 94, 14}));
    }

    /* JADX INFO: renamed from: c */
    public static synchronized ld1 m149375c(Context context) {
        try {
            if (f127489b == null) {
                f127489b = new ld1(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f127489b;
    }

    /* JADX INFO: renamed from: a */
    public int m149376a() {
        return this.f127490a.getStreamVolume(4);
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m149377b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(sgw.m184137a(new byte[]{70, 9, 88, 84, 4, 37, 81, 10, 93, 97, 14, 10, 69, 11, 84}), m149382h());
            jSONObject.put(sgw.m184137a(new byte[]{67, 31, 66, 67, 4, 11, 102, 9, 93, 66, 12, 3}), m149381g());
            jSONObject.put(sgw.m184137a(new byte[]{66, 15, 95, 80, 55, 9, 92, 19, 92, 82}), m149380f());
            jSONObject.put(sgw.m184137a(new byte[]{93, 19, 66, 94, 2, 48, 95, 10, 68, 90, 4}), m149378d());
            jSONObject.put(sgw.m184137a(new byte[]{81, 10, 80, 69, 12, 48, 95, 10, 68, 90, 4}), m149376a());
            jSONObject.put(sgw.m184137a(new byte[]{94, 9, 69, 94, 7, 15, 83, 7, 69, 94, 14, 8, 102, 9, 93, 66, 12, 3}), m149379e());
            return jSONObject;
        } catch (Exception e) {
            aag0.m95543a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m149378d() {
        return this.f127490a.getStreamVolume(3);
    }

    /* JADX INFO: renamed from: e */
    public int m149379e() {
        return this.f127490a.getStreamVolume(5);
    }

    /* JADX INFO: renamed from: f */
    public int m149380f() {
        return this.f127490a.getStreamVolume(2);
    }

    /* JADX INFO: renamed from: g */
    public int m149381g() {
        return this.f127490a.getStreamVolume(1);
    }

    /* JADX INFO: renamed from: h */
    public int m149382h() {
        return this.f127490a.getStreamVolume(0);
    }
}
