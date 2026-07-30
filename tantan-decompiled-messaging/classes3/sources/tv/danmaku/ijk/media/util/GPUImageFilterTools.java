package tv.danmaku.ijk.media.util;

import android.content.Context;
import android.content.DialogInterface;
import java.util.LinkedList;
import java.util.List;
import l.qkq0;
import p003l.cn40;
import p003l.j3w;
import p003l.ts2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GPUImageFilterTools {

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.util.GPUImageFilterTools$1 */
    class DialogInterfaceOnClickListenerC13181 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ OnGpuImageFilterChosenListener f12520a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ FilterList f12521b;

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f12520a.m11336a(null, this.f12521b.m11335a(i));
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.util.GPUImageFilterTools$2 */
    public static /* synthetic */ class C13192 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f12522a;

        static {
            int[] iArr = new int[FilterType.values().length];
            f12522a = iArr;
            try {
                iArr[FilterType.LOOKUP_BEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12522a[FilterType.LOOKUP_HEART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12522a[FilterType.LOOKUP_HEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12522a[FilterType.LOOKUP_SHU.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12522a[FilterType.LOOKUP_SUMMER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12522a[FilterType.LOOKUP_TOKYO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12522a[FilterType.LOOKUP_WB.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12522a[FilterType.LOOKUP_CLARENDOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12522a[FilterType.LOOKUP_GINGHAM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12522a[FilterType.NORMAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12522a[FilterType.SKIN_EN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static class FilterList {

        /* JADX INFO: renamed from: a */
        public List<String> f12523a = new LinkedList();

        /* JADX INFO: renamed from: b */
        public List<FilterType> f12524b = new LinkedList();

        private FilterList() {
        }

        /* JADX INFO: renamed from: a */
        public FilterType m11335a(int i) {
            return this.f12524b.get(i);
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
        void m11336a(ts2 ts2Var, FilterType filterType);
    }

    /* JADX INFO: renamed from: a */
    public static ts2 m11334a(Context context, FilterType filterType, int i) {
        switch (C13192.f12522a[filterType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return new j3w(context, i);
            case 10:
                return new cn40();
            case 11:
                return new cn40();
            default:
                qkq0.a("No filter of that type!");
                return null;
        }
    }
}
