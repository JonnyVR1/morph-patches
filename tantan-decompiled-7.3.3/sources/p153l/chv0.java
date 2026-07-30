package p153l;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzead;
import com.google.android.gms.internal.ads.zzeir;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzfho;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class chv0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f81868a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t6w0 f81869b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q6w0 f81870c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f81871d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uew0 f81872e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ b7w0 f81873f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ehv0 f81874g;

    public chv0(ehv0 ehv0Var, long j, t6w0 t6w0Var, q6w0 q6w0Var, String str, uew0 uew0Var, b7w0 b7w0Var) {
        this.f81868a = j;
        this.f81869b = t6w0Var;
        this.f81870c = q6w0Var;
        this.f81871d = str;
        this.f81872e = uew0Var;
        this.f81873f = b7w0Var;
        this.f81874g = ehv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:32:0x0066, B:34:0x006e, B:36:0x007a, B:40:0x0084, B:41:0x0088, B:43:0x009a, B:44:0x00af, B:46:0x00b7, B:48:0x00b9, B:56:0x00f1, B:57:0x00fc, B:51:0x00d6, B:53:0x00da, B:55:0x00e4), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:32:0x0066, B:34:0x006e, B:36:0x007a, B:40:0x0084, B:41:0x0088, B:43:0x009a, B:44:0x00af, B:46:0x00b7, B:48:0x00b9, B:56:0x00f1, B:57:0x00fc, B:51:0x00d6, B:53:0x00da, B:55:0x00e4), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:32:0x0066, B:34:0x006e, B:36:0x007a, B:40:0x0084, B:41:0x0088, B:43:0x009a, B:44:0x00af, B:46:0x00b7, B:48:0x00b9, B:56:0x00f1, B:57:0x00fc, B:51:0x00d6, B:53:0x00da, B:55:0x00e4), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7 A[Catch: all -> 0x0080, DONT_GENERATE, TryCatch #0 {all -> 0x0080, blocks: (B:32:0x0066, B:34:0x006e, B:36:0x007a, B:40:0x0084, B:41:0x0088, B:43:0x009a, B:44:0x00af, B:46:0x00b7, B:48:0x00b9, B:56:0x00f1, B:57:0x00fc, B:51:0x00d6, B:53:0x00da, B:55:0x00e4), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:32:0x0066, B:34:0x006e, B:36:0x007a, B:40:0x0084, B:41:0x0088, B:43:0x009a, B:44:0x00af, B:46:0x00b7, B:48:0x00b9, B:56:0x00f1, B:57:0x00fc, B:51:0x00d6, B:53:0x00da, B:55:0x00e4), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:32:0x0066, B:34:0x006e, B:36:0x007a, B:40:0x0084, B:41:0x0088, B:43:0x009a, B:44:0x00af, B:46:0x00b7, B:48:0x00b9, B:56:0x00f1, B:57:0x00fc, B:51:0x00d6, B:53:0x00da, B:55:0x00e4), top: B:61:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        int i;
        int i2;
        zze zzeVarZzb;
        Integer numValueOf;
        ehv0 ehv0Var;
        ehv0 ehv0Var2;
        zze zzeVarM200324a;
        int i3;
        zze zzeVar;
        long jElapsedRealtime = this.f81874g.f94079a.elapsedRealtime() - this.f81868a;
        if (!(th instanceof TimeoutException)) {
            if (th instanceof zzelp) {
                i = 3;
            } else if (th instanceof CancellationException) {
                i2 = 4;
            } else {
                if (!(th instanceof zzfho)) {
                    if (th instanceof zzead) {
                        i2 = v8w0.m200324a(th).zza == 3 ? 1 : 6;
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167941C1)).booleanValue() && (th instanceof zzeir) && (zzeVarZzb = ((zzeir) th).zzb()) != null) {
                            numValueOf = Integer.valueOf(zzeVarZzb.zza);
                            i = i2;
                        }
                    } else {
                        i = 6;
                    }
                    synchronized (this.f81874g) {
                        try {
                            ehv0Var = this.f81874g;
                            if (ehv0Var.f94083e) {
                                ehv0Var.f94080b.m130262a(this.f81869b, this.f81870c, i, th instanceof zzeir ? (zzeir) th : null, jElapsedRealtime);
                                jElapsedRealtime = jElapsedRealtime;
                            }
                            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168353j8)).booleanValue()) {
                                yew0 yew0Var = this.f81874g.f94081c;
                                uew0 uew0Var = this.f81872e;
                                b7w0 b7w0Var = this.f81873f;
                                q6w0 q6w0Var = this.f81870c;
                                yew0Var.m215480d(uew0Var.m195816c(b7w0Var, q6w0Var, q6w0Var.f155901o));
                            }
                            ehv0Var2 = this.f81874g;
                            if (ehv0Var2.f94085g) {
                                return;
                            }
                            LinkedHashMap linkedHashMap = ehv0Var2.f94082d;
                            q6w0 q6w0Var2 = this.f81870c;
                            linkedHashMap.put(q6w0Var2, new dhv0(this.f81871d, q6w0Var2.f155886g0, i, jElapsedRealtime, numValueOf));
                            zzeVarM200324a = v8w0.m200324a(th);
                            i3 = zzeVarM200324a.zza;
                            if ((i3 != 3 || i3 == 0) && (zzeVar = zzeVarM200324a.zzd) != null && !zzeVar.zzc.equals("com.google.android.gms.ads")) {
                            }
                            this.f81874g.f94084f.m190514f(this.f81870c, jElapsedRealtime, zzeVarM200324a);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                i2 = 5;
            }
            numValueOf = null;
            synchronized (this.f81874g) {
                ehv0Var = this.f81874g;
                if (ehv0Var.f94083e) {
                    ehv0Var.f94080b.m130262a(this.f81869b, this.f81870c, i, th instanceof zzeir ? (zzeir) th : null, jElapsedRealtime);
                    jElapsedRealtime = jElapsedRealtime;
                }
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168353j8)).booleanValue()) {
                    yew0 yew0Var2 = this.f81874g.f94081c;
                    uew0 uew0Var2 = this.f81872e;
                    b7w0 b7w0Var2 = this.f81873f;
                    q6w0 q6w0Var3 = this.f81870c;
                    yew0Var2.m215480d(uew0Var2.m195816c(b7w0Var2, q6w0Var3, q6w0Var3.f155901o));
                }
                ehv0Var2 = this.f81874g;
                if (ehv0Var2.f94085g) {
                    return;
                }
                LinkedHashMap linkedHashMap2 = ehv0Var2.f94082d;
                q6w0 q6w0Var4 = this.f81870c;
                linkedHashMap2.put(q6w0Var4, new dhv0(this.f81871d, q6w0Var4.f155886g0, i, jElapsedRealtime, numValueOf));
                zzeVarM200324a = v8w0.m200324a(th);
                i3 = zzeVarM200324a.zza;
                zzeVarM200324a = i3 != 3 ? v8w0.m200324a(new zzeir(13, zzeVarM200324a.zzd)) : v8w0.m200324a(new zzeir(13, zzeVarM200324a.zzd));
                this.f81874g.f94084f.m190514f(this.f81870c, jElapsedRealtime, zzeVarM200324a);
            }
        }
        i2 = 2;
        i = i2;
        numValueOf = null;
        synchronized (this.f81874g) {
            ehv0Var = this.f81874g;
            if (ehv0Var.f94083e) {
                ehv0Var.f94080b.m130262a(this.f81869b, this.f81870c, i, th instanceof zzeir ? (zzeir) th : null, jElapsedRealtime);
                jElapsedRealtime = jElapsedRealtime;
            }
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168353j8)).booleanValue()) {
                yew0 yew0Var3 = this.f81874g.f94081c;
                uew0 uew0Var3 = this.f81872e;
                b7w0 b7w0Var3 = this.f81873f;
                q6w0 q6w0Var5 = this.f81870c;
                yew0Var3.m215480d(uew0Var3.m195816c(b7w0Var3, q6w0Var5, q6w0Var5.f155901o));
            }
            ehv0Var2 = this.f81874g;
            if (ehv0Var2.f94085g) {
                return;
            }
            LinkedHashMap linkedHashMap3 = ehv0Var2.f94082d;
            q6w0 q6w0Var6 = this.f81870c;
            linkedHashMap3.put(q6w0Var6, new dhv0(this.f81871d, q6w0Var6.f155886g0, i, jElapsedRealtime, numValueOf));
            zzeVarM200324a = v8w0.m200324a(th);
            i3 = zzeVarM200324a.zza;
            if (i3 != 3) {
            }
            this.f81874g.f94084f.m190514f(this.f81870c, jElapsedRealtime, zzeVarM200324a);
        }
    }

    @Override // p153l.lvw0
    public final void zzb(Object obj) {
        long j;
        long jElapsedRealtime = this.f81874g.f94079a.elapsedRealtime() - this.f81868a;
        synchronized (this.f81874g) {
            try {
                ehv0 ehv0Var = this.f81874g;
                if (ehv0Var.f94083e) {
                    j = jElapsedRealtime;
                    ehv0Var.f94080b.m130262a(this.f81869b, this.f81870c, 0, null, j);
                } else {
                    j = jElapsedRealtime;
                }
                ehv0 ehv0Var2 = this.f81874g;
                if (ehv0Var2.f94085g) {
                    return;
                }
                boolean zM120871q = ehv0Var2.m120871q(this.f81870c);
                ehv0 ehv0Var3 = this.f81874g;
                if (zM120871q) {
                    ((dhv0) ehv0Var3.f94082d.get(this.f81870c)).f88559d = j;
                } else {
                    LinkedHashMap linkedHashMap = ehv0Var3.f94082d;
                    q6w0 q6w0Var = this.f81870c;
                    long j2 = j;
                    j = j2;
                    linkedHashMap.put(q6w0Var, new dhv0(this.f81871d, q6w0Var.f155886g0, 0, j2, null));
                }
                this.f81874g.f94084f.m190515g(this.f81870c, j, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
