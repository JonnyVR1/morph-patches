package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzNoFaceTipView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class to3 {
    /* JADX INFO: renamed from: a */
    public static void m9599a(BuzzNoFaceTipView buzzNoFaceTipView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzNoFaceTipView.a = viewGroup.getChildAt(0);
        buzzNoFaceTipView.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9600b(BuzzNoFaceTipView buzzNoFaceTipView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.s, viewGroup, true);
        m9599a(buzzNoFaceTipView, viewInflate);
        return viewInflate;
    }
}
