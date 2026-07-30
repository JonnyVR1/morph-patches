package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p147v.smart_refresh.SmartRefreshLayout;

/* JADX INFO: loaded from: classes4.dex */
public class jtn0 {
    /* JADX INFO: renamed from: a */
    public static void m143155a(itn0 itn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itn0Var._emptyView = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itn0Var._emptyTitle = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itn0Var._refreshLayout = (SmartRefreshLayout) viewGroup.getChildAt(1);
        itn0Var._list = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m143156b(itn0 itn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168580x9, viewGroup, false);
        m143155a(itn0Var, viewInflate);
        return viewInflate;
    }
}
