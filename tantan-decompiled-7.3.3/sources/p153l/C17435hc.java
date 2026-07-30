package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import p151v.VFrame;
import p151v.VPager;

/* JADX INFO: renamed from: l.hc */
/* JADX INFO: loaded from: classes4.dex */
public class C17435hc {
    /* JADX INFO: renamed from: a */
    public static void m134441a(C17193gc c17193gc, View view) {
        c17193gc.f103509k = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c17193gc.f103510l = (TabLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c17193gc.f103511m = (VPager) viewGroup.getChildAt(1);
    }
}
