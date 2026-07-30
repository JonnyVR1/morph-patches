package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.tvline;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.data.BLiveChatMsg;
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
import p153l.l9c0;
import p153l.n3d0;
import p153l.ner;
import p153l.vuf0;
import p153l.xau;
import p153l.yrs;
import p153l.z20;

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
        this.recommendedSideLength = bnl0.m105592y0() / 2;
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m68713c(String str) {
        if (str.length() > 4) {
            str = str.substring(0, 4).concat("...");
        }
        return str.concat(":");
    }

    /* JADX INFO: renamed from: d */
    public void m68714d() {
        bnl0.m105524M(this._anchor_level_icon, false);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m68715e(BLiveSuggestLive bLiveSuggestLive, Long l2, View view) {
        BLiveChatMsg bLiveChatMsg = bLiveSuggestLive.chatMessages.get((int) (l2.longValue() % ((long) bLiveSuggestLive.chatMessages.size())));
        if (view instanceof TextView) {
            ((TextView) view).setText(vuf0.m202788a(getContext(), m68713c(bLiveChatMsg.userName)).m202791c(n3d0.m161277a(l9c0.f130596i)).m202789a(bLiveChatMsg.msg).m202791c(-1).m202790b());
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m68716f(byu byuVar, View view) {
        LiveCardTrackData liveCardTrackData = byuVar.localTrackData;
        if (liveCardTrackData != null) {
            LiveCardTracker.trackMc(liveCardTrackData);
        }
        if (byuVar.localGoAction != null) {
            yrs.m217233a(getContext(), byuVar.localGoAction);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m68717g(final byu byuVar, final BLiveSuggestLive bLiveSuggestLive, ner nerVar, ft5 ft5Var) {
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = bLiveSuggestLive.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            setDistance(bLiveSuggestLiveAnchor.location);
        } else {
            m68714d();
        }
        if (bLiveSuggestLive.room != null) {
            SimpleDraweeView simpleDraweeView = this._media_view.getSimpleDraweeView();
            String str = bLiveSuggestLive.room.coverUrl;
            int i = this.recommendedSideLength;
            izs.m142870u("context_square", simpleDraweeView, str, i, i);
            setLiveName(bLiveSuggestLive.room.title);
        }
        bnl0.m105524M(this._view_group_opt_label, !jyb.m147479J(bLiveSuggestLive.coverLabelsV2));
        this._view_group_opt_label.setCAreaLabelEnable(false);
        if (!jyb.m147479J(bLiveSuggestLive.coverLabelsV2)) {
            this._view_group_opt_label.m69940O(bLiveSuggestLive.coverLabelsV2);
        }
        this._tv_live_name.setTextSize(15.0f);
        setAudienceAmount(Long.toString(Math.round(bLiveSuggestLive.memberCount)));
        int size = bLiveSuggestLive.chatMessages.size();
        LiveMsgAutoScrollView liveMsgAutoScrollView = this._msg_scroll_view;
        if (size >= 5) {
            liveMsgAutoScrollView.setViewRender(new z20() { // from class: l.gfu
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f103953a.m68715e(bLiveSuggestLive, (Long) obj, (View) obj2);
                }
            });
            this._msg_scroll_view.m68704e(nerVar);
        } else {
            liveMsgAutoScrollView.m68705f();
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.hfu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109344a.m68716f(byuVar, view);
            }
        });
        LiveCardTrackData liveCardTrackData = byuVar.localTrackData;
        if (liveCardTrackData != null) {
            LiveCardTracker.trackMv(liveCardTrackData);
        }
        if (TextUtils.isEmpty(bLiveSuggestLive.videoCaptureUrl)) {
            return;
        }
        this._media_view.m69955n(bLiveSuggestLive.videoCaptureUrl);
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
        this._msg_scroll_view = (LiveMsgAutoScrollView) findViewById(jdc0.f120222p0);
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

    public LiveTvLineCardMainItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.recommendedSideLength = bnl0.m105592y0() / 2;
    }

    public LiveTvLineCardMainItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.recommendedSideLength = bnl0.m105592y0() / 2;
    }
}
