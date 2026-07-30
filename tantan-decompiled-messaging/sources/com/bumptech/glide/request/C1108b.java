package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p149l.ttc0;

/* JADX INFO: renamed from: com.bumptech.glide.request.b */
/* JADX INFO: loaded from: classes.dex */
public class C1108b implements RequestCoordinator, ttc0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    private final RequestCoordinator f4696a;

    /* JADX INFO: renamed from: b */
    private final Object f4697b;

    /* JADX INFO: renamed from: c */
    private volatile ttc0 f4698c;

    /* JADX INFO: renamed from: d */
    private volatile ttc0 f4699d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState f4700e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState f4701f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("requestLock")
    private boolean f4702g;

    public C1108b(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f4700e = requestState;
        this.f4701f = requestState;
        this.f4697b = obj;
        this.f4696a = requestCoordinator;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: j */
    private boolean m5651j() {
        RequestCoordinator requestCoordinator = this.f4696a;
        return requestCoordinator == null || requestCoordinator.mo5616b(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: k */
    private boolean m5652k() {
        RequestCoordinator requestCoordinator = this.f4696a;
        return requestCoordinator == null || requestCoordinator.mo5620h(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: l */
    private boolean m5653l() {
        RequestCoordinator requestCoordinator = this.f4696a;
        return requestCoordinator == null || requestCoordinator.mo5619f(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p149l.ttc0
    /* JADX INFO: renamed from: a */
    public boolean mo5615a() {
        boolean z;
        synchronized (this.f4697b) {
            try {
                z = this.f4699d.mo5615a() || this.f4698c.mo5615a();
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
        synchronized (this.f4697b) {
            try {
                z = m5651j() && ttc0Var.equals(this.f4698c) && this.f4700e != RequestCoordinator.RequestState.PAUSED;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: c */
    public void mo5617c(ttc0 ttc0Var) {
        synchronized (this.f4697b) {
            try {
                if (!ttc0Var.equals(this.f4698c)) {
                    this.f4701f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f4700e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f4696a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo5617c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ttc0
    public void clear() {
        synchronized (this.f4697b) {
            this.f4702g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f4700e = requestState;
            this.f4701f = requestState;
            this.f4699d.clear();
            this.f4698c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: d */
    public void mo5618d(ttc0 ttc0Var) {
        synchronized (this.f4697b) {
            try {
                if (ttc0Var.equals(this.f4699d)) {
                    this.f4701f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f4700e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f4696a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo5618d(this);
                }
                if (!this.f4701f.isComplete()) {
                    this.f4699d.clear();
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
        synchronized (this.f4697b) {
            z = this.f4700e == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: f */
    public boolean mo5619f(ttc0 ttc0Var) {
        boolean z;
        synchronized (this.f4697b) {
            try {
                z = m5653l() && (ttc0Var.equals(this.f4698c) || this.f4700e != RequestCoordinator.RequestState.SUCCESS);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p149l.ttc0
    /* JADX INFO: renamed from: g */
    public boolean mo5644g(ttc0 ttc0Var) {
        if (ttc0Var instanceof C1108b) {
            C1108b c1108b = (C1108b) ttc0Var;
            if (this.f4698c != null ? this.f4698c.mo5644g(c1108b.f4698c) : c1108b.f4698c == null) {
                if (this.f4699d == null) {
                    if (c1108b.f4699d == null) {
                        return true;
                    }
                } else if (this.f4699d.mo5644g(c1108b.f4699d)) {
                    return true;
                }
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
        synchronized (this.f4697b) {
            try {
                RequestCoordinator requestCoordinator = this.f4696a;
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
        synchronized (this.f4697b) {
            try {
                z = m5652k() && ttc0Var.equals(this.f4698c) && !mo5615a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p149l.ttc0
    /* JADX INFO: renamed from: i */
    public void mo5645i() {
        synchronized (this.f4697b) {
            try {
                this.f4702g = true;
                try {
                    if (this.f4700e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f4701f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f4701f = requestState2;
                            this.f4699d.mo5645i();
                        }
                    }
                    if (this.f4702g) {
                        RequestCoordinator.RequestState requestState3 = this.f4700e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f4700e = requestState4;
                            this.f4698c.mo5645i();
                        }
                    }
                    this.f4702g = false;
                } catch (Throwable th) {
                    this.f4702g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p149l.ttc0
    public boolean isComplete() {
        boolean z;
        synchronized (this.f4697b) {
            z = this.f4700e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // p149l.ttc0
    public boolean isRunning() {
        boolean z;
        synchronized (this.f4697b) {
            z = this.f4700e == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public void m5654m(ttc0 ttc0Var, ttc0 ttc0Var2) {
        this.f4698c = ttc0Var;
        this.f4699d = ttc0Var2;
    }

    @Override // p149l.ttc0
    public void pause() {
        synchronized (this.f4697b) {
            try {
                if (!this.f4701f.isComplete()) {
                    this.f4701f = RequestCoordinator.RequestState.PAUSED;
                    this.f4699d.pause();
                }
                if (!this.f4700e.isComplete()) {
                    this.f4700e = RequestCoordinator.RequestState.PAUSED;
                    this.f4698c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
