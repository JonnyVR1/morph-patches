package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
import l.rvn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class svn0 {
    /* JADX INFO: renamed from: a */
    public static void m22711a(rvn0 rvn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rvn0Var.a = viewGroup.getChildAt(0);
        rvn0Var.b = (LinearLayout) viewGroup.getChildAt(1);
        rvn0Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        rvn0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        rvn0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        rvn0Var.f = (UnScrollVPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m22712b(rvn0 rvn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19817da, viewGroup, false);
        m22711a(rvn0Var, viewInflate);
        return viewInflate;
    }
}
