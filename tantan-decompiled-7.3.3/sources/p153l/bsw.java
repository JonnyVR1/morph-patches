package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.view.MagicGestureView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bsw {
    /* JADX INFO: renamed from: a */
    public static void m106315a(MagicGestureView magicGestureView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        magicGestureView.f52911c = viewGroup.getChildAt(0);
        magicGestureView.f52912d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        magicGestureView.f52913e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
