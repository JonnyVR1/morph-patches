package p153l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: loaded from: classes.dex */
public class d30 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f84842a;

    public d30(ActionBarContainer actionBarContainer) {
        this.f84842a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f84842a;
        if (actionBarContainer.f487h) {
            Drawable drawable = actionBarContainer.f486g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f484e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f84842a;
        Drawable drawable3 = actionBarContainer2.f485f;
        if (drawable3 == null || !actionBarContainer2.f488i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void getOutline(@NonNull Outline outline) {
        ActionBarContainer actionBarContainer = this.f84842a;
        if (actionBarContainer.f487h) {
            Drawable drawable = actionBarContainer.f486g;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f484e;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
