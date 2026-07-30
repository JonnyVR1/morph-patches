package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p147v.VButton_FakeShadow;
import p147v.VMaterialEdit;

/* JADX INFO: loaded from: classes10.dex */
public class cme0 {
    /* JADX INFO: renamed from: a */
    public static void m107614a(bme0 bme0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bme0Var.f76274a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        bme0Var.f76275b = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        bme0Var.f76276c = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        bme0Var.f76277d = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m107615b(bme0 bme0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126366P5, viewGroup, false);
        m107614a(bme0Var, viewInflate);
        return viewInflate;
    }
}
