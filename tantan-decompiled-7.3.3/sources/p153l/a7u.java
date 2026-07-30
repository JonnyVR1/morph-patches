package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.teenmode.LiveTeenModeViewModel;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p151v.VFrame;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class a7u {
    /* JADX INFO: renamed from: a */
    public static void m96383a(z6u z6uVar, View view) {
        z6uVar.f203185a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        z6uVar.f203186b = (NoSaveStateViewPager) viewGroup.getChildAt(0);
        z6uVar.f203187c = viewGroup.getChildAt(1);
        z6uVar.f203188d = (VLinear) viewGroup.getChildAt(2);
        z6uVar.f203189e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        z6uVar.f203190f = (VNavigationBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        z6uVar.f203191g = (TabLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        z6uVar.f203192h = (LiveTeenModeViewModel) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m96384b(z6u z6uVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193812Q0, viewGroup, false);
        m96383a(z6uVar, viewInflate);
        return viewInflate;
    }
}
