package p149l;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class yni {

    /* JADX INFO: renamed from: a */
    public static boolean f199160a = false;

    /* JADX INFO: renamed from: b */
    public static long f199161b = 0;

    /* JADX INFO: renamed from: c */
    public static boolean f199162c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f199163d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f199164e = true;

    /* JADX INFO: renamed from: f */
    public static long f199165f = 0;

    /* JADX INFO: renamed from: g */
    public static long f199166g = 0;

    /* JADX INFO: renamed from: h */
    public static long f199167h = 0;

    /* JADX INFO: renamed from: i */
    public static long f199168i = 0;

    /* JADX INFO: renamed from: j */
    public static long f199169j = 0;

    /* JADX INFO: renamed from: k */
    public static long f199170k = 0;

    /* JADX INFO: renamed from: l */
    public static boolean f199171l = false;

    /* JADX INFO: renamed from: m */
    public static boolean f199172m;

    /* JADX INFO: renamed from: n */
    public static AtomicInteger f199173n = new AtomicInteger(0);

    /* JADX INFO: renamed from: o */
    public static boolean f199174o = false;

    /* JADX INFO: renamed from: p */
    public static boolean f199175p = false;

    /* JADX INFO: renamed from: q */
    public static LinkedHashMap<LaunchStep, jwf0> f199176q = new LinkedHashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m215412a(boolean z) {
        if (f199162c) {
            return;
        }
        if (f199164e) {
            f199163d = z;
        } else {
            f199163d = false;
        }
        f199164e = false;
    }

    /* JADX INFO: renamed from: b */
    public static void m215413b() {
        jwf0 jwf0Var = f199176q.get(LaunchStep.AdConsum);
        if (jwf0Var == null) {
            return;
        }
        long j = jwf0Var.f120083d - jwf0Var.f120082c;
        LinkedHashMap<LaunchStep, jwf0> linkedHashMap = f199176q;
        LaunchStep launchStep = LaunchStep.PutongArriveImgload;
        jwf0 jwf0Var2 = linkedHashMap.get(launchStep);
        LinkedHashMap<LaunchStep, jwf0> linkedHashMap2 = f199176q;
        LaunchStep launchStep2 = LaunchStep.AppStartArriveImgload;
        jwf0 jwf0Var3 = linkedHashMap2.get(launchStep2);
        if (jwf0Var2 == null || jwf0Var3 == null) {
            return;
        }
        jwf0Var2.f120083d -= j;
        jwf0Var3.f120083d -= j;
        f199176q.put(launchStep, jwf0Var2);
        f199176q.put(launchStep2, jwf0Var3);
    }

    /* JADX INFO: renamed from: c */
    public static jwf0 m215414c(LaunchStep launchStep) {
        jwf0 jwf0Var;
        jwf0 jwf0Var2 = f199176q.get(launchStep);
        if (jwf0Var2 != null) {
            return jwf0Var2;
        }
        synchronized (yni.class) {
            try {
                jwf0Var = f199176q.get(launchStep);
                if (jwf0Var == null) {
                    jwf0Var = new jwf0(f199173n.getAndIncrement());
                    jwf0Var.f120084e = SystemClock.elapsedRealtime() - TantanApp.f17190m;
                    f199176q.put(launchStep, jwf0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jwf0Var;
    }

    /* JADX INFO: renamed from: d */
    public static void m215415d(LaunchStep launchStep) {
        jwf0 jwf0VarM215414c = m215414c(launchStep);
        if (NullChecker.m81303a(jwf0VarM215414c)) {
            jwf0VarM215414c.m143657a(SystemClock.elapsedRealtime(), f199173n.get());
            jwf0VarM215414c.f120085f = SystemClock.elapsedRealtime() - TantanApp.f17190m;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m215416e(LaunchStep launchStep, LaunchStep launchStep2) {
        m215415d(launchStep);
        m215418g(launchStep2);
    }

    /* JADX INFO: renamed from: f */
    public static void m215417f(LaunchStep... launchStepArr) {
        if (launchStepArr != null) {
            for (LaunchStep launchStep : launchStepArr) {
                m215418g(launchStep);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m215418g(LaunchStep launchStep) {
        jwf0 jwf0VarM215414c = m215414c(launchStep);
        if (NullChecker.m81303a(jwf0VarM215414c)) {
            jwf0VarM215414c.m143658b(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m215419h() {
        f199167h = SystemClock.elapsedRealtime() - f199166g;
    }

    /* JADX INFO: renamed from: i */
    public static void m215420i() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        f199166g = jElapsedRealtime;
        f199165f = jElapsedRealtime - TantanApp.f17183f;
    }

    /* JADX INFO: renamed from: j */
    public static void m215421j() {
        f199168i = SystemClock.elapsedRealtime() - f199161b;
    }

    /* JADX INFO: renamed from: k */
    public static void m215422k() {
        f199161b = SystemClock.elapsedRealtime();
        f199160a = true;
    }

    /* JADX INFO: renamed from: l */
    public static void m215423l(boolean z) {
        f199164e = z;
    }

    /* JADX INFO: renamed from: m */
    public static void m215424m(long j, List<j760<String, Object>> list) {
        Set<Map.Entry> hashSet;
        LinkedHashMap<LaunchStep, jwf0> linkedHashMap = f199176q;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return;
        }
        try {
            synchronized (yni.class) {
                hashSet = new LinkedHashSet(f199176q.entrySet());
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            hashSet = new HashSet();
        }
        for (Map.Entry entry : hashSet) {
            jwf0 jwf0Var = (jwf0) entry.getValue();
            if (jwf0Var != null) {
                list.add(new j760<>(((LaunchStep) entry.getKey()).getStepName(), Long.valueOf(jwf0Var.f120083d - jwf0Var.f120082c)));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m215425n(@NonNull TabName tabName) {
        long jElapsedRealtime;
        try {
            if (!f199162c && f199163d && f199160a && SplashProxyAct.f54725i >= TantanApp.f17185h && SplashProxyAct.f54725i - TantanApp.f17185h < 3000) {
                if (!f199171l) {
                    jElapsedRealtime = f199167h + (SystemClock.elapsedRealtime() - f199161b);
                } else if (f199169j <= 0 || f199170k != 0) {
                    jElapsedRealtime = (f199167h + (SystemClock.elapsedRealtime() - f199161b)) - (f199170k - f199169j);
                }
                long j = f199165f;
                long j2 = jElapsedRealtime + (j < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT ? j : 0L);
                f199162c = true;
                l3f l3fVar = new l3f();
                l3fVar.f125900s = "e_OpenAppDuration";
                l3fVar.f125885d = EventNameEnum.SYS_CHECK;
                l3fVar.f125895n = "p_suggest_users_home_view";
                m215415d(LaunchStep.NewMainCreate);
                if (f199171l) {
                    m215415d(LaunchStep.PutongArriveImgload);
                    m215415d(LaunchStep.AppStartArriveImgload);
                } else {
                    m215415d(LaunchStep.PutongArriveImgloadNoAd);
                    m215415d(LaunchStep.AppStartArriveImgloadNoAd);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new j760(BLiveOperationTitleShowType.duration, Long.valueOf(j2)));
                arrayList.add(new j760("app_dur", Long.valueOf(f199167h)));
                arrayList.add(new j760("splash_dur", Long.valueOf(f199168i)));
                arrayList.add(new j760("tab_type", tabName.toString()));
                arrayList.add(new j760("show_ad", Boolean.valueOf(f199171l)));
                arrayList.add(new j760("tantan_app_dur", Long.valueOf(f199165f)));
                arrayList.add(new j760("is_home_imag_pre", Boolean.valueOf(f199174o)));
                arrayList.add(new j760("oms_lable_ready", Boolean.valueOf(f199175p)));
                if (f199171l) {
                    m215413b();
                }
                m215424m(j2, arrayList);
                zvf0.m220393o(l3fVar, (j760[]) arrayList.toArray(new j760[arrayList.size()]));
            }
        } finally {
            qib0.m174831s0();
            f199172m = true;
        }
    }
}
