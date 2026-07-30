package com.android.volley;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import p149l.ixc0;
import p149l.yuc0;

/* JADX INFO: renamed from: com.android.volley.f */
/* JADX INFO: loaded from: classes.dex */
class C0920f implements Request.InterfaceC0914b {

    /* JADX INFO: renamed from: b */
    private final ixc0 f4180b;

    /* JADX INFO: renamed from: d */
    @Nullable
    private final C0916b f4182d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private final BlockingQueue<Request<?>> f4183e;

    /* JADX INFO: renamed from: a */
    private final Map<String, List<Request<?>>> f4179a = new HashMap();

    /* JADX INFO: renamed from: c */
    @Nullable
    private final yuc0 f4181c = null;

    public C0920f(@NonNull C0916b c0916b, @NonNull BlockingQueue<Request<?>> blockingQueue, ixc0 ixc0Var) {
        this.f4180b = ixc0Var;
        this.f4182d = c0916b;
        this.f4183e = blockingQueue;
    }

    @Override // com.android.volley.Request.InterfaceC0914b
    /* JADX INFO: renamed from: a */
    public synchronized void mo5079a(Request<?> request) {
        BlockingQueue<Request<?>> blockingQueue;
        try {
            String cacheKey = request.getCacheKey();
            List<Request<?>> listRemove = this.f4179a.remove(cacheKey);
            if (listRemove != null && !listRemove.isEmpty()) {
                if (C0919e.f4171b) {
                    C0919e.m5102e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), cacheKey);
                }
                Request<?> requestRemove = listRemove.remove(0);
                this.f4179a.put(cacheKey, listRemove);
                requestRemove.setNetworkRequestCompleteListener(this);
                yuc0 yuc0Var = this.f4181c;
                if (yuc0Var != null) {
                    yuc0Var.m216104f(requestRemove);
                } else if (this.f4182d != null && (blockingQueue = this.f4183e) != null) {
                    try {
                        blockingQueue.put(requestRemove);
                    } catch (InterruptedException e) {
                        C0919e.m5100c("Couldn't add request to queue. %s", e.toString());
                        Thread.currentThread().interrupt();
                        this.f4182d.m5089d();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.Request.InterfaceC0914b
    /* JADX INFO: renamed from: b */
    public void mo5080b(Request<?> request, C0918d<?> c0918d) {
        List<Request<?>> listRemove;
        InterfaceC0915a.a aVar = c0918d.f4167b;
        if (aVar == null || aVar.m5083a()) {
            mo5079a(request);
            return;
        }
        String cacheKey = request.getCacheKey();
        synchronized (this) {
            listRemove = this.f4179a.remove(cacheKey);
        }
        if (listRemove != null) {
            if (C0919e.f4171b) {
                C0919e.m5102e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), cacheKey);
            }
            Iterator<Request<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.f4180b.mo138805a(it.next(), c0918d);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m5107c(Request<?> request) {
        try {
            String cacheKey = request.getCacheKey();
            boolean zContainsKey = this.f4179a.containsKey(cacheKey);
            Map<String, List<Request<?>>> map = this.f4179a;
            if (!zContainsKey) {
                map.put(cacheKey, null);
                request.setNetworkRequestCompleteListener(this);
                if (C0919e.f4171b) {
                    C0919e.m5099b("new request, sending to network %s", cacheKey);
                }
                return false;
            }
            List<Request<?>> arrayList = map.get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            request.addMarker("waiting-for-response");
            arrayList.add(request);
            this.f4179a.put(cacheKey, arrayList);
            if (C0919e.f4171b) {
                C0919e.m5099b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
