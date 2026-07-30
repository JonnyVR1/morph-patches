package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class mlm0 {
    /* JADX INFO: renamed from: a */
    public static void m155166a(llm0 llm0Var, View view) {
        llm0Var._voice_buzz_root = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m155167b(llm0 llm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106021F, viewGroup, false);
        m155166a(llm0Var, viewInflate);
        return viewInflate;
    }
}
