package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.LoveBuzzMatchView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m8w {
    /* JADX INFO: renamed from: a */
    public static void m8004a(LoveBuzzMatchView loveBuzzMatchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        loveBuzzMatchView.a = viewGroup.getChildAt(0);
        loveBuzzMatchView.b = viewGroup.getChildAt(1);
        loveBuzzMatchView.c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8005b(LoveBuzzMatchView loveBuzzMatchView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.r, viewGroup, true);
        m8004a(loveBuzzMatchView, viewInflate);
        return viewInflate;
    }
}
