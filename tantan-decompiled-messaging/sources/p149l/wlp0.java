package p149l;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wlp0 {

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f186972f;

    /* JADX INFO: renamed from: h */
    public int f186974h;

    /* JADX INFO: renamed from: o */
    public float f186981o;

    /* JADX INFO: renamed from: a */
    public String f186967a = "";

    /* JADX INFO: renamed from: b */
    public String f186968b = "";

    /* JADX INFO: renamed from: c */
    public Set<String> f186969c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d */
    public String f186970d = "";

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f186971e = null;

    /* JADX INFO: renamed from: g */
    public boolean f186973g = false;

    /* JADX INFO: renamed from: i */
    public boolean f186975i = false;

    /* JADX INFO: renamed from: j */
    public int f186976j = -1;

    /* JADX INFO: renamed from: k */
    public int f186977k = -1;

    /* JADX INFO: renamed from: l */
    public int f186978l = -1;

    /* JADX INFO: renamed from: m */
    public int f186979m = -1;

    /* JADX INFO: renamed from: n */
    public int f186980n = -1;

    /* JADX INFO: renamed from: p */
    public int f186982p = -1;

    /* JADX INFO: renamed from: q */
    public boolean f186983q = false;

    /* JADX INFO: renamed from: B */
    public static int m203845B(int i, String str, @Nullable String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: A */
    public wlp0 m203846A(boolean z) {
        this.f186977k = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public int m203847a() {
        if (this.f186975i) {
            return this.f186974h;
        }
        qkq0.m175383a("Background color not defined.");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m203848b() {
        return this.f186983q;
    }

    /* JADX INFO: renamed from: c */
    public int m203849c() {
        if (this.f186973g) {
            return this.f186972f;
        }
        qkq0.m175383a("Font color not defined");
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public String m203850d() {
        return this.f186971e;
    }

    /* JADX INFO: renamed from: e */
    public float m203851e() {
        return this.f186981o;
    }

    /* JADX INFO: renamed from: f */
    public int m203852f() {
        return this.f186980n;
    }

    /* JADX INFO: renamed from: g */
    public int m203853g() {
        return this.f186982p;
    }

    /* JADX INFO: renamed from: h */
    public int m203854h(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        if (this.f186967a.isEmpty() && this.f186968b.isEmpty() && this.f186969c.isEmpty() && this.f186970d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iM203845B = m203845B(m203845B(m203845B(0, this.f186967a, str, 1073741824), this.f186968b, str2, 2), this.f186970d, str3, 4);
        if (iM203845B == -1 || !set.containsAll(this.f186969c)) {
            return 0;
        }
        return iM203845B + (this.f186969c.size() * 4);
    }

    /* JADX INFO: renamed from: i */
    public int m203855i() {
        int i = this.f186978l;
        if (i == -1 && this.f186979m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f186979m == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: j */
    public boolean m203856j() {
        return this.f186975i;
    }

    /* JADX INFO: renamed from: k */
    public boolean m203857k() {
        return this.f186973g;
    }

    /* JADX INFO: renamed from: l */
    public boolean m203858l() {
        return this.f186976j == 1;
    }

    /* JADX INFO: renamed from: m */
    public boolean m203859m() {
        return this.f186977k == 1;
    }

    /* JADX INFO: renamed from: n */
    public wlp0 m203860n(int i) {
        this.f186974h = i;
        this.f186975i = true;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public wlp0 m203861o(boolean z) {
        this.f186978l = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public wlp0 m203862p(boolean z) {
        this.f186983q = z;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public wlp0 m203863q(int i) {
        this.f186972f = i;
        this.f186973g = true;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public wlp0 m203864r(@Nullable String str) {
        this.f186971e = str == null ? null : b11.m99804e(str);
        return this;
    }

    /* JADX INFO: renamed from: s */
    public wlp0 m203865s(float f) {
        this.f186981o = f;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public wlp0 m203866t(int i) {
        this.f186980n = i;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public wlp0 m203867u(boolean z) {
        this.f186979m = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public wlp0 m203868v(int i) {
        this.f186982p = i;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public void m203869w(String[] strArr) {
        this.f186969c = new HashSet(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: x */
    public void m203870x(String str) {
        this.f186967a = str;
    }

    /* JADX INFO: renamed from: y */
    public void m203871y(String str) {
        this.f186968b = str;
    }

    /* JADX INFO: renamed from: z */
    public void m203872z(String str) {
        this.f186970d = str;
    }
}
