package p003l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mkp extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final float f5683a;

    /* JADX INFO: renamed from: b */
    public int f5684b;

    public mkp(float f) {
        this.f5684b = 0;
        this.f5683a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        int i;
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int i2 = this.f5684b;
        int i3 = 0;
        if (i2 == 0) {
            outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), this.f5683a);
            return;
        }
        int i4 = rect.bottom - rect.top;
        int i5 = rect.right - rect.left;
        if (i2 == 1) {
            i5 = (int) (i5 + this.f5683a);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    i3 = (int) (0.0f - this.f5683a);
                    i = 0;
                } else if (i2 == 4) {
                    i = (int) (0.0f - this.f5683a);
                }
                outline.setRoundRect(new Rect(i3, i, i5, i4), this.f5683a);
            }
            i4 = (int) (i4 + this.f5683a);
        }
        i = 0;
        outline.setRoundRect(new Rect(i3, i, i5, i4), this.f5683a);
    }

    public mkp(float f, int i) {
        this.f5683a = f;
        this.f5684b = i;
    }
}
