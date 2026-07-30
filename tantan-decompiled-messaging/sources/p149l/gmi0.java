package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.newui.discovery.ThemeSuggestFrag;
import p147v.VButton;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class gmi0 {
    /* JADX INFO: renamed from: a */
    public static void m126982a(ThemeSuggestFrag themeSuggestFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        themeSuggestFrag.f21378z = (TabLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        themeSuggestFrag.f21372A = (VPager) viewGroup.getChildAt(1);
        themeSuggestFrag.f21373B = (VButton) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m126983b(ThemeSuggestFrag themeSuggestFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95749df, viewGroup, false);
        m126982a(themeSuggestFrag, viewInflate);
        return viewInflate;
    }
}
