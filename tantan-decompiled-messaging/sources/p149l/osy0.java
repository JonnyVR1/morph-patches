package p149l;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes6.dex */
public abstract class osy0 extends npx0 {

    /* JADX INFO: renamed from: c */
    public final CharSequence f145520c;

    /* JADX INFO: renamed from: d */
    public final gby0 f145521d;

    /* JADX INFO: renamed from: e */
    public final boolean f145522e;

    /* JADX INFO: renamed from: f */
    public int f145523f = 0;

    /* JADX INFO: renamed from: g */
    public int f145524g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public osy0(euy0 euy0Var, CharSequence charSequence) {
        this.f145521d = euy0Var.f93292a;
        this.f145522e = euy0Var.f93293b;
        this.f145520c = charSequence;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo165915b(int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo165916c(int i);

    @Override // p149l.npx0
    public final /* bridge */ /* synthetic */ Object zza() {
        int iMo165915b;
        int i = this.f145523f;
        while (true) {
            int i2 = this.f145523f;
            if (i2 == -1) {
                m160550a();
                return null;
            }
            int iMo165916c = mo165916c(i2);
            if (iMo165916c == -1) {
                iMo165916c = this.f145520c.length();
                this.f145523f = -1;
                iMo165915b = -1;
            } else {
                iMo165915b = mo165915b(iMo165916c);
                this.f145523f = iMo165915b;
            }
            if (iMo165915b == i) {
                int i3 = iMo165915b + 1;
                this.f145523f = i3;
                if (i3 > this.f145520c.length()) {
                    this.f145523f = -1;
                }
            } else {
                if (i < iMo165916c) {
                    this.f145520c.charAt(i);
                }
                if (i < iMo165916c) {
                    this.f145520c.charAt(iMo165916c - 1);
                }
                if (!this.f145522e || i != iMo165916c) {
                    int i4 = this.f145524g;
                    if (i4 == 1) {
                        iMo165916c = this.f145520c.length();
                        this.f145523f = -1;
                        if (iMo165916c > i) {
                            this.f145520c.charAt(iMo165916c - 1);
                        }
                    } else {
                        this.f145524g = i4 - 1;
                    }
                    return this.f145520c.subSequence(i, iMo165916c).toString();
                }
                i = this.f145523f;
            }
        }
    }
}
