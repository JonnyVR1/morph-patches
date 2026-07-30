package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chat.danmu.IntlDanmuItemView;

/* JADX INFO: loaded from: classes5.dex */
public class y8n extends d3q<IntlDanmuItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveDanmakuListItem f198016a;

    /* JADX INFO: renamed from: b */
    public boolean f198017b = false;

    public y8n(BLiveDanmakuListItem bLiveDanmakuListItem) {
        this.f198016a = bLiveDanmakuListItem;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(IntlDanmuItemView intlDanmuItemView) {
        super.mo71749u(intlDanmuItemView);
        intlDanmuItemView.m79274p(this.f198016a, this.f198017b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199201p2;
    }
}
