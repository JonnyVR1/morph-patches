package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import l.f6c0;
import l.woa0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xoa0 {
    /* JADX INFO: renamed from: a */
    public static void m10939a(woa0 woa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        woa0Var.u = (FrameLayout) viewGroup.getChildAt(0);
        woa0Var.v = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        woa0Var.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        woa0Var.x = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        woa0Var.y = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        woa0Var.z = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10940b(woa0 woa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.fa, viewGroup, false);
        m10939a(woa0Var, viewInflate);
        return viewInflate;
    }
}
