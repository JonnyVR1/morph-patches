package com.android.volley;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import p153l.b3d0;
import p153l.m5d0;

/* JADX INFO: renamed from: com.android.volley.f */
/* JADX INFO: loaded from: classes.dex */
class C0924f implements Request.InterfaceC0918b {

    /* JADX INFO: renamed from: b */
    private final m5d0 f4180b;

    /* JADX INFO: renamed from: d */
    @Nullable
    private final C0920b f4182d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private final BlockingQueue<Request<?>> f4183e;

    /* JADX INFO: renamed from: a */
    private final Map<String, List<Request<?>>> f4179a = new HashMap();

    /* JADX INFO: renamed from: c */
    @Nullable
    private final b3d0 f4181c = null;

    public C0924f(@NonNull C0920b c0920b, @NonNull BlockingQueue<Request<?>> blockingQueue, m5d0 m5d0Var) {
        this.f4180b = m5d0Var;
        this.f4182d = c0920b;
        this.f4183e = blockingQueue;
    }

    @Override // com.android.volley.Request.InterfaceC0918b
    /* JADX INFO: renamed from: a */
    public synchronized void mo5089a(Request<?> request) {
        BlockingQueue<Request<?>> blockingQueue;
        try {
            String cacheKey = request.getCacheKey();
            List<Request<?>> listRemove = this.f4179a.remove(cacheKey);
            if (listRemove != null && !listRemove.isEmpty()) {
                if (C0923e.f4171b) {
                    C0923e.m5112e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), cacheKey);
                }
                Request<?> requestRemove = listRemove.remove(0);
                this.f4179a.put(cacheKey, listRemove);
                requestRemove.setNetworkRequestCompleteListener(this);
                b3d0 b3d0Var = this.f4181c;
                if (b3d0Var != null) {
                    b3d0Var.m102283f(requestRemove);
                } else if (this.f4182d != null && (blockingQueue = this.f4183e) != null) {
                    try {
                        blockingQueue.put(requestRemove);
                    } catch (InterruptedException e) {
                        C0923e.m5110c("Couldn't add request to queue. %s", e.toString());
                        Thread.currentThread().interrupt();
                        this.f4182d.m5099d();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.Request.InterfaceC0918b
    /* JADX INFO: renamed from: b */
    public void mo5090b(Request<?> request, C0922d<?> c0922d) {
        List<Request<?>> listRemove;
        InterfaceC0919a.a aVar = c0922d.f4167b;
        if (aVar == null || aVar.m5093a()) {
            mo5089a(request);
            return;
        }
        String cacheKey = request.getCacheKey();
        synchronized (this) {
            listRemove = this.f4179a.remove(cacheKey);
        }
        if (listRemove != null) {
            if (C0923e.f4171b) {
                C0923e.m5112e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), cacheKey);
            }
            Iterator<Request<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.f4180b.mo96359a(it.next(), c0922d);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m5117c(Request<?> request) {
        try {
            String cacheKey = request.getCacheKey();
            boolean zContainsKey = this.f4179a.containsKey(cacheKey);
            Map<String, List<Request<?>>> map = this.f4179a;
            if (!zContainsKey) {
                map.put(cacheKey, null);
                request.setNetworkRequestCompleteListener(this);
                if (C0923e.f4171b) {
                    C0923e.m5109b("new request, sending to network %s", cacheKey);
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
            if (C0923e.f4171b) {
                C0923e.m5109b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
