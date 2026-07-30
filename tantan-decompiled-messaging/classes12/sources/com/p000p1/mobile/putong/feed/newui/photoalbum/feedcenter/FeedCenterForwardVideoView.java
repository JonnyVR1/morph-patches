package com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.PlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.c680;
import l.s680;
import l.t100;
import p007l.erl;
import p007l.org;
import p007l.prg;
import p007l.xyi;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCenterForwardVideoView extends FeedCenterView implements erl {

    /* JADX INFO: renamed from: B */
    public prg f3270B;

    /* JADX INFO: renamed from: C */
    public org f3271C;

    /* JADX INFO: renamed from: D */
    public PlayerView f3272D;

    /* JADX INFO: renamed from: E */
    public RelativeLayout f3273E;

    /* JADX INFO: renamed from: F */
    public VText f3274F;

    /* JADX INFO: renamed from: G */
    public VText f3275G;

    /* JADX INFO: renamed from: H */
    public VLinear f3276H;

    /* JADX INFO: renamed from: I */
    public c680 f3277I;

    public FeedCenterForwardVideoView(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo5691C() {
        prg prgVar = new prg();
        this.f3270B = prgVar;
        prgVar.m13214s(this);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo5692Z(int i, Moment moment, HashMap<String, Boolean> map) {
        super.mo5692Z(i, moment, map);
        if (this.f3271C == null) {
            this.f3271C = new org(this);
        }
        this.f3271C.m12742n(i, moment, map);
        m5742Y(moment);
    }

    @Override // p007l.erl
    public PlayerView getPlayerView() {
        return this.f3272D;
    }

    /* JADX INFO: renamed from: l0 */
    public void m5699l0(int i, Moment moment, HashMap<String, Boolean> map, int i2) {
        this.f3355i = moment;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3351e.getLayoutParams();
        marginLayoutParams.leftMargin = t100.d(i2);
        this.f3351e.setLayoutParams(marginLayoutParams);
        mo5692Z(i, moment, map);
    }

    @Override // p007l.erl
    public void mute(boolean z) {
        if (!xyi.m16874a(this.f3355i) && NullChecker.a(this.f3272D)) {
            this.f3272D.m7754K(z);
        }
    }

    @Override // p007l.erl
    public void pause() {
        if (!xyi.m16874a(this.f3355i) && NullChecker.a(this.f3272D) && this.f3272D.m7749D()) {
            this.f3272D.m7756M();
        }
    }

    @Override // p007l.erl
    public void play() {
        if (xyi.m16874a(this.f3355i)) {
            return;
        }
        if (this.f3277I == null) {
            this.f3277I = new s680();
        }
        if (NullChecker.a(this.f3272D)) {
            this.f3272D.setPlayer(this.f3277I);
            this.f3272D.m7757N();
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo5696r() {
        this.f3347a = this.f3270B.m13201f();
        this.f3348b = this.f3270B.m13206k();
        this.f3349c = this.f3270B.m13211p();
        this.f3350d = this.f3270B.m13212q();
        this.f3351e = this.f3270B.m13200e();
        this.f3352f = this.f3270B.m13208m();
        this.f3353g = this.f3270B.m13209n();
        this.f3354h = this.f3270B.m13205j();
        this.f3272D = this.f3270B.m13210o();
        this.f3369w = this.f3270B.m13202g();
        this.f3273E = this.f3270B.m13203h();
        this.f3276H = this.f3270B.m13213r();
        this.f3274F = this.f3270B.m13204i();
        this.f3275G = this.f3270B.m13207l();
    }

    @Override // p007l.erl
    public void stop() {
        if (!xyi.m16874a(this.f3355i) && NullChecker.a(this.f3272D)) {
            this.f3272D.m7760R();
            this.f3272D.setPlayer(null);
        }
    }

    public FeedCenterForwardVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterForwardVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
