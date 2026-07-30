package p153l;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.live.base.data.BLiveTeenagerLive;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;

/* JADX INFO: loaded from: classes9.dex */
public class w5u extends d3q<FrameLayout> {

    /* JADX INFO: renamed from: a */
    public final BLiveTeenagerLive f187558a;

    /* JADX INFO: renamed from: b */
    public final int f187559b;

    public w5u(BLiveTeenagerLive bLiveTeenagerLive, int i) {
        this.f187558a = bLiveTeenagerLive;
        this.f187559b = y6u.m214504h(i);
    }

    /* JADX INFO: renamed from: H */
    public final void m204991H(FrameLayout frameLayout) {
        bnl0.m105505C0(frameLayout, this.f187559b);
        bnl0.m105507D0(this.f187559b - (y6u.f197715b * 2), frameLayout);
        bnl0.m105505C0(frameLayout.findViewById(ldc0.f131492P), this.f187559b / 2);
        ynp0.m216936m(frameLayout, qa00.f156322i);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo72182m(FrameLayout frameLayout) {
        super.mo72182m(frameLayout);
        m204991H(frameLayout);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(FrameLayout frameLayout) {
        SimpleDraweeView simpleDraweeView = ((LiveSquareMediaView) frameLayout.findViewById(ldc0.f131514W0)).getSimpleDraweeView();
        String str = this.f187558a.coverUrl;
        int i = this.f187559b;
        izs.m142870u("context_square", simpleDraweeView, str, i, i);
        ((TextView) frameLayout.findViewById(ldc0.f131548f2)).setText(this.f187558a.title);
        super.mo71749u(frameLayout);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo72183w(FrameLayout frameLayout) {
        super.mo72183w(frameLayout);
        ((LiveSquareMediaView) frameLayout.findViewById(ldc0.f131514W0)).m69958q();
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193824U0;
    }
}
