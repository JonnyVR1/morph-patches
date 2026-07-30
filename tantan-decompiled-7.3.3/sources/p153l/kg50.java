package p153l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class kg50 {

    /* JADX INFO: renamed from: a */
    public final lg50 f126575a = new lg50();

    /* JADX INFO: renamed from: b */
    public final ig60 f126576b = new ig60(new byte[65025], 0);

    /* JADX INFO: renamed from: c */
    public int f126577c = -1;

    /* JADX INFO: renamed from: d */
    public int f126578d;

    /* JADX INFO: renamed from: e */
    public boolean f126579e;

    /* JADX INFO: renamed from: a */
    public final int m149736a(int i) {
        int i2;
        int i3 = 0;
        this.f126578d = 0;
        do {
            int i4 = this.f126578d;
            int i5 = i + i4;
            lg50 lg50Var = this.f126575a;
            if (i5 >= lg50Var.f131937g) {
                break;
            }
            int[] iArr = lg50Var.f131940j;
            this.f126578d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public lg50 m149737b() {
        return this.f126575a;
    }

    /* JADX INFO: renamed from: c */
    public ig60 m149738c() {
        return this.f126576b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m149739d(asf asfVar) throws IOException {
        int i;
        w11.m204371g(asfVar != null);
        if (this.f126579e) {
            this.f126579e = false;
            this.f126576b.m139804Q(0);
        }
        while (!this.f126579e) {
            if (this.f126577c < 0) {
                if (!this.f126575a.m154062c(asfVar) || !this.f126575a.m154060a(asfVar, true)) {
                    return false;
                }
                lg50 lg50Var = this.f126575a;
                int iM149736a = lg50Var.f131938h;
                if ((lg50Var.f131932b & 1) == 1 && this.f126576b.m139817g() == 0) {
                    iM149736a += m149736a(0);
                    i = this.f126578d;
                } else {
                    i = 0;
                }
                if (!csf.m112180e(asfVar, iM149736a)) {
                    return false;
                }
                this.f126577c = i;
            }
            int iM149736a2 = m149736a(this.f126577c);
            int i2 = this.f126577c + this.f126578d;
            if (iM149736a2 > 0) {
                ig60 ig60Var = this.f126576b;
                ig60Var.m139813c(ig60Var.m139817g() + iM149736a2);
                if (!csf.m112179d(asfVar, this.f126576b.m139815e(), this.f126576b.m139817g(), iM149736a2)) {
                    return false;
                }
                ig60 ig60Var2 = this.f126576b;
                ig60Var2.m139807T(ig60Var2.m139817g() + iM149736a2);
                this.f126579e = this.f126575a.f131940j[i2 + (-1)] != 255;
            }
            if (i2 == this.f126575a.f131937g) {
                i2 = -1;
            }
            this.f126577c = i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m149740e() {
        this.f126575a.m154061b();
        this.f126576b.m139804Q(0);
        this.f126577c = -1;
        this.f126579e = false;
    }

    /* JADX INFO: renamed from: f */
    public void m149741f() {
        if (this.f126576b.m139815e().length == 65025) {
            return;
        }
        ig60 ig60Var = this.f126576b;
        ig60Var.m139806S(Arrays.copyOf(ig60Var.m139815e(), Math.max(65025, this.f126576b.m139817g())), this.f126576b.m139817g());
    }
}
