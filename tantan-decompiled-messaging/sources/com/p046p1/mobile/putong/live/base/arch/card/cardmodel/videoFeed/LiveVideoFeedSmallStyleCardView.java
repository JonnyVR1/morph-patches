package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareNearByConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveRoom;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p147v.VFrame;
import p147v.VText;
import p149l.awu;
import p149l.d5c0;
import p149l.djj;
import p149l.g3c0;
import p149l.i0g0;
import p149l.t100;
import p149l.uvr;
import p149l.vwb;
import p149l.w8u;
import p149l.wk4;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVideoFeedSmallStyleCardView extends LinearLayout {
    public static final int DISTANCE_DIFFERENT_CITY = 100000;
    public LiveSquareMediaView _media_view;
    public VText _tv_distance;
    public VText _tv_live_name;
    public VText _tv_member_count;
    public VFrame _view_group_live_end;
    public LiveNewOptLabelView _view_group_opt_label;
    protected int recommendedSideLength;

    public LiveVideoFeedSmallStyleCardView(@NonNull Context context) {
        super(context);
        this.recommendedSideLength = 0;
    }

    /* JADX INFO: renamed from: c */
    public static String m67542c(double d) {
        BLiveConfig currentLiveConfigs = getCurrentLiveConfigs();
        if (currentLiveConfigs == null) {
            return "";
        }
        BLiveSquareNearByConfig bLiveSquareNearByConfig = currentLiveConfigs.square.nearby;
        return bLiveSquareNearByConfig.showMemberCount ? String.format(bLiveSquareNearByConfig.showMemberText, i0g0.m133882v(d)) : "";
    }

    @Nullable
    public static BLiveConfig getCurrentLiveConfigs() {
        BLiveSettings bLiveSettingsM195583A3 = uvr.m196090g().m195583A3();
        if (bLiveSettingsM195583A3 == null) {
            return null;
        }
        return bLiveSettingsM195583A3.liveConfig;
    }

    /* JADX INFO: renamed from: a */
    public void m67543a(int i) {
        int iM203652e = wk4.m203652e(i);
        this.recommendedSideLength = iM203652e;
        xdl0.m208325C0(this._media_view, iM203652e);
        djj hierarchy = this._media_view.getSimpleDraweeView().getHierarchy();
        if (hierarchy != null) {
            hierarchy.m112049D(g3c0.f100447v);
        }
        this._media_view.setRadius(t100.f167260i);
    }

    /* JADX INFO: renamed from: b */
    public void m67544b(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            xdl0.m208345M0(this._tv_member_count, false);
            return;
        }
        String strM67542c = m67542c(d);
        xdl0.m208345M0(this._tv_member_count, !TextUtils.isEmpty(strM67542c));
        this._tv_member_count.setText(strM67542c);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m67545d(@NonNull Location location) {
        return location.distance >= 100000;
    }

    /* JADX INFO: renamed from: e */
    public void m67546e(String str) {
        this._media_view.m68772n(str);
    }

    /* JADX INFO: renamed from: f */
    public void m67547f(awu awuVar) {
        BLiveSuggestLive bLiveSuggestLive = awuVar.live;
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom = bLiveSuggestLive.room;
        if (bLiveSuggestLiveRoom != null) {
            wk4.m203654g(this._media_view, bLiveSuggestLiveRoom.coverUrl, this.recommendedSideLength);
        }
        m67544b(bLiveSuggestLive.memberCount);
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = bLiveSuggestLive.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            setDistance(bLiveSuggestLiveAnchor.location);
            setLiveName(bLiveSuggestLive.anchor.name);
        }
        m67548g(!bLiveSuggestLive.isOnLive());
        xdl0.m208344M(this._view_group_opt_label, !vwb.m200296J(bLiveSuggestLive.coverLabelsV2));
        if (vwb.m200296J(bLiveSuggestLive.coverLabelsV2)) {
            return;
        }
        this._view_group_opt_label.m68757O(bLiveSuggestLive.coverLabelsV2);
    }

    /* JADX INFO: renamed from: g */
    public void m67548g(boolean z) {
        xdl0.m208344M(this._view_group_live_end, z);
    }

    /* JADX INFO: renamed from: h */
    public void m67549h() {
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
        this._view_group_live_end = (VFrame) findViewById(d5c0.f84496m1);
        this._view_group_opt_label = (LiveNewOptLabelView) findViewById(d5c0.f84499n1);
        this._tv_live_name = (VText) findViewById(d5c0.f84475f1);
        this._tv_distance = (VText) findViewById(d5c0.f84466c1);
        this._tv_member_count = (VText) findViewById(d5c0.f84478g1);
    }

    public void setDistance(@NonNull Location location) {
        String strM202221x = w8u.m202221x(location);
        if (TextUtils.isEmpty(strM202221x)) {
            this._tv_distance.setText("");
            return;
        }
        if (!xdl0.m208349O0(this._tv_member_count) || !m67545d(location)) {
            this._tv_distance.setText(strM202221x);
            return;
        }
        if (strM202221x.length() > 4) {
            strM202221x = strM202221x.substring(0, 4).concat("...");
        }
        this._tv_distance.setText(strM202221x);
    }

    public void setLiveName(String str) {
        this._tv_live_name.setText(str);
    }

    public LiveVideoFeedSmallStyleCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.recommendedSideLength = 0;
    }

    public LiveVideoFeedSmallStyleCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.recommendedSideLength = 0;
    }
}
