package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class x5l {
    /* JADX INFO: renamed from: a */
    public static void m207093a(v5l v5lVar, View view) {
        v5lVar.f180064f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        v5lVar.f180065g = (VImage) viewGroup.getChildAt(0);
        v5lVar.f180066h = (VDraweeView) viewGroup.getChildAt(1);
        v5lVar.f180067i = (VText_Bold) viewGroup.getChildAt(2);
        v5lVar.f180068j = (VText) viewGroup.getChildAt(3);
        v5lVar.f180069k = (VText_Bold) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m207094b(v5l v5lVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95738d4, viewGroup, false);
        m207093a(v5lVar, viewInflate);
        return viewInflate;
    }
}
