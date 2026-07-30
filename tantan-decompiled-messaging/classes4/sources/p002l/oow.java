package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.view.MagicGestureItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oow {
    /* JADX INFO: renamed from: a */
    public static void m19644a(MagicGestureItemView magicGestureItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        magicGestureItemView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        magicGestureItemView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        magicGestureItemView.c = view.findViewById(g5c0.f11208t3);
    }
}
