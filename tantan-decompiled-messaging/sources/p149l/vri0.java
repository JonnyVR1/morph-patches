package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.p053ui.main.TitleSwitcher;

/* JADX INFO: loaded from: classes10.dex */
public class vri0 {
    /* JADX INFO: renamed from: a */
    public static void m199669a(TitleSwitcher titleSwitcher, View view) {
        titleSwitcher.f30360a = (TabLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m199670b(TitleSwitcher titleSwitcher, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95382H3, viewGroup, false);
        m199669a(titleSwitcher, viewInflate);
        return viewInflate;
    }
}
