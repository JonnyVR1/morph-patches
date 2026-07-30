package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class my80 {
    /* JADX INFO: renamed from: a */
    public static void m160741a(ly80 ly80Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ly80Var._get_privilege = (TextView) viewGroup.getChildAt(0);
        ly80Var._subtitle = (TextView) viewGroup.getChildAt(1);
        ly80Var._title = (TextView) viewGroup.getChildAt(2);
        ly80Var._image = (VDraweeView) viewGroup.getChildAt(3);
    }
}
