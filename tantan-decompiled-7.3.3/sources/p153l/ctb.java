package p153l;

import com.clevertap.android.sdk.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;

/* JADX INFO: loaded from: classes11.dex */
public class ctb implements uni0 {

    /* JADX INFO: renamed from: a */
    public long f83677a = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;

    /* JADX INFO: renamed from: b */
    public long f83678b = 10000;

    /* JADX INFO: renamed from: c */
    public int f83679c = 40;

    /* JADX INFO: renamed from: d */
    public long f83680d = 10000;

    /* JADX INFO: renamed from: e */
    public long f83681e = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;

    /* JADX INFO: renamed from: f */
    public int f83682f = 10;

    /* JADX INFO: renamed from: g */
    public boolean f83683g = true;

    /* JADX INFO: renamed from: h */
    public boolean f83684h = false;

    /* JADX INFO: renamed from: l.ctb$a */
    public static class C16358a {

        /* JADX INFO: renamed from: a */
        public ctb f83685a = new ctb();

        /* JADX INFO: renamed from: a */
        public ctb m112459a() {
            return this.f83685a;
        }

        /* JADX INFO: renamed from: b */
        public C16358a m112460b(boolean z) {
            this.f83685a.f83683g = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16358a m112461c(long j) {
            this.f83685a.f83677a = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16358a m112462d(int i) {
            this.f83685a.f83682f = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C16358a m112463e(long j) {
            this.f83685a.f83681e = j;
            return this;
        }
    }

    @Override // p153l.uni0
    /* JADX INFO: renamed from: a */
    public boolean mo112451a() {
        return this.f83684h;
    }

    @Override // p153l.uni0
    /* JADX INFO: renamed from: b */
    public boolean mo112452b() {
        return this.f83683g;
    }

    /* JADX INFO: renamed from: g */
    public long m112453g() {
        return this.f83677a;
    }

    /* JADX INFO: renamed from: h */
    public int m112454h() {
        return this.f83679c;
    }

    /* JADX INFO: renamed from: i */
    public long m112455i() {
        return this.f83678b;
    }

    /* JADX INFO: renamed from: j */
    public long m112456j() {
        return this.f83680d;
    }

    /* JADX INFO: renamed from: k */
    public int m112457k() {
        return this.f83682f;
    }

    /* JADX INFO: renamed from: l */
    public long m112458l() {
        return this.f83681e;
    }
}
