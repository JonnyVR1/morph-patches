package com.p051p1.mobile.putong.live.external.page.swipecard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveComplexCard;
import com.p051p1.mobile.putong.live.base.data.BLiveComplexUser;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.ldc0;
import p153l.nbc0;
import p153l.qa00;
import p153l.qnp0;
import p153l.xec0;

/* JADX INFO: loaded from: classes9.dex */
public class MultipleLiveFourItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public BLiveComplexCard f47056d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f47057e;

    /* JADX INFO: renamed from: f */
    public LiveSquareMediaView f47058f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f47059g;

    /* JADX INFO: renamed from: h */
    public VText f47060h;

    /* JADX INFO: renamed from: i */
    public VText f47061i;

    /* JADX INFO: renamed from: j */
    public VText f47062j;

    /* JADX INFO: renamed from: k */
    public VLinear f47063k;

    public MultipleLiveFourItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xec0.f193910t0, (ViewGroup) this, true);
        this.f47057e = (VDraweeView) findViewById(ldc0.f131492P);
        this.f47058f = (LiveSquareMediaView) findViewById(ldc0.f131514W0);
        this.f47059g = (SVGAnimationView) findViewById(ldc0.f131493P0);
        this.f47060h = (VText) findViewById(ldc0.f131596r2);
        this.f47063k = (VLinear) findViewById(ldc0.f131503S1);
        this.f47061i = (VText) findViewById(ldc0.f131608u2);
        this.f47062j = (VText) findViewById(ldc0.f131604t2);
        this.f47058f.setNeedAdjustUI(true);
        qnp0.m177261d1(this, qa00.m175859d(10.0f));
    }

    /* JADX INFO: renamed from: h0 */
    public void m71983h0() {
        BLiveSuggestLive bLiveSuggestLive;
        this.f47058f.setVisibility(0);
        BLiveComplexCard bLiveComplexCard = this.f47056d;
        if (bLiveComplexCard == null || (bLiveSuggestLive = bLiveComplexCard.live) == null) {
            return;
        }
        this.f47058f.m69955n(bLiveSuggestLive.videoCaptureUrl);
    }

    /* JADX INFO: renamed from: i0 */
    public void m71984i0() {
        this.f47058f.setVisibility(8);
        this.f47058f.m69958q();
    }

    public void setData(BLiveComplexCard bLiveComplexCard) {
        this.f47056d = bLiveComplexCard;
        if ("live".equals(bLiveComplexCard.type)) {
            setVisibility(0);
            izs.m142868s("context_livingAct", this.f47057e, bLiveComplexCard.live.anchor.profilePicture);
            this.f47062j.setText(bLiveComplexCard.live.anchor.name);
            this.f47061i.setText(String.format(Locale.CHINA, "在线 · %d", Integer.valueOf(bLiveComplexCard.live.memberCount)));
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/89df1bb3-e344-475d-a3e0-5d4fa723ad2311.pdf").into(this.f47059g);
            this.f47063k.setBackgroundResource(nbc0.f141185o0);
            this.f47060h.setText("直播中");
        }
        if ("voiceFeed".equals(bLiveComplexCard.type)) {
            setVisibility(0);
            BLiveComplexUser bLiveComplexUser = bLiveComplexCard.users.get(0);
            izs.m142868s("context_livingAct", this.f47057e, bLiveComplexUser.icon);
            this.f47062j.setText(bLiveComplexUser.name);
            this.f47061i.setText(String.format(Locale.CHINA, "在线 · %s", bLiveComplexCard.voiceFeed.memberCount));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f47059g.getLayoutParams();
            layoutParams.width = bnl0.m105587w(14.0f);
            layoutParams.height = bnl0.m105587w(14.0f);
            layoutParams.leftMargin = bnl0.m105587w(6.0f);
            layoutParams.rightMargin = bnl0.m105587w(3.0f);
            this.f47059g.setLayoutParams(layoutParams);
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/e90eea29-f0ff-4ceb-88b8-066d6ea743bb12.pdf").into(this.f47059g);
            this.f47063k.setBackgroundResource(nbc0.f141182n0);
            this.f47060h.setText("语聊中");
        }
    }

    public MultipleLiveFourItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultipleLiveFourItem(Context context) {
        this(context, null);
    }
}
