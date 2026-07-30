package p153l;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class blm<Z> extends mml0<ImageView, Z> implements zgj0.InterfaceC21804a {

    /* JADX INFO: renamed from: i */
    @Nullable
    private Animatable f77200i;

    public blm(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: renamed from: n */
    private void m104921n(@Nullable Z z) {
        if (!(z instanceof Animatable)) {
            this.f77200i = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f77200i = animatable;
        animatable.start();
    }

    /* JADX INFO: renamed from: q */
    private void m104922q(@Nullable Z z) {
        mo104926p(z);
        m104921n(z);
    }

    @Override // p153l.xr2, p153l.ier
    /* JADX INFO: renamed from: d */
    public void mo5633d() {
        Animatable animatable = this.f77200i;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p153l.mml0, p153l.xr2, p153l.cli0
    /* JADX INFO: renamed from: e */
    public void mo104923e(@Nullable Drawable drawable) {
        super.mo104923e(drawable);
        Animatable animatable = this.f77200i;
        if (animatable != null) {
            animatable.stop();
        }
        m104922q(null);
        m104925o(drawable);
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: i */
    public void mo104924i(@NonNull Z z, @Nullable zgj0<? super Z> zgj0Var) {
        if (zgj0Var == null || !zgj0Var.mo183056a(z, this)) {
            m104922q(z);
        } else {
            m104921n(z);
        }
    }

    @Override // p153l.mml0, p153l.xr2, p153l.cli0
    /* JADX INFO: renamed from: j */
    public void mo95329j(@Nullable Drawable drawable) {
        super.mo95329j(drawable);
        m104922q(null);
        m104925o(drawable);
    }

    @Override // p153l.xr2, p153l.cli0
    /* JADX INFO: renamed from: l */
    public void mo95331l(@Nullable Drawable drawable) {
        super.mo95331l(drawable);
        m104922q(null);
        m104925o(drawable);
    }

    /* JADX INFO: renamed from: o */
    public void m104925o(Drawable drawable) {
        ((ImageView) this.f137609b).setImageDrawable(drawable);
    }

    @Override // p153l.xr2, p153l.ier
    public void onStart() {
        Animatable animatable = this.f77200i;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo104926p(@Nullable Z z);
}
