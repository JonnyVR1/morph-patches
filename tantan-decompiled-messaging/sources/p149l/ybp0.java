package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;

/* JADX INFO: loaded from: classes11.dex */
public class ybp0 extends x6s<nnn0, hcp0> {

    /* JADX INFO: renamed from: j */
    public String f197348j;

    /* JADX INFO: renamed from: k */
    public String f197349k;

    /* JADX INFO: renamed from: l */
    public long f197350l;

    public ybp0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new hcp0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m213966Z3(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        ((hcp0) this.viewModel).m71834E();
        ((hcp0) this.viewModel).m130489Z(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m213967a4(w2o0 w2o0Var) {
        if (((hcp0) this.viewModel).isShowing()) {
            ((hcp0) this.viewModel).mo71838p();
        }
        String str = w2o0Var.f184265a;
        this.f197348j = str;
        String str2 = w2o0Var.f184266b;
        this.f197349k = str2;
        long j = w2o0Var.f184267c;
        this.f197350l = j;
        m213972e4(str, str2, j, new e30() { // from class: l.vbp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180863a.m213966Z3((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129304h3(m206028F2().VoiceNewGiftWallEvent.showWeekStarGiftDetail(), new e30() { // from class: l.sbp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163574a.m213967a4((w2o0) obj);
            }
        });
        duringCreated(((nnn0) m206027E2()).m132160q1().m189078W().asObservable()).filter(new w9j() { // from class: l.tbp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f169286a.m213969b4((LongLinkLiveMessage.GiftWallRefresh) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ubp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175732a.m213970c4((LongLinkLiveMessage.GiftWallRefresh) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m213968Y3() {
        if (TextUtils.isEmpty(this.f197348j) || TextUtils.isEmpty(this.f197349k)) {
            return;
        }
        m213972e4(this.f197348j, this.f197349k, this.f197350l, new e30() { // from class: l.wbp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185606a.m213971d4((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ Boolean m213969b4(LongLinkLiveMessage.GiftWallRefresh giftWallRefresh) {
        V v2 = this.viewModel;
        return Boolean.valueOf(v2 != 0 && ((hcp0) v2).isShowing());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m213970c4(LongLinkLiveMessage.GiftWallRefresh giftWallRefresh) {
        m213968Y3();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m213971d4(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        ((hcp0) this.viewModel).m130489Z(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: e4 */
    public void m213972e4(String str, String str2, long j, e30<GiftWallV3GiftWeekStarGiftMainDetail> e30Var) {
        duringCreated(v2o0.m196815f(str, str2, j)).subscribe(ffw.m121194e(e30Var, new e30() { // from class: l.xbp0
            @Override // p149l.e30
            public final void call(Object obj) {
                r610.m178005j((Throwable) obj);
            }
        }));
    }
}
