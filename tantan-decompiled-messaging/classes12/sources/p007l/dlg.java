package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dlg {
    /* JADX INFO: renamed from: a */
    public static void m9468a(clg clgVar, View view) {
        clgVar.f6670o = (LinearLayout) view;
        clgVar.f6671p = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9469b(clg clgVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11149W1, viewGroup, false);
        m9468a(clgVar, viewInflate);
        return viewInflate;
    }
}
