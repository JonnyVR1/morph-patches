package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.view.MagicGestureView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cpw {
    /* JADX INFO: renamed from: a */
    public static void m11308a(MagicGestureView magicGestureView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        magicGestureView.c = viewGroup.getChildAt(0);
        magicGestureView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        magicGestureView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
