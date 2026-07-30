package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class nie {
    /* JADX INFO: renamed from: a */
    public static void m163273a(mie mieVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mieVar.f136958e = (VNavigationBar) viewGroup.getChildAt(0);
        mieVar.f136959f = (VLinear) viewGroup.getChildAt(1);
        mieVar.f136960g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mieVar.f136961h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mieVar.f136962i = (VRecyclerView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m163274b(mie mieVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156846F, viewGroup, false);
        m163273a(mieVar, viewInflate);
        return viewInflate;
    }
}
