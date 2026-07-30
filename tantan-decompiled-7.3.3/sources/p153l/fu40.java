package p153l;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class fu40 extends wce<Drawable> {
    private fu40(Drawable drawable) {
        super(drawable);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static u3d0<Drawable> m127434b(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new fu40(drawable);
        }
        return null;
    }

    @Override // p153l.u3d0
    @NonNull
    public Class<Drawable> getResourceClass() {
        return this.f188469a.getClass();
    }

    @Override // p153l.u3d0
    public int getSize() {
        return Math.max(1, this.f188469a.getIntrinsicWidth() * this.f188469a.getIntrinsicHeight() * 4);
    }

    @Override // p153l.u3d0
    public void recycle() {
    }
}
