package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import com.clevertap.android.sdk.Constants;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JQ\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001d\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u001a\u0010%\u001a\u00020!8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, m88121d2 = {"Ll/zof0;", "Ll/wkm;", "", "resizingEnabled", "", "maxBitmapSize", "<init>", "(ZI)V", "Ll/n0f;", "encodedImage", "Ljava/io/OutputStream;", "outputStream", "Ll/qmd0;", "rotationOptions", "Ll/q3d0;", "resizeOptions", "Ll/him;", "outputFormat", "quality", "Landroid/graphics/ColorSpace;", "colorSpace", "Ll/vkm;", "a", "(Ll/n0f;Ljava/io/OutputStream;Ll/qmd0;Ll/q3d0;Ll/him;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)Ll/vkm;", "b", "(Ll/n0f;Ll/qmd0;Ll/q3d0;)Z", "imageFormat", "c", "(Ll/him;)Z", Constants.INAPP_DATA_TAG, "(Ll/n0f;Ll/qmd0;Ll/q3d0;)I", "Z", "I", "", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Companion", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class zof0 implements wkm {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean resizingEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int maxBitmapSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String identifier = "SimpleImageTranscoder";

    public zof0(boolean z, int i) {
        this.resizingEnabled = z;
        this.maxBitmapSize = i;
    }

    @Override // p153l.wkm
    @NotNull
    /* JADX INFO: renamed from: a */
    public vkm mo8514a(@NotNull n0f encodedImage, @NotNull OutputStream outputStream, @Nullable qmd0 rotationOptions, @Nullable q3d0 resizeOptions, @Nullable him outputFormat, @Nullable Integer quality, @Nullable ColorSpace colorSpace) throws Throwable {
        Bitmap bitmapCreateBitmap;
        encodedImage.getClass();
        outputStream.getClass();
        Integer num = quality == null ? 85 : quality;
        qmd0 qmd0VarM177105a = rotationOptions == null ? qmd0.INSTANCE.m177105a() : rotationOptions;
        int iM220762d = m220762d(encodedImage, qmd0VarM177105a, resizeOptions);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iM220762d;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.m160962H(), null, options);
            if (bitmapDecodeStream == null) {
                huf.m137180h("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new vkm(2);
            }
            Matrix matrixM207483g = wpq.m207483g(encodedImage, qmd0VarM177105a);
            if (matrixM207483g != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrixM207483g, false);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    huf.m137181i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    vkm vkmVar = new vkm(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return vkmVar;
                } catch (Throwable th) {
                    th = th;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } else {
                bitmapCreateBitmap = bitmapDecodeStream;
            }
            try {
                try {
                    bitmapCreateBitmap.compress(INSTANCE.m220764b(outputFormat), num.intValue(), outputStream);
                    vkm vkmVar2 = new vkm(iM220762d > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return vkmVar2;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    huf.m137181i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    vkm vkmVar3 = new vkm(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return vkmVar3;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e3) {
            huf.m137181i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new vkm(2);
        }
    }

    @Override // p153l.wkm
    /* JADX INFO: renamed from: b */
    public boolean mo8515b(@NotNull n0f encodedImage, @Nullable qmd0 rotationOptions, @Nullable q3d0 resizeOptions) {
        encodedImage.getClass();
        if (rotationOptions == null) {
            rotationOptions = qmd0.INSTANCE.m177105a();
        }
        return this.resizingEnabled && gae.m129692b(rotationOptions, resizeOptions, encodedImage, this.maxBitmapSize) > 1;
    }

    @Override // p153l.wkm
    /* JADX INFO: renamed from: c */
    public boolean mo8516c(@NotNull him imageFormat) {
        imageFormat.getClass();
        return imageFormat == ppd.HEIF || imageFormat == ppd.JPEG;
    }

    /* JADX INFO: renamed from: d */
    public final int m220762d(n0f encodedImage, qmd0 rotationOptions, q3d0 resizeOptions) {
        if (this.resizingEnabled) {
            return gae.m129692b(rotationOptions, resizeOptions, encodedImage, this.maxBitmapSize);
        }
        return 1;
    }

    @Override // p153l.wkm
    @NotNull
    public String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: l.zof0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/zof0$a;", "", "<init>", "()V", "Ll/him;", "format", "Landroid/graphics/Bitmap$CompressFormat;", "b", "(Ll/him;)Landroid/graphics/Bitmap$CompressFormat;", "", "TAG", "Ljava/lang/String;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final Bitmap.CompressFormat m220764b(him format) {
            if (format == null) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (format == ppd.JPEG) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (format == ppd.PNG) {
                return Bitmap.CompressFormat.PNG;
            }
            return ppd.m173188a(format) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
        }

        public Companion() {
        }
    }
}
