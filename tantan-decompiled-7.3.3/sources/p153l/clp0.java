package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;

/* JADX INFO: loaded from: classes10.dex */
public class clp0 extends y8s<rwn0, llp0> {

    /* JADX INFO: renamed from: j */
    public String f82415j;

    /* JADX INFO: renamed from: k */
    public String f82416k;

    /* JADX INFO: renamed from: l */
    public long f82417l;

    public clp0(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new llp0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m110689Z3(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        ((llp0) this.viewModel).m73017E();
        ((llp0) this.viewModel).m154783Z(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m110690a4(aco0 aco0Var) {
        if (((llp0) this.viewModel).isShowing()) {
            ((llp0) this.viewModel).mo73021p();
        }
        String str = aco0Var.f69734a;
        this.f82415j = str;
        String str2 = aco0Var.f69735b;
        this.f82416k = str2;
        long j = aco0Var.f69736c;
        this.f82417l = j;
        m110695e4(str, str2, j, new y20() { // from class: l.zkp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204789a.m110689Z3((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138863h3(m213811F2().VoiceNewGiftWallEvent.showWeekStarGiftDetail(), new y20() { // from class: l.wkp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189583a.m110690a4((aco0) obj);
            }
        });
        duringCreated(((rwn0) m213810E2()).m168545q1().m98260W().asObservable()).filter(new qcj() { // from class: l.xkp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194805a.m110692b4((LongLinkLiveMessage.GiftWallRefresh) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.ykp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200432a.m110693c4((LongLinkLiveMessage.GiftWallRefresh) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m110691Y3() {
        if (TextUtils.isEmpty(this.f82415j) || TextUtils.isEmpty(this.f82416k)) {
            return;
        }
        m110695e4(this.f82415j, this.f82416k, this.f82417l, new y20() { // from class: l.alp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72147a.m110694d4((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ Boolean m110692b4(LongLinkLiveMessage.GiftWallRefresh giftWallRefresh) {
        V v2 = this.viewModel;
        return Boolean.valueOf(v2 != 0 && ((llp0) v2).isShowing());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m110693c4(LongLinkLiveMessage.GiftWallRefresh giftWallRefresh) {
        m110691Y3();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m110694d4(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        ((llp0) this.viewModel).m154783Z(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: e4 */
    public void m110695e4(String str, String str2, long j, y20<GiftWallV3GiftWeekStarGiftMainDetail> y20Var) {
        duringCreated(zbo0.m219206f(str, str2, j)).subscribe(dhw.m115826e(y20Var, new y20() { // from class: l.blp0
            @Override // p153l.y20
            public final void call(Object obj) {
                bf10.m103834j((Throwable) obj);
            }
        }));
    }
}
