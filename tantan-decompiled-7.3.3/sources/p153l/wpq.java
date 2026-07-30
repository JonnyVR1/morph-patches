package p153l;

import android.graphics.Matrix;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.internal.ImmutableList;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ1\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0015J)\u0010\u001a\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040+8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010,¨\u0006."}, m88121d2 = {"Ll/wpq;", "", "<init>", "()V", "", "degrees", "", "j", "(I)Z", "exifOrientation", RXScreenCaptureService.KEY_INDEX, "Ll/qmd0;", "rotationOptions", "Ll/q3d0;", "resizeOptions", "Ll/n0f;", "encodedImage", "resizingEnabled", "f", "(Ll/qmd0;Ll/q3d0;Ll/n0f;Z)I", "e", "(Ll/qmd0;Ll/n0f;)I", Constants.INAPP_DATA_TAG, "width", "height", "", "b", "(Ll/q3d0;II)F", "maxRatio", "roundUpFraction", "k", "(FF)I", "downsampleRatio", "a", "(I)I", "Landroid/graphics/Matrix;", "g", "(Ll/n0f;Ll/qmd0;)Landroid/graphics/Matrix;", Constants.KEY_ORIENTATION, "h", "(I)Landroid/graphics/Matrix;", "c", "(Ll/n0f;)I", "Lcom/facebook/common/internal/ImmutableList;", "Lcom/facebook/common/internal/ImmutableList;", "INVERTED_EXIF_ORIENTATIONS", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class wpq {

    @NotNull
    public static final wpq INSTANCE = new wpq();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final ImmutableList<Integer> INVERTED_EXIF_ORIENTATIONS;

    static {
        ImmutableList<Integer> immutableListM8200of = ImmutableList.m8200of((Object[]) new Integer[]{2, 7, 4, 5});
        immutableListM8200of.getClass();
        INVERTED_EXIF_ORIENTATIONS = immutableListM8200of;
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static final int m207478a(int downsampleRatio) {
        return Math.max(1, 8 / downsampleRatio);
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static final float m207479b(@Nullable q3d0 resizeOptions, int width, int height) {
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
    public static final int m207480d(@NotNull qmd0 rotationOptions, @NotNull n0f encodedImage) {
        rotationOptions.getClass();
        encodedImage.getClass();
        int iM160989x = encodedImage.m160989x();
        ImmutableList<Integer> immutableList = INVERTED_EXIF_ORIENTATIONS;
        int iIndexOf = immutableList.indexOf(Integer.valueOf(iM160989x));
        if (iIndexOf < 0) {
            wg3.m206174a("Only accepts inverted exif orientations");
            return 0;
        }
        Integer num = immutableList.get((iIndexOf + ((rotationOptions.m177104j() ? 0 : rotationOptions.m177102h()) / 90)) % immutableList.size());
        num.getClass();
        return num.intValue();
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final int m207481e(@NotNull qmd0 rotationOptions, @NotNull n0f encodedImage) {
        rotationOptions.getClass();
        encodedImage.getClass();
        if (!rotationOptions.m177103i()) {
            return 0;
        }
        int iM207487c = INSTANCE.m207487c(encodedImage);
        return rotationOptions.m177104j() ? iM207487c : (iM207487c + rotationOptions.m177102h()) % 360;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final int m207482f(@NotNull qmd0 rotationOptions, @Nullable q3d0 resizeOptions, @NotNull n0f encodedImage, boolean resizingEnabled) {
        rotationOptions.getClass();
        encodedImage.getClass();
        if (!resizingEnabled || resizeOptions == null) {
            return 8;
        }
        int iM207481e = m207481e(rotationOptions, encodedImage);
        int iM207480d = INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.m160989x())) ? m207480d(rotationOptions, encodedImage) : 0;
        boolean z = iM207481e == 90 || iM207481e == 270 || iM207480d == 5 || iM207480d == 7;
        int iM207486k = m207486k(m207479b(resizeOptions, z ? encodedImage.getHeight() : encodedImage.getWidth(), z ? encodedImage.getWidth() : encodedImage.getHeight()), resizeOptions.roundUpFraction);
        if (iM207486k > 8) {
            return 8;
        }
        if (iM207486k < 1) {
            return 1;
        }
        return iM207486k;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Matrix m207483g(@NotNull n0f encodedImage, @NotNull qmd0 rotationOptions) {
        encodedImage.getClass();
        rotationOptions.getClass();
        if (INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.m160989x()))) {
            return INSTANCE.m207488h(m207480d(rotationOptions, encodedImage));
        }
        int iM207481e = m207481e(rotationOptions, encodedImage);
        if (iM207481e == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iM207481e);
        return matrix;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m207484i(int exifOrientation) {
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
    public static final boolean m207485j(int degrees) {
        return degrees >= 0 && degrees <= 270 && degrees % 90 == 0;
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public static final int m207486k(float maxRatio, float roundUpFraction) {
        return (int) (roundUpFraction + (maxRatio * 8.0f));
    }

    /* JADX INFO: renamed from: c */
    public final int m207487c(n0f encodedImage) {
        int iM160970V = encodedImage.m160970V();
        if (iM160970V == 90 || iM160970V == 180 || iM160970V == 270) {
            return encodedImage.m160970V();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final Matrix m207488h(int orientation) {
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
