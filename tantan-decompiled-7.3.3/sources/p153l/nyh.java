package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.view.RoamEntranceView;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class nyh {

    /* JADX INFO: renamed from: c */
    public static volatile nyh f144307c;

    /* JADX INFO: renamed from: a */
    public WeakReference<RoamEntranceView> f144308a;

    /* JADX INFO: renamed from: b */
    public String f144309b;

    /* JADX INFO: renamed from: a */
    public static nyh m165324a() {
        if (f144307c == null) {
            synchronized (nyh.class) {
                try {
                    if (f144307c == null) {
                        f144307c = new nyh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f144307c;
    }

    /* JADX INFO: renamed from: c */
    public static void m165325c(Act act, String str) {
        if (FeedModule.m61406H().me_() == null) {
            return;
        }
        if (FeedModule.m61406H().mo31812q7()) {
            FeedModule.m61406H().mo31740Y6(act, str);
        } else {
            FeedModule.m61406H().mo31731Ug(act, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m165326b(String str) {
        this.f144309b = str;
        WeakReference<RoamEntranceView> weakReference = this.f144308a;
        if (weakReference == null) {
            return;
        }
        RoamEntranceView roamEntranceView = weakReference.get();
        if (NullChecker.m82486a(roamEntranceView)) {
            roamEntranceView.m67606d(this.f144309b);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m165327d(RoamEntranceView roamEntranceView) {
        if (roamEntranceView == null) {
            return;
        }
        this.f144308a = new WeakReference<>(roamEntranceView);
        if (TextUtils.isEmpty(this.f144309b)) {
            return;
        }
        roamEntranceView.m67606d(this.f144309b);
    }
}
