package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class c570 {
    /* JADX INFO: renamed from: a */
    public static void m9101a(b570 b570Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        b570Var.f5931a = viewGroup.getChildAt(0);
        b570Var.f5932b = viewGroup.getChildAt(1);
        b570Var.f5933c = viewGroup.getChildAt(2);
        b570Var.f5934d = view.findViewById(b5c0.f5983N);
        ViewGroup viewGroup2 = (ViewGroup) view;
        b570Var.f5935e = viewGroup2.getChildAt(3);
        b570Var.f5936f = ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        b570Var.f5937g = ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9102b(b570 b570Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11303s5, viewGroup, false);
        m9101a(b570Var, viewInflate);
        return viewInflate;
    }
}
