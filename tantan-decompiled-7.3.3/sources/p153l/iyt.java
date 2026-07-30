package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveSignPrizesRewards;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import com.p051p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeMainItem;

/* JADX INFO: loaded from: classes4.dex */
public class iyt extends d3q<LiveSignPrizeMainItem> {

    /* JADX INFO: renamed from: d */
    public static int f117632d = 1;

    /* JADX INFO: renamed from: a */
    public BLiveSignPrizesRewards f117633a;

    /* JADX INFO: renamed from: b */
    public C12932a f117634b;

    /* JADX INFO: renamed from: c */
    public String f117635c;

    public iyt(C12932a c12932a, BLiveSignPrizesRewards bLiveSignPrizesRewards, String str) {
        this.f117634b = c12932a;
        this.f117633a = bLiveSignPrizesRewards;
        this.f117635c = str;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveSignPrizeMainItem liveSignPrizeMainItem) {
        super.mo71749u(liveSignPrizeMainItem);
        liveSignPrizeMainItem.m74460c(this.f117634b, this.f117633a, this.f117635c);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198865O5;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: r */
    public int mo95343r() {
        return f117632d;
    }
}
