package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import l.bwr;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a7e<D extends ho2> extends uj2<D, f7e> {

    /* JADX INFO: renamed from: j */
    public LongLinkLiveDownBox.LiveAccessChannel f7431j;

    /* JADX INFO: renamed from: k */
    public final f7e f7432k;

    public a7e(bsm<D> bsmVar) {
        super(bsmVar);
        this.f7432k = new f7e();
    }

    /* JADX INFO: renamed from: T3 */
    public static zql m9445T3(bsm bsmVar, LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        return new j6e(bsmVar, liveAccessChannel, "DOWN_BOX_TYPE");
    }

    @Override // p002l.uj2
    /* JADX INFO: renamed from: M3 */
    public String getItemType() {
        return "DOWN_BOX_TYPE";
    }

    /* JADX INFO: renamed from: U3 */
    public void m9447U3(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        this.f7431j = liveAccessChannel;
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        ((f7e) ((bwr) this).viewModel).m12986u();
        ((f7e) ((bwr) this).viewModel).m12984q();
        super.mo5949n();
        l6e.m17017c(this);
    }

    /* JADX INFO: renamed from: t */
    public void m9448t() {
        super.t();
        C(this.f7432k);
        ((f7e) ((bwr) this).viewModel).m12985s(this.f7431j, this.f22037f);
    }
}
