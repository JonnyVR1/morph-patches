package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.ui.oms.OmsPageAct;
import l.e6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class mc50 {
    /* JADX INFO: renamed from: a */
    public static void m11909a(OmsPageAct omsPageAct, View view) {
        omsPageAct.c = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m11910b(OmsPageAct omsPageAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.H, viewGroup, false);
        m11909a(omsPageAct, viewInflate);
        return viewInflate;
    }
}
