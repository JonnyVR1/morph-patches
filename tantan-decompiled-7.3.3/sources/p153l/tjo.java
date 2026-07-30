package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VRecyclerView;
import p151v.smart_refresh.SmartRefreshLayout;

/* JADX INFO: loaded from: classes10.dex */
public class tjo {
    /* JADX INFO: renamed from: a */
    public static void m191448a(qjo qjoVar, View view) {
        qjoVar.f158004a = (SmartRefreshLayout) ((ViewGroup) view).getChildAt(0);
        qjoVar.f158005b = (VRecyclerView) view.findViewById(ddc0.f87910p);
    }

    /* JADX INFO: renamed from: b */
    public static View m191449b(qjo qjoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151902F, viewGroup, false);
        m191448a(qjoVar, viewInflate);
        return viewInflate;
    }
}
