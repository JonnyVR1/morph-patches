package p003l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import l.jfd0;
import p014rx.internal.schedulers.ScheduledAction;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class avk extends bud0 {

    /* JADX INFO: renamed from: b */
    public final Handler f2298b;

    /* JADX INFO: renamed from: l.avk$a */
    public static class C0166a extends bud0.AbstractC0185a {

        /* JADX INFO: renamed from: a */
        public final Handler f2299a;

        /* JADX INFO: renamed from: b */
        public final bs5 f2300b = new bs5();

        /* JADX INFO: renamed from: l.avk$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ScheduledAction f2301a;

            public a(ScheduledAction scheduledAction) {
                this.f2301a = scheduledAction;
            }

            @Override // p003l.d30
            public void call() {
                C0166a.this.f2299a.removeCallbacks(this.f2301a);
            }
        }

        public C0166a(Handler handler) {
            this.f2299a = handler;
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: b */
        public c4g0 mo2914b(d30 d30Var) {
            return mo2915c(d30Var, 0L, TimeUnit.MILLISECONDS);
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: c */
        public c4g0 mo2915c(d30 d30Var, long j, TimeUnit timeUnit) {
            if (this.f2300b.isUnsubscribed()) {
                return h4g0.m4917d();
            }
            ScheduledAction scheduledAction = new ScheduledAction(wid0.m8561a().m8562b().m8706c(d30Var));
            scheduledAction.addParent(this.f2300b);
            this.f2300b.m3164a(scheduledAction);
            if (this.f2299a.getLooper() == Looper.myLooper() && j == 0) {
                scheduledAction.run();
            } else {
                this.f2299a.postDelayed(scheduledAction, timeUnit.toMillis(j));
            }
            scheduledAction.add(h4g0.m4914a(new a(scheduledAction)));
            return scheduledAction;
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f2300b.isUnsubscribed();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            this.f2300b.unsubscribe();
        }
    }

    public avk(Handler handler) {
        this.f2298b = handler;
    }

    /* JADX INFO: renamed from: a */
    public static avk m2912a(Handler handler) {
        if (handler != null) {
            return new avk(handler);
        }
        jfd0.a("handler == null");
        return null;
    }

    @Override // p003l.bud0
    public bud0.AbstractC0185a createWorker() {
        return new C0166a(this.f2298b);
    }
}
