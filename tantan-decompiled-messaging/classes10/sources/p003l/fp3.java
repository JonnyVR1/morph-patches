package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzRegionChooseView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fp3 {
    /* JADX INFO: renamed from: a */
    public static void m6486a(BuzzRegionChooseView buzzRegionChooseView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzRegionChooseView.a = viewGroup.getChildAt(0);
        buzzRegionChooseView.b = viewGroup.getChildAt(1);
        buzzRegionChooseView.c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6487b(BuzzRegionChooseView buzzRegionChooseView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.k, viewGroup, true);
        m6486a(buzzRegionChooseView, viewInflate);
        return viewInflate;
    }
}
