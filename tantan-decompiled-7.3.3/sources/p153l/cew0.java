package p153l;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class cew0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final hew0 f81427b;

    /* JADX INFO: renamed from: c */
    public String f81428c;

    /* JADX INFO: renamed from: d */
    public String f81429d;

    /* JADX INFO: renamed from: e */
    public a7w0 f81430e;

    /* JADX INFO: renamed from: f */
    public zze f81431f;

    /* JADX INFO: renamed from: g */
    public Future f81432g;

    /* JADX INFO: renamed from: a */
    public final List f81426a = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int f81433h = 2;

    public cew0(hew0 hew0Var) {
        this.f81427b = hew0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized cew0 m109461a(rdw0 rdw0Var) {
        try {
            if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
                List list = this.f81426a;
                rdw0Var.zzi();
                list.add(rdw0Var);
                Future future = this.f81432g;
                if (future != null) {
                    future.cancel(false);
                }
                this.f81432g = oct0.f146736d.schedule(this, ((Integer) jas0.m144075c().m176505a(sgs0.f167996G8)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized cew0 m109462b(String str) {
        if (((Boolean) ris0.f163391c.m149974e()).booleanValue() && bew0.m103789e(str)) {
            this.f81428c = str;
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized cew0 m109463c(zze zzeVar) {
        if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
            this.f81431f = zzeVar;
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized cew0 m109464d(ArrayList arrayList) {
        try {
            if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.f81433h = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.f81433h = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.f81433h = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.f81433h = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f81433h = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.f81433h = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized cew0 m109465e(String str) {
        if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
            this.f81429d = str;
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized cew0 m109466f(a7w0 a7w0Var) {
        if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
            this.f81430e = a7w0Var;
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m109467g() {
        try {
            if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
                Future future = this.f81432g;
                if (future != null) {
                    future.cancel(false);
                }
                for (rdw0 rdw0Var : this.f81426a) {
                    int i = this.f81433h;
                    if (i != 2) {
                        rdw0Var.zzm(i);
                    }
                    if (!TextUtils.isEmpty(this.f81428c)) {
                        rdw0Var.mo162913c(this.f81428c);
                    }
                    if (!TextUtils.isEmpty(this.f81429d) && !rdw0Var.zzk()) {
                        rdw0Var.mo162915z(this.f81429d);
                    }
                    a7w0 a7w0Var = this.f81430e;
                    if (a7w0Var != null) {
                        rdw0Var.mo162911a(a7w0Var);
                    } else {
                        zze zzeVar = this.f81431f;
                        if (zzeVar != null) {
                            rdw0Var.mo162914i(zzeVar);
                        }
                    }
                    this.f81427b.m134677b(rdw0Var.zzl());
                }
                this.f81426a.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized cew0 m109468h(int i) {
        if (((Boolean) ris0.f163391c.m149974e()).booleanValue()) {
            this.f81433h = i;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        m109467g();
    }
}
