package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundRelativeLayout;
import l.yo60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zo60 {
    /* JADX INFO: renamed from: a */
    public static void m11439a(yo60 yo60Var, View view) {
        yo60Var.c = (RoundRelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        yo60Var.d = viewGroup.getChildAt(0);
        yo60Var.e = viewGroup.getChildAt(1);
        yo60Var.f = viewGroup.getChildAt(2);
        yo60Var.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        yo60Var.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        yo60Var.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        yo60Var.j = viewGroup.getChildAt(3);
        yo60Var.k = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        yo60Var.l = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        yo60Var.m = (TextView) viewGroup.getChildAt(5);
        yo60Var.n = viewGroup.getChildAt(6);
    }
}
