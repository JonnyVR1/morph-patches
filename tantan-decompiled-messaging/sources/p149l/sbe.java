package p149l;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class sbe<T extends Drawable> implements rvc0<T>, dsm {

    /* JADX INFO: renamed from: a */
    protected final T f163519a;

    public sbe(T t) {
        this.f163519a = (T) qf80.m174276d(t);
    }

    @Override // p149l.rvc0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f163519a.getConstantState();
        return constantState == null ? this.f163519a : (T) constantState.newDrawable();
    }

    public void initialize() {
        T t = this.f163519a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof lkj) {
            ((lkj) t).m150280e().prepareToDraw();
        }
    }
}
