package p149l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class zim {
    @NonNull
    /* JADX INFO: renamed from: a */
    public <Z> idl0<ImageView, Z> m219049a(@NonNull ImageView imageView, @NonNull Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new u13(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new pbe(imageView);
        }
        qtc0.m176411a("Unhandled class: ", cls, ", try .as*(Class).transcode(ResourceTranscoder)");
        return null;
    }
}
