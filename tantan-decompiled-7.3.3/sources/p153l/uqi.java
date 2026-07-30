package p153l;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
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

/* JADX INFO: loaded from: classes10.dex */
public class uqi {

    /* JADX INFO: renamed from: a */
    public static boolean f180458a = false;

    /* JADX INFO: renamed from: b */
    public static long f180459b = 0;

    /* JADX INFO: renamed from: c */
    public static boolean f180460c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f180461d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f180462e = true;

    /* JADX INFO: renamed from: f */
    public static long f180463f = 0;

    /* JADX INFO: renamed from: g */
    public static long f180464g = 0;

    /* JADX INFO: renamed from: h */
    public static long f180465h = 0;

    /* JADX INFO: renamed from: i */
    public static long f180466i = 0;

    /* JADX INFO: renamed from: j */
    public static long f180467j = 0;

    /* JADX INFO: renamed from: k */
    public static long f180468k = 0;

    /* JADX INFO: renamed from: l */
    public static boolean f180469l = false;

    /* JADX INFO: renamed from: m */
    public static boolean f180470m;

    /* JADX INFO: renamed from: n */
    public static AtomicInteger f180471n = new AtomicInteger(0);

    /* JADX INFO: renamed from: o */
    public static boolean f180472o = false;

    /* JADX INFO: renamed from: p */
    public static boolean f180473p = false;

    /* JADX INFO: renamed from: q */
    public static LinkedHashMap<LaunchStep, t4g0> f180474q = new LinkedHashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m197334a(boolean z) {
        if (f180460c) {
            return;
        }
        if (f180462e) {
            f180461d = z;
        } else {
            f180461d = false;
        }
        f180462e = false;
    }

    /* JADX INFO: renamed from: b */
    public static void m197335b() {
        t4g0 t4g0Var = f180474q.get(LaunchStep.AdConsum);
        if (t4g0Var == null) {
            return;
        }
        long j = t4g0Var.f172071d - t4g0Var.f172070c;
        LinkedHashMap<LaunchStep, t4g0> linkedHashMap = f180474q;
        LaunchStep launchStep = LaunchStep.PutongArriveImgload;
        t4g0 t4g0Var2 = linkedHashMap.get(launchStep);
        LinkedHashMap<LaunchStep, t4g0> linkedHashMap2 = f180474q;
        LaunchStep launchStep2 = LaunchStep.AppStartArriveImgload;
        t4g0 t4g0Var3 = linkedHashMap2.get(launchStep2);
        if (t4g0Var2 == null || t4g0Var3 == null) {
            return;
        }
        t4g0Var2.f172071d -= j;
        t4g0Var3.f172071d -= j;
        f180474q.put(launchStep, t4g0Var2);
        f180474q.put(launchStep2, t4g0Var3);
    }

