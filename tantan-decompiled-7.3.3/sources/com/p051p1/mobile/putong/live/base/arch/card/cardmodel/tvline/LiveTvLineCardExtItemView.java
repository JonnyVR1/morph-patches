package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.tvline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p051p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.byu;
import p153l.ft5;
import p153l.izs;
import p153l.jdc0;
import p153l.jyb;
import p153l.ner;
import p153l.xau;
import p153l.yrs;

/* JADX INFO: loaded from: classes13.dex */
public class LiveTvLineCardExtItemView extends FrameLayout {
    public VDraweeView _anchor_level_icon;
    public VFrame _cover;
    public LiveSquareMediaView _media_view;
    public VText _tv_live_audience_amount;
    public VText _tv_live_distance;
    public VText _tv_live_name;
    public LiveNewOptLabelView _view_group_opt_label;
    private final int recommendedSideLength;

    public LiveTvLineCardExtItemView(Context context) {
        super(context);
        this.recommendedSideLength = bnl0.m105592y0() / 2;
    }

    /* JADX INFO: renamed from: b */
    public void m68707b() {
        bnl0.m105524M(this._anchor_level_icon, false);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m68708c(byu byuVar, View view) {
        LiveCardTrackData liveCardTrackData = byuVar.localTrackData;
        if (liveCardTrackData != null) {
            LiveCardTracker.trackMc(liveCardTrackData);
        }
        if (byuVar.localGoAction != null) {
            yrs.m217233a(getContext(), byuVar.localGoAction);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m68709d() {
        bnl0.m105524M(this._cover, false);
        setLiveName("");
        bnl0.m105524M(this._tv_live_distance, false);
        bnl0.m105524M(this._media_view, false);
        bnl0.m105524M(this._tv_live_audience_amount, false);
    }

    /* JADX INFO: renamed from: e */
    public void m68710e(final byu byuVar, BLiveSuggestLive bLiveSuggestLive, ner nerVar, ft5 ft5Var, int i) {
        bnl0.m105524M(this._cover, true);
        bnl0.m105524M(this._tv_live_distance, true);
        bnl0.m105524M(this._media_view, true);
        bnl0.m105524M(this._tv_live_audience_amount, true);
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = bLiveSuggestLive.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            setDistance(bLiveSuggestLiveAnchor.location);
        } else {
            m68707b();
        }
        bnl0.m105524M(this._view_group_opt_label, true ^ jyb.m147479J(bLiveSuggestLive.coverLabelsV2));
        this._view_group_opt_label.setAAreaLabelEnable(false);
        this._view_group_opt_label.setBAreaLabelEnable(false);
        if (!jyb.m147479J(bLiveSuggestLive.coverLabelsV2)) {
            this._view_group_opt_label.m69940O(bLiveSuggestLive.coverLabelsV2);
        }
        if (bLiveSuggestLive.room != null) {
            SimpleDraweeView simpleDraweeView = this._media_view.getSimpleDraweeView();
            String str = bLiveSuggestLive.room.coverUrl;
            int i2 = this.recommendedSideLength;
            izs.m142870u("context_square", simpleDraweeView, str, i2, i2);
            setLiveName(bLiveSuggestLive.room.title);
        }
        this._tv_live_name.setTextSize(15.0f);
        setAudienceAmount(Long.toString(Math.round(bLiveSuggestLive.memberCount)));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ffu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98838a.m68708c(byuVar, view);
            }
        });
        LiveCardTrackData liveCardTrackData = byuVar.localTrackData;
        if (liveCardTrackData != null) {
            LiveCardTracker.trackMv(liveCardTrackData);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._media_view = (LiveSquareMediaView) findViewById(jdc0.f120207k0);
        this._cover = (VFrame) findViewById(jdc0.f120130D);
        this._anchor_level_icon = (VDraweeView) findViewById(jdc0.f120182c);
        this._tv_live_distance = (VText) findViewById(jdc0.f120190e1);
        this._tv_live_audience_amount = (VText) findViewById(jdc0.f120187d1);
        this._tv_live_name = (VText) findViewById(jdc0.f120193f1);
        this._view_group_opt_label = (LiveNewOptLabelView) findViewById(jdc0.f120217n1);
    }

    public void setAudienceAmount(String str) {
        this._tv_live_audience_amount.setText(str);
    }

    public void setDistance(@NonNull Location location) {
        this._tv_live_distance.setText(xau.m209914x(location));
    }

    public void setLiveName(String str) {
        this._tv_live_name.setText(str);
    }

    public LiveTvLineCardExtItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.recommendedSideLength = bnl0.m105592y0() / 2;
    }

    public LiveTvLineCardExtItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.recommendedSideLength = bnl0.m105592y0() / 2;
    }
}
