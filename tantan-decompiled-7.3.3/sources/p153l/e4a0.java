package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditTopWarnView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ProfileListExpandedEditFrag;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class e4a0 {
    /* JADX INFO: renamed from: a */
    public static void m119390a(ProfileListExpandedEditFrag profileListExpandedEditFrag, View view) {
        profileListExpandedEditFrag.f34058z = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileListExpandedEditFrag.f34023A = (VNavigationBar) viewGroup.getChildAt(0);
        profileListExpandedEditFrag.f34024B = (VFrame) viewGroup.getChildAt(1);
        profileListExpandedEditFrag.f34025C = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileListExpandedEditFrag.f34026D = (VLinear) viewGroup.getChildAt(2);
        profileListExpandedEditFrag.f34027E = (TabLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        profileListExpandedEditFrag.f34029F = (ExpEditTopWarnView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        profileListExpandedEditFrag.f34031G = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        profileListExpandedEditFrag.f34033H = (VText) viewGroup.getChildAt(3);
        profileListExpandedEditFrag.f34035I = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m119391b(ProfileListExpandedEditFrag profileListExpandedEditFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125730Z9, viewGroup, false);
        m119390a(profileListExpandedEditFrag, viewInflate);
        return viewInflate;
    }
}
