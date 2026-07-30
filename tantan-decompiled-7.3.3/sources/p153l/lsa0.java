package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopSchoolHideAct;
import p151v.VSwitch;

/* JADX INFO: loaded from: classes10.dex */
public class lsa0 {
    /* JADX INFO: renamed from: a */
    public static void m155685a(ProfileLoopSchoolHideAct profileLoopSchoolHideAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileLoopSchoolHideAct.f34369c = (TextView) viewGroup.getChildAt(0);
        profileLoopSchoolHideAct.f34370d = (LinearLayout) viewGroup.getChildAt(1);
        profileLoopSchoolHideAct.f34371e = (VSwitch) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m155686b(ProfileLoopSchoolHideAct profileLoopSchoolHideAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167505D, viewGroup, false);
        m155685a(profileLoopSchoolHideAct, viewInflate);
        return viewInflate;
    }
}
