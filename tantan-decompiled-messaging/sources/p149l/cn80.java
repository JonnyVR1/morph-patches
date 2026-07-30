package p149l;

import com.p046p1.mobile.putong.live.base.util.IntSet;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes13.dex */
public class cn80 extends dj1 {

    /* JADX INFO: renamed from: e */
    public final Random f81654e = new Random();

    @Override // p149l.dj1
    /* JADX INFO: renamed from: d */
    public void mo107739d(IntSet intSet) {
        ArrayList arrayListM200339n = vwb.m200339n(m111971b(intSet), new w9j() { // from class: l.an80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((tvr) obj).m190776H().m174379a() >= 0.001f);
            }
        });
        tvr<?> tvrVarM111972c = m111972c(arrayListM200339n);
        List<tvr<?>> listM107742l = m107742l(arrayListM200339n);
        if (tvrVarM111972c != null && tvrVarM111972c.m190776H().m174379a() == m107741k(arrayListM200339n)) {
            tvrVarM111972c.toString();
            return;
        }
        if (tvrVarM111972c == null) {
            tvrVarM111972c = m111972c(this.f86472a.m67355J());
        }
        if (tvrVarM111972c != null) {
            tvrVarM111972c.toString();
            m111975g(tvrVarM111972c);
        }
        if (listM107742l.isEmpty()) {
            return;
        }
        if (this.f86474c || ConnectivityReceiver.m81289l()) {
            tvr<?> tvrVar = listM107742l.get(this.f81654e.nextInt(listM107742l.size()));
            tvrVar.toString();
            m111974f(tvrVar);
        }
    }

    @Override // p149l.dj1
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void mo107740h() {
        super.mo107740h();
    }

    /* JADX INFO: renamed from: k */
    public final float m107741k(Collection<tvr<?>> collection) {
        if (collection.isEmpty()) {
            return -2.1474836E9f;
        }
        return m107742l(collection).get(0).m190776H().m174379a();
    }

    /* JADX INFO: renamed from: l */
    public final List<tvr<?>> m107742l(Collection<tvr<?>> collection) {
        return w5s.m201684u0(collection, new w9j() { // from class: l.bn80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Float.valueOf(((tvr) obj).m190776H().m174379a());
            }
        });
    }
}
