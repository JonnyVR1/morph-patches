package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vb3 {
    /* JADX INFO: renamed from: a */
    public static void m23811a(BottomItemView bottomItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bottomItemView.f4524a = (BottomViewGroup) viewGroup.getChildAt(0);
        bottomItemView.f4525b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bottomItemView.f4526c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bottomItemView.f4527d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        bottomItemView.f4528e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        bottomItemView.f4529f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        bottomItemView.f4530g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        bottomItemView.f4531h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        bottomItemView.f4532i = viewGroup.getChildAt(1);
    }
}
