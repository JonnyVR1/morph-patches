package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class rny0 extends osy0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ jpy0 f160339h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rny0(jpy0 jpy0Var, euy0 euy0Var, CharSequence charSequence) {
        super(euy0Var, charSequence);
        this.f160339h = jpy0Var;
    }

    @Override // p149l.osy0
    /* JADX INFO: renamed from: b */
    public final int mo165915b(int i) {
        return i + 1;
    }

    @Override // p149l.osy0
    /* JADX INFO: renamed from: c */
    public final int mo165916c(int i) {
        CharSequence charSequence = this.f145520c;
        int length = charSequence.length();
        nly0.m160081b(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            jpy0 jpy0Var = this.f160339h;
            if (jpy0Var.f119243a.mo125350a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
