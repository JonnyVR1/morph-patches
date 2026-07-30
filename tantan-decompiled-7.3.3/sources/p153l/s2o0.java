package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class s2o0 {
    /* JADX INFO: renamed from: a */
    public static void m184131a(r2o0 r2o0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        r2o0Var._empty = viewGroup.getChildAt(0);
        r2o0Var._title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        r2o0Var._content = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        r2o0Var._iknowBtn = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m184132b(r2o0 r2o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199325y9, viewGroup, false);
        m184131a(r2o0Var, viewInflate);
        return viewInflate;
    }
}
