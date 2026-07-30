package p153l;

import android.content.Context;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kam extends lam {

    /* JADX INFO: renamed from: i */
    public RectF f124700i;

    public kam(Context context) {
        super(context);
        m148990l();
    }

    /* JADX INFO: renamed from: l */
    private void m148990l() {
        this.f124700i = new RectF();
    }

    /* JADX INFO: renamed from: m */
    public void m148991m(float f, float f2, float f3, float f4) {
        this.f124700i.set(f, f2, f3, f4);
    }
}
