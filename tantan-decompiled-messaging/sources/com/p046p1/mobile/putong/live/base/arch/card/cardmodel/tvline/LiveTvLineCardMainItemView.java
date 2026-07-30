package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.tvline;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.data.BLiveChatMsg;
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
import p149l.f1c0;
import p149l.f30;
import p149l.hxs;
import p149l.kvc0;
import p149l.mcr;
import p149l.mmf0;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;
import p149l.xps;

/* JADX INFO: loaded from: classes13.dex */
public class LiveTvLineCardMainItemView extends FrameLayout {
    public VDraweeView _anchor_level_icon;
    public VFrame _cover;
    public LiveSquareMediaView _media_view;
    public LiveMsgAutoScrollView _msg_scroll_view;
    public VText _tv_live_audience_amount;
    public VText _tv_live_distance;
    public VText _tv_live_name;
    public LiveNewOptLabelView _view_group_opt_label;
    private final int recommendedSideLength;

    public LiveTvLineCardMainItemView(Context context) {
        super(context);
        this.recommendedSideLength = xdl0.m208412y0() / 2;
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m67530c(String str) {
        if (str.length() > 4) {
            str = str.substring(0, 4).concat("...");
        }
        return str.concat(":");
    }

    /* JADX INFO: renamed from: d */
    public void m67531d() {
        xdl0.m208344M(this._anchor_level_icon, false);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m67532e(BLiveSuggestLive bLiveSuggestLive, Long l2, View view) {
        BLiveChatMsg bLiveChatMsg = bLiveSuggestLive.chatMessages.get((int) (l2.longValue() % ((long) bLiveSuggestLive.chatMessages.size())));
        if (view instanceof TextView) {
            ((TextView) view).setText(mmf0.m155392a(getContext(), m67530c(bLiveChatMsg.userName)).m155395c(kvc0.m147352a(f1c0.f94072i)).m155393a(bLiveChatMsg.msg).m155395c(-1).m155394b());
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m67533f(awu awuVar, View view) {
        LiveCardTrackData liveCardTrackData = awuVar.localTrackData;
        if (liveCardTrackData != null) {
            LiveCardTracker.trackMc(liveCardTrackData);
        }
        if (awuVar.localGoAction != null) {
            xps.m210534a(getContext(), awuVar.localGoAction);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m67534g(final awu awuVar, final BLiveSuggestLive bLiveSuggestLive, mcr mcrVar, bs5 bs5Var) {
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = bLiveSuggestLive.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            setDistance(bLiveSuggestLiveAnchor.location);
        } else {
            m67531d();
        }
        if (bLiveSuggestLive.room != null) {
            SimpleDraweeView simpleDraweeView = this._media_view.getSimpleDraweeView();
            String str = bLiveSuggestLive.room.coverUrl;
            int i = this.recommendedSideLength;
            hxs.m133408u("context_square", simpleDraweeView, str, i, i);
            setLiveName(bLiveSuggestLive.room.title);
        }
        xdl0.m208344M(this._view_group_opt_label, !vwb.m200296J(bLiveSuggestLive.coverLabelsV2));
        this._view_group_opt_label.setCAreaLabelEnable(false);
        if (!vwb.m200296J(bLiveSuggestLive.coverLabelsV2)) {
            this._view_group_opt_label.m68757O(bLiveSuggestLive.coverLabelsV2);
        }
        this._tv_live_name.setTextSize(15.0f);
        setAudienceAmount(Long.toString(Math.round(bLiveSuggestLive.memberCount)));
        int size = bLiveSuggestLive.chatMessages.size();
        LiveMsgAutoScrollView liveMsgAutoScrollView = this._msg_scroll_view;
        if (size >= 5) {
            liveMsgAutoScrollView.setViewRender(new f30() { // from class: l.fdu
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f97074a.m67532e(bLiveSuggestLive, (Long) obj, (View) obj2);
                }
            });
            this._msg_scroll_view.m67521e(mcrVar);
        } else {
            liveMsgAutoScrollView.m67522f();
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.gdu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102134a.m67533f(awuVar, view);
            }
        });
        LiveCardTrackData liveCardTrackData = awuVar.localTrackData;
        if (liveCardTrackData != null) {
            LiveCardTracker.trackMv(liveCardTrackData);
        }
        if (TextUtils.isEmpty(bLiveSuggestLive.videoCaptureUrl)) {
            return;
        }
        this._media_view.m68772n(bLiveSuggestLive.videoCaptureUrl);
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
        this._msg_scroll_view = (LiveMsgAutoScrollView) findViewById(d5c0.f84504p0);
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

    public LiveTvLineCardMainItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.recommendedSideLength = xdl0.m208412y0() / 2;
    }

    public LiveTvLineCardMainItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.recommendedSideLength = xdl0.m208412y0() / 2;
    }
}
