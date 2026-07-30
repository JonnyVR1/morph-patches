package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopSchoolHideAct;
import p147v.VSwitch;

/* JADX INFO: loaded from: classes10.dex */
public class hka0 {
    /* JADX INFO: renamed from: a */
    public static void m131461a(ProfileLoopSchoolHideAct profileLoopSchoolHideAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileLoopSchoolHideAct.f33521c = (TextView) viewGroup.getChildAt(0);
        profileLoopSchoolHideAct.f33522d = (LinearLayout) viewGroup.getChildAt(1);
        profileLoopSchoolHideAct.f33523e = (VSwitch) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m131462b(ProfileLoopSchoolHideAct profileLoopSchoolHideAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137291D, viewGroup, false);
        m131461a(profileLoopSchoolHideAct, viewInflate);
        return viewInflate;
    }
}
