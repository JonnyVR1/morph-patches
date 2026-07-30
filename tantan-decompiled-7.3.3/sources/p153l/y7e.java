package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import p153l.dw40;

/* JADX INFO: loaded from: classes4.dex */
public class y7e<D extends dw40> implements mtl {

    /* JADX INFO: renamed from: a */
    public dum<D> f197775a;

    /* JADX INFO: renamed from: b */
    public LongLinkLiveDownBox.LiveAccessChannel f197776b;

    /* JADX INFO: renamed from: c */
    public final String f197777c;

    public y7e(dum<D> dumVar, LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel, String str) {
        this.f197777c = str;
        this.f197775a = dumVar;
        this.f197776b = liveAccessChannel;
    }

    @Override // p153l.mtl
    /* JADX INFO: renamed from: a */
    public ck2 mo160019a(ck2 ck2Var) {
        if (ck2Var == null) {
            p8e p8eVar = new p8e(this.f197775a);
            p8eVar.m171239U3(this.f197776b);
            return p8eVar;
        }
        if (ck2Var instanceof p8e) {
            ((p8e) ck2Var).m171239U3(this.f197776b);
            return ck2Var;
        }
        p8e p8eVar2 = new p8e(this.f197775a);
        p8eVar2.m171239U3(this.f197776b);
        return p8eVar2;
    }

    @Override // p153l.mtl
    public String type() {
        return this.f197777c;
    }
}
