package com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.p065ui.PlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VLinear;
import p151v.VText;
import p153l.dtg;
import p153l.etg;
import p153l.ie80;
import p153l.qa00;
import p153l.s1j;
import p153l.stl;
import p153l.ye80;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCenterForwardVideoView extends FeedCenterView implements stl {

    /* JADX INFO: renamed from: B */
    public etg f42657B;

    /* JADX INFO: renamed from: C */
    public dtg f42658C;

    /* JADX INFO: renamed from: D */
    public PlayerView f42659D;

    /* JADX INFO: renamed from: E */
    public RelativeLayout f42660E;

    /* JADX INFO: renamed from: F */
    public VText f42661F;

    /* JADX INFO: renamed from: G */
    public VText f42662G;

    /* JADX INFO: renamed from: H */
    public VLinear f42663H;

    /* JADX INFO: renamed from: I */
    public ie80 f42664I;

    public FeedCenterForwardVideoView(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo65780C() {
        etg etgVar = new etg();
        this.f42657B = etgVar;
        etgVar.m122456s(this);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo65781Z(int i, Moment moment, HashMap<String, Boolean> map) {
        super.mo65781Z(i, moment, map);
        if (this.f42658C == null) {
            this.f42658C = new dtg(this);
        }
        this.f42658C.m117867n(i, moment, map);
        m65831Y(moment);
    }

    @Override // p153l.stl
    public PlayerView getPlayerView() {
        return this.f42659D;
    }

    /* JADX INFO: renamed from: l0 */
    public void m65788l0(int i, Moment moment, HashMap<String, Boolean> map, int i2) {
        this.f42742i = moment;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f42738e.getLayoutParams();
        marginLayoutParams.leftMargin = qa00.m175859d(i2);
        this.f42738e.setLayoutParams(marginLayoutParams);
        mo65781Z(i, moment, map);
    }

    @Override // p153l.stl
    public void mute(boolean z) {
        if (!s1j.m184047a(this.f42742i) && NullChecker.m82486a(this.f42659D)) {
            this.f42659D.m67753K(z);
        }
    }

    @Override // p153l.stl
    public void pause() {
        if (!s1j.m184047a(this.f42742i) && NullChecker.m82486a(this.f42659D) && this.f42659D.m67748D()) {
            this.f42659D.m67755M();
        }
    }

    @Override // p153l.stl
    public void play() {
        if (s1j.m184047a(this.f42742i)) {
            return;
        }
        if (this.f42664I == null) {
            this.f42664I = new ye80();
        }
        if (NullChecker.m82486a(this.f42659D)) {
            this.f42659D.setPlayer(this.f42664I);
            this.f42659D.m67756N();
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo65785r() {
        this.f42734a = this.f42657B.m122443f();
        this.f42735b = this.f42657B.m122448k();
        this.f42736c = this.f42657B.m122453p();
        this.f42737d = this.f42657B.m122454q();
        this.f42738e = this.f42657B.m122442e();
        this.f42739f = this.f42657B.m122450m();
        this.f42740g = this.f42657B.m122451n();
        this.f42741h = this.f42657B.m122447j();
        this.f42659D = this.f42657B.m122452o();
        this.f42756w = this.f42657B.m122444g();
        this.f42660E = this.f42657B.m122445h();
        this.f42663H = this.f42657B.m122455r();
        this.f42661F = this.f42657B.m122446i();
        this.f42662G = this.f42657B.m122449l();
    }

    @Override // p153l.stl
    public void stop() {
        if (!s1j.m184047a(this.f42742i) && NullChecker.m82486a(this.f42659D)) {
            this.f42659D.m67759R();
            this.f42659D.setPlayer(null);
        }
    }

    public FeedCenterForwardVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterForwardVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
