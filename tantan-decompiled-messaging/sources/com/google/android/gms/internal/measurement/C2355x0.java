package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p149l.b6y0;
import p149l.g0y0;
import p149l.hmx0;
import p149l.i3y0;
import p149l.m8y0;
import p149l.ovx0;
import p149l.p2y0;
import p149l.p3y0;
import p149l.prx0;
import p149l.qkq0;
import p149l.t2y0;
import p149l.y5y0;
import p149l.yqx0;
import p149l.yrx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2355x0<T> implements i3y0<T> {

    /* JADX INFO: renamed from: a */
    public final g0y0 f10290a;

    /* JADX INFO: renamed from: b */
    public final b6y0<?, ?> f10291b;

    /* JADX INFO: renamed from: c */
    public final boolean f10292c;

    /* JADX INFO: renamed from: d */
    public final yqx0<?> f10293d;

    public C2355x0(b6y0<?, ?> b6y0Var, yqx0<?> yqx0Var, g0y0 g0y0Var) {
        this.f10291b = b6y0Var;
        this.f10292c = yqx0Var.mo14338h(g0y0Var);
        this.f10293d = yqx0Var;
        this.f10290a = g0y0Var;
    }

    /* JADX INFO: renamed from: g */
    public static <T> C2355x0<T> m14485g(b6y0<?, ?> b6y0Var, yqx0<?> yqx0Var, g0y0 g0y0Var) {
        return new C2355x0<>(b6y0Var, yqx0Var, g0y0Var);
    }

    @Override // p149l.i3y0
    /* JADX INFO: renamed from: a */
    public final void mo14456a(T t, m8y0 m8y0Var) throws IOException {
        Iterator itM171089p = this.f10293d.mo14334d(t).m171089p();
        while (itM171089p.hasNext()) {
            Map.Entry entry = (Map.Entry) itM171089p.next();
            yrx0 yrx0Var = (yrx0) entry.getKey();
            if (yrx0Var.zzc() != zzmz.MESSAGE || yrx0Var.zze() || yrx0Var.zzd()) {
                qkq0.m175383a("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof ovx0) {
                m8y0Var.mo153552o(yrx0Var.zza(), ((ovx0) entry).m166210a().m156778c());
            } else {
                m8y0Var.mo153552o(yrx0Var.zza(), entry.getValue());
            }
        }
        b6y0<?, ?> b6y0Var = this.f10291b;
        b6y0Var.mo14532h(b6y0Var.mo14540q(t), m8y0Var);
    }

    @Override // p149l.i3y0
    /* JADX INFO: renamed from: b */
    public final boolean mo14457b(T t) {
        return this.f10293d.mo14334d(t).m171092s();
    }

    @Override // p149l.i3y0
    /* JADX INFO: renamed from: c */
    public final void mo14458c(T t, T t2) {
        p3y0.m167320o(this.f10291b, t, t2);
        if (this.f10292c) {
            p3y0.m167318m(this.f10293d, t, t2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:0: B:46:0x000c->B:54:?, LOOP_END, SYNTHETIC] */
    @Override // p149l.i3y0
    /* JADX INFO: renamed from: d */
    public final void mo14459d(T t, t2y0 t2y0Var, C2345s0 c2345s0) throws IOException {
        boolean zZzt;
        b6y0<?, ?> b6y0Var = this.f10291b;
        yqx0<?> yqx0Var = this.f10293d;
        Object objMo14538o = b6y0Var.mo14538o(t);
        prx0<T> prx0VarMo14339i = yqx0Var.mo14339i(t);
        while (t2y0Var.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = t2y0Var.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objMo14332b = yqx0Var.mo14332b(c2345s0, this.f10290a, iZzd >>> 3);
                        if (objMo14332b != null) {
                            yqx0Var.mo14336f(t2y0Var, objMo14332b, c2345s0, prx0VarMo14339i);
                        } else {
                            zZzt = b6y0Var.m100481i(objMo14538o, t2y0Var, 0);
                        }
                    } else {
                        zZzt = t2y0Var.zzt();
                    }
                    if (!zZzt) {
                        b6y0Var.mo14536m(t, objMo14538o);
                        return;
                    }
                } else {
                    Object objMo14332b2 = null;
                    zzik zzikVarZzp = null;
                    while (t2y0Var.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = t2y0Var.zzd();
                        if (iZzd2 == 16) {
                            iZzj = t2y0Var.zzj();
                            objMo14332b2 = yqx0Var.mo14332b(c2345s0, this.f10290a, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objMo14332b2 != null) {
                                yqx0Var.mo14336f(t2y0Var, objMo14332b2, c2345s0, prx0VarMo14339i);
                            } else {
                                zzikVarZzp = t2y0Var.zzp();
                            }
                        } else if (!t2y0Var.zzt()) {
                            break;
                        }
                    }
                    if (t2y0Var.zzd() != 12) {
                        throw zzkb.zzb();
                    }
                    if (zzikVarZzp != null) {
                        if (objMo14332b2 != null) {
                            yqx0Var.mo14335e(zzikVarZzp, objMo14332b2, c2345s0, prx0VarMo14339i);
                        } else {
                            b6y0Var.mo14530f(objMo14538o, iZzj, zzikVarZzp);
                        }
                    }
                }
                zZzt = true;
                if (!zZzt) {
                    b6y0Var.mo14536m(t, objMo14538o);
                    return;
                }
            } catch (Throwable th) {
                b6y0Var.mo14536m(t, objMo14538o);
                throw th;
            }
        }
        b6y0Var.mo14536m(t, objMo14538o);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1 A[EDGE_INSN: B:58:0x00a1->B:35:0x00a1 BREAK  A[LOOP:1: B:18:0x0059->B:63:0x0059], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.i3y0
    /* JADX INFO: renamed from: e */
    public final void mo14460e(T t, byte[] bArr, int i, int i2, hmx0 hmx0Var) throws IOException {
        int iM14273s;
        AbstractC2349u0 abstractC2349u0 = (AbstractC2349u0) t;
        y5y0 y5y0VarM213024l = abstractC2349u0.zzb;
        if (y5y0VarM213024l == y5y0.m213023k()) {
            y5y0VarM213024l = y5y0.m213024l();
            abstractC2349u0.zzb = y5y0VarM213024l;
        }
        y5y0 y5y0Var = y5y0VarM213024l;
        ((AbstractC2349u0.d) t).m14384B();
        AbstractC2349u0.f fVar = null;
        while (i < i2) {
            int iM14273s2 = C2339p0.m14273s(bArr, i, hmx0Var);
            int i3 = hmx0Var.f108505a;
            if (i3 == 11) {
                byte[] bArr2 = bArr;
                int i4 = i2;
                hmx0 hmx0Var2 = hmx0Var;
                int i5 = 0;
                zzik zzikVar = null;
                while (true) {
                    if (iM14273s2 >= i4) {
                        iM14273s = iM14273s2;
                        break;
                    }
                    iM14273s = C2339p0.m14273s(bArr2, iM14273s2, hmx0Var2);
                    int i6 = hmx0Var2.f108505a;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 == 2) {
                        if (i8 != 0) {
                            if (i6 != 12) {
                                break;
                                break;
                            }
                            iM14273s2 = C2339p0.m14257c(i6, bArr2, iM14273s, i4, hmx0Var2);
                        } else {
                            iM14273s2 = C2339p0.m14273s(bArr2, iM14273s, hmx0Var2);
                            i5 = hmx0Var2.f108505a;
                            fVar = (AbstractC2349u0.f) this.f10293d.mo14332b(hmx0Var2.f108508d, this.f10290a, i5);
                        }
                    } else {
                        if (i7 == 3) {
                            if (fVar != null) {
                                p2y0.m167229a();
                                throw new NoSuchMethodError();
                            }
                            if (i8 == 2) {
                                iM14273s2 = C2339p0.m14266l(bArr2, iM14273s, hmx0Var2);
                                zzikVar = (zzik) hmx0Var2.f108507c;
                            }
                        }
                        if (i6 != 12) {
                            break;
                        } else {
                            iM14273s2 = C2339p0.m14257c(i6, bArr2, iM14273s, i4, hmx0Var2);
                        }
                    }
                }
                if (zzikVar != null) {
                    y5y0Var.m213028e((i5 << 3) | 2, zzikVar);
                }
                i = iM14273s;
                bArr = bArr2;
                i2 = i4;
                hmx0Var = hmx0Var2;
            } else if ((i3 & 7) == 2) {
                fVar = (AbstractC2349u0.f) this.f10293d.mo14332b(hmx0Var.f108508d, this.f10290a, i3 >>> 3);
                if (fVar != null) {
                    p2y0.m167229a();
                    throw new NoSuchMethodError();
                }
                i = C2339p0.m14259e(i3, bArr, iM14273s2, i2, y5y0Var, hmx0Var);
            } else {
                i = C2339p0.m14257c(i3, bArr, iM14273s2, i2, hmx0Var);
            }
        }
        if (i != i2) {
            throw zzkb.zzg();
        }
    }

    @Override // p149l.i3y0
    /* JADX INFO: renamed from: f */
    public final boolean mo14461f(T t, T t2) {
        if (!this.f10291b.mo14540q(t).equals(this.f10291b.mo14540q(t2))) {
            return false;
        }
        if (this.f10292c) {
            return this.f10293d.mo14334d(t).equals(this.f10293d.mo14334d(t2));
        }
        return true;
    }

    @Override // p149l.i3y0
    public final int zza(T t) {
        b6y0<?, ?> b6y0Var = this.f10291b;
        int iMo14534k = b6y0Var.mo14534k(b6y0Var.mo14540q(t));
        return this.f10292c ? iMo14534k + this.f10293d.mo14334d(t).m171083a() : iMo14534k;
    }

    @Override // p149l.i3y0
    public final int zzb(T t) {
        int iHashCode = this.f10291b.mo14540q(t).hashCode();
        return this.f10292c ? (iHashCode * 53) + this.f10293d.mo14334d(t).hashCode() : iHashCode;
    }

    @Override // p149l.i3y0
    public final void zzd(T t) {
        this.f10291b.mo14542s(t);
        this.f10293d.mo14340j(t);
    }

    @Override // p149l.i3y0
    public final T zza() {
        g0y0 g0y0Var = this.f10290a;
        if (g0y0Var instanceof AbstractC2349u0) {
            return (T) ((AbstractC2349u0) g0y0Var).m14364u();
        }
        return (T) g0y0Var.mo14355Q().mo14368F();
    }
}
