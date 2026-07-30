package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class svn0 {
    /* JADX INFO: renamed from: a */
    public static void m186099a(rvn0 rvn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rvn0Var.f161235a = viewGroup.getChildAt(0);
        rvn0Var.f161236b = (LinearLayout) viewGroup.getChildAt(1);
        rvn0Var.f161237c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        rvn0Var.f161238d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        rvn0Var.f161239e = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        rvn0Var.f161240f = (UnScrollVPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m186100b(rvn0 rvn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168321da, viewGroup, false);
        m186099a(rvn0Var, viewInflate);
        return viewInflate;
    }
}
