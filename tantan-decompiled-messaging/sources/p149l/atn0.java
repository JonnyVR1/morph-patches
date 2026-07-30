package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class atn0 {
    /* JADX INFO: renamed from: a */
    public static void m98835a(zsn0 zsn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zsn0Var._empty = viewGroup.getChildAt(0);
        zsn0Var._funcList = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        zsn0Var._line = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        zsn0Var._cancel = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m98836b(zsn0 zsn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168541u9, viewGroup, false);
        m98835a(zsn0Var, viewInflate);
        return viewInflate;
    }
}
