package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.common.card;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveFrame;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlLiveFrame;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p051p1.mobile.putong.live.base.view.LiveIntlSquareFrameView;
import com.p051p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveNewLabelDView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveNewLabelEView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveNewLabelLeftTopView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSpecialLabelView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.ahn;
import p153l.bnl0;
import p153l.dwn;
import p153l.i0k;
import p153l.irn;
import p153l.izs;
import p153l.jyb;
import p153l.ldc0;
import p153l.nbc0;
import p153l.qa00;
import p153l.tbs;
import p153l.vl4;
import p153l.xau;
import p153l.ynp0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveFeedSuggesstIntlStyleCardView extends VFrame {

    /* JADX INFO: renamed from: a */
    public LiveSquareMediaView f46457a;

    /* JADX INFO: renamed from: b */
    public VFrame f46458b;

    /* JADX INFO: renamed from: c */
    public VFrame f46459c;

    /* JADX INFO: renamed from: d */
    public LiveIntlSquareFrameView f46460d;

    /* JADX INFO: renamed from: e */
    public ViewStub f46461e;

    /* JADX INFO: renamed from: f */
    public IntlLiveSpecialLabelView f46462f;

    /* JADX INFO: renamed from: g */
    public IntlLiveNewLabelDView f46463g;

    /* JADX INFO: renamed from: h */
    public IntlLiveNewLabelLeftTopView f46464h;

    /* JADX INFO: renamed from: i */
    public IntlLiveNewLabelEView f46465i;

    /* JADX INFO: renamed from: j */
    public LiveNewOptLabelView f46466j;

    /* JADX INFO: renamed from: k */
    public ViewStub f46467k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f46468l;

    /* JADX INFO: renamed from: m */
    public VText f46469m;

    /* JADX INFO: renamed from: n */
    public VText f46470n;

    /* JADX INFO: renamed from: o */
    public VText f46471o;

    /* JADX INFO: renamed from: p */
    public int f46472p;

    /* JADX INFO: renamed from: q */
    public View f46473q;

    public LiveFeedSuggesstIntlStyleCardView(Context context) {
        super(context);
        this.f46473q = null;
    }

    @SuppressLint({"WrongViewCast"})
    /* JADX INFO: renamed from: r */
    private void m71227r() {
        this.f46457a = (LiveSquareMediaView) findViewById(ldc0.f131514W0);
        this.f46458b = (VFrame) findViewById(ldc0.f131437A2);
        this.f46459c = (VFrame) findViewById(ldc0.f131492P);
        this.f46461e = (ViewStub) findViewById(ldc0.f131578n0);
        this.f46462f = (IntlLiveSpecialLabelView) findViewById(ldc0.f131616w2);
        this.f46463g = (IntlLiveNewLabelDView) findViewById(ldc0.f131624y2);
        this.f46464h = (IntlLiveNewLabelLeftTopView) findViewById(ldc0.f131620x2);
        this.f46465i = (IntlLiveNewLabelEView) findViewById(ldc0.f131628z2);
        this.f46466j = (LiveNewOptLabelView) findViewById(ldc0.f131453E2);
        this.f46467k = (ViewStub) findViewById(ldc0.f131520Y0);
        this.f46468l = (VDraweeView) findViewById(ldc0.f131549g);
        this.f46469m = (VText) findViewById(ldc0.f131548f2);
        this.f46470n = (VText) findViewById(ldc0.f131536c2);
        this.f46471o = (VText) findViewById(ldc0.f131540d2);
        this.f46460d = (LiveIntlSquareFrameView) findViewById(ldc0.f131562j0);
    }

    /* JADX INFO: renamed from: s */
    private void m71228s() {
        bnl0.m105524M(this.f46468l, false);
    }

    private void setAnchorGrade(BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor) {
        long j = bLiveSuggestLiveAnchor.hierarchy;
        if (j == 0) {
            m71228s();
            return;
        }
        BLiveAnchorLevel bLiveAnchorLevelM143703e = tbs.f172993f.m143703e(j);
        if (bLiveAnchorLevelM143703e == null || TextUtils.isEmpty(bLiveAnchorLevelM143703e.backendUrl)) {
            m71228s();
        } else {
            bnl0.m105524M(this.f46468l, true);
            i0k.m137976c(bLiveAnchorLevelM143703e.backendUrl, this.f46468l, i0k.f112378a);
        }
    }

    private void setAudienceAmount(String str) {
        this.f46470n.setText(str);
    }

    private void setDistance(@NonNull Location location) {
        this.f46471o.setText(xau.m209914x(location));
    }

    private void setLiveName(String str) {
        this.f46469m.setText(str);
    }

    /* JADX INFO: renamed from: z */
    private void m71229z(boolean z) {
        bnl0.m105524M(this.f46458b, z);
    }

    /* JADX INFO: renamed from: B */
    public void m71230B() {
        LiveSquareMediaView liveSquareMediaView = this.f46457a;
        if (liveSquareMediaView == null) {
            return;
        }
        liveSquareMediaView.m69958q();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f46472p = vl4.m201593e(2);
        m71227r();
        m71231p();
        this.f46459c.setBackgroundResource(nbc0.f141197s0);
    }

    /* JADX INFO: renamed from: p */
    public final void m71231p() {
        bnl0.m105505C0(this, this.f46472p);
        bnl0.m105507D0(this.f46472p, this);
        bnl0.m105505C0(this.f46459c, this.f46472p / 2);
        ynp0.m216936m(this, qa00.f156322i);
    }

    /* JADX INFO: renamed from: u */
    public void m71232u(String str) {
        this.f46457a.m69955n(str);
    }

    /* JADX INFO: renamed from: v */
    public final void m71233v(BLiveSuggestLive bLiveSuggestLive) {
        BLiveIntlLiveFrame bLiveIntlLiveFrame = bLiveSuggestLive.intlFrame;
        if (bLiveIntlLiveFrame == null || TextUtils.isEmpty(bLiveIntlLiveFrame.frameId)) {
            bnl0.m105524M(this.f46460d, false);
            return;
        }
        BLiveFrame bLiveFrameM97855b = ahn.m97854a().m97855b(bLiveSuggestLive.intlFrame.frameId);
        LiveIntlSquareFrameView liveIntlSquareFrameView = this.f46460d;
        if (bLiveFrameM97855b == null) {
            bnl0.m105524M(liveIntlSquareFrameView, false);
        } else {
            liveIntlSquareFrameView.m69919c(bLiveFrameM97855b.framePicUrl, bLiveFrameM97855b.frameSvgUrl);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m71234w(BLiveSuggestLive bLiveSuggestLive) {
        setDistance(bLiveSuggestLive.anchor.location);
        setAnchorGrade(bLiveSuggestLive.anchor);
        this.f46457a.setRadius(qa00.f156322i);
        SimpleDraweeView simpleDraweeView = this.f46457a.getSimpleDraweeView();
        String str = bLiveSuggestLive.room.coverUrl;
        int i = this.f46472p;
        izs.m142871v("context_square", simpleDraweeView, str, i, i, true, false, irn.m141839a(), null);
        setLiveName(bLiveSuggestLive.room.title);
        this.f46469m.setTextSize(14.0f);
        setAudienceAmount(Long.toString(Math.round(bLiveSuggestLive.memberCount)));
        m71229z(!bLiveSuggestLive.isOnLive());
        if (jyb.m147479J(bLiveSuggestLive.coverLabels) && jyb.m147479J(bLiveSuggestLive.coverLabelsV2)) {
            this.f46462f.m71526d(bLiveSuggestLive.specialLabel, tbs.f172989b.m203370A3());
        } else {
            this.f46462f.m71525c();
        }
        bnl0.m105524M(this.f46466j, !jyb.m147479J(bLiveSuggestLive.coverLabelsV2));
        if (jyb.m147479J(bLiveSuggestLive.coverLabelsV2)) {
            dwn.m118416a(bLiveSuggestLive.coverLabels, this);
        } else {
            this.f46466j.m69940O(bLiveSuggestLive.coverLabelsV2);
        }
        m71233v(bLiveSuggestLive);
    }

    public LiveFeedSuggesstIntlStyleCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46473q = null;
    }

    public LiveFeedSuggesstIntlStyleCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46473q = null;
    }
}
