package p153l;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* JADX INFO: loaded from: classes.dex */
public class bkq extends sq2 {

    /* JADX INFO: renamed from: c */
    public final int f77109c;

    /* JADX INFO: renamed from: d */
    public final int f77110d;

    /* JADX INFO: renamed from: e */
    public by3 f77111e;

    public bkq(int i, int i2) {
        wn80.m207177b(Boolean.valueOf(i > 0));
        wn80.m207177b(Boolean.valueOf(i2 > 0));
        this.f77109c = i;
        this.f77110d = i2;
    }

    @Override // p153l.sq2, p153l.fm80
    /* JADX INFO: renamed from: a */
    public by3 mo104840a() {
        if (this.f77111e == null) {
            this.f77111e = new sof0(String.format(null, "i%dr%d", Integer.valueOf(this.f77109c), Integer.valueOf(this.f77110d)));
        }
        return this.f77111e;
    }

    @Override // p153l.sq2
    /* JADX INFO: renamed from: e */
    public void mo104841e(Bitmap bitmap) {
        NativeBlurFilter.m8511a(bitmap, this.f77109c, this.f77110d);
    }
}
