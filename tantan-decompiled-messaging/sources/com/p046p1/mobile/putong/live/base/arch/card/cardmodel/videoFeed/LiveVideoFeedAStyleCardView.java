package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveRoom;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.awu;
import p149l.d5c0;
import p149l.t100;
import p149l.uep0;
import p149l.vwb;
import p149l.w8u;
import p149l.wk4;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVideoFeedAStyleCardView extends FrameLayout {
    public VDraweeView _anchor_level_icon;
    public VFrame _cover;
    public LiveSquareMediaView _media_view;
    public VText _tv_live_audience_amount;
    public VText _tv_live_distance;
    public VText _tv_live_name;
    public VFrame _view_group_live_end;
    public LiveNewOptLabelView _view_group_opt_label;
    protected int recommendedSideLength;

    public LiveVideoFeedAStyleCardView(@NonNull Context context) {
        super(context);
        this.recommendedSideLength = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m67536a(int i) {
        int iM203652e = wk4.m203652e(i);
        this.recommendedSideLength = iM203652e;
        xdl0.m208325C0(this, iM203652e);
        xdl0.m208325C0(this._cover, this.recommendedSideLength / 2);
        uep0.m193326m(this, t100.f167260i);
    }

    /* JADX INFO: renamed from: b */
    public void m67537b(String str) {
        this._media_view.m68772n(str);
    }

    /* JADX INFO: renamed from: c */
    public void m67538c(awu awuVar) {
        BLiveSuggestLive bLiveSuggestLive = awuVar.live;
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = bLiveSuggestLive.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            this._tv_live_distance.setText(w8u.m202221x(bLiveSuggestLiveAnchor.location));
        } else {
            xdl0.m208344M(this._anchor_level_icon, false);
        }
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom = bLiveSuggestLive.room;
        if (bLiveSuggestLiveRoom != null) {
            wk4.m203654g(this._media_view, bLiveSuggestLiveRoom.coverUrl, this.recommendedSideLength);
            this._tv_live_name.setText(bLiveSuggestLive.room.title);
        }
        this._tv_live_name.setTextSize(14.0f);
        this._tv_live_audience_amount.setText(Long.toString(Math.round(bLiveSuggestLive.memberCount)));
        xdl0.m208344M(this._view_group_live_end, !bLiveSuggestLive.isOnLive());
        xdl0.m208344M(this._view_group_opt_label, !vwb.m200296J(bLiveSuggestLive.coverLabelsV2));
        if (vwb.m200296J(bLiveSuggestLive.coverLabelsV2)) {
            return;
        }
        this._view_group_opt_label.m68757O(bLiveSuggestLive.coverLabelsV2);
    }

    /* JADX INFO: renamed from: d */
    public void m67539d() {
        LiveSquareMediaView liveSquareMediaView = this._media_view;
        if (liveSquareMediaView == null) {
            return;
        }
        liveSquareMediaView.m68775q();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._media_view = (LiveSquareMediaView) findViewById(d5c0.f84489k0);
        this._view_group_live_end = (VFrame) findViewById(d5c0.f84424J);
        this._cover = (VFrame) findViewById(d5c0.f84412D);
        this._view_group_opt_label = (LiveNewOptLabelView) findViewById(d5c0.f84452X);
        this._anchor_level_icon = (VDraweeView) findViewById(d5c0.f84440R);
        this._tv_live_name = (VText) findViewById(d5c0.f84457Z0);
        this._tv_live_audience_amount = (VText) findViewById(d5c0.f84409B0);
        this._tv_live_distance = (VText) findViewById(d5c0.f84429L0);
    }

    public LiveVideoFeedAStyleCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.recommendedSideLength = 0;
    }

    public LiveVideoFeedAStyleCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.recommendedSideLength = 0;
    }
}
