package p153l;

import android.os.Debug;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class g43 extends eoi0 {

    /* JADX INFO: renamed from: e */
    public C17147a f102119e;

    /* JADX INFO: renamed from: f */
    public int f102120f;

    /* JADX INFO: renamed from: g */
    public String f102121g;

    /* JADX INFO: renamed from: h */
    public String f102122h;

    /* JADX INFO: renamed from: i */
    public String f102123i;

    /* JADX INFO: renamed from: j */
    public String f102124j;

    /* JADX INFO: renamed from: l.g43$a */
    public class C17147a {

        /* JADX INFO: renamed from: a */
        public int f102125a;

        /* JADX INFO: renamed from: b */
        public int f102126b;

        /* JADX INFO: renamed from: c */
        public int f102127c;

        /* JADX INFO: renamed from: d */
        public int f102128d;

        public C17147a(int i, int i2, int i3, int i4) {
            this.f102125a = i;
            this.f102126b = i2;
            this.f102127c = i3;
            this.f102128d = i4;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m128856a() throws JSONException {
            return new JSONObject().put("dalvikPss", this.f102125a).put("nativePss", this.f102126b).put("otherPss", this.f102127c).put("totalPss", this.f102128d);
        }

        /* JADX INFO: renamed from: b */
        public String m128857b() {
            try {
                return m128856a().toString();
            } catch (JSONException unused) {
                return "";
            }
        }
    }

    public g43(String str, String str2, String str3, int i, String str4) {
        this.f102121g = str;
        this.f102122h = str2;
        this.f102123i = str3;
        this.f102120f = i;
        this.f102124j = str4;
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        this.f102119e = new C17147a(memoryInfo.dalvikPss, memoryInfo.nativePss, memoryInfo.otherPss, memoryInfo.getTotalPss());
    }

    /* JADX INFO: renamed from: b */
    public String m128852b() {
        return this.f102123i;
    }

    /* JADX INFO: renamed from: c */
    public String m128853c() {
        return this.f102119e.m128857b();
    }

    /* JADX INFO: renamed from: d */
    public String m128854d() {
        return this.f102122h;
    }

    /* JADX INFO: renamed from: e */
    public String m128855e() {
        return this.f102124j;
    }
}