    /* JADX INFO: renamed from: c */
    public static t4g0 m197336c(LaunchStep launchStep) {
        t4g0 t4g0Var;
        t4g0 t4g0Var2 = f180474q.get(launchStep);
        if (t4g0Var2 != null) {
            return t4g0Var2;
        }
        synchronized (uqi.class) {
            try {
                t4g0Var = f180474q.get(launchStep);
                if (t4g0Var == null) {
                    t4g0Var = new t4g0(f180471n.getAndIncrement());
                    t4g0Var.f172072e = SystemClock.elapsedRealtime() - TantanApp.f17909m;
                    f180474q.put(launchStep, t4g0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t4g0Var;
    }

    /* JADX INFO: renamed from: d */
    public static void m197337d(LaunchStep launchStep) {
        t4g0 t4g0VarM197336c = m197336c(launchStep);
        if (NullChecker.m82486a(t4g0VarM197336c)) {
            t4g0VarM197336c.m189268a(SystemClock.elapsedRealtime(), f180471n.get());
            t4g0VarM197336c.f172073f = SystemClock.elapsedRealtime() - TantanApp.f17909m;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m197338e(LaunchStep launchStep, LaunchStep launchStep2) {
        m197337d(launchStep);
        m197340g(launchStep2);
    }

    /* JADX INFO: renamed from: f */
    public static void m197339f(LaunchStep... launchStepArr) {
        if (launchStepArr != null) {
            for (LaunchStep launchStep : launchStepArr) {
                m197340g(launchStep);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m197340g(LaunchStep launchStep) {
        t4g0 t4g0VarM197336c = m197336c(launchStep);
        if (NullChecker.m82486a(t4g0VarM197336c)) {
            t4g0VarM197336c.m189269b(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m197341h() {
        f180465h = SystemClock.elapsedRealtime() - f180464g;
    }

    /* JADX INFO: renamed from: i */
    public static void m197342i() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        f180464g = jElapsedRealtime;
        f180463f = jElapsedRealtime - TantanApp.f17902f;
    }

    /* JADX INFO: renamed from: j */
    public static void m197343j() {
        f180466i = SystemClock.elapsedRealtime() - f180459b;
    }

    /* JADX INFO: renamed from: k */
    public static void m197344k() {
        f180459b = SystemClock.elapsedRealtime();
        f180458a = true;
    }

    /* JADX INFO: renamed from: l */
    public static void m197345l(boolean z) {
        f180462e = z;
    }

    /* JADX INFO: renamed from: m */
    public static void m197346m(long j, List<pf60<String, Object>> list) {
        Set<Map.Entry> hashSet;
        LinkedHashMap<LaunchStep, t4g0> linkedHashMap = f180474q;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return;
        }
        try {
            synchronized (uqi.class) {
                hashSet = new LinkedHashSet(f180474q.entrySet());
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            hashSet = new HashSet();
        }
        for (Map.Entry entry : hashSet) {
            t4g0 t4g0Var = (t4g0) entry.getValue();
            if (t4g0Var != null) {
                list.add(new pf60<>(((LaunchStep) entry.getKey()).getStepName(), Long.valueOf(t4g0Var.f172071d - t4g0Var.f172070c)));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m197347n(@NonNull TabName tabName) {
        long jElapsedRealtime;
        try {
            if (!f180460c && f180461d && f180458a && SplashProxyAct.f55573i >= TantanApp.f17904h && SplashProxyAct.f55573i - TantanApp.f17904h < 3000) {
                if (!f180469l) {
                    jElapsedRealtime = f180465h + (SystemClock.elapsedRealtime() - f180459b);
                } else if (f180467j <= 0 || f180468k != 0) {
                    jElapsedRealtime = (f180465h + (SystemClock.elapsedRealtime() - f180459b)) - (f180468k - f180467j);
                }
                long j = f180463f;
                long j2 = jElapsedRealtime + (j < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT ? j : 0L);
                f180460c = true;
                q4f q4fVar = new q4f();
                q4fVar.f155581s = "e_OpenAppDuration";
                q4fVar.f155566d = EventNameEnum.SYS_CHECK;
                q4fVar.f155576n = "p_suggest_users_home_view";
                m197337d(LaunchStep.NewMainCreate);
                if (f180469l) {
                    m197337d(LaunchStep.PutongArriveImgload);
                    m197337d(LaunchStep.AppStartArriveImgload);
                } else {
                    m197337d(LaunchStep.PutongArriveImgloadNoAd);
                    m197337d(LaunchStep.AppStartArriveImgloadNoAd);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new pf60(BLiveOperationTitleShowType.duration, Long.valueOf(j2)));
                arrayList.add(new pf60("app_dur", Long.valueOf(f180465h)));
                arrayList.add(new pf60("splash_dur", Long.valueOf(f180466i)));
                arrayList.add(new pf60("tab_type", tabName.toString()));
                arrayList.add(new pf60("show_ad", Boolean.valueOf(f180469l)));
                arrayList.add(new pf60("tantan_app_dur", Long.valueOf(f180463f)));
                arrayList.add(new pf60("is_home_imag_pre", Boolean.valueOf(f180472o)));
                arrayList.add(new pf60("oms_lable_ready", Boolean.valueOf(f180473p)));
                if (f180469l) {
                    m197335b();
                }
                m197346m(j2, arrayList);
                i4g0.m138517o(q4fVar, (pf60[]) arrayList.toArray(new pf60[arrayList.size()]));
            }
        } finally {
            uqb0.m197285s0();
            f180470m = true;
        }
    }
}
