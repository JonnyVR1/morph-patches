package com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.PlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.c680;
import l.s680;
import l.t100;
import l.xdl0;
import p007l.erl;
import p007l.n8i;
import p007l.psg;
import p007l.rsg;
import p007l.ssg;
import p007l.u2h;
import p007l.xsg;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCenterVideoView extends FeedCenterView implements erl {

    /* JADX INFO: renamed from: H */
    public static int f3339H = 6;

    /* JADX INFO: renamed from: B */
    public PlayerView f3340B;

    /* JADX INFO: renamed from: C */
    public int f3341C;

    /* JADX INFO: renamed from: D */
    public int f3342D;

    /* JADX INFO: renamed from: E */
    public ssg f3343E;

    /* JADX INFO: renamed from: F */
    public xsg f3344F;

    /* JADX INFO: renamed from: G */
    public c680 f3345G;

    public FeedCenterVideoView(Context context) {
        super(context);
        this.f3341C = n8i.m12110d(n8i.f10701c);
        this.f3342D = n8i.m12109c(n8i.f10701c, n8i.f10702d);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo5691C() {
        ssg ssgVar = new ssg();
        this.f3343E = ssgVar;
        ssgVar.m14291E(this);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo5692Z(int i, Moment moment, HashMap<String, Boolean> map) {
        super.mo5692Z(i, moment, map);
        VText vTextM14301m = this.f3343E.m14301m();
        if (u2h.m14719d() && moment.isLive) {
            xdl0.M(vTextM14301m, false);
            setFeedCenterImageState(new rsg(act(), this.f3343E, this));
            this.f3344F.mo13215l(i, moment, map);
        } else {
            if (!NullChecker.b(moment.media) || moment.media.size() == 0) {
                return;
            }
            setFeedCenterImageState(new psg(act(), this.f3343E, this));
            this.f3344F.mo13215l(i, moment, map);
            m5741X(vTextM14301m, moment);
            m5742Y(moment);
        }
    }

    @Override // p007l.erl
    public PlayerView getPlayerView() {
        return this.f3340B;
    }

    /* JADX INFO: renamed from: l0 */
    public void m5720l0(int i, Moment moment, HashMap<String, Boolean> map, int i2) {
        this.f3355i = moment;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3351e.getLayoutParams();
        marginLayoutParams.leftMargin = t100.d(i2);
        this.f3351e.setLayoutParams(marginLayoutParams);
        mo5692Z(i, moment, map);
    }

    @Override // p007l.erl
    public void mute(boolean z) {
        if (NullChecker.a(this.f3340B)) {
            this.f3340B.m7754K(z);
        }
    }

    @Override // p007l.erl
    public void pause() {
        if (NullChecker.a(this.f3340B) && this.f3340B.m7749D()) {
            this.f3340B.m7756M();
        }
    }

    @Override // p007l.erl
    public void play() {
        if (this.f3345G == null) {
            this.f3345G = new s680();
        }
        if (NullChecker.a(this.f3340B)) {
            this.f3340B.setPlayer(this.f3345G);
            this.f3340B.m7757N();
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo5696r() {
        this.f3347a = this.f3343E.m14295g();
        this.f3348b = this.f3343E.m14299k();
        this.f3349c = this.f3343E.m14289C();
        this.f3350d = this.f3343E.m14290D();
        this.f3351e = this.f3343E.m14293e();
        this.f3352f = this.f3343E.m14300l();
        this.f3353g = this.f3343E.m14306r();
        this.f3354h = this.f3343E.m14297i();
        this.f3340B = this.f3343E.m14288B();
        this.f3369w = this.f3343E.m14296h();
    }

    public void setFeedCenterImageState(xsg xsgVar) {
        this.f3344F = xsgVar;
    }

    @Override // p007l.erl
    public void stop() {
        if (NullChecker.a(this.f3340B)) {
            this.f3340B.m7760R();
            this.f3340B.setPlayer(null);
        }
    }

    public FeedCenterVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3341C = n8i.m12110d(n8i.f10701c);
        this.f3342D = n8i.m12109c(n8i.f10701c, n8i.f10702d);
    }

    public FeedCenterVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3341C = n8i.m12110d(n8i.f10701c);
        this.f3342D = n8i.m12109c(n8i.f10701c, n8i.f10702d);
    }
}
