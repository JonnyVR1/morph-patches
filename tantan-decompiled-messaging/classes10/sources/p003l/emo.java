package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.dmo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class emo {
    /* JADX INFO: renamed from: a */
    public static void m6307a(dmo dmoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dmoVar.a = (LinearLayout) viewGroup.getChildAt(0);
        dmoVar.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dmoVar.c = viewGroup.getChildAt(1);
        dmoVar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dmoVar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        dmoVar.f = viewGroup.getChildAt(2);
    }
}
