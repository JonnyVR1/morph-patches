package p153l;

/* JADX INFO: loaded from: classes3.dex */
public final class xk90 implements vk90 {

    /* JADX INFO: renamed from: g */
    public static final vk90 f194728g = new C21359a();

    /* JADX INFO: renamed from: a */
    public long f194729a;

    /* JADX INFO: renamed from: b */
    public vk90 f194730b;

    /* JADX INFO: renamed from: c */
    public boolean f194731c;

    /* JADX INFO: renamed from: d */
    public long f194732d;

    /* JADX INFO: renamed from: e */
    public long f194733e;

    /* JADX INFO: renamed from: f */
    public vk90 f194734f;

    /* JADX INFO: renamed from: a */
    public void m211354a() {
        while (true) {
            synchronized (this) {
                try {
                    long j = this.f194732d;
                    long j2 = this.f194733e;
                    vk90 vk90Var = this.f194734f;
                    if (j == 0 && j2 == 0 && vk90Var == null) {
                        this.f194731c = false;
                        return;
                    }
                    this.f194732d = 0L;
                    this.f194733e = 0L;
                    this.f194734f = null;
                    long j3 = this.f194729a;
                    if (j3 != Long.MAX_VALUE) {
                        long j4 = j3 + j;
                        if (j4 < 0 || j4 == Long.MAX_VALUE) {
                            this.f194729a = Long.MAX_VALUE;
                            j3 = Long.MAX_VALUE;
                        } else {
                            j3 = j4 - j2;
                            if (j3 < 0) {
                                wtq0.m207906a("more produced than requested");
                                return;
                            }
                            this.f194729a = j3;
                        }
                    }
                    if (vk90Var == null) {
                        vk90 vk90Var2 = this.f194730b;
                        if (vk90Var2 != null && j != 0) {
                            vk90Var2.request(j);
                        }
                    } else if (vk90Var == f194728g) {
                        this.f194730b = null;
                    } else {
                        this.f194730b = vk90Var;
                        vk90Var.request(j3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m211355b(long j) {
        if (j <= 0) {
            wg3.m206174a("n > 0 required");
            return;
        }
        synchronized (this) {
            try {
                if (this.f194731c) {
                    this.f194733e += j;
                    return;
                }
                this.f194731c = true;
                try {
                    long j2 = this.f194729a;
                    if (j2 != Long.MAX_VALUE) {
                        long j3 = j2 - j;
                        if (j3 < 0) {
                            throw new IllegalStateException("more items arrived than were requested");
                        }
                        this.f194729a = j3;
                    }
                    m211354a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f194731c = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m211356c(vk90 vk90Var) {
        synchronized (this) {
            try {
                if (this.f194731c) {
                    if (vk90Var == null) {
                        vk90Var = f194728g;
                    }
                    this.f194734f = vk90Var;
                    return;
                }
                this.f194731c = true;
                try {
                    this.f194730b = vk90Var;
                    if (vk90Var != null) {
                        vk90Var.request(this.f194729a);
                    }
                    m211354a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f194731c = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p153l.vk90
    public void request(long j) {
        if (j < 0) {
            wg3.m206174a("n >= 0 required");
            return;
        }
        if (j == 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f194731c) {
                    this.f194732d += j;
                    return;
                }
                this.f194731c = true;
                try {
                    long j2 = this.f194729a + j;
                    if (j2 < 0) {
                        j2 = Long.MAX_VALUE;
                    }
                    this.f194729a = j2;
                    vk90 vk90Var = this.f194730b;
                    if (vk90Var != null) {
                        vk90Var.request(j);
                    }
                    m211354a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f194731c = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l.xk90$a */
    public static class C21359a implements vk90 {
        @Override // p153l.vk90
        public void request(long j) {
        }
    }
}
