package p153l;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bpw0 extends vnw0 {

    /* JADX INFO: renamed from: c */
    public final CharSequence f77825c;

    /* JADX INFO: renamed from: d */
    public final bow0 f77826d;

    /* JADX INFO: renamed from: e */
    public int f77827e = 0;

    /* JADX INFO: renamed from: f */
    public int f77828f = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public bpw0(dpw0 dpw0Var, CharSequence charSequence) {
        this.f77826d = dpw0Var.f90092a;
        this.f77825c = charSequence;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo105853b(int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo105854c(int i);

    @Override // p153l.vnw0
    public final /* bridge */ /* synthetic */ Object zza() {
        int iMo105853b;
        int i = this.f77827e;
        while (true) {
            int i2 = this.f77827e;
            if (i2 == -1) {
                m202011a();
                return null;
            }
            int iMo105854c = mo105854c(i2);
            if (iMo105854c == -1) {
                iMo105854c = this.f77825c.length();
                this.f77827e = -1;
                iMo105853b = -1;
            } else {
                iMo105853b = mo105853b(iMo105854c);
                this.f77827e = iMo105853b;
            }
            if (iMo105853b != i) {
                if (i < iMo105854c) {
                    this.f77825c.charAt(i);
                }
                if (i < iMo105854c) {
                    this.f77825c.charAt(iMo105854c - 1);
                }
                int i3 = this.f77828f;
                if (i3 == 1) {
                    iMo105854c = this.f77825c.length();
                    this.f77827e = -1;
                    if (iMo105854c > i) {
                        this.f77825c.charAt(iMo105854c - 1);
                    }
                } else {
                    this.f77828f = i3 - 1;
                }
                return this.f77825c.subSequence(i, iMo105854c).toString();
            }
            int i4 = iMo105853b + 1;
            this.f77827e = i4;
            if (i4 > this.f77825c.length()) {
                this.f77827e = -1;
            }
        }
    }
}
