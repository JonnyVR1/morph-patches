package p003l;

import android.view.View;
import com.p000p1.mobile.putong.core.data.CoreMomentInfo;
import com.p000p1.mobile.putong.core.p001ui.greet.C3132a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.User;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public interface fsl {
    /* JADX INFO: renamed from: M */
    void mo3275M(C3132a c3132a, User user, String str);

    /* JADX INFO: renamed from: O */
    void mo3276O();

    /* JADX INFO: renamed from: b */
    void mo3281b(View view, VImage vImage, VText vText, int i);

    /* JADX INFO: renamed from: c */
    void mo3283c(User user, boolean z);

    int getTop();

    /* JADX INFO: renamed from: k */
    void mo3285k(User user, String str);

    /* JADX INFO: renamed from: n */
    void mo3286n(String str, BubbleInfo bubbleInfo, String str2);

    /* JADX INFO: renamed from: p */
    void mo3287p(Act act, String str, CoreMomentInfo coreMomentInfo, String str2, String str3);

    void setMomentId(String str);

    void setOnAvatarClickListener(View.OnClickListener onClickListener);
}
