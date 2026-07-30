package p153l;

import com.p051p1.mobile.putong.live.base.util.IntSet;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes13.dex */
public class dv80 extends ij1 {

    /* JADX INFO: renamed from: e */
    public final Random f90919e = new Random();

    @Override // p153l.ij1
    /* JADX INFO: renamed from: d */
    public void mo118266d(IntSet intSet) {
        ArrayList arrayListM147522n = jyb.m147522n(m140174b(intSet), new qcj() { // from class: l.bv80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((z0u) obj).m218164a() >= 0.001f);
            }
        });
        z0u<?> z0uVarM140175c = m140175c(arrayListM147522n);
        List<z0u<?>> listM118269l = m118269l(arrayListM147522n);
        if (z0uVarM140175c != null && z0uVarM140175c.m218164a() == m118268k(arrayListM147522n)) {
            z0uVarM140175c.toString();
            return;
        }
        if (z0uVarM140175c == null) {
            z0uVarM140175c = m140175c(this.f115163a.m68538J());
        }
        if (z0uVarM140175c != null) {
            z0uVarM140175c.toString();
            m140178g(z0uVarM140175c);
        }
        if (listM118269l.isEmpty()) {
            return;
        }
        if (this.f115165c || ConnectivityReceiver.m82472l()) {
            z0u<?> z0uVar = listM118269l.get(this.f90919e.nextInt(listM118269l.size()));
            z0uVar.toString();
            m140177f(z0uVar);
        }
    }

    @Override // p153l.ij1
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void mo118267h() {
        super.mo118267h();
    }

    /* JADX INFO: renamed from: k */
    public final float m118268k(Collection<z0u<?>> collection) {
        if (collection.isEmpty()) {
            return -2.1474836E9f;
        }
        return m118269l(collection).get(0).m218164a();
    }

    /* JADX INFO: renamed from: l */
    public final List<z0u<?>> m118269l(Collection<z0u<?>> collection) {
        return x7s.m209648u0(collection, new qcj() { // from class: l.cv80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Float.valueOf(((z0u) obj).m218164a());
            }
        });
    }
}
