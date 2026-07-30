package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VRecyclerView;
import p147v.smart_refresh.SmartRefreshLayout;

/* JADX INFO: loaded from: classes10.dex */
public class tho {
    /* JADX INFO: renamed from: a */
    public static void m188925a(qho qhoVar, View view) {
        qhoVar.f154481a = (SmartRefreshLayout) ((ViewGroup) view).getChildAt(0);
        qhoVar.f154482b = (VRecyclerView) view.findViewById(x4c0.f191005p);
    }

    /* JADX INFO: renamed from: b */
    public static View m188926b(qho qhoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121294F, viewGroup, false);
        m188925a(qhoVar, viewInflate);
        return viewInflate;
    }
}
