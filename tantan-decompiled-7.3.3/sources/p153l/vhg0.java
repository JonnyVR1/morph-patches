package p153l;

import android.graphics.drawable.Animatable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class vhg0 extends wqg0 {
    public vhg0(feg0 feg0Var, ImageView imageView, lxg0 lxg0Var, int i, String str) {
        super(feg0Var, imageView, lxg0Var, i, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.wqg0
    /* JADX INFO: renamed from: a */
    public final void mo201288a() {
        ImageView imageView = (ImageView) this.f190402c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
    }
}
