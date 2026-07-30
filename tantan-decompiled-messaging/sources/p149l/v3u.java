package p149l;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.live.base.data.BLiveTeenagerLive;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;

/* JADX INFO: loaded from: classes13.dex */
public class v3u extends d1q<FrameLayout> {

    /* JADX INFO: renamed from: a */
    public final BLiveTeenagerLive f179848a;

    /* JADX INFO: renamed from: b */
    public final int f179849b;

    public v3u(BLiveTeenagerLive bLiveTeenagerLive, int i) {
        this.f179848a = bLiveTeenagerLive;
        this.f179849b = x4u.m207022h(i);
    }

    /* JADX INFO: renamed from: H */
    public final void m196870H(FrameLayout frameLayout) {
        xdl0.m208325C0(frameLayout, this.f179849b);
        xdl0.m208327D0(this.f179849b - (x4u.f191062b * 2), frameLayout);
        xdl0.m208325C0(frameLayout.findViewById(f5c0.f95035P), this.f179849b / 2);
        uep0.m193326m(frameLayout, t100.f167260i);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70999m(FrameLayout frameLayout) {
        super.mo70999m(frameLayout);
        m196870H(frameLayout);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(FrameLayout frameLayout) {
        SimpleDraweeView simpleDraweeView = ((LiveSquareMediaView) frameLayout.findViewById(f5c0.f95057W0)).getSimpleDraweeView();
        String str = this.f179848a.coverUrl;
        int i = this.f179849b;
        hxs.m133408u("context_square", simpleDraweeView, str, i, i);
        ((TextView) frameLayout.findViewById(f5c0.f95091f2)).setText(this.f179848a.title);
        super.mo70566u(frameLayout);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71000w(FrameLayout frameLayout) {
        super.mo71000w(frameLayout);
        ((LiveSquareMediaView) frameLayout.findViewById(f5c0.f95057W0)).m68775q();
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162710U0;
    }
}
