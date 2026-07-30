package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.f6c0;
import l.w7p;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x7p {
    /* JADX INFO: renamed from: a */
    public static void m10651a(w7p w7pVar, View view) {
        w7pVar.d = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w7pVar.e = (TextView) viewGroup.getChildAt(0);
        w7pVar.f = (LinearLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10652b(w7p w7pVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.F5, viewGroup, false);
        m10651a(w7pVar, viewInflate);
        return viewInflate;
    }
}
