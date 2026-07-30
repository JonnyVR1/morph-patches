package p153l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class cnd0 extends dnd0 {
    public cnd0(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // p153l.dnd0
    /* JADX INFO: renamed from: c */
    public void mo111497c(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        m117061g();
        outline.setRoundRect(this.f89789h, m117058b());
    }
}
