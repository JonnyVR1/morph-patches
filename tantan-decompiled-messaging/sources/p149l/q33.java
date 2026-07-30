package p149l;

import android.os.Debug;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class q33 extends efi0 {

    /* JADX INFO: renamed from: e */
    public C19419a f152358e;

    /* JADX INFO: renamed from: f */
    public int f152359f;

    /* JADX INFO: renamed from: g */
    public String f152360g;

    /* JADX INFO: renamed from: h */
    public String f152361h;

    /* JADX INFO: renamed from: i */
    public String f152362i;

    /* JADX INFO: renamed from: j */
    public String f152363j;

    /* JADX INFO: renamed from: l.q33$a */
    public class C19419a {

        /* JADX INFO: renamed from: a */
        public int f152364a;

        /* JADX INFO: renamed from: b */
        public int f152365b;

        /* JADX INFO: renamed from: c */
        public int f152366c;

        /* JADX INFO: renamed from: d */
        public int f152367d;

        public C19419a(int i, int i2, int i3, int i4) {
            this.f152364a = i;
            this.f152365b = i2;
            this.f152366c = i3;
            this.f152367d = i4;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m172738a() throws JSONException {
            return new JSONObject().put("dalvikPss", this.f152364a).put("nativePss", this.f152365b).put("otherPss", this.f152366c).put("totalPss", this.f152367d);
        }

        /* JADX INFO: renamed from: b */
        public String m172739b() {
            try {
                return m172738a().toString();
            } catch (JSONException unused) {
                return "";
            }
        }
    }

    public q33(String str, String str2, String str3, int i, String str4) {
        this.f152360g = str;
        this.f152361h = str2;
        this.f152362i = str3;
        this.f152359f = i;
        this.f152363j = str4;
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        this.f152358e = new C19419a(memoryInfo.dalvikPss, memoryInfo.nativePss, memoryInfo.otherPss, memoryInfo.getTotalPss());
    }

    /* JADX INFO: renamed from: b */
    public String m172734b() {
        return this.f152362i;
    }

    /* JADX INFO: renamed from: c */
    public String m172735c() {
        return this.f152358e.m172739b();
    }

    /* JADX INFO: renamed from: d */
    public String m172736d() {
        return this.f152361h;
    }

    /* JADX INFO: renamed from: e */
    public String m172737e() {
        return this.f152363j;
    }
}
