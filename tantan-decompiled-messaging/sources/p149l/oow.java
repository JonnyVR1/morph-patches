package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.view.MagicGestureItemView;
import p147v.VDraweeView;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class oow {
    /* JADX INFO: renamed from: a */
    public static void m165286a(MagicGestureItemView magicGestureItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        magicGestureItemView.f52055a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        magicGestureItemView.f52056b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        magicGestureItemView.f52057c = (VRecyclerView) view.findViewById(g5c0.f101058t3);
    }
}
