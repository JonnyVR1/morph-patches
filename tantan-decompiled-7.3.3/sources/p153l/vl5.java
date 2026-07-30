package p153l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes9.dex */
public class vl5 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public float f184541a;

    public vl5(float f) {
        this.f184541a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), this.f184541a);
    }
}
