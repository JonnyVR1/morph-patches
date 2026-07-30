package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cj4 {
    /* JADX INFO: renamed from: a */
    public static void m107106a(bj4 bj4Var, View view) {
        bj4Var.f75865f = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bj4Var.f75866g = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bj4Var.f75867h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        bj4Var.f75868i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        bj4Var.f75869j = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bj4Var.f75870k = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bj4Var.f75871l = (VImage) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m107107b(bj4 bj4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95299C0, viewGroup, false);
        m107106a(bj4Var, viewInflate);
        return viewInflate;
    }
}
