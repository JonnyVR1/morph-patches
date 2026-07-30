package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;
import l.jta0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kta0 {
    /* JADX INFO: renamed from: a */
    public static void m7637a(jta0 jta0Var, View view) {
        jta0Var.u = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jta0Var.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jta0Var.w = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jta0Var.x = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7638b(jta0 jta0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ma, viewGroup, false);
        m7637a(jta0Var, viewInflate);
        return viewInflate;
    }
}
