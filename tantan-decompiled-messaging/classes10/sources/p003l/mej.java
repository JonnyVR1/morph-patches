package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.lej;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mej {
    /* JADX INFO: renamed from: a */
    public static void m8142a(lej lejVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        lejVar.R = viewGroup.getChildAt(0);
        lejVar.S = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        lejVar.T = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        lejVar.U = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        lejVar.V = viewGroup.getChildAt(1);
        lejVar.W = (TextView) viewGroup.getChildAt(2);
    }
}
