package p149l;

import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class qfi {

    /* JADX INFO: renamed from: a */
    public long f154123a;

    /* JADX INFO: renamed from: b */
    public long f154124b;

    /* JADX INFO: renamed from: c */
    public long f154125c;

    /* JADX INFO: renamed from: d */
    public long f154126d;

    /* JADX INFO: renamed from: e */
    public int f154127e;

    /* JADX INFO: renamed from: f */
    public List<String> f154128f;

    /* JADX INFO: renamed from: l.qfi$b */
    public static class C19484b {

        /* JADX INFO: renamed from: a */
        public qfi f154129a = new qfi();

        /* JADX INFO: renamed from: a */
        public qfi m174330a() {
            return this.f154129a;
        }

        /* JADX INFO: renamed from: b */
        public C19484b m174331b(List<String> list) {
            this.f154129a.f154128f = list;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C19484b m174332c(long j) {
            this.f154129a.f154124b = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C19484b m174333d(long j) {
            this.f154129a.f154123a = j;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C19484b m174334e(int i) {
            this.f154129a.f154127e = i;
            return this;
        }
    }

    public qfi() {
        this.f154123a = 51200L;
        this.f154124b = 52428800L;
        this.f154125c = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
        this.f154126d = 120000L;
        this.f154127e = 1;
        this.f154128f = new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    public List<String> m174324e() {
        return this.f154128f;
    }

    /* JADX INFO: renamed from: f */
    public long m174325f() {
        return this.f154124b;
    }

    /* JADX INFO: renamed from: g */
    public long m174326g() {
        return this.f154123a;
    }

    /* JADX INFO: renamed from: h */
    public int m174327h() {
        return this.f154127e;
    }

    /* JADX INFO: renamed from: i */
    public long m174328i() {
        return this.f154126d;
    }

    /* JADX INFO: renamed from: j */
    public long m174329j() {
        return this.f154125c;
    }
}
