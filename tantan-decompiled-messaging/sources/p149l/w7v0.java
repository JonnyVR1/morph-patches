package p149l;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzead;
import com.google.android.gms.internal.ads.zzeir;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzfho;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class w7v0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f185106a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nxv0 f185107b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kxv0 f185108c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f185109d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ o5w0 f185110e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vxv0 f185111f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ y7v0 f185112g;

    public w7v0(y7v0 y7v0Var, long j, nxv0 nxv0Var, kxv0 kxv0Var, String str, o5w0 o5w0Var, vxv0 vxv0Var) {
        this.f185106a = j;
        this.f185107b = nxv0Var;
        this.f185108c = kxv0Var;
        this.f185109d = str;
        this.f185110e = o5w0Var;
        this.f185111f = vxv0Var;
        this.f185112g = y7v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:32:0x0066, B:34:0x006e, B:36:0x007a, B:40:0x0084, B:41:0x0088, B:43:0x009a, B:44:0x00af, B:46:0x00b7, B:48:0x00b9, B:56:0x00f1, B:57:0x00fc, B:51:0x00d6, B:53:0x00da, B:55:0x00e4), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:32:0x0066, B:34:0x006e, B:36:0x007a, B:40:0x0084, B:41:0x0088, B:43:0x009a, B:44:0x00af, B:46:0x00b7, B:48:0x00b9, B:56:0x00f1, B:57:0x00fc, B:51:0x00d6, B:53:0x00da, B:55:0x00e4), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:32:0x0066, B:34:0x006e, B:36:0x007a, B:40:0x0084, B:41:0x0088, B:43:0x009a, B:44:0x00af, B:46:0x00b7, B:48:0x00b9, B:56:0x00f1, B:57:0x00fc, B:51:0x00d6, B:53:0x00da, B:55:0x00e4), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7 A[Catch: all -> 0x0080, DONT_GENERATE, TryCatch #0 {all -> 0x0080, blocks: (B:32:0x0066, B:34:0x006e, B:36:0x007a, B:40:0x0084, B:41:0x0088, B:43:0x009a, B:44:0x00af, B:46:0x00b7, B:48:0x00b9, B:56:0x00f1, B:57:0x00fc, B:51:0x00d6, B:53:0x00da, B:55:0x00e4), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:32:0x0066, B:34:0x006e, B:36:0x007a, B:40:0x0084, B:41:0x0088, B:43:0x009a, B:44:0x00af, B:46:0x00b7, B:48:0x00b9, B:56:0x00f1, B:57:0x00fc, B:51:0x00d6, B:53:0x00da, B:55:0x00e4), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:32:0x0066, B:34:0x006e, B:36:0x007a, B:40:0x0084, B:41:0x0088, B:43:0x009a, B:44:0x00af, B:46:0x00b7, B:48:0x00b9, B:56:0x00f1, B:57:0x00fc, B:51:0x00d6, B:53:0x00da, B:55:0x00e4), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        int i;
        int i2;
        zze zzeVarZzb;
        Integer numValueOf;
        y7v0 y7v0Var;
        y7v0 y7v0Var2;
        zze zzeVarM172253a;
        int i3;
        zze zzeVar;
        long jElapsedRealtime = this.f185112g.f196738a.elapsedRealtime() - this.f185106a;
        if (!(th instanceof TimeoutException)) {
            if (th instanceof zzelp) {
                i = 3;
            } else if (th instanceof CancellationException) {
                i2 = 4;
            } else {
                if (!(th instanceof zzfho)) {
                    if (th instanceof zzead) {
                        i2 = pzv0.m172253a(th).zza == 3 ? 1 : 6;
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131870C1)).booleanValue() && (th instanceof zzeir) && (zzeVarZzb = ((zzeir) th).zzb()) != null) {
                            numValueOf = Integer.valueOf(zzeVarZzb.zza);
                            i = i2;
                        }
                    } else {
                        i = 6;
                    }
                    synchronized (this.f185112g) {
                        try {
                            y7v0Var = this.f185112g;
                            if (y7v0Var.f196742e) {
                                y7v0Var.f196739b.m95372a(this.f185107b, this.f185108c, i, th instanceof zzeir ? (zzeir) th : null, jElapsedRealtime);
                                jElapsedRealtime = jElapsedRealtime;
                            }
                            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132282j8)).booleanValue()) {
                                s5w0 s5w0Var = this.f185112g.f196740c;
                                o5w0 o5w0Var = this.f185110e;
                                vxv0 vxv0Var = this.f185111f;
                                kxv0 kxv0Var = this.f185108c;
                                s5w0Var.m182383d(o5w0Var.m162813c(vxv0Var, kxv0Var, kxv0Var.f125211o));
                            }
                            y7v0Var2 = this.f185112g;
                            if (y7v0Var2.f196744g) {
                                return;
                            }
                            LinkedHashMap linkedHashMap = y7v0Var2.f196741d;
                            kxv0 kxv0Var2 = this.f185108c;
                            linkedHashMap.put(kxv0Var2, new x7v0(this.f185109d, kxv0Var2.f125196g0, i, jElapsedRealtime, numValueOf));
                            zzeVarM172253a = pzv0.m172253a(th);
                            i3 = zzeVarM172253a.zza;
                            if ((i3 != 3 || i3 == 0) && (zzeVar = zzeVarM172253a.zzd) != null && !zzeVar.zzc.equals("com.google.android.gms.ads")) {
                            }
                            this.f185112g.f196743f.m157782f(this.f185108c, jElapsedRealtime, zzeVarM172253a);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                i2 = 5;
            }
            numValueOf = null;
            synchronized (this.f185112g) {
                y7v0Var = this.f185112g;
                if (y7v0Var.f196742e) {
                    y7v0Var.f196739b.m95372a(this.f185107b, this.f185108c, i, th instanceof zzeir ? (zzeir) th : null, jElapsedRealtime);
                    jElapsedRealtime = jElapsedRealtime;
                }
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132282j8)).booleanValue()) {
                    s5w0 s5w0Var2 = this.f185112g.f196740c;
                    o5w0 o5w0Var2 = this.f185110e;
                    vxv0 vxv0Var2 = this.f185111f;
                    kxv0 kxv0Var3 = this.f185108c;
                    s5w0Var2.m182383d(o5w0Var2.m162813c(vxv0Var2, kxv0Var3, kxv0Var3.f125211o));
                }
                y7v0Var2 = this.f185112g;
                if (y7v0Var2.f196744g) {
                    return;
                }
                LinkedHashMap linkedHashMap2 = y7v0Var2.f196741d;
                kxv0 kxv0Var4 = this.f185108c;
                linkedHashMap2.put(kxv0Var4, new x7v0(this.f185109d, kxv0Var4.f125196g0, i, jElapsedRealtime, numValueOf));
                zzeVarM172253a = pzv0.m172253a(th);
                i3 = zzeVarM172253a.zza;
                zzeVarM172253a = i3 != 3 ? pzv0.m172253a(new zzeir(13, zzeVarM172253a.zzd)) : pzv0.m172253a(new zzeir(13, zzeVarM172253a.zzd));
                this.f185112g.f196743f.m157782f(this.f185108c, jElapsedRealtime, zzeVarM172253a);
            }
        }
        i2 = 2;
        i = i2;
        numValueOf = null;
        synchronized (this.f185112g) {
            y7v0Var = this.f185112g;
            if (y7v0Var.f196742e) {
                y7v0Var.f196739b.m95372a(this.f185107b, this.f185108c, i, th instanceof zzeir ? (zzeir) th : null, jElapsedRealtime);
                jElapsedRealtime = jElapsedRealtime;
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132282j8)).booleanValue()) {
                s5w0 s5w0Var3 = this.f185112g.f196740c;
                o5w0 o5w0Var3 = this.f185110e;
                vxv0 vxv0Var3 = this.f185111f;
                kxv0 kxv0Var5 = this.f185108c;
                s5w0Var3.m182383d(o5w0Var3.m162813c(vxv0Var3, kxv0Var5, kxv0Var5.f125211o));
            }
            y7v0Var2 = this.f185112g;
            if (y7v0Var2.f196744g) {
                return;
            }
            LinkedHashMap linkedHashMap3 = y7v0Var2.f196741d;
            kxv0 kxv0Var6 = this.f185108c;
            linkedHashMap3.put(kxv0Var6, new x7v0(this.f185109d, kxv0Var6.f125196g0, i, jElapsedRealtime, numValueOf));
            zzeVarM172253a = pzv0.m172253a(th);
            i3 = zzeVarM172253a.zza;
            if (i3 != 3) {
            }
            this.f185112g.f196743f.m157782f(this.f185108c, jElapsedRealtime, zzeVarM172253a);
        }
    }

    @Override // p149l.fmw0
    public final void zzb(Object obj) {
        long j;
        long jElapsedRealtime = this.f185112g.f196738a.elapsedRealtime() - this.f185106a;
        synchronized (this.f185112g) {
            try {
                y7v0 y7v0Var = this.f185112g;
                if (y7v0Var.f196742e) {
                    j = jElapsedRealtime;
                    y7v0Var.f196739b.m95372a(this.f185107b, this.f185108c, 0, null, j);
                } else {
                    j = jElapsedRealtime;
                }
                y7v0 y7v0Var2 = this.f185112g;
                if (y7v0Var2.f196744g) {
                    return;
                }
                boolean zM213336q = y7v0Var2.m213336q(this.f185108c);
                y7v0 y7v0Var3 = this.f185112g;
                if (zM213336q) {
                    ((x7v0) y7v0Var3.f196741d.get(this.f185108c)).f191383d = j;
                } else {
                    LinkedHashMap linkedHashMap = y7v0Var3.f196741d;
                    kxv0 kxv0Var = this.f185108c;
                    long j2 = j;
                    j = j2;
                    linkedHashMap.put(kxv0Var, new x7v0(this.f185109d, kxv0Var.f125196g0, 0, j2, null));
                }
                this.f185112g.f196743f.m157783g(this.f185108c, j, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
