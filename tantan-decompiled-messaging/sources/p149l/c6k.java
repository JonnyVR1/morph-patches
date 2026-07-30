package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class c6k {
    /* JADX INFO: renamed from: a */
    public static void m105483a(b6k b6kVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        b6kVar.f73829k = viewGroup.getChildAt(0);
        b6kVar.f73830l = (LinearLayout) viewGroup.getChildAt(1);
        b6kVar.f73831m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        b6kVar.f73832n = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        b6kVar.f73833o = (VRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        b6kVar.f73834p = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        b6kVar.f73835q = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        b6kVar.f73836r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        b6kVar.f73837s = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m105484b(b6k b6kVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168232W8, viewGroup, false);
        m105483a(b6kVar, viewInflate);
        return viewInflate;
    }
}
