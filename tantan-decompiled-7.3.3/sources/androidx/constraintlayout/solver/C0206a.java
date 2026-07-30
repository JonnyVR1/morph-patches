package androidx.constraintlayout.solver;

import java.util.Arrays;
import p153l.wx3;

/* JADX INFO: renamed from: androidx.constraintlayout.solver.a */
/* JADX INFO: loaded from: classes.dex */
public class C0206a {

    /* JADX INFO: renamed from: b */
    public final C0207b f996b;

    /* JADX INFO: renamed from: c */
    public final wx3 f997c;

    /* JADX INFO: renamed from: a */
    public int f995a = 0;

    /* JADX INFO: renamed from: d */
    public int f998d = 8;

    /* JADX INFO: renamed from: e */
    public SolverVariable f999e = null;

    /* JADX INFO: renamed from: f */
    public int[] f1000f = new int[8];

    /* JADX INFO: renamed from: g */
    public int[] f1001g = new int[8];

    /* JADX INFO: renamed from: h */
    public float[] f1002h = new float[8];

    /* JADX INFO: renamed from: i */
    public int f1003i = -1;

    /* JADX INFO: renamed from: j */
    public int f1004j = -1;

    /* JADX INFO: renamed from: k */
    public boolean f1005k = false;

    public C0206a(C0207b c0207b, wx3 wx3Var) {
        this.f996b = c0207b;
        this.f997c = wx3Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m885a(SolverVariable solverVariable, float f, boolean z) {
        if (f == 0.0f) {
            return;
        }
        int i = this.f1003i;
        if (i == -1) {
            this.f1003i = 0;
            this.f1002h[0] = f;
            this.f1000f[0] = solverVariable.f986b;
            this.f1001g[0] = -1;
            solverVariable.f994j++;
            solverVariable.m880a(this.f996b);
            this.f995a++;
            if (this.f1005k) {
                return;
            }
            int i2 = this.f1004j + 1;
            this.f1004j = i2;
            int[] iArr = this.f1000f;
            if (i2 >= iArr.length) {
                this.f1005k = true;
                this.f1004j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f995a; i4++) {
            int i5 = this.f1000f[i];
            int i6 = solverVariable.f986b;
            if (i5 == i6) {
                float[] fArr = this.f1002h;
                float f2 = fArr[i] + f;
                fArr[i] = f2;
                if (f2 == 0.0f) {
                    int i7 = this.f1003i;
                    int[] iArr2 = this.f1001g;
                    if (i == i7) {
                        this.f1003i = iArr2[i];
                    } else {
                        iArr2[i3] = iArr2[i];
                    }
                    if (z) {
                        solverVariable.m881c(this.f996b);
                    }
                    if (this.f1005k) {
                        this.f1004j = i;
                    }
                    solverVariable.f994j--;
                    this.f995a--;
                    return;
                }
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f1001g[i];
        }
        int length = this.f1004j;
        int i8 = length + 1;
        if (this.f1005k) {
            int[] iArr3 = this.f1000f;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i8;
        }
        int[] iArr4 = this.f1000f;
        if (length >= iArr4.length && this.f995a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f1000f;
                if (i9 >= iArr5.length) {
                    break;
                }
                if (iArr5[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr6 = this.f1000f;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i10 = this.f998d * 2;
            this.f998d = i10;
            this.f1005k = false;
            this.f1004j = length - 1;
            this.f1002h = Arrays.copyOf(this.f1002h, i10);
            this.f1000f = Arrays.copyOf(this.f1000f, this.f998d);
            this.f1001g = Arrays.copyOf(this.f1001g, this.f998d);
        }
        this.f1000f[length] = solverVariable.f986b;
        this.f1002h[length] = f;
        int[] iArr7 = this.f1001g;
        if (i3 != -1) {
            iArr7[length] = iArr7[i3];
            iArr7[i3] = length;
        } else {
            iArr7[length] = this.f1003i;
            this.f1003i = length;
        }
        solverVariable.f994j++;
        solverVariable.m880a(this.f996b);
        this.f995a++;
        if (!this.f1005k) {
            this.f1004j++;
        }
        int i11 = this.f1004j;
        int[] iArr8 = this.f1000f;
        if (i11 >= iArr8.length) {
            this.f1005k = true;
            this.f1004j = iArr8.length - 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public SolverVariable m886b(C0208c c0208c) {
        int i = this.f1003i;
        SolverVariable solverVariable = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        SolverVariable solverVariable2 = null;
        for (int i2 = 0; i != -1 && i2 < this.f995a; i2++) {
            float[] fArr = this.f1002h;
            float f3 = fArr[i];
            SolverVariable solverVariable3 = this.f997c.f191361c[this.f1000f[i]];
            if (f3 < 0.0f) {
                if (f3 > -0.001f) {
                    fArr[i] = 0.0f;
                    solverVariable3.m881c(this.f996b);
                    f3 = 0.0f;
                }
            } else if (f3 < 0.001f) {
                fArr[i] = 0.0f;
                solverVariable3.m881c(this.f996b);
                f3 = 0.0f;
            }
            if (f3 != 0.0f) {
                if (solverVariable3.f991g == SolverVariable.Type.UNRESTRICTED) {
                    if (solverVariable2 == null || f > f3) {
                        boolean zM895k = m895k(solverVariable3, c0208c);
                        z = zM895k;
                        f = f3;
                        solverVariable2 = solverVariable3;
                    } else if (!z && m895k(solverVariable3, c0208c)) {
                        f = f3;
                        solverVariable2 = solverVariable3;
                        z = true;
                    }
                } else if (solverVariable2 == null && f3 < 0.0f) {
                    if (solverVariable == null || f2 > f3) {
                        boolean zM895k2 = m895k(solverVariable3, c0208c);
                        z2 = zM895k2;
                        f2 = f3;
                        solverVariable = solverVariable3;
                    } else if (!z2 && m895k(solverVariable3, c0208c)) {
                        f2 = f3;
                        solverVariable = solverVariable3;
                        z2 = true;
                    }
                }
            }
            i = this.f1001g[i];
        }
        return solverVariable2 != null ? solverVariable2 : solverVariable;
    }

    /* JADX INFO: renamed from: c */
    public final void m887c() {
        int i = this.f1003i;
        for (int i2 = 0; i != -1 && i2 < this.f995a; i2++) {
            SolverVariable solverVariable = this.f997c.f191361c[this.f1000f[i]];
            if (solverVariable != null) {
                solverVariable.m881c(this.f996b);
            }
            i = this.f1001g[i];
        }
        this.f1003i = -1;
        this.f1004j = -1;
        this.f1005k = false;
        this.f995a = 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m888d(SolverVariable solverVariable) {
        int i = this.f1003i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f995a; i2++) {
            if (this.f1000f[i] == solverVariable.f986b) {
                return true;
            }
            i = this.f1001g[i];
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m889e(float f) {
        int i = this.f1003i;
        for (int i2 = 0; i != -1 && i2 < this.f995a; i2++) {
            float[] fArr = this.f1002h;
            fArr[i] = fArr[i] / f;
            i = this.f1001g[i];
        }
    }

    /* JADX INFO: renamed from: f */
    public final float m890f(SolverVariable solverVariable) {
        int i = this.f1003i;
        for (int i2 = 0; i != -1 && i2 < this.f995a; i2++) {
            if (this.f1000f[i] == solverVariable.f986b) {
                return this.f1002h[i];
            }
            i = this.f1001g[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public SolverVariable m891g(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int i = this.f1003i;
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i2 = 0; i != -1 && i2 < this.f995a; i2++) {
            float f2 = this.f1002h[i];
            if (f2 < 0.0f) {
                SolverVariable solverVariable3 = this.f997c.f191361c[this.f1000f[i]];
                if ((zArr == null || !zArr[solverVariable3.f986b]) && solverVariable3 != solverVariable && (((type = solverVariable3.f991g) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && f2 < f)) {
                    f = f2;
                    solverVariable2 = solverVariable3;
                }
            }
            i = this.f1001g[i];
        }
        return solverVariable2;
    }

    /* JADX INFO: renamed from: h */
    public final SolverVariable m892h(int i) {
        int i2 = this.f1003i;
        for (int i3 = 0; i2 != -1 && i3 < this.f995a; i3++) {
            if (i3 == i) {
                return this.f997c.f191361c[this.f1000f[i2]];
            }
            i2 = this.f1001g[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final float m893i(int i) {
        int i2 = this.f1003i;
        for (int i3 = 0; i2 != -1 && i3 < this.f995a; i3++) {
            if (i3 == i) {
                return this.f1002h[i2];
            }
            i2 = this.f1001g[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: j */
    public void m894j() {
        int i = this.f1003i;
        for (int i2 = 0; i != -1 && i2 < this.f995a; i2++) {
            float[] fArr = this.f1002h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f1001g[i];
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m895k(SolverVariable solverVariable, C0208c c0208c) {
        return solverVariable.f994j <= 1;
    }

    /* JADX INFO: renamed from: l */
    public final void m896l(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            m897m(solverVariable, true);
            return;
        }
        int i = this.f1003i;
        if (i == -1) {
            this.f1003i = 0;
            this.f1002h[0] = f;
            this.f1000f[0] = solverVariable.f986b;
            this.f1001g[0] = -1;
            solverVariable.f994j++;
            solverVariable.m880a(this.f996b);
            this.f995a++;
            if (this.f1005k) {
                return;
            }
            int i2 = this.f1004j + 1;
            this.f1004j = i2;
            int[] iArr = this.f1000f;
            if (i2 >= iArr.length) {
                this.f1005k = true;
                this.f1004j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f995a; i4++) {
            int i5 = this.f1000f[i];
            int i6 = solverVariable.f986b;
            if (i5 == i6) {
                this.f1002h[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f1001g[i];
        }
        int length = this.f1004j;
        int i7 = length + 1;
        if (this.f1005k) {
            int[] iArr2 = this.f1000f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f1000f;
        if (length >= iArr3.length && this.f995a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f1000f;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f1000f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f998d * 2;
            this.f998d = i9;
            this.f1005k = false;
            this.f1004j = length - 1;
            this.f1002h = Arrays.copyOf(this.f1002h, i9);
            this.f1000f = Arrays.copyOf(this.f1000f, this.f998d);
            this.f1001g = Arrays.copyOf(this.f1001g, this.f998d);
        }
        this.f1000f[length] = solverVariable.f986b;
        this.f1002h[length] = f;
        int[] iArr6 = this.f1001g;
        if (i3 != -1) {
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            iArr6[length] = this.f1003i;
            this.f1003i = length;
        }
        solverVariable.f994j++;
        solverVariable.m880a(this.f996b);
        int i10 = this.f995a + 1;
        this.f995a = i10;
        if (!this.f1005k) {
            this.f1004j++;
        }
        int[] iArr7 = this.f1000f;
        if (i10 >= iArr7.length) {
            this.f1005k = true;
        }
        if (this.f1004j >= iArr7.length) {
            this.f1005k = true;
            this.f1004j = iArr7.length - 1;
        }
    }

    /* JADX INFO: renamed from: m */
    public final float m897m(SolverVariable solverVariable, boolean z) {
        if (this.f999e == solverVariable) {
            this.f999e = null;
        }
        int i = this.f1003i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f995a) {
            if (this.f1000f[i] == solverVariable.f986b) {
                int i4 = this.f1003i;
                int[] iArr = this.f1001g;
                if (i == i4) {
                    this.f1003i = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.m881c(this.f996b);
                }
                solverVariable.f994j--;
                this.f995a--;
                this.f1000f[i] = -1;
                if (this.f1005k) {
                    this.f1004j = i;
                }
                return this.f1002h[i];
            }
            i2++;
            i3 = i;
            i = this.f1001g[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: n */
    public final void m898n(C0207b c0207b, C0207b c0207b2, boolean z) {
        int i = this.f1003i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f995a; i2++) {
                int i3 = this.f1000f[i];
                SolverVariable solverVariable = c0207b2.f1006a;
                if (i3 == solverVariable.f986b) {
                    float f = this.f1002h[i];
                    m897m(solverVariable, z);
                    C0206a c0206a = c0207b2.f1009d;
                    int i4 = c0206a.f1003i;
                    for (int i5 = 0; i4 != -1 && i5 < c0206a.f995a; i5++) {
                        m885a(this.f997c.f191361c[c0206a.f1000f[i4]], c0206a.f1002h[i4] * f, z);
                        i4 = c0206a.f1001g[i4];
                    }
                    c0207b.f1007b += c0207b2.f1007b * f;
                    if (z) {
                        c0207b2.f1006a.m881c(c0207b);
                    }
                    i = this.f1003i;
                } else {
                    i = this.f1001g[i];
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m899o(C0207b c0207b, C0207b[] c0207bArr) {
        int i = this.f1003i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f995a; i2++) {
                SolverVariable solverVariable = this.f997c.f191361c[this.f1000f[i]];
                if (solverVariable.f987c != -1) {
                    float f = this.f1002h[i];
                    m897m(solverVariable, true);
                    C0207b c0207b2 = c0207bArr[solverVariable.f987c];
                    if (!c0207b2.f1010e) {
                        C0206a c0206a = c0207b2.f1009d;
                        int i3 = c0206a.f1003i;
                        for (int i4 = 0; i3 != -1 && i4 < c0206a.f995a; i4++) {
                            m885a(this.f997c.f191361c[c0206a.f1000f[i3]], c0206a.f1002h[i3] * f, true);
                            i3 = c0206a.f1001g[i3];
                        }
                    }
                    c0207b.f1007b += c0207b2.f1007b * f;
                    c0207b2.f1006a.m881c(c0207b);
                    i = this.f1003i;
                } else {
                    i = this.f1001g[i];
                }
            }
            return;
        }
    }

    public String toString() {
        int i = this.f1003i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f995a; i2++) {
            str = (str.concat(" -> ") + this.f1002h[i] + " : ") + this.f997c.f191361c[this.f1000f[i]];
            i = this.f1001g[i];
        }
        return str;
    }
}
