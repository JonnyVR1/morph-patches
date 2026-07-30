package p149l;

import android.os.Handler;
import com.android.volley.C0918d;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class u5f implements ixc0 {

    /* JADX INFO: renamed from: a */
    private final Executor f174698a;

    /* JADX INFO: renamed from: l.u5f$a */
    public class ExecutorC20360a implements Executor {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Handler f174699a;

        public ExecutorC20360a(Handler handler) {
            this.f174699a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f174699a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: l.u5f$b */
    public static class RunnableC20361b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final Request f174701a;

        /* JADX INFO: renamed from: b */
        private final C0918d f174702b;

        /* JADX INFO: renamed from: c */
        private final Runnable f174703c;

        public RunnableC20361b(Request request, C0918d c0918d, Runnable runnable) {
            this.f174701a = request;
            this.f174702b = c0918d;
            this.f174703c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f174701a.isCanceled()) {
                this.f174701a.finish("canceled-at-delivery");
                return;
            }
            boolean zM5097b = this.f174702b.m5097b();
            Request request = this.f174701a;
            if (zM5097b) {
                request.deliverResponse(this.f174702b.f4166a);
            } else {
                request.deliverError(this.f174702b.f4168c);
            }
            boolean z = this.f174702b.f4169d;
            Request request2 = this.f174701a;
            if (z) {
                request2.addMarker("intermediate-response");
            } else {
                request2.finish("done");
            }
            Runnable runnable = this.f174703c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public u5f(Handler handler) {
        this.f174698a = new ExecutorC20360a(handler);
    }

    @Override // p149l.ixc0
    /* JADX INFO: renamed from: a */
    public void mo138805a(Request<?> request, C0918d<?> c0918d) {
        mo138806b(request, c0918d, null);
    }

    @Override // p149l.ixc0
    /* JADX INFO: renamed from: b */
    public void mo138806b(Request<?> request, C0918d<?> c0918d, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.f174698a.execute(new RunnableC20361b(request, c0918d, runnable));
    }

    @Override // p149l.ixc0
    /* JADX INFO: renamed from: c */
    public void mo138807c(Request<?> request, VolleyError volleyError) {
        request.addMarker("post-error");
        this.f174698a.execute(new RunnableC20361b(request, C0918d.m5095a(volleyError), null));
    }
}
