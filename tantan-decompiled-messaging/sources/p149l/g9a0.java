package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class g9a0 {
    /* JADX INFO: renamed from: a */
    public static void m124781a(ProfileListFragLocalEditImpl profileListFragLocalEditImpl, View view) {
        profileListFragLocalEditImpl.f33966z = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileListFragLocalEditImpl.f33899A = (VNavigationBar) viewGroup.getChildAt(0);
        profileListFragLocalEditImpl.f33900B = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileListFragLocalEditImpl.f33901C = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileListFragLocalEditImpl.f33902D = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        profileListFragLocalEditImpl.f33903E = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        profileListFragLocalEditImpl.f33905F = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        profileListFragLocalEditImpl.f33907G = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        profileListFragLocalEditImpl.f33909H = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        profileListFragLocalEditImpl.f33911I = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        profileListFragLocalEditImpl.f33913J = (CardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        profileListFragLocalEditImpl.f33915K = (CardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        profileListFragLocalEditImpl.f33917L = (CardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        profileListFragLocalEditImpl.f33919M = (RoundedRectangleProgressView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        profileListFragLocalEditImpl.f33921N = (RoundedRectangleProgressView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        profileListFragLocalEditImpl.f33923O = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        profileListFragLocalEditImpl.f33925P = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        profileListFragLocalEditImpl.f33927Q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        profileListFragLocalEditImpl.f33929R = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        profileListFragLocalEditImpl.f33931S = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        profileListFragLocalEditImpl.f33933T = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        profileListFragLocalEditImpl.f33935U = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m124782b(ProfileListFragLocalEditImpl profileListFragLocalEditImpl, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95710ba, viewGroup, false);
        m124781a(profileListFragLocalEditImpl, viewInflate);
        return viewInflate;
    }
}
