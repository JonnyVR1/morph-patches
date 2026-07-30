package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class mf90 {
    /* JADX INFO: renamed from: a */
    public static void m154369a(ProfileAct profileAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileAct.f33015c = (VLinear) viewGroup.getChildAt(0);
        profileAct.f33016d = (VLinear) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m154370b(ProfileAct profileAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95536Qd, viewGroup, false);
        m154369a(profileAct, viewInflate);
        return viewInflate;
    }
}
