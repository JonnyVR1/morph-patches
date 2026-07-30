package p153l;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class tce extends blm<Drawable> {
    public tce(ImageView imageView) {
        super(imageView);
    }

    @Override // p153l.blm
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo104926p(@Nullable Drawable drawable) {
        ((ImageView) this.f137609b).setImageDrawable(drawable);
    }
}
