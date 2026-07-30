package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class w4o0 {
    /* JADX INFO: renamed from: a */
    public static void m204901a(v4o0 v4o0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        v4o0Var.f182403a = viewGroup.getChildAt(0);
        v4o0Var.f182404b = (LinearLayout) viewGroup.getChildAt(1);
        v4o0Var.f182405c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        v4o0Var.f182406d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        v4o0Var.f182407e = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        v4o0Var.f182408f = (UnScrollVPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m204902b(v4o0 v4o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199053da, viewGroup, false);
        m204901a(v4o0Var, viewInflate);
        return viewInflate;
    }
}
