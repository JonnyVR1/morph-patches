package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class sge {
    /* JADX INFO: renamed from: a */
    public static void m185770a(rge rgeVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rgeVar._head = (VDraweeView) viewGroup.getChildAt(0);
        rgeVar._count = (VText) viewGroup.getChildAt(1);
        rgeVar._content = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m185771b(rge rgeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198716C0, viewGroup, false);
        m185770a(rgeVar, viewInflate);
        return viewInflate;
    }
}
