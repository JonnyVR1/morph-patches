package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class nkf {
    /* JADX INFO: renamed from: a */
    public static void m163602a(mkf mkfVar, View view) {
        mkfVar.f137287f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mkfVar.f137288g = (VImage) viewGroup.getChildAt(0);
        mkfVar.f137289h = (VImage) viewGroup.getChildAt(1);
        mkfVar.f137290i = (FlowTagsView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m163603b(mkf mkfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126055sd, viewGroup, false);
        m163602a(mkfVar, viewInflate);
        return viewInflate;
    }
}
