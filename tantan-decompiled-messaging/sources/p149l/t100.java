package p149l;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes13.dex */
public class t100 {

    /* JADX INFO: renamed from: a */
    public static final int f167252a = m186890d(1.0f);

    /* JADX INFO: renamed from: b */
    public static final float f167253b = m186888b(1.0f);

    /* JADX INFO: renamed from: c */
    public static final int f167254c = m186887a(2.0f);

    /* JADX INFO: renamed from: d */
    public static final int f167255d = m186887a(3.0f);

    /* JADX INFO: renamed from: e */
    public static final int f167256e = m186887a(4.0f);

    /* JADX INFO: renamed from: f */
    public static final int f167257f = m186887a(5.0f);

    /* JADX INFO: renamed from: g */
    public static final int f167258g = m186887a(6.0f);

    /* JADX INFO: renamed from: h */
    public static final int f167259h = m186887a(8.0f);

    /* JADX INFO: renamed from: i */
    public static final int f167260i = m186887a(10.0f);

    /* JADX INFO: renamed from: j */
    public static final int f167261j = m186887a(12.0f);

    /* JADX INFO: renamed from: k */
    public static final int f167262k = m186887a(14.0f);

    /* JADX INFO: renamed from: l */
    public static final int f167263l = m186887a(15.0f);

    /* JADX INFO: renamed from: m */
    public static final int f167264m = m186887a(16.0f);

    /* JADX INFO: renamed from: n */
    public static final int f167265n = m186887a(18.0f);

    /* JADX INFO: renamed from: o */
    public static final int f167266o = m186887a(20.0f);

    /* JADX INFO: renamed from: p */
    public static final int f167267p = m186887a(22.0f);

    /* JADX INFO: renamed from: q */
    public static final int f167268q = m186887a(24.0f);

    /* JADX INFO: renamed from: r */
    public static final int f167269r = m186887a(26.0f);

    /* JADX INFO: renamed from: s */
    public static final int f167270s = m186887a(28.0f);

    /* JADX INFO: renamed from: t */
    public static final int f167271t = m186887a(30.0f);

    /* JADX INFO: renamed from: u */
    public static final int f167272u = m186887a(31.0f);

    /* JADX INFO: renamed from: v */
    public static final int f167273v = m186887a(32.0f);

    /* JADX INFO: renamed from: w */
    public static final int f167274w = m186887a(34.0f);

    /* JADX INFO: renamed from: x */
    public static final int f167275x = m186887a(36.0f);

    /* JADX INFO: renamed from: y */
    public static final int f167276y = m186887a(40.0f);

    /* JADX INFO: renamed from: z */
    public static final int f167277z = m186887a(42.0f);

    /* JADX INFO: renamed from: A */
    public static final int f167226A = m186887a(48.0f);

    /* JADX INFO: renamed from: B */
    public static final int f167227B = m186887a(50.0f);

    /* JADX INFO: renamed from: C */
    public static final int f167228C = m186887a(54.0f);

    /* JADX INFO: renamed from: D */
    public static final int f167229D = m186887a(55.0f);

    /* JADX INFO: renamed from: E */
    public static final int f167230E = m186887a(56.0f);

    /* JADX INFO: renamed from: F */
    public static final int f167231F = m186887a(60.0f);

    /* JADX INFO: renamed from: G */
    public static final int f167232G = m186887a(64.0f);

    /* JADX INFO: renamed from: H */
    public static final int f167233H = m186887a(65.0f);

    /* JADX INFO: renamed from: I */
    public static final int f167234I = m186887a(70.0f);

    /* JADX INFO: renamed from: J */
    public static final int f167235J = m186887a(72.0f);

    /* JADX INFO: renamed from: K */
    public static final int f167236K = m186887a(80.0f);

    /* JADX INFO: renamed from: L */
    public static final int f167237L = m186887a(82.0f);

    /* JADX INFO: renamed from: M */
    public static final int f167238M = m186887a(86.0f);

    /* JADX INFO: renamed from: N */
    public static final int f167239N = m186887a(86.0f);

    /* JADX INFO: renamed from: O */
    public static final int f167240O = m186887a(90.0f);

    /* JADX INFO: renamed from: P */
    public static final int f167241P = m186887a(96.0f);

    /* JADX INFO: renamed from: Q */
    public static final int f167242Q = m186887a(98.0f);

    /* JADX INFO: renamed from: R */
    public static final int f167243R = m186887a(105.0f);

    /* JADX INFO: renamed from: S */
    public static final int f167244S = m186887a(120.0f);

    /* JADX INFO: renamed from: T */
    public static final int f167245T = m186887a(132.0f);

    /* JADX INFO: renamed from: U */
    public static final int f167246U = m186887a(156.0f);

    /* JADX INFO: renamed from: V */
    public static final int f167247V = m186887a(160.0f);

    /* JADX INFO: renamed from: W */
    public static final int f167248W = m186887a(176.0f);

    /* JADX INFO: renamed from: X */
    public static final int f167249X = m186887a(206.0f);

    /* JADX INFO: renamed from: Y */
    public static final int f167250Y = m186887a(214.0f);

    /* JADX INFO: renamed from: Z */
    public static final int f167251Z = m186887a(255.0f);

    /* JADX INFO: renamed from: a */
    public static int m186887a(float f) {
        return (int) (f167253b * f);
    }

    /* JADX INFO: renamed from: b */
    public static float m186888b(float f) {
        return m186889c().density * f;
    }

    /* JADX INFO: renamed from: c */
    public static DisplayMetrics m186889c() {
        return f16.m119092a().getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: d */
    public static int m186890d(float f) {
        return (int) (m186889c().density * f);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m186891e() {
        return xdl0.m208412y0() >= 1080;
    }

    /* JADX INFO: renamed from: f */
    public static int m186892f(int i) {
        return (int) TypedValue.applyDimension(2, i, m186889c());
    }
}
