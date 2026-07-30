package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public class xsr {
    /* JADX INFO: renamed from: a */
    public static void m210832a(wsr wsrVar, View view) {
        wsrVar.f187959k = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wsrVar.f187960l = (ConstraintLayout) viewGroup.getChildAt(0);
        wsrVar.f187961m = (TextView) viewGroup.getChildAt(1);
        wsrVar.f187962n = (TextView) viewGroup.getChildAt(2);
        wsrVar.f187963o = (TextView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m210833b(wsr wsrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168323e, viewGroup, false);
        m210832a(wsrVar, viewInflate);
        return viewInflate;
    }
}
