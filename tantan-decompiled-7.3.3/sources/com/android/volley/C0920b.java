package com.android.volley;

import android.os.Process;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.BlockingQueue;
import p153l.cl20;
import p153l.m5d0;

/* JADX INFO: renamed from: com.android.volley.b */
/* JADX INFO: loaded from: classes.dex */
public class C0920b extends Thread {

    /* JADX INFO: renamed from: g */
    private static final boolean f4152g = C0923e.f4171b;

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<Request<?>> f4153a;

    /* JADX INFO: renamed from: b */
    private final BlockingQueue<Request<?>> f4154b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0919a f4155c;

    /* JADX INFO: renamed from: d */
    private final m5d0 f4156d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f4157e = false;

    /* JADX INFO: renamed from: f */
    private final C0924f f4158f;

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
                C0920b.this.f4154b.put(this.f4159a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public C0920b(BlockingQueue<Request<?>> blockingQueue, BlockingQueue<Request<?>> blockingQueue2, InterfaceC0919a interfaceC0919a, m5d0 m5d0Var) {
        this.f4153a = blockingQueue;
        this.f4154b = blockingQueue2;
        this.f4155c = interfaceC0919a;
        this.f4156d = m5d0Var;
        this.f4158f = new C0924f(this, blockingQueue2, m5d0Var);
    }

    /* JADX INFO: renamed from: b */
    private void m5097b() throws InterruptedException {
        m5098c(this.f4153a.take());
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public void m5098c(Request<?> request) throws InterruptedException {
        request.addMarker("cache-queue-take");
        request.sendEvent(1);
        try {
            if (request.isCanceled()) {
                request.finish("cache-discard-canceled");
                return;
            }
            InterfaceC0919a.a aVar = this.f4155c.get(request.getCacheKey());
            if (aVar == null) {
                request.addMarker("cache-miss");
                if (!this.f4158f.m5117c(request)) {
                    this.f4154b.put(request);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.m5094b(jCurrentTimeMillis)) {
                request.addMarker("cache-hit-expired");
                request.setCacheEntry(aVar);
                if (!this.f4158f.m5117c(request)) {
                    this.f4154b.put(request);
                }
                return;
            }
            request.addMarker("cache-hit");
            C0922d<?> networkResponse = request.parseNetworkResponse(new cl20(aVar.f4144a, aVar.f4150g));
            request.addMarker("cache-hit-parsed");
            if (!networkResponse.m5107b()) {
                request.addMarker("cache-parsing-failed");
                this.f4155c.mo5091a(request.getCacheKey(), true);
                request.setCacheEntry(null);
                if (!this.f4158f.m5117c(request)) {
                    this.f4154b.put(request);
                }
                return;
            }
            if (aVar.m5095c(jCurrentTimeMillis)) {
                request.addMarker("cache-hit-refresh-needed");
                request.setCacheEntry(aVar);
                networkResponse.f4169d = true;
                boolean zM5117c = this.f4158f.m5117c(request);
                m5d0 m5d0Var = this.f4156d;
                if (zM5117c) {
                    m5d0Var.mo96359a(request, networkResponse);
                } else {
                    m5d0Var.mo96360b(request, networkResponse, new a(request));
                }
            } else {
                this.f4156d.mo96359a(request, networkResponse);
            }
        } finally {
            request.sendEvent(2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5099d() {
        this.f4157e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f4152g) {
            C0923e.m5112e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f4155c.initialize();
        while (true) {
            try {
                m5097b();
            } catch (InterruptedException unused) {
                if (this.f4157e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C0923e.m5110c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
