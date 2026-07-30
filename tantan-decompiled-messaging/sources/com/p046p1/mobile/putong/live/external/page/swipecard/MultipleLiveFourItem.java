package com.p046p1.mobile.putong.live.external.page.swipecard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveComplexCard;
import com.p046p1.mobile.putong.live.base.data.BLiveComplexUser;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.f5c0;
import p149l.h3c0;
import p149l.hxs;
import p149l.mep0;
import p149l.s6c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class MultipleLiveFourItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public BLiveComplexCard f46208d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f46209e;

    /* JADX INFO: renamed from: f */
    public LiveSquareMediaView f46210f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f46211g;

    /* JADX INFO: renamed from: h */
    public VText f46212h;

    /* JADX INFO: renamed from: i */
    public VText f46213i;

    /* JADX INFO: renamed from: j */
    public VText f46214j;

    /* JADX INFO: renamed from: k */
    public VLinear f46215k;

    public MultipleLiveFourItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(s6c0.f162796t0, (ViewGroup) this, true);
        this.f46209e = (VDraweeView) findViewById(f5c0.f95035P);
        this.f46210f = (LiveSquareMediaView) findViewById(f5c0.f95057W0);
        this.f46211g = (SVGAnimationView) findViewById(f5c0.f95036P0);
        this.f46212h = (VText) findViewById(f5c0.f95139r2);
        this.f46215k = (VLinear) findViewById(f5c0.f95046S1);
        this.f46213i = (VText) findViewById(f5c0.f95151u2);
        this.f46214j = (VText) findViewById(f5c0.f95147t2);
        this.f46210f.setNeedAdjustUI(true);
        mep0.m154302d1(this, t100.m186890d(10.0f));
    }

    /* JADX INFO: renamed from: h0 */
    public void m70800h0() {
        BLiveSuggestLive bLiveSuggestLive;
        this.f46210f.setVisibility(0);
        BLiveComplexCard bLiveComplexCard = this.f46208d;
        if (bLiveComplexCard == null || (bLiveSuggestLive = bLiveComplexCard.live) == null) {
            return;
        }
        this.f46210f.m68772n(bLiveSuggestLive.videoCaptureUrl);
    }

    /* JADX INFO: renamed from: i0 */
    public void m70801i0() {
        this.f46210f.setVisibility(8);
        this.f46210f.m68775q();
    }

    public void setData(BLiveComplexCard bLiveComplexCard) {
        this.f46208d = bLiveComplexCard;
        if ("live".equals(bLiveComplexCard.type)) {
            setVisibility(0);
            hxs.m133406s("context_livingAct", this.f46209e, bLiveComplexCard.live.anchor.profilePicture);
            this.f46214j.setText(bLiveComplexCard.live.anchor.name);
            this.f46213i.setText(String.format(Locale.CHINA, "在线 · %d", Integer.valueOf(bLiveComplexCard.live.memberCount)));
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/89df1bb3-e344-475d-a3e0-5d4fa723ad2311.pdf").into(this.f46211g);
            this.f46215k.setBackgroundResource(h3c0.f105694o0);
            this.f46212h.setText("直播中");
        }
        if ("voiceFeed".equals(bLiveComplexCard.type)) {
            setVisibility(0);
            BLiveComplexUser bLiveComplexUser = bLiveComplexCard.users.get(0);
            hxs.m133406s("context_livingAct", this.f46209e, bLiveComplexUser.icon);
            this.f46214j.setText(bLiveComplexUser.name);
            this.f46213i.setText(String.format(Locale.CHINA, "在线 · %s", bLiveComplexCard.voiceFeed.memberCount));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f46211g.getLayoutParams();
            layoutParams.width = xdl0.m208407w(14.0f);
            layoutParams.height = xdl0.m208407w(14.0f);
            layoutParams.leftMargin = xdl0.m208407w(6.0f);
            layoutParams.rightMargin = xdl0.m208407w(3.0f);
            this.f46211g.setLayoutParams(layoutParams);
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/e90eea29-f0ff-4ceb-88b8-066d6ea743bb12.pdf").into(this.f46211g);
            this.f46215k.setBackgroundResource(h3c0.f105691n0);
            this.f46212h.setText("语聊中");
        }
    }

    public MultipleLiveFourItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultipleLiveFourItem(Context context) {
        this(context, null);
    }
}
