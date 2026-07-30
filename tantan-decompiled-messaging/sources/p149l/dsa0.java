package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.vip.greet.ProfileSendLetterView;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterRemainingSwitcherView;

/* JADX INFO: loaded from: classes10.dex */
public class dsa0 {
    /* JADX INFO: renamed from: a */
    public static void m113454a(ProfileSendLetterView profileSendLetterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileSendLetterView.f37089c = (TextView) viewGroup.getChildAt(0);
        profileSendLetterView.f37090d = (TextView) viewGroup.getChildAt(1);
        profileSendLetterView.f37091e = (LetterRemainingSwitcherView) viewGroup.getChildAt(2);
    }
}
