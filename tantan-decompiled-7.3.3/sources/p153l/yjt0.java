package p153l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.util.CollectionUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yjt0 extends fou0 {

    /* JADX INFO: renamed from: a */
    public final bft0 f200332a;

    /* JADX INFO: renamed from: c */
    public final boolean f200334c;

    /* JADX INFO: renamed from: d */
    public final boolean f200335d;

    /* JADX INFO: renamed from: e */
    public int f200336e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public atu0 f200337f;

    /* JADX INFO: renamed from: g */
    public boolean f200338g;

    /* JADX INFO: renamed from: i */
    public float f200340i;

    /* JADX INFO: renamed from: j */
    public float f200341j;

    /* JADX INFO: renamed from: k */
    public float f200342k;

    /* JADX INFO: renamed from: l */
    public boolean f200343l;

    /* JADX INFO: renamed from: m */
    public boolean f200344m;

    /* JADX INFO: renamed from: n */
    public pms0 f200345n;

    /* JADX INFO: renamed from: b */
    public final Object f200333b = new Object();

    /* JADX INFO: renamed from: h */
    public boolean f200339h = true;

    public yjt0(bft0 bft0Var, float f, boolean z, boolean z2) {
        this.f200332a = bft0Var;
        this.f200340i = f;
        this.f200334c = z;
        this.f200335d = z2;
    }

    @Override // p153l.lpu0
    /* JADX INFO: renamed from: X */
    public final void mo155295X(boolean z) {
        m216436w8(true != z ? "unmute" : BLiveButtonType.mute, null);
    }

    @Override // p153l.lpu0
    /* JADX INFO: renamed from: a */
    public final boolean mo155296a() {
        boolean z;
        synchronized (this.f200333b) {
            z = this.f200339h;
        }
        return z;
    }

    /* JADX INFO: renamed from: p8 */
    public final void m216429p8(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.f200333b) {
            try {
                z2 = true;
                if (f2 == this.f200340i && f3 == this.f200342k) {
                    z2 = false;
                }
                this.f200340i = f2;
                this.f200341j = f;
                z3 = this.f200339h;
                this.f200339h = z;
                i2 = this.f200336e;
                this.f200336e = i;
                float f4 = this.f200342k;
                this.f200342k = f3;
                if (Math.abs(f3 - f4) > 1.0E-4f) {
                    this.f200332a.zzF().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            try {
                pms0 pms0Var = this.f200345n;
                if (pms0Var != null) {
                    pms0Var.zze();
                }
            } catch (RemoteException e) {
                dct0.m115300i("#007 Could not call remote method.", e);
            }
        }
        m216435v8(i2, i, z3, z);
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m216430q8(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        boolean z4;
        atu0 atu0Var;
        atu0 atu0Var2;
        atu0 atu0Var3;
        synchronized (this.f200333b) {
            try {
                boolean z5 = this.f200338g;
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
                this.f200338g = z5 || z3;
                if (z3) {
                    try {
                        atu0 atu0Var4 = this.f200337f;
                        if (atu0Var4 != null) {
                            atu0Var4.zzi();
                        }
                    } catch (RemoteException e) {
                        dct0.m115300i("#007 Could not call remote method.", e);
                    }
                }
                if (z4 && (atu0Var3 = this.f200337f) != null) {
                    atu0Var3.zzh();
                }
                if (z7 && (atu0Var2 = this.f200337f) != null) {
                    atu0Var2.zzg();
                }
                if (z8) {
                    atu0 atu0Var5 = this.f200337f;
                    if (atu0Var5 != null) {
                        atu0Var5.zze();
                    }
                    this.f200332a.mo13748k();
                }
                if (z != z2 && (atu0Var = this.f200337f) != null) {
                    atu0Var.mo100274S(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m216431r8(Map map) {
        this.f200332a.mo13728Z("pubVideoCmd", map);
    }

    @Override // p153l.lpu0
    /* JADX INFO: renamed from: s1 */
    public final void mo155297s1(@Nullable atu0 atu0Var) {
        synchronized (this.f200333b) {
            this.f200337f = atu0Var;
        }
    }

    /* JADX INFO: renamed from: s8 */
    public final void m216432s8(zzfk zzfkVar) {
        Object obj = this.f200333b;
        boolean z = zzfkVar.zza;
        boolean z2 = zzfkVar.zzb;
        boolean z3 = zzfkVar.zzc;
        synchronized (obj) {
            this.f200343l = z2;
            this.f200344m = z3;
        }
        m216436w8("initialState", CollectionUtils.mapOf("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    /* JADX INFO: renamed from: t8 */
    public final void m216433t8(float f) {
        synchronized (this.f200333b) {
            this.f200341j = f;
        }
    }

    /* JADX INFO: renamed from: u8 */
    public final void m216434u8(pms0 pms0Var) {
        synchronized (this.f200333b) {
            this.f200345n = pms0Var;
        }
    }

    /* JADX INFO: renamed from: v8 */
    public final void m216435v8(final int i, final int i2, final boolean z, final boolean z2) {
        oct0.f146737e.execute(new Runnable() { // from class: l.xjt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f194645a.m216430q8(i, i2, z, z2);
            }
        });
    }

    /* JADX INFO: renamed from: w8 */
    public final void m216436w8(String str, @Nullable Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        oct0.f146737e.execute(new Runnable() { // from class: l.wjt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f189496a.m216431r8(map2);
            }
        });
    }

    @Override // p153l.lpu0
    public final float zze() {
        float f;
        synchronized (this.f200333b) {
            f = this.f200342k;
        }
        return f;
    }

    @Override // p153l.lpu0
    public final float zzf() {
        float f;
        synchronized (this.f200333b) {
            f = this.f200341j;
        }
        return f;
    }

    @Override // p153l.lpu0
    public final float zzg() {
        float f;
        synchronized (this.f200333b) {
            f = this.f200340i;
        }
        return f;
    }

    @Override // p153l.lpu0
    public final int zzh() {
        int i;
        synchronized (this.f200333b) {
            i = this.f200336e;
        }
        return i;
    }

    @Override // p153l.lpu0
    @Nullable
    public final atu0 zzi() throws RemoteException {
        atu0 atu0Var;
        synchronized (this.f200333b) {
            atu0Var = this.f200337f;
        }
        return atu0Var;
    }

    @Override // p153l.lpu0
    public final void zzk() {
        m216436w8("pause", null);
    }

    @Override // p153l.lpu0
    public final void zzl() {
        m216436w8("play", null);
    }

    @Override // p153l.lpu0
    public final void zzn() {
        m216436w8("stop", null);
    }

    @Override // p153l.lpu0
    public final boolean zzo() {
        boolean z;
        Object obj = this.f200333b;
        boolean zZzp = zzp();
        synchronized (obj) {
            z = false;
            if (!zZzp) {
                try {
                    if (this.f200344m && this.f200335d) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    @Override // p153l.lpu0
    public final boolean zzp() {
        boolean z;
        synchronized (this.f200333b) {
            try {
                z = false;
                if (this.f200334c && this.f200343l) {
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
        synchronized (this.f200333b) {
            z = this.f200339h;
            i = this.f200336e;
            this.f200336e = 3;
        }
        m216435v8(i, 3, z, z);
    }
}
