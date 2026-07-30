package p153l;

import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nii {

    /* JADX INFO: renamed from: a */
    public long f142126a;

    /* JADX INFO: renamed from: b */
    public long f142127b;

    /* JADX INFO: renamed from: c */
    public long f142128c;

    /* JADX INFO: renamed from: d */
    public long f142129d;

    /* JADX INFO: renamed from: e */
    public int f142130e;

    /* JADX INFO: renamed from: f */
    public List<String> f142131f;

    /* JADX INFO: renamed from: l.nii$b */
    public static class C18881b {

        /* JADX INFO: renamed from: a */
        public nii f142132a = new nii();

        /* JADX INFO: renamed from: a */
        public nii m163285a() {
            return this.f142132a;
        }

        /* JADX INFO: renamed from: b */
        public C18881b m163286b(List<String> list) {
            this.f142132a.f142131f = list;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C18881b m163287c(long j) {
            this.f142132a.f142127b = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C18881b m163288d(long j) {
            this.f142132a.f142126a = j;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C18881b m163289e(int i) {
            this.f142132a.f142130e = i;
            return this;
        }
    }

    public nii() {
        this.f142126a = 51200L;
        this.f142127b = 52428800L;
        this.f142128c = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
        this.f142129d = 120000L;
        this.f142130e = 1;
        this.f142131f = new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    public List<String> m163279e() {
        return this.f142131f;
    }

    /* JADX INFO: renamed from: f */
    public long m163280f() {
        return this.f142127b;
    }

    /* JADX INFO: renamed from: g */
    public long m163281g() {
        return this.f142126a;
    }

    /* JADX INFO: renamed from: h */
    public int m163282h() {
        return this.f142130e;
    }

    /* JADX INFO: renamed from: i */
    public long m163283i() {
        return this.f142129d;
    }

    /* JADX INFO: renamed from: j */
    public long m163284j() {
        return this.f142128c;
    }
}
