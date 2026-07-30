package p153l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class fbt0 {

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public final String f98151g;

    /* JADX INFO: renamed from: h */
    public final grw0 f98152h;

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public long f98145a = -1;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public long f98146b = -1;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public int f98147c = -1;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public int f98148d = -1;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public long f98149e = 0;

    /* JADX INFO: renamed from: f */
    public final Object f98150f = new Object();

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public int f98153i = 0;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public int f98154j = 0;

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public int f98155k = 0;

    public fbt0(String str, grw0 grw0Var) {
        this.f98151g = str;
        this.f98152h = grw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m124929a() {
        int i;
        synchronized (this.f98150f) {
            i = this.f98155k;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m124930b(Context context, String str) {
        Bundle bundle;
        synchronized (this.f98150f) {
            try {
                bundle = new Bundle();
                if (!this.f98152h.mo131896f()) {
                    bundle.putString("session_id", this.f98151g);
                }
                bundle.putLong("basets", this.f98146b);
                bundle.putLong("currts", this.f98145a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f98147c);
                bundle.putInt("preqs_in_session", this.f98148d);
                bundle.putLong("time_in_session", this.f98149e);
                bundle.putInt("pclick", this.f98153i);
                bundle.putInt("pimp", this.f98154j);
                Context contextM114319a = d5t0.m114319a(context);
                int identifier = contextM114319a.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z = false;
                if (identifier == 0) {
                    dct0.m115297f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextM114319a.getPackageManager().getActivityInfo(new ComponentName(contextM114319a.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z = true;
                        } else {
                            dct0.m115297f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        dct0.m115298g("Fail to fetch AdActivity theme");
                        dct0.m115297f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z);
                bundle.putInt("consent_form_action_identifier", m124929a());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public final void m124931c() {
        synchronized (this.f98150f) {
            this.f98153i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m124932d() {
        synchronized (this.f98150f) {
            this.f98154j++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m124933e() {
        m124937i();
    }

    /* JADX INFO: renamed from: f */
    public final void m124934f() {
        m124937i();
    }

    /* JADX INFO: renamed from: g */
    public final void m124935g(zzl zzlVar, long j) {
        Bundle bundle;
        synchronized (this.f98150f) {
            try {
                long jZzd = this.f98152h.zzd();
                long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
                if (this.f98146b == -1) {
                    if (jCurrentTimeMillis - jZzd > ((Long) jas0.m144075c().m176505a(sgs0.f168144T0)).longValue()) {
                        this.f98148d = -1;
                    } else {
                        this.f98148d = this.f98152h.zzc();
                    }
                    this.f98146b = j;
                    this.f98145a = j;
                } else {
                    this.f98145a = j;
                }
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168477t3)).booleanValue() || (bundle = zzlVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.f98147c++;
                    int i = this.f98148d + 1;
                    this.f98148d = i;
                    if (i == 0) {
                        this.f98149e = 0L;
                        this.f98152h.zzD(jCurrentTimeMillis);
                    } else {
                        this.f98149e = jCurrentTimeMillis - this.f98152h.zze();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m124936h() {
        synchronized (this.f98150f) {
            this.f98155k++;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m124937i() {
        if (((Boolean) ojs0.f147710a.m149974e()).booleanValue()) {
            synchronized (this.f98150f) {
                this.f98147c--;
                this.f98148d--;
            }
        }
    }
}
