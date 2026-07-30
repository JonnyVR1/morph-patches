package p153l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class clm {
    @NonNull
    /* JADX INFO: renamed from: a */
    public <Z> mml0<ImageView, Z> m110669a(@NonNull ImageView imageView, @NonNull Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new k23(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new tce(imageView);
        }
        v1d0.m199002a("Unhandled class: ", cls, ", try .as*(Class).transcode(ResourceTranscoder)");
        return null;
    }
}
