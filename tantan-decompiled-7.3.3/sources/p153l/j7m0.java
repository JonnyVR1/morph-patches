package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class j7m0 {
    /* JADX INFO: renamed from: a */
    public static void m143786a(i7m0 i7m0Var, View view) {
        i7m0Var.f113267k = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        i7m0Var.f113268l = (DialogTitleBar) viewGroup.getChildAt(0);
        i7m0Var.f113269m = viewGroup.getChildAt(1);
        i7m0Var.f113270n = (VRecyclerView) viewGroup.getChildAt(2);
        i7m0Var.f113271o = (VLinear) viewGroup.getChildAt(3);
    }
}
