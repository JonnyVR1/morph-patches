package com.immomo.moment.opengl;

import com.clevertap.android.sdk.Constants;
import java.nio.FloatBuffer;
import p153l.mce;
import p153l.z3k;

/* JADX INFO: loaded from: classes7.dex */
public class Drawable2d {

    /* JADX INFO: renamed from: h */
    private static final float[] f14326h;

    /* JADX INFO: renamed from: i */
    private static final float[] f14327i;

    /* JADX INFO: renamed from: j */
    private static final FloatBuffer f14328j;

    /* JADX INFO: renamed from: k */
    private static final FloatBuffer f14329k;

    /* JADX INFO: renamed from: l */
    private static final float[] f14330l;

    /* JADX INFO: renamed from: m */
    private static final float[] f14331m;

    /* JADX INFO: renamed from: n */
    private static final FloatBuffer f14332n;

    /* JADX INFO: renamed from: o */
    private static final FloatBuffer f14333o;

    /* JADX INFO: renamed from: p */
    private static final float[] f14334p;

    /* JADX INFO: renamed from: q */
    private static final float[] f14335q;

    /* JADX INFO: renamed from: r */
    private static final FloatBuffer f14336r;

    /* JADX INFO: renamed from: s */
    private static final FloatBuffer f14337s;

    /* JADX INFO: renamed from: a */
    private FloatBuffer f14338a;

    /* JADX INFO: renamed from: b */
    private FloatBuffer f14339b;

    /* JADX INFO: renamed from: c */
    private int f14340c;

    /* JADX INFO: renamed from: d */
    private int f14341d;

    /* JADX INFO: renamed from: e */
    private int f14342e;

    /* JADX INFO: renamed from: f */
    private int f14343f;

    /* JADX INFO: renamed from: g */
    private Prefab f14344g;

    public enum Prefab {
        TRIANGLE,
        RECTANGLE,
        FULL_RECTANGLE
    }

    /* JADX INFO: renamed from: com.immomo.moment.opengl.Drawable2d$a */
    public static /* synthetic */ class C4003a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14345a;

        static {
            int[] iArr = new int[Prefab.values().length];
            f14345a = iArr;
            try {
                iArr[Prefab.TRIANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14345a[Prefab.RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14345a[Prefab.FULL_RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        f14326h = fArr;
        float[] fArr2 = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f14327i = fArr2;
        f14328j = z3k.m218485c(fArr);
        f14329k = z3k.m218485c(fArr2);
        float[] fArr3 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        f14330l = fArr3;
        float[] fArr4 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        f14331m = fArr4;
        f14332n = z3k.m218485c(fArr3);
        f14333o = z3k.m218485c(fArr4);
        float[] fArr5 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f14334p = fArr5;
        float[] fArr6 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f14335q = fArr6;
        f14336r = z3k.m218485c(fArr5);
        f14337s = z3k.m218485c(fArr6);
    }

    public Drawable2d(Prefab prefab) {
        int i = C4003a.f14345a[prefab.ordinal()];
        if (i == 1) {
            this.f14338a = f14328j;
            this.f14339b = f14329k;
            this.f14341d = 2;
            this.f14342e = 2 * 4;
            this.f14340c = f14326h.length / 2;
        } else if (i == 2) {
            this.f14338a = f14332n;
            this.f14339b = f14333o;
            this.f14341d = 2;
            this.f14342e = 2 * 4;
            this.f14340c = f14330l.length / 2;
        } else {
            if (i != 3) {
                mce.m157919a("Unknown shape ", prefab);
                throw null;
            }
            this.f14338a = f14336r;
            this.f14339b = f14337s;
            this.f14341d = 2;
            this.f14342e = 2 * 4;
            this.f14340c = f14334p.length / 2;
        }
        this.f14343f = 8;
        this.f14344g = prefab;
    }

    public String toString() {
        if (this.f14344g == null) {
            return "[Drawable2d: ...]";
        }
        return "[Drawable2d: " + this.f14344g + Constants.AES_SUFFIX;
    }
}
