package p149l;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class w4w0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final b5w0 f184616b;

    /* JADX INFO: renamed from: c */
    public String f184617c;

    /* JADX INFO: renamed from: d */
    public String f184618d;

    /* JADX INFO: renamed from: e */
    public uxv0 f184619e;

    /* JADX INFO: renamed from: f */
    public zze f184620f;

    /* JADX INFO: renamed from: g */
    public Future f184621g;

    /* JADX INFO: renamed from: a */
    public final List f184615a = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int f184622h = 2;

    public w4w0(b5w0 b5w0Var) {
        this.f184616b = b5w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized w4w0 m201583a(l4w0 l4w0Var) {
        try {
            if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
                List list = this.f184615a;
                l4w0Var.zzi();
                list.add(l4w0Var);
                Future future = this.f184621g;
                if (future != null) {
                    future.cancel(false);
                }
                this.f184621g = i3t0.f111375d.schedule(this, ((Integer) d1s0.m109677c().m144697a(m7s0.f131925G8)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized w4w0 m201584b(String str) {
        if (((Boolean) l9s0.f127142c.m115379e()).booleanValue() && v4w0.m197069e(str)) {
            this.f184617c = str;
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized w4w0 m201585c(zze zzeVar) {
        if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
            this.f184620f = zzeVar;
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized w4w0 m201586d(ArrayList arrayList) {
        try {
            if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.f184622h = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.f184622h = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.f184622h = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.f184622h = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f184622h = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.f184622h = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized w4w0 m201587e(String str) {
        if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
            this.f184618d = str;
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized w4w0 m201588f(uxv0 uxv0Var) {
        if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
            this.f184619e = uxv0Var;
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m201589g() {
        try {
            if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
                Future future = this.f184621g;
                if (future != null) {
                    future.cancel(false);
                }
                for (l4w0 l4w0Var : this.f184615a) {
                    int i = this.f184622h;
                    if (i != 2) {
                        l4w0Var.zzm(i);
                    }
                    if (!TextUtils.isEmpty(this.f184617c)) {
                        l4w0Var.mo129464c(this.f184617c);
                    }
                    if (!TextUtils.isEmpty(this.f184618d) && !l4w0Var.zzk()) {
                        l4w0Var.mo129466z(this.f184618d);
                    }
                    uxv0 uxv0Var = this.f184619e;
                    if (uxv0Var != null) {
                        l4w0Var.mo129462a(uxv0Var);
                    } else {
                        zze zzeVar = this.f184620f;
                        if (zzeVar != null) {
                            l4w0Var.mo129465i(zzeVar);
                        }
                    }
                    this.f184616b.m100344b(l4w0Var.zzl());
                }
                this.f184615a.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized w4w0 m201590h(int i) {
        if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
            this.f184622h = i;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        m201589g();
    }
}
