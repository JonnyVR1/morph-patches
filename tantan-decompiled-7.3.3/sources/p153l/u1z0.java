package p153l;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u1z0 extends tyx0 {

    /* JADX INFO: renamed from: c */
    public final CharSequence f177157c;

    /* JADX INFO: renamed from: d */
    public final mky0 f177158d;

    /* JADX INFO: renamed from: e */
    public final boolean f177159e;

    /* JADX INFO: renamed from: f */
    public int f177160f = 0;

    /* JADX INFO: renamed from: g */
    public int f177161g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public u1z0(k3z0 k3z0Var, CharSequence charSequence) {
        this.f177158d = k3z0Var.f123801a;
        this.f177159e = k3z0Var.f123802b;
        this.f177157c = charSequence;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo194228b(int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo194229c(int i);

    @Override // p153l.tyx0
    public final /* bridge */ /* synthetic */ Object zza() {
        int iMo194228b;
        int i = this.f177160f;
        while (true) {
            int i2 = this.f177160f;
            if (i2 == -1) {
                m193631a();
                return null;
            }
            int iMo194229c = mo194229c(i2);
            if (iMo194229c == -1) {
                iMo194229c = this.f177157c.length();
                this.f177160f = -1;
                iMo194228b = -1;
            } else {
                iMo194228b = mo194228b(iMo194229c);
                this.f177160f = iMo194228b;
            }
            if (iMo194228b == i) {
                int i3 = iMo194228b + 1;
                this.f177160f = i3;
                if (i3 > this.f177157c.length()) {
                    this.f177160f = -1;
                }
            } else {
                if (i < iMo194229c) {
                    this.f177157c.charAt(i);
                }
                if (i < iMo194229c) {
                    this.f177157c.charAt(iMo194229c - 1);
                }
                if (!this.f177159e || i != iMo194229c) {
                    int i4 = this.f177161g;
                    if (i4 == 1) {
                        iMo194229c = this.f177157c.length();
                        this.f177160f = -1;
                        if (iMo194229c > i) {
                            this.f177157c.charAt(iMo194229c - 1);
                        }
                    } else {
                        this.f177161g = i4 - 1;
                    }
                    return this.f177157c.subSequence(i, iMo194229c).toString();
                }
                i = this.f177160f;
            }
        }
    }
}
