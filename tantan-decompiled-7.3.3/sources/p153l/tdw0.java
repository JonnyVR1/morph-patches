package p153l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class tdw0 implements rdw0 {

    /* JADX INFO: renamed from: a */
    public final Context f173392a;

    /* JADX INFO: renamed from: o */
    public final int f173406o;

    /* JADX INFO: renamed from: b */
    public long f173393b = 0;

    /* JADX INFO: renamed from: c */
    public long f173394c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f173395d = false;

    /* JADX INFO: renamed from: p */
    public int f173407p = 2;

    /* JADX INFO: renamed from: q */
    public int f173408q = 2;

    /* JADX INFO: renamed from: e */
    public int f173396e = 0;

    /* JADX INFO: renamed from: f */
    public String f173397f = "";

    /* JADX INFO: renamed from: g */
    public String f173398g = "";

    /* JADX INFO: renamed from: h */
    public String f173399h = "";

    /* JADX INFO: renamed from: i */
    public String f173400i = "";

    /* JADX INFO: renamed from: j */
    public String f173401j = "";

    /* JADX INFO: renamed from: k */
    public String f173402k = "";

    /* JADX INFO: renamed from: l */
    public String f173403l = "";

    /* JADX INFO: renamed from: m */
    public boolean f173404m = false;

    /* JADX INFO: renamed from: n */
    public boolean f173405n = false;

    public tdw0(Context context, int i) {
        this.f173392a = context;
        this.f173406o = i;
    }

    /* JADX INFO: renamed from: A */
    public final synchronized tdw0 m190656A() {
        Configuration configuration;
        this.f173396e = bxy0.m106935s().mo109059k(this.f173392a);
        Resources resources = this.f173392a.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.f173408q = i;
        this.f173393b = bxy0.m106918b().elapsedRealtime();
        this.f173405n = true;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public final synchronized tdw0 m190657B() {
        this.f173394c = bxy0.m106918b().elapsedRealtime();
        return this;
    }

    @Override // p153l.rdw0
    /* JADX INFO: renamed from: S */
    public final /* bridge */ /* synthetic */ rdw0 mo162910S(boolean z) {
        m190664x(z);
        return this;
    }

    @Override // p153l.rdw0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ rdw0 mo162911a(a7w0 a7w0Var) {
        m190660t(a7w0Var);
        return this;
    }

    @Override // p153l.rdw0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ rdw0 mo162912b(Throwable th) {
        m190665y(th);
        return this;
    }

    @Override // p153l.rdw0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ rdw0 mo162913c(String str) {
        m190663w(str);
        return this;
    }

    @Override // p153l.rdw0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ rdw0 mo162914i(zze zzeVar) {
        m190659s(zzeVar);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized tdw0 m190658l(int i) {
        this.f173407p = i;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized tdw0 m190659s(zze zzeVar) {
        try {
            IBinder iBinder = zzeVar.zze;
            if (iBinder != null) {
                b6u0 b6u0Var = (b6u0) iBinder;
                String strZzk = b6u0Var.zzk();
                if (!TextUtils.isEmpty(strZzk)) {
                    this.f173397f = strZzk;
                }
                String strZzi = b6u0Var.zzi();
                if (!TextUtils.isEmpty(strZzi)) {
                    this.f173398g = strZzi;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX INFO: renamed from: t */
    public final synchronized tdw0 m190660t(a7w0 a7w0Var) {
        try {
            if (!TextUtils.isEmpty(a7w0Var.f68854b.f172368b)) {
                this.f173397f = a7w0Var.f68854b.f172368b;
            }
            for (q6w0 q6w0Var : a7w0Var.f68853a) {
                if (!TextUtils.isEmpty(q6w0Var.f155878c0)) {
                    this.f173398g = q6w0Var.f155878c0;
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized tdw0 m190661u(String str) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168020I8)).booleanValue()) {
            this.f173403l = str;
        }
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final synchronized tdw0 m190662v(String str) {
        this.f173399h = str;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final synchronized tdw0 m190663w(String str) {
        this.f173400i = str;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final synchronized tdw0 m190664x(boolean z) {
        this.f173395d = z;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final synchronized tdw0 m190665y(Throwable th) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168020I8)).booleanValue()) {
            this.f173402k = w2t0.m204596g(th);
            this.f173401j = (String) dpw0.m117427c(bow0.m105711b('\n')).m117429d(w2t0.m204595f(th)).iterator().next();
        }
        return this;
    }

    @Override // p153l.rdw0
    /* JADX INFO: renamed from: z */
    public final /* bridge */ /* synthetic */ rdw0 mo162915z(String str) {
        m190662v(str);
        return this;
    }

    @Override // p153l.rdw0
    public final /* bridge */ /* synthetic */ rdw0 zzc(String str) {
        m190661u(str);
        return this;
    }

    @Override // p153l.rdw0
    public final /* bridge */ /* synthetic */ rdw0 zzh() {
        m190656A();
        return this;
    }

    @Override // p153l.rdw0
    public final /* bridge */ /* synthetic */ rdw0 zzi() {
        m190657B();
        return this;
    }

    @Override // p153l.rdw0
    public final synchronized boolean zzj() {
        return this.f173405n;
    }

    @Override // p153l.rdw0
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.f173399h);
    }

    @Override // p153l.rdw0
    @Nullable
    public final synchronized vdw0 zzl() {
        try {
            udw0 udw0Var = null;
            if (this.f173404m) {
                return null;
            }
            this.f173404m = true;
            if (!this.f173405n) {
                m190656A();
            }
            if (this.f173394c < 0) {
                m190657B();
            }
            return new vdw0(this, udw0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.rdw0
    public final /* bridge */ /* synthetic */ rdw0 zzm(int i) {
        m190658l(i);
        return this;
    }
}
