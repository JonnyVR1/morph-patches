package p153l;

import com.p051p1.mobile.putong.live.base.util.IntSet;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
public class gv80 extends kj1 {

    /* JADX INFO: renamed from: e */
    public final Random f106614e = new Random();

    @Override // p153l.kj1
    /* JADX INFO: renamed from: d */
    public void mo132518d(IntSet intSet) {
        ArrayList arrayListM147522n = jyb.m147522n(m149998b(intSet), new qcj() { // from class: l.ev80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((uxr) obj).m198509H().m172316a() >= 0.001f);
            }
        });
        uxr<?> uxrVarM149999c = m149999c(arrayListM147522n);
        List<uxr<?>> listM132521l = m132521l(arrayListM147522n);
        if (uxrVarM149999c != null && uxrVarM149999c.m198509H().m172316a() == m132520k(arrayListM147522n)) {
            uxrVarM149999c.toString();
            return;
        }
        if (uxrVarM149999c == null) {
            uxrVarM149999c = m149999c(this.f127059a.m68538J());
        }
        if (uxrVarM149999c != null) {
            uxrVarM149999c.toString();
            m150002g(uxrVarM149999c);
        }
        if (listM132521l.isEmpty()) {
            return;
        }
        if (this.f127061c || ConnectivityReceiver.m82472l()) {
            uxr<?> uxrVar = listM132521l.get(this.f106614e.nextInt(listM132521l.size()));
            uxrVar.toString();
            m150001f(uxrVar);
        }
    }

    @Override // p153l.kj1
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void mo132519h() {
        super.mo132519h();
    }

    /* JADX INFO: renamed from: k */
    public final float m132520k(Collection<uxr<?>> collection) {
        if (collection.isEmpty()) {
            return -2.1474836E9f;
        }
        return m132521l(collection).get(0).m198509H().m172316a();
    }

    /* JADX INFO: renamed from: l */
    public final List<uxr<?>> m132521l(Collection<uxr<?>> collection) {
        return x7s.m209648u0(collection, new qcj() { // from class: l.fv80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Float.valueOf(((uxr) obj).m198509H().m172316a());
            }
        });
    }
}
