package p153l;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes12.dex */
public class nri extends Scroller {

    /* JADX INFO: renamed from: a */
    public int f143412a;

    public nri(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.f143412a = 400;
    }

    /* JADX INFO: renamed from: a */
    public void m164490a(int i) {
        this.f143412a = i;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.f143412a);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f143412a);
    }
}
