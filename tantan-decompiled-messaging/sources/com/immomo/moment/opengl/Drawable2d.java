package com.immomo.moment.opengl;

import com.clevertap.android.sdk.Constants;
import java.nio.FloatBuffer;
import p149l.ibe;
import p149l.j1k;

/* JADX INFO: loaded from: classes7.dex */
public class Drawable2d {

    /* JADX INFO: renamed from: h */
    private static final float[] f13632h;

    /* JADX INFO: renamed from: i */
    private static final float[] f13633i;

    /* JADX INFO: renamed from: j */
    private static final FloatBuffer f13634j;

    /* JADX INFO: renamed from: k */
    private static final FloatBuffer f13635k;

    /* JADX INFO: renamed from: l */
    private static final float[] f13636l;

    /* JADX INFO: renamed from: m */
    private static final float[] f13637m;

    /* JADX INFO: renamed from: n */
    private static final FloatBuffer f13638n;

    /* JADX INFO: renamed from: o */
    private static final FloatBuffer f13639o;

    /* JADX INFO: renamed from: p */
    private static final float[] f13640p;

    /* JADX INFO: renamed from: q */
    private static final float[] f13641q;

    /* JADX INFO: renamed from: r */
    private static final FloatBuffer f13642r;

    /* JADX INFO: renamed from: s */
    private static final FloatBuffer f13643s;

    /* JADX INFO: renamed from: a */
    private FloatBuffer f13644a;

    /* JADX INFO: renamed from: b */
    private FloatBuffer f13645b;

    /* JADX INFO: renamed from: c */
    private int f13646c;

    /* JADX INFO: renamed from: d */
    private int f13647d;

    /* JADX INFO: renamed from: e */
    private int f13648e;

    /* JADX INFO: renamed from: f */
    private int f13649f;

    /* JADX INFO: renamed from: g */
    private Prefab f13650g;

    public enum Prefab {
        TRIANGLE,
        RECTANGLE,
        FULL_RECTANGLE
    }

    /* JADX INFO: renamed from: com.immomo.moment.opengl.Drawable2d$a */
    public static /* synthetic */ class C3860a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13651a;

        static {
            int[] iArr = new int[Prefab.values().length];
            f13651a = iArr;
            try {
                iArr[Prefab.TRIANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13651a[Prefab.RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13651a[Prefab.FULL_RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        f13632h = fArr;
        float[] fArr2 = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f13633i = fArr2;
        f13634j = j1k.m139326c(fArr);
        f13635k = j1k.m139326c(fArr2);
        float[] fArr3 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        f13636l = fArr3;
        float[] fArr4 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        f13637m = fArr4;
        f13638n = j1k.m139326c(fArr3);
        f13639o = j1k.m139326c(fArr4);
        float[] fArr5 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f13640p = fArr5;
        float[] fArr6 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f13641q = fArr6;
        f13642r = j1k.m139326c(fArr5);
        f13643s = j1k.m139326c(fArr6);
    }

    public Drawable2d(Prefab prefab) {
        int i = C3860a.f13651a[prefab.ordinal()];
        if (i == 1) {
            this.f13644a = f13634j;
            this.f13645b = f13635k;
            this.f13647d = 2;
            this.f13648e = 2 * 4;
            this.f13646c = f13632h.length / 2;
        } else if (i == 2) {
            this.f13644a = f13638n;
            this.f13645b = f13639o;
            this.f13647d = 2;
            this.f13648e = 2 * 4;
            this.f13646c = f13636l.length / 2;
        } else {
            if (i != 3) {
                ibe.m135253a("Unknown shape ", prefab);
                throw null;
            }
            this.f13644a = f13642r;
            this.f13645b = f13643s;
            this.f13647d = 2;
            this.f13648e = 2 * 4;
            this.f13646c = f13640p.length / 2;
        }
        this.f13649f = 8;
        this.f13650g = prefab;
    }

    public String toString() {
        if (this.f13650g == null) {
            return "[Drawable2d: ...]";
        }
        return "[Drawable2d: " + this.f13650g + Constants.AES_SUFFIX;
    }
}
