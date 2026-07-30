package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sh2 extends wq4<List<LiveMessage>, xaj0<LiveMessage, List<LiveMessage>, j760<Integer, Integer>>> {

    /* JADX INFO: renamed from: c */
    public boolean f164509c = false;

    /* JADX INFO: renamed from: e */
    public abstract List<LiveMessage> mo134048e(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo134049f();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p149l.wq4
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final List<LiveMessage> mo159820b(xaj0<LiveMessage, List<LiveMessage>, j760<Integer, Integer>> xaj0Var) {
        LiveMessage liveMessage = xaj0Var.f191751a;
        List<LiveMessage> list = xaj0Var.f191752b;
        j760<Integer, Integer> j760Var = xaj0Var.f191753c;
        List<LiveMessage> listMo134048e = mo134048e(liveMessage, list, j760Var);
        wq4<R, T> wq4Var = this.f187639a;
        if (wq4Var != 0) {
            listMo134048e = (List) wq4Var.mo159820b((T) new xaj0(liveMessage, listMo134048e, j760Var));
        }
        boolean z = mo134049f() || this.f164509c;
        wq4<R, T> wq4Var2 = this.f187640b;
        if (wq4Var2 != 0 && z) {
            ((sh2) wq4Var2).m184153h(z);
        } else if (wq4Var2 == 0 && !z) {
            listMo134048e.add(liveMessage);
        }
        this.f164509c = false;
        return listMo134048e;
    }

    /* JADX INFO: renamed from: h */
    public final void m184153h(boolean z) {
        this.f164509c = z;
    }
}
