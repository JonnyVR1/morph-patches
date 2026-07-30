package p149l;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes9.dex */
public class roi extends Scroller {

    /* JADX INFO: renamed from: a */
    public int f160386a;

    public roi(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.f160386a = 400;
    }

    /* JADX INFO: renamed from: a */
    public void m180243a(int i) {
        this.f160386a = i;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.f160386a);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f160386a);
    }
}
