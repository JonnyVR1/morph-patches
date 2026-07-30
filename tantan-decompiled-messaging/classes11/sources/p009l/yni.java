package p009l;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.p004ui.splash.SplashProxyAct;
import com.p000p1.mobile.putong.util.launch.LaunchStep;
import com.p1.mobile.putong.app.TantanApp;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import l.j760;
import l.l3f;
import l.qib0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yni {

    /* JADX INFO: renamed from: a */
    public static boolean f23157a = false;

    /* JADX INFO: renamed from: b */
    public static long f23158b = 0;

    /* JADX INFO: renamed from: c */
    public static boolean f23159c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f23160d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f23161e = true;

    /* JADX INFO: renamed from: f */
    public static long f23162f = 0;

    /* JADX INFO: renamed from: g */
    public static long f23163g = 0;

    /* JADX INFO: renamed from: h */
    public static long f23164h = 0;

    /* JADX INFO: renamed from: i */
    public static long f23165i = 0;

    /* JADX INFO: renamed from: j */
    public static long f23166j = 0;

    /* JADX INFO: renamed from: k */
    public static long f23167k = 0;

    /* JADX INFO: renamed from: l */
    public static boolean f23168l = false;

    /* JADX INFO: renamed from: m */
    public static boolean f23169m;

    /* JADX INFO: renamed from: n */
    public static AtomicInteger f23170n = new AtomicInteger(0);

    /* JADX INFO: renamed from: o */
    public static boolean f23171o = false;

    /* JADX INFO: renamed from: p */
    public static boolean f23172p = false;

    /* JADX INFO: renamed from: q */
    public static LinkedHashMap<LaunchStep, jwf0> f23173q = new LinkedHashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m25469a(boolean z) {
        if (f23159c) {
            return;
        }
        if (f23161e) {
            f23160d = z;
        } else {
            f23160d = false;
        }
        f23161e = false;
    }

    /* JADX INFO: renamed from: b */
    public static void m25470b() {
        jwf0 jwf0Var = f23173q.get(LaunchStep.AdConsum);
        if (jwf0Var == null) {
            return;
        }
        long j = jwf0Var.f15346d - jwf0Var.f15345c;
        LinkedHashMap<LaunchStep, jwf0> linkedHashMap = f23173q;
        LaunchStep launchStep = LaunchStep.PutongArriveImgload;
        jwf0 jwf0Var2 = linkedHashMap.get(launchStep);
        LinkedHashMap<LaunchStep, jwf0> linkedHashMap2 = f23173q;
        LaunchStep launchStep2 = LaunchStep.AppStartArriveImgload;
        jwf0 jwf0Var3 = linkedHashMap2.get(launchStep2);
        if (jwf0Var2 == null || jwf0Var3 == null) {
            return;
        }
        jwf0Var2.f15346d -= j;
        jwf0Var3.f15346d -= j;
        f23173q.put(launchStep, jwf0Var2);
        f23173q.put(launchStep2, jwf0Var3);
    }

    /* JADX INFO: renamed from: c */
    public static jwf0 m25471c(LaunchStep launchStep) {
        jwf0 jwf0Var;
        jwf0 jwf0Var2 = f23173q.get(launchStep);
        if (jwf0Var2 != null) {
            return jwf0Var2;
        }
        synchronized (yni.class) {
            try {
                jwf0Var = f23173q.get(launchStep);
                if (jwf0Var == null) {
                    jwf0Var = new jwf0(f23170n.getAndIncrement());
                    jwf0Var.f15347e = SystemClock.elapsedRealtime() - TantanApp.m;
                    f23173q.put(launchStep, jwf0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jwf0Var;
    }

    /* JADX INFO: renamed from: d */
    public static void m25472d(LaunchStep launchStep) {
        jwf0 jwf0VarM25471c = m25471c(launchStep);
        if (NullChecker.a(jwf0VarM25471c)) {
            jwf0VarM25471c.m17229a(SystemClock.elapsedRealtime(), f23170n.get());
            jwf0VarM25471c.f15348f = SystemClock.elapsedRealtime() - TantanApp.m;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m25473e(LaunchStep launchStep, LaunchStep launchStep2) {
        m25472d(launchStep);
        m25475g(launchStep2);
    }

    /* JADX INFO: renamed from: f */
    public static void m25474f(LaunchStep... launchStepArr) {
        if (launchStepArr != null) {
            for (LaunchStep launchStep : launchStepArr) {
                m25475g(launchStep);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m25475g(LaunchStep launchStep) {
        jwf0 jwf0VarM25471c = m25471c(launchStep);
        if (NullChecker.a(jwf0VarM25471c)) {
            jwf0VarM25471c.m17230b(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m25476h() {
        f23164h = SystemClock.elapsedRealtime() - f23163g;
    }

    /* JADX INFO: renamed from: i */
    public static void m25477i() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        f23163g = jElapsedRealtime;
        f23162f = jElapsedRealtime - TantanApp.f;
    }

    /* JADX INFO: renamed from: j */
    public static void m25478j() {
        f23165i = SystemClock.elapsedRealtime() - f23158b;
    }

    /* JADX INFO: renamed from: k */
    public static void m25479k() {
        f23158b = SystemClock.elapsedRealtime();
        f23157a = true;
    }

    /* JADX INFO: renamed from: l */
    public static void m25480l(boolean z) {
        f23161e = z;
    }

    /* JADX INFO: renamed from: m */
    public static void m25481m(long j, List<j760<String, Object>> list) {
        Set<Map.Entry> hashSet;
        LinkedHashMap<LaunchStep, jwf0> linkedHashMap = f23173q;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return;
        }
        try {
            synchronized (yni.class) {
                hashSet = new LinkedHashSet(f23173q.entrySet());
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            hashSet = new HashSet();
        }
        for (Map.Entry entry : hashSet) {
            jwf0 jwf0Var = (jwf0) entry.getValue();
            if (jwf0Var != null) {
                list.add(new j760<>(((LaunchStep) entry.getKey()).getStepName(), Long.valueOf(jwf0Var.f15346d - jwf0Var.f15345c)));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m25482n(@NonNull TabName tabName) {
        long jElapsedRealtime;
        try {
            if (!f23159c && f23160d && f23157a && SplashProxyAct.f8331i >= TantanApp.h && SplashProxyAct.f8331i - TantanApp.h < 3000) {
                if (!f23168l) {
                    jElapsedRealtime = f23164h + (SystemClock.elapsedRealtime() - f23158b);
                } else if (f23166j <= 0 || f23167k != 0) {
                    jElapsedRealtime = (f23164h + (SystemClock.elapsedRealtime() - f23158b)) - (f23167k - f23166j);
                }
                long j = f23162f;
                long j2 = jElapsedRealtime + (j < 30000 ? j : 0L);
                f23159c = true;
                l3f l3fVar = new l3f();
                l3fVar.s = "e_OpenAppDuration";
                l3fVar.d = EventNameEnum.SYS_CHECK;
                l3fVar.n = "p_suggest_users_home_view";
                m25472d(LaunchStep.NewMainCreate);
                if (f23168l) {
                    m25472d(LaunchStep.PutongArriveImgload);
                    m25472d(LaunchStep.AppStartArriveImgload);
                } else {
                    m25472d(LaunchStep.PutongArriveImgloadNoAd);
                    m25472d(LaunchStep.AppStartArriveImgloadNoAd);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new j760("duration", Long.valueOf(j2)));
                arrayList.add(new j760("app_dur", Long.valueOf(f23164h)));
                arrayList.add(new j760("splash_dur", Long.valueOf(f23165i)));
                arrayList.add(new j760("tab_type", tabName.toString()));
                arrayList.add(new j760("show_ad", Boolean.valueOf(f23168l)));
                arrayList.add(new j760("tantan_app_dur", Long.valueOf(f23162f)));
                arrayList.add(new j760("is_home_imag_pre", Boolean.valueOf(f23171o)));
                arrayList.add(new j760("oms_lable_ready", Boolean.valueOf(f23172p)));
                if (f23168l) {
                    m25470b();
                }
                m25481m(j2, arrayList);
                zvf0.o(l3fVar, (j760[]) arrayList.toArray(new j760[arrayList.size()]));
            }
        } finally {
            qib0.s0();
            f23169m = true;
        }
    }
}
