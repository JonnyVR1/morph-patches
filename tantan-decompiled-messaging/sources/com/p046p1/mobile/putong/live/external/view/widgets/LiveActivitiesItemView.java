package com.p046p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.view.LiveMainlandTagView;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.hxs;
import p149l.srr;
import p149l.t100;
import p149l.t7t;
import p149l.x4u;

/* JADX INFO: loaded from: classes13.dex */
public class LiveActivitiesItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VFrame f46310d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f46311e;

    /* JADX INFO: renamed from: f */
    public LiveMainlandTagView f46312f;

    /* JADX INFO: renamed from: g */
    public VImage f46313g;

    /* JADX INFO: renamed from: h */
    public VText f46314h;

    /* JADX INFO: renamed from: i */
    public VText f46315i;

    /* JADX INFO: renamed from: j */
    public VText f46316j;

    /* JADX INFO: renamed from: k */
    public VText f46317k;

    public LiveActivitiesItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public void m70897B(@NonNull BLiveAbsData bLiveAbsData, BLiveActivity bLiveActivity) {
        if (!x4u.m207032r(bLiveAbsData) && !x4u.m207030p(bLiveAbsData)) {
            m70899I(bLiveAbsData, bLiveActivity);
        } else if (bLiveActivity.isMultiCallAudience()) {
            m70902z(bLiveAbsData, bLiveActivity);
        } else {
            m70898H(bLiveAbsData, bLiveActivity);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m70898H(BLiveAbsData bLiveAbsData, BLiveActivity bLiveActivity) {
        this.f46317k.setText("");
        this.f46317k.setVisibility(4);
        this.f46316j.setVisibility(0);
        boolean zM187505e = t7t.m187505e(bLiveAbsData);
        VImage vImage = this.f46313g;
        if (zM187505e) {
            vImage.setVisibility(0);
            this.f46312f.setVisibility(8);
        } else {
            vImage.setVisibility(8);
            this.f46312f.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m70899I(@NonNull BLiveAbsData bLiveAbsData, BLiveActivity bLiveActivity) {
        this.f46317k.setVisibility(0);
        this.f46316j.setVisibility(4);
        this.f46313g.setVisibility(8);
        this.f46312f.setVisibility(8);
        if (bLiveActivity.isMultiCallAudience()) {
            double d = bLiveActivity.multiCallInfo.quitTime;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f46317k.setText(x4u.m207020f((long) d));
                return;
            }
        }
        this.f46317k.setText(x4u.m207020f((long) bLiveAbsData.endTime));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70900p(this);
        this.f46312f.m68748c(-1, -1);
    }

    /* JADX INFO: renamed from: p */
    public final void m70900p(View view) {
        srr.m185704a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m70901q(String str) {
        hxs.m133408u("context_live_activities", this.f46311e, str, t100.m186890d(60.0f), t100.m186890d(60.0f));
    }

    public void setDescText(CharSequence charSequence) {
        this.f46315i.setText(charSequence);
        this.f46315i.setTextColor(1711276032);
    }

    public void setTitleText(CharSequence charSequence) {
        this.f46314h.setText(charSequence);
    }

    /* JADX INFO: renamed from: z */
    public final void m70902z(@NotNull BLiveAbsData bLiveAbsData, BLiveActivity bLiveActivity) {
        if (bLiveActivity.isMultiCallAudienceGoing()) {
            m70898H(bLiveAbsData, bLiveActivity);
        } else {
            m70899I(bLiveAbsData, bLiveActivity);
        }
    }

    public LiveActivitiesItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveActivitiesItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
