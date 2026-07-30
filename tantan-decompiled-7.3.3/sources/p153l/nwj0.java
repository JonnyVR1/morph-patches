package p153l;

import android.view.View;
import android.view.ViewGroup;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nwj0 {
    /* JADX INFO: renamed from: a */
    public static void m164992a(mwj0 mwj0Var, View view) {
        mwj0Var.f139099i = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mwj0Var.f139100j = (VText) viewGroup.getChildAt(0);
        mwj0Var.f139101k = (VText) viewGroup.getChildAt(1);
        mwj0Var.f139102l = (VRecyclerView) viewGroup.getChildAt(2);
        mwj0Var.f139103m = (VRecyclerView) viewGroup.getChildAt(3);
    }
}
