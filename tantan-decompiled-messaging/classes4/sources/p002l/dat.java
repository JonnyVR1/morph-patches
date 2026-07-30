package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.recreation.pk.view.LivePkCardShowItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dat {
    /* JADX INFO: renamed from: a */
    public static void m11731a(LivePkCardShowItemView livePkCardShowItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePkCardShowItemView.d = viewGroup.getChildAt(0);
        livePkCardShowItemView.e = (TextView) viewGroup.getChildAt(1);
        livePkCardShowItemView.f = (TextView) viewGroup.getChildAt(2);
    }
}
