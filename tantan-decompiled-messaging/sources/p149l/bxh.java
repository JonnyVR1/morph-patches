package p149l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes12.dex */
public class bxh {
    /* JADX INFO: renamed from: a */
    public static SVGAnimationView m104315a(Act act, ViewGroup viewGroup, View view, float f, float f2, float f3, float f4) {
        SVGAnimationView sVGAnimationView = new SVGAnimationView(act);
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect);
        viewGroup.getGlobalVisibleRect(rect2);
        viewGroup.addView(sVGAnimationView);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sVGAnimationView.getLayoutParams();
        layoutParams.width = t100.m186890d(f3);
        layoutParams.height = t100.m186890d(f4);
        sVGAnimationView.setLayoutParams(layoutParams);
        sVGAnimationView.setY((((rect.top - rect2.top) + ((viewGroup.getHeight() + rect2.top) - rect2.bottom)) - ((view.getHeight() + rect.top) - rect.bottom)) + ((view.getHeight() - t100.m186890d(48.0f)) / 2) + f2);
        sVGAnimationView.setX(rect.left + ((view.getWidth() - t100.m186890d(48.0f)) / 2) + f);
        return sVGAnimationView;
    }
}
