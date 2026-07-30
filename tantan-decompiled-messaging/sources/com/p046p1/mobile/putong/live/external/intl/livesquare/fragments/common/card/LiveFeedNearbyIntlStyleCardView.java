package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.common.card;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.live.base.data.BLiveLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSpecialLabelView;
import p147v.VFrame;
import p147v.VText;
import p149l.djj;
import p149l.f5c0;
import p149l.h3c0;
import p149l.hxs;
import p149l.s9s;
import p149l.t100;
import p149l.uep0;
import p149l.vwb;
import p149l.w8u;
import p149l.w9j;
import p149l.wk4;
import p149l.x4u;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes13.dex */
public class LiveFeedNearbyIntlStyleCardView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveSquareMediaView f45600a;

    /* JADX INFO: renamed from: b */
    public VFrame f45601b;

    /* JADX INFO: renamed from: c */
    public IntlLiveSpecialLabelView f45602c;

    /* JADX INFO: renamed from: d */
    public LiveNewOptLabelView f45603d;

    /* JADX INFO: renamed from: e */
    public VText f45604e;

    /* JADX INFO: renamed from: f */
    public VText f45605f;

    /* JADX INFO: renamed from: g */
    public VText f45606g;

    /* JADX INFO: renamed from: h */
    public VText f45607h;

    /* JADX INFO: renamed from: i */
    public int f45608i;

    public LiveFeedNearbyIntlStyleCardView(Context context) {
        super(context);
    }

    private void setDistance(@NonNull Location location) {
        String strM202221x = w8u.m202221x(location);
        if (TextUtils.isEmpty(strM202221x)) {
            this.f45606g.setText("");
            return;
        }
        if (!xdl0.m208349O0(this.f45607h) || !m70038d(location)) {
            this.f45606g.setText(strM202221x);
            return;
        }
        if (strM202221x.length() > 4) {
            strM202221x = strM202221x.substring(0, 4).concat("...");
        }
        this.f45606g.setText(strM202221x);
    }

    private void setLiveName(String str) {
        this.f45605f.setText(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m70036b(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            xdl0.m208345M0(this.f45607h, false);
            return;
        }
        String strM207021g = x4u.m207021g(d);
        xdl0.m208345M0(this.f45607h, !TextUtils.isEmpty(strM207021g));
        this.f45607h.setText(strM207021g);
    }

    /* JADX INFO: renamed from: c */
    public final void m70037c() {
        this.f45600a = (LiveSquareMediaView) findViewById(f5c0.f95057W0);
        this.f45601b = (VFrame) findViewById(f5c0.f94980A2);
        this.f45602c = (IntlLiveSpecialLabelView) findViewById(f5c0.f95159w2);
        this.f45603d = (LiveNewOptLabelView) findViewById(f5c0.f94996E2);
        this.f45604e = (VText) findViewById(f5c0.f95055V1);
        this.f45605f = (VText) findViewById(f5c0.f95091f2);
        this.f45606g = (VText) findViewById(f5c0.f95067Z1);
        this.f45607h = (VText) findViewById(f5c0.f95095g2);
        xdl0.m208325C0(this.f45600a, this.f45608i);
        djj hierarchy = this.f45600a.getSimpleDraweeView().getHierarchy();
        if (hierarchy != null) {
            hierarchy.m112049D(h3c0.f105697p0);
        }
        this.f45600a.setRadius(t100.f167260i);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m70038d(@NonNull Location location) {
        return location.distance >= 100000;
    }

    /* JADX INFO: renamed from: e */
    public void m70039e(String str) {
        this.f45600a.m68772n(str);
    }

    /* JADX INFO: renamed from: f */
    public void m70040f(BLiveSuggestLive bLiveSuggestLive) {
        BLiveSettings bLiveSettingsM195583A3 = s9s.f163228b.m195583A3();
        SimpleDraweeView simpleDraweeView = this.f45600a.getSimpleDraweeView();
        String str = bLiveSuggestLive.room.coverUrl;
        int i = this.f45608i;
        hxs.m133408u("context_square", simpleDraweeView, str, i, i);
        m70036b(bLiveSuggestLive.memberCount);
        setDistance(bLiveSuggestLive.anchor.location);
        setLiveName(bLiveSuggestLive.anchor.name);
        if (bLiveSettingsM195583A3 != null) {
            m70041g(bLiveSuggestLive.basicLabel, bLiveSettingsM195583A3);
        } else {
            m70041g(null, null);
        }
        m70042h(!bLiveSuggestLive.isOnLive());
        boolean zM200296J = vwb.m200296J(bLiveSuggestLive.coverLabelsV2);
        IntlLiveSpecialLabelView intlLiveSpecialLabelView = this.f45602c;
        if (zM200296J) {
            intlLiveSpecialLabelView.m70343d(bLiveSuggestLive.specialLabel, bLiveSettingsM195583A3);
        } else {
            intlLiveSpecialLabelView.m70342c();
        }
        xdl0.m208344M(this.f45603d, !vwb.m200296J(bLiveSuggestLive.coverLabelsV2));
        if (vwb.m200296J(bLiveSuggestLive.coverLabelsV2)) {
            return;
        }
        this.f45603d.m68757O(bLiveSuggestLive.coverLabelsV2);
    }

    /* JADX INFO: renamed from: g */
    public final void m70041g(@Nullable final BLiveSuggestLabel bLiveSuggestLabel, BLiveSettings bLiveSettings) {
        VText vText = this.f45604e;
        if (bLiveSuggestLabel == null) {
            xdl0.m208344M(vText, false);
            return;
        }
        xdl0.m208345M0(vText, true);
        this.f45604e.setText(bLiveSuggestLabel.value);
        BLiveLabel bLiveLabel = (BLiveLabel) vwb.m200346r(bLiveSettings.liveLabels, new w9j() { // from class: l.dds
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveLabel) obj).f44392id.equals(bLiveSuggestLabel.templateId));
            }
        });
        if (bLiveLabel != null) {
            String strM193323j = uep0.m193323j(bLiveLabel.textColor);
            this.f45604e.setTextSize(2, bLiveLabel.textSize);
            this.f45604e.setTextColor(Color.parseColor(strM193323j));
            this.f45604e.setBackground(yb2.m213885j(uep0.m193307B(bLiveLabel.background.startColor), uep0.m193307B(bLiveLabel.background.endColor), 4));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m70042h(boolean z) {
        xdl0.m208344M(this.f45601b, z);
    }

    /* JADX INFO: renamed from: i */
    public void m70043i() {
        LiveSquareMediaView liveSquareMediaView = this.f45600a;
        if (liveSquareMediaView == null) {
            return;
        }
        liveSquareMediaView.m68775q();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f45608i = wk4.m203652e(3);
        m70037c();
    }

    public LiveFeedNearbyIntlStyleCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFeedNearbyIntlStyleCardView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
