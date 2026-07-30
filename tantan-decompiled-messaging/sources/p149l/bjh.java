package p149l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes12.dex */
public class bjh extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public float f75903a;

    /* JADX INFO: renamed from: b */
    public boolean f75904b;

    public bjh(float f) {
        this.f75903a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        Rect rect2 = new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top);
        if (this.f75904b) {
            outline.setRoundRect(0, 0, rect.right - rect.left, (rect.bottom - rect.top) + 40, this.f75903a);
        } else {
            outline.setRoundRect(rect2, this.f75903a);
        }
    }
}
