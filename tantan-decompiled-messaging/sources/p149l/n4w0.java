package p149l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class n4w0 implements l4w0 {

    /* JADX INFO: renamed from: a */
    public final Context f137127a;

    /* JADX INFO: renamed from: o */
    public final int f137141o;

    /* JADX INFO: renamed from: b */
    public long f137128b = 0;

    /* JADX INFO: renamed from: c */
    public long f137129c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f137130d = false;

    /* JADX INFO: renamed from: p */
    public int f137142p = 2;

    /* JADX INFO: renamed from: q */
    public int f137143q = 2;

    /* JADX INFO: renamed from: e */
    public int f137131e = 0;

    /* JADX INFO: renamed from: f */
    public String f137132f = "";

    /* JADX INFO: renamed from: g */
    public String f137133g = "";

    /* JADX INFO: renamed from: h */
    public String f137134h = "";

    /* JADX INFO: renamed from: i */
    public String f137135i = "";

    /* JADX INFO: renamed from: j */
    public String f137136j = "";

    /* JADX INFO: renamed from: k */
    public String f137137k = "";

    /* JADX INFO: renamed from: l */
    public String f137138l = "";

    /* JADX INFO: renamed from: m */
    public boolean f137139m = false;

    /* JADX INFO: renamed from: n */
    public boolean f137140n = false;

    public n4w0(Context context, int i) {
        this.f137127a = context;
        this.f137141o = i;
    }

    /* JADX INFO: renamed from: A */
    public final synchronized n4w0 m157908A() {
        Configuration configuration;
        this.f137131e = vny0.m199081s().mo109120k(this.f137127a);
        Resources resources = this.f137127a.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.f137143q = i;
        this.f137128b = vny0.m199064b().elapsedRealtime();
        this.f137140n = true;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public final synchronized n4w0 m157909B() {
        this.f137129c = vny0.m199064b().elapsedRealtime();
        return this;
    }

    @Override // p149l.l4w0
    /* JADX INFO: renamed from: S */
    public final /* bridge */ /* synthetic */ l4w0 mo129461S(boolean z) {
        m157916x(z);
        return this;
    }

    @Override // p149l.l4w0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ l4w0 mo129462a(uxv0 uxv0Var) {
        m157912t(uxv0Var);
        return this;
    }

    @Override // p149l.l4w0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ l4w0 mo129463b(Throwable th) {
        m157917y(th);
        return this;
    }

    @Override // p149l.l4w0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ l4w0 mo129464c(String str) {
        m157915w(str);
        return this;
    }

    @Override // p149l.l4w0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ l4w0 mo129465i(zze zzeVar) {
        m157911s(zzeVar);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized n4w0 m157910l(int i) {
        this.f137142p = i;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized n4w0 m157911s(zze zzeVar) {
        try {
            IBinder iBinder = zzeVar.zze;
            if (iBinder != null) {
                vwt0 vwt0Var = (vwt0) iBinder;
                String strZzk = vwt0Var.zzk();
                if (!TextUtils.isEmpty(strZzk)) {
                    this.f137132f = strZzk;
                }
                String strZzi = vwt0Var.zzi();
                if (!TextUtils.isEmpty(strZzi)) {
                    this.f137133g = strZzi;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX INFO: renamed from: t */
    public final synchronized n4w0 m157912t(uxv0 uxv0Var) {
        try {
            if (!TextUtils.isEmpty(uxv0Var.f178773b.f141055b)) {
                this.f137132f = uxv0Var.f178773b.f141055b;
            }
            for (kxv0 kxv0Var : uxv0Var.f178772a) {
                if (!TextUtils.isEmpty(kxv0Var.f125188c0)) {
                    this.f137133g = kxv0Var.f125188c0;
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized n4w0 m157913u(String str) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131949I8)).booleanValue()) {
            this.f137138l = str;
        }
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final synchronized n4w0 m157914v(String str) {
        this.f137134h = str;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final synchronized n4w0 m157915w(String str) {
        this.f137135i = str;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final synchronized n4w0 m157916x(boolean z) {
        this.f137130d = z;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final synchronized n4w0 m157917y(Throwable th) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131949I8)).booleanValue()) {
            this.f137137k = qts0.m176481g(th);
            this.f137136j = (String) xfw0.m208616c(vew0.m198261b('\n')).m208618d(qts0.m176480f(th)).iterator().next();
        }
        return this;
    }

    @Override // p149l.l4w0
    /* JADX INFO: renamed from: z */
    public final /* bridge */ /* synthetic */ l4w0 mo129466z(String str) {
        m157914v(str);
        return this;
    }

    @Override // p149l.l4w0
    public final /* bridge */ /* synthetic */ l4w0 zzc(String str) {
        m157913u(str);
        return this;
    }

    @Override // p149l.l4w0
    public final /* bridge */ /* synthetic */ l4w0 zzh() {
        m157908A();
        return this;
    }

    @Override // p149l.l4w0
    public final /* bridge */ /* synthetic */ l4w0 zzi() {
        m157909B();
        return this;
    }

    @Override // p149l.l4w0
    public final synchronized boolean zzj() {
        return this.f137140n;
    }

    @Override // p149l.l4w0
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.f137134h);
    }

    @Override // p149l.l4w0
    @Nullable
    public final synchronized p4w0 zzl() {
        try {
            o4w0 o4w0Var = null;
            if (this.f137139m) {
                return null;
            }
            this.f137139m = true;
            if (!this.f137140n) {
                m157908A();
            }
            if (this.f137129c < 0) {
                m157909B();
            }
            return new p4w0(this, o4w0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.l4w0
    public final /* bridge */ /* synthetic */ l4w0 zzm(int i) {
        m157910l(i);
        return this;
    }
}
