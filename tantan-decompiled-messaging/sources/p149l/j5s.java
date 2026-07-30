package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class j5s {
    /* JADX INFO: renamed from: a */
    public static void m139869a(LiveCoverAct liveCoverAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveCoverAct.f51194c = (VDraweeView) viewGroup.getChildAt(0);
        liveCoverAct.f51195d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveCoverAct.f51196e = (VDraweeView) view.findViewById(g5c0.f100659C2);
        ViewGroup viewGroup2 = (ViewGroup) view;
        liveCoverAct.f51197f = (VButton) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        liveCoverAct.f51198g = (VText) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        liveCoverAct.f51199h = (VText) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
        liveCoverAct.f51200i = (VText) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4);
        liveCoverAct.f51201j = (VButton) viewGroup2.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m139870b(LiveCoverAct liveCoverAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168441n0, viewGroup, false);
        m139869a(liveCoverAct, viewInflate);
        return viewInflate;
    }
}
