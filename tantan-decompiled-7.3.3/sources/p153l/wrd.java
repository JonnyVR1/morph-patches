package p153l;

import com.android.volley.VolleyError;

/* JADX INFO: loaded from: classes.dex */
public class wrd implements j6d0 {

    /* JADX INFO: renamed from: a */
    private int f190502a;

    /* JADX INFO: renamed from: b */
    private int f190503b;

    /* JADX INFO: renamed from: c */
    private final int f190504c;

    /* JADX INFO: renamed from: d */
    private final float f190505d;

    public wrd(int i, int i2, float f) {
        this.f190502a = i;
        this.f190504c = i2;
        this.f190505d = f;
    }

    @Override // p153l.j6d0
    /* JADX INFO: renamed from: a */
    public int mo143656a() {
        return this.f190503b;
    }

    @Override // p153l.j6d0
    /* JADX INFO: renamed from: b */
    public void mo143657b(VolleyError volleyError) throws VolleyError {
        this.f190503b++;
        int i = this.f190502a;
        this.f190502a = i + ((int) (i * this.f190505d));
        if (!m207582d()) {
            throw volleyError;
        }
    }

    @Override // p153l.j6d0
    /* JADX INFO: renamed from: c */
    public int mo143658c() {
        return this.f190502a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m207582d() {
        return this.f190503b <= this.f190504c;
    }

    public wrd() {
        this(2500, 1, 1.0f);
    }
}
