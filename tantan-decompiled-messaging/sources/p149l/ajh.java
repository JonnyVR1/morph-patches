package p149l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes12.dex */
public class ajh extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public float f70115a;

    /* JADX INFO: renamed from: b */
    public boolean f70116b;

    public ajh(float f) {
        this.f70115a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top);
        if (this.f70116b) {
            outline.setRoundRect(0, 0, rect.right - rect.left, (rect.bottom - rect.top) + 40, this.f70115a);
        } else {
            outline.setRoundRect(rect2, this.f70115a);
        }
    }
}
