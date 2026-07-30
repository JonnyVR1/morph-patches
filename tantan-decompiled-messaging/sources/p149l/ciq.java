package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* JADX INFO: loaded from: classes8.dex */
public class ciq extends biq {

    /* JADX INFO: renamed from: f */
    public int f81106f;

    public ciq(int i, int i2) {
        super(i, i2);
        this.f81106f = 0;
    }

    @Override // p149l.biq, p149l.bq2
    /* JADX INFO: renamed from: e */
    public void mo102088e(Bitmap bitmap) {
        super.mo102088e(bitmap);
        if (this.f81106f != 0) {
            new Canvas(bitmap).drawColor(this.f81106f);
        }
    }

    /* JADX INFO: renamed from: g */
    public ciq m107094g(int i) {
        this.f81106f = i;
        return this;
    }
}
