package p149l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class d850 {

    /* JADX INFO: renamed from: a */
    public final e850 f84823a = new e850();

    /* JADX INFO: renamed from: b */
    public final d860 f84824b = new d860(new byte[65025], 0);

    /* JADX INFO: renamed from: c */
    public int f84825c = -1;

    /* JADX INFO: renamed from: d */
    public int f84826d;

    /* JADX INFO: renamed from: e */
    public boolean f84827e;

    /* JADX INFO: renamed from: a */
    public final int m110265a(int i) {
        int i2;
        int i3 = 0;
        this.f84826d = 0;
        do {
            int i4 = this.f84826d;
            int i5 = i + i4;
            e850 e850Var = this.f84823a;
            if (i5 >= e850Var.f89800g) {
                break;
            }
            int[] iArr = e850Var.f89803j;
            this.f84826d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public e850 m110266b() {
        return this.f84823a;
    }

    /* JADX INFO: renamed from: c */
    public d860 m110267c() {
        return this.f84824b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m110268d(tqf tqfVar) throws IOException {
        int i;
        p11.m167013g(tqfVar != null);
        if (this.f84827e) {
            this.f84827e = false;
            this.f84824b.m110288Q(0);
        }
        while (!this.f84827e) {
            if (this.f84825c < 0) {
                if (!this.f84823a.m115241c(tqfVar) || !this.f84823a.m115239a(tqfVar, true)) {
                    return false;
                }
                e850 e850Var = this.f84823a;
                int iM110265a = e850Var.f89801h;
                if ((e850Var.f89795b & 1) == 1 && this.f84824b.m110301g() == 0) {
                    iM110265a += m110265a(0);
                    i = this.f84826d;
                } else {
                    i = 0;
                }
                if (!vqf.m199486e(tqfVar, iM110265a)) {
                    return false;
                }
                this.f84825c = i;
            }
            int iM110265a2 = m110265a(this.f84825c);
            int i2 = this.f84825c + this.f84826d;
            if (iM110265a2 > 0) {
                d860 d860Var = this.f84824b;
                d860Var.m110297c(d860Var.m110301g() + iM110265a2);
                if (!vqf.m199485d(tqfVar, this.f84824b.m110299e(), this.f84824b.m110301g(), iM110265a2)) {
                    return false;
                }
                d860 d860Var2 = this.f84824b;
                d860Var2.m110291T(d860Var2.m110301g() + iM110265a2);
                this.f84827e = this.f84823a.f89803j[i2 + (-1)] != 255;
            }
            if (i2 == this.f84823a.f89800g) {
                i2 = -1;
            }
            this.f84825c = i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m110269e() {
        this.f84823a.m115240b();
        this.f84824b.m110288Q(0);
        this.f84825c = -1;
        this.f84827e = false;
    }

    /* JADX INFO: renamed from: f */
    public void m110270f() {
        if (this.f84824b.m110299e().length == 65025) {
            return;
        }
        d860 d860Var = this.f84824b;
        d860Var.m110290S(Arrays.copyOf(d860Var.m110299e(), Math.max(65025, this.f84824b.m110301g())), this.f84824b.m110301g());
    }
}
