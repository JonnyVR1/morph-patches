package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveBossGift;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftRecord.GiftRecordDetailItemView;

/* JADX INFO: loaded from: classes5.dex */
public class cxj extends d3q<GiftRecordDetailItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveBossGift f84249a;

    /* JADX INFO: renamed from: b */
    public y20<String> f84250b;

    public cxj(BLiveBossGift bLiveBossGift) {
        this.f84249a = bLiveBossGift;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(GiftRecordDetailItemView giftRecordDetailItemView) {
        super.mo71749u(giftRecordDetailItemView);
        giftRecordDetailItemView.m79343j0(this.f84249a, this.f84250b);
    }

    /* JADX INFO: renamed from: I */
    public void m113035I(y20<String> y20Var) {
        this.f84250b = y20Var;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198867O7;
    }
}
