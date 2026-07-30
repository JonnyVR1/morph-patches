package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class a7e<D extends ho2> extends uj2<D, f7e> {

    /* JADX INFO: renamed from: j */
    public LongLinkLiveDownBox.LiveAccessChannel f67917j;

    /* JADX INFO: renamed from: k */
    public final f7e f67918k;

    public a7e(bsm<D> bsmVar) {
        super(bsmVar);
        this.f67918k = new f7e();
    }

    /* JADX INFO: renamed from: T3 */
    public static zql m95285T3(bsm bsmVar, LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        return new j6e(bsmVar, liveAccessChannel, "DOWN_BOX_TYPE");
    }

    @Override // p149l.uj2
    /* JADX INFO: renamed from: M3 */
    public String getItemType() {
        return "DOWN_BOX_TYPE";
    }

    /* JADX INFO: renamed from: U3 */
    public void m95287U3(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        this.f67917j = liveAccessChannel;
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        ((f7e) this.viewModel).m119802u();
        ((f7e) this.viewModel).m119800q();
        super.mo69117n();
        l6e.m148717c(this);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        mo51532C(this.f67918k);
        ((f7e) this.viewModel).m119801s(this.f67917j, this.f188513f);
    }
}
