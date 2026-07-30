package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.p053ui.greet.C8357a;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.User;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public interface fsl {
    /* JADX INFO: renamed from: M */
    void mo40653M(C8357a c8357a, User user, String str);

    /* JADX INFO: renamed from: O */
    void mo40654O();

    /* JADX INFO: renamed from: b */
    void mo40655b(View view, VImage vImage, VText vText, int i);

    /* JADX INFO: renamed from: c */
    void mo40656c(User user, boolean z);

    int getTop();

    /* JADX INFO: renamed from: k */
    void mo40662k(User user, String str);

    /* JADX INFO: renamed from: n */
    void mo40665n(String str, BubbleInfo bubbleInfo, String str2);

    /* JADX INFO: renamed from: p */
    void mo40666p(Act act, String str, CoreMomentInfo coreMomentInfo, String str2, String str3);

    void setMomentId(String str);

    void setOnAvatarClickListener(View.OnClickListener onClickListener);
}
