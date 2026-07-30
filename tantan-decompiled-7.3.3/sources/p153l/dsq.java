package p153l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class dsq extends szv {

    /* JADX INFO: renamed from: a */
    Logger f90509a;

    public dsq(String str) {
        this.f90509a = Logger.getLogger(str);
    }

    @Override // p153l.szv
    /* JADX INFO: renamed from: b */
    public void mo99049b(String str) {
        this.f90509a.log(Level.FINE, str);
    }

    @Override // p153l.szv
    /* JADX INFO: renamed from: c */
    public void mo99050c(String str) {
        this.f90509a.log(Level.SEVERE, str);
    }
}
