package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.p058ui.greet.C8520a;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.User;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public interface tul {
    /* JADX INFO: renamed from: M */
    void mo41664M(C8520a c8520a, User user, String str);

    /* JADX INFO: renamed from: O */
    void mo41665O();

    /* JADX INFO: renamed from: b */
    void mo41666b(View view, VImage vImage, VText vText, int i);

    /* JADX INFO: renamed from: c */
    void mo41667c(User user, boolean z);

    int getTop();

    /* JADX INFO: renamed from: k */
    void mo41673k(User user, String str);

    /* JADX INFO: renamed from: n */
    void mo41676n(String str, BubbleInfo bubbleInfo, String str2);

    /* JADX INFO: renamed from: p */
    void mo41677p(Act act, String str, CoreMomentInfo coreMomentInfo, String str2, String str3);

    void setMomentId(String str);

    void setOnAvatarClickListener(View.OnClickListener onClickListener);
}
