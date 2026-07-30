package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.nnn0;
import l.r610;
import l.w9j;
import l.x6s;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ybp0 extends x6s<nnn0, hcp0> {

    /* JADX INFO: renamed from: j */
    public String f22987j;

    /* JADX INFO: renamed from: k */
    public String f22988k;

    /* JADX INFO: renamed from: l */
    public long f22989l;

    public ybp0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        C(new hcp0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m25273Z3(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        ((bwr) this).viewModel.E();
        ((bwr) this).viewModel.m15575Z(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m25274a4(w2o0 w2o0Var) {
        if (((bwr) this).viewModel.isShowing()) {
            ((bwr) this).viewModel.p();
        }
        String str = w2o0Var.f21859a;
        this.f22987j = str;
        String str2 = w2o0Var.f21860b;
        this.f22988k = str2;
        long j = w2o0Var.f21861c;
        this.f22989l = j;
        m25280e4(str, str2, j, new e30() { // from class: l.vbp0
            public final void call(Object obj) {
                this.f21524a.m25273Z3((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m25275T() {
        super/*l.k4t*/.T();
        h3(F2().VoiceNewGiftWallEvent.showWeekStarGiftDetail(), new e30() { // from class: l.sbp0
            public final void call(Object obj) {
                this.f20160a.m25274a4((w2o0) obj);
            }
        });
        duringCreated(E2().q1().W().asObservable()).filter(new w9j() { // from class: l.tbp0
            public final Object call(Object obj) {
                return this.f20608a.m25277b4((LongLinkLiveMessage.GiftWallRefresh) obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.ubp0
            public final void call(Object obj) {
                this.f21059a.m25278c4((LongLinkLiveMessage.GiftWallRefresh) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m25276Y3() {
        if (TextUtils.isEmpty(this.f22987j) || TextUtils.isEmpty(this.f22988k)) {
            return;
        }
        m25280e4(this.f22987j, this.f22988k, this.f22989l, new e30() { // from class: l.wbp0
            public final void call(Object obj) {
                this.f21996a.m25279d4((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ Boolean m25277b4(LongLinkLiveMessage.GiftWallRefresh giftWallRefresh) {
        hcp0 hcp0Var = ((bwr) this).viewModel;
        return Boolean.valueOf(hcp0Var != null && hcp0Var.isShowing());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m25278c4(LongLinkLiveMessage.GiftWallRefresh giftWallRefresh) {
        m25276Y3();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m25279d4(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        ((bwr) this).viewModel.m15575Z(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: e4 */
    public void m25280e4(String str, String str2, long j, e30<GiftWallV3GiftWeekStarGiftMainDetail> e30Var) {
        duringCreated(v2o0.m23255f(str, str2, j)).subscribe(ffw.e(e30Var, new e30() { // from class: l.xbp0
            public final void call(Object obj) {
                r610.j((Throwable) obj);
            }
        }));
    }
}
