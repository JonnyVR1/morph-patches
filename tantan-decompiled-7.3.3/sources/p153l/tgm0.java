package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import p151v.VLinear;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class tgm0 {
    /* JADX INFO: renamed from: a */
    public static void m191042a(sgm0 sgm0Var, View view) {
        sgm0Var._visitors = (VPullUpRecyclerView) view.findViewById(ddc0.f87893W);
        ViewGroup viewGroup = (ViewGroup) view;
        sgm0Var._empty = (NestedScrollView) viewGroup.getChildAt(1);
        sgm0Var._empty_text = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        sgm0Var._get_privilege = (VLinear) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m191043b(sgm0 sgm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151961Y1, viewGroup, false);
        m191042a(sgm0Var, viewInflate);
        return viewInflate;
    }
}
