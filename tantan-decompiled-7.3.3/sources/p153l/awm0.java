package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VFrame;
import p151v.VSwitchButton;

/* JADX INFO: loaded from: classes4.dex */
public class awm0 {
    /* JADX INFO: renamed from: a */
    public static void m100675a(zvm0 zvm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zvm0Var.f206256a = (RelativeLayout) viewGroup.getChildAt(0);
        zvm0Var.f206257b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        zvm0Var.f206258c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        zvm0Var.f206259d = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        zvm0Var.f206260e = (VSwitchButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        zvm0Var.f206261f = (LinearLayout) viewGroup.getChildAt(1);
        zvm0Var.f206262g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        zvm0Var.f206263h = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        zvm0Var.f206264i = (LinearLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m100676b(zvm0 zvm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198915S7, viewGroup, false);
        m100675a(zvm0Var, viewInflate);
        return viewInflate;
    }
}
