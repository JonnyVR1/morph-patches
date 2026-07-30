package p153l;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* JADX INFO: loaded from: classes8.dex */
public class ckq extends bkq {

    /* JADX INFO: renamed from: f */
    public int f82307f;

    public ckq(int i, int i2) {
        super(i, i2);
        this.f82307f = 0;
    }

    @Override // p153l.bkq, p153l.sq2
    /* JADX INFO: renamed from: e */
    public void mo104841e(Bitmap bitmap) {
        super.mo104841e(bitmap);
        if (this.f82307f != 0) {
            new Canvas(bitmap).drawColor(this.f82307f);
        }
    }

    /* JADX INFO: renamed from: g */
    public ckq m110381g(int i) {
        this.f82307f = i;
        return this;
    }
}
