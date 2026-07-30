package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.teenmode.LiveTeenModeViewModel;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p147v.VFrame;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class z4u {
    /* JADX INFO: renamed from: a */
    public static void m217127a(y4u y4uVar, View view) {
        y4uVar.f196342a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        y4uVar.f196343b = (NoSaveStateViewPager) viewGroup.getChildAt(0);
        y4uVar.f196344c = viewGroup.getChildAt(1);
        y4uVar.f196345d = (VLinear) viewGroup.getChildAt(2);
        y4uVar.f196346e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        y4uVar.f196347f = (VNavigationBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        y4uVar.f196348g = (TabLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        y4uVar.f196349h = (LiveTeenModeViewModel) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m217128b(y4u y4uVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162698Q0, viewGroup, false);
        m217127a(y4uVar, viewInflate);
        return viewInflate;
    }
}
