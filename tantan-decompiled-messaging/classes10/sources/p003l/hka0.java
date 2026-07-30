package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopSchoolHideAct;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hka0 {
    /* JADX INFO: renamed from: a */
    public static void m7010a(ProfileLoopSchoolHideAct profileLoopSchoolHideAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileLoopSchoolHideAct.c = (TextView) viewGroup.getChildAt(0);
        profileLoopSchoolHideAct.d = (LinearLayout) viewGroup.getChildAt(1);
        profileLoopSchoolHideAct.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7011b(ProfileLoopSchoolHideAct profileLoopSchoolHideAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.D, viewGroup, false);
        m7010a(profileLoopSchoolHideAct, viewInflate);
        return viewInflate;
    }
}
