package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditTopWarnView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ProfileListExpandedEditFrag;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class aw90 {
    /* JADX INFO: renamed from: a */
    public static void m99258a(ProfileListExpandedEditFrag profileListExpandedEditFrag, View view) {
        profileListExpandedEditFrag.f33210z = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileListExpandedEditFrag.f33175A = (VNavigationBar) viewGroup.getChildAt(0);
        profileListExpandedEditFrag.f33176B = (VFrame) viewGroup.getChildAt(1);
        profileListExpandedEditFrag.f33177C = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileListExpandedEditFrag.f33178D = (VLinear) viewGroup.getChildAt(2);
        profileListExpandedEditFrag.f33179E = (TabLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        profileListExpandedEditFrag.f33181F = (ExpEditTopWarnView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        profileListExpandedEditFrag.f33183G = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        profileListExpandedEditFrag.f33185H = (VText) viewGroup.getChildAt(3);
        profileListExpandedEditFrag.f33187I = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m99259b(ProfileListExpandedEditFrag profileListExpandedEditFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95564S9, viewGroup, false);
        m99258a(profileListExpandedEditFrag, viewInflate);
        return viewInflate;
    }
}
