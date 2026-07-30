package p149l;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* JADX INFO: loaded from: classes.dex */
public class biq extends bq2 {

    /* JADX INFO: renamed from: c */
    public final int f75791c;

    /* JADX INFO: renamed from: d */
    public final int f75792d;

    /* JADX INFO: renamed from: e */
    public cx3 f75793e;

    public biq(int i, int i2) {
        rf80.m179111b(Boolean.valueOf(i > 0));
        rf80.m179111b(Boolean.valueOf(i2 > 0));
        this.f75791c = i;
        this.f75792d = i2;
    }

    @Override // p149l.bq2, p149l.yd80
    /* JADX INFO: renamed from: a */
    public cx3 mo102087a() {
        if (this.f75793e == null) {
            this.f75793e = new lgf0(String.format(null, "i%dr%d", Integer.valueOf(this.f75791c), Integer.valueOf(this.f75792d)));
        }
        return this.f75793e;
    }

    @Override // p149l.bq2
    /* JADX INFO: renamed from: e */
    public void mo102088e(Bitmap bitmap) {
        NativeBlurFilter.m8457a(bitmap, this.f75791c, this.f75792d);
    }
}
