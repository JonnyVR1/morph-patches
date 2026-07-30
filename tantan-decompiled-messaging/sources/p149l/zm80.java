package p149l;

import com.p046p1.mobile.putong.live.base.util.IntSet;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes13.dex */
public class zm80 extends bj1 {

    /* JADX INFO: renamed from: e */
    public final Random f203703e = new Random();

    @Override // p149l.bj1
    /* JADX INFO: renamed from: d */
    public void mo102139d(IntSet intSet) {
        ArrayList arrayListM200339n = vwb.m200339n(m102137b(intSet), new w9j() { // from class: l.xm80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((yyt) obj).m216567a() >= 0.001f);
            }
        });
        yyt<?> yytVarM102138c = m102138c(arrayListM200339n);
        List<yyt<?>> listM219317l = m219317l(arrayListM200339n);
        if (yytVarM102138c != null && yytVarM102138c.m216567a() == m219316k(arrayListM200339n)) {
            yytVarM102138c.toString();
            return;
        }
        if (yytVarM102138c == null) {
            yytVarM102138c = m102138c(this.f75853a.m67355J());
        }
        if (yytVarM102138c != null) {
            yytVarM102138c.toString();
            m102142g(yytVarM102138c);
        }
        if (listM219317l.isEmpty()) {
            return;
        }
        if (this.f75855c || ConnectivityReceiver.m81289l()) {
            yyt<?> yytVar = listM219317l.get(this.f203703e.nextInt(listM219317l.size()));
            yytVar.toString();
            m102141f(yytVar);
        }
    }

    @Override // p149l.bj1
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void mo102143h() {
        super.mo102143h();
    }

    /* JADX INFO: renamed from: k */
    public final float m219316k(Collection<yyt<?>> collection) {
        if (collection.isEmpty()) {
            return -2.1474836E9f;
        }
        return m219317l(collection).get(0).m216567a();
    }

    /* JADX INFO: renamed from: l */
    public final List<yyt<?>> m219317l(Collection<yyt<?>> collection) {
        return w5s.m201684u0(collection, new w9j() { // from class: l.ym80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Float.valueOf(((yyt) obj).m216567a());
            }
        });
    }
}
