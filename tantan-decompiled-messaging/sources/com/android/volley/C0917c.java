package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.BlockingQueue;
import p149l.cb20;
import p149l.ixc0;
import p149l.sc20;

/* JADX INFO: renamed from: com.android.volley.c */
/* JADX INFO: loaded from: classes.dex */
public class C0917c extends Thread {

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<Request<?>> f4161a;

    /* JADX INFO: renamed from: b */
    private final cb20 f4162b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0915a f4163c;

    /* JADX INFO: renamed from: d */
    private final ixc0 f4164d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f4165e = false;

    public C0917c(BlockingQueue<Request<?>> blockingQueue, cb20 cb20Var, InterfaceC0915a interfaceC0915a, ixc0 ixc0Var) {
        this.f4161a = blockingQueue;
        this.f4162b = cb20Var;
        this.f4163c = interfaceC0915a;
        this.f4164d = ixc0Var;
    }

    @TargetApi(14)
    /* JADX INFO: renamed from: a */
    private void m5090a(Request<?> request) {
        TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
    }

    /* JADX INFO: renamed from: b */
    private void m5091b(Request<?> request, VolleyError volleyError) {
        this.f4164d.mo138807c(request, request.parseNetworkError(volleyError));
    }

    /* JADX INFO: renamed from: c */
    private void m5092c() throws InterruptedException {
        m5093d(this.f4161a.take());
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public void m5093d(Request<?> request) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        request.sendEvent(3);
        try {
            request.addMarker("network-queue-take");
            if (request.isCanceled()) {
                request.finish("network-discard-cancelled");
                request.notifyListenerResponseNotUsable();
                return;
            }
            m5090a(request);
            sc20 sc20VarMo105963a = this.f4162b.mo105963a(request);
            request.addMarker("network-http-complete");
            if (sc20VarMo105963a.f163702e && request.hasHadResponseDelivered()) {
                request.finish("not-modified");
                request.notifyListenerResponseNotUsable();
                return;
            }
            C0918d<?> networkResponse = request.parseNetworkResponse(sc20VarMo105963a);
            request.addMarker("network-parse-complete");
            if (request.shouldCache() && networkResponse.f4167b != null) {
                this.f4163c.mo5082b(request.getCacheKey(), networkResponse.f4167b);
                request.addMarker("network-cache-written");
            }
            request.markDelivered();
            this.f4164d.mo138805a(request, networkResponse);
            request.notifyListenerResponseReceived(networkResponse);
        } catch (VolleyError e) {
            e.setNetworkTimeMs(SystemClock.elapsedRealtime() - jElapsedRealtime);
            m5091b(request, e);
            request.notifyListenerResponseNotUsable();
        } catch (Exception e2) {
            C0919e.m5101d(e2, "Unhandled exception %s", e2.toString());
            VolleyError volleyError = new VolleyError(e2);
            volleyError.setNetworkTimeMs(SystemClock.elapsedRealtime() - jElapsedRealtime);
            this.f4164d.mo138807c(request, volleyError);
            request.notifyListenerResponseNotUsable();
        } finally {
            request.sendEvent(4);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5094e() {
        this.f4165e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m5092c();
            } catch (InterruptedException unused) {
                if (this.f4165e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C0919e.m5100c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
