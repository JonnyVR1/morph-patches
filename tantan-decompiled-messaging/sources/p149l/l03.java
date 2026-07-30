package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.qqtheme.framework.wheelview.WheelView;

/* JADX INFO: loaded from: classes10.dex */
public class l03 {
    /* JADX INFO: renamed from: a */
    public static void m148003a(k03 k03Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        k03Var.f120441a = (LinearLayout) viewGroup.getChildAt(0);
        k03Var.f120442b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        k03Var.f120443c = (WheelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        k03Var.f120444d = (WheelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
        k03Var.f120445e = (WheelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(4);
        k03Var.f120446f = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m148004b(k03 k03Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95733d, viewGroup, false);
        m148003a(k03Var, viewInflate);
        return viewInflate;
    }
}
