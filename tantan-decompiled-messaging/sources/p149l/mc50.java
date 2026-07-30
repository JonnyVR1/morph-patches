package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.p065ui.oms.OmsPageAct;

/* JADX INFO: loaded from: classes12.dex */
public class mc50 {
    /* JADX INFO: renamed from: a */
    public static void m153985a(OmsPageAct omsPageAct, View view) {
        omsPageAct.f54612c = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m153986b(OmsPageAct omsPageAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.f89526H, viewGroup, false);
        m153985a(omsPageAct, viewInflate);
        return viewInflate;
    }
}
