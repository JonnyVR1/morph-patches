package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class e2o0 {
    /* JADX INFO: renamed from: a */
    public static void m119131a(d2o0 d2o0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d2o0Var._empty = viewGroup.getChildAt(0);
        d2o0Var._funcList = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        d2o0Var._line = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        d2o0Var._cancel = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m119132b(d2o0 d2o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199273u9, viewGroup, false);
        m119131a(d2o0Var, viewInflate);
        return viewInflate;
    }
}
