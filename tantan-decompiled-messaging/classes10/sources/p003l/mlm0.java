package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.h6c0;
import l.llm0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mlm0 {
    /* JADX INFO: renamed from: a */
    public static void m8171a(llm0 llm0Var, View view) {
        llm0Var.b = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m8172b(llm0 llm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.F, viewGroup, false);
        m8171a(llm0Var, viewInflate);
        return viewInflate;
    }
}
