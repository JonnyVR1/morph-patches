package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveRoom;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p147v.VFrame;
import p147v.VText;
import p149l.awu;
import p149l.d5c0;
import p149l.t100;
import p149l.uep0;
import p149l.vwb;
import p149l.wk4;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVideoFeedBStyleCardView extends FrameLayout {
    public VFrame _cover;
    public LiveSquareMediaView _media_view;
    public VText _tv_live_name;
    private VText _tv_subTitle;
    public LiveNewOptLabelView _view_group_opt_label;
    protected int recommendedSideLength;

    public LiveVideoFeedBStyleCardView(@NonNull Context context) {
        super(context);
        this.recommendedSideLength = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m67540a(int i) {
        int iM203652e = wk4.m203652e(i);
        this.recommendedSideLength = iM203652e;
        xdl0.m208325C0(this, iM203652e);
        xdl0.m208325C0(this._cover, this.recommendedSideLength / 2);
        uep0.m193326m(this, t100.f167260i);
    }

    /* JADX INFO: renamed from: b */
    public void m67541b(awu awuVar) {
        BLiveSuggestLive bLiveSuggestLive = awuVar.live;
        this._tv_subTitle.setText(bLiveSuggestLive.subtitle);
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom = bLiveSuggestLive.room;
        if (bLiveSuggestLiveRoom != null) {
            wk4.m203654g(this._media_view, bLiveSuggestLiveRoom.coverUrl, this.recommendedSideLength);
            this._tv_live_name.setText(bLiveSuggestLive.room.title);
        }
        this._tv_live_name.setTextSize(14.0f);
        xdl0.m208344M(this._view_group_opt_label, !vwb.m200296J(bLiveSuggestLive.coverLabelsV2));
        if (vwb.m200296J(bLiveSuggestLive.coverLabelsV2)) {
            return;
        }
        this._view_group_opt_label.m68757O(bLiveSuggestLive.coverLabelsV2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._media_view = (LiveSquareMediaView) findViewById(d5c0.f84489k0);
        this._cover = (VFrame) findViewById(d5c0.f84412D);
        this._view_group_opt_label = (LiveNewOptLabelView) findViewById(d5c0.f84499n1);
        this._tv_live_name = (VText) findViewById(d5c0.f84475f1);
        this._tv_subTitle = (VText) findViewById(d5c0.f84481h1);
    }

    public LiveVideoFeedBStyleCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.recommendedSideLength = 0;
    }

    public LiveVideoFeedBStyleCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.recommendedSideLength = 0;
    }
}
