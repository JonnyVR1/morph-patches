package p153l;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class c8r0 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f80235a;

    /* JADX INFO: renamed from: b */
    public int f80236b;

    public c8r0(@Nullable c8r0 c8r0Var) {
        if (c8r0Var != null) {
            this.f80235a = c8r0Var.f80235a;
            this.f80236b = c8r0Var.f80236b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f80235a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new d8r0(this);
    }
}
