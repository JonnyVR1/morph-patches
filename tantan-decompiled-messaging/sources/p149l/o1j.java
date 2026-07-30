package p149l;

import com.p046p1.mobile.putong.data.BannerFrequencyType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class o1j extends efi0 {

    /* JADX INFO: renamed from: e */
    public String f141438e;

    /* JADX INFO: renamed from: f */
    public long f141439f;

    /* JADX INFO: renamed from: g */
    public long f141440g;

    /* JADX INFO: renamed from: h */
    public C18815a f141441h;

    /* JADX INFO: renamed from: i */
    public C18815a f141442i;

    /* JADX INFO: renamed from: j */
    public C18815a f141443j;

    /* JADX INFO: renamed from: l.o1j$a */
    public class C18815a {

        /* JADX INFO: renamed from: a */
        public int f141444a;

        /* JADX INFO: renamed from: b */
        public int f141445b;

        public C18815a(int i, int i2) {
            this.f141444a = i;
            this.f141445b = i2;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m162253a() throws JSONException {
            return new JSONObject().put("count", this.f141444a).put(BannerFrequencyType.sum, this.f141445b);
        }

        /* JADX INFO: renamed from: b */
        public String m162254b() {
            try {
                return m162253a().toString();
            } catch (JSONException unused) {
                return "";
            }
        }
    }

    public o1j(String str, long j, long j2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f141438e = str;
        this.f141439f = j;
        this.f141440g = j2;
        this.f141441h = new C18815a(i, i2);
        this.f141442i = new C18815a(i3, i4);
        this.f141443j = new C18815a(i5, i6);
    }

    public String toString() {
        return " scene:" + this.f141438e + " startTime:" + this.f141439f + " endTime:" + this.f141440g + " mFrozen:" + this.f141441h.m162254b() + " mHigh:" + this.f141442i.m162254b() + " mMiddle:" + this.f141443j.m162254b();
    }
}
