package com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.PlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VLinear;
import p147v.VText;
import p149l.c680;
import p149l.erl;
import p149l.org;
import p149l.prg;
import p149l.s680;
import p149l.t100;
import p149l.xyi;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCenterForwardVideoView extends FeedCenterView implements erl {

    /* JADX INFO: renamed from: B */
    public prg f41809B;

    /* JADX INFO: renamed from: C */
    public org f41810C;

    /* JADX INFO: renamed from: D */
    public PlayerView f41811D;

    /* JADX INFO: renamed from: E */
    public RelativeLayout f41812E;

    /* JADX INFO: renamed from: F */
    public VText f41813F;

    /* JADX INFO: renamed from: G */
    public VText f41814G;

    /* JADX INFO: renamed from: H */
    public VLinear f41815H;

    /* JADX INFO: renamed from: I */
    public c680 f41816I;

    public FeedCenterForwardVideoView(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo64597C() {
        prg prgVar = new prg();
        this.f41809B = prgVar;
        prgVar.m171017s(this);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo64598Z(int i, Moment moment, HashMap<String, Boolean> map) {
        super.mo64598Z(i, moment, map);
        if (this.f41810C == null) {
            this.f41810C = new org(this);
        }
        this.f41810C.m165566n(i, moment, map);
        m64648Y(moment);
    }

    @Override // p149l.erl
    public PlayerView getPlayerView() {
        return this.f41811D;
    }

    /* JADX INFO: renamed from: l0 */
    public void m64605l0(int i, Moment moment, HashMap<String, Boolean> map, int i2) {
        this.f41894i = moment;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f41890e.getLayoutParams();
        marginLayoutParams.leftMargin = t100.m186890d(i2);
        this.f41890e.setLayoutParams(marginLayoutParams);
        mo64598Z(i, moment, map);
    }

    @Override // p149l.erl
    public void mute(boolean z) {
        if (!xyi.m211769a(this.f41894i) && NullChecker.m81303a(this.f41811D)) {
            this.f41811D.m66570K(z);
        }
    }

    @Override // p149l.erl
    public void pause() {
        if (!xyi.m211769a(this.f41894i) && NullChecker.m81303a(this.f41811D) && this.f41811D.m66565D()) {
            this.f41811D.m66572M();
        }
    }

    @Override // p149l.erl
    public void play() {
        if (xyi.m211769a(this.f41894i)) {
            return;
        }
        if (this.f41816I == null) {
            this.f41816I = new s680();
        }
        if (NullChecker.m81303a(this.f41811D)) {
            this.f41811D.setPlayer(this.f41816I);
            this.f41811D.m66573N();
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo64602r() {
        this.f41886a = this.f41809B.m171004f();
        this.f41887b = this.f41809B.m171009k();
        this.f41888c = this.f41809B.m171014p();
        this.f41889d = this.f41809B.m171015q();
        this.f41890e = this.f41809B.m171003e();
        this.f41891f = this.f41809B.m171011m();
        this.f41892g = this.f41809B.m171012n();
        this.f41893h = this.f41809B.m171008j();
        this.f41811D = this.f41809B.m171013o();
        this.f41908w = this.f41809B.m171005g();
        this.f41812E = this.f41809B.m171006h();
        this.f41815H = this.f41809B.m171016r();
        this.f41813F = this.f41809B.m171007i();
        this.f41814G = this.f41809B.m171010l();
    }

    @Override // p149l.erl
    public void stop() {
        if (!xyi.m211769a(this.f41894i) && NullChecker.m81303a(this.f41811D)) {
            this.f41811D.m66576R();
            this.f41811D.setPlayer(null);
        }
    }

    public FeedCenterForwardVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterForwardVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
