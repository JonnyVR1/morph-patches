package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.common.card;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveFrame;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlLiveFrame;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p046p1.mobile.putong.live.base.view.LiveIntlSquareFrameView;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveNewLabelDView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveNewLabelEView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveNewLabelLeftTopView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSpecialLabelView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.afn;
import p149l.dun;
import p149l.f5c0;
import p149l.h3c0;
import p149l.hxs;
import p149l.ipn;
import p149l.s9s;
import p149l.sxj;
import p149l.t100;
import p149l.uep0;
import p149l.vwb;
import p149l.w8u;
import p149l.wk4;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveFeedSuggesstIntlStyleCardView extends VFrame {

    /* JADX INFO: renamed from: a */
    public LiveSquareMediaView f45609a;

    /* JADX INFO: renamed from: b */
    public VFrame f45610b;

    /* JADX INFO: renamed from: c */
    public VFrame f45611c;

    /* JADX INFO: renamed from: d */
    public LiveIntlSquareFrameView f45612d;

    /* JADX INFO: renamed from: e */
    public ViewStub f45613e;

    /* JADX INFO: renamed from: f */
    public IntlLiveSpecialLabelView f45614f;

    /* JADX INFO: renamed from: g */
    public IntlLiveNewLabelDView f45615g;

    /* JADX INFO: renamed from: h */
    public IntlLiveNewLabelLeftTopView f45616h;

    /* JADX INFO: renamed from: i */
    public IntlLiveNewLabelEView f45617i;

    /* JADX INFO: renamed from: j */
    public LiveNewOptLabelView f45618j;

    /* JADX INFO: renamed from: k */
    public ViewStub f45619k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f45620l;

    /* JADX INFO: renamed from: m */
    public VText f45621m;

    /* JADX INFO: renamed from: n */
    public VText f45622n;

    /* JADX INFO: renamed from: o */
    public VText f45623o;

    /* JADX INFO: renamed from: p */
    public int f45624p;

    /* JADX INFO: renamed from: q */
    public View f45625q;

    public LiveFeedSuggesstIntlStyleCardView(Context context) {
        super(context);
        this.f45625q = null;
    }

    @SuppressLint({"WrongViewCast"})
    /* JADX INFO: renamed from: r */
    private void m70044r() {
        this.f45609a = (LiveSquareMediaView) findViewById(f5c0.f95057W0);
        this.f45610b = (VFrame) findViewById(f5c0.f94980A2);
        this.f45611c = (VFrame) findViewById(f5c0.f95035P);
        this.f45613e = (ViewStub) findViewById(f5c0.f95121n0);
        this.f45614f = (IntlLiveSpecialLabelView) findViewById(f5c0.f95159w2);
        this.f45615g = (IntlLiveNewLabelDView) findViewById(f5c0.f95167y2);
        this.f45616h = (IntlLiveNewLabelLeftTopView) findViewById(f5c0.f95163x2);
        this.f45617i = (IntlLiveNewLabelEView) findViewById(f5c0.f95171z2);
        this.f45618j = (LiveNewOptLabelView) findViewById(f5c0.f94996E2);
        this.f45619k = (ViewStub) findViewById(f5c0.f95063Y0);
        this.f45620l = (VDraweeView) findViewById(f5c0.f95092g);
        this.f45621m = (VText) findViewById(f5c0.f95091f2);
        this.f45622n = (VText) findViewById(f5c0.f95079c2);
        this.f45623o = (VText) findViewById(f5c0.f95083d2);
        this.f45612d = (LiveIntlSquareFrameView) findViewById(f5c0.f95105j0);
    }

    /* JADX INFO: renamed from: s */
    private void m70045s() {
        xdl0.m208344M(this.f45620l, false);
    }

    private void setAnchorGrade(BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor) {
        long j = bLiveSuggestLiveAnchor.hierarchy;
        if (j == 0) {
            m70045s();
            return;
        }
        BLiveAnchorLevel bLiveAnchorLevelM134372e = s9s.f163232f.m134372e(j);
        if (bLiveAnchorLevelM134372e == null || TextUtils.isEmpty(bLiveAnchorLevelM134372e.backendUrl)) {
            m70045s();
        } else {
            xdl0.m208344M(this.f45620l, true);
            sxj.m186442c(bLiveAnchorLevelM134372e.backendUrl, this.f45620l, sxj.f166797a);
        }
    }

    private void setAudienceAmount(String str) {
        this.f45622n.setText(str);
    }

    private void setDistance(@NonNull Location location) {
        this.f45623o.setText(w8u.m202221x(location));
    }

    private void setLiveName(String str) {
        this.f45621m.setText(str);
    }

    /* JADX INFO: renamed from: z */
    private void m70046z(boolean z) {
        xdl0.m208344M(this.f45610b, z);
    }

    /* JADX INFO: renamed from: B */
    public void m70047B() {
        LiveSquareMediaView liveSquareMediaView = this.f45609a;
        if (liveSquareMediaView == null) {
            return;
        }
        liveSquareMediaView.m68775q();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f45624p = wk4.m203652e(2);
        m70044r();
        m70048p();
        this.f45611c.setBackgroundResource(h3c0.f105706s0);
    }

    /* JADX INFO: renamed from: p */
    public final void m70048p() {
        xdl0.m208325C0(this, this.f45624p);
        xdl0.m208327D0(this.f45624p, this);
        xdl0.m208325C0(this.f45611c, this.f45624p / 2);
        uep0.m193326m(this, t100.f167260i);
    }

    /* JADX INFO: renamed from: u */
    public void m70049u(String str) {
        this.f45609a.m68772n(str);
    }

    /* JADX INFO: renamed from: v */
    public final void m70050v(BLiveSuggestLive bLiveSuggestLive) {
        BLiveIntlLiveFrame bLiveIntlLiveFrame = bLiveSuggestLive.intlFrame;
        if (bLiveIntlLiveFrame == null || TextUtils.isEmpty(bLiveIntlLiveFrame.frameId)) {
            xdl0.m208344M(this.f45612d, false);
            return;
        }
        BLiveFrame bLiveFrameM96260b = afn.m96259a().m96260b(bLiveSuggestLive.intlFrame.frameId);
        LiveIntlSquareFrameView liveIntlSquareFrameView = this.f45612d;
        if (bLiveFrameM96260b == null) {
            xdl0.m208344M(liveIntlSquareFrameView, false);
        } else {
            liveIntlSquareFrameView.m68736c(bLiveFrameM96260b.framePicUrl, bLiveFrameM96260b.frameSvgUrl);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m70051w(BLiveSuggestLive bLiveSuggestLive) {
        setDistance(bLiveSuggestLive.anchor.location);
        setAnchorGrade(bLiveSuggestLive.anchor);
        this.f45609a.setRadius(t100.f167260i);
        SimpleDraweeView simpleDraweeView = this.f45609a.getSimpleDraweeView();
        String str = bLiveSuggestLive.room.coverUrl;
        int i = this.f45624p;
        hxs.m133409v("context_square", simpleDraweeView, str, i, i, true, false, ipn.m137564a(), null);
        setLiveName(bLiveSuggestLive.room.title);
        this.f45621m.setTextSize(14.0f);
        setAudienceAmount(Long.toString(Math.round(bLiveSuggestLive.memberCount)));
        m70046z(!bLiveSuggestLive.isOnLive());
        if (vwb.m200296J(bLiveSuggestLive.coverLabels) && vwb.m200296J(bLiveSuggestLive.coverLabelsV2)) {
            this.f45614f.m70343d(bLiveSuggestLive.specialLabel, s9s.f163228b.m195583A3());
        } else {
            this.f45614f.m70342c();
        }
        xdl0.m208344M(this.f45618j, !vwb.m200296J(bLiveSuggestLive.coverLabelsV2));
        if (vwb.m200296J(bLiveSuggestLive.coverLabelsV2)) {
            dun.m113737a(bLiveSuggestLive.coverLabels, this);
        } else {
            this.f45618j.m68757O(bLiveSuggestLive.coverLabelsV2);
        }
        m70050v(bLiveSuggestLive);
    }

    public LiveFeedSuggesstIntlStyleCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45625q = null;
    }

    public LiveFeedSuggesstIntlStyleCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45625q = null;
    }
}
