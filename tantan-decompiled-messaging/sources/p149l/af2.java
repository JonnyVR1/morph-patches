package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class af2 extends ti2<fa5<da5>> {
    @Override // p149l.ti2
    /* JADX INFO: renamed from: f */
    public void mo96183f(c5c<fa5<da5>> c5cVar) {
        if (c5cVar.mo8182e()) {
            fa5<da5> result = c5cVar.getResult();
            try {
                mo96184g((result == null || !(result.m120155B() instanceof aa5)) ? null : ((aa5) result.m120155B()).mo95529a0());
            } finally {
                fa5.m120154v(result);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo96184g(Bitmap bitmap);
}
