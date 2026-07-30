package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.statussquare.CoreStateSquareRecycleView;
import com.p046p1.mobile.putong.core.p053ui.statussquare.CoreStatusSquareTabFrag;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class oya {
    /* JADX INFO: renamed from: a */
    public static void m166627a(CoreStatusSquareTabFrag coreStatusSquareTabFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreStatusSquareTabFrag.f36380z = (VRelative) viewGroup.getChildAt(0);
        coreStatusSquareTabFrag.f36357A = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreStatusSquareTabFrag.f36358B = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreStatusSquareTabFrag.f36359C = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coreStatusSquareTabFrag.f36360D = (VPullDownRefreshLayout) viewGroup.getChildAt(1);
        coreStatusSquareTabFrag.f36361E = (CoreStateSquareRecycleView) view.findViewById(u4c0.f174537wc);
        coreStatusSquareTabFrag.f36362F = (VLinear) ((ViewGroup) view).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m166628b(CoreStatusSquareTabFrag coreStatusSquareTabFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95695ac, viewGroup, false);
        m166627a(coreStatusSquareTabFrag, viewInflate);
        return viewInflate;
    }
}
