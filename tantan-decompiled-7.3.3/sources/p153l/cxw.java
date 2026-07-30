package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.map.MapPoiItem;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cxw {
    /* JADX INFO: renamed from: a */
    public static void m113072a(MapPoiItem mapPoiItem, View view) {
        mapPoiItem.f31215c = (LinearLayout) ((ViewGroup) view).getChildAt(0);
        mapPoiItem.f31216d = (VText) view.findViewById(adc0.f69983K8);
        ViewGroup viewGroup = (ViewGroup) view;
        mapPoiItem.f31217e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mapPoiItem.f31218f = (VText) view.findViewById(adc0.f70601v2);
        mapPoiItem.f31219g = (VText) view.findViewById(adc0.f70533r2);
        mapPoiItem.f31220h = (VImage) view.findViewById(adc0.f70329f1);
        mapPoiItem.f31221i = (VText) viewGroup.getChildAt(2);
    }
}
