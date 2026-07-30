package p149l;

import com.p046p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeHeadItem;

/* JADX INFO: loaded from: classes4.dex */
public class cwt extends d1q<LiveSignPrizeHeadItem> {

    /* JADX INFO: renamed from: b */
    public static int f82810b;

    /* JADX INFO: renamed from: a */
    public String f82811a;

    public cwt(String str) {
        this.f82811a = str;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveSignPrizeHeadItem liveSignPrizeHeadItem) {
        super.mo70566u(liveSignPrizeHeadItem);
        liveSignPrizeHeadItem.setText(this.f82811a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168121N5;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: r */
    public int mo109066r() {
        return f82810b;
    }
}
