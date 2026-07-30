package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class sou0 {

    /* JADX INFO: renamed from: a */
    public final bts0 f169922a;

    /* JADX INFO: renamed from: b */
    public final Clock f169923b;

    /* JADX INFO: renamed from: c */
    public final Executor f169924c;

    public sou0(bts0 bts0Var, Clock clock, Executor executor) {
        this.f169922a = bts0Var;
        this.f169923b = clock;
        this.f169924c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bitmap m187277a(double d, boolean z, vvr0 vvr0Var) {
        byte[] bArr = vvr0Var.f185980b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168312g6)).booleanValue()) {
            options.inJustDecodeBounds = true;
            m187279c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) jas0.m144075c().m176505a(sgs0.f168325h6)).intValue())) / 2);
            }
        }
        return m187279c(bArr, options);
    }

    /* JADX INFO: renamed from: b */
    public final hpr m187278b(String str, final double d, final boolean z) {
        return pvw0.m173986m(this.f169922a.m106382a(str), new eow0() { // from class: l.rou0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return this.f164247a.m187277a(d, z, (vvr0) obj);
            }
        }, this.f169924c);
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m187279c(byte[] bArr, BitmapFactory.Options options) {
        long jElapsedRealtime = this.f169923b.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = this.f169923b.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j = jElapsedRealtime2 - jElapsedRealtime;
            d2v0.m113737k("Decoded image w: " + bitmapDecodeByteArray.getWidth() + " h:" + bitmapDecodeByteArray.getHeight() + " bytes: " + bitmapDecodeByteArray.getAllocationByteCount() + " time: " + j + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
        }
        return bitmapDecodeByteArray;
    }
}
