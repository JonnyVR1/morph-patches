package p153l;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class wce<T extends Drawable> implements u3d0<T>, fum {

    /* JADX INFO: renamed from: a */
    protected final T f188469a;

    public wce(T t) {
        this.f188469a = (T) vn80.m201944d(t);
    }

    @Override // p153l.u3d0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f188469a.getConstantState();
        return constantState == null ? this.f188469a : (T) constantState.newDrawable();
    }

    public void initialize() {
        T t = this.f188469a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof bnj) {
            ((bnj) t).m105407e().prepareToDraw();
        }
    }
}
