package p149l;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class yim<Z> extends idl0<ImageView, Z> implements v7j0.InterfaceC20594a {

    /* JADX INFO: renamed from: i */
    @Nullable
    private Animatable f198519i;

    public yim(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: renamed from: n */
    private void m214971n(@Nullable Z z) {
        if (!(z instanceof Animatable)) {
            this.f198519i = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f198519i = animatable;
        animatable.start();
    }

    /* JADX INFO: renamed from: q */
    private void m214972q(@Nullable Z z) {
        mo168201p(z);
        m214971n(z);
    }

    @Override // p149l.hr2, p149l.hcr
    /* JADX INFO: renamed from: d */
    public void mo5559d() {
        Animatable animatable = this.f198519i;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p149l.idl0, p149l.hr2, p149l.cci0
    /* JADX INFO: renamed from: e */
    public void mo103910e(@Nullable Drawable drawable) {
        super.mo103910e(drawable);
        Animatable animatable = this.f198519i;
        if (animatable != null) {
            animatable.stop();
        }
        m214972q(null);
        m214973o(drawable);
    }

    @Override // p149l.cci0
    /* JADX INFO: renamed from: i */
    public void mo103913i(@NonNull Z z, @Nullable v7j0<? super Z> v7j0Var) {
        if (v7j0Var == null || !v7j0Var.mo112328a(z, this)) {
            m214972q(z);
        } else {
            m214971n(z);
        }
    }

    @Override // p149l.idl0, p149l.hr2, p149l.cci0
    /* JADX INFO: renamed from: j */
    public void mo103914j(@Nullable Drawable drawable) {
        super.mo103914j(drawable);
        m214972q(null);
        m214973o(drawable);
    }

    @Override // p149l.hr2, p149l.cci0
    /* JADX INFO: renamed from: l */
    public void mo103916l(@Nullable Drawable drawable) {
        super.mo103916l(drawable);
        m214972q(null);
        m214973o(drawable);
    }

    /* JADX INFO: renamed from: o */
    public void m214973o(Drawable drawable) {
        ((ImageView) this.f112653b).setImageDrawable(drawable);
    }

    @Override // p149l.hr2, p149l.hcr
    public void onStart() {
        Animatable animatable = this.f198519i;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo168201p(@Nullable Z z);
}
