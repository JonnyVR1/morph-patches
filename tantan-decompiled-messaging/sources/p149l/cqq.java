package p149l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class cqq extends vxv {

    /* JADX INFO: renamed from: a */
    Logger f82102a;

    public cqq(String str) {
        this.f82102a = Logger.getLogger(str);
    }

    @Override // p149l.vxv
    /* JADX INFO: renamed from: b */
    public void mo108288b(String str) {
        this.f82102a.log(Level.FINE, str);
    }

    @Override // p149l.vxv
    /* JADX INFO: renamed from: c */
    public void mo108289c(String str) {
        this.f82102a.log(Level.SEVERE, str);
    }
}
