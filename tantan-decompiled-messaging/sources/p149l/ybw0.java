package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ybw0 implements ojv0 {

    /* JADX INFO: renamed from: b */
    @GuardedBy("messagePool")
    public static final List f197371b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f197372a;

    public ybw0(Handler handler) {
        this.f197372a = handler;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ void m213980a(bbw0 bbw0Var) {
        List list = f197371b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bbw0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static bbw0 m213981i() {
        bbw0 bbw0Var;
        List list = f197371b;
        synchronized (list) {
            try {
                bbw0Var = list.isEmpty() ? new bbw0(null) : (bbw0) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bbw0Var;
    }

    @Override // p149l.ojv0
    /* JADX INFO: renamed from: b */
    public final void mo164787b(@Nullable Object obj) {
        this.f197372a.removeCallbacksAndMessages(null);
    }

    @Override // p149l.ojv0
    /* JADX INFO: renamed from: c */
    public final iiv0 mo164788c(int i, @Nullable Object obj) {
        Handler handler = this.f197372a;
        bbw0 bbw0VarM213981i = m213981i();
        bbw0VarM213981i.m101035a(handler.obtainMessage(i, obj), this);
        return bbw0VarM213981i;
    }

    @Override // p149l.ojv0
    /* JADX INFO: renamed from: d */
    public final boolean mo164789d(int i, long j) {
        return this.f197372a.sendEmptyMessageAtTime(2, j);
    }

    @Override // p149l.ojv0
    /* JADX INFO: renamed from: e */
    public final iiv0 mo164790e(int i) {
        Handler handler = this.f197372a;
        bbw0 bbw0VarM213981i = m213981i();
        bbw0VarM213981i.m101035a(handler.obtainMessage(i), this);
        return bbw0VarM213981i;
    }

    @Override // p149l.ojv0
    /* JADX INFO: renamed from: f */
    public final boolean mo164791f(iiv0 iiv0Var) {
        return ((bbw0) iiv0Var).m101036b(this.f197372a);
    }

    @Override // p149l.ojv0
    /* JADX INFO: renamed from: g */
    public final boolean mo164792g(Runnable runnable) {
        return this.f197372a.post(runnable);
    }

    @Override // p149l.ojv0
    /* JADX INFO: renamed from: h */
    public final iiv0 mo164793h(int i, int i2, int i3) {
        Handler handler = this.f197372a;
        bbw0 bbw0VarM213981i = m213981i();
        bbw0VarM213981i.m101035a(handler.obtainMessage(1, i2, i3), this);
        return bbw0VarM213981i;
    }

    @Override // p149l.ojv0
    /* JADX INFO: renamed from: n */
    public final boolean mo164794n(int i) {
        return this.f197372a.sendEmptyMessage(i);
    }

    @Override // p149l.ojv0
    public final Looper zza() {
        return this.f197372a.getLooper();
    }

    @Override // p149l.ojv0
    public final void zzf(int i) {
        this.f197372a.removeMessages(i);
    }

    @Override // p149l.ojv0
    public final boolean zzg(int i) {
        return this.f197372a.hasMessages(0);
    }
}
