package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.statussquare.CoreStatusSquareTabFrag;
import l.f6c0;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class oya {
    /* JADX INFO: renamed from: a */
    public static void m8601a(CoreStatusSquareTabFrag coreStatusSquareTabFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreStatusSquareTabFrag.z = viewGroup.getChildAt(0);
        coreStatusSquareTabFrag.A = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreStatusSquareTabFrag.B = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreStatusSquareTabFrag.C = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coreStatusSquareTabFrag.D = viewGroup.getChildAt(1);
        coreStatusSquareTabFrag.E = view.findViewById(u4c0.wc);
        coreStatusSquareTabFrag.F = ((ViewGroup) view).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8602b(CoreStatusSquareTabFrag coreStatusSquareTabFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ac, viewGroup, false);
        m8601a(coreStatusSquareTabFrag, viewInflate);
        return viewInflate;
    }
}
