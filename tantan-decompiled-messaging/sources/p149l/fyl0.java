package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class fyl0 {
    /* JADX INFO: renamed from: a */
    public static void m123774a(eyl0 eyl0Var, View view) {
        eyl0Var.f93762k = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        eyl0Var.f93763l = (DialogTitleBar) viewGroup.getChildAt(0);
        eyl0Var.f93764m = viewGroup.getChildAt(1);
        eyl0Var.f93765n = (VRecyclerView) viewGroup.getChildAt(2);
        eyl0Var.f93766o = (VLinear) viewGroup.getChildAt(3);
    }
}
