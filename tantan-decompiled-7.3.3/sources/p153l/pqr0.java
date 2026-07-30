package p153l;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class pqr0 {

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f153697f;

    /* JADX INFO: renamed from: h */
    public int f153699h;

    /* JADX INFO: renamed from: n */
    public float f153705n;

    /* JADX INFO: renamed from: a */
    public String f153692a = "";

    /* JADX INFO: renamed from: b */
    public String f153693b = "";

    /* JADX INFO: renamed from: c */
    public Set f153694c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d */
    public String f153695d = "";

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f153696e = null;

    /* JADX INFO: renamed from: g */
    public boolean f153698g = false;

    /* JADX INFO: renamed from: i */
    public boolean f153700i = false;

    /* JADX INFO: renamed from: j */
    public int f153701j = -1;

    /* JADX INFO: renamed from: k */
    public int f153702k = -1;

    /* JADX INFO: renamed from: l */
    public int f153703l = -1;

    /* JADX INFO: renamed from: m */
    public int f153704m = -1;

    /* JADX INFO: renamed from: o */
    public int f153706o = -1;

    /* JADX INFO: renamed from: p */
    public boolean f153707p = false;

    /* JADX INFO: renamed from: a */
    public static int m173393a(int i, String str, @Nullable String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m173394A() {
        return this.f153701j == 1;
    }

    /* JADX INFO: renamed from: b */
    public final float m173395b() {
        return this.f153705n;
    }

    /* JADX INFO: renamed from: c */
    public final int m173396c() {
        if (this.f153700i) {
            return this.f153699h;
        }
        wtq0.m207906a("Background color not defined.");
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m173397d() {
        if (this.f153698g) {
            return this.f153697f;
        }
        wtq0.m207906a("Font color not defined");
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m173398e() {
        return this.f153704m;
    }

    /* JADX INFO: renamed from: f */
    public final int m173399f() {
        return this.f153706o;
    }

    /* JADX INFO: renamed from: g */
    public final int m173400g(@Nullable String str, @Nullable String str2, Set set, @Nullable String str3) {
        if (this.f153692a.isEmpty() && this.f153693b.isEmpty() && this.f153694c.isEmpty() && this.f153695d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iM173393a = m173393a(m173393a(m173393a(0, this.f153692a, str, 1073741824), this.f153693b, str2, 2), this.f153695d, str3, 4);
        if (iM173393a == -1 || !set.containsAll(this.f153694c)) {
            return 0;
        }
        return iM173393a + (this.f153694c.size() * 4);
    }

    /* JADX INFO: renamed from: h */
    public final int m173401h() {
        int i = this.f153702k;
        if (i == -1 && this.f153703l == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f153703l == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: i */
    public final pqr0 m173402i(int i) {
        this.f153699h = i;
        this.f153700i = true;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final pqr0 m173403j(boolean z) {
        this.f153702k = 1;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final pqr0 m173404k(boolean z) {
        this.f153707p = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final pqr0 m173405l(int i) {
        this.f153697f = i;
        this.f153698g = true;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final pqr0 m173406m(@Nullable String str) {
        this.f153696e = wnw0.m207228a(str);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final pqr0 m173407n(float f) {
        this.f153705n = f;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final pqr0 m173408o(int i) {
        this.f153704m = i;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final pqr0 m173409p(boolean z) {
        this.f153703l = 1;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final pqr0 m173410q(int i) {
        this.f153706o = i;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final pqr0 m173411r(boolean z) {
        this.f153701j = 1;
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final String m173412s() {
        return this.f153696e;
    }

    /* JADX INFO: renamed from: t */
    public final void m173413t(String[] strArr) {
        this.f153694c = new HashSet(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: u */
    public final void m173414u(String str) {
        this.f153692a = str;
    }

    /* JADX INFO: renamed from: v */
    public final void m173415v(String str) {
        this.f153693b = str;
    }

    /* JADX INFO: renamed from: w */
    public final void m173416w(String str) {
        this.f153695d = str;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m173417x() {
        return this.f153707p;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m173418y() {
        return this.f153700i;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m173419z() {
        return this.f153698g;
    }
}
