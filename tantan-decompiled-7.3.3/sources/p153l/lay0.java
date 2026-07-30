package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_language_id_common.zzhy;
import com.google.android.gms.internal.mlkit_language_id_common.zzu;
import com.google.android.gms.internal.mlkit_language_id_common.zzw;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.C3386a;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class lay0 {

    /* JADX INFO: renamed from: k */
    @Nullable
    public static zzu f130747k;

    /* JADX INFO: renamed from: l */
    public static final zzw f130748l = zzw.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a */
    public final String f130749a;

    /* JADX INFO: renamed from: b */
    public final String f130750b;

    /* JADX INFO: renamed from: c */
    public final iay0 f130751c;

    /* JADX INFO: renamed from: d */
    public final h4f0 f130752d;

    /* JADX INFO: renamed from: e */
    public final Task f130753e;

    /* JADX INFO: renamed from: f */
    public final Task f130754f;

    /* JADX INFO: renamed from: g */
    public final String f130755g;

    /* JADX INFO: renamed from: h */
    public final int f130756h;

    /* JADX INFO: renamed from: i */
    public final Map f130757i = new HashMap();

    /* JADX INFO: renamed from: j */
    public final Map f130758j = new HashMap();

    public lay0(Context context, final h4f0 h4f0Var, iay0 iay0Var, String str) {
        this.f130749a = context.getPackageName();
        this.f130750b = tn5.m191875a(context);
        this.f130752d = h4f0Var;
        this.f130751c = iay0Var;
        pcy0.m171702a();
        this.f130755g = str;
        this.f130753e = C3386a.m16929a().m16932b(new Callable() { // from class: l.w9y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f188074a.m153544a();
            }
        });
        C3386a c3386aM16929a = C3386a.m16929a();
        h4f0Var.getClass();
        this.f130754f = c3386aM16929a.m16932b(new Callable() { // from class: l.aay0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h4f0Var.m133571a();
            }
        });
        zzw zzwVar = f130748l;
        this.f130756h = zzwVar.containsKey(str) ? DynamiteModule.m12529c(context, (String) zzwVar.get(str)) : -1;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static synchronized zzu m153543f() {
        try {
            zzu zzuVar = f130747k;
            if (zzuVar != null) {
                return zzuVar;
            }
            fxv fxvVarM203065a = vw5.m203065a(Resources.getSystem().getConfiguration());
            tsy0 tsy0Var = new tsy0();
            for (int i = 0; i < fxvVarM203065a.m128032c(); i++) {
                tsy0Var.m192645c(tn5.m191876b(fxvVarM203065a.m128031b(i)));
            }
            zzu zzuVarM192646d = tsy0Var.m192646d();
            f130747k = zzuVarM192646d;
            return zzuVarM192646d;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String m153544a() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f130755g);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m153545b(e9y0 e9y0Var, zzhy zzhyVar, String str) {
        e9y0Var.mo119967a(zzhyVar);
        String strZzd = e9y0Var.zzd();
        j4y0 j4y0Var = new j4y0();
        j4y0Var.m143480b(this.f130749a);
        j4y0Var.m143481c(this.f130750b);
        j4y0Var.m143486h(m153543f());
        j4y0Var.m143485g(Boolean.TRUE);
        j4y0Var.m143490l(strZzd);
        j4y0Var.m143488j(str);
        j4y0Var.m143487i(this.f130754f.mo15431p() ? (String) this.f130754f.mo15427l() : this.f130752d.m133571a());
        j4y0Var.m143482d(10);
        j4y0Var.m143489k(Integer.valueOf(this.f130756h));
        e9y0Var.mo119969c(j4y0Var);
        this.f130751c.mo139226a(e9y0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m153546c(e9y0 e9y0Var, zzhy zzhyVar) {
        m153547d(e9y0Var, zzhyVar, m153549g());
    }

    /* JADX INFO: renamed from: d */
    public final void m153547d(final e9y0 e9y0Var, final zzhy zzhyVar, final String str) {
        C3386a.m16930d().execute(new Runnable() { // from class: l.day0
            @Override // java.lang.Runnable
            public final void run() {
                this.f85945a.m153545b(e9y0Var, zzhyVar, str);
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: e */
    public final void m153548e(lyv0 lyv0Var, zzhy zzhyVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f130757i.get(zzhyVar) != null && jElapsedRealtime - ((Long) this.f130757i.get(zzhyVar)).longValue() <= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            return;
        }
        this.f130757i.put(zzhyVar, Long.valueOf(jElapsedRealtime));
        m153547d(lyv0Var.m156392a(), zzhyVar, m153549g());
    }

    @WorkerThread
    /* JADX INFO: renamed from: g */
    public final String m153549g() {
        return this.f130753e.mo15431p() ? (String) this.f130753e.mo15427l() : LibraryVersion.getInstance().getVersion(this.f130755g);
    }
}
