package com.android.volley;

import android.os.Process;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.BlockingQueue;
import p149l.ixc0;
import p149l.sc20;

/* JADX INFO: renamed from: com.android.volley.b */
/* JADX INFO: loaded from: classes.dex */
public class C0916b extends Thread {

    /* JADX INFO: renamed from: g */
    private static final boolean f4152g = C0919e.f4171b;

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<Request<?>> f4153a;

    /* JADX INFO: renamed from: b */
    private final BlockingQueue<Request<?>> f4154b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0915a f4155c;

    /* JADX INFO: renamed from: d */
    private final ixc0 f4156d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f4157e = false;

    /* JADX INFO: renamed from: f */
    private final C0920f f4158f;

    /* JADX INFO: renamed from: com.android.volley.b$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Request f4159a;

        public a(Request request) {
            this.f4159a = request;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0916b.this.f4154b.put(this.f4159a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public C0916b(BlockingQueue<Request<?>> blockingQueue, BlockingQueue<Request<?>> blockingQueue2, InterfaceC0915a interfaceC0915a, ixc0 ixc0Var) {
        this.f4153a = blockingQueue;
        this.f4154b = blockingQueue2;
        this.f4155c = interfaceC0915a;
        this.f4156d = ixc0Var;
        this.f4158f = new C0920f(this, blockingQueue2, ixc0Var);
    }

    /* JADX INFO: renamed from: b */
    private void m5087b() throws InterruptedException {
        m5088c(this.f4153a.take());
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public void m5088c(Request<?> request) throws InterruptedException {
        request.addMarker("cache-queue-take");
        request.sendEvent(1);
        try {
            if (request.isCanceled()) {
                request.finish("cache-discard-canceled");
                return;
            }
            InterfaceC0915a.a aVar = this.f4155c.get(request.getCacheKey());
            if (aVar == null) {
                request.addMarker("cache-miss");
                if (!this.f4158f.m5107c(request)) {
                    this.f4154b.put(request);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.m5084b(jCurrentTimeMillis)) {
                request.addMarker("cache-hit-expired");
                request.setCacheEntry(aVar);
                if (!this.f4158f.m5107c(request)) {
                    this.f4154b.put(request);
                }
                return;
            }
            request.addMarker("cache-hit");
            C0918d<?> networkResponse = request.parseNetworkResponse(new sc20(aVar.f4144a, aVar.f4150g));
            request.addMarker("cache-hit-parsed");
            if (!networkResponse.m5097b()) {
                request.addMarker("cache-parsing-failed");
                this.f4155c.mo5081a(request.getCacheKey(), true);
                request.setCacheEntry(null);
                if (!this.f4158f.m5107c(request)) {
                    this.f4154b.put(request);
                }
                return;
            }
            if (aVar.m5085c(jCurrentTimeMillis)) {
                request.addMarker("cache-hit-refresh-needed");
                request.setCacheEntry(aVar);
                networkResponse.f4169d = true;
                boolean zM5107c = this.f4158f.m5107c(request);
                ixc0 ixc0Var = this.f4156d;
                if (zM5107c) {
                    ixc0Var.mo138805a(request, networkResponse);
                } else {
                    ixc0Var.mo138806b(request, networkResponse, new a(request));
                }
            } else {
                this.f4156d.mo138805a(request, networkResponse);
            }
        } finally {
            request.sendEvent(2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5089d() {
        this.f4157e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f4152g) {
            C0919e.m5102e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f4155c.initialize();
        while (true) {
            try {
                m5087b();
            } catch (InterruptedException unused) {
                if (this.f4157e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C0919e.m5100c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
