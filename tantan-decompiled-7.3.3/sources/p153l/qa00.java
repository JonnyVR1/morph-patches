package p153l;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes11.dex */
public class qa00 {

    /* JADX INFO: renamed from: a */
    public static final int f156314a = m175859d(1.0f);

    /* JADX INFO: renamed from: b */
    public static final float f156315b = m175857b(1.0f);

    /* JADX INFO: renamed from: c */
    public static final int f156316c = m175856a(2.0f);

    /* JADX INFO: renamed from: d */
    public static final int f156317d = m175856a(3.0f);

    /* JADX INFO: renamed from: e */
    public static final int f156318e = m175856a(4.0f);

    /* JADX INFO: renamed from: f */
    public static final int f156319f = m175856a(5.0f);

    /* JADX INFO: renamed from: g */
    public static final int f156320g = m175856a(6.0f);

    /* JADX INFO: renamed from: h */
    public static final int f156321h = m175856a(8.0f);

    /* JADX INFO: renamed from: i */
    public static final int f156322i = m175856a(10.0f);

    /* JADX INFO: renamed from: j */
    public static final int f156323j = m175856a(12.0f);

    /* JADX INFO: renamed from: k */
    public static final int f156324k = m175856a(14.0f);

    /* JADX INFO: renamed from: l */
    public static final int f156325l = m175856a(15.0f);

    /* JADX INFO: renamed from: m */
    public static final int f156326m = m175856a(16.0f);

    /* JADX INFO: renamed from: n */
    public static final int f156327n = m175856a(18.0f);

    /* JADX INFO: renamed from: o */
    public static final int f156328o = m175856a(20.0f);

    /* JADX INFO: renamed from: p */
    public static final int f156329p = m175856a(22.0f);

    /* JADX INFO: renamed from: q */
    public static final int f156330q = m175856a(24.0f);

    /* JADX INFO: renamed from: r */
    public static final int f156331r = m175856a(26.0f);

    /* JADX INFO: renamed from: s */
    public static final int f156332s = m175856a(28.0f);

    /* JADX INFO: renamed from: t */
    public static final int f156333t = m175856a(30.0f);

    /* JADX INFO: renamed from: u */
    public static final int f156334u = m175856a(31.0f);

    /* JADX INFO: renamed from: v */
    public static final int f156335v = m175856a(32.0f);

    /* JADX INFO: renamed from: w */
    public static final int f156336w = m175856a(34.0f);

    /* JADX INFO: renamed from: x */
    public static final int f156337x = m175856a(36.0f);

    /* JADX INFO: renamed from: y */
    public static final int f156338y = m175856a(40.0f);

    /* JADX INFO: renamed from: z */
    public static final int f156339z = m175856a(42.0f);

    /* JADX INFO: renamed from: A */
    public static final int f156288A = m175856a(48.0f);

    /* JADX INFO: renamed from: B */
    public static final int f156289B = m175856a(50.0f);

    /* JADX INFO: renamed from: C */
    public static final int f156290C = m175856a(54.0f);

    /* JADX INFO: renamed from: D */
    public static final int f156291D = m175856a(55.0f);

    /* JADX INFO: renamed from: E */
    public static final int f156292E = m175856a(56.0f);

    /* JADX INFO: renamed from: F */
    public static final int f156293F = m175856a(60.0f);

    /* JADX INFO: renamed from: G */
    public static final int f156294G = m175856a(64.0f);

    /* JADX INFO: renamed from: H */
    public static final int f156295H = m175856a(65.0f);

    /* JADX INFO: renamed from: I */
    public static final int f156296I = m175856a(70.0f);

    /* JADX INFO: renamed from: J */
    public static final int f156297J = m175856a(72.0f);

    /* JADX INFO: renamed from: K */
    public static final int f156298K = m175856a(80.0f);

    /* JADX INFO: renamed from: L */
    public static final int f156299L = m175856a(82.0f);

    /* JADX INFO: renamed from: M */
    public static final int f156300M = m175856a(86.0f);

    /* JADX INFO: renamed from: N */
    public static final int f156301N = m175856a(86.0f);

    /* JADX INFO: renamed from: O */
    public static final int f156302O = m175856a(90.0f);

    /* JADX INFO: renamed from: P */
    public static final int f156303P = m175856a(96.0f);

    /* JADX INFO: renamed from: Q */
    public static final int f156304Q = m175856a(98.0f);

    /* JADX INFO: renamed from: R */
    public static final int f156305R = m175856a(105.0f);

    /* JADX INFO: renamed from: S */
    public static final int f156306S = m175856a(120.0f);

    /* JADX INFO: renamed from: T */
    public static final int f156307T = m175856a(132.0f);

    /* JADX INFO: renamed from: U */
    public static final int f156308U = m175856a(156.0f);

    /* JADX INFO: renamed from: V */
    public static final int f156309V = m175856a(160.0f);

    /* JADX INFO: renamed from: W */
    public static final int f156310W = m175856a(176.0f);

    /* JADX INFO: renamed from: X */
    public static final int f156311X = m175856a(206.0f);

    /* JADX INFO: renamed from: Y */
    public static final int f156312Y = m175856a(214.0f);

    /* JADX INFO: renamed from: Z */
    public static final int f156313Z = m175856a(255.0f);

    /* JADX INFO: renamed from: a */
    public static int m175856a(float f) {
        return (int) (f156315b * f);
    }

    /* JADX INFO: renamed from: b */
    public static float m175857b(float f) {
        return m175858c().density * f;
    }

    /* JADX INFO: renamed from: c */
    public static DisplayMetrics m175858c() {
        return k26.m147943a().getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: d */
    public static int m175859d(float f) {
        return (int) (m175858c().density * f);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m175860e() {
        return bnl0.m105592y0() >= 1080;
    }

    /* JADX INFO: renamed from: f */
    public static int m175861f(int i) {
        return (int) TypedValue.applyDimension(2, i, m175858c());
    }
}
