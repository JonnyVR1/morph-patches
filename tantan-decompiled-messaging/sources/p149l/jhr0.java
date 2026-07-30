package p149l;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class jhr0 {

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f118003f;

    /* JADX INFO: renamed from: h */
    public int f118005h;

    /* JADX INFO: renamed from: n */
    public float f118011n;

    /* JADX INFO: renamed from: a */
    public String f117998a = "";

    /* JADX INFO: renamed from: b */
    public String f117999b = "";

    /* JADX INFO: renamed from: c */
    public Set f118000c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d */
    public String f118001d = "";

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f118002e = null;

    /* JADX INFO: renamed from: g */
    public boolean f118004g = false;

    /* JADX INFO: renamed from: i */
    public boolean f118006i = false;

    /* JADX INFO: renamed from: j */
    public int f118007j = -1;

    /* JADX INFO: renamed from: k */
    public int f118008k = -1;

    /* JADX INFO: renamed from: l */
    public int f118009l = -1;

    /* JADX INFO: renamed from: m */
    public int f118010m = -1;

    /* JADX INFO: renamed from: o */
    public int f118012o = -1;

    /* JADX INFO: renamed from: p */
    public boolean f118013p = false;

    /* JADX INFO: renamed from: a */
    public static int m141569a(int i, String str, @Nullable String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m141570A() {
        return this.f118007j == 1;
    }

    /* JADX INFO: renamed from: b */
    public final float m141571b() {
        return this.f118011n;
    }

    /* JADX INFO: renamed from: c */
    public final int m141572c() {
        if (this.f118006i) {
            return this.f118005h;
        }
        qkq0.m175383a("Background color not defined.");
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m141573d() {
        if (this.f118004g) {
            return this.f118003f;
        }
        qkq0.m175383a("Font color not defined");
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m141574e() {
        return this.f118010m;
    }

    /* JADX INFO: renamed from: f */
    public final int m141575f() {
        return this.f118012o;
    }

    /* JADX INFO: renamed from: g */
    public final int m141576g(@Nullable String str, @Nullable String str2, Set set, @Nullable String str3) {
        if (this.f117998a.isEmpty() && this.f117999b.isEmpty() && this.f118000c.isEmpty() && this.f118001d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iM141569a = m141569a(m141569a(m141569a(0, this.f117998a, str, 1073741824), this.f117999b, str2, 2), this.f118001d, str3, 4);
        if (iM141569a == -1 || !set.containsAll(this.f118000c)) {
            return 0;
        }
        return iM141569a + (this.f118000c.size() * 4);
    }

    /* JADX INFO: renamed from: h */
    public final int m141577h() {
        int i = this.f118008k;
        if (i == -1 && this.f118009l == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f118009l == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: i */
    public final jhr0 m141578i(int i) {
        this.f118005h = i;
        this.f118006i = true;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final jhr0 m141579j(boolean z) {
        this.f118008k = 1;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final jhr0 m141580k(boolean z) {
        this.f118013p = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final jhr0 m141581l(int i) {
        this.f118003f = i;
        this.f118004g = true;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final jhr0 m141582m(@Nullable String str) {
        this.f118002e = qew0.m174257a(str);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final jhr0 m141583n(float f) {
        this.f118011n = f;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final jhr0 m141584o(int i) {
        this.f118010m = i;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final jhr0 m141585p(boolean z) {
        this.f118009l = 1;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final jhr0 m141586q(int i) {
        this.f118012o = i;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final jhr0 m141587r(boolean z) {
        this.f118007j = 1;
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final String m141588s() {
        return this.f118002e;
    }

    /* JADX INFO: renamed from: t */
    public final void m141589t(String[] strArr) {
        this.f118000c = new HashSet(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: u */
    public final void m141590u(String str) {
        this.f117998a = str;
    }

    /* JADX INFO: renamed from: v */
    public final void m141591v(String str) {
        this.f117999b = str;
    }

    /* JADX INFO: renamed from: w */
    public final void m141592w(String str) {
        this.f118001d = str;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m141593x() {
        return this.f118013p;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m141594y() {
        return this.f118006i;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m141595z() {
        return this.f118004g;
    }
}
