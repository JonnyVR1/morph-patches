package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.p058ui.main.TitleSwitcher;

/* JADX INFO: loaded from: classes10.dex */
public class y0j0 {
    /* JADX INFO: renamed from: a */
    public static void m213878a(TitleSwitcher titleSwitcher, View view) {
        titleSwitcher.f31208a = (TabLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m213879b(TitleSwitcher titleSwitcher, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125436H3, viewGroup, false);
        m213878a(titleSwitcher, viewInflate);
        return viewInflate;
    }
}
