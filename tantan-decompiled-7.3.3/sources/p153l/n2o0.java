package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p151v.smart_refresh.SmartRefreshLayout;

/* JADX INFO: loaded from: classes4.dex */
public class n2o0 {
    /* JADX INFO: renamed from: a */
    public static void m161245a(m2o0 m2o0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        m2o0Var._emptyView = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        m2o0Var._emptyTitle = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        m2o0Var._refreshLayout = (SmartRefreshLayout) viewGroup.getChildAt(1);
        m2o0Var._list = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m161246b(m2o0 m2o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199312x9, viewGroup, false);
        m161245a(m2o0Var, viewInflate);
        return viewInflate;
    }
}
