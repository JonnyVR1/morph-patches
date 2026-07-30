package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class vyo0 {
    /* JADX INFO: renamed from: a */
    public static void m204033a(uyo0 uyo0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        uyo0Var.f181653x = (LinearLayout) viewGroup.getChildAt(0);
        uyo0Var.f181654y = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        uyo0Var.f181655z = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        uyo0Var.f181649A = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        uyo0Var.f181650B = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        uyo0Var.f181651C = (ImageView) viewGroup.getChildAt(1);
    }
}
