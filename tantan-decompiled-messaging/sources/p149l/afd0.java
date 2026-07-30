package p149l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class afd0 extends bfd0 {
    public afd0(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // p149l.bfd0
    /* JADX INFO: renamed from: c */
    public void mo96213c(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        m101530g();
        outline.setRoundRect(this.f75300h, m101527b());
    }
}
