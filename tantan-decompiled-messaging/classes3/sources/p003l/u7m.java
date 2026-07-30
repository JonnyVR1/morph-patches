package p003l;

import android.content.Context;
import android.graphics.RectF;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class u7m extends v7m {

    /* JADX INFO: renamed from: i */
    public RectF f7932i;

    public u7m(Context context) {
        super(context);
        m8101l();
    }

    /* JADX INFO: renamed from: l */
    private void m8101l() {
        this.f7932i = new RectF();
    }

    /* JADX INFO: renamed from: m */
    public void m8102m(float f, float f2, float f3, float f4) {
        this.f7932i.set(f, f2, f3, f4);
    }
}
