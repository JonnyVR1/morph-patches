package p149l;

import androidx.annotation.NonNull;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import com.tantanapp.beatles.p072v2.data.MonitorException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class d5f implements g4f {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ux00 f84529a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final yx00 f84530b;

    /* JADX INFO: renamed from: l.d5f$b */
    public static class C16302b {
        private static d5f INSTANCE = new d5f();
    }

    public d5f() {
        xx00 xx00Var = new xx00();
        this.f84529a = new ux00(xx00Var);
        this.f84530b = new yx00(xx00Var);
    }

    /* JADX INFO: renamed from: c */
    public static d5f m110051c() {
        return C16302b.INSTANCE;
    }

    @Override // p149l.g4f
    /* JADX INFO: renamed from: a */
    public void mo81120a(@NonNull MonitorEvent monitorEvent) {
        Throwable throwable = monitorEvent.getThrowable();
        if (throwable != null) {
            monitorEvent.setExceptions(this.f84529a.m196144c(throwable, monitorEvent.getCrashThread(), monitorEvent.getNewExceptionType()));
            m110053d(monitorEvent);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m110052b(Throwable th) {
        Iterator<Class> it = nt2.m160816g().iterator();
        while (it.hasNext()) {
            if (th.getClass().equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m110053d(MonitorEvent monitorEvent) {
        Throwable throwable = monitorEvent.getThrowable();
        ArrayList arrayList = null;
        Throwable th = null;
        do {
            if (th == null || !m110052b(throwable)) {
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
            monitorEvent.setThreads(this.f84530b.m216424a(arrayList));
        }
    }
}
