package p149l;

import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSSizeType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/c9e;", "", "<init>", "()V", "Ll/oed0;", "rotationOptions", "Ll/nvc0;", "resizeOptions", "Ll/jze;", "encodedImage", "", "maxBitmapDimension", "b", "(Ll/oed0;Ll/nvc0;Ll/jze;I)I", "pixelSize", "maxBitmapSizeInBytes", "c", "(Ll/jze;II)I", "", "a", "(Ll/oed0;Ll/nvc0;Ll/jze;)F", OMSSizeType.ratio, "e", "(F)I", "f", Constants.INAPP_DATA_TAG, "(Ll/oed0;Ll/jze;)I", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class c9e {

    @NotNull
    public static final c9e INSTANCE = new c9e();

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static final float m105844a(@NotNull oed0 rotationOptions, @Nullable nvc0 resizeOptions, @NotNull jze encodedImage) {
        rotationOptions.getClass();
        encodedImage.getClass();
        if (!jze.m143893Y(encodedImage)) {
            qkq0.m175383a("Check failed.");
            return 0.0f;
        }
        if (resizeOptions == null || resizeOptions.height <= 0 || resizeOptions.width <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
            return 1.0f;
        }
        int iM105849d = INSTANCE.m105849d(rotationOptions, encodedImage);
        boolean z = iM105849d == 90 || iM105849d == 270;
        int height = z ? encodedImage.getHeight() : encodedImage.getWidth();
        int width = z ? encodedImage.getWidth() : encodedImage.getHeight();
        float f = resizeOptions.width / height;
        float f2 = resizeOptions.height / width;
        float fM87595a = C15167a.m87595a(f, f2);
        tsf.m190554t("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(resizeOptions.width), Integer.valueOf(resizeOptions.height), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(fM87595a));
        return fM87595a;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m105845b(@NotNull oed0 rotationOptions, @Nullable nvc0 resizeOptions, @NotNull jze encodedImage, int maxBitmapDimension) {
        rotationOptions.getClass();
        encodedImage.getClass();
        if (!jze.m143893Y(encodedImage)) {
            return 1;
        }
        float fM105844a = m105844a(rotationOptions, resizeOptions, encodedImage);
        int iM105848f = encodedImage.m143898F() == kod.JPEG ? m105848f(fM105844a) : m105847e(fM105844a);
        int iMax = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        float f = resizeOptions != null ? resizeOptions.maxBitmapDimension : maxBitmapDimension;
        while (iMax / iM105848f > f) {
            iM105848f = encodedImage.m143898F() == kod.JPEG ? iM105848f * 2 : iM105848f + 1;
        }
        return iM105848f;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final int m105846c(@NotNull jze encodedImage, int pixelSize, int maxBitmapSizeInBytes) {
        encodedImage.getClass();
        int iM143901J = encodedImage.m143901J();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * pixelSize) / iM143901J) / iM143901J > maxBitmapSizeInBytes) {
            iM143901J *= 2;
        }
        return iM143901J;
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static final int m105847e(float ratio) {
        if (ratio > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = i;
            if ((1.0d / d) + ((1.0d / (Math.pow(d, 2.0d) - d)) * 0.3333333432674408d) <= ratio) {
                return i - 1;
            }
            i++;
        }
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static final int m105848f(float ratio) {
        if (ratio > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = 1.0d / ((double) i2);
            if (d + (0.3333333432674408d * d) <= ratio) {
                return i;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m105849d(oed0 rotationOptions, jze encodedImage) {
        if (!rotationOptions.m163946j()) {
            return 0;
        }
        int iM143907U = encodedImage.m143907U();
        if (iM143907U == 0 || iM143907U == 90 || iM143907U == 180 || iM143907U == 270) {
            return iM143907U;
        }
        qkq0.m175383a("Check failed.");
        return 0;
    }
}
