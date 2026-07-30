package p003l;

import java.util.ArrayList;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class t9e implements n9e {

    /* JADX INFO: renamed from: a */
    public final List<n9e> f7423a = new ArrayList();

    @Override // p003l.n9e
    /* JADX INFO: renamed from: a */
    public void mo6529a() {
        vwb.z(this.f7423a, new e30() { // from class: l.p9e
            @Override // p003l.e30
            public final void call(Object obj) {
                ((n9e) obj).mo6529a();
            }
        });
    }

    @Override // p003l.n9e
    /* JADX INFO: renamed from: b */
    public void mo6530b(final float f, final float f2) {
        vwb.z(this.f7423a, new e30() { // from class: l.r9e
            @Override // p003l.e30
            public final void call(Object obj) {
                ((n9e) obj).mo6530b(f, f2);
            }
        });
    }

    @Override // p003l.td50
    /* JADX INFO: renamed from: c */
    public void mo929c(final float f, final float f2) {
        vwb.z(this.f7423a, new e30() { // from class: l.q9e
            @Override // p003l.e30
            public final void call(Object obj) {
                ((n9e) obj).mo929c(f, f2);
            }
        });
    }

    @Override // p003l.td50
    /* JADX INFO: renamed from: d */
    public void mo930d() {
        vwb.z(this.f7423a, new e30() { // from class: l.s9e
            @Override // p003l.e30
            public final void call(Object obj) {
                ((n9e) obj).mo930d();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m7706g(n9e n9eVar) {
        this.f7423a.add(n9eVar);
    }
}
