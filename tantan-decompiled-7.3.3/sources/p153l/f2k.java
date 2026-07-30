package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class f2k {
    /* JADX INFO: renamed from: a */
    public static void m123627a(e2k e2kVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        e2kVar.f91771a = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        e2kVar.f91772b = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        e2kVar.f91773c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        e2kVar.f91774d = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        e2kVar.f91775e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        e2kVar.f91776f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        e2kVar.f91777g = (VText_AutoFit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        e2kVar.f91778h = (VPullUpRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        e2kVar.f91779i = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        e2kVar.f91780j = (LinearLayout) viewGroup.getChildAt(1);
        e2kVar.f91781k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        e2kVar.f91782l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        e2kVar.f91783m = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        e2kVar.f91784n = (CoreGiftLayer) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m123628b(e2k e2kVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157160y4, viewGroup, false);
        m123627a(e2kVar, viewInflate);
        return viewInflate;
    }
}
