package com.p051p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.view.LiveMainlandTagView;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.izs;
import p153l.qa00;
import p153l.ttr;
import p153l.u9t;
import p153l.y6u;

/* JADX INFO: loaded from: classes9.dex */
public class LiveActivitiesItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VFrame f47158d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f47159e;

    /* JADX INFO: renamed from: f */
    public LiveMainlandTagView f47160f;

    /* JADX INFO: renamed from: g */
    public VImage f47161g;

    /* JADX INFO: renamed from: h */
    public VText f47162h;

    /* JADX INFO: renamed from: i */
    public VText f47163i;

    /* JADX INFO: renamed from: j */
    public VText f47164j;

    /* JADX INFO: renamed from: k */
    public VText f47165k;

    public LiveActivitiesItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public void m72080B(@NonNull BLiveAbsData bLiveAbsData, BLiveActivity bLiveActivity) {
        if (!y6u.m214514r(bLiveAbsData) && !y6u.m214512p(bLiveAbsData)) {
            m72082I(bLiveAbsData, bLiveActivity);
        } else if (bLiveActivity.isMultiCallAudience()) {
            m72085z(bLiveAbsData, bLiveActivity);
        } else {
            m72081H(bLiveAbsData, bLiveActivity);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m72081H(BLiveAbsData bLiveAbsData, BLiveActivity bLiveActivity) {
        this.f47165k.setText("");
        this.f47165k.setVisibility(4);
        this.f47164j.setVisibility(0);
        boolean zM195116e = u9t.m195116e(bLiveAbsData);
        VImage vImage = this.f47161g;
        if (zM195116e) {
            vImage.setVisibility(0);
            this.f47160f.setVisibility(8);
        } else {
            vImage.setVisibility(8);
            this.f47160f.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m72082I(@NonNull BLiveAbsData bLiveAbsData, BLiveActivity bLiveActivity) {
        this.f47165k.setVisibility(0);
        this.f47164j.setVisibility(4);
        this.f47161g.setVisibility(8);
        this.f47160f.setVisibility(8);
        if (bLiveActivity.isMultiCallAudience()) {
            double d = bLiveActivity.multiCallInfo.quitTime;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f47165k.setText(y6u.m214502f((long) d));
                return;
            }
        }
        this.f47165k.setText(y6u.m214502f((long) bLiveAbsData.endTime));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72083p(this);
        this.f47160f.m69931c(-1, -1);
    }

    /* JADX INFO: renamed from: p */
    public final void m72083p(View view) {
        ttr.m192676a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m72084q(String str) {
        izs.m142870u("context_live_activities", this.f47159e, str, qa00.m175859d(60.0f), qa00.m175859d(60.0f));
    }

    public void setDescText(CharSequence charSequence) {
        this.f47163i.setText(charSequence);
        this.f47163i.setTextColor(1711276032);
    }

    public void setTitleText(CharSequence charSequence) {
        this.f47162h.setText(charSequence);
    }

    /* JADX INFO: renamed from: z */
    public final void m72085z(@NotNull BLiveAbsData bLiveAbsData, BLiveActivity bLiveActivity) {
        if (bLiveActivity.isMultiCallAudienceGoing()) {
            m72081H(bLiveAbsData, bLiveActivity);
        } else {
            m72082I(bLiveAbsData, bLiveActivity);
        }
    }

    public LiveActivitiesItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveActivitiesItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
