package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p153l.y1d0;

/* JADX INFO: renamed from: com.bumptech.glide.request.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1130a implements RequestCoordinator, y1d0 {

    /* JADX INFO: renamed from: a */
    private final Object f4727a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private final RequestCoordinator f4728b;

    /* JADX INFO: renamed from: c */
    private volatile y1d0 f4729c;

    /* JADX INFO: renamed from: d */
    private volatile y1d0 f4730d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState f4731e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState f4732f;

    public C1130a(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f4731e = requestState;
        this.f4732f = requestState;
        this.f4727a = obj;
        this.f4728b = requestCoordinator;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: a */
    private boolean m5700a(y1d0 y1d0Var) {
        if (y1d0Var.equals(this.f4729c)) {
            return true;
        }
        return this.f4731e == RequestCoordinator.RequestState.FAILED && y1d0Var.equals(this.f4730d);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: k */
    private boolean m5701k() {
        RequestCoordinator requestCoordinator = this.f4728b;
        return requestCoordinator == null || requestCoordinator.mo5669c(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: l */
    private boolean m5702l() {
        RequestCoordinator requestCoordinator = this.f4728b;
        return requestCoordinator == null || requestCoordinator.mo5673i(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: m */
    private boolean m5703m() {
        RequestCoordinator requestCoordinator = this.f4728b;
        return requestCoordinator == null || requestCoordinator.mo5672h(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p153l.y1d0
    /* JADX INFO: renamed from: b */
    public boolean mo5668b() {
        boolean z;
        synchronized (this.f4727a) {
            try {
                z = this.f4729c.mo5668b() || this.f4730d.mo5668b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: c */
    public boolean mo5669c(y1d0 y1d0Var) {
        boolean z;
        synchronized (this.f4727a) {
            try {
                z = m5701k() && m5700a(y1d0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p153l.y1d0
    public void clear() {
        synchronized (this.f4727a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f4731e = requestState;
                this.f4729c.clear();
                if (this.f4732f != requestState) {
                    this.f4732f = requestState;
                    this.f4730d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: d */
    public void mo5670d(y1d0 y1d0Var) {
        synchronized (this.f4727a) {
            try {
                if (y1d0Var.equals(this.f4730d)) {
                    this.f4732f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f4728b;
                    if (requestCoordinator != null) {
                        requestCoordinator.mo5670d(this);
                    }
                    return;
                }
                this.f4731e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f4732f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f4732f = requestState2;
                    this.f4730d.mo5699j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.y1d0
    /* JADX INFO: renamed from: e */
    public boolean mo5696e() {
        boolean z;
        synchronized (this.f4727a) {
            try {
                RequestCoordinator.RequestState requestState = this.f4731e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z = requestState == requestState2 && this.f4732f == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: f */
    public void mo5671f(y1d0 y1d0Var) {
        synchronized (this.f4727a) {
            try {
                if (y1d0Var.equals(this.f4729c)) {
                    this.f4731e = RequestCoordinator.RequestState.SUCCESS;
                } else if (y1d0Var.equals(this.f4730d)) {
                    this.f4732f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f4728b;
                if (requestCoordinator != null) {
                    requestCoordinator.mo5671f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.y1d0
    /* JADX INFO: renamed from: g */
    public boolean mo5698g(y1d0 y1d0Var) {
        if (y1d0Var instanceof C1130a) {
            C1130a c1130a = (C1130a) y1d0Var;
            if (this.f4729c.mo5698g(c1130a.f4729c) && this.f4730d.mo5698g(c1130a.f4730d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.request.RequestCoordinator] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        ?? root;
        synchronized (this.f4727a) {
            try {
                RequestCoordinator requestCoordinator = this.f4728b;
                this = this;
                if (requestCoordinator != null) {
                    root = requestCoordinator.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: h */
    public boolean mo5672h(y1d0 y1d0Var) {
        boolean z;
        synchronized (this.f4727a) {
            try {
                z = m5703m() && m5700a(y1d0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: i */
    public boolean mo5673i(y1d0 y1d0Var) {
        boolean z;
        synchronized (this.f4727a) {
            try {
                z = m5702l() && m5700a(y1d0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p153l.y1d0
    public boolean isComplete() {
        boolean z;
        synchronized (this.f4727a) {
            try {
                RequestCoordinator.RequestState requestState = this.f4731e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z = requestState == requestState2 || this.f4732f == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p153l.y1d0
    public boolean isRunning() {
        boolean z;
        synchronized (this.f4727a) {
            try {
                RequestCoordinator.RequestState requestState = this.f4731e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z = requestState == requestState2 || this.f4732f == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p153l.y1d0
    /* JADX INFO: renamed from: j */
    public void mo5699j() {
        synchronized (this.f4727a) {
            try {
                RequestCoordinator.RequestState requestState = this.f4731e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f4731e = requestState2;
                    this.f4729c.mo5699j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m5704n(y1d0 y1d0Var, y1d0 y1d0Var2) {
        this.f4729c = y1d0Var;
        this.f4730d = y1d0Var2;
    }

    @Override // p153l.y1d0
    public void pause() {
        synchronized (this.f4727a) {
            try {
                RequestCoordinator.RequestState requestState = this.f4731e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f4731e = RequestCoordinator.RequestState.PAUSED;
                    this.f4729c.pause();
                }
                if (this.f4732f == requestState2) {
                    this.f4732f = RequestCoordinator.RequestState.PAUSED;
                    this.f4730d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
