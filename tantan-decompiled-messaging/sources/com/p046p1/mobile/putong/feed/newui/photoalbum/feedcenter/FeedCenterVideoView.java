package com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.PlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VText;
import p149l.c680;
import p149l.erl;
import p149l.n8i;
import p149l.psg;
import p149l.rsg;
import p149l.s680;
import p149l.ssg;
import p149l.t100;
import p149l.u2h;
import p149l.xdl0;
import p149l.xsg;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCenterVideoView extends FeedCenterView implements erl {

    /* JADX INFO: renamed from: H */
    public static int f41878H = 6;

    /* JADX INFO: renamed from: B */
    public PlayerView f41879B;

    /* JADX INFO: renamed from: C */
    public int f41880C;

    /* JADX INFO: renamed from: D */
    public int f41881D;

    /* JADX INFO: renamed from: E */
    public ssg f41882E;

    /* JADX INFO: renamed from: F */
    public xsg f41883F;

    /* JADX INFO: renamed from: G */
    public c680 f41884G;

    public FeedCenterVideoView(Context context) {
        super(context);
        this.f41880C = n8i.m158497d(n8i.f137647c);
        this.f41881D = n8i.m158496c(n8i.f137647c, n8i.f137648d);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo64597C() {
        ssg ssgVar = new ssg();
        this.f41882E = ssgVar;
        ssgVar.m185721E(this);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo64598Z(int i, Moment moment, HashMap<String, Boolean> map) {
        super.mo64598Z(i, moment, map);
        VText vTextM185731m = this.f41882E.m185731m();
        if (u2h.m191495d() && moment.isLive) {
            xdl0.m208344M(vTextM185731m, false);
            setFeedCenterImageState(new rsg(act(), this.f41882E, this));
            this.f41883F.mo171138l(i, moment, map);
        } else {
            if (!NullChecker.m81304b(moment.media) || moment.media.size() == 0) {
                return;
            }
            setFeedCenterImageState(new psg(act(), this.f41882E, this));
            this.f41883F.mo171138l(i, moment, map);
            m64647X(vTextM185731m, moment);
            m64648Y(moment);
        }
    }

    @Override // p149l.erl
    public PlayerView getPlayerView() {
        return this.f41879B;
    }

    /* JADX INFO: renamed from: l0 */
    public void m64626l0(int i, Moment moment, HashMap<String, Boolean> map, int i2) {
        this.f41894i = moment;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f41890e.getLayoutParams();
        marginLayoutParams.leftMargin = t100.m186890d(i2);
        this.f41890e.setLayoutParams(marginLayoutParams);
        mo64598Z(i, moment, map);
    }

    @Override // p149l.erl
    public void mute(boolean z) {
        if (NullChecker.m81303a(this.f41879B)) {
            this.f41879B.m66570K(z);
        }
    }

    @Override // p149l.erl
    public void pause() {
        if (NullChecker.m81303a(this.f41879B) && this.f41879B.m66565D()) {
            this.f41879B.m66572M();
        }
    }

    @Override // p149l.erl
    public void play() {
        if (this.f41884G == null) {
            this.f41884G = new s680();
        }
        if (NullChecker.m81303a(this.f41879B)) {
            this.f41879B.setPlayer(this.f41884G);
            this.f41879B.m66573N();
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo64602r() {
        this.f41886a = this.f41882E.m185725g();
        this.f41887b = this.f41882E.m185729k();
        this.f41888c = this.f41882E.m185719C();
        this.f41889d = this.f41882E.m185720D();
        this.f41890e = this.f41882E.m185723e();
        this.f41891f = this.f41882E.m185730l();
        this.f41892g = this.f41882E.m185736r();
        this.f41893h = this.f41882E.m185727i();
        this.f41879B = this.f41882E.m185718B();
        this.f41908w = this.f41882E.m185726h();
    }

    public void setFeedCenterImageState(xsg xsgVar) {
        this.f41883F = xsgVar;
    }

    @Override // p149l.erl
    public void stop() {
        if (NullChecker.m81303a(this.f41879B)) {
            this.f41879B.m66576R();
            this.f41879B.setPlayer(null);
        }
    }

    public FeedCenterVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41880C = n8i.m158497d(n8i.f137647c);
        this.f41881D = n8i.m158496c(n8i.f137647c, n8i.f137648d);
    }

    public FeedCenterVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41880C = n8i.m158497d(n8i.f137647c);
        this.f41881D = n8i.m158496c(n8i.f137647c, n8i.f137648d);
    }
}
