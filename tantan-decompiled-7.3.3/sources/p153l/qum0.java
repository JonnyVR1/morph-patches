package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class qum0 {
    /* JADX INFO: renamed from: a */
    public static void m178163a(pum0 pum0Var, View view) {
        pum0Var._voice_buzz_root = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m178164b(pum0 pum0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136463F, viewGroup, false);
        m178163a(pum0Var, viewInflate);
        return viewInflate;
    }
}
