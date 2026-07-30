package p149l;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class wsr0 implements law0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ k8w0 f187965a;

    public wsr0(itr0 itr0Var, k8w0 k8w0Var) {
        this.f187965a = k8w0Var;
    }

    @Override // p149l.law0
    /* JADX INFO: renamed from: a */
    public final boolean mo149181a(File file) {
        try {
            return this.f187965a.m144979a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
