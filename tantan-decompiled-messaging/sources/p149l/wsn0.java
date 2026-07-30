package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class wsn0 {
    /* JADX INFO: renamed from: a */
    public static void m205521a(vsn0 vsn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vsn0Var._empty = viewGroup.getChildAt(0);
        vsn0Var._title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vsn0Var._content = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vsn0Var._line = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vsn0Var._cancel = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        vsn0Var._accept = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m205522b(vsn0 vsn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168606z9, viewGroup, false);
        m205521a(vsn0Var, viewInflate);
        return viewInflate;
    }
}
