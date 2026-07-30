package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.map.MapPoiItem;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class duw {
    /* JADX INFO: renamed from: a */
    public static void m113748a(MapPoiItem mapPoiItem, View view) {
        mapPoiItem.f30367c = (LinearLayout) ((ViewGroup) view).getChildAt(0);
        mapPoiItem.f30368d = (VText) view.findViewById(u4c0.f173861I8);
        ViewGroup viewGroup = (ViewGroup) view;
        mapPoiItem.f30369e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mapPoiItem.f30370f = (VText) view.findViewById(u4c0.f174476t2);
        mapPoiItem.f30371g = (VText) view.findViewById(u4c0.f174408p2);
        mapPoiItem.f30372h = (VImage) view.findViewById(u4c0.f174238f1);
        mapPoiItem.f30373i = (VText) viewGroup.getChildAt(2);
    }
}
