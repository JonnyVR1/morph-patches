package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import l.oej;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tej {
    /* JADX INFO: renamed from: a */
    public static void m9572a(oej oejVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oejVar.a = viewGroup.getChildAt(0);
        oejVar.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        oejVar.c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oejVar.d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        oejVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        oejVar.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        oejVar.g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        oejVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        oejVar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        oejVar.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2);
    }
}
