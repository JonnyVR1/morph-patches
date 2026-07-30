package p149l;

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
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JQ\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001d\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u001a\u0010%\u001a\u00020!8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, m87232d2 = {"Ll/rgf0;", "Ll/tim;", "", "resizingEnabled", "", "maxBitmapSize", "<init>", "(ZI)V", "Ll/jze;", "encodedImage", "Ljava/io/OutputStream;", "outputStream", "Ll/oed0;", "rotationOptions", "Ll/nvc0;", "resizeOptions", "Ll/egm;", "outputFormat", "quality", "Landroid/graphics/ColorSpace;", "colorSpace", "Ll/sim;", "a", "(Ll/jze;Ljava/io/OutputStream;Ll/oed0;Ll/nvc0;Ll/egm;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)Ll/sim;", "b", "(Ll/jze;Ll/oed0;Ll/nvc0;)Z", "imageFormat", "c", "(Ll/egm;)Z", Constants.INAPP_DATA_TAG, "(Ll/jze;Ll/oed0;Ll/nvc0;)I", "Z", "I", "", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Companion", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class rgf0 implements tim {

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

    public rgf0(boolean z, int i) {
        this.resizingEnabled = z;
        this.maxBitmapSize = i;
    }

    @Override // p149l.tim
    @NotNull
    /* JADX INFO: renamed from: a */
    public sim mo8460a(@NotNull jze encodedImage, @NotNull OutputStream outputStream, @Nullable oed0 rotationOptions, @Nullable nvc0 resizeOptions, @Nullable egm outputFormat, @Nullable Integer quality, @Nullable ColorSpace colorSpace) throws Throwable {
        Bitmap bitmapCreateBitmap;
        encodedImage.getClass();
        outputStream.getClass();
        Integer num = quality == null ? 85 : quality;
        oed0 oed0VarM163947a = rotationOptions == null ? oed0.INSTANCE.m163947a() : rotationOptions;
        int iM179163d = m179163d(encodedImage, oed0VarM163947a, resizeOptions);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iM179163d;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.m143899H(), null, options);
            if (bitmapDecodeStream == null) {
                tsf.m190542h("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new sim(2);
            }
            Matrix matrixM210194g = xnq.m210194g(encodedImage, oed0VarM163947a);
            if (matrixM210194g != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrixM210194g, false);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    tsf.m190543i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    sim simVar = new sim(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return simVar;
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
                    bitmapCreateBitmap.compress(INSTANCE.m179165b(outputFormat), num.intValue(), outputStream);
                    sim simVar2 = new sim(iM179163d > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return simVar2;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    tsf.m190543i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    sim simVar3 = new sim(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return simVar3;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e3) {
            tsf.m190543i("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new sim(2);
        }
    }

    @Override // p149l.tim
    /* JADX INFO: renamed from: b */
    public boolean mo8461b(@NotNull jze encodedImage, @Nullable oed0 rotationOptions, @Nullable nvc0 resizeOptions) {
        encodedImage.getClass();
        if (rotationOptions == null) {
            rotationOptions = oed0.INSTANCE.m163947a();
        }
        return this.resizingEnabled && c9e.m105845b(rotationOptions, resizeOptions, encodedImage, this.maxBitmapSize) > 1;
    }

    @Override // p149l.tim
    /* JADX INFO: renamed from: c */
    public boolean mo8462c(@NotNull egm imageFormat) {
        imageFormat.getClass();
        return imageFormat == kod.HEIF || imageFormat == kod.JPEG;
    }

    /* JADX INFO: renamed from: d */
    public final int m179163d(jze encodedImage, oed0 rotationOptions, nvc0 resizeOptions) {
        if (this.resizingEnabled) {
            return c9e.m105845b(rotationOptions, resizeOptions, encodedImage, this.maxBitmapSize);
        }
        return 1;
    }

    @Override // p149l.tim
    @NotNull
    public String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: l.rgf0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/rgf0$a;", "", "<init>", "()V", "Ll/egm;", "format", "Landroid/graphics/Bitmap$CompressFormat;", "b", "(Ll/egm;)Landroid/graphics/Bitmap$CompressFormat;", "", "TAG", "Ljava/lang/String;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final Bitmap.CompressFormat m179165b(egm format) {
            if (format == null) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (format == kod.JPEG) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (format == kod.PNG) {
                return Bitmap.CompressFormat.PNG;
            }
            return kod.m146694a(format) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
        }

        public Companion() {
        }
    }
}
