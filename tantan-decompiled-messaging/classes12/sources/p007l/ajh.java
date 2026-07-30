package p007l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ajh extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public float f5761a;

    /* JADX INFO: renamed from: b */
    public boolean f5762b;

    public ajh(float f) {
        this.f5761a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top);
        if (this.f5762b) {
            outline.setRoundRect(0, 0, rect.right - rect.left, (rect.bottom - rect.top) + 40, this.f5761a);
        } else {
            outline.setRoundRect(rect2, this.f5761a);
        }
    }
}
