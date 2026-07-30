package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class v8j0 {
    /* JADX INFO: renamed from: a */
    public static void m200308a(u8j0 u8j0Var, View view) {
        u8j0Var.f178049a = (SwipeRefreshLayout) ((ViewGroup) view).getChildAt(0);
        u8j0Var.f178050b = (VRecyclerView) view.findViewById(hdc0.f108893Z1);
        u8j0Var.f178051c = (CommonEmptyView) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m200309b(u8j0 u8j0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173661f4, viewGroup, false);
        m200308a(u8j0Var, viewInflate);
        return viewInflate;
    }
}
