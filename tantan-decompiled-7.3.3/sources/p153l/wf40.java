package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class wf40 {
    /* JADX INFO: renamed from: a */
    public static void m206045a(NewProfilePrivilegedPager newProfilePrivilegedPager, View view) {
        newProfilePrivilegedPager._container = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newProfilePrivilegedPager._empty = viewGroup.getChildAt(0);
        newProfilePrivilegedPager._privilege_pager = (ViewPager) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m206046b(NewProfilePrivilegedPager newProfilePrivilegedPager, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125709Y4, viewGroup, false);
        m206045a(newProfilePrivilegedPager, viewInflate);
        return viewInflate;
    }
}
