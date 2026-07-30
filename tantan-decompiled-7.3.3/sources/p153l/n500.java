package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class n500 extends or2 {

    /* JADX INFO: renamed from: c */
    public long f140273c;

    /* JADX INFO: renamed from: d */
    public String f140274d;

    /* JADX INFO: renamed from: e */
    public String f140275e;

    @Override // p153l.or2
    /* JADX INFO: renamed from: e */
    public void mo134679e(boolean z) {
        if (z) {
            return;
        }
        this.f140273c = pzi0.m174454o();
        this.f140274d = this.f140275e;
    }

    @Override // p153l.or2
    /* JADX INFO: renamed from: f */
    public boolean mo134680f(String str, @Nullable rz4.C19938a c19938a) {
        this.f140275e = str;
        long jM174454o = pzi0.m174454o();
        if (jM174454o - this.f140273c < zrv.m221193k().m203690o4() * 1000) {
            return str.equals(this.f140274d);
        }
        return false;
    }
}
