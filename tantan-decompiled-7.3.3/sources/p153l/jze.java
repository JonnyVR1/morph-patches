package p153l;

import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes3.dex */
public class jze implements hxj0.InterfaceC17590b {

    /* JADX INFO: renamed from: a */
    public boolean f123257a;

    /* JADX INFO: renamed from: l.jze$a */
    public class C18063a extends iye.AbstractC17824d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f123258a;

        public C18063a(Runnable runnable) {
            this.f123258a = runnable;
        }

        @Override // p153l.iye.AbstractC17824d
        /* JADX INFO: renamed from: b */
        public void mo142651b() {
            if (this.f123258a != null) {
                jze.this.f123257a = true;
                this.f123258a.run();
            }
        }
    }

    @Override // p153l.hxj0.InterfaceC17590b
    /* JADX INFO: renamed from: a */
    public CharSequence mo137619a(CharSequence charSequence) {
        return !this.f123257a ? charSequence : iye.m142622a().m142634m(charSequence);
    }

    @Override // p153l.hxj0.InterfaceC17590b
    /* JADX INFO: renamed from: b */
    public boolean mo137620b(String str) {
        if (m147660e()) {
            return iye.m142622a().m142628f(str);
        }
        return false;
    }

    @Override // p153l.hxj0.InterfaceC17590b
    /* JADX INFO: renamed from: c */
    public void mo137621c(Runnable runnable) {
        iye.m142625g(new u0j(CoreModule.f18263b, new t0j("com.google.android.gms.fonts", "com.google.android.gms", "Noto Color Emoji Compat", i8c0.f113333a)).m142649c(true).m142648b(-65536).m142647a(new C18063a(runnable)));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m147660e() {
        return iye.m142622a().m142627c() == 1;
    }
}
