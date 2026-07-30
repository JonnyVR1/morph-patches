package p153l;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.OccasionComponent;
import com.p051p1.mobile.putong.feed.data.OccasionType;
import com.p051p1.mobile.putong.feed.data.PostBasePopWindow;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class kth {

    /* JADX INFO: renamed from: a */
    public static String f128698a = "";

    /* JADX INFO: renamed from: b */
    public static List<String> f128699b = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m151353b(int i, PostBasePopWindow postBasePopWindow) {
        OccasionComponent occasionComponent = postBasePopWindow.occasion;
        return Boolean.valueOf(occasionComponent.readCount <= i && TEnum.equals(occasionComponent.type, OccasionType.readFrequency));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m151354c(byd0 byd0Var, vxd0 vxd0Var, int i, int i2, int i3) {
        int iIntValue = vxd0Var.get().intValue();
        long jLongValue = byd0Var.get().longValue();
        if (jLongValue == 0) {
            return true;
        }
        if (i > 0 && pzi0.m174454o() - jLongValue > i * 86400000) {
            return true;
        }
        if (i2 <= 0 || pzi0.m174454o() - jLongValue <= 86400000 * i2 || iIntValue >= i3) {
            return i2 == 0 && iIntValue < i3;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static PostBasePopWindow m151355d(String str) {
        List<PostBasePopWindow> listM145821x7 = FeedModule.f39703d.m145821x7(str);
        PostBasePopWindow postBasePopWindow = null;
        if (jyb.m147479J(listM145821x7)) {
            return null;
        }
        ArrayList arrayListM147522n = jyb.m147522n(listM145821x7, new qcj() { // from class: l.ith
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((PostBasePopWindow) obj).occasion.type, OccasionType.immediatelyShowFrequency));
            }
        });
        if (jyb.m147479J(arrayListM147522n)) {
            return null;
        }
        for (int i = 0; i < arrayListM147522n.size(); i++) {
            PostBasePopWindow postBasePopWindow2 = (PostBasePopWindow) arrayListM147522n.get(i);
            byd0 byd0Var = new byd0("immediately_show_dialog_time_" + postBasePopWindow2.basic.name + FeedModule.m61405F().userId(), 0L);
            vxd0 vxd0Var = new vxd0("immediately_show_dialog_count_" + postBasePopWindow2.basic.name + FeedModule.m61405F().userId(), 0);
            OccasionComponent occasionComponent = postBasePopWindow2.occasion;
            if (m151354c(byd0Var, vxd0Var, occasionComponent.days, occasionComponent.intervalDays, occasionComponent.showTimes) && (!NullChecker.m82486a(postBasePopWindow) || postBasePopWindow.basic.priority < postBasePopWindow2.basic.priority)) {
                postBasePopWindow = postBasePopWindow2;
            }
        }
        return postBasePopWindow;
    }

    /* JADX INFO: renamed from: e */
    public static PostBasePopWindow m151356e(String str, final int i) {
        List<PostBasePopWindow> listM145821x7 = FeedModule.f39703d.m145821x7(str);
        PostBasePopWindow postBasePopWindow = null;
        if (jyb.m147479J(listM145821x7)) {
            return null;
        }
        ArrayList arrayListM147522n = jyb.m147522n(listM145821x7, new qcj() { // from class: l.jth
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return kth.m151353b(i, (PostBasePopWindow) obj);
            }
        });
        if (jyb.m147479J(arrayListM147522n)) {
            return null;
        }
        for (int i2 = 0; i2 < arrayListM147522n.size(); i2++) {
            PostBasePopWindow postBasePopWindow2 = (PostBasePopWindow) arrayListM147522n.get(i2);
            byd0 byd0Var = new byd0("read_count_show_dialog_time_" + postBasePopWindow2.basic.name + FeedModule.m61405F().userId(), 0L);
            vxd0 vxd0Var = new vxd0("read_count_show_dialog_count_" + postBasePopWindow2.basic.name + FeedModule.m61405F().userId(), 0);
            OccasionComponent occasionComponent = postBasePopWindow2.occasion;
            if (m151354c(byd0Var, vxd0Var, occasionComponent.days, occasionComponent.intervalDays, occasionComponent.showTimes) && (!NullChecker.m82486a(postBasePopWindow) || postBasePopWindow.basic.priority < postBasePopWindow2.basic.priority)) {
                postBasePopWindow = postBasePopWindow2;
            }
        }
        return postBasePopWindow;
    }

    /* JADX INFO: renamed from: f */
    public static void m151357f(String str) {
        f128698a = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m151358g(byd0 byd0Var, vxd0 vxd0Var, int i, int i2, int i3) {
        int iIntValue = vxd0Var.get().intValue();
        long jLongValue = byd0Var.get().longValue();
        if (jLongValue == 0) {
            byd0Var.put(Long.valueOf(pzi0.m174454o()));
            vxd0Var.put(1);
            return;
        }
        if (i > 0 && pzi0.m174454o() - jLongValue > i * 86400000) {
            byd0Var.put(Long.valueOf(pzi0.m174454o()));
            vxd0Var.put(1);
            return;
        }
        if (i2 > 0 && pzi0.m174454o() - jLongValue > 86400000 * i2 && iIntValue < i3) {
            byd0Var.put(Long.valueOf(pzi0.m174454o()));
            vxd0Var.put(Integer.valueOf(iIntValue + 1));
        } else {
            if (i2 != 0 || iIntValue >= i3) {
                return;
            }
            byd0Var.put(Long.valueOf(pzi0.m174454o()));
            vxd0Var.put(Integer.valueOf(iIntValue + 1));
        }
    }
}
