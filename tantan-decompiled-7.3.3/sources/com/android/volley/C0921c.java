package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.BlockingQueue;
import p153l.cl20;
import p153l.lj20;
import p153l.m5d0;

/* JADX INFO: renamed from: com.android.volley.c */
/* JADX INFO: loaded from: classes.dex */
public class C0921c extends Thread {

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<Request<?>> f4161a;

    /* JADX INFO: renamed from: b */
    private final lj20 f4162b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0919a f4163c;

    /* JADX INFO: renamed from: d */
    private final m5d0 f4164d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f4165e = false;

    public C0921c(BlockingQueue<Request<?>> blockingQueue, lj20 lj20Var, InterfaceC0919a interfaceC0919a, m5d0 m5d0Var) {
        this.f4161a = blockingQueue;
        this.f4162b = lj20Var;
        this.f4163c = interfaceC0919a;
        this.f4164d = m5d0Var;
    }

    @TargetApi(14)
    /* JADX INFO: renamed from: a */
    private void m5100a(Request<?> request) {
        TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
    }

    /* JADX INFO: renamed from: b */
    private void m5101b(Request<?> request, VolleyError volleyError) {
        this.f4164d.mo96361c(request, request.parseNetworkError(volleyError));
    }

    /* JADX INFO: renamed from: c */
    private void m5102c() throws InterruptedException {
        m5103d(this.f4161a.take());
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public void m5103d(Request<?> request) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        request.sendEvent(3);
        try {
            request.addMarker("network-queue-take");
            if (request.isCanceled()) {
                request.finish("network-discard-cancelled");
                request.notifyListenerResponseNotUsable();
                return;
            }
            m5100a(request);
            cl20 cl20VarMo154456a = this.f4162b.mo154456a(request);
            request.addMarker("network-http-complete");
            if (cl20VarMo154456a.f82342e && request.hasHadResponseDelivered()) {
                request.finish("not-modified");
                request.notifyListenerResponseNotUsable();
                return;
            }
            C0922d<?> networkResponse = request.parseNetworkResponse(cl20VarMo154456a);
            request.addMarker("network-parse-complete");
            if (request.shouldCache() && networkResponse.f4167b != null) {
                this.f4163c.mo5092b(request.getCacheKey(), networkResponse.f4167b);
                request.addMarker("network-cache-written");
            }
            request.markDelivered();
            this.f4164d.mo96359a(request, networkResponse);
            request.notifyListenerResponseReceived(networkResponse);
        } catch (VolleyError e) {
            e.setNetworkTimeMs(SystemClock.elapsedRealtime() - jElapsedRealtime);
            m5101b(request, e);
            request.notifyListenerResponseNotUsable();
        } catch (Exception e2) {
            C0923e.m5111d(e2, "Unhandled exception %s", e2.toString());
            VolleyError volleyError = new VolleyError(e2);
            volleyError.setNetworkTimeMs(SystemClock.elapsedRealtime() - jElapsedRealtime);
            this.f4164d.mo96361c(request, volleyError);
            request.notifyListenerResponseNotUsable();
        } finally {
            request.sendEvent(4);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5104e() {
        this.f4165e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m5102c();
            } catch (InterruptedException unused) {
                if (this.f4165e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C0923e.m5110c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
