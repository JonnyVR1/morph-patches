package p153l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes3.dex */
public class mmp extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final float f137625a;

    /* JADX INFO: renamed from: b */
    public int f137626b;

    public mmp(float f) {
        this.f137626b = 0;
        this.f137625a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        int i;
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int i2 = this.f137626b;
        int i3 = 0;
        if (i2 == 0) {
            outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), this.f137625a);
            return;
        }
        int i4 = rect.bottom - rect.top;
        int i5 = rect.right - rect.left;
        if (i2 == 1) {
            i5 = (int) (i5 + this.f137625a);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    i3 = (int) (0.0f - this.f137625a);
                    i = 0;
                } else if (i2 == 4) {
                    i = (int) (0.0f - this.f137625a);
                }
                outline.setRoundRect(new Rect(i3, i, i5, i4), this.f137625a);
            }
            i4 = (int) (i4 + this.f137625a);
        }
        i = 0;
        outline.setRoundRect(new Rect(i3, i, i5, i4), this.f137625a);
    }

    public mmp(float f, int i) {
        this.f137625a = f;
        this.f137626b = i;
    }
}
