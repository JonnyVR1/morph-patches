package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.MultiCallBottomMenuView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u310 {
    /* JADX INFO: renamed from: a */
    public static void m23274a(MultiCallBottomMenuView multiCallBottomMenuView, View view) {
        multiCallBottomMenuView.f4558a = (MultiCallBottomMenuView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        multiCallBottomMenuView.f4559b = viewGroup.getChildAt(0);
        multiCallBottomMenuView.f4560c = viewGroup.getChildAt(1);
        multiCallBottomMenuView.f4561d = viewGroup.getChildAt(2);
        multiCallBottomMenuView.f4562e = (TextView) viewGroup.getChildAt(3);
    }
}
