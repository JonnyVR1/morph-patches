package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.group.SwipeRefreshList;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ank {
    /* JADX INFO: renamed from: a */
    public static void m97755a(zmk zmkVar, View view) {
        zmkVar.f203731a = (FrameLayout) view.findViewById(y4c0.f196049T3);
        ViewGroup viewGroup = (ViewGroup) view;
        zmkVar.f203732b = (SwipeRefreshList) viewGroup.getChildAt(0);
        zmkVar.f203733c = (VLinear) view.findViewById(y4c0.f196102c0);
        zmkVar.f203734d = (VRecyclerView) view.findViewById(y4c0.f196204q4);
        zmkVar.f203735e = (LinearLayout) view.findViewById(y4c0.f196099b4);
        zmkVar.f203736f = (VText) view.findViewById(y4c0.f195973H);
        zmkVar.f203737g = (VRecyclerView) view.findViewById(y4c0.f196197p4);
        zmkVar.f203738h = (VRelative) viewGroup.getChildAt(1);
        zmkVar.f203739i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        zmkVar.f203740j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m97756b(zmk zmkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126494j, viewGroup, false);
        m97755a(zmkVar, viewInflate);
        return viewInflate;
    }
}
