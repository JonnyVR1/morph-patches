package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.e30;
import l.ffw;
import l.j760;
import l.s7m;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zwi extends h4t<ho2, zwi> implements s7m<zwi> {
    public zwi(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: M3 */
    public final j760<Boolean, Boolean> m27672M3(String str) {
        j760<Boolean, String> j760VarM25539b = wwi.m25538a().m25539b();
        int iM25540c = wwi.m25538a().m25540c();
        if (j760VarM25539b == null || !str.equals(j760VarM25539b.b) || iM25540c <= 0) {
            wwi.m25538a().m25541d(null);
            Boolean bool = Boolean.FALSE;
            return vwb.Y(bool, bool);
        }
        wwi.m25538a().m25542e(iM25540c - 1);
        wwi.m25538a().m25541d(null);
        return vwb.Y(Boolean.TRUE, (Boolean) j760VarM25539b.a);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ j760 m27673N3(rti rtiVar) {
        return m27672M3(rtiVar.m22125e());
    }

    /* JADX INFO: renamed from: T */
    public void m27674T() {
        super.T();
        m14188d3(rti.class, new w9j() { // from class: l.xwi
            public final Object call(Object obj) {
                return this.f22492a.m27673N3((rti) obj);
            }
        });
        duringCreated((c) m25548F2().AvatarEvent.onScrollNext().g()).subscribe(ffw.d(new e30() { // from class: l.ywi
            public final void call(Object obj) {
                wwi.m25538a().m25541d((j760) obj);
            }
        }));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: L3, reason: merged with bridge method [inline-methods] */
    public void m27675i1(zwi zwiVar) {
    }
}
