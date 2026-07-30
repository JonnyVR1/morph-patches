package p149l;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class myb<T> implements cci0<T> {

    /* JADX INFO: renamed from: a */
    private final int f136271a;

    /* JADX INFO: renamed from: b */
    private final int f136272b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private ttc0 f136273c;

    public myb(int i, int i2) {
        if (!sck0.m183419s(i, i2)) {
            ckq0.m107426a("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", i, " and height: ", i2);
            throw null;
        }
        this.f136271a = i;
        this.f136272b = i2;
    }

    @Override // p149l.cci0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final ttc0 mo103909c() {
        return this.f136273c;
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: g */
    public final void mo103912g(@Nullable ttc0 ttc0Var) {
        this.f136273c = ttc0Var;
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: k */
    public final void mo103915k(@NonNull yif0 yif0Var) {
        yif0Var.mo5641d(this.f136271a, this.f136272b);
    }

    @Override // p149l.hcr
    /* JADX INFO: renamed from: d */
    public void mo5559d() {
    }

    @Override // p149l.hcr
    public void onDestroy() {
    }

    @Override // p149l.hcr
    public void onStart() {
    }

    public myb() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: a */
    public final void mo103907a(@NonNull yif0 yif0Var) {
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: j */
    public void mo103914j(@Nullable Drawable drawable) {
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: l */
    public void mo103916l(@Nullable Drawable drawable) {
    }
}
