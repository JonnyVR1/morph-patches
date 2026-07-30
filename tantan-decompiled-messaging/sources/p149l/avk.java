package p149l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import p133rx.internal.schedulers.ScheduledAction;

/* JADX INFO: loaded from: classes3.dex */
public final class avk extends bud0 {

    /* JADX INFO: renamed from: b */
    public final Handler f71944b;

    /* JADX INFO: renamed from: l.avk$a */
    public static class C15734a extends bud0.AbstractC15976a {

        /* JADX INFO: renamed from: a */
        public final Handler f71945a;

        /* JADX INFO: renamed from: b */
        public final bs5 f71946b = new bs5();

        /* JADX INFO: renamed from: l.avk$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ScheduledAction f71947a;

            public a(ScheduledAction scheduledAction) {
                this.f71947a = scheduledAction;
            }

            @Override // p149l.d30
            public void call() {
                C15734a.this.f71945a.removeCallbacks(this.f71947a);
            }
        }

        public C15734a(Handler handler) {
            this.f71945a = handler;
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: b */
        public c4g0 mo99201b(d30 d30Var) {
            return mo99202c(d30Var, 0L, TimeUnit.MILLISECONDS);
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: c */
        public c4g0 mo99202c(d30 d30Var, long j, TimeUnit timeUnit) {
            if (this.f71946b.isUnsubscribed()) {
                return h4g0.m129243d();
            }
            ScheduledAction scheduledAction = new ScheduledAction(wid0.m203318a().m203319b().m209637c(d30Var));
            scheduledAction.addParent(this.f71946b);
            this.f71946b.m103655a(scheduledAction);
            if (this.f71945a.getLooper() == Looper.myLooper() && j == 0) {
                scheduledAction.run();
            } else {
                this.f71945a.postDelayed(scheduledAction, timeUnit.toMillis(j));
            }
            scheduledAction.add(h4g0.m129240a(new a(scheduledAction)));
            return scheduledAction;
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f71946b.isUnsubscribed();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            this.f71946b.unsubscribe();
        }
    }

    public avk(Handler handler) {
        this.f71944b = handler;
    }

    /* JADX INFO: renamed from: a */
    public static avk m99199a(Handler handler) {
        if (handler != null) {
            return new avk(handler);
        }
        jfd0.m141176a("handler == null");
        return null;
    }

    @Override // p149l.bud0
    public bud0.AbstractC15976a createWorker() {
        return new C15734a(this.f71944b);
    }
}
