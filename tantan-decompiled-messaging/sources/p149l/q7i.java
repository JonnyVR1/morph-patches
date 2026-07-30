package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes12.dex */
public class q7i {
    /* JADX INFO: renamed from: a */
    public static void m173260a(p7i p7iVar, View view) {
        p7iVar.f147509a = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m173261b(p7i p7iVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142054J3, viewGroup, false);
        m173260a(p7iVar, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m173262c(p7i p7iVar) {
        p7iVar.f147509a = null;
    }
}
