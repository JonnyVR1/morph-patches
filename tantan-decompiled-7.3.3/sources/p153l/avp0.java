package p153l;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class avp0 {

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f73641f;

    /* JADX INFO: renamed from: h */
    public int f73643h;

    /* JADX INFO: renamed from: o */
    public float f73650o;

    /* JADX INFO: renamed from: a */
    public String f73636a = "";

    /* JADX INFO: renamed from: b */
    public String f73637b = "";

    /* JADX INFO: renamed from: c */
    public Set<String> f73638c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d */
    public String f73639d = "";

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f73640e = null;

    /* JADX INFO: renamed from: g */
    public boolean f73642g = false;

    /* JADX INFO: renamed from: i */
    public boolean f73644i = false;

    /* JADX INFO: renamed from: j */
    public int f73645j = -1;

    /* JADX INFO: renamed from: k */
    public int f73646k = -1;

    /* JADX INFO: renamed from: l */
    public int f73647l = -1;

    /* JADX INFO: renamed from: m */
    public int f73648m = -1;

    /* JADX INFO: renamed from: n */
    public int f73649n = -1;

    /* JADX INFO: renamed from: p */
    public int f73651p = -1;

    /* JADX INFO: renamed from: q */
    public boolean f73652q = false;

    /* JADX INFO: renamed from: B */
    public static int m100479B(int i, String str, @Nullable String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: A */
    public avp0 m100480A(boolean z) {
        this.f73646k = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public int m100481a() {
        if (this.f73644i) {
            return this.f73643h;
        }
        wtq0.m207906a("Background color not defined.");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m100482b() {
        return this.f73652q;
    }

    /* JADX INFO: renamed from: c */
    public int m100483c() {
        if (this.f73642g) {
            return this.f73641f;
        }
        wtq0.m207906a("Font color not defined");
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public String m100484d() {
        return this.f73640e;
    }

    /* JADX INFO: renamed from: e */
    public float m100485e() {
        return this.f73650o;
    }

    /* JADX INFO: renamed from: f */
    public int m100486f() {
        return this.f73649n;
    }

    /* JADX INFO: renamed from: g */
    public int m100487g() {
        return this.f73651p;
    }

    /* JADX INFO: renamed from: h */
    public int m100488h(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        if (this.f73636a.isEmpty() && this.f73637b.isEmpty() && this.f73638c.isEmpty() && this.f73639d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iM100479B = m100479B(m100479B(m100479B(0, this.f73636a, str, 1073741824), this.f73637b, str2, 2), this.f73639d, str3, 4);
        if (iM100479B == -1 || !set.containsAll(this.f73638c)) {
            return 0;
        }
        return iM100479B + (this.f73638c.size() * 4);
    }

    /* JADX INFO: renamed from: i */
    public int m100489i() {
        int i = this.f73647l;
        if (i == -1 && this.f73648m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f73648m == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: j */
    public boolean m100490j() {
        return this.f73644i;
    }

    /* JADX INFO: renamed from: k */
    public boolean m100491k() {
        return this.f73642g;
    }

    /* JADX INFO: renamed from: l */
    public boolean m100492l() {
        return this.f73645j == 1;
    }

    /* JADX INFO: renamed from: m */
    public boolean m100493m() {
        return this.f73646k == 1;
    }

    /* JADX INFO: renamed from: n */
    public avp0 m100494n(int i) {
        this.f73643h = i;
        this.f73644i = true;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public avp0 m100495o(boolean z) {
        this.f73647l = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public avp0 m100496p(boolean z) {
        this.f73652q = z;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public avp0 m100497q(int i) {
        this.f73641f = i;
        this.f73642g = true;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public avp0 m100498r(@Nullable String str) {
        this.f73640e = str == null ? null : i11.m138051e(str);
        return this;
    }

    /* JADX INFO: renamed from: s */
    public avp0 m100499s(float f) {
        this.f73650o = f;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public avp0 m100500t(int i) {
        this.f73649n = i;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public avp0 m100501u(boolean z) {
        this.f73648m = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public avp0 m100502v(int i) {
        this.f73651p = i;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public void m100503w(String[] strArr) {
        this.f73638c = new HashSet(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: x */
    public void m100504x(String str) {
        this.f73636a = str;
    }

    /* JADX INFO: renamed from: y */
    public void m100505y(String str) {
        this.f73637b = str;
    }

    /* JADX INFO: renamed from: z */
    public void m100506z(String str) {
        this.f73639d = str;
    }
}
