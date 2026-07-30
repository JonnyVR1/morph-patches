package p149l;

import com.clevertap.android.sdk.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;

/* JADX INFO: loaded from: classes13.dex */
public class orb implements uei0 {

    /* JADX INFO: renamed from: a */
    public long f145246a = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;

    /* JADX INFO: renamed from: b */
    public long f145247b = 10000;

    /* JADX INFO: renamed from: c */
    public int f145248c = 40;

    /* JADX INFO: renamed from: d */
    public long f145249d = 10000;

    /* JADX INFO: renamed from: e */
    public long f145250e = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;

    /* JADX INFO: renamed from: f */
    public int f145251f = 10;

    /* JADX INFO: renamed from: g */
    public boolean f145252g = true;

    /* JADX INFO: renamed from: h */
    public boolean f145253h = false;

    /* JADX INFO: renamed from: l.orb$a */
    public static class C19005a {

        /* JADX INFO: renamed from: a */
        public orb f145254a = new orb();

        /* JADX INFO: renamed from: a */
        public orb m165540a() {
            return this.f145254a;
        }

        /* JADX INFO: renamed from: b */
        public C19005a m165541b(boolean z) {
            this.f145254a.f145252g = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C19005a m165542c(long j) {
            this.f145254a.f145246a = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C19005a m165543d(int i) {
            this.f145254a.f145251f = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C19005a m165544e(long j) {
            this.f145254a.f145250e = j;
            return this;
        }
    }

    @Override // p149l.uei0
    /* JADX INFO: renamed from: a */
    public boolean mo157365a() {
        return this.f145253h;
    }

    @Override // p149l.uei0
    /* JADX INFO: renamed from: b */
    public boolean mo157366b() {
        return this.f145252g;
    }

    /* JADX INFO: renamed from: g */
    public long m165534g() {
        return this.f145246a;
    }

    /* JADX INFO: renamed from: h */
    public int m165535h() {
        return this.f145248c;
    }

    /* JADX INFO: renamed from: i */
    public long m165536i() {
        return this.f145247b;
    }

    /* JADX INFO: renamed from: j */
    public long m165537j() {
        return this.f145249d;
    }

    /* JADX INFO: renamed from: k */
    public int m165538k() {
        return this.f145251f;
    }

    /* JADX INFO: renamed from: l */
    public long m165539l() {
        return this.f145250e;
    }
}
