package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.f6c0;
import l.r3n;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s3n {
    /* JADX INFO: renamed from: a */
    public static void m9216a(r3n r3nVar, View view) {
        r3nVar.d = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r3nVar.e = (TextView) viewGroup.getChildAt(0);
        r3nVar.f = (LinearLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9217b(r3n r3nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.v4, viewGroup, false);
        m9216a(r3nVar, viewInflate);
        return viewInflate;
    }
}
