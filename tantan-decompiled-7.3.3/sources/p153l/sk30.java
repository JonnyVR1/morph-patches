package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VFrame;
import p151v.VPullUpRecyclerView;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sk30 {
    /* JADX INFO: renamed from: a */
    public static void m186398a(mk30 mk30Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mk30Var.f137197a = (VRecyclerView) viewGroup.getChildAt(0);
        mk30Var.f137198b = (VPullUpRecyclerView) viewGroup.getChildAt(1);
        mk30Var.f137199c = (VFrame) viewGroup.getChildAt(2);
        mk30Var.f137200d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        mk30Var.f137201e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        mk30Var.f137202f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m186399b(mk30 mk30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125690X1, viewGroup, false);
        m186398a(mk30Var, viewInflate);
        return viewInflate;
    }
}
