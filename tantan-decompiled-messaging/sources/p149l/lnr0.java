package p149l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lnr0 {

    /* JADX INFO: renamed from: c */
    public static final boolean f129020c = mnr0.f134787b;

    /* JADX INFO: renamed from: a */
    public final List f129021a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public boolean f129022b = false;

    /* JADX INFO: renamed from: a */
    public final synchronized void m150710a(String str, long j) {
        if (this.f129022b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f129021a.add(new knr0(str, j, SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m150711b(String str) {
        long j;
        this.f129022b = true;
        if (this.f129021a.size() == 0) {
            j = 0;
        } else {
            long j2 = ((knr0) this.f129021a.get(0)).f123908c;
            List list = this.f129021a;
            j = ((knr0) list.get(list.size() - 1)).f123908c - j2;
        }
        if (j > 0) {
            long j3 = ((knr0) this.f129021a.get(0)).f123908c;
            mnr0.m155557a("(%-4d ms) %s", Long.valueOf(j), str);
            for (knr0 knr0Var : this.f129021a) {
                long j4 = knr0Var.f123908c;
                mnr0.m155557a("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(knr0Var.f123907b), knr0Var.f123906a);
                j3 = j4;
            }
        }
    }

    public final void finalize() throws Throwable {
        if (this.f129022b) {
            return;
        }
        m150711b("Request on the loose");
        mnr0.m155558b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
