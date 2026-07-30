package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public class yur {
    /* JADX INFO: renamed from: a */
    public static void m217470a(xur xurVar, View view) {
        xurVar.f196310k = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xurVar.f196311l = (ConstraintLayout) viewGroup.getChildAt(0);
        xurVar.f196312m = (TextView) viewGroup.getChildAt(1);
        xurVar.f196313n = (TextView) viewGroup.getChildAt(2);
        xurVar.f196314o = (TextView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m217471b(xur xurVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199055e, viewGroup, false);
        m217470a(xurVar, viewInflate);
        return viewInflate;
    }
}
