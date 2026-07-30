package p153l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rwr0 {

    /* JADX INFO: renamed from: c */
    public static final boolean f165232c = swr0.f171002b;

    /* JADX INFO: renamed from: a */
    public final List f165233a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public boolean f165234b = false;

    /* JADX INFO: renamed from: a */
    public final synchronized void m183459a(String str, long j) {
        if (this.f165234b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f165233a.add(new qwr0(str, j, SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m183460b(String str) {
        long j;
        this.f165234b = true;
        if (this.f165233a.size() == 0) {
            j = 0;
        } else {
            long j2 = ((qwr0) this.f165233a.get(0)).f159966c;
            List list = this.f165233a;
            j = ((qwr0) list.get(list.size() - 1)).f159966c - j2;
        }
        if (j > 0) {
            long j3 = ((qwr0) this.f165233a.get(0)).f159966c;
            swr0.m188357a("(%-4d ms) %s", Long.valueOf(j), str);
            for (qwr0 qwr0Var : this.f165233a) {
                long j4 = qwr0Var.f159966c;
                swr0.m188357a("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(qwr0Var.f159965b), qwr0Var.f159964a);
                j3 = j4;
            }
        }
    }

    public final void finalize() throws Throwable {
        if (this.f165234b) {
            return;
        }
        m183460b("Request on the loose");
        swr0.m188358b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
