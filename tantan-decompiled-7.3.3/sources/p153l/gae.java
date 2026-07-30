package p153l;

import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSSizeType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/gae;", "", "<init>", "()V", "Ll/qmd0;", "rotationOptions", "Ll/q3d0;", "resizeOptions", "Ll/n0f;", "encodedImage", "", "maxBitmapDimension", "b", "(Ll/qmd0;Ll/q3d0;Ll/n0f;I)I", "pixelSize", "maxBitmapSizeInBytes", "c", "(Ll/n0f;II)I", "", "a", "(Ll/qmd0;Ll/q3d0;Ll/n0f;)F", OMSSizeType.ratio, "e", "(F)I", "f", Constants.INAPP_DATA_TAG, "(Ll/qmd0;Ll/n0f;)I", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class gae {

    @NotNull
    public static final gae INSTANCE = new gae();

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static final float m129691a(@NotNull qmd0 rotationOptions, @Nullable q3d0 resizeOptions, @NotNull n0f encodedImage) {
        rotationOptions.getClass();
        encodedImage.getClass();
        if (!n0f.m160956Z(encodedImage)) {
            wtq0.m207906a("Check failed.");
            return 0.0f;
        }
        if (resizeOptions == null || resizeOptions.height <= 0 || resizeOptions.width <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
            return 1.0f;
        }
        int iM129696d = INSTANCE.m129696d(rotationOptions, encodedImage);
        boolean z = iM129696d == 90 || iM129696d == 270;
        int height = z ? encodedImage.getHeight() : encodedImage.getWidth();
        int width = z ? encodedImage.getWidth() : encodedImage.getHeight();
        float f = resizeOptions.width / height;
        float f2 = resizeOptions.height / width;
        float fM88485a = C15274a.m88485a(f, f2);
        huf.m137192t("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(resizeOptions.width), Integer.valueOf(resizeOptions.height), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(fM88485a));
        return fM88485a;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m129692b(@NotNull qmd0 rotationOptions, @Nullable q3d0 resizeOptions, @NotNull n0f encodedImage, int maxBitmapDimension) {
        rotationOptions.getClass();
        encodedImage.getClass();
        if (!n0f.m160956Z(encodedImage)) {
            return 1;
        }
        float fM129691a = m129691a(rotationOptions, resizeOptions, encodedImage);
        int iM129695f = encodedImage.m160961F() == ppd.JPEG ? m129695f(fM129691a) : m129694e(fM129691a);
        int iMax = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        float f = resizeOptions != null ? resizeOptions.maxBitmapDimension : maxBitmapDimension;
        while (iMax / iM129695f > f) {
            iM129695f = encodedImage.m160961F() == ppd.JPEG ? iM129695f * 2 : iM129695f + 1;
        }
        return iM129695f;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final int m129693c(@NotNull n0f encodedImage, int pixelSize, int maxBitmapSizeInBytes) {
        encodedImage.getClass();
        int iM160964J = encodedImage.m160964J();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * pixelSize) / iM160964J) / iM160964J > maxBitmapSizeInBytes) {
            iM160964J *= 2;
        }
        return iM160964J;
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static final int m129694e(float ratio) {
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
    public static final int m129695f(float ratio) {
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
    public final int m129696d(qmd0 rotationOptions, n0f encodedImage) {
        if (!rotationOptions.m177104j()) {
            return 0;
        }
        int iM160970V = encodedImage.m160970V();
        if (iM160970V == 0 || iM160970V == 90 || iM160970V == 180 || iM160970V == 270) {
            return iM160970V;
        }
        wtq0.m207906a("Check failed.");
        return 0;
    }
}
