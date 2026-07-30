package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zh2 extends vr4<List<LiveMessage>, bkj0<LiveMessage, List<LiveMessage>, pf60<Integer, Integer>>> {

    /* JADX INFO: renamed from: c */
    public boolean f204371c = false;

    /* JADX INFO: renamed from: e */
    public abstract List<LiveMessage> mo100025e(LiveMessage liveMessage, List<LiveMessage> list, pf60<Integer, Integer> pf60Var);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo100026f();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p153l.vr4
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final List<LiveMessage> mo168854b(bkj0<LiveMessage, List<LiveMessage>, pf60<Integer, Integer>> bkj0Var) {
        LiveMessage liveMessage = bkj0Var.f77081a;
        List<LiveMessage> list = bkj0Var.f77082b;
        pf60<Integer, Integer> pf60Var = bkj0Var.f77083c;
        List<LiveMessage> listMo100025e = mo100025e(liveMessage, list, pf60Var);
        vr4<R, T> vr4Var = this.f185431a;
        if (vr4Var != 0) {
            listMo100025e = (List) vr4Var.mo168854b((T) new bkj0(liveMessage, listMo100025e, pf60Var));
        }
        boolean z = mo100026f() || this.f204371c;
        vr4<R, T> vr4Var2 = this.f185432b;
        if (vr4Var2 != 0 && z) {
            ((zh2) vr4Var2).m219684h(z);
        } else if (vr4Var2 == 0 && !z) {
            listMo100025e.add(liveMessage);
        }
        this.f204371c = false;
        return listMo100025e;
    }

    /* JADX INFO: renamed from: h */
    public final void m219684h(boolean z) {
        this.f204371c = z;
    }
}
