package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.p070ui.oms.OmsPageAct;

/* JADX INFO: loaded from: classes13.dex */
public class tk50 {
    /* JADX INFO: renamed from: a */
    public static void m191530a(OmsPageAct omsPageAct, View view) {
        omsPageAct.f55460c = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m191531b(OmsPageAct omsPageAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(jec0.f120439H, viewGroup, false);
        m191530a(omsPageAct, viewInflate);
        return viewInflate;
    }
}
