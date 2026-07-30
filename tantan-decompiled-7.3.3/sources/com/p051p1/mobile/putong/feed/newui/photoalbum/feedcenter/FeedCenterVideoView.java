package com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.p065ui.PlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VText;
import p153l.bnl0;
import p153l.cai;
import p153l.eug;
import p153l.gug;
import p153l.hug;
import p153l.ie80;
import p153l.j4h;
import p153l.mug;
import p153l.qa00;
import p153l.stl;
import p153l.ye80;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCenterVideoView extends FeedCenterView implements stl {

    /* JADX INFO: renamed from: H */
    public static int f42726H = 6;

    /* JADX INFO: renamed from: B */
    public PlayerView f42727B;

    /* JADX INFO: renamed from: C */
    public int f42728C;

    /* JADX INFO: renamed from: D */
    public int f42729D;

    /* JADX INFO: renamed from: E */
    public hug f42730E;

    /* JADX INFO: renamed from: F */
    public mug f42731F;

    /* JADX INFO: renamed from: G */
    public ie80 f42732G;

    public FeedCenterVideoView(Context context) {
        super(context);
        this.f42728C = cai.m108496d(cai.f80594c);
        this.f42729D = cai.m108495c(cai.f80594c, cai.f80595d);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo65780C() {
        hug hugVar = new hug();
        this.f42730E = hugVar;
        hugVar.m137203E(this);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo65781Z(int i, Moment moment, HashMap<String, Boolean> map) {
        super.mo65781Z(i, moment, map);
        VText vTextM137213m = this.f42730E.m137213m();
        if (j4h.m143420d() && moment.isLive) {
            bnl0.m105524M(vTextM137213m, false);
            setFeedCenterImageState(new gug(act(), this.f42730E, this));
            this.f42731F.mo122569l(i, moment, map);
        } else {
            if (!NullChecker.m82487b(moment.media) || moment.media.size() == 0) {
                return;
            }
            setFeedCenterImageState(new eug(act(), this.f42730E, this));
            this.f42731F.mo122569l(i, moment, map);
            m65830X(vTextM137213m, moment);
            m65831Y(moment);
        }
    }

    @Override // p153l.stl
    public PlayerView getPlayerView() {
        return this.f42727B;
    }

    /* JADX INFO: renamed from: l0 */
    public void m65809l0(int i, Moment moment, HashMap<String, Boolean> map, int i2) {
        this.f42742i = moment;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f42738e.getLayoutParams();
        marginLayoutParams.leftMargin = qa00.m175859d(i2);
        this.f42738e.setLayoutParams(marginLayoutParams);
        mo65781Z(i, moment, map);
    }

    @Override // p153l.stl
    public void mute(boolean z) {
        if (NullChecker.m82486a(this.f42727B)) {
            this.f42727B.m67753K(z);
        }
    }

    @Override // p153l.stl
    public void pause() {
        if (NullChecker.m82486a(this.f42727B) && this.f42727B.m67748D()) {
            this.f42727B.m67755M();
        }
    }

    @Override // p153l.stl
    public void play() {
        if (this.f42732G == null) {
            this.f42732G = new ye80();
        }
        if (NullChecker.m82486a(this.f42727B)) {
            this.f42727B.setPlayer(this.f42732G);
            this.f42727B.m67756N();
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo65785r() {
        this.f42734a = this.f42730E.m137207g();
        this.f42735b = this.f42730E.m137211k();
        this.f42736c = this.f42730E.m137201C();
        this.f42737d = this.f42730E.m137202D();
        this.f42738e = this.f42730E.m137205e();
        this.f42739f = this.f42730E.m137212l();
        this.f42740g = this.f42730E.m137218r();
        this.f42741h = this.f42730E.m137209i();
        this.f42727B = this.f42730E.m137200B();
        this.f42756w = this.f42730E.m137208h();
    }

    public void setFeedCenterImageState(mug mugVar) {
        this.f42731F = mugVar;
    }

    @Override // p153l.stl
    public void stop() {
        if (NullChecker.m82486a(this.f42727B)) {
            this.f42727B.m67759R();
            this.f42727B.setPlayer(null);
        }
    }

    public FeedCenterVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42728C = cai.m108496d(cai.f80594c);
        this.f42729D = cai.m108495c(cai.f80594c, cai.f80595d);
    }

    public FeedCenterVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42728C = cai.m108496d(cai.f80594c);
        this.f42729D = cai.m108495c(cai.f80594c, cai.f80595d);
    }
}
