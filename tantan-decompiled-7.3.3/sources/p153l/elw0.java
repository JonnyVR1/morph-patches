package p153l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class elw0 implements usv0 {

    /* JADX INFO: renamed from: b */
    @GuardedBy("messagePool")
    public static final List f94590b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f94591a;

    public elw0(Handler handler) {
        this.f94591a = handler;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ void m121296a(hkw0 hkw0Var) {
        List list = f94590b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(hkw0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static hkw0 m121297i() {
        hkw0 hkw0Var;
        List list = f94590b;
        synchronized (list) {
            try {
                hkw0Var = list.isEmpty() ? new hkw0(null) : (hkw0) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hkw0Var;
    }

    @Override // p153l.usv0
    /* JADX INFO: renamed from: b */
    public final void mo121298b(@Nullable Object obj) {
        this.f94591a.removeCallbacksAndMessages(null);
    }

    @Override // p153l.usv0
    /* JADX INFO: renamed from: c */
    public final orv0 mo121299c(int i, @Nullable Object obj) {
        Handler handler = this.f94591a;
        hkw0 hkw0VarM121297i = m121297i();
        hkw0VarM121297i.m135650a(handler.obtainMessage(i, obj), this);
        return hkw0VarM121297i;
    }

    @Override // p153l.usv0
    /* JADX INFO: renamed from: d */
    public final boolean mo121300d(int i, long j) {
        return this.f94591a.sendEmptyMessageAtTime(2, j);
    }

    @Override // p153l.usv0
    /* JADX INFO: renamed from: e */
    public final orv0 mo121301e(int i) {
        Handler handler = this.f94591a;
        hkw0 hkw0VarM121297i = m121297i();
        hkw0VarM121297i.m135650a(handler.obtainMessage(i), this);
        return hkw0VarM121297i;
    }

    @Override // p153l.usv0
    /* JADX INFO: renamed from: f */
    public final boolean mo121302f(orv0 orv0Var) {
        return ((hkw0) orv0Var).m135651b(this.f94591a);
    }

    @Override // p153l.usv0
    /* JADX INFO: renamed from: g */
    public final boolean mo121303g(Runnable runnable) {
        return this.f94591a.post(runnable);
    }

    @Override // p153l.usv0
    /* JADX INFO: renamed from: h */
    public final orv0 mo121304h(int i, int i2, int i3) {
        Handler handler = this.f94591a;
        hkw0 hkw0VarM121297i = m121297i();
        hkw0VarM121297i.m135650a(handler.obtainMessage(1, i2, i3), this);
        return hkw0VarM121297i;
    }

    @Override // p153l.usv0
    /* JADX INFO: renamed from: n */
    public final boolean mo121305n(int i) {
        return this.f94591a.sendEmptyMessage(i);
    }

    @Override // p153l.usv0
    public final Looper zza() {
        return this.f94591a.getLooper();
    }

    @Override // p153l.usv0
    public final void zzf(int i) {
        this.f94591a.removeMessages(i);
    }

    @Override // p153l.usv0
    public final boolean zzg(int i) {
        return this.f94591a.hasMessages(0);
    }
}
