package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes13.dex */
public class f9i {
    /* JADX INFO: renamed from: a */
    public static void m124656a(e9i e9iVar, View view) {
        e9iVar.f92636a = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m124657b(e9i e9iVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173523J3, viewGroup, false);
        m124656a(e9iVar, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m124658c(e9i e9iVar) {
        e9iVar.f92636a = null;
    }
}
