package p153l;

import com.immomo.medialog.thread.Priority;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes7.dex */
public class av80 extends FutureTask<Runnable> implements Comparable<av80> {

    /* JADX INFO: renamed from: a */
    private final Runnable f73598a;

    /* JADX INFO: renamed from: b */
    private final long f73599b;

    public av80(Runnable runnable, long j) {
        super(runnable, null);
        this.f73598a = runnable;
        this.f73599b = j;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av80 av80Var) {
        if (av80Var == this) {
            return 0;
        }
        Runnable runnable = this.f73598a;
        Priority priorityM137274a = runnable instanceof hv80 ? ((hv80) runnable).m137274a() : Priority.LOW;
        Runnable runnable2 = av80Var.f73598a;
        Priority priorityM137274a2 = runnable2 instanceof hv80 ? ((hv80) runnable2).m137274a() : Priority.LOW;
        if (priorityM137274a.ordinal() < priorityM137274a2.ordinal()) {
            return 1;
        }
        return (priorityM137274a.ordinal() <= priorityM137274a2.ordinal() && this.f73599b >= av80Var.f73599b) ? 1 : -1;
    }

    /* JADX INFO: renamed from: b */
    public Runnable m100432b() {
        return this.f73598a;
    }
}
