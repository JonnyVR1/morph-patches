package p149l;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class pbe extends yim<Drawable> {
    public pbe(ImageView imageView) {
        super(imageView);
    }

    @Override // p149l.yim
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo168201p(@Nullable Drawable drawable) {
        ((ImageView) this.f112653b).setImageDrawable(drawable);
    }
}
