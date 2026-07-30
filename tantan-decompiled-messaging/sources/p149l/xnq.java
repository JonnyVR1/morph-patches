package p149l;

import android.graphics.Matrix;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.internal.ImmutableList;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ1\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0015J)\u0010\u001a\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040+8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010,¨\u0006."}, m87232d2 = {"Ll/xnq;", "", "<init>", "()V", "", "degrees", "", "j", "(I)Z", "exifOrientation", RXScreenCaptureService.KEY_INDEX, "Ll/oed0;", "rotationOptions", "Ll/nvc0;", "resizeOptions", "Ll/jze;", "encodedImage", "resizingEnabled", "f", "(Ll/oed0;Ll/nvc0;Ll/jze;Z)I", "e", "(Ll/oed0;Ll/jze;)I", Constants.INAPP_DATA_TAG, "width", "height", "", "b", "(Ll/nvc0;II)F", "maxRatio", "roundUpFraction", "k", "(FF)I", "downsampleRatio", "a", "(I)I", "Landroid/graphics/Matrix;", "g", "(Ll/jze;Ll/oed0;)Landroid/graphics/Matrix;", Constants.KEY_ORIENTATION, "h", "(I)Landroid/graphics/Matrix;", "c", "(Ll/jze;)I", "Lcom/facebook/common/internal/ImmutableList;", "Lcom/facebook/common/internal/ImmutableList;", "INVERTED_EXIF_ORIENTATIONS", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class xnq {

    @NotNull
    public static final xnq INSTANCE = new xnq();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final ImmutableList<Integer> INVERTED_EXIF_ORIENTATIONS;

    static {
        ImmutableList<Integer> immutableListM8146of = ImmutableList.m8146of((Object[]) new Integer[]{2, 7, 4, 5});
        immutableListM8146of.getClass();
        INVERTED_EXIF_ORIENTATIONS = immutableListM8146of;
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static final int m210189a(int downsampleRatio) {
        return Math.max(1, 8 / downsampleRatio);
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static final float m210190b(@Nullable nvc0 resizeOptions, int width, int height) {
        if (resizeOptions == null) {
            return 1.0f;
        }
        float f = width;
        float f2 = height;
        float fMax = Math.max(resizeOptions.width / f, resizeOptions.height / f2);
        float f3 = f * fMax;
        float f4 = resizeOptions.maxBitmapDimension;
        if (f3 > f4) {
            fMax = f4 / f;
        }
        return f2 * fMax > f4 ? f4 / f2 : fMax;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final int m210191d(@NotNull oed0 rotationOptions, @NotNull jze encodedImage) {
        rotationOptions.getClass();
        encodedImage.getClass();
        int iM143926x = encodedImage.m143926x();
        ImmutableList<Integer> immutableList = INVERTED_EXIF_ORIENTATIONS;
        int iIndexOf = immutableList.indexOf(Integer.valueOf(iM143926x));
        if (iIndexOf < 0) {
            ig3.m135964a("Only accepts inverted exif orientations");
            return 0;
        }
        Integer num = immutableList.get((iIndexOf + ((rotationOptions.m163946j() ? 0 : rotationOptions.m163944h()) / 90)) % immutableList.size());
        num.getClass();
        return num.intValue();
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final int m210192e(@NotNull oed0 rotationOptions, @NotNull jze encodedImage) {
        rotationOptions.getClass();
        encodedImage.getClass();
        if (!rotationOptions.m163945i()) {
            return 0;
        }
        int iM210198c = INSTANCE.m210198c(encodedImage);
        return rotationOptions.m163946j() ? iM210198c : (iM210198c + rotationOptions.m163944h()) % 360;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final int m210193f(@NotNull oed0 rotationOptions, @Nullable nvc0 resizeOptions, @NotNull jze encodedImage, boolean resizingEnabled) {
        rotationOptions.getClass();
        encodedImage.getClass();
        if (!resizingEnabled || resizeOptions == null) {
            return 8;
        }
        int iM210192e = m210192e(rotationOptions, encodedImage);
        int iM210191d = INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.m143926x())) ? m210191d(rotationOptions, encodedImage) : 0;
        boolean z = iM210192e == 90 || iM210192e == 270 || iM210191d == 5 || iM210191d == 7;
        int iM210197k = m210197k(m210190b(resizeOptions, z ? encodedImage.getHeight() : encodedImage.getWidth(), z ? encodedImage.getWidth() : encodedImage.getHeight()), resizeOptions.roundUpFraction);
        if (iM210197k > 8) {
            return 8;
        }
        if (iM210197k < 1) {
            return 1;
        }
        return iM210197k;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Matrix m210194g(@NotNull jze encodedImage, @NotNull oed0 rotationOptions) {
        encodedImage.getClass();
        rotationOptions.getClass();
        if (INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.m143926x()))) {
            return INSTANCE.m210199h(m210191d(rotationOptions, encodedImage));
        }
        int iM210192e = m210192e(rotationOptions, encodedImage);
        if (iM210192e == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iM210192e);
        return matrix;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m210195i(int exifOrientation) {
        switch (exifOrientation) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final boolean m210196j(int degrees) {
        return degrees >= 0 && degrees <= 270 && degrees % 90 == 0;
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public static final int m210197k(float maxRatio, float roundUpFraction) {
        return (int) (roundUpFraction + (maxRatio * 8.0f));
    }

    /* JADX INFO: renamed from: c */
    public final int m210198c(jze encodedImage) {
        int iM143907U = encodedImage.m143907U();
        if (iM143907U == 90 || iM143907U == 180 || iM143907U == 270) {
            return encodedImage.m143907U();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final Matrix m210199h(int orientation) {
        Matrix matrix = new Matrix();
        if (orientation == 2) {
            matrix.setScale(-1.0f, 1.0f);
            return matrix;
        }
        if (orientation == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (orientation == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (orientation != 5) {
            return null;
        }
        matrix.setRotate(90.0f);
        matrix.postScale(-1.0f, 1.0f);
        return matrix;
    }
}
