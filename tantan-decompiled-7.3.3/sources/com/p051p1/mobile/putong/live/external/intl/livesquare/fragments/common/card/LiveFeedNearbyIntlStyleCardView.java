package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.common.card;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.live.base.data.BLiveLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSpecialLabelView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.fc2;
import p153l.izs;
import p153l.jyb;
import p153l.ldc0;
import p153l.nbc0;
import p153l.qa00;
import p153l.qcj;
import p153l.tbs;
import p153l.vl4;
import p153l.wlj;
import p153l.xau;
import p153l.y6u;
import p153l.ynp0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveFeedNearbyIntlStyleCardView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveSquareMediaView f46448a;

    /* JADX INFO: renamed from: b */
    public VFrame f46449b;

    /* JADX INFO: renamed from: c */
    public IntlLiveSpecialLabelView f46450c;

    /* JADX INFO: renamed from: d */
    public LiveNewOptLabelView f46451d;

    /* JADX INFO: renamed from: e */
    public VText f46452e;

    /* JADX INFO: renamed from: f */
    public VText f46453f;

    /* JADX INFO: renamed from: g */
    public VText f46454g;

    /* JADX INFO: renamed from: h */
    public VText f46455h;

    /* JADX INFO: renamed from: i */
    public int f46456i;

    public LiveFeedNearbyIntlStyleCardView(Context context) {
        super(context);
    }

    private void setDistance(@NonNull Location location) {
        String strM209914x = xau.m209914x(location);
        if (TextUtils.isEmpty(strM209914x)) {
            this.f46454g.setText("");
            return;
        }
        if (!bnl0.m105529O0(this.f46455h) || !m71221d(location)) {
            this.f46454g.setText(strM209914x);
            return;
        }
        if (strM209914x.length() > 4) {
            strM209914x = strM209914x.substring(0, 4).concat("...");
        }
        this.f46454g.setText(strM209914x);
    }

    private void setLiveName(String str) {
        this.f46453f.setText(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m71219b(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            bnl0.m105525M0(this.f46455h, false);
            return;
        }
        String strM214503g = y6u.m214503g(d);
        bnl0.m105525M0(this.f46455h, !TextUtils.isEmpty(strM214503g));
        this.f46455h.setText(strM214503g);
    }

    /* JADX INFO: renamed from: c */
    public final void m71220c() {
        this.f46448a = (LiveSquareMediaView) findViewById(ldc0.f131514W0);
        this.f46449b = (VFrame) findViewById(ldc0.f131437A2);
        this.f46450c = (IntlLiveSpecialLabelView) findViewById(ldc0.f131616w2);
        this.f46451d = (LiveNewOptLabelView) findViewById(ldc0.f131453E2);
        this.f46452e = (VText) findViewById(ldc0.f131512V1);
        this.f46453f = (VText) findViewById(ldc0.f131548f2);
        this.f46454g = (VText) findViewById(ldc0.f131524Z1);
        this.f46455h = (VText) findViewById(ldc0.f131552g2);
        bnl0.m105505C0(this.f46448a, this.f46456i);
        wlj hierarchy = this.f46448a.getSimpleDraweeView().getHierarchy();
        if (hierarchy != null) {
            hierarchy.m207041D(nbc0.f141188p0);
        }
        this.f46448a.setRadius(qa00.f156322i);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m71221d(@NonNull Location location) {
        return location.distance >= 100000;
    }

    /* JADX INFO: renamed from: e */
    public void m71222e(String str) {
        this.f46448a.m69955n(str);
    }

    /* JADX INFO: renamed from: f */
    public void m71223f(BLiveSuggestLive bLiveSuggestLive) {
        BLiveSettings bLiveSettingsM203370A3 = tbs.f172989b.m203370A3();
        SimpleDraweeView simpleDraweeView = this.f46448a.getSimpleDraweeView();
        String str = bLiveSuggestLive.room.coverUrl;
        int i = this.f46456i;
        izs.m142870u("context_square", simpleDraweeView, str, i, i);
        m71219b(bLiveSuggestLive.memberCount);
        setDistance(bLiveSuggestLive.anchor.location);
        setLiveName(bLiveSuggestLive.anchor.name);
        if (bLiveSettingsM203370A3 != null) {
            m71224g(bLiveSuggestLive.basicLabel, bLiveSettingsM203370A3);
        } else {
            m71224g(null, null);
        }
        m71225h(!bLiveSuggestLive.isOnLive());
        boolean zM147479J = jyb.m147479J(bLiveSuggestLive.coverLabelsV2);
        IntlLiveSpecialLabelView intlLiveSpecialLabelView = this.f46450c;
        if (zM147479J) {
            intlLiveSpecialLabelView.m71526d(bLiveSuggestLive.specialLabel, bLiveSettingsM203370A3);
        } else {
            intlLiveSpecialLabelView.m71525c();
        }
        bnl0.m105524M(this.f46451d, !jyb.m147479J(bLiveSuggestLive.coverLabelsV2));
        if (jyb.m147479J(bLiveSuggestLive.coverLabelsV2)) {
            return;
        }
        this.f46451d.m69940O(bLiveSuggestLive.coverLabelsV2);
    }

    /* JADX INFO: renamed from: g */
    public final void m71224g(@Nullable final BLiveSuggestLabel bLiveSuggestLabel, BLiveSettings bLiveSettings) {
        VText vText = this.f46452e;
        if (bLiveSuggestLabel == null) {
            bnl0.m105524M(vText, false);
            return;
        }
        bnl0.m105525M0(vText, true);
        this.f46452e.setText(bLiveSuggestLabel.value);
        BLiveLabel bLiveLabel = (BLiveLabel) jyb.m147529r(bLiveSettings.liveLabels, new qcj() { // from class: l.efs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveLabel) obj).f45240id.equals(bLiveSuggestLabel.templateId));
            }
        });
        if (bLiveLabel != null) {
            String strM216933j = ynp0.m216933j(bLiveLabel.textColor);
            this.f46452e.setTextSize(2, bLiveLabel.textSize);
            this.f46452e.setTextColor(Color.parseColor(strM216933j));
            this.f46452e.setBackground(fc2.m124980j(ynp0.m216917B(bLiveLabel.background.startColor), ynp0.m216917B(bLiveLabel.background.endColor), 4));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m71225h(boolean z) {
        bnl0.m105524M(this.f46449b, z);
    }

    /* JADX INFO: renamed from: i */
    public void m71226i() {
        LiveSquareMediaView liveSquareMediaView = this.f46448a;
        if (liveSquareMediaView == null) {
            return;
        }
        liveSquareMediaView.m69958q();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f46456i = vl4.m201593e(3);
        m71220c();
    }

    public LiveFeedNearbyIntlStyleCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFeedNearbyIntlStyleCardView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
