package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import p147v.VFrame;
import p147v.VPager;

/* JADX INFO: renamed from: l.mc */
/* JADX INFO: loaded from: classes4.dex */
public class C18434mc {
    /* JADX INFO: renamed from: a */
    public static void m153978a(C18186lc c18186lc, View view) {
        c18186lc.f127358k = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c18186lc.f127359l = (TabLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c18186lc.f127360m = (VPager) viewGroup.getChildAt(1);
    }
}
