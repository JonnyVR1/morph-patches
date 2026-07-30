package p149l;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class twy0 {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f172438a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public final void m190912a(Handler handler, uwy0 uwy0Var) {
        m190914c(uwy0Var);
        this.f172438a.add(new swy0(handler, uwy0Var));
    }

    /* JADX INFO: renamed from: b */
    public final void m190913b(final int i, final long j, final long j2) {
        for (final swy0 swy0Var : this.f172438a) {
            if (!swy0Var.f166766c) {
                swy0Var.f166764a.post(new Runnable() { // from class: l.rwy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        swy0Var.f166765b.mo106403p(i, j, j2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m190914c(uwy0 uwy0Var) {
        for (swy0 swy0Var : this.f172438a) {
            if (swy0Var.f166765b == uwy0Var) {
                swy0Var.m186392c();
                this.f172438a.remove(swy0Var);
            }
        }
    }
}
