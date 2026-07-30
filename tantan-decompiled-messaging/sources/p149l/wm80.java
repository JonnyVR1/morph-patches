package p149l;

import com.immomo.medialog.thread.Priority;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes7.dex */
public class wm80 extends FutureTask<Runnable> implements Comparable<wm80> {

    /* JADX INFO: renamed from: a */
    private final Runnable f187052a;

    /* JADX INFO: renamed from: b */
    private final long f187053b;

    public wm80(Runnable runnable, long j) {
        super(runnable, null);
        this.f187052a = runnable;
        this.f187053b = j;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(wm80 wm80Var) {
        if (wm80Var == this) {
            return 0;
        }
        Runnable runnable = this.f187052a;
        Priority priorityM112611a = runnable instanceof dn80 ? ((dn80) runnable).m112611a() : Priority.LOW;
        Runnable runnable2 = wm80Var.f187052a;
        Priority priorityM112611a2 = runnable2 instanceof dn80 ? ((dn80) runnable2).m112611a() : Priority.LOW;
        if (priorityM112611a.ordinal() < priorityM112611a2.ordinal()) {
            return 1;
        }
        return (priorityM112611a.ordinal() <= priorityM112611a2.ordinal() && this.f187053b >= wm80Var.f187053b) ? 1 : -1;
    }

    /* JADX INFO: renamed from: b */
    public Runnable m203979b() {
        return this.f187052a;
    }
}
