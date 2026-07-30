package p149l;

import com.android.volley.VolleyError;

/* JADX INFO: loaded from: classes.dex */
public class gqd implements gyc0 {

    /* JADX INFO: renamed from: a */
    private int f103917a;

    /* JADX INFO: renamed from: b */
    private int f103918b;

    /* JADX INFO: renamed from: c */
    private final int f103919c;

    /* JADX INFO: renamed from: d */
    private final float f103920d;

    public gqd(int i, int i2, float f) {
        this.f103917a = i;
        this.f103919c = i2;
        this.f103920d = f;
    }

    @Override // p149l.gyc0
    /* JADX INFO: renamed from: a */
    public int mo127564a() {
        return this.f103918b;
    }

    @Override // p149l.gyc0
    /* JADX INFO: renamed from: b */
    public void mo127565b(VolleyError volleyError) throws VolleyError {
        this.f103918b++;
        int i = this.f103917a;
        this.f103917a = i + ((int) (i * this.f103920d));
        if (!m127567d()) {
            throw volleyError;
        }
    }

    @Override // p149l.gyc0
    /* JADX INFO: renamed from: c */
    public int mo127566c() {
        return this.f103917a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m127567d() {
        return this.f103918b <= this.f103919c;
    }

    public gqd() {
        this(2500, 1, 1.0f);
    }
}
