package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import p149l.pn40;

/* JADX INFO: loaded from: classes4.dex */
public class j6e<D extends pn40> implements zql {

    /* JADX INFO: renamed from: a */
    public bsm<D> f116441a;

    /* JADX INFO: renamed from: b */
    public LongLinkLiveDownBox.LiveAccessChannel f116442b;

    /* JADX INFO: renamed from: c */
    public final String f116443c;

    public j6e(bsm<D> bsmVar, LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, String str) {
        this.f116443c = str;
        this.f116441a = bsmVar;
        this.f116442b = liveAccessChannel;
    }

    @Override // p149l.zql
    /* JADX INFO: renamed from: a */
    public uj2 mo139948a(uj2 uj2Var) {
        if (uj2Var == null) {
            a7e a7eVar = new a7e(this.f116441a);
            a7eVar.m95287U3(this.f116442b);
            return a7eVar;
        }
        if (uj2Var instanceof a7e) {
            ((a7e) uj2Var).m95287U3(this.f116442b);
            return uj2Var;
        }
        a7e a7eVar2 = new a7e(this.f116441a);
        a7eVar2.m95287U3(this.f116442b);
        return a7eVar2;
    }

    @Override // p149l.zql
    public String type() {
        return this.f116443c;
    }
}
