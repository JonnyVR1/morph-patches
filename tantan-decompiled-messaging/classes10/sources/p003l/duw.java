package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.map.MapPoiItem;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class duw {
    /* JADX INFO: renamed from: a */
    public static void m6211a(MapPoiItem mapPoiItem, View view) {
        mapPoiItem.c = (LinearLayout) ((ViewGroup) view).getChildAt(0);
        mapPoiItem.d = view.findViewById(u4c0.I8);
        ViewGroup viewGroup = (ViewGroup) view;
        mapPoiItem.e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mapPoiItem.f = view.findViewById(u4c0.t2);
        mapPoiItem.g = view.findViewById(u4c0.p2);
        mapPoiItem.h = view.findViewById(u4c0.f1);
        mapPoiItem.i = viewGroup.getChildAt(2);
    }
}
