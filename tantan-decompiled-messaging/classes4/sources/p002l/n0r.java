package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n0r {
    /* JADX INFO: renamed from: a */
    public static void m18349a(KtvChooseSongItem ktvChooseSongItem, View view) {
        ktvChooseSongItem.d = (KtvChooseSongItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ktvChooseSongItem.e = viewGroup.getChildAt(0);
        ktvChooseSongItem.f = (TextView) viewGroup.getChildAt(1);
        ktvChooseSongItem.g = viewGroup.getChildAt(2);
        ktvChooseSongItem.h = viewGroup.getChildAt(3);
        ktvChooseSongItem.i = viewGroup.getChildAt(4);
        ktvChooseSongItem.j = viewGroup.getChildAt(5);
        ktvChooseSongItem.k = viewGroup.getChildAt(6);
    }
}
