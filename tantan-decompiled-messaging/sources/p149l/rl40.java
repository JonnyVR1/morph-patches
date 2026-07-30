package p149l;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class rl40 extends sbe<Drawable> {
    private rl40(Drawable drawable) {
        super(drawable);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static rvc0<Drawable> m179779b(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new rl40(drawable);
        }
        return null;
    }

    @Override // p149l.rvc0
    @NonNull
    public Class<Drawable> getResourceClass() {
        return this.f163519a.getClass();
    }

    @Override // p149l.rvc0
    public int getSize() {
        return Math.max(1, this.f163519a.getIntrinsicWidth() * this.f163519a.getIntrinsicHeight() * 4);
    }

    @Override // p149l.rvc0
    public void recycle() {
    }
}
