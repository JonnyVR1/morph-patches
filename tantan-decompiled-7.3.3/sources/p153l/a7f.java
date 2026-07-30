package p153l;

import android.os.Handler;
import com.android.volley.C0922d;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a7f implements m5d0 {

    /* JADX INFO: renamed from: a */
    private final Executor f68812a;

    /* JADX INFO: renamed from: l.a7f$a */
    public class ExecutorC15663a implements Executor {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Handler f68813a;

        public ExecutorC15663a(Handler handler) {
            this.f68813a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f68813a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: l.a7f$b */
    public static class RunnableC15664b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final Request f68815a;

        /* JADX INFO: renamed from: b */
        private final C0922d f68816b;

        /* JADX INFO: renamed from: c */
        private final Runnable f68817c;

        public RunnableC15664b(Request request, C0922d c0922d, Runnable runnable) {
            this.f68815a = request;
            this.f68816b = c0922d;
            this.f68817c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f68815a.isCanceled()) {
                this.f68815a.finish("canceled-at-delivery");
                return;
            }
            boolean zM5107b = this.f68816b.m5107b();
            Request request = this.f68815a;
            if (zM5107b) {
                request.deliverResponse(this.f68816b.f4166a);
            } else {
                request.deliverError(this.f68816b.f4168c);
            }
            boolean z = this.f68816b.f4169d;
            Request request2 = this.f68815a;
            if (z) {
                request2.addMarker("intermediate-response");
            } else {
                request2.finish("done");
            }
            Runnable runnable = this.f68817c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public a7f(Handler handler) {
        this.f68812a = new ExecutorC15663a(handler);
    }

    @Override // p153l.m5d0
    /* JADX INFO: renamed from: a */
    public void mo96359a(Request<?> request, C0922d<?> c0922d) {
        mo96360b(request, c0922d, null);
    }

    @Override // p153l.m5d0
    /* JADX INFO: renamed from: b */
    public void mo96360b(Request<?> request, C0922d<?> c0922d, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.f68812a.execute(new RunnableC15664b(request, c0922d, runnable));
    }

    @Override // p153l.m5d0
    /* JADX INFO: renamed from: c */
    public void mo96361c(Request<?> request, VolleyError volleyError) {
        request.addMarker("post-error");
        this.f68812a.execute(new RunnableC15664b(request, C0922d.m5105a(volleyError), null));
    }
}
