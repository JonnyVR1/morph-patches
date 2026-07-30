package p149l;

import android.graphics.drawable.Animatable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class n9g0 extends oig0 {
    public n9g0(x5g0 x5g0Var, ImageView imageView, dpg0 dpg0Var, int i, String str) {
        super(x5g0Var, imageView, dpg0Var, i, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.oig0
    /* JADX INFO: renamed from: a */
    public final void mo158558a() {
        ImageView imageView = (ImageView) this.f144116c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
    }
}
