package p153l;

import com.p051p1.mobile.putong.data.BannerFrequencyType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class j4j extends eoi0 {

    /* JADX INFO: renamed from: e */
    public String f118296e;

    /* JADX INFO: renamed from: f */
    public long f118297f;

    /* JADX INFO: renamed from: g */
    public long f118298g;

    /* JADX INFO: renamed from: h */
    public C17874a f118299h;

    /* JADX INFO: renamed from: i */
    public C17874a f118300i;

    /* JADX INFO: renamed from: j */
    public C17874a f118301j;

    /* JADX INFO: renamed from: l.j4j$a */
    public class C17874a {

        /* JADX INFO: renamed from: a */
        public int f118302a;

        /* JADX INFO: renamed from: b */
        public int f118303b;

        public C17874a(int i, int i2) {
            this.f118302a = i;
            this.f118303b = i2;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m143426a() throws JSONException {
            return new JSONObject().put("count", this.f118302a).put(BannerFrequencyType.sum, this.f118303b);
        }

        /* JADX INFO: renamed from: b */
        public String m143427b() {
            try {
                return m143426a().toString();
            } catch (JSONException unused) {
                return "";
            }
        }
    }

    public j4j(String str, long j, long j2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f118296e = str;
        this.f118297f = j;
        this.f118298g = j2;
        this.f118299h = new C17874a(i, i2);
        this.f118300i = new C17874a(i3, i4);
        this.f118301j = new C17874a(i5, i6);
    }

    public String toString() {
        return " scene:" + this.f118296e + " startTime:" + this.f118297f + " endTime:" + this.f118298g + " mFrozen:" + this.f118299h.m143427b() + " mHigh:" + this.f118300i.m143427b() + " mMiddle:" + this.f118301j.m143427b();
    }
}
