package p153l;

import com.clevertap.android.sdk.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;

/* JADX INFO: loaded from: classes11.dex */
public class rpy implements uni0 {

    /* JADX INFO: renamed from: a */
    public boolean f164406a = true;

    /* JADX INFO: renamed from: b */
    public boolean f164407b = false;

    /* JADX INFO: renamed from: c */
    public long f164408c = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;

    /* JADX INFO: renamed from: d */
    public long f164409d = 10000;

    /* JADX INFO: renamed from: e */
    public long f164410e = 10000;

    /* JADX INFO: renamed from: f */
    public long f164411f = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;

    /* JADX INFO: renamed from: g */
    public int f164412g = 10;

    /* JADX INFO: renamed from: l.rpy$a */
    public static class C19896a {

        /* JADX INFO: renamed from: a */
        public rpy f164413a = new rpy();

        /* JADX INFO: renamed from: a */
        public rpy m182565a() {
            return this.f164413a;
        }

        /* JADX INFO: renamed from: b */
        public C19896a m182566b(boolean z) {
            this.f164413a.f164406a = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C19896a m182567c(long j) {
            this.f164413a.f164408c = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C19896a m182568d(int i) {
            this.f164413a.f164412g = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C19896a m182569e(long j) {
            this.f164413a.f164411f = j;
            return this;
        }
    }

    @Override // p153l.uni0
    /* JADX INFO: renamed from: a */
    public boolean mo112451a() {
        return this.f164407b;
    }

    @Override // p153l.uni0
    /* JADX INFO: renamed from: b */
    public boolean mo112452b() {
        return this.f164406a;
    }

    /* JADX INFO: renamed from: g */
    public long m182560g() {
        return this.f164408c;
    }

    /* JADX INFO: renamed from: h */
    public long m182561h() {
        return this.f164409d;
    }

    /* JADX INFO: renamed from: i */
    public long m182562i() {
        return this.f164410e;
    }

    /* JADX INFO: renamed from: j */
    public int m182563j() {
        return this.f164412g;
    }

    /* JADX INFO: renamed from: k */
    public long m182564k() {
        return this.f164411f;
    }
}
