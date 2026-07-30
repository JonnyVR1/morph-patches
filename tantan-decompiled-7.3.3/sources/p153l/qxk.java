package p153l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import p137rx.internal.schedulers.ScheduledAction;

/* JADX INFO: loaded from: classes3.dex */
public final class qxk extends f2e0 {

    /* JADX INFO: renamed from: b */
    public final Handler f160048b;

    /* JADX INFO: renamed from: l.qxk$a */
    public static class C19689a extends f2e0.AbstractC16877a {

        /* JADX INFO: renamed from: a */
        public final Handler f160049a;

        /* JADX INFO: renamed from: b */
        public final ft5 f160050b = new ft5();

        /* JADX INFO: renamed from: l.qxk$a$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ScheduledAction f160051a;

            public a(ScheduledAction scheduledAction) {
                this.f160051a = scheduledAction;
            }

            @Override // p153l.x20
            public void call() {
                C19689a.this.f160049a.removeCallbacks(this.f160051a);
            }
        }

        public C19689a(Handler handler) {
            this.f160049a = handler;
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: b */
        public kcg0 mo102836b(x20 x20Var) {
            return mo102837c(x20Var, 0L, TimeUnit.MILLISECONDS);
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: c */
        public kcg0 mo102837c(x20 x20Var, long j, TimeUnit timeUnit) {
            if (this.f160050b.isUnsubscribed()) {
                return pcg0.m171651d();
            }
            ScheduledAction scheduledAction = new ScheduledAction(zqd0.m221008a().m221009b().m99674c(x20Var));
            scheduledAction.addParent(this.f160050b);
            this.f160050b.m127297a(scheduledAction);
            if (this.f160049a.getLooper() == Looper.myLooper() && j == 0) {
                scheduledAction.run();
            } else {
                this.f160049a.postDelayed(scheduledAction, timeUnit.toMillis(j));
            }
            scheduledAction.add(pcg0.m171648a(new a(scheduledAction)));
            return scheduledAction;
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f160050b.isUnsubscribed();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            this.f160050b.unsubscribe();
        }
    }

    public qxk(Handler handler) {
        this.f160048b = handler;
    }

    /* JADX INFO: renamed from: a */
    public static qxk m178605a(Handler handler) {
        if (handler != null) {
            return new qxk(handler);
        }
        mnd0.m159157a("handler == null");
        return null;
    }

    @Override // p153l.f2e0
    public f2e0.AbstractC16877a createWorker() {
        return new C19689a(this.f160048b);
    }
}
