package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.p7n;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class q7n {
    /* JADX INFO: renamed from: a */
    public static void m8920a(p7n p7nVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        p7nVar.a = viewGroup.getChildAt(1);
        p7nVar.b = viewGroup.getChildAt(2);
        p7nVar.c = (LinearLayout) viewGroup.getChildAt(3);
        p7nVar.d = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        p7nVar.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
