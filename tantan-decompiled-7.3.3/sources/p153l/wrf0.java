package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.SwipeExcites;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class wrf0 {

    /* JADX INFO: renamed from: a */
    public static SwipeExcites f190510a;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static boolean m207583a(int i) {
        int i2;
        SwipeExcites swipeExcites = f190510a;
        if (swipeExcites == null || (i2 = i - swipeExcites.swipeConfig.timestamp) < 0) {
            return false;
        }
        int i3 = i2 / MMKV.ExpireInDay;
        if (TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "male")) {
            if (f190510a.swipeConfig.maleRule.slideCardsAndRewards.size() - 1 >= i3) {
                return true;
            }
        } else if (TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "female") && f190510a.swipeConfig.maleRule.slideCardsAndRewards.size() - 1 >= i3) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static long m207584b() {
        return m207593k(2).longValue();
    }

    /* JADX INFO: renamed from: c */
    public static int m207585c() {
        if (m207591i()) {
            return m207586d(m207587e()).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static Integer m207586d(int i) {
        if (i >= 0 && NullChecker.m82486a(f190510a) && NullChecker.m82486a(f190510a.swipeConfig) && NullChecker.m82486a(f190510a.swipeConfig.femaleRule) && NullChecker.m82486a(f190510a.swipeConfig.femaleRule.rewardsCardsNumber) && f190510a.swipeConfig.femaleRule.rewardsCardsNumber.size() > i) {
            return f190510a.swipeConfig.femaleRule.rewardsCardsNumber.get(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m207587e() {
        SwipeExcites swipeExcites = f190510a;
        if (swipeExcites != null && swipeExcites.swipeConfig != null) {
            int iM174453n = ((int) (pzi0.m174453n() / 1000)) - f190510a.swipeConfig.timestamp;
            if (iM174453n < 0) {
                return -1;
            }
            int i = iM174453n / MMKV.ExpireInDay;
            int size = (TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "male") || TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "female")) ? f190510a.swipeConfig.maleRule.slideCardsAndRewards.size() : 0;
            if (size - 1 >= i) {
                return i;
            }
        }
        return -2;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m207588f() {
        if (!NullChecker.m82486a(pk50.m172568j().m172579l()) || pk50.m172568j().m172579l().isEmpty()) {
            f190510a = null;
        } else {
            SwipeExcites swipeExcites = pk50.m172568j().m172579l().get(0);
            f190510a = swipeExcites;
            if (NullChecker.m82486a(swipeExcites) && f190510a.taskSwitch) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m207589g() {
        if (f190510a == null) {
            m207588f();
        }
        if (!NullChecker.m82486a(f190510a)) {
            return false;
        }
        SwipeExcites swipeExcites = f190510a;
        return swipeExcites.taskSwitch && swipeExcites.swipeConfig.swipeStimulationOn;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m207590h() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9()) && TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "female")) {
            if (m207584b() < m207585c()) {
                return true;
            }
            CoreModule.f18264c.f20405m0.f20120U1 = false;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m207591i() {
        return m207583a((int) (pzi0.m174453n() / 1000));
    }

    /* JADX INFO: renamed from: j */
    public static void m207592j() {
        f190510a = null;
    }

    /* JADX INFO: renamed from: k */
    public static Long m207593k(int i) {
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(jM174454o);
        String str = pzi0.f154857d.format(date);
        if (str.equals(CoreModule.f18264c.f20405m0.f20140b1.get())) {
            if (1 == i) {
                byd0 byd0Var = CoreModule.f18264c.f20405m0.f20146d1;
                byd0Var.put(Long.valueOf(byd0Var.get().longValue() + 1));
            }
            return CoreModule.f18264c.f20405m0.f20146d1.get();
        }
        CoreModule.f18264c.f20405m0.f20140b1.put(str);
        CoreModule.f18264c.f20405m0.f20146d1.put(0L);
        if (1 == i) {
            byd0 byd0Var2 = CoreModule.f18264c.f20405m0.f20146d1;
            byd0Var2.put(Long.valueOf(byd0Var2.get().longValue() + 1));
        }
        return CoreModule.f18264c.f20405m0.f20146d1.get();
    }
}
