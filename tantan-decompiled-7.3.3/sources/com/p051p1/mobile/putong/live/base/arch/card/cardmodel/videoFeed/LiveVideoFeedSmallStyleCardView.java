package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareNearByConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveRoom;
import com.p051p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.byu;
import p153l.jdc0;
import p153l.jyb;
import p153l.mbc0;
import p153l.q8g0;
import p153l.qa00;
import p153l.vl4;
import p153l.vxr;
import p153l.wlj;
import p153l.xau;

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
    public static String m68725c(double d) {
        BLiveConfig currentLiveConfigs = getCurrentLiveConfigs();
        if (currentLiveConfigs == null) {
            return "";
        }
        BLiveSquareNearByConfig bLiveSquareNearByConfig = currentLiveConfigs.square.nearby;
        return bLiveSquareNearByConfig.showMemberCount ? String.format(bLiveSquareNearByConfig.showMemberText, q8g0.m175817v(d)) : "";
    }

    @Nullable
    public static BLiveConfig getCurrentLiveConfigs() {
        BLiveSettings bLiveSettingsM203370A3 = vxr.m203879g().m203370A3();
        if (bLiveSettingsM203370A3 == null) {
            return null;
        }
        return bLiveSettingsM203370A3.liveConfig;
    }

    /* JADX INFO: renamed from: a */
    public void m68726a(int i) {
        int iM201593e = vl4.m201593e(i);
        this.recommendedSideLength = iM201593e;
        bnl0.m105505C0(this._media_view, iM201593e);
        wlj hierarchy = this._media_view.getSimpleDraweeView().getHierarchy();
        if (hierarchy != null) {
            hierarchy.m207041D(mbc0.f135709v);
        }
        this._media_view.setRadius(qa00.f156322i);
    }

    /* JADX INFO: renamed from: b */
    public void m68727b(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            bnl0.m105525M0(this._tv_member_count, false);
            return;
        }
        String strM68725c = m68725c(d);
        bnl0.m105525M0(this._tv_member_count, !TextUtils.isEmpty(strM68725c));
        this._tv_member_count.setText(strM68725c);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m68728d(@NonNull Location location) {
        return location.distance >= 100000;
    }

    /* JADX INFO: renamed from: e */
    public void m68729e(String str) {
        this._media_view.m69955n(str);
    }

    /* JADX INFO: renamed from: f */
    public void m68730f(byu byuVar) {
        BLiveSuggestLive bLiveSuggestLive = byuVar.live;
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom = bLiveSuggestLive.room;
        if (bLiveSuggestLiveRoom != null) {
            vl4.m201595g(this._media_view, bLiveSuggestLiveRoom.coverUrl, this.recommendedSideLength);
        }
        m68727b(bLiveSuggestLive.memberCount);
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = bLiveSuggestLive.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            setDistance(bLiveSuggestLiveAnchor.location);
            setLiveName(bLiveSuggestLive.anchor.name);
        }
        m68731g(!bLiveSuggestLive.isOnLive());
        bnl0.m105524M(this._view_group_opt_label, !jyb.m147479J(bLiveSuggestLive.coverLabelsV2));
        if (jyb.m147479J(bLiveSuggestLive.coverLabelsV2)) {
            return;
        }
        this._view_group_opt_label.m69940O(bLiveSuggestLive.coverLabelsV2);
    }

    /* JADX INFO: renamed from: g */
    public void m68731g(boolean z) {
        bnl0.m105524M(this._view_group_live_end, z);
    }

    /* JADX INFO: renamed from: h */
    public void m68732h() {
        LiveSquareMediaView liveSquareMediaView = this._media_view;
        if (liveSquareMediaView == null) {
            return;
        }
        liveSquareMediaView.m69958q();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._media_view = (LiveSquareMediaView) findViewById(jdc0.f120207k0);
        this._view_group_live_end = (VFrame) findViewById(jdc0.f120214m1);
        this._view_group_opt_label = (LiveNewOptLabelView) findViewById(jdc0.f120217n1);
        this._tv_live_name = (VText) findViewById(jdc0.f120193f1);
        this._tv_distance = (VText) findViewById(jdc0.f120184c1);
        this._tv_member_count = (VText) findViewById(jdc0.f120196g1);
    }

    public void setDistance(@NonNull Location location) {
        String strM209914x = xau.m209914x(location);
        if (TextUtils.isEmpty(strM209914x)) {
            this._tv_distance.setText("");
            return;
        }
        if (!bnl0.m105529O0(this._tv_member_count) || !m68728d(location)) {
            this._tv_distance.setText(strM209914x);
            return;
        }
        if (strM209914x.length() > 4) {
            strM209914x = strM209914x.substring(0, 4).concat("...");
        }
        this._tv_distance.setText(strM209914x);
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
