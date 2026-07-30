package p149l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.util.CollectionUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class sat0 extends zeu0 {

    /* JADX INFO: renamed from: a */
    public final v5t0 f163439a;

    /* JADX INFO: renamed from: c */
    public final boolean f163441c;

    /* JADX INFO: renamed from: d */
    public final boolean f163442d;

    /* JADX INFO: renamed from: e */
    public int f163443e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public uju0 f163444f;

    /* JADX INFO: renamed from: g */
    public boolean f163445g;

    /* JADX INFO: renamed from: i */
    public float f163447i;

    /* JADX INFO: renamed from: j */
    public float f163448j;

    /* JADX INFO: renamed from: k */
    public float f163449k;

    /* JADX INFO: renamed from: l */
    public boolean f163450l;

    /* JADX INFO: renamed from: m */
    public boolean f163451m;

    /* JADX INFO: renamed from: n */
    public jds0 f163452n;

    /* JADX INFO: renamed from: b */
    public final Object f163440b = new Object();

    /* JADX INFO: renamed from: h */
    public boolean f163446h = true;

    public sat0(v5t0 v5t0Var, float f, boolean z, boolean z2) {
        this.f163439a = v5t0Var;
        this.f163447i = f;
        this.f163441c = z;
        this.f163442d = z2;
    }

    @Override // p149l.fgu0
    /* JADX INFO: renamed from: X */
    public final void mo121267X(boolean z) {
        m183098w8(true != z ? "unmute" : BLiveButtonType.mute, null);
    }

    @Override // p149l.fgu0
    /* JADX INFO: renamed from: a */
    public final boolean mo121268a() {
        boolean z;
        synchronized (this.f163440b) {
            z = this.f163446h;
        }
        return z;
    }

    /* JADX INFO: renamed from: p8 */
    public final void m183091p8(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.f163440b) {
            try {
                z2 = true;
                if (f2 == this.f163447i && f3 == this.f163449k) {
                    z2 = false;
                }
                this.f163447i = f2;
                this.f163448j = f;
                z3 = this.f163446h;
                this.f163446h = z;
                i2 = this.f163443e;
                this.f163443e = i;
                float f4 = this.f163449k;
                this.f163449k = f3;
                if (Math.abs(f3 - f4) > 1.0E-4f) {
                    this.f163439a.zzF().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            try {
                jds0 jds0Var = this.f163452n;
                if (jds0Var != null) {
                    jds0Var.zze();
                }
            } catch (RemoteException e) {
                x2t0.m206871i("#007 Could not call remote method.", e);
            }
        }
        m183097v8(i2, i, z3, z);
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m183092q8(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        boolean z4;
        uju0 uju0Var;
        uju0 uju0Var2;
        uju0 uju0Var3;
        synchronized (this.f163440b) {
            try {
                boolean z5 = this.f163445g;
                if (z5 || i2 != 1) {
                    i3 = i2;
                    z3 = false;
                } else {
                    i2 = 1;
                    i3 = 1;
                    z3 = true;
                }
                boolean z6 = i != i2;
                if (z6 && i3 == 1) {
                    z4 = true;
                    i3 = 1;
                } else {
                    z4 = false;
                }
                boolean z7 = z6 && i3 == 2;
                boolean z8 = z6 && i3 == 3;
                this.f163445g = z5 || z3;
                if (z3) {
                    try {
                        uju0 uju0Var4 = this.f163444f;
                        if (uju0Var4 != null) {
                            uju0Var4.zzi();
                        }
                    } catch (RemoteException e) {
                        x2t0.m206871i("#007 Could not call remote method.", e);
                    }
                }
                if (z4 && (uju0Var3 = this.f163444f) != null) {
                    uju0Var3.zzh();
                }
                if (z7 && (uju0Var2 = this.f163444f) != null) {
                    uju0Var2.zzg();
                }
                if (z8) {
                    uju0 uju0Var5 = this.f163444f;
                    if (uju0Var5 != null) {
                        uju0Var5.zze();
                    }
                    this.f163439a.mo13694k();
                }
                if (z != z2 && (uju0Var = this.f163444f) != null) {
                    uju0Var.mo144125S(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m183093r8(Map map) {
        this.f163439a.mo13674Z("pubVideoCmd", map);
    }

    @Override // p149l.fgu0
    /* JADX INFO: renamed from: s1 */
    public final void mo121269s1(@Nullable uju0 uju0Var) {
        synchronized (this.f163440b) {
            this.f163444f = uju0Var;
        }
    }

    /* JADX INFO: renamed from: s8 */
    public final void m183094s8(zzfk zzfkVar) {
        Object obj = this.f163440b;
        boolean z = zzfkVar.zza;
        boolean z2 = zzfkVar.zzb;
        boolean z3 = zzfkVar.zzc;
        synchronized (obj) {
            this.f163450l = z2;
            this.f163451m = z3;
        }
        m183098w8("initialState", CollectionUtils.mapOf("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    /* JADX INFO: renamed from: t8 */
    public final void m183095t8(float f) {
        synchronized (this.f163440b) {
            this.f163448j = f;
        }
    }

    /* JADX INFO: renamed from: u8 */
    public final void m183096u8(jds0 jds0Var) {
        synchronized (this.f163440b) {
            this.f163452n = jds0Var;
        }
    }

    /* JADX INFO: renamed from: v8 */
    public final void m183097v8(final int i, final int i2, final boolean z, final boolean z2) {
        i3t0.f111376e.execute(new Runnable() { // from class: l.rat0
            @Override // java.lang.Runnable
            public final void run() {
                this.f158557a.m183092q8(i, i2, z, z2);
            }
        });
    }

    /* JADX INFO: renamed from: w8 */
    public final void m183098w8(String str, @Nullable Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        i3t0.f111376e.execute(new Runnable() { // from class: l.qat0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153569a.m183093r8(map2);
            }
        });
    }

    @Override // p149l.fgu0
    public final float zze() {
        float f;
        synchronized (this.f163440b) {
            f = this.f163449k;
        }
        return f;
    }

    @Override // p149l.fgu0
    public final float zzf() {
        float f;
        synchronized (this.f163440b) {
            f = this.f163448j;
        }
        return f;
    }

    @Override // p149l.fgu0
    public final float zzg() {
        float f;
        synchronized (this.f163440b) {
            f = this.f163447i;
        }
        return f;
    }

    @Override // p149l.fgu0
    public final int zzh() {
        int i;
        synchronized (this.f163440b) {
            i = this.f163443e;
        }
        return i;
    }

    @Override // p149l.fgu0
    @Nullable
    public final uju0 zzi() throws RemoteException {
        uju0 uju0Var;
        synchronized (this.f163440b) {
            uju0Var = this.f163444f;
        }
        return uju0Var;
    }

    @Override // p149l.fgu0
    public final void zzk() {
        m183098w8("pause", null);
    }

    @Override // p149l.fgu0
    public final void zzl() {
        m183098w8("play", null);
    }

    @Override // p149l.fgu0
    public final void zzn() {
        m183098w8("stop", null);
    }

    @Override // p149l.fgu0
    public final boolean zzo() {
        boolean z;
        Object obj = this.f163440b;
        boolean zZzp = zzp();
        synchronized (obj) {
            z = false;
            if (!zZzp) {
                try {
                    if (this.f163451m && this.f163442d) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    @Override // p149l.fgu0
    public final boolean zzp() {
        boolean z;
        synchronized (this.f163440b) {
            try {
                z = false;
                if (this.f163441c && this.f163450l) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void zzu() {
        boolean z;
        int i;
        synchronized (this.f163440b) {
            z = this.f163446h;
            i = this.f163443e;
            this.f163443e = 3;
        }
        m183097v8(i, 3, z, z);
    }
}
