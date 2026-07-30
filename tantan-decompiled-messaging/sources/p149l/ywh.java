package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.view.RoamEntranceView;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class ywh {

    /* JADX INFO: renamed from: c */
    public static volatile ywh f200501c;

    /* JADX INFO: renamed from: a */
    public WeakReference<RoamEntranceView> f200502a;

    /* JADX INFO: renamed from: b */
    public String f200503b;

    /* JADX INFO: renamed from: a */
    public static ywh m216393a() {
        if (f200501c == null) {
            synchronized (ywh.class) {
                try {
                    if (f200501c == null) {
                        f200501c = new ywh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f200501c;
    }

    /* JADX INFO: renamed from: c */
    public static void m216394c(Act act, String str) {
        if (FeedModule.m60222H().me_() == null) {
            return;
        }
        if (FeedModule.m60222H().mo30809q7()) {
            FeedModule.m60222H().mo30737Y6(act, str);
        } else {
            FeedModule.m60222H().mo30728Ug(act, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m216395b(String str) {
        this.f200503b = str;
        WeakReference<RoamEntranceView> weakReference = this.f200502a;
        if (weakReference == null) {
            return;
        }
        RoamEntranceView roamEntranceView = weakReference.get();
        if (NullChecker.m81303a(roamEntranceView)) {
            roamEntranceView.m66423d(this.f200503b);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m216396d(RoamEntranceView roamEntranceView) {
        if (roamEntranceView == null) {
            return;
        }
        this.f200502a = new WeakReference<>(roamEntranceView);
        if (TextUtils.isEmpty(this.f200503b)) {
            return;
        }
        roamEntranceView.m66423d(this.f200503b);
    }
}
