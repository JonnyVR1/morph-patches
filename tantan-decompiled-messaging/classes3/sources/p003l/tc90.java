package p003l;

import l.ig3;
import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class tc90 implements rc90 {

    /* JADX INFO: renamed from: g */
    public static final rc90 f7446g = new C0548a();

    /* JADX INFO: renamed from: a */
    public long f7447a;

    /* JADX INFO: renamed from: b */
    public rc90 f7448b;

    /* JADX INFO: renamed from: c */
    public boolean f7449c;

    /* JADX INFO: renamed from: d */
    public long f7450d;

    /* JADX INFO: renamed from: e */
    public long f7451e;

    /* JADX INFO: renamed from: f */
    public rc90 f7452f;

    /* JADX INFO: renamed from: a */
    public void m7736a() {
        while (true) {
            synchronized (this) {
                try {
                    long j = this.f7450d;
                    long j2 = this.f7451e;
                    rc90 rc90Var = this.f7452f;
                    if (j == 0 && j2 == 0 && rc90Var == null) {
                        this.f7449c = false;
                        return;
                    }
                    this.f7450d = 0L;
                    this.f7451e = 0L;
                    this.f7452f = null;
                    long j3 = this.f7447a;
                    if (j3 != Long.MAX_VALUE) {
                        long j4 = j3 + j;
                        if (j4 < 0 || j4 == Long.MAX_VALUE) {
                            this.f7447a = Long.MAX_VALUE;
                            j3 = Long.MAX_VALUE;
                        } else {
                            j3 = j4 - j2;
                            if (j3 < 0) {
                                qkq0.a("more produced than requested");
                                return;
                            }
                            this.f7447a = j3;
                        }
                    }
                    if (rc90Var == null) {
                        rc90 rc90Var2 = this.f7448b;
                        if (rc90Var2 != null && j != 0) {
                            rc90Var2.request(j);
                        }
                    } else if (rc90Var == f7446g) {
                        this.f7448b = null;
                    } else {
                        this.f7448b = rc90Var;
                        rc90Var.request(j3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m7737b(long j) {
        if (j <= 0) {
            ig3.a("n > 0 required");
            return;
        }
        synchronized (this) {
            try {
                if (this.f7449c) {
                    this.f7451e += j;
                    return;
                }
                this.f7449c = true;
                try {
                    long j2 = this.f7447a;
                    if (j2 != Long.MAX_VALUE) {
                        long j3 = j2 - j;
                        if (j3 < 0) {
                            throw new IllegalStateException("more items arrived than were requested");
                        }
                        this.f7447a = j3;
                    }
                    m7736a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f7449c = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7738c(rc90 rc90Var) {
        synchronized (this) {
            try {
                if (this.f7449c) {
                    if (rc90Var == null) {
                        rc90Var = f7446g;
                    }
                    this.f7452f = rc90Var;
                    return;
                }
                this.f7449c = true;
                try {
                    this.f7448b = rc90Var;
                    if (rc90Var != null) {
                        rc90Var.request(this.f7447a);
                    }
                    m7736a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f7449c = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p003l.rc90
    public void request(long j) {
        if (j < 0) {
            ig3.a("n >= 0 required");
            return;
        }
        if (j == 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f7449c) {
                    this.f7450d += j;
                    return;
                }
                this.f7449c = true;
                try {
                    long j2 = this.f7447a + j;
                    if (j2 < 0) {
                        j2 = Long.MAX_VALUE;
                    }
                    this.f7447a = j2;
                    rc90 rc90Var = this.f7448b;
                    if (rc90Var != null) {
                        rc90Var.request(j);
                    }
                    m7736a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f7449c = false;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l.tc90$a */
    public static class C0548a implements rc90 {
        @Override // p003l.rc90
        public void request(long j) {
        }
    }
}
