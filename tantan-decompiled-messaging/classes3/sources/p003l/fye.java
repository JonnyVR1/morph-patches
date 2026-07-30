package p003l;

import com.p1.mobile.putong.core.CoreModule;
import l.d0c0;
import l.exe;
import l.xxi;
import l.yxi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fye implements eoj0.InterfaceC0279b {

    /* JADX INFO: renamed from: a */
    public boolean f3764a;

    /* JADX INFO: renamed from: l.fye$a */
    public class C0299a extends exe.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f3765a;

        public C0299a(Runnable runnable) {
            this.f3765a = runnable;
        }

        /* JADX INFO: renamed from: b */
        public void m4481b() {
            if (this.f3765a != null) {
                fye.this.f3764a = true;
                this.f3765a.run();
            }
        }
    }

    @Override // p003l.eoj0.InterfaceC0279b
    /* JADX INFO: renamed from: a */
    public CharSequence mo3919a(CharSequence charSequence) {
        return !this.f3764a ? charSequence : exe.a().m(charSequence);
    }

    @Override // p003l.eoj0.InterfaceC0279b
    /* JADX INFO: renamed from: b */
    public boolean mo3920b(String str) {
        if (m4480e()) {
            return exe.a().f(str);
        }
        return false;
    }

    @Override // p003l.eoj0.InterfaceC0279b
    /* JADX INFO: renamed from: c */
    public void mo3921c(Runnable runnable) {
        exe.g(new yxi(CoreModule.b, new xxi("com.google.android.gms.fonts", "com.google.android.gms", "Noto Color Emoji Compat", d0c0.a)).c(true).b(-65536).a(new C0299a(runnable)));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4480e() {
        return exe.a().c() == 1;
    }
}
