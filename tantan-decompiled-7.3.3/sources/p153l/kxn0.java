package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.smart_refresh.SmartRefreshLayout;

/* JADX INFO: loaded from: classes4.dex */
public class kxn0 {
    /* JADX INFO: renamed from: a */
    public static void m151840a(jxn0 jxn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jxn0Var.f123051a = (VLinear) viewGroup.getChildAt(0);
        jxn0Var.f123052b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jxn0Var.f123053c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jxn0Var.f123054d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        jxn0Var.f123055e = (SmartRefreshLayout) viewGroup.getChildAt(1);
        jxn0Var.f123056f = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        jxn0Var.f123057g = (ImageView) viewGroup.getChildAt(2);
        jxn0Var.f123058h = (TextView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m151841b(jxn0 jxn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198700A8, viewGroup, false);
        m151840a(jxn0Var, viewInflate);
        return viewInflate;
    }
}
