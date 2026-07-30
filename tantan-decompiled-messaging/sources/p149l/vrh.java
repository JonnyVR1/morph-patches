package p149l;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.OccasionComponent;
import com.p046p1.mobile.putong.feed.data.OccasionType;
import com.p046p1.mobile.putong.feed.data.PostBasePopWindow;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class vrh {

    /* JADX INFO: renamed from: a */
    public static String f182723a = "";

    /* JADX INFO: renamed from: b */
    public static List<String> f182724b = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m199658b(int i, PostBasePopWindow postBasePopWindow) {
        OccasionComponent occasionComponent = postBasePopWindow.occasion;
        return Boolean.valueOf(occasionComponent.readCount <= i && TEnum.equals(occasionComponent.type, OccasionType.readFrequency));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m199659c(zpd0 zpd0Var, tpd0 tpd0Var, int i, int i2, int i3) {
        int iIntValue = tpd0Var.get().intValue();
        long jLongValue = zpd0Var.get().longValue();
        if (jLongValue == 0) {
            return true;
        }
        if (i > 0 && mqi0.m155944o() - jLongValue > i * 86400000) {
            return true;
        }
        if (i2 <= 0 || mqi0.m155944o() - jLongValue <= 86400000 * i2 || iIntValue >= i3) {
            return i2 == 0 && iIntValue < i3;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static PostBasePopWindow m199660d(String str) {
        List<PostBasePopWindow> listM209580x7 = FeedModule.f38855d.m209580x7(str);
        PostBasePopWindow postBasePopWindow = null;
        if (vwb.m200296J(listM209580x7)) {
            return null;
        }
        ArrayList arrayListM200339n = vwb.m200339n(listM209580x7, new w9j() { // from class: l.trh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((PostBasePopWindow) obj).occasion.type, OccasionType.immediatelyShowFrequency));
            }
        });
        if (vwb.m200296J(arrayListM200339n)) {
            return null;
        }
        for (int i = 0; i < arrayListM200339n.size(); i++) {
            PostBasePopWindow postBasePopWindow2 = (PostBasePopWindow) arrayListM200339n.get(i);
            zpd0 zpd0Var = new zpd0("immediately_show_dialog_time_" + postBasePopWindow2.basic.name + FeedModule.m60221F().userId(), 0L);
            tpd0 tpd0Var = new tpd0("immediately_show_dialog_count_" + postBasePopWindow2.basic.name + FeedModule.m60221F().userId(), 0);
            OccasionComponent occasionComponent = postBasePopWindow2.occasion;
            if (m199659c(zpd0Var, tpd0Var, occasionComponent.days, occasionComponent.intervalDays, occasionComponent.showTimes) && (!NullChecker.m81303a(postBasePopWindow) || postBasePopWindow.basic.priority < postBasePopWindow2.basic.priority)) {
                postBasePopWindow = postBasePopWindow2;
            }
        }
        return postBasePopWindow;
    }

    /* JADX INFO: renamed from: e */
    public static PostBasePopWindow m199661e(String str, final int i) {
        List<PostBasePopWindow> listM209580x7 = FeedModule.f38855d.m209580x7(str);
        PostBasePopWindow postBasePopWindow = null;
        if (vwb.m200296J(listM209580x7)) {
            return null;
        }
        ArrayList arrayListM200339n = vwb.m200339n(listM209580x7, new w9j() { // from class: l.urh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vrh.m199658b(i, (PostBasePopWindow) obj);
            }
        });
        if (vwb.m200296J(arrayListM200339n)) {
            return null;
        }
        for (int i2 = 0; i2 < arrayListM200339n.size(); i2++) {
            PostBasePopWindow postBasePopWindow2 = (PostBasePopWindow) arrayListM200339n.get(i2);
            zpd0 zpd0Var = new zpd0("read_count_show_dialog_time_" + postBasePopWindow2.basic.name + FeedModule.m60221F().userId(), 0L);
            tpd0 tpd0Var = new tpd0("read_count_show_dialog_count_" + postBasePopWindow2.basic.name + FeedModule.m60221F().userId(), 0);
            OccasionComponent occasionComponent = postBasePopWindow2.occasion;
            if (m199659c(zpd0Var, tpd0Var, occasionComponent.days, occasionComponent.intervalDays, occasionComponent.showTimes) && (!NullChecker.m81303a(postBasePopWindow) || postBasePopWindow.basic.priority < postBasePopWindow2.basic.priority)) {
                postBasePopWindow = postBasePopWindow2;
            }
        }
        return postBasePopWindow;
    }

    /* JADX INFO: renamed from: f */
    public static void m199662f(String str) {
        f182723a = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m199663g(zpd0 zpd0Var, tpd0 tpd0Var, int i, int i2, int i3) {
        int iIntValue = tpd0Var.get().intValue();
        long jLongValue = zpd0Var.get().longValue();
        if (jLongValue == 0) {
            zpd0Var.put(Long.valueOf(mqi0.m155944o()));
            tpd0Var.put(1);
            return;
        }
        if (i > 0 && mqi0.m155944o() - jLongValue > i * 86400000) {
            zpd0Var.put(Long.valueOf(mqi0.m155944o()));
            tpd0Var.put(1);
            return;
        }
        if (i2 > 0 && mqi0.m155944o() - jLongValue > 86400000 * i2 && iIntValue < i3) {
            zpd0Var.put(Long.valueOf(mqi0.m155944o()));
            tpd0Var.put(Integer.valueOf(iIntValue + 1));
        } else {
            if (i2 != 0 || iIntValue >= i3) {
                return;
            }
            zpd0Var.put(Long.valueOf(mqi0.m155944o()));
            tpd0Var.put(Integer.valueOf(iIntValue + 1));
        }
    }
}
