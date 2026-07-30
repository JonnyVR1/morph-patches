package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.newui.discovery.ThemeSuggestFrag;
import p151v.VButton;
import p151v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class gvi0 {
    /* JADX INFO: renamed from: a */
    public static void m132557a(ThemeSuggestFrag themeSuggestFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        themeSuggestFrag.f22120z = (TabLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        themeSuggestFrag.f22114A = (VPager) viewGroup.getChildAt(1);
        themeSuggestFrag.f22115B = (VButton) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m132558b(ThemeSuggestFrag themeSuggestFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125938lf, viewGroup, false);
        m132557a(themeSuggestFrag, viewInflate);
        return viewInflate;
    }
}
