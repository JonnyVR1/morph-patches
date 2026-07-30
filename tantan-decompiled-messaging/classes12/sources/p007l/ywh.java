package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.view.RoamEntranceView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ywh {

    /* JADX INFO: renamed from: c */
    public static volatile ywh f15519c;

    /* JADX INFO: renamed from: a */
    public WeakReference<RoamEntranceView> f15520a;

    /* JADX INFO: renamed from: b */
    public String f15521b;

    /* JADX INFO: renamed from: a */
    public static ywh m17195a() {
        if (f15519c == null) {
            synchronized (ywh.class) {
                try {
                    if (f15519c == null) {
                        f15519c = new ywh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15519c;
    }

    /* JADX INFO: renamed from: c */
    public static void m17196c(Act act, String str) {
        if (FeedModule.m1140H().me_() == null) {
            return;
        }
        if (FeedModule.m1140H().q7()) {
            FeedModule.m1140H().Y6(act, str);
        } else {
            FeedModule.m1140H().Ug(act, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m17197b(String str) {
        this.f15521b = str;
        WeakReference<RoamEntranceView> weakReference = this.f15520a;
        if (weakReference == null) {
            return;
        }
        RoamEntranceView roamEntranceView = weakReference.get();
        if (NullChecker.a(roamEntranceView)) {
            roamEntranceView.m7588d(this.f15521b);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m17198d(RoamEntranceView roamEntranceView) {
        if (roamEntranceView == null) {
            return;
        }
        this.f15520a = new WeakReference<>(roamEntranceView);
        if (TextUtils.isEmpty(this.f15521b)) {
            return;
        }
        roamEntranceView.m7588d(this.f15521b);
    }
}
