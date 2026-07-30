package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.intloperation.campingactivity.a;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundConstraintLayout;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k3n {
    /* JADX INFO: renamed from: a */
    public static void m7527a(a aVar, View view) {
        aVar.b = (RoundConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aVar.c = viewGroup.getChildAt(0);
        aVar.d = viewGroup.getChildAt(1);
        aVar.e = viewGroup.getChildAt(2);
        aVar.f = (ImageView) viewGroup.getChildAt(3);
        aVar.g = (TextView) viewGroup.getChildAt(4);
        aVar.h = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m7528b(a aVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.u4, viewGroup, false);
        m7527a(aVar, viewInflate);
        return viewInflate;
    }
}
