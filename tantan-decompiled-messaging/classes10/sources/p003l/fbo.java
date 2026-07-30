package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.ebo;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fbo {
    /* JADX INFO: renamed from: a */
    public static void m6464a(ebo eboVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        eboVar.a = viewGroup.getChildAt(0);
        eboVar.b = (LinearLayout) viewGroup.getChildAt(1);
        eboVar.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6465b(ebo eboVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ed, viewGroup, false);
        m6464a(eboVar, viewInflate);
        return viewInflate;
    }
}
