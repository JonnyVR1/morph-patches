package p009l;

import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.SwipeExcites;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class njf0 {

    /* JADX INFO: renamed from: a */
    public static SwipeExcites f17502a;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static boolean m18898a(int i) {
        int i2;
        SwipeExcites swipeExcites = f17502a;
        if (swipeExcites == null || (i2 = i - swipeExcites.swipeConfig.timestamp) < 0) {
            return false;
        }
        int i3 = i2 / 86400;
        if (TEnum.equals(CoreModule.c.e0.p9().gender, "male")) {
            if (f17502a.swipeConfig.maleRule.slideCardsAndRewards.size() - 1 >= i3) {
                return true;
            }
        } else if (TEnum.equals(CoreModule.c.e0.p9().gender, "female") && f17502a.swipeConfig.maleRule.slideCardsAndRewards.size() - 1 >= i3) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static long m18899b() {
        return m18908k(2).longValue();
    }

    /* JADX INFO: renamed from: c */
    public static int m18900c() {
        if (m18906i()) {
            return m18901d(m18902e()).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static Integer m18901d(int i) {
        if (i >= 0 && NullChecker.a(f17502a) && NullChecker.a(f17502a.swipeConfig) && NullChecker.a(f17502a.swipeConfig.femaleRule) && NullChecker.a(f17502a.swipeConfig.femaleRule.rewardsCardsNumber) && f17502a.swipeConfig.femaleRule.rewardsCardsNumber.size() > i) {
            return (Integer) f17502a.swipeConfig.femaleRule.rewardsCardsNumber.get(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m18902e() {
        SwipeExcites swipeExcites = f17502a;
        if (swipeExcites != null && swipeExcites.swipeConfig != null) {
            int iM18549n = ((int) (mqi0.m18549n() / 1000)) - f17502a.swipeConfig.timestamp;
            if (iM18549n < 0) {
                return -1;
            }
            int i = iM18549n / 86400;
            int size = (TEnum.equals(CoreModule.c.e0.p9().gender, "male") || TEnum.equals(CoreModule.c.e0.p9().gender, "female")) ? f17502a.swipeConfig.maleRule.slideCardsAndRewards.size() : 0;
            if (size - 1 >= i) {
                return i;
            }
        }
        return -2;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m18903f() {
        if (!NullChecker.a(ic50.m16316j().m16327l()) || ic50.m16316j().m16327l().isEmpty()) {
            f17502a = null;
        } else {
            SwipeExcites swipeExcites = ic50.m16316j().m16327l().get(0);
            f17502a = swipeExcites;
            if (NullChecker.a(swipeExcites) && f17502a.taskSwitch) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18904g() {
        if (f17502a == null) {
            m18903f();
        }
        if (!NullChecker.a(f17502a)) {
            return false;
        }
        SwipeExcites swipeExcites = f17502a;
        return swipeExcites.taskSwitch && swipeExcites.swipeConfig.swipeStimulationOn;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m18905h() {
        if (NullChecker.a(CoreModule.c.e0.p9()) && TEnum.equals(CoreModule.c.e0.p9().gender, "female")) {
            if (m18899b() < m18900c()) {
                return true;
            }
            CoreModule.c.m0.U1 = false;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m18906i() {
        return m18898a((int) (mqi0.m18549n() / 1000));
    }

    /* JADX INFO: renamed from: j */
    public static void m18907j() {
        f17502a = null;
    }

    /* JADX INFO: renamed from: k */
    public static Long m18908k(int i) {
        long jM18550o = mqi0.m18550o();
        Date date = new Date();
        date.setTime(jM18550o);
        String str = mqi0.f17028d.format(date);
        if (str.equals((String) CoreModule.c.m0.b1.get())) {
            if (1 == i) {
                zpd0 zpd0Var = CoreModule.c.m0.d1;
                zpd0Var.put(Long.valueOf(((Long) zpd0Var.get()).longValue() + 1));
            }
            return (Long) CoreModule.c.m0.d1.get();
        }
        CoreModule.c.m0.b1.put(str);
        CoreModule.c.m0.d1.put(0L);
        if (1 == i) {
            zpd0 zpd0Var2 = CoreModule.c.m0.d1;
            zpd0Var2.put(Long.valueOf(((Long) zpd0Var2.get()).longValue() + 1));
        }
        return (Long) CoreModule.c.m0.d1.get();
    }
}
