package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class t0u extends v0u<w0u> {

    /* JADX INFO: renamed from: g */
    public boolean f167210g;

    public t0u(mcr mcrVar, C22306c<Boolean> c22306c, mss mssVar) {
        super(mcrVar, c22306c, mssVar);
    }

    /* JADX INFO: renamed from: T2 */
    public String m186874T2() {
        return (String) m151646N2(new dts());
    }

    /* JADX INFO: renamed from: U2 */
    public void m186875U2(boolean z) {
        if (!z) {
            gld0<jj3> gld0Var = gld0.f103314d;
            if (!((jj3) s9s.m182763m(gld0Var)).f118220a.get().booleanValue()) {
                ((jj3) s9s.m182763m(gld0Var)).f118220a.put(Boolean.TRUE);
            }
            if (!this.f167210g) {
                this.f167210g = true;
                s2u.f162012e.onNext(Boolean.FALSE);
            }
        }
        s2u.m182081m(z);
    }
}
