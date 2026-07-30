package p153l;

import com.clevertap.android.sdk.Constants;
import com.sunshine.engine.base.InterpolatorType;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ok90<T> {

    /* JADX INFO: renamed from: a */
    protected T f147740a;

    /* JADX INFO: renamed from: b */
    protected T f147741b;

    /* JADX INFO: renamed from: c */
    protected T f147742c;

    /* JADX INFO: renamed from: d */
    protected T f147743d;

    /* JADX INFO: renamed from: e */
    private i1n f147744e = new i1n();

    public ok90(T t, T t2) {
        m167994j(t, t2, InterpolatorType.linear.toString());
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo150085a(float f);

    /* JADX INFO: renamed from: b */
    public T m167987b() {
        return this.f147742c;
    }

    /* JADX INFO: renamed from: c */
    public T m167988c() {
        return this.f147740a;
    }

    /* JADX INFO: renamed from: d */
    public float m167989d(float f) {
        return this.f147744e.m138144a(f);
    }

    /* JADX INFO: renamed from: e */
    public String m167990e() {
        return this.f147744e.m138145b();
    }

    /* JADX INFO: renamed from: f */
    public T m167991f() {
        return this.f147743d;
    }

    /* JADX INFO: renamed from: g */
    public T m167992g() {
        return this.f147741b;
    }

    /* JADX INFO: renamed from: h */
    public T m167993h() {
        return mo150085a((float) Math.random());
    }

    /* JADX INFO: renamed from: i */
    public abstract ok90<T> mo150086i(T t, T t2);

    /* JADX INFO: renamed from: j */
    public ok90<T> m167994j(T t, T t2, String str) {
        mo150086i(t, t2).m167995k(str);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public ok90<T> m167995k(String str) {
        this.f147744e.m138146d(str);
        return this;
    }

    public String toString() {
        return this.f147740a + Constants.SEPARATOR_COMMA + this.f147741b;
    }

    public ok90(T t, T t2, String str) {
        m167994j(t, t2, str);
    }
}
