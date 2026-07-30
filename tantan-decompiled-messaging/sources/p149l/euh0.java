package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p147v.VButton;

/* JADX INFO: loaded from: classes10.dex */
public class euh0 {
    /* JADX INFO: renamed from: a */
    public static void m118165a(duh0 duh0Var, View view) {
        duh0Var.f87977a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        duh0Var.f87978b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        duh0Var.f87979c = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        duh0Var.f87980d = (FrameLayout) viewGroup.getChildAt(1);
        duh0Var.f87981e = (VButton) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m118166b(duh0 duh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96085xc, viewGroup, false);
        m118165a(duh0Var, viewInflate);
        return viewInflate;
    }
}
