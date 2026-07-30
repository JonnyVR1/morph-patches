package p153l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes13.dex */
public class qyh {
    /* JADX INFO: renamed from: a */
    public static SVGAnimationView m178649a(Act act, ViewGroup viewGroup, View view, float f, float f2, float f3, float f4) {
        SVGAnimationView sVGAnimationView = new SVGAnimationView(act);
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect);
        viewGroup.getGlobalVisibleRect(rect2);
        viewGroup.addView(sVGAnimationView);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sVGAnimationView.getLayoutParams();
        layoutParams.width = qa00.m175859d(f3);
        layoutParams.height = qa00.m175859d(f4);
        sVGAnimationView.setLayoutParams(layoutParams);
        sVGAnimationView.setY((((rect.top - rect2.top) + ((viewGroup.getHeight() + rect2.top) - rect2.bottom)) - ((view.getHeight() + rect.top) - rect.bottom)) + ((view.getHeight() - qa00.m175859d(48.0f)) / 2) + f2);
        sVGAnimationView.setX(rect.left + ((view.getWidth() - qa00.m175859d(48.0f)) / 2) + f);
        return sVGAnimationView;
    }
}
