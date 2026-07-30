package androidx.constraintlayout.solver;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariable {

    /* JADX INFO: renamed from: k */
    public static int f984k = 1;

    /* JADX INFO: renamed from: a */
    public String f985a;

    /* JADX INFO: renamed from: e */
    public float f989e;

    /* JADX INFO: renamed from: g */
    public Type f991g;

    /* JADX INFO: renamed from: b */
    public int f986b = -1;

    /* JADX INFO: renamed from: c */
    public int f987c = -1;

    /* JADX INFO: renamed from: d */
    public int f988d = 0;

    /* JADX INFO: renamed from: f */
    public float[] f990f = new float[7];

    /* JADX INFO: renamed from: h */
    public C0207b[] f992h = new C0207b[8];

    /* JADX INFO: renamed from: i */
    public int f993i = 0;

    /* JADX INFO: renamed from: j */
    public int f994j = 0;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type, String str) {
        this.f991g = type;
    }

    /* JADX INFO: renamed from: b */
    public static void m879b() {
        f984k++;
    }

    /* JADX INFO: renamed from: a */
    public final void m880a(C0207b c0207b) {
        int i = 0;
        while (true) {
            int i2 = this.f993i;
            C0207b[] c0207bArr = this.f992h;
            if (i >= i2) {
                if (i2 >= c0207bArr.length) {
                    this.f992h = (C0207b[]) Arrays.copyOf(c0207bArr, c0207bArr.length * 2);
                }
                C0207b[] c0207bArr2 = this.f992h;
                int i3 = this.f993i;
                c0207bArr2[i3] = c0207b;
                this.f993i = i3 + 1;
                return;
            }
            if (c0207bArr[i] == c0207b) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m881c(C0207b c0207b) {
        int i = this.f993i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f992h[i2] == c0207b) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C0207b[] c0207bArr = this.f992h;
                    int i4 = i2 + i3;
                    c0207bArr[i4] = c0207bArr[i4 + 1];
                }
                this.f993i--;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m882d() {
        this.f985a = null;
        this.f991g = Type.UNKNOWN;
        this.f988d = 0;
        this.f986b = -1;
        this.f987c = -1;
        this.f989e = 0.0f;
        this.f993i = 0;
        this.f994j = 0;
    }

    /* JADX INFO: renamed from: e */
    public void m883e(Type type, String str) {
        this.f991g = type;
    }

    /* JADX INFO: renamed from: f */
    public final void m884f(C0207b c0207b) {
        int i = this.f993i;
        for (int i2 = 0; i2 < i; i2++) {
            C0207b c0207b2 = this.f992h[i2];
            c0207b2.f1009d.m898n(c0207b2, c0207b, false);
        }
        this.f993i = 0;
    }

    public String toString() {
        return "" + this.f985a;
    }
}
