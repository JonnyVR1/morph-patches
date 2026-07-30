package tv.danmaku.ijk.media.util;

import android.content.Context;
import android.content.DialogInterface;
import java.util.LinkedList;
import java.util.List;
import p153l.h5w;
import p153l.jt2;
import p153l.qv40;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class GPUImageFilterTools {

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.util.GPUImageFilterTools$1 */
    class DialogInterfaceOnClickListenerC226401 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ OnGpuImageFilterChosenListener f209817a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ FilterList f209818b;

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f209817a.m224111a(null, this.f209818b.m224110a(i));
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.util.GPUImageFilterTools$2 */
    public static /* synthetic */ class C226412 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f209819a;

        static {
            int[] iArr = new int[FilterType.values().length];
            f209819a = iArr;
            try {
                iArr[FilterType.LOOKUP_BEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f209819a[FilterType.LOOKUP_HEART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f209819a[FilterType.LOOKUP_HEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f209819a[FilterType.LOOKUP_SHU.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f209819a[FilterType.LOOKUP_SUMMER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f209819a[FilterType.LOOKUP_TOKYO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f209819a[FilterType.LOOKUP_WB.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f209819a[FilterType.LOOKUP_CLARENDOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f209819a[FilterType.LOOKUP_GINGHAM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f209819a[FilterType.NORMAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f209819a[FilterType.SKIN_EN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static class FilterList {

        /* JADX INFO: renamed from: a */
        public List<String> f209820a = new LinkedList();

        /* JADX INFO: renamed from: b */
        public List<FilterType> f209821b = new LinkedList();

        private FilterList() {
        }

        /* JADX INFO: renamed from: a */
        public FilterType m224110a(int i) {
            return this.f209821b.get(i);
        }
    }

    public enum FilterType {
        NORMAL,
        LOOKUP_BEST,
        LOOKUP_HEART,
        LOOKUP_HEY,
        LOOKUP_SHU,
        LOOKUP_SUMMER,
        LOOKUP_TOKYO,
        LOOKUP_WB,
        LOOKUP_CLARENDOR,
        LOOKUP_GINGHAM,
        SKIN_EN,
        CONTRAST,
        GRAYSCALE,
        SHARPEN,
        SEPIA,
        SOBEL_EDGE_DETECTION,
        THREE_X_THREE_CONVOLUTION,
        FILTER_GROUP,
        EMBOSS,
        POSTERIZE,
        GAMMA,
        BRIGHTNESS,
        INVERT,
        HUE,
        PIXELATION,
        SATURATION,
        EXPOSURE,
        HIGHLIGHT_SHADOW,
        MONOCHROME,
        OPACITY,
        RGB,
        WHITE_BALANCE,
        VIGNETTE,
        TONE_CURVE,
        BLEND_COLOR_BURN,
        BLEND_COLOR_DODGE,
        BLEND_DARKEN,
        BLEND_DIFFERENCE,
        BLEND_DISSOLVE,
        BLEND_EXCLUSION,
        BLEND_SOURCE_OVER,
        BLEND_HARD_LIGHT,
        BLEND_LIGHTEN,
        BLEND_ADD,
        BLEND_DIVIDE,
        BLEND_MULTIPLY,
        BLEND_OVERLAY,
        BLEND_SCREEN,
        BLEND_ALPHA,
        BLEND_COLOR,
        BLEND_HUE,
        BLEND_SATURATION,
        BLEND_LUMINOSITY,
        BLEND_LINEAR_BURN,
        BLEND_SOFT_LIGHT,
        BLEND_SUBTRACT,
        BLEND_CHROMA_KEY,
        BLEND_NORMAL,
        LOOKUP_AMATORKA,
        GAUSSIAN_BLUR,
        CROSSHATCH,
        BOX_BLUR,
        CGA_COLORSPACE,
        DILATION,
        KUWAHARA,
        RGB_DILATION,
        SKETCH,
        TOON,
        SMOOTH_TOON,
        BULGE_DISTORTION,
        GLASS_SPHERE,
        HAZE,
        LAPLACIAN,
        NON_MAXIMUM_SUPPRESSION,
        SPHERE_REFRACTION,
        SWIRL,
        WEAK_PIXEL_INCLUSION,
        FALSE_COLOR,
        COLOR_BALANCE,
        LEVELS_FILTER_MIN
    }

    public interface OnGpuImageFilterChosenListener {
        /* JADX INFO: renamed from: a */
        void m224111a(jt2 jt2Var, FilterType filterType);
    }

    /* JADX INFO: renamed from: a */
    public static jt2 m224109a(Context context, FilterType filterType, int i) {
        switch (C226412.f209819a[filterType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return new h5w(context, i);
            case 10:
                return new qv40();
            case 11:
                return new qv40();
            default:
                wtq0.m207906a("No filter of that type!");
                return null;
        }
    }
}
