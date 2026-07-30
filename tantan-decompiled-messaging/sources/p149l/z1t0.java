package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class z1t0 {

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public final String f201101g;

    /* JADX INFO: renamed from: h */
    public final aiw0 f201102h;

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public long f201095a = -1;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public long f201096b = -1;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public int f201097c = -1;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public int f201098d = -1;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public long f201099e = 0;

    /* JADX INFO: renamed from: f */
    public final Object f201100f = new Object();

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public int f201103i = 0;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public int f201104j = 0;

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public int f201105k = 0;

    public z1t0(String str, aiw0 aiw0Var) {
        this.f201101g = str;
        this.f201102h = aiw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m216803a() {
        int i;
        synchronized (this.f201100f) {
            i = this.f201105k;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m216804b(Context context, String str) {
        Bundle bundle;
        synchronized (this.f201100f) {
            try {
                bundle = new Bundle();
                if (!this.f201102h.mo96947f()) {
                    bundle.putString("session_id", this.f201101g);
                }
                bundle.putLong("basets", this.f201096b);
                bundle.putLong("currts", this.f201095a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f201097c);
                bundle.putInt("preqs_in_session", this.f201098d);
                bundle.putLong("time_in_session", this.f201099e);
                bundle.putInt("pclick", this.f201103i);
                bundle.putInt("pimp", this.f201104j);
                Context contextM211305a = xvs0.m211305a(context);
                int identifier = contextM211305a.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z = false;
                if (identifier == 0) {
                    x2t0.m206868f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextM211305a.getPackageManager().getActivityInfo(new ComponentName(contextM211305a.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z = true;
                        } else {
                            x2t0.m206868f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        x2t0.m206869g("Fail to fetch AdActivity theme");
                        x2t0.m206868f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z);
                bundle.putInt("consent_form_action_identifier", m216803a());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public final void m216805c() {
        synchronized (this.f201100f) {
            this.f201103i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m216806d() {
        synchronized (this.f201100f) {
            this.f201104j++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m216807e() {
        m216811i();
    }

    /* JADX INFO: renamed from: f */
    public final void m216808f() {
        m216811i();
    }

    /* JADX INFO: renamed from: g */
    public final void m216809g(zzl zzlVar, long j) {
        Bundle bundle;
        synchronized (this.f201100f) {
            try {
                long jZzd = this.f201102h.zzd();
                long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
                if (this.f201096b == -1) {
                    if (jCurrentTimeMillis - jZzd > ((Long) d1s0.m109677c().m144697a(m7s0.f132073T0)).longValue()) {
                        this.f201098d = -1;
                    } else {
                        this.f201098d = this.f201102h.zzc();
                    }
                    this.f201096b = j;
                    this.f201095a = j;
                } else {
                    this.f201095a = j;
                }
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132406t3)).booleanValue() || (bundle = zzlVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.f201097c++;
                    int i = this.f201098d + 1;
                    this.f201098d = i;
                    if (i == 0) {
                        this.f201099e = 0L;
                        this.f201102h.zzD(jCurrentTimeMillis);
                    } else {
                        this.f201099e = jCurrentTimeMillis - this.f201102h.zze();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m216810h() {
        synchronized (this.f201100f) {
            this.f201105k++;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m216811i() {
        if (((Boolean) ias0.f112319a.m115379e()).booleanValue()) {
            synchronized (this.f201100f) {
                this.f201097c--;
                this.f201098d--;
            }
        }
    }
}
