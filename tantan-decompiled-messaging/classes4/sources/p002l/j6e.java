package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import p002l.pn40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j6e<D extends pn40> implements zql {

    /* JADX INFO: renamed from: a */
    public bsm<D> f13603a;

    /* JADX INFO: renamed from: b */
    public LongLinkLiveDownBox.LiveAccessChannel f13604b;

    /* JADX INFO: renamed from: c */
    public final String f13605c;

    public j6e(bsm<D> bsmVar, LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, String str) {
        this.f13605c = str;
        this.f13603a = bsmVar;
        this.f13604b = liveAccessChannel;
    }

    @Override // p002l.zql
    /* JADX INFO: renamed from: a */
    public uj2 mo15668a(uj2 uj2Var) {
        if (uj2Var == null) {
            a7e a7eVar = new a7e(this.f13603a);
            a7eVar.m9447U3(this.f13604b);
            return a7eVar;
        }
        if (uj2Var instanceof a7e) {
            ((a7e) uj2Var).m9447U3(this.f13604b);
            return uj2Var;
        }
        a7e a7eVar2 = new a7e(this.f13603a);
        a7eVar2.m9447U3(this.f13604b);
        return a7eVar2;
    }

    @Override // p002l.zql
    public String type() {
        return this.f13605c;
    }
}
