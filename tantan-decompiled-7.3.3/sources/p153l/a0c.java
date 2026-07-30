package p153l;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0c<T> implements cli0<T> {

    /* JADX INFO: renamed from: a */
    private final int f67698a;

    /* JADX INFO: renamed from: b */
    private final int f67699b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private y1d0 f67700c;

    public a0c(int i, int i2) {
        if (!ylk0.m216597u(i, i2)) {
            itq0.m142074a("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", i, " and height: ", i2);
            throw null;
        }
        this.f67698a = i;
        this.f67699b = i2;
    }

    @Override // p153l.cli0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final y1d0 mo95327c() {
        return this.f67700c;
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: g */
    public final void mo95328g(@Nullable y1d0 y1d0Var) {
        this.f67700c = y1d0Var;
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: k */
    public final void mo95330k(@NonNull hrf0 hrf0Var) {
        hrf0Var.mo5695d(this.f67698a, this.f67699b);
    }

    @Override // p153l.ier
    /* JADX INFO: renamed from: d */
    public void mo5633d() {
    }

    @Override // p153l.ier
    public void onDestroy() {
    }

    @Override // p153l.ier
    public void onStart() {
    }

    public a0c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: a */
    public final void mo95326a(@NonNull hrf0 hrf0Var) {
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: j */
    public void mo95329j(@Nullable Drawable drawable) {
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: l */
    public void mo95331l(@Nullable Drawable drawable) {
    }
}
