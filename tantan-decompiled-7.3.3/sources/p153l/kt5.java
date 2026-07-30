package p153l;

import android.content.Context;
import com.idv.identity.ocr.compress.CompressConfig;

/* JADX INFO: loaded from: classes7.dex */
public class kt5 implements jt5 {

    /* JADX INFO: renamed from: a */
    private final lt5 f128648a;

    /* JADX INFO: renamed from: b */
    private String f128649b;

    /* JADX INFO: renamed from: c */
    private jt5.InterfaceC18037a f128650c;

    /* JADX INFO: renamed from: l.kt5$a */
    public class C18256a implements lt5.InterfaceC18457c {
        public C18256a() {
        }

        @Override // p153l.lt5.InterfaceC18457c
        /* JADX INFO: renamed from: a */
        public void mo151332a(String str, String str2) {
            kt5.this.f128650c.mo18984a(str, str2);
            ksh0.m151244a(str);
        }

        @Override // p153l.lt5.InterfaceC18457c
        /* JADX INFO: renamed from: b */
        public void mo151333b(String str) {
            kt5.this.f128650c.mo18985b(kt5.this.f128649b, str);
        }
    }

    private kt5(Context context, CompressConfig compressConfig, String str, jt5.InterfaceC18037a interfaceC18037a) {
        this.f128648a = new lt5(context, compressConfig);
        this.f128649b = str;
        this.f128650c = interfaceC18037a;
    }

    /* JADX INFO: renamed from: e */
    public static jt5 m151330e(Context context, CompressConfig compressConfig, String str, jt5.InterfaceC18037a interfaceC18037a) {
        return new kt5(context, compressConfig, str, interfaceC18037a);
    }

    @Override // p153l.jt5
    /* JADX INFO: renamed from: a */
    public void mo146888a() {
        m151331d();
    }

    /* JADX INFO: renamed from: d */
    public void m151331d() {
        this.f128648a.m155744d(this.f128649b, new C18256a());
    }
}
