package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes12.dex */
public class dlg {
    /* JADX INFO: renamed from: a */
    public static void m112355a(clg clgVar, View view) {
        clgVar.f81393o = (LinearLayout) view;
        clgVar.f81394p = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m112356b(clg clgVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142130W1, viewGroup, false);
        m112355a(clgVar, viewInflate);
        return viewInflate;
    }
}
