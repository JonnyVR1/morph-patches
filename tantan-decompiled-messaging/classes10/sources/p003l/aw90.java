package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.exp.ProfileListExpandedEditFrag;
import l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class aw90 {
    /* JADX INFO: renamed from: a */
    public static void m5645a(ProfileListExpandedEditFrag profileListExpandedEditFrag, View view) {
        profileListExpandedEditFrag.z = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileListExpandedEditFrag.A = viewGroup.getChildAt(0);
        profileListExpandedEditFrag.B = viewGroup.getChildAt(1);
        profileListExpandedEditFrag.C = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileListExpandedEditFrag.D = viewGroup.getChildAt(2);
        profileListExpandedEditFrag.E = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        profileListExpandedEditFrag.F = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        profileListExpandedEditFrag.G = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        profileListExpandedEditFrag.H = viewGroup.getChildAt(3);
        profileListExpandedEditFrag.I = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m5646b(ProfileListExpandedEditFrag profileListExpandedEditFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.S9, viewGroup, false);
        m5645a(profileListExpandedEditFrag, viewInflate);
        return viewInflate;
    }
}
