package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class hjf {
    /* JADX INFO: renamed from: a */
    public static void m131369a(gjf gjfVar, View view) {
        gjfVar.f103026f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gjfVar.f103027g = (VImage) viewGroup.getChildAt(0);
        gjfVar.f103028h = (VImage) viewGroup.getChildAt(1);
        gjfVar.f103029i = (FlowTagsView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m131370b(gjf gjfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95882ld, viewGroup, false);
        m131369a(gjfVar, viewInflate);
        return viewInflate;
    }
}
