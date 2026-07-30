package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.intloperation.quiz.a;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundConstraintLayout;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k7p {
    /* JADX INFO: renamed from: a */
    public static void m7546a(a aVar, View view) {
        aVar.c = (RoundConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aVar.d = viewGroup.getChildAt(0);
        aVar.e = (TextView) viewGroup.getChildAt(1);
        aVar.f = viewGroup.getChildAt(2);
        aVar.g = (ImageView) viewGroup.getChildAt(3);
        aVar.h = (TextView) viewGroup.getChildAt(4);
        aVar.i = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m7547b(a aVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.D5, viewGroup, false);
        m7546a(aVar, viewInflate);
        return viewInflate;
    }
}
