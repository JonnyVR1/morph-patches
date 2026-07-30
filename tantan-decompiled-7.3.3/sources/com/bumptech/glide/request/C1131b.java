package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p153l.y1d0;

/* JADX INFO: renamed from: com.bumptech.glide.request.b */
/* JADX INFO: loaded from: classes.dex */
public class C1131b implements RequestCoordinator, y1d0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    private final RequestCoordinator f4733a;

    /* JADX INFO: renamed from: b */
    private final Object f4734b;

    /* JADX INFO: renamed from: c */
    private volatile y1d0 f4735c;

    /* JADX INFO: renamed from: d */
    private volatile y1d0 f4736d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState f4737e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState f4738f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("requestLock")
    private boolean f4739g;

    public C1131b(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f4737e = requestState;
        this.f4738f = requestState;
        this.f4734b = obj;
        this.f4733a = requestCoordinator;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: a */
    private boolean m5705a() {
        RequestCoordinator requestCoordinator = this.f4733a;
        return requestCoordinator == null || requestCoordinator.mo5669c(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: k */
    private boolean m5706k() {
        RequestCoordinator requestCoordinator = this.f4733a;
        return requestCoordinator == null || requestCoordinator.mo5673i(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: l */
    private boolean m5707l() {
        RequestCoordinator requestCoordinator = this.f4733a;
        return requestCoordinator == null || requestCoordinator.mo5672h(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, p153l.y1d0
    /* JADX INFO: renamed from: b */
    public boolean mo5668b() {
        boolean z;
        synchronized (this.f4734b) {
            try {
                z = this.f4736d.mo5668b() || this.f4735c.mo5668b();
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
        synchronized (this.f4734b) {
            try {
                z = m5705a() && y1d0Var.equals(this.f4735c) && this.f4737e != RequestCoordinator.RequestState.PAUSED;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p153l.y1d0
    public void clear() {
        synchronized (this.f4734b) {
            this.f4739g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f4737e = requestState;
            this.f4738f = requestState;
            this.f4736d.clear();
            this.f4735c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: d */
    public void mo5670d(y1d0 y1d0Var) {
        synchronized (this.f4734b) {
            try {
                if (!y1d0Var.equals(this.f4735c)) {
                    this.f4738f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f4737e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f4733a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo5670d(this);
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
        synchronized (this.f4734b) {
            z = this.f4737e == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* JADX INFO: renamed from: f */
    public void mo5671f(y1d0 y1d0Var) {
        synchronized (this.f4734b) {
            try {
                if (y1d0Var.equals(this.f4736d)) {
                    this.f4738f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f4737e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f4733a;
                if (requestCoordinator != null) {
                    requestCoordinator.mo5671f(this);
                }
                if (!this.f4738f.isComplete()) {
                    this.f4736d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.y1d0
    /* JADX INFO: renamed from: g */
    public boolean mo5698g(y1d0 y1d0Var) {
        if (y1d0Var instanceof C1131b) {
            C1131b c1131b = (C1131b) y1d0Var;
            if (this.f4735c != null ? this.f4735c.mo5698g(c1131b.f4735c) : c1131b.f4735c == null) {
                if (this.f4736d == null) {
                    if (c1131b.f4736d == null) {
                        return true;
                    }
                } else if (this.f4736d.mo5698g(c1131b.f4736d)) {
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
        synchronized (this.f4734b) {
            try {
                RequestCoordinator requestCoordinator = this.f4733a;
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
        synchronized (this.f4734b) {
            try {
                z = m5707l() && (y1d0Var.equals(this.f4735c) || this.f4737e != RequestCoordinator.RequestState.SUCCESS);
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
        synchronized (this.f4734b) {
            try {
                z = m5706k() && y1d0Var.equals(this.f4735c) && !mo5668b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p153l.y1d0
    public boolean isComplete() {
        boolean z;
        synchronized (this.f4734b) {
            z = this.f4737e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // p153l.y1d0
    public boolean isRunning() {
        boolean z;
        synchronized (this.f4734b) {
            z = this.f4737e == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // p153l.y1d0
    /* JADX INFO: renamed from: j */
    public void mo5699j() {
        synchronized (this.f4734b) {
            try {
                this.f4739g = true;
                try {
                    if (this.f4737e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f4738f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f4738f = requestState2;
                            this.f4736d.mo5699j();
                        }
                    }
                    if (this.f4739g) {
                        RequestCoordinator.RequestState requestState3 = this.f4737e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f4737e = requestState4;
                            this.f4735c.mo5699j();
                        }
                    }
                    this.f4739g = false;
                } catch (Throwable th) {
                    this.f4739g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m5708m(y1d0 y1d0Var, y1d0 y1d0Var2) {
        this.f4735c = y1d0Var;
        this.f4736d = y1d0Var2;
    }

    @Override // p153l.y1d0
    public void pause() {
        synchronized (this.f4734b) {
            try {
                if (!this.f4738f.isComplete()) {
                    this.f4738f = RequestCoordinator.RequestState.PAUSED;
                    this.f4736d.pause();
                }
                if (!this.f4737e.isComplete()) {
                    this.f4737e = RequestCoordinator.RequestState.PAUSED;
                    this.f4735c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
