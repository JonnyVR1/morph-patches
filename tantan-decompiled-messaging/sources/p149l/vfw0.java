package p149l;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vfw0 extends pew0 {

    /* JADX INFO: renamed from: c */
    public final CharSequence f181318c;

    /* JADX INFO: renamed from: d */
    public final vew0 f181319d;

    /* JADX INFO: renamed from: e */
    public int f181320e = 0;

    /* JADX INFO: renamed from: f */
    public int f181321f = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public vfw0(xfw0 xfw0Var, CharSequence charSequence) {
        this.f181319d = xfw0Var.f192723a;
        this.f181318c = charSequence;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo174374b(int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo174375c(int i);

    @Override // p149l.pew0
    public final /* bridge */ /* synthetic */ Object zza() {
        int iMo174374b;
        int i = this.f181320e;
        while (true) {
            int i2 = this.f181320e;
            if (i2 == -1) {
                m168561a();
                return null;
            }
            int iMo174375c = mo174375c(i2);
            if (iMo174375c == -1) {
                iMo174375c = this.f181318c.length();
                this.f181320e = -1;
                iMo174374b = -1;
            } else {
                iMo174374b = mo174374b(iMo174375c);
                this.f181320e = iMo174374b;
            }
            if (iMo174374b != i) {
                if (i < iMo174375c) {
                    this.f181318c.charAt(i);
                }
                if (i < iMo174375c) {
                    this.f181318c.charAt(iMo174375c - 1);
                }
                int i3 = this.f181321f;
                if (i3 == 1) {
                    iMo174375c = this.f181318c.length();
                    this.f181320e = -1;
                    if (iMo174375c > i) {
                        this.f181318c.charAt(iMo174375c - 1);
                    }
                } else {
                    this.f181321f = i3 - 1;
                }
                return this.f181318c.subSequence(i, iMo174375c).toString();
            }
            int i4 = iMo174374b + 1;
            this.f181320e = i4;
            if (i4 > this.f181318c.length()) {
                this.f181320e = -1;
            }
        }
    }
}
