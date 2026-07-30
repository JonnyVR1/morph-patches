package p007l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import l.biq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ciq extends biq {

    /* JADX INFO: renamed from: f */
    public int f2471f;

    public ciq(int i, int i2) {
        super(i, i2);
        this.f2471f = 0;
    }

    /* JADX INFO: renamed from: e */
    public void m8783e(Bitmap bitmap) {
        super.e(bitmap);
        if (this.f2471f != 0) {
            new Canvas(bitmap).drawColor(this.f2471f);
        }
    }

    /* JADX INFO: renamed from: g */
    public ciq m8784g(int i) {
        this.f2471f = i;
        return this;
    }
}
