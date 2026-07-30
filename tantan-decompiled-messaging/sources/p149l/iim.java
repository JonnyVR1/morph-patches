package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.android.volley.C0918d;
import com.android.volley.C0919e;
import com.android.volley.ParseError;
import com.android.volley.Request;

/* JADX INFO: loaded from: classes.dex */
public class iim extends Request<Bitmap> {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object sDecodeLock = new Object();
    private final Bitmap.Config mDecodeConfig;

    @Nullable
    @GuardedBy("mLock")
    private C0918d.b<Bitmap> mListener;
    private final Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final ImageView.ScaleType mScaleType;

    public iim(String str, C0918d.b<Bitmap> bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, @Nullable C0918d.a aVar) {
        super(0, str, aVar);
        this.mLock = new Object();
        setRetryPolicy(new gqd(1000, 2, 2.0f));
        this.mListener = bVar;
        this.mDecodeConfig = config;
        this.mMaxWidth = i;
        this.mMaxHeight = i2;
        this.mScaleType = scaleType;
    }

    private C0918d<Bitmap> doParse(sc20 sc20Var) {
        Bitmap bitmapCreateScaledBitmap;
        byte[] bArr = sc20Var.f163699b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            bitmapCreateScaledBitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int resizedDimension = getResizedDimension(this.mMaxWidth, this.mMaxHeight, i, i2, this.mScaleType);
            int resizedDimension2 = getResizedDimension(this.mMaxHeight, this.mMaxWidth, i2, i, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i, i2, resizedDimension, resizedDimension2);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray == null || (bitmapDecodeByteArray.getWidth() <= resizedDimension && bitmapDecodeByteArray.getHeight() <= resizedDimension2)) {
                bitmapCreateScaledBitmap = bitmapDecodeByteArray;
            } else {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, resizedDimension, resizedDimension2, true);
                bitmapDecodeByteArray.recycle();
            }
        }
        return bitmapCreateScaledBitmap == null ? C0918d.m5095a(new ParseError(sc20Var)) : C0918d.m5096c(bitmapCreateScaledBitmap, jkl.m141888e(sc20Var));
    }

    @VisibleForTesting
    public static int findBestSampleSize(int i, int i2, int i3, int i4) {
        double dMin = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > dMin) {
                return (int) f;
            }
            f = f2;
        }
    }

    private static int getResizedDimension(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i != 0 || i2 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i == 0) {
                    return (int) (((double) i3) * (((double) i2) / ((double) i4)));
                }
                if (i2 == 0) {
                    return i;
                }
                double d = ((double) i4) / ((double) i3);
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d2 = i2;
                    return ((double) i) * d < d2 ? (int) (d2 / d) : i;
                }
                double d3 = i2;
                return ((double) i) * d > d3 ? (int) (d3 / d) : i;
            }
            if (i != 0) {
                return i;
            }
        }
        return i3;
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.Request
    public void deliverResponse(Bitmap bitmap) {
        C0918d.b<Bitmap> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(bitmap);
        }
    }

    @Override // com.android.volley.Request
    public Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    @Override // com.android.volley.Request
    public C0918d<Bitmap> parseNetworkResponse(sc20 sc20Var) {
        C0918d<Bitmap> c0918dDoParse;
        synchronized (sDecodeLock) {
            try {
                try {
                    c0918dDoParse = doParse(sc20Var);
                } catch (OutOfMemoryError e) {
                    C0919e.m5100c("Caught OOM for %d byte image, url=%s", Integer.valueOf(sc20Var.f163699b.length), getUrl());
                    return C0918d.m5095a(new ParseError(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0918dDoParse;
    }

    @Deprecated
    public iim(String str, C0918d.b<Bitmap> bVar, int i, int i2, Bitmap.Config config, C0918d.a aVar) {
        this(str, bVar, i, i2, ImageView.ScaleType.CENTER_INSIDE, config, aVar);
    }
}
