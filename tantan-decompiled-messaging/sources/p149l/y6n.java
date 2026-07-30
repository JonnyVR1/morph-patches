package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chat.danmu.IntlDanmuItemView;

/* JADX INFO: loaded from: classes5.dex */
public class y6n extends d1q<IntlDanmuItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveDanmakuListItem f196583a;

    /* JADX INFO: renamed from: b */
    public boolean f196584b = false;

    public y6n(BLiveDanmakuListItem bLiveDanmakuListItem) {
        this.f196583a = bLiveDanmakuListItem;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(IntlDanmuItemView intlDanmuItemView) {
        super.mo70566u(intlDanmuItemView);
        intlDanmuItemView.m78091p(this.f196583a, this.f196584b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168469p2;
    }
}
