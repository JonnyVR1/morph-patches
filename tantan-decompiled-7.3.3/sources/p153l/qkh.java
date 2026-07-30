package p153l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes13.dex */
public class qkh extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public float f158137a;

    /* JADX INFO: renamed from: b */
    public boolean f158138b;

    public qkh(float f) {
        this.f158137a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        Rect rect2 = new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top);
        if (this.f158138b) {
            outline.setRoundRect(0, 0, rect.right - rect.left, (rect.bottom - rect.top) + 40, this.f158137a);
        } else {
            outline.setRoundRect(rect2, this.f158137a);
        }
    }
}
