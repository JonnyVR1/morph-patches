package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.SwipeExcites;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class njf0 {

    /* JADX INFO: renamed from: a */
    public static SwipeExcites f139234a;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static boolean m159650a(int i) {
        int i2;
        SwipeExcites swipeExcites = f139234a;
        if (swipeExcites == null || (i2 = i - swipeExcites.swipeConfig.timestamp) < 0) {
            return false;
        }
        int i3 = i2 / MMKV.ExpireInDay;
        if (TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "male")) {
            if (f139234a.swipeConfig.maleRule.slideCardsAndRewards.size() - 1 >= i3) {
                return true;
            }
        } else if (TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "female") && f139234a.swipeConfig.maleRule.slideCardsAndRewards.size() - 1 >= i3) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static long m159651b() {
        return m159660k(2).longValue();
    }

    /* JADX INFO: renamed from: c */
    public static int m159652c() {
        if (m159658i()) {
            return m159653d(m159654e()).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static Integer m159653d(int i) {
        if (i >= 0 && NullChecker.m81303a(f139234a) && NullChecker.m81303a(f139234a.swipeConfig) && NullChecker.m81303a(f139234a.swipeConfig.femaleRule) && NullChecker.m81303a(f139234a.swipeConfig.femaleRule.rewardsCardsNumber) && f139234a.swipeConfig.femaleRule.rewardsCardsNumber.size() > i) {
            return f139234a.swipeConfig.femaleRule.rewardsCardsNumber.get(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m159654e() {
        SwipeExcites swipeExcites = f139234a;
        if (swipeExcites != null && swipeExcites.swipeConfig != null) {
            int iM155943n = ((int) (mqi0.m155943n() / 1000)) - f139234a.swipeConfig.timestamp;
            if (iM155943n < 0) {
                return -1;
            }
            int i = iM155943n / MMKV.ExpireInDay;
            int size = (TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "male") || TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "female")) ? f139234a.swipeConfig.maleRule.slideCardsAndRewards.size() : 0;
            if (size - 1 >= i) {
                return i;
            }
        }
        return -2;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m159655f() {
        if (!NullChecker.m81303a(ic50.m135327j().m135338l()) || ic50.m135327j().m135338l().isEmpty()) {
            f139234a = null;
        } else {
            SwipeExcites swipeExcites = ic50.m135327j().m135338l().get(0);
            f139234a = swipeExcites;
            if (NullChecker.m81303a(swipeExcites) && f139234a.taskSwitch) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m159656g() {
        if (f139234a == null) {
            m159655f();
        }
        if (!NullChecker.m81303a(f139234a)) {
            return false;
        }
        SwipeExcites swipeExcites = f139234a;
        return swipeExcites.taskSwitch && swipeExcites.swipeConfig.swipeStimulationOn;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m159657h() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9()) && TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "female")) {
            if (m159651b() < m159652c()) {
                return true;
            }
            CoreModule.f17545c.f19663m0.f19378U1 = false;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m159658i() {
        return m159650a((int) (mqi0.m155943n() / 1000));
    }

    /* JADX INFO: renamed from: j */
    public static void m159659j() {
        f139234a = null;
    }

    /* JADX INFO: renamed from: k */
    public static Long m159660k(int i) {
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        date.setTime(jM155944o);
        String str = mqi0.f135252d.format(date);
        if (str.equals(CoreModule.f17545c.f19663m0.f19398b1.get())) {
            if (1 == i) {
                zpd0 zpd0Var = CoreModule.f17545c.f19663m0.f19404d1;
                zpd0Var.put(Long.valueOf(zpd0Var.get().longValue() + 1));
            }
            return CoreModule.f17545c.f19663m0.f19404d1.get();
        }
        CoreModule.f17545c.f19663m0.f19398b1.put(str);
        CoreModule.f17545c.f19663m0.f19404d1.put(0L);
        if (1 == i) {
            zpd0 zpd0Var2 = CoreModule.f17545c.f19663m0.f19404d1;
            zpd0Var2.put(Long.valueOf(zpd0Var2.get().longValue() + 1));
        }
        return CoreModule.f17545c.f19663m0.f19404d1.get();
    }
}
