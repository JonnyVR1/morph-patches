package p149l;

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
import com.google.mlkit.common.sdkinternal.C3363a;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class f1y0 {

    /* JADX INFO: renamed from: k */
    @Nullable
    public static zzu f94123k;

    /* JADX INFO: renamed from: l */
    public static final zzw f94124l = zzw.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a */
    public final String f94125a;

    /* JADX INFO: renamed from: b */
    public final String f94126b;

    /* JADX INFO: renamed from: c */
    public final c1y0 f94127c;

    /* JADX INFO: renamed from: d */
    public final awe0 f94128d;

    /* JADX INFO: renamed from: e */
    public final Task f94129e;

    /* JADX INFO: renamed from: f */
    public final Task f94130f;

    /* JADX INFO: renamed from: g */
    public final String f94131g;

    /* JADX INFO: renamed from: h */
    public final int f94132h;

    /* JADX INFO: renamed from: i */
    public final Map f94133i = new HashMap();

    /* JADX INFO: renamed from: j */
    public final Map f94134j = new HashMap();

    public f1y0(Context context, final awe0 awe0Var, c1y0 c1y0Var, String str) {
        this.f94125a = context.getPackageName();
        this.f94126b = pm5.m170295a(context);
        this.f94128d = awe0Var;
        this.f94127c = c1y0Var;
        j3y0.m139607a();
        this.f94131g = str;
        this.f94129e = C3363a.m16874a().m16877b(new Callable() { // from class: l.q0y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f152092a.m119149a();
            }
        });
        C3363a c3363aM16874a = C3363a.m16874a();
        awe0Var.getClass();
        this.f94130f = c3363aM16874a.m16877b(new Callable() { // from class: l.u0y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return awe0Var.m99265a();
            }
        });
        zzw zzwVar = f94124l;
        this.f94132h = zzwVar.containsKey(str) ? DynamiteModule.m12475c(context, (String) zzwVar.get(str)) : -1;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static synchronized zzu m119148f() {
        try {
            zzu zzuVar = f94123k;
            if (zzuVar != null) {
                return zzuVar;
            }
            evv evvVarM176692a = qv5.m176692a(Resources.getSystem().getConfiguration());
            njy0 njy0Var = new njy0();
            for (int i = 0; i < evvVarM176692a.m118325c(); i++) {
                njy0Var.m159815c(pm5.m170296b(evvVarM176692a.m118324b(i)));
            }
            zzu zzuVarM159816d = njy0Var.m159816d();
            f94123k = zzuVarM159816d;
            return zzuVarM159816d;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String m119149a() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f94131g);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m119150b(yzx0 yzx0Var, zzhy zzhyVar, String str) {
        yzx0Var.mo186933a(zzhyVar);
        String strZzd = yzx0Var.zzd();
        dvx0 dvx0Var = new dvx0();
        dvx0Var.m113844b(this.f94125a);
        dvx0Var.m113845c(this.f94126b);
        dvx0Var.m113850h(m119148f());
        dvx0Var.m113849g(Boolean.TRUE);
        dvx0Var.m113854l(strZzd);
        dvx0Var.m113852j(str);
        dvx0Var.m113851i(this.f94130f.mo15377p() ? (String) this.f94130f.mo15373l() : this.f94128d.m99265a());
        dvx0Var.m113846d(10);
        dvx0Var.m113853k(Integer.valueOf(this.f94132h));
        yzx0Var.mo186935c(dvx0Var);
        this.f94127c.mo104887a(yzx0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m119151c(yzx0 yzx0Var, zzhy zzhyVar) {
        m119152d(yzx0Var, zzhyVar, m119154g());
    }

    /* JADX INFO: renamed from: d */
    public final void m119152d(final yzx0 yzx0Var, final zzhy zzhyVar, final String str) {
        C3363a.m16875d().execute(new Runnable() { // from class: l.x0y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f189004a.m119150b(yzx0Var, zzhyVar, str);
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: e */
    public final void m119153e(fpv0 fpv0Var, zzhy zzhyVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f94133i.get(zzhyVar) != null && jElapsedRealtime - ((Long) this.f94133i.get(zzhyVar)).longValue() <= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            return;
        }
        this.f94133i.put(zzhyVar, Long.valueOf(jElapsedRealtime));
        m119152d(fpv0Var.m122675a(), zzhyVar, m119154g());
    }

    @WorkerThread
    /* JADX INFO: renamed from: g */
    public final String m119154g() {
        return this.f94129e.mo15377p() ? (String) this.f94129e.mo15373l() : LibraryVersion.getInstance().getVersion(this.f94131g);
    }
}
