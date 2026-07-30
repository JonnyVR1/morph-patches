package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p147v.VFrame_Shadow;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kjf {
    /* JADX INFO: renamed from: a */
    public static void m146228a(jjf jjfVar, View view) {
        jjfVar.f118283e = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jjfVar.f118284f = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jjfVar.f118285g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        jjfVar.f118286h = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jjfVar.f118287i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        jjfVar.f118288j = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        jjfVar.f118289k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m146229b(jjf jjfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95388H9, viewGroup, false);
        m146228a(jjfVar, viewInflate);
        return viewInflate;
    }
}
