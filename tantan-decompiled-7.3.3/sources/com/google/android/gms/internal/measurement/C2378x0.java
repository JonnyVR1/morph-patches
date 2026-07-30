package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p153l.e0y0;
import p153l.e1y0;
import p153l.efy0;
import p153l.hfy0;
import p153l.m9y0;
import p153l.nvx0;
import p153l.ocy0;
import p153l.shy0;
import p153l.u4y0;
import p153l.v0y0;
import p153l.vby0;
import p153l.vcy0;
import p153l.wtq0;
import p153l.zby0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2378x0<T> implements ocy0<T> {

    /* JADX INFO: renamed from: a */
    public final m9y0 f10327a;

    /* JADX INFO: renamed from: b */
    public final hfy0<?, ?> f10328b;

    /* JADX INFO: renamed from: c */
    public final boolean f10329c;

    /* JADX INFO: renamed from: d */
    public final e0y0<?> f10330d;

    public C2378x0(hfy0<?, ?> hfy0Var, e0y0<?> e0y0Var, m9y0 m9y0Var) {
        this.f10328b = hfy0Var;
        this.f10329c = e0y0Var.mo14392h(m9y0Var);
        this.f10330d = e0y0Var;
        this.f10327a = m9y0Var;
    }

    /* JADX INFO: renamed from: g */
    public static <T> C2378x0<T> m14539g(hfy0<?, ?> hfy0Var, e0y0<?> e0y0Var, m9y0 m9y0Var) {
        return new C2378x0<>(hfy0Var, e0y0Var, m9y0Var);
    }

    @Override // p153l.ocy0
    /* JADX INFO: renamed from: a */
    public final void mo14510a(T t, shy0 shy0Var) throws IOException {
        Iterator itM198959p = this.f10330d.mo14388d(t).m198959p();
        while (itM198959p.hasNext()) {
            Map.Entry entry = (Map.Entry) itM198959p.next();
            e1y0 e1y0Var = (e1y0) entry.getKey();
            if (e1y0Var.zzc() != zzmz.MESSAGE || e1y0Var.zze() || e1y0Var.zzd()) {
                wtq0.m207906a("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof u4y0) {
                shy0Var.mo185981o(e1y0Var.zza(), ((u4y0) entry).m194518a().m184833c());
            } else {
                shy0Var.mo185981o(e1y0Var.zza(), entry.getValue());
            }
        }
        hfy0<?, ?> hfy0Var = this.f10328b;
        hfy0Var.mo14586h(hfy0Var.mo14594q(t), shy0Var);
    }

    @Override // p153l.ocy0
    /* JADX INFO: renamed from: b */
    public final boolean mo14511b(T t) {
        return this.f10330d.mo14388d(t).m198962s();
    }

    @Override // p153l.ocy0
    /* JADX INFO: renamed from: c */
    public final void mo14512c(T t, T t2) {
        vcy0.m200880o(this.f10328b, t, t2);
        if (this.f10329c) {
            vcy0.m200878m(this.f10330d, t, t2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:0: B:46:0x000c->B:54:?, LOOP_END, SYNTHETIC] */
    @Override // p153l.ocy0
    /* JADX INFO: renamed from: d */
    public final void mo14513d(T t, zby0 zby0Var, C2368s0 c2368s0) throws IOException {
        boolean zZzt;
        hfy0<?, ?> hfy0Var = this.f10328b;
        e0y0<?> e0y0Var = this.f10330d;
        Object objMo14592o = hfy0Var.mo14592o(t);
        v0y0<T> v0y0VarMo14393i = e0y0Var.mo14393i(t);
        while (zby0Var.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zby0Var.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objMo14386b = e0y0Var.mo14386b(c2368s0, this.f10327a, iZzd >>> 3);
                        if (objMo14386b != null) {
                            e0y0Var.mo14390f(zby0Var, objMo14386b, c2368s0, v0y0VarMo14393i);
                        } else {
                            zZzt = hfy0Var.m134887i(objMo14592o, zby0Var, 0);
                        }
                    } else {
                        zZzt = zby0Var.zzt();
                    }
                    if (!zZzt) {
                        hfy0Var.mo14590m(t, objMo14592o);
                        return;
                    }
                } else {
                    Object objMo14386b2 = null;
                    zzik zzikVarZzp = null;
                    while (zby0Var.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zby0Var.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zby0Var.zzj();
                            objMo14386b2 = e0y0Var.mo14386b(c2368s0, this.f10327a, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objMo14386b2 != null) {
                                e0y0Var.mo14390f(zby0Var, objMo14386b2, c2368s0, v0y0VarMo14393i);
                            } else {
                                zzikVarZzp = zby0Var.zzp();
                            }
                        } else if (!zby0Var.zzt()) {
                            break;
                        }
                    }
                    if (zby0Var.zzd() != 12) {
                        throw zzkb.zzb();
                    }
                    if (zzikVarZzp != null) {
                        if (objMo14386b2 != null) {
                            e0y0Var.mo14389e(zzikVarZzp, objMo14386b2, c2368s0, v0y0VarMo14393i);
                        } else {
                            hfy0Var.mo14584f(objMo14592o, iZzj, zzikVarZzp);
                        }
                    }
                }
                zZzt = true;
                if (!zZzt) {
                    hfy0Var.mo14590m(t, objMo14592o);
                    return;
                }
            } catch (Throwable th) {
                hfy0Var.mo14590m(t, objMo14592o);
                throw th;
            }
        }
        hfy0Var.mo14590m(t, objMo14592o);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1 A[EDGE_INSN: B:58:0x00a1->B:35:0x00a1 BREAK  A[LOOP:1: B:18:0x0059->B:63:0x0059], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ocy0
    /* JADX INFO: renamed from: e */
    public final void mo14514e(T t, byte[] bArr, int i, int i2, nvx0 nvx0Var) throws IOException {
        int iM14327s;
        AbstractC2372u0 abstractC2372u0 = (AbstractC2372u0) t;
        efy0 efy0VarM120739l = abstractC2372u0.zzb;
        if (efy0VarM120739l == efy0.m120738k()) {
            efy0VarM120739l = efy0.m120739l();
            abstractC2372u0.zzb = efy0VarM120739l;
        }
        efy0 efy0Var = efy0VarM120739l;
        ((AbstractC2372u0.d) t).m14438B();
        AbstractC2372u0.f fVar = null;
        while (i < i2) {
            int iM14327s2 = C2362p0.m14327s(bArr, i, nvx0Var);
            int i3 = nvx0Var.f143890a;
            if (i3 == 11) {
                byte[] bArr2 = bArr;
                int i4 = i2;
                nvx0 nvx0Var2 = nvx0Var;
                int i5 = 0;
                zzik zzikVar = null;
                while (true) {
                    if (iM14327s2 >= i4) {
                        iM14327s = iM14327s2;
                        break;
                    }
                    iM14327s = C2362p0.m14327s(bArr2, iM14327s2, nvx0Var2);
                    int i6 = nvx0Var2.f143890a;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 == 2) {
                        if (i8 != 0) {
                            if (i6 != 12) {
                                break;
                                break;
                            }
                            iM14327s2 = C2362p0.m14311c(i6, bArr2, iM14327s, i4, nvx0Var2);
                        } else {
                            iM14327s2 = C2362p0.m14327s(bArr2, iM14327s, nvx0Var2);
                            i5 = nvx0Var2.f143890a;
                            fVar = (AbstractC2372u0.f) this.f10330d.mo14386b(nvx0Var2.f143893d, this.f10327a, i5);
                        }
                    } else {
                        if (i7 == 3) {
                            if (fVar != null) {
                                vby0.m200747a();
                                throw new NoSuchMethodError();
                            }
                            if (i8 == 2) {
                                iM14327s2 = C2362p0.m14320l(bArr2, iM14327s, nvx0Var2);
                                zzikVar = (zzik) nvx0Var2.f143892c;
                            }
                        }
                        if (i6 != 12) {
                            break;
                        } else {
                            iM14327s2 = C2362p0.m14311c(i6, bArr2, iM14327s, i4, nvx0Var2);
                        }
                    }
                }
                if (zzikVar != null) {
                    efy0Var.m120743e((i5 << 3) | 2, zzikVar);
                }
                i = iM14327s;
                bArr = bArr2;
                i2 = i4;
                nvx0Var = nvx0Var2;
            } else if ((i3 & 7) == 2) {
                fVar = (AbstractC2372u0.f) this.f10330d.mo14386b(nvx0Var.f143893d, this.f10327a, i3 >>> 3);
                if (fVar != null) {
                    vby0.m200747a();
                    throw new NoSuchMethodError();
                }
                i = C2362p0.m14313e(i3, bArr, iM14327s2, i2, efy0Var, nvx0Var);
            } else {
                i = C2362p0.m14311c(i3, bArr, iM14327s2, i2, nvx0Var);
            }
        }
        if (i != i2) {
            throw zzkb.zzg();
        }
    }

    @Override // p153l.ocy0
    /* JADX INFO: renamed from: f */
    public final boolean mo14515f(T t, T t2) {
        if (!this.f10328b.mo14594q(t).equals(this.f10328b.mo14594q(t2))) {
            return false;
        }
        if (this.f10329c) {
            return this.f10330d.mo14388d(t).equals(this.f10330d.mo14388d(t2));
        }
        return true;
    }

    @Override // p153l.ocy0
    public final int zza(T t) {
        hfy0<?, ?> hfy0Var = this.f10328b;
        int iMo14588k = hfy0Var.mo14588k(hfy0Var.mo14594q(t));
        return this.f10329c ? iMo14588k + this.f10330d.mo14388d(t).m198953a() : iMo14588k;
    }

    @Override // p153l.ocy0
    public final int zzb(T t) {
        int iHashCode = this.f10328b.mo14594q(t).hashCode();
        return this.f10329c ? (iHashCode * 53) + this.f10330d.mo14388d(t).hashCode() : iHashCode;
    }

    @Override // p153l.ocy0
    public final void zzd(T t) {
        this.f10328b.mo14596s(t);
        this.f10330d.mo14394j(t);
    }

    @Override // p153l.ocy0
    public final T zza() {
        m9y0 m9y0Var = this.f10327a;
        if (m9y0Var instanceof AbstractC2372u0) {
            return (T) ((AbstractC2372u0) m9y0Var).m14418u();
        }
        return (T) m9y0Var.mo14409Q().mo14422F();
    }
}
