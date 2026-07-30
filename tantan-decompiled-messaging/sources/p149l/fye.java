package p149l;

import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes3.dex */
public class fye implements eoj0.InterfaceC16652b {

    /* JADX INFO: renamed from: a */
    public boolean f99867a;

    /* JADX INFO: renamed from: l.fye$a */
    public class C16962a extends exe.AbstractC16712d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f99868a;

        public C16962a(Runnable runnable) {
            this.f99868a = runnable;
        }

        @Override // p149l.exe.AbstractC16712d
        /* JADX INFO: renamed from: b */
        public void mo118660b() {
            if (this.f99868a != null) {
                fye.this.f99867a = true;
                this.f99868a.run();
            }
        }
    }

    @Override // p149l.eoj0.InterfaceC16652b
    /* JADX INFO: renamed from: a */
    public CharSequence mo117358a(CharSequence charSequence) {
        return !this.f99867a ? charSequence : exe.m118631a().m118643m(charSequence);
    }

    @Override // p149l.eoj0.InterfaceC16652b
    /* JADX INFO: renamed from: b */
    public boolean mo117359b(String str) {
        if (m123762e()) {
            return exe.m118631a().m118637f(str);
        }
        return false;
    }

    @Override // p149l.eoj0.InterfaceC16652b
    /* JADX INFO: renamed from: c */
    public void mo117360c(Runnable runnable) {
        exe.m118634g(new yxi(CoreModule.f17544b, new xxi("com.google.android.gms.fonts", "com.google.android.gms", "Noto Color Emoji Compat", d0c0.f83175a)).m118658c(true).m118657b(-65536).m118656a(new C16962a(runnable)));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m123762e() {
        return exe.m118631a().m118636c() == 1;
    }
}
