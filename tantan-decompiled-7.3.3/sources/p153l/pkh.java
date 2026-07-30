package p153l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes13.dex */
public class pkh extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public float f152839a;

    /* JADX INFO: renamed from: b */
    public boolean f152840b;

    public pkh(float f) {
        this.f152839a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top);
        if (this.f152840b) {
            outline.setRoundRect(0, 0, rect.right - rect.left, (rect.bottom - rect.top) + 40, this.f152839a);
        } else {
            outline.setRoundRect(rect2, this.f152839a);
        }
    }
}
