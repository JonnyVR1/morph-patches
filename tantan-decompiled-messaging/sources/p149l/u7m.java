package p149l;

import android.content.Context;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u7m extends v7m {

    /* JADX INFO: renamed from: i */
    public RectF f175024i;

    public u7m(Context context) {
        super(context);
        m192143l();
    }

    /* JADX INFO: renamed from: l */
    private void m192143l() {
        this.f175024i = new RectF();
    }

    /* JADX INFO: renamed from: m */
    public void m192144m(float f, float f2, float f3, float f4) {
        this.f175024i.set(f, f2, f3, f4);
    }
}
