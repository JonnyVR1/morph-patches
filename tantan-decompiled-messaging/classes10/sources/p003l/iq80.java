package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class iq80 {
    /* JADX INFO: renamed from: a */
    public static void m7287a(hq80 hq80Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hq80Var._get_privilege = (TextView) viewGroup.getChildAt(0);
        hq80Var._subtitle = (TextView) viewGroup.getChildAt(1);
        hq80Var._title = (TextView) viewGroup.getChildAt(2);
        hq80Var._image = viewGroup.getChildAt(3);
    }
}
