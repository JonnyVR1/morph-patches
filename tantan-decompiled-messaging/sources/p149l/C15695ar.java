package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VButton_FakeShadow;

/* JADX INFO: renamed from: l.ar */
/* JADX INFO: loaded from: classes10.dex */
public class C15695ar {
    /* JADX INFO: renamed from: a */
    public static void m98366a(C21755zq c21755zq, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c21755zq.f204332a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c21755zq.f204333b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c21755zq.f204334c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        c21755zq.f204335d = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m98367b(C21755zq c21755zq, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137352g, viewGroup, false);
        m98366a(c21755zq, viewInflate);
        return viewInflate;
    }
}
