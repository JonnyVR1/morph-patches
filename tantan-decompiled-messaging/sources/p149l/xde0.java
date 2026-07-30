package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.secretcrush.ScrollIndexView;
import p147v.VFrame;
import p147v.VList;
import p147v.VProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class xde0 {
    /* JADX INFO: renamed from: a */
    public static void m208313a(wde0 wde0Var, View view) {
        wde0Var.f185783a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wde0Var.f185784b = (VProgressBar) viewGroup.getChildAt(0);
        wde0Var.f185785c = (FrameLayout) viewGroup.getChildAt(1);
        wde0Var.f185786d = (VList) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wde0Var.f185787e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        wde0Var.f185788f = (ScrollIndexView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m208314b(wde0 wde0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95441Ke, viewGroup, false);
        m208313a(wde0Var, viewInflate);
        return viewInflate;
    }
}
