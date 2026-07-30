package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.statussquare.CoreStateSquareRecycleView;
import com.p051p1.mobile.putong.core.p058ui.statussquare.CoreStatusSquareTabFrag;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class a0b {
    /* JADX INFO: renamed from: a */
    public static void m95324a(CoreStatusSquareTabFrag coreStatusSquareTabFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreStatusSquareTabFrag.f37228z = (VRelative) viewGroup.getChildAt(0);
        coreStatusSquareTabFrag.f37205A = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreStatusSquareTabFrag.f37206B = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreStatusSquareTabFrag.f37207C = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coreStatusSquareTabFrag.f37208D = (VPullDownRefreshLayout) viewGroup.getChildAt(1);
        coreStatusSquareTabFrag.f37209E = (CoreStateSquareRecycleView) view.findViewById(adc0.f70662yc);
        coreStatusSquareTabFrag.f37210F = (VLinear) ((ViewGroup) view).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m95325b(CoreStatusSquareTabFrag coreStatusSquareTabFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125868hc, viewGroup, false);
        m95324a(coreStatusSquareTabFrag, viewInflate);
        return viewInflate;
    }
}
