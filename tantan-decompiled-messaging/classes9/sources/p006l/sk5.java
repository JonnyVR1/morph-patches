package p006l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sk5 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public float f21388a;

    public sk5(float f) {
        this.f21388a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), this.f21388a);
    }
}
