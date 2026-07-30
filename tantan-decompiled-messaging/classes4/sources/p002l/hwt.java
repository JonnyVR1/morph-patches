package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p000p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeMainItem;
import com.p1.mobile.putong.live.base.data.BLiveSignPrizesRewards;
import l.d1q;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hwt extends d1q<LiveSignPrizeMainItem> {

    /* JADX INFO: renamed from: d */
    public static int f12315d = 1;

    /* JADX INFO: renamed from: a */
    public BLiveSignPrizesRewards f12316a;

    /* JADX INFO: renamed from: b */
    public C0358a f12317b;

    /* JADX INFO: renamed from: c */
    public String f12318c;

    public hwt(C0358a c0358a, BLiveSignPrizesRewards bLiveSignPrizesRewards, String str) {
        this.f12317b = c0358a;
        this.f12316a = bLiveSignPrizesRewards;
        this.f12318c = str;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m14888u(LiveSignPrizeMainItem liveSignPrizeMainItem) {
        super.u(liveSignPrizeMainItem);
        liveSignPrizeMainItem.m6812c(this.f12317b, this.f12316a, this.f12318c);
    }

    /* JADX INFO: renamed from: o */
    public int m14886o() {
        return t6c0.f19629O5;
    }

    /* JADX INFO: renamed from: r */
    public int m14887r() {
        return f12315d;
    }
}
