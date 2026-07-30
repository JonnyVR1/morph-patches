package p149l;

import android.content.Context;
import com.idv.identity.ocr.compress.CompressConfig;

/* JADX INFO: loaded from: classes7.dex */
public class gs5 implements fs5 {

    /* JADX INFO: renamed from: a */
    private final hs5 f104143a;

    /* JADX INFO: renamed from: b */
    private String f104144b;

    /* JADX INFO: renamed from: c */
    private fs5.InterfaceC16917a f104145c;

    /* JADX INFO: renamed from: l.gs5$a */
    public class C17147a implements hs5.InterfaceC17384c {
        public C17147a() {
        }

        @Override // p149l.hs5.InterfaceC17384c
        /* JADX INFO: renamed from: a */
        public void mo127782a(String str, String str2) {
            gs5.this.f104145c.mo17907a(str, str2);
            dkh0.m112223a(str);
        }

        @Override // p149l.hs5.InterfaceC17384c
        /* JADX INFO: renamed from: b */
        public void mo127783b(String str) {
            gs5.this.f104145c.mo17908b(gs5.this.f104144b, str);
        }
    }

    private gs5(Context context, CompressConfig compressConfig, String str, fs5.InterfaceC16917a interfaceC16917a) {
        this.f104143a = new hs5(context, compressConfig);
        this.f104144b = str;
        this.f104145c = interfaceC16917a;
    }

    /* JADX INFO: renamed from: e */
    public static fs5 m127780e(Context context, CompressConfig compressConfig, String str, fs5.InterfaceC16917a interfaceC16917a) {
        return new gs5(context, compressConfig, str, interfaceC16917a);
    }

    @Override // p149l.fs5
    /* JADX INFO: renamed from: a */
    public void mo122920a() {
        m127781d();
    }

    /* JADX INFO: renamed from: d */
    public void m127781d() {
        this.f104143a.m132778d(this.f104144b, new C17147a());
    }
}
