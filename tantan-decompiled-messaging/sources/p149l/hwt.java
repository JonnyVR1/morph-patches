package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveSignPrizesRewards;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import com.p046p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeMainItem;

/* JADX INFO: loaded from: classes4.dex */
public class hwt extends d1q<LiveSignPrizeMainItem> {

    /* JADX INFO: renamed from: d */
    public static int f109785d = 1;

    /* JADX INFO: renamed from: a */
    public BLiveSignPrizesRewards f109786a;

    /* JADX INFO: renamed from: b */
    public C12769a f109787b;

    /* JADX INFO: renamed from: c */
    public String f109788c;

    public hwt(C12769a c12769a, BLiveSignPrizesRewards bLiveSignPrizesRewards, String str) {
        this.f109787b = c12769a;
        this.f109786a = bLiveSignPrizesRewards;
        this.f109788c = str;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveSignPrizeMainItem liveSignPrizeMainItem) {
        super.mo70566u(liveSignPrizeMainItem);
        liveSignPrizeMainItem.m73277c(this.f109787b, this.f109786a, this.f109788c);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168133O5;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: r */
    public int mo109066r() {
        return f109785d;
    }
}
