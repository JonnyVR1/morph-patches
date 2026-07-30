package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class f4o {
    /* JADX INFO: renamed from: a */
    public static void m119354a(e4o e4oVar, View view) {
        e4oVar.f89299a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        e4oVar.f89300b = (VFrame) viewGroup.getChildAt(0);
        e4oVar.f89301c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        e4oVar.f89302d = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        e4oVar.f89303e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        e4oVar.f89304f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        e4oVar.f89305g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        e4oVar.f89306h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        e4oVar.f89307i = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(3);
        e4oVar.f89308j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(4);
        e4oVar.f89309k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        e4oVar.f89310l = (VFrame) viewGroup.getChildAt(1);
        e4oVar.f89311m = (NoSaveStateViewPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        e4oVar.f89312n = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m119355b(e4o e4oVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162689N0, viewGroup, false);
        m119354a(e4oVar, viewInflate);
        return viewInflate;
    }
}
