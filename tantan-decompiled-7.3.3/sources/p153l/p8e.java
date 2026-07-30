package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class p8e<D extends oo2> extends ck2<D, u8e> {

    /* JADX INFO: renamed from: j */
    public LongLinkLiveDownBox.LiveAccessChannel f151012j;

    /* JADX INFO: renamed from: k */
    public final u8e f151013k;

    public p8e(dum<D> dumVar) {
        super(dumVar);
        this.f151013k = new u8e();
    }

    /* JADX INFO: renamed from: T3 */
    public static mtl m171238T3(dum dumVar, LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        return new y7e(dumVar, liveAccessChannel, "DOWN_BOX_TYPE");
    }

    @Override // p153l.ck2
    /* JADX INFO: renamed from: M3 */
    public String getItemType() {
        return "DOWN_BOX_TYPE";
    }

    /* JADX INFO: renamed from: U3 */
    public void m171239U3(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        this.f151012j = liveAccessChannel;
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        ((u8e) this.viewModel).m195032u();
        ((u8e) this.viewModel).m195030q();
        super.mo70300n();
        a8e.m96450c(this);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        mo52715C(this.f151013k);
        ((u8e) this.viewModel).m195031s(this.f151012j, this.f196919f);
    }
}
