package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class i740 {
    /* JADX INFO: renamed from: a */
    public static void m134737a(NewProfilePrivilegedPager newProfilePrivilegedPager, View view) {
        newProfilePrivilegedPager._container = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newProfilePrivilegedPager._empty = viewGroup.getChildAt(0);
        newProfilePrivilegedPager._privilege_pager = (ViewPager) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m134738b(NewProfilePrivilegedPager newProfilePrivilegedPager, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95639X4, viewGroup, false);
        m134737a(newProfilePrivilegedPager, viewInflate);
        return viewInflate;
    }
}
