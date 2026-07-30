package p149l;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class wyq0 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f188665a;

    /* JADX INFO: renamed from: b */
    public int f188666b;

    public wyq0(@Nullable wyq0 wyq0Var) {
        if (wyq0Var != null) {
            this.f188665a = wyq0Var.f188665a;
            this.f188666b = wyq0Var.f188666b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f188665a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new xyq0(this);
    }
}
