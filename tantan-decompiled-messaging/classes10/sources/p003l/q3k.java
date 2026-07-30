package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.newui.admob.GoogleAdAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class q3k {
    /* JADX INFO: renamed from: a */
    public static void m8910a(GoogleAdAct googleAdAct, View view) {
        googleAdAct.c = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        googleAdAct.d = viewGroup.getChildAt(0);
        googleAdAct.e = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8911b(GoogleAdAct googleAdAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.D3, viewGroup, false);
        m8910a(googleAdAct, viewInflate);
        return viewInflate;
    }
}
