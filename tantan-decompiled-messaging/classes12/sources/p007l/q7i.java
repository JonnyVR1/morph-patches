package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class q7i {
    /* JADX INFO: renamed from: a */
    public static void m13487a(p7i p7iVar, View view) {
        p7iVar.f11717a = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m13488b(p7i p7iVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11073J3, viewGroup, false);
        m13487a(p7iVar, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m13489c(p7i p7iVar) {
        p7iVar.f11717a = null;
    }
}
