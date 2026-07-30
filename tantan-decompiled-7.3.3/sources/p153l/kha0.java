package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class kha0 {
    /* JADX INFO: renamed from: a */
    public static void m149788a(ProfileListFragLocalEditImpl profileListFragLocalEditImpl, View view) {
        profileListFragLocalEditImpl.f34814z = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileListFragLocalEditImpl.f34747A = (VNavigationBar) viewGroup.getChildAt(0);
        profileListFragLocalEditImpl.f34748B = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileListFragLocalEditImpl.f34749C = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileListFragLocalEditImpl.f34750D = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        profileListFragLocalEditImpl.f34751E = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        profileListFragLocalEditImpl.f34753F = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        profileListFragLocalEditImpl.f34755G = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        profileListFragLocalEditImpl.f34757H = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        profileListFragLocalEditImpl.f34759I = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        profileListFragLocalEditImpl.f34761J = (CardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        profileListFragLocalEditImpl.f34763K = (CardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        profileListFragLocalEditImpl.f34765L = (CardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        profileListFragLocalEditImpl.f34767M = (RoundedRectangleProgressView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        profileListFragLocalEditImpl.f34769N = (RoundedRectangleProgressView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        profileListFragLocalEditImpl.f34771O = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        profileListFragLocalEditImpl.f34773P = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        profileListFragLocalEditImpl.f34775Q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        profileListFragLocalEditImpl.f34777R = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        profileListFragLocalEditImpl.f34779S = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        profileListFragLocalEditImpl.f34781T = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        profileListFragLocalEditImpl.f34783U = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m149789b(ProfileListFragLocalEditImpl profileListFragLocalEditImpl, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125883ia, viewGroup, false);
        m149788a(profileListFragLocalEditImpl, viewInflate);
        return viewInflate;
    }
}
