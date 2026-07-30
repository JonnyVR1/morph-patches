package p007l;

import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.OccasionComponent;
import com.p000p1.mobile.putong.feed.data.OccasionType;
import com.p000p1.mobile.putong.feed.data.PostBasePopWindow;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.mqi0;
import l.tpd0;
import l.vwb;
import l.w9j;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vrh {

    /* JADX INFO: renamed from: a */
    public static String f14286a = "";

    /* JADX INFO: renamed from: b */
    public static List<String> f14287b = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m15557b(int i, PostBasePopWindow postBasePopWindow) {
        OccasionComponent occasionComponent = postBasePopWindow.occasion;
        return Boolean.valueOf(occasionComponent.readCount <= i && TEnum.equals(occasionComponent.type, OccasionType.readFrequency));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15558c(zpd0 zpd0Var, tpd0 tpd0Var, int i, int i2, int i3) {
        int iIntValue = ((Integer) tpd0Var.get()).intValue();
        long jLongValue = ((Long) zpd0Var.get()).longValue();
        if (jLongValue == 0) {
            return true;
        }
        if (i > 0 && mqi0.o() - jLongValue > i * 86400000) {
            return true;
        }
        if (i2 <= 0 || mqi0.o() - jLongValue <= 86400000 * i2 || iIntValue >= i3) {
            return i2 == 0 && iIntValue < i3;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static PostBasePopWindow m15559d(String str) {
        List<PostBasePopWindow> listM16761x7 = FeedModule.f316d.m16761x7(str);
        PostBasePopWindow postBasePopWindow = null;
        if (vwb.J(listM16761x7)) {
            return null;
        }
        ArrayList arrayListN = vwb.n(listM16761x7, new w9j() { // from class: l.trh
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((PostBasePopWindow) obj).occasion.type, OccasionType.immediatelyShowFrequency));
            }
        });
        if (vwb.J(arrayListN)) {
            return null;
        }
        for (int i = 0; i < arrayListN.size(); i++) {
            PostBasePopWindow postBasePopWindow2 = (PostBasePopWindow) arrayListN.get(i);
            zpd0 zpd0Var = new zpd0("immediately_show_dialog_time_" + postBasePopWindow2.basic.name + FeedModule.m1139F().userId(), 0L);
            tpd0 tpd0Var = new tpd0("immediately_show_dialog_count_" + postBasePopWindow2.basic.name + FeedModule.m1139F().userId(), 0);
            OccasionComponent occasionComponent = postBasePopWindow2.occasion;
            if (m15558c(zpd0Var, tpd0Var, occasionComponent.days, occasionComponent.intervalDays, occasionComponent.showTimes) && (!NullChecker.a(postBasePopWindow) || postBasePopWindow.basic.priority < postBasePopWindow2.basic.priority)) {
                postBasePopWindow = postBasePopWindow2;
            }
        }
        return postBasePopWindow;
    }

    /* JADX INFO: renamed from: e */
    public static PostBasePopWindow m15560e(String str, final int i) {
        List<PostBasePopWindow> listM16761x7 = FeedModule.f316d.m16761x7(str);
        PostBasePopWindow postBasePopWindow = null;
        if (vwb.J(listM16761x7)) {
            return null;
        }
        ArrayList arrayListN = vwb.n(listM16761x7, new w9j() { // from class: l.urh
            public final Object call(Object obj) {
                return vrh.m15557b(i, (PostBasePopWindow) obj);
            }
        });
        if (vwb.J(arrayListN)) {
            return null;
        }
        for (int i2 = 0; i2 < arrayListN.size(); i2++) {
            PostBasePopWindow postBasePopWindow2 = (PostBasePopWindow) arrayListN.get(i2);
            zpd0 zpd0Var = new zpd0("read_count_show_dialog_time_" + postBasePopWindow2.basic.name + FeedModule.m1139F().userId(), 0L);
            tpd0 tpd0Var = new tpd0("read_count_show_dialog_count_" + postBasePopWindow2.basic.name + FeedModule.m1139F().userId(), 0);
            OccasionComponent occasionComponent = postBasePopWindow2.occasion;
            if (m15558c(zpd0Var, tpd0Var, occasionComponent.days, occasionComponent.intervalDays, occasionComponent.showTimes) && (!NullChecker.a(postBasePopWindow) || postBasePopWindow.basic.priority < postBasePopWindow2.basic.priority)) {
                postBasePopWindow = postBasePopWindow2;
            }
        }
        return postBasePopWindow;
    }

    /* JADX INFO: renamed from: f */
    public static void m15561f(String str) {
        f14286a = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m15562g(zpd0 zpd0Var, tpd0 tpd0Var, int i, int i2, int i3) {
        int iIntValue = ((Integer) tpd0Var.get()).intValue();
        long jLongValue = ((Long) zpd0Var.get()).longValue();
        if (jLongValue == 0) {
            zpd0Var.put(Long.valueOf(mqi0.o()));
            tpd0Var.put(1);
            return;
        }
        if (i > 0 && mqi0.o() - jLongValue > i * 86400000) {
            zpd0Var.put(Long.valueOf(mqi0.o()));
            tpd0Var.put(1);
            return;
        }
        if (i2 > 0 && mqi0.o() - jLongValue > 86400000 * i2 && iIntValue < i3) {
            zpd0Var.put(Long.valueOf(mqi0.o()));
            tpd0Var.put(Integer.valueOf(iIntValue + 1));
        } else {
            if (i2 != 0 || iIntValue >= i3) {
                return;
            }
            zpd0Var.put(Long.valueOf(mqi0.o()));
            tpd0Var.put(Integer.valueOf(iIntValue + 1));
        }
    }
}
