package p153l;

import android.content.Context;
import android.media.AudioManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class sd1 {

    /* JADX INFO: renamed from: b */
    private static sd1 f167368b;

    /* JADX INFO: renamed from: a */
    private final AudioManager f167369a;

    private sd1(Context context) {
        this.f167369a = (AudioManager) context.getSystemService(riw.m181611a(new byte[]{81, 19, 85, 94, 14}));
    }

    /* JADX INFO: renamed from: c */
    public static synchronized sd1 m185415c(Context context) {
        try {
            if (f167368b == null) {
                f167368b = new sd1(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f167368b;
    }

    /* JADX INFO: renamed from: a */
    public int m185416a() {
        return this.f167369a.getStreamVolume(4);
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m185417b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(riw.m181611a(new byte[]{70, 9, 88, 84, 4, 37, 81, 10, 93, 97, 14, 10, 69, 11, 84}), m185422h());
            jSONObject.put(riw.m181611a(new byte[]{67, 31, 66, 67, 4, 11, 102, 9, 93, 66, 12, 3}), m185421g());
            jSONObject.put(riw.m181611a(new byte[]{66, 15, 95, 80, 55, 9, 92, 19, 92, 82}), m185420f());
            jSONObject.put(riw.m181611a(new byte[]{93, 19, 66, 94, 2, 48, 95, 10, 68, 90, 4}), m185418d());
            jSONObject.put(riw.m181611a(new byte[]{81, 10, 80, 69, 12, 48, 95, 10, 68, 90, 4}), m185416a());
            jSONObject.put(riw.m181611a(new byte[]{94, 9, 69, 94, 7, 15, 83, 7, 69, 94, 14, 8, 102, 9, 93, 66, 12, 3}), m185419e());
            return jSONObject;
        } catch (Exception e) {
            iig0.m140070a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m185418d() {
        return this.f167369a.getStreamVolume(3);
    }

    /* JADX INFO: renamed from: e */
    public int m185419e() {
        return this.f167369a.getStreamVolume(5);
    }

    /* JADX INFO: renamed from: f */
    public int m185420f() {
        return this.f167369a.getStreamVolume(2);
    }

    /* JADX INFO: renamed from: g */
    public int m185421g() {
        return this.f167369a.getStreamVolume(1);
    }

    /* JADX INFO: renamed from: h */
    public int m185422h() {
        return this.f167369a.getStreamVolume(0);
    }
}
