package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.tvline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.awu;
import p149l.bs5;
import p149l.d5c0;
import p149l.hxs;
import p149l.mcr;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;
import p149l.xps;

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
        this.recommendedSideLength = xdl0.m208412y0() / 2;
    }

    /* JADX INFO: renamed from: b */
    public void m67524b() {
        xdl0.m208344M(this._anchor_level_icon, false);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m67525c(awu awuVar, View view) {
        LiveCardTrackData liveCardTrackData = awuVar.localTrackData;
        if (liveCardTrackData != null) {
            LiveCardTracker.trackMc(liveCardTrackData);
        }
        if (awuVar.localGoAction != null) {
            xps.m210534a(getContext(), awuVar.localGoAction);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m67526d() {
        xdl0.m208344M(this._cover, false);
        setLiveName("");
        xdl0.m208344M(this._tv_live_distance, false);
        xdl0.m208344M(this._media_view, false);
        xdl0.m208344M(this._tv_live_audience_amount, false);
    }

    /* JADX INFO: renamed from: e */
    public void m67527e(final awu awuVar, BLiveSuggestLive bLiveSuggestLive, mcr mcrVar, bs5 bs5Var, int i) {
        xdl0.m208344M(this._cover, true);
        xdl0.m208344M(this._tv_live_distance, true);
        xdl0.m208344M(this._media_view, true);
        xdl0.m208344M(this._tv_live_audience_amount, true);
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = bLiveSuggestLive.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            setDistance(bLiveSuggestLiveAnchor.location);
        } else {
            m67524b();
        }
        xdl0.m208344M(this._view_group_opt_label, true ^ vwb.m200296J(bLiveSuggestLive.coverLabelsV2));
        this._view_group_opt_label.setAAreaLabelEnable(false);
        this._view_group_opt_label.setBAreaLabelEnable(false);
        if (!vwb.m200296J(bLiveSuggestLive.coverLabelsV2)) {
            this._view_group_opt_label.m68757O(bLiveSuggestLive.coverLabelsV2);
        }
        if (bLiveSuggestLive.room != null) {
            SimpleDraweeView simpleDraweeView = this._media_view.getSimpleDraweeView();
            String str = bLiveSuggestLive.room.coverUrl;
            int i2 = this.recommendedSideLength;
            hxs.m133408u("context_square", simpleDraweeView, str, i2, i2);
            setLiveName(bLiveSuggestLive.room.title);
        }
        this._tv_live_name.setTextSize(15.0f);
        setAudienceAmount(Long.toString(Math.round(bLiveSuggestLive.memberCount)));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.edu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90646a.m67525c(awuVar, view);
            }
        });
        LiveCardTrackData liveCardTrackData = awuVar.localTrackData;
        if (liveCardTrackData != null) {
            LiveCardTracker.trackMv(liveCardTrackData);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._media_view = (LiveSquareMediaView) findViewById(d5c0.f84489k0);
        this._cover = (VFrame) findViewById(d5c0.f84412D);
        this._anchor_level_icon = (VDraweeView) findViewById(d5c0.f84464c);
        this._tv_live_distance = (VText) findViewById(d5c0.f84472e1);
        this._tv_live_audience_amount = (VText) findViewById(d5c0.f84469d1);
        this._tv_live_name = (VText) findViewById(d5c0.f84475f1);
        this._view_group_opt_label = (LiveNewOptLabelView) findViewById(d5c0.f84499n1);
    }

    public void setAudienceAmount(String str) {
        this._tv_live_audience_amount.setText(str);
    }

    public void setDistance(@NonNull Location location) {
        this._tv_live_distance.setText(w8u.m202221x(location));
    }

    public void setLiveName(String str) {
        this._tv_live_name.setText(str);
    }

    public LiveTvLineCardExtItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.recommendedSideLength = xdl0.m208412y0() / 2;
    }

    public LiveTvLineCardExtItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.recommendedSideLength = xdl0.m208412y0() / 2;
    }
}
