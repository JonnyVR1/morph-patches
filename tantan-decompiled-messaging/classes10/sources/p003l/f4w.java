package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.LoveBuzzControlView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f4w {
    /* JADX INFO: renamed from: a */
    public static void m6389a(LoveBuzzControlView loveBuzzControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        loveBuzzControlView.a = viewGroup.getChildAt(0);
        loveBuzzControlView.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6390b(LoveBuzzControlView loveBuzzControlView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.q, viewGroup, true);
        m6389a(loveBuzzControlView, viewInflate);
        return viewInflate;
    }
}
