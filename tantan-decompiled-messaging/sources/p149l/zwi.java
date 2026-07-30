package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class zwi extends h4t<ho2, zwi> implements s7m<zwi> {
    public zwi(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: M3 */
    public final j760<Boolean, Boolean> m220595M3(String str) {
        j760<Boolean, String> j760VarM205869b = wwi.m205868a().m205869b();
        int iM205870c = wwi.m205868a().m205870c();
        if (j760VarM205869b == null || !str.equals(j760VarM205869b.f116565b) || iM205870c <= 0) {
            wwi.m205868a().m205871d(null);
            Boolean bool = Boolean.FALSE;
            return vwb.m200311Y(bool, bool);
        }
        wwi.m205868a().m205872e(iM205870c - 1);
        wwi.m205868a().m205871d(null);
        return vwb.m200311Y(Boolean.TRUE, j760VarM205869b.f116564a);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ j760 m220596N3(rti rtiVar) {
        return m220595M3(rtiVar.m180786e());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(rti.class, new w9j() { // from class: l.xwi
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f194734a.m220596N3((rti) obj);
            }
        });
        duringCreated(m206028F2().AvatarEvent.onScrollNext().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ywi
            @Override // p149l.e30
            public final void call(Object obj) {
                wwi.m205868a().m205871d((j760) obj);
            }
        }));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: L3, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zwi zwiVar) {
    }
}
