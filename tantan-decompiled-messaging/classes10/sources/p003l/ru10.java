package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.qu10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ru10 {
    /* JADX INFO: renamed from: a */
    public static void m9188a(qu10 qu10Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qu10Var.a = viewGroup.getChildAt(0);
        qu10Var.b = viewGroup.getChildAt(1);
        qu10Var.c = viewGroup.getChildAt(2);
        qu10Var.d = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m9189b(qu10 qu10Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.va, viewGroup, false);
        m9188a(qu10Var, viewInflate);
        return viewInflate;
    }
}
