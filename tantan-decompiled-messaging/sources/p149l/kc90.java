package p149l;

import com.clevertap.android.sdk.Constants;
import com.sunshine.engine.base.InterpolatorType;

/* JADX INFO: loaded from: classes13.dex */
public abstract class kc90<T> {

    /* JADX INFO: renamed from: a */
    protected T f122305a;

    /* JADX INFO: renamed from: b */
    protected T f122306b;

    /* JADX INFO: renamed from: c */
    protected T f122307c;

    /* JADX INFO: renamed from: d */
    protected T f122308d;

    /* JADX INFO: renamed from: e */
    private jzm f122309e = new jzm();

    public kc90(T t, T t2) {
        m145370j(t, t2, InterpolatorType.linear.toString());
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo125466a(float f);

    /* JADX INFO: renamed from: b */
    public T m145363b() {
        return this.f122307c;
    }

    /* JADX INFO: renamed from: c */
    public T m145364c() {
        return this.f122305a;
    }

    /* JADX INFO: renamed from: d */
    public float m145365d(float f) {
        return this.f122309e.m143937a(f);
    }

    /* JADX INFO: renamed from: e */
    public String m145366e() {
        return this.f122309e.m143938b();
    }

    /* JADX INFO: renamed from: f */
    public T m145367f() {
        return this.f122308d;
    }

    /* JADX INFO: renamed from: g */
    public T m145368g() {
        return this.f122306b;
    }

    /* JADX INFO: renamed from: h */
    public T m145369h() {
        return mo125466a((float) Math.random());
    }

    /* JADX INFO: renamed from: i */
    public abstract kc90<T> mo125467i(T t, T t2);

    /* JADX INFO: renamed from: j */
    public kc90<T> m145370j(T t, T t2, String str) {
        mo125467i(t, t2).m145371k(str);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public kc90<T> m145371k(String str) {
        this.f122309e.m143939d(str);
        return this;
    }

    public String toString() {
        return this.f122305a + Constants.SEPARATOR_COMMA + this.f122306b;
    }

    public kc90(T t, T t2, String str) {
        m145370j(t, t2, str);
    }
}
