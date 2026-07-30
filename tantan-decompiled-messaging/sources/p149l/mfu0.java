package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class mfu0 {

    /* JADX INFO: renamed from: a */
    public final vjs0 f133623a;

    /* JADX INFO: renamed from: b */
    public final Clock f133624b;

    /* JADX INFO: renamed from: c */
    public final Executor f133625c;

    public mfu0(vjs0 vjs0Var, Clock clock, Executor executor) {
        this.f133623a = vjs0Var;
        this.f133624b = clock;
        this.f133625c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bitmap m154465a(double d, boolean z, pmr0 pmr0Var) {
        byte[] bArr = pmr0Var.f150285b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132241g6)).booleanValue()) {
            options.inJustDecodeBounds = true;
            m154467c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) d1s0.m109677c().m144697a(m7s0.f132254h6)).intValue())) / 2);
            }
        }
        return m154467c(bArr, options);
    }

    /* JADX INFO: renamed from: b */
    public final gnr m154466b(String str, final double d, final boolean z) {
        return jmw0.m142240m(this.f133623a.m198685a(str), new yew0() { // from class: l.lfu0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return this.f127932a.m154465a(d, z, (pmr0) obj);
            }
        }, this.f133625c);
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m154467c(byte[] bArr, BitmapFactory.Options options) {
        long jElapsedRealtime = this.f133624b.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = this.f133624b.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j = jElapsedRealtime2 - jElapsedRealtime;
            xsu0.m210834k("Decoded image w: " + bitmapDecodeByteArray.getWidth() + " h:" + bitmapDecodeByteArray.getHeight() + " bytes: " + bitmapDecodeByteArray.getAllocationByteCount() + " time: " + j + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
        }
        return bitmapDecodeByteArray;
    }
}
