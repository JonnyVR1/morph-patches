package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveBossGift;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftRecord.GiftRecordDetailItemView;

/* JADX INFO: loaded from: classes5.dex */
public class muj extends d1q<GiftRecordDetailItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveBossGift f135794a;

    /* JADX INFO: renamed from: b */
    public e30<String> f135795b;

    public muj(BLiveBossGift bLiveBossGift) {
        this.f135794a = bLiveBossGift;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(GiftRecordDetailItemView giftRecordDetailItemView) {
        super.mo70566u(giftRecordDetailItemView);
        giftRecordDetailItemView.m78160j0(this.f135794a, this.f135795b);
    }

    /* JADX INFO: renamed from: I */
    public void m156410I(e30<String> e30Var) {
        this.f135795b = e30Var;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168135O7;
    }
}
