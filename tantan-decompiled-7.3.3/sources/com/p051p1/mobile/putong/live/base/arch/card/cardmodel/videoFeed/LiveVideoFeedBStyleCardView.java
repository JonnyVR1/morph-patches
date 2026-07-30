package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveRoom;
import com.p051p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.byu;
import p153l.jdc0;
import p153l.jyb;
import p153l.qa00;
import p153l.vl4;
import p153l.ynp0;

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
    public void m68723a(int i) {
        int iM201593e = vl4.m201593e(i);
        this.recommendedSideLength = iM201593e;
        bnl0.m105505C0(this, iM201593e);
        bnl0.m105505C0(this._cover, this.recommendedSideLength / 2);
        ynp0.m216936m(this, qa00.f156322i);
    }

    /* JADX INFO: renamed from: b */
    public void m68724b(byu byuVar) {
        BLiveSuggestLive bLiveSuggestLive = byuVar.live;
        this._tv_subTitle.setText(bLiveSuggestLive.subtitle);
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom = bLiveSuggestLive.room;
        if (bLiveSuggestLiveRoom != null) {
            vl4.m201595g(this._media_view, bLiveSuggestLiveRoom.coverUrl, this.recommendedSideLength);
            this._tv_live_name.setText(bLiveSuggestLive.room.title);
        }
        this._tv_live_name.setTextSize(14.0f);
        bnl0.m105524M(this._view_group_opt_label, !jyb.m147479J(bLiveSuggestLive.coverLabelsV2));
        if (jyb.m147479J(bLiveSuggestLive.coverLabelsV2)) {
            return;
        }
        this._view_group_opt_label.m69940O(bLiveSuggestLive.coverLabelsV2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._media_view = (LiveSquareMediaView) findViewById(jdc0.f120207k0);
        this._cover = (VFrame) findViewById(jdc0.f120130D);
        this._view_group_opt_label = (LiveNewOptLabelView) findViewById(jdc0.f120217n1);
        this._tv_live_name = (VText) findViewById(jdc0.f120193f1);
        this._tv_subTitle = (VText) findViewById(jdc0.f120199h1);
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
