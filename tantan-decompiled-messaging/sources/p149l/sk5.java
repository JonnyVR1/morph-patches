package p149l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes9.dex */
public class sk5 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public float f164934a;

    public sk5(float f) {
        this.f164934a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), this.f164934a);
    }
}
