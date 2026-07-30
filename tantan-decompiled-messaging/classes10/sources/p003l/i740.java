package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager;
import l.f6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class i740 {
    /* JADX INFO: renamed from: a */
    public static void m7135a(NewProfilePrivilegedPager newProfilePrivilegedPager, View view) {
        newProfilePrivilegedPager.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newProfilePrivilegedPager.b = viewGroup.getChildAt(0);
        newProfilePrivilegedPager.c = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7136b(NewProfilePrivilegedPager newProfilePrivilegedPager, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.X4, viewGroup, false);
        m7135a(newProfilePrivilegedPager, viewInflate);
        return viewInflate;
    }
}
