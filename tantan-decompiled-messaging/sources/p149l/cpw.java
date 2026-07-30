package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.view.MagicGestureView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cpw {
    /* JADX INFO: renamed from: a */
    public static void m108197a(MagicGestureView magicGestureView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        magicGestureView.f52063c = viewGroup.getChildAt(0);
        magicGestureView.f52064d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        magicGestureView.f52065e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
