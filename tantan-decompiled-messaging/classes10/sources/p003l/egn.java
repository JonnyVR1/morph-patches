package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.dgn;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class egn {
    /* JADX INFO: renamed from: a */
    public static void m6297a(dgn dgnVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dgnVar.R = viewGroup.getChildAt(0);
        dgnVar.S = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dgnVar.T = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        dgnVar.U = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        dgnVar.V = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        dgnVar.W = viewGroup.getChildAt(1);
        dgnVar.X = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dgnVar.Y = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        dgnVar.Z = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        dgnVar.a0 = viewGroup.getChildAt(2);
        dgnVar.b0 = (TextView) viewGroup.getChildAt(3);
    }
}
