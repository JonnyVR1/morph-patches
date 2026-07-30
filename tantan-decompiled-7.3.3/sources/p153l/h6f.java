package p153l;

import androidx.annotation.NonNull;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import com.tantanapp.beatles.p077v2.data.MonitorException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class h6f implements k5f {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final e610 f108022a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final i610 f108023b;

    /* JADX INFO: renamed from: l.h6f$b */
    public static class C17409b {
        private static h6f INSTANCE = new h6f();
    }

    public h6f() {
        h610 h610Var = new h610();
        this.f108022a = new e610(h610Var);
        this.f108023b = new i610(h610Var);
    }

    /* JADX INFO: renamed from: c */
    public static h6f m133696c() {
        return C17409b.INSTANCE;
    }

    @Override // p153l.k5f
    /* JADX INFO: renamed from: a */
    public void mo82303a(@NonNull MonitorEvent monitorEvent) {
        Throwable throwable = monitorEvent.getThrowable();
        if (throwable != null) {
            monitorEvent.setExceptions(this.f108022a.m119569c(throwable, monitorEvent.getCrashThread(), monitorEvent.getNewExceptionType()));
            m133698d(monitorEvent);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m133697b(Throwable th) {
        Iterator<Class> it = du2.m118047g().iterator();
        while (it.hasNext()) {
            if (th.getClass().equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m133698d(MonitorEvent monitorEvent) {
        Throwable throwable = monitorEvent.getThrowable();
        ArrayList arrayList = null;
        Throwable th = null;
        do {
            if (th == null || !m133697b(throwable)) {
                th = throwable;
            }
            throwable = throwable.getCause();
        } while (throwable != null);
        if (monitorEvent.isNeedOtherThread() && !(th instanceof OutOfMemoryError) && monitorEvent.getThreads() == null && monitorEvent.isNeedOtherThread()) {
            if (monitorEvent.getExceptions() != null && !monitorEvent.getExceptions().isEmpty()) {
                for (MonitorException monitorException : monitorEvent.getExceptions()) {
                    if (monitorException.getThreadId() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(monitorException.getThreadId());
                    }
                }
            }
            monitorEvent.setThreads(this.f108023b.m138794a(arrayList));
        }
    }
}
