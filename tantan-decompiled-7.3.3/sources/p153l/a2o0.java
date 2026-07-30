package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class a2o0 {
    /* JADX INFO: renamed from: a */
    public static void m95721a(z1o0 z1o0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        z1o0Var._empty = viewGroup.getChildAt(0);
        z1o0Var._title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        z1o0Var._content = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        z1o0Var._line = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        z1o0Var._cancel = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        z1o0Var._accept = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m95722b(z1o0 z1o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199338z9, viewGroup, false);
        m95721a(z1o0Var, viewInflate);
        return viewInflate;
    }
}
