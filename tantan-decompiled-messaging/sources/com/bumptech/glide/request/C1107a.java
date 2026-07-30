package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p149l.ttc0;

/* JADX INFO: renamed from: com.bumptech.glide.request.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1107a implements RequestCoordinator, ttc0 {

    /* JADX INFO: renamed from: a */
    private final Object f4690a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private final RequestCoordinator f4691b;

    /* JADX INFO: renamed from: c */
    private volatile ttc0 f4692c;

    /* JADX INFO: renamed from: d */
    private volatile ttc0 f4693d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState f4694e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState f4695f;

    public C1107a(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f4694e = requestState;
        this.f4695f = requestState;
        this.f4690a = obj;
        this.f4691b = requestCoordinator;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: j */
    private boolean m5646j(ttc0 ttc0Var) {
        if (ttc0Var.equals(this.f4692c)) {
            return true;
        }
        return this.f4694e == RequestCoordinator.RequestState.FAILED && ttc0Var.equals(this.f4693d);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: k */
    private boolean m5647k() {
        RequestCoordinator requestCoordinator = this.f4691b;
        return requestCoordinator == null || requestCoordinator.mo5616b(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: l */
    private boolean m5648l() {
        RequestCoordinator requestCoordinator = this.f4691b;
        return requestCoordinator == null || requestCoordinator.mo5620h(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: m */
    private boolean m5649m() {
        RequestCoordinator requestCoordinator = this.f4691b;
        return requestCoordinator == null || requestCoordinator.mo5619f(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p149l.ttc0
    /* JADX INFO: renamed from: a */
    public boolean mo5615a() {
        boolean z;
        synchronized (this.f4690a) {
            try {
                z = this.f4692c.mo5615a() || this.f4693d.mo5615a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: b */
    public boolean mo5616b(ttc0 ttc0Var) {
        boolean z;
        synchronized (this.f4690a) {
            try {
                z = m5647k() && m5646j(ttc0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: c */
    public void mo5617c(ttc0 ttc0Var) {
        synchronized (this.f4690a) {
            try {
                if (ttc0Var.equals(this.f4693d)) {
                    this.f4695f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f4691b;
                    if (requestCoordinator != null) {
                        requestCoordinator.mo5617c(this);
                    }
                    return;
                }
                this.f4694e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f4695f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f4695f = requestState2;
                    this.f4693d.mo5645i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ttc0
    public void clear() {
        synchronized (this.f4690a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f4694e = requestState;
                this.f4692c.clear();
                if (this.f4695f != requestState) {
                    this.f4695f = requestState;
                    this.f4693d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: d */
    public void mo5618d(ttc0 ttc0Var) {
        synchronized (this.f4690a) {
            try {
                if (ttc0Var.equals(this.f4692c)) {
                    this.f4694e = RequestCoordinator.RequestState.SUCCESS;
                } else if (ttc0Var.equals(this.f4693d)) {
                    this.f4695f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f4691b;
                if (requestCoordinator != null) {
                    requestCoordinator.mo5618d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ttc0
    /* JADX INFO: renamed from: e */
    public boolean mo5642e() {
        boolean z;
        synchronized (this.f4690a) {
            try {
                RequestCoordinator.RequestState requestState = this.f4694e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z = requestState == requestState2 && this.f4695f == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: f */
    public boolean mo5619f(ttc0 ttc0Var) {
        boolean z;
        synchronized (this.f4690a) {
            try {
                z = m5649m() && m5646j(ttc0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p149l.ttc0
    /* JADX INFO: renamed from: g */
    public boolean mo5644g(ttc0 ttc0Var) {
        if (ttc0Var instanceof C1107a) {
            C1107a c1107a = (C1107a) ttc0Var;
            if (this.f4692c.mo5644g(c1107a.f4692c) && this.f4693d.mo5644g(c1107a.f4693d)) {
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
        synchronized (this.f4690a) {
            try {
                RequestCoordinator requestCoordinator = this.f4691b;
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
    public boolean mo5620h(ttc0 ttc0Var) {
        boolean z;
        synchronized (this.f4690a) {
            try {
                z = m5648l() && m5646j(ttc0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p149l.ttc0
    /* JADX INFO: renamed from: i */
    public void mo5645i() {
        synchronized (this.f4690a) {
            try {
                RequestCoordinator.RequestState requestState = this.f4694e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f4694e = requestState2;
                    this.f4692c.mo5645i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ttc0
    public boolean isComplete() {
        boolean z;
        synchronized (this.f4690a) {
            try {
                RequestCoordinator.RequestState requestState = this.f4694e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z = requestState == requestState2 || this.f4695f == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p149l.ttc0
    public boolean isRunning() {
        boolean z;
        synchronized (this.f4690a) {
            try {
                RequestCoordinator.RequestState requestState = this.f4694e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z = requestState == requestState2 || this.f4695f == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public void m5650n(ttc0 ttc0Var, ttc0 ttc0Var2) {
        this.f4692c = ttc0Var;
        this.f4693d = ttc0Var2;
    }

    @Override // p149l.ttc0
    public void pause() {
        synchronized (this.f4690a) {
            try {
                RequestCoordinator.RequestState requestState = this.f4694e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f4694e = RequestCoordinator.RequestState.PAUSED;
                    this.f4692c.pause();
                }
                if (this.f4695f == requestState2) {
                    this.f4695f = RequestCoordinator.RequestState.PAUSED;
                    this.f4693d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
