package p153l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bfj0 {

    /* JADX INFO: renamed from: a */
    public asd f76495a;

    /* JADX INFO: renamed from: b */
    public long f76496b;

    /* JADX INFO: renamed from: c */
    public long f76497c;

    /* JADX INFO: renamed from: d */
    public long f76498d;

    /* JADX INFO: renamed from: e */
    public int f76499e;

    /* JADX INFO: renamed from: f */
    public int f76500f;

    /* JADX INFO: renamed from: l */
    public boolean f76506l;

    /* JADX INFO: renamed from: n */
    @Nullable
    public zej0 f76508n;

    /* JADX INFO: renamed from: p */
    public boolean f76510p;

    /* JADX INFO: renamed from: q */
    public long f76511q;

    /* JADX INFO: renamed from: r */
    public boolean f76512r;

    /* JADX INFO: renamed from: g */
    public long[] f76501g = new long[0];

    /* JADX INFO: renamed from: h */
    public int[] f76502h = new int[0];

    /* JADX INFO: renamed from: i */
    public int[] f76503i = new int[0];

    /* JADX INFO: renamed from: j */
    public long[] f76504j = new long[0];

    /* JADX INFO: renamed from: k */
    public boolean[] f76505k = new boolean[0];

    /* JADX INFO: renamed from: m */
    public boolean[] f76507m = new boolean[0];

    /* JADX INFO: renamed from: o */
    public final ig60 f76509o = new ig60();

    /* JADX INFO: renamed from: a */
    public void m103906a(asf asfVar) throws IOException {
        asfVar.readFully(this.f76509o.m139815e(), 0, this.f76509o.m139817g());
        this.f76509o.m139808U(0);
        this.f76510p = false;
    }

    /* JADX INFO: renamed from: b */
    public void m103907b(ig60 ig60Var) {
        ig60Var.m139822l(this.f76509o.m139815e(), 0, this.f76509o.m139817g());
        this.f76509o.m139808U(0);
        this.f76510p = false;
    }

    /* JADX INFO: renamed from: c */
    public long m103908c(int i) {
        return this.f76504j[i];
    }

    /* JADX INFO: renamed from: d */
    public void m103909d(int i) {
        this.f76509o.m139804Q(i);
        this.f76506l = true;
        this.f76510p = true;
    }

    /* JADX INFO: renamed from: e */
    public void m103910e(int i, int i2) {
        this.f76499e = i;
        this.f76500f = i2;
        if (this.f76502h.length < i) {
            this.f76501g = new long[i];
            this.f76502h = new int[i];
        }
        if (this.f76503i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f76503i = new int[i3];
            this.f76504j = new long[i3];
            this.f76505k = new boolean[i3];
            this.f76507m = new boolean[i3];
        }
    }

    /* JADX INFO: renamed from: f */
    public void m103911f() {
        this.f76499e = 0;
        this.f76511q = 0L;
        this.f76512r = false;
        this.f76506l = false;
        this.f76510p = false;
        this.f76508n = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m103912g(int i) {
        return this.f76506l && this.f76507m[i];
    }
}
