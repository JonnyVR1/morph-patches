package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.onlinezone.OnlineZoneItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rn50 {
    /* JADX INFO: renamed from: a */
    public static void m9153a(OnlineZoneItemView onlineZoneItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineZoneItemView.a = viewGroup.getChildAt(0);
        onlineZoneItemView.b = viewGroup.getChildAt(3);
        onlineZoneItemView.c = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        onlineZoneItemView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        onlineZoneItemView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        onlineZoneItemView.f = (TextView) viewGroup.getChildAt(4);
        onlineZoneItemView.g = (ImageView) viewGroup.getChildAt(5);
    }
}
