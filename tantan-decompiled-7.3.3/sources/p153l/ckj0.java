package p153l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ckj0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f82286a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f82287b;

    /* JADX INFO: renamed from: c */
    public int f82288c;

    /* JADX INFO: renamed from: d */
    public long f82289d;

    /* JADX INFO: renamed from: e */
    public int f82290e;

    /* JADX INFO: renamed from: f */
    public int f82291f;

    /* JADX INFO: renamed from: g */
    public int f82292g;

    /* JADX INFO: renamed from: a */
    public void m110341a(qfj0 qfj0Var, @Nullable qfj0.C19562a c19562a) {
        if (this.f82288c > 0) {
            qfj0Var.mo11163a(this.f82289d, this.f82290e, this.f82291f, this.f82292g, c19562a);
            this.f82288c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m110342b() {
        this.f82287b = false;
        this.f82288c = 0;
    }

    /* JADX INFO: renamed from: c */
    public void m110343c(qfj0 qfj0Var, long j, int i, int i2, int i3, @Nullable qfj0.C19562a c19562a) {
        w11.m204372h(this.f82292g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f82287b) {
            int i4 = this.f82288c;
            int i5 = i4 + 1;
            this.f82288c = i5;
            if (i4 == 0) {
                this.f82289d = j;
                this.f82290e = i;
                this.f82291f = 0;
            }
            this.f82291f += i2;
            this.f82292g = i3;
            if (i5 >= 16) {
                m110341a(qfj0Var, c19562a);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m110344d(asf asfVar) throws IOException {
        if (this.f82287b) {
            return;
        }
        asfVar.mo99900f(this.f82286a, 0, 10);
        asfVar.mo99902h();
        if (C21775z8.m218936j(this.f82286a) == 0) {
            return;
        }
        this.f82287b = true;
    }
}
