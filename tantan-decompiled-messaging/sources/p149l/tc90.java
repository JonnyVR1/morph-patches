package p149l;

/* JADX INFO: loaded from: classes3.dex */
public final class tc90 implements rc90 {

    /* JADX INFO: renamed from: g */
    public static final rc90 f169424g = new C20144a();

    /* JADX INFO: renamed from: a */
    public long f169425a;

    /* JADX INFO: renamed from: b */
    public rc90 f169426b;

    /* JADX INFO: renamed from: c */
    public boolean f169427c;

    /* JADX INFO: renamed from: d */
    public long f169428d;

    /* JADX INFO: renamed from: e */
    public long f169429e;

    /* JADX INFO: renamed from: f */
    public rc90 f169430f;

    /* JADX INFO: renamed from: a */
    public void m187979a() {
        while (true) {
            synchronized (this) {
                try {
                    long j = this.f169428d;
                    long j2 = this.f169429e;
                    rc90 rc90Var = this.f169430f;
                    if (j == 0 && j2 == 0 && rc90Var == null) {
                        this.f169427c = false;
                        return;
                    }
                    this.f169428d = 0L;
                    this.f169429e = 0L;
                    this.f169430f = null;
                    long j3 = this.f169425a;
                    if (j3 != Long.MAX_VALUE) {
                        long j4 = j3 + j;
                        if (j4 < 0 || j4 == Long.MAX_VALUE) {
                            this.f169425a = Long.MAX_VALUE;
                            j3 = Long.MAX_VALUE;
                        } else {
                            j3 = j4 - j2;
                            if (j3 < 0) {
                                qkq0.m175383a("more produced than requested");
                                return;
                            }
                            this.f169425a = j3;
                        }
                    }
                    if (rc90Var == null) {
                        rc90 rc90Var2 = this.f169426b;
                        if (rc90Var2 != null && j != 0) {
                            rc90Var2.request(j);
                        }
                    } else if (rc90Var == f169424g) {
                        this.f169426b = null;
                    } else {
                        this.f169426b = rc90Var;
                        rc90Var.request(j3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m187980b(long j) {
        if (j <= 0) {
            ig3.m135964a("n > 0 required");
            return;
        }
        synchronized (this) {
            try {
                if (this.f169427c) {
                    this.f169429e += j;
                    return;
                }
                this.f169427c = true;
                try {
                    long j2 = this.f169425a;
                    if (j2 != Long.MAX_VALUE) {
                        long j3 = j2 - j;
                        if (j3 < 0) {
                            throw new IllegalStateException("more items arrived than were requested");
                        }
                        this.f169425a = j3;
                    }
                    m187979a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f169427c = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m187981c(rc90 rc90Var) {
        synchronized (this) {
            try {
                if (this.f169427c) {
                    if (rc90Var == null) {
                        rc90Var = f169424g;
                    }
                    this.f169430f = rc90Var;
                    return;
                }
                this.f169427c = true;
                try {
                    this.f169426b = rc90Var;
                    if (rc90Var != null) {
                        rc90Var.request(this.f169425a);
                    }
                    m187979a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f169427c = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p149l.rc90
    public void request(long j) {
        if (j < 0) {
            ig3.m135964a("n >= 0 required");
            return;
        }
        if (j == 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f169427c) {
                    this.f169428d += j;
                    return;
                }
                this.f169427c = true;
                try {
                    long j2 = this.f169425a + j;
                    if (j2 < 0) {
                        j2 = Long.MAX_VALUE;
                    }
                    this.f169425a = j2;
                    rc90 rc90Var = this.f169426b;
                    if (rc90Var != null) {
                        rc90Var.request(j);
                    }
                    m187979a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f169427c = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l.tc90$a */
    public static class C20144a implements rc90 {
        @Override // p149l.rc90
        public void request(long j) {
        }
    }
}
