package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ofe {
    /* JADX INFO: renamed from: a */
    public static void m164065a(nfe nfeVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nfeVar._head = (VDraweeView) viewGroup.getChildAt(0);
        nfeVar._count = (VText) viewGroup.getChildAt(1);
        nfeVar._content = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m164066b(nfe nfeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f167984C0, viewGroup, false);
        m164065a(nfeVar, viewInflate);
        return viewInflate;
    }
}
