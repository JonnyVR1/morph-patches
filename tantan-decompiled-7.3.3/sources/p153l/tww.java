package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.map.MapListView;
import p151v.VLinear;
import p151v.VList;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tww {
    /* JADX INFO: renamed from: a */
    public static void m193372a(sww swwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        swwVar.f171027g = (FrameLayout) viewGroup.getChildAt(0);
        swwVar.f171028h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        swwVar.f171029i = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        swwVar.f171030j = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        swwVar.f171031k = (VText) viewGroup.getChildAt(1);
        swwVar.f171032l = (MapListView) viewGroup.getChildAt(2);
        swwVar.f171033m = (VLinear) viewGroup.getChildAt(3);
        swwVar.f171034n = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        swwVar.f171035o = (FrameLayout) viewGroup.getChildAt(4);
        swwVar.f171036p = (VList) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m193373b(sww swwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125590Qd, viewGroup, false);
        m193372a(swwVar, viewInflate);
        return viewInflate;
    }
}
