package p153l;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class c2s0 implements rjw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qhw0 f79512a;

    public c2s0(o2s0 o2s0Var, qhw0 qhw0Var) {
        this.f79512a = qhw0Var;
    }

    @Override // p153l.rjw0
    /* JADX INFO: renamed from: a */
    public final boolean mo107724a(File file) {
        try {
            return this.f79512a.m176621a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
