package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;
import l.j760;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class sh2 extends wq4<List<LiveMessage>, xaj0<LiveMessage, List<LiveMessage>, j760<Integer, Integer>>> {

    /* JADX INFO: renamed from: c */
    public boolean f19018c = false;

    /* JADX INFO: renamed from: e */
    public abstract List<LiveMessage> mo14986e(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo14987f();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p002l.wq4
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final List<LiveMessage> mo18825b(xaj0<LiveMessage, List<LiveMessage>, j760<Integer, Integer>> xaj0Var) {
        LiveMessage liveMessage = (LiveMessage) xaj0Var.a;
        List<LiveMessage> list = (List) xaj0Var.b;
        j760<Integer, Integer> j760Var = (j760) xaj0Var.c;
        List<LiveMessage> listMo14986e = mo14986e(liveMessage, list, j760Var);
        wq4<R, T> wq4Var = this.f21908a;
        if (wq4Var != 0) {
            listMo14986e = (List) wq4Var.mo18825b((T) new xaj0(liveMessage, listMo14986e, j760Var));
        }
        boolean z = mo14987f() || this.f19018c;
        wq4<R, T> wq4Var2 = this.f21909b;
        if (wq4Var2 != 0 && z) {
            ((sh2) wq4Var2).m22469h(z);
        } else if (wq4Var2 == 0 && !z) {
            listMo14986e.add(liveMessage);
        }
        this.f19018c = false;
        return listMo14986e;
    }

    /* JADX INFO: renamed from: h */
    public final void m22469h(boolean z) {
        this.f19018c = z;
    }
}
