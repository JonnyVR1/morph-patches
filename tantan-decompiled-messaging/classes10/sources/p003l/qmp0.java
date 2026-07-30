package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qmp0 {
    /* JADX INFO: renamed from: a */
    public static void m9025a(pmp0 pmp0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pmp0Var.f6874f = viewGroup.getChildAt(0);
        pmp0Var.f6875g = (LinearLayout) viewGroup.getChildAt(1);
        pmp0Var.f6876h = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        pmp0Var.f6877i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pmp0Var.f6878j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        pmp0Var.f6879k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m9026b(pmp0 pmp0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Rc, viewGroup, false);
        m9025a(pmp0Var, viewInflate);
        return viewInflate;
    }
}
