package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.ui.lovebuzz.common.BaseBuzzCallEndFrag;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pf2 {
    /* JADX INFO: renamed from: a */
    public static void m8741a(BaseBuzzCallEndFrag baseBuzzCallEndFrag, View view) {
        baseBuzzCallEndFrag.z = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        baseBuzzCallEndFrag.A = viewGroup.getChildAt(0);
        baseBuzzCallEndFrag.B = viewGroup.getChildAt(1);
        baseBuzzCallEndFrag.C = viewGroup.getChildAt(2);
        baseBuzzCallEndFrag.D = viewGroup.getChildAt(3);
        baseBuzzCallEndFrag.E = viewGroup.getChildAt(4);
        baseBuzzCallEndFrag.F = viewGroup.getChildAt(5);
        baseBuzzCallEndFrag.G = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m8742b(BaseBuzzCallEndFrag baseBuzzCallEndFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.a, viewGroup, false);
        m8741a(baseBuzzCallEndFrag, viewInflate);
        return viewInflate;
    }
}
