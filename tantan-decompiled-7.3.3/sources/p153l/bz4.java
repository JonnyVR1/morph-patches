package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VButton;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bz4 {
    /* JADX INFO: renamed from: a */
    public static void m107107a(az4 az4Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        az4Var.f74074a = viewGroup.getChildAt(0);
        az4Var.f74075b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        az4Var.f74076c = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        az4Var.f74077d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        az4Var.f74078e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        az4Var.f74079f = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(0);
        az4Var.f74080g = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(1);
        az4Var.f74081h = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m107108b(az4 az4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199004a0, viewGroup, false);
        m107107a(az4Var, viewInflate);
        return viewInflate;
    }
}
