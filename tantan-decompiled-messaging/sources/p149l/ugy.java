package p149l;

import com.clevertap.android.sdk.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;

/* JADX INFO: loaded from: classes13.dex */
public class ugy implements uei0 {

    /* JADX INFO: renamed from: a */
    public boolean f176461a = true;

    /* JADX INFO: renamed from: b */
    public boolean f176462b = false;

    /* JADX INFO: renamed from: c */
    public long f176463c = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;

    /* JADX INFO: renamed from: d */
    public long f176464d = 10000;

    /* JADX INFO: renamed from: e */
    public long f176465e = 10000;

    /* JADX INFO: renamed from: f */
    public long f176466f = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;

    /* JADX INFO: renamed from: g */
    public int f176467g = 10;

    /* JADX INFO: renamed from: l.ugy$a */
    public static class C20425a {

        /* JADX INFO: renamed from: a */
        public ugy f176468a = new ugy();

        /* JADX INFO: renamed from: a */
        public ugy m193600a() {
            return this.f176468a;
        }

        /* JADX INFO: renamed from: b */
        public C20425a m193601b(boolean z) {
            this.f176468a.f176461a = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C20425a m193602c(long j) {
            this.f176468a.f176463c = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20425a m193603d(int i) {
            this.f176468a.f176467g = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C20425a m193604e(long j) {
            this.f176468a.f176466f = j;
            return this;
        }
    }

    @Override // p149l.uei0
    /* JADX INFO: renamed from: a */
    public boolean mo157365a() {
        return this.f176462b;
    }

    @Override // p149l.uei0
    /* JADX INFO: renamed from: b */
    public boolean mo157366b() {
        return this.f176461a;
    }

    /* JADX INFO: renamed from: g */
    public long m193595g() {
        return this.f176463c;
    }

    /* JADX INFO: renamed from: h */
    public long m193596h() {
        return this.f176464d;
    }

    /* JADX INFO: renamed from: i */
    public long m193597i() {
        return this.f176465e;
    }

    /* JADX INFO: renamed from: j */
    public int m193598j() {
        return this.f176467g;
    }

    /* JADX INFO: renamed from: k */
    public long m193599k() {
        return this.f176466f;
    }
}
