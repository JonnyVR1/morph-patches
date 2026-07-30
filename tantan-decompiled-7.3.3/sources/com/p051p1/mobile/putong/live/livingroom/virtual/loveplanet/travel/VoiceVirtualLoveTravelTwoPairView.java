package com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p153l.jyb;
import p153l.tfp0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualLoveTravelTwoPairView extends VoiceVirtualLoveTravelBaseView {

    /* JADX INFO: renamed from: d */
    public VoiceVirtualLoveTravelTwoPairView f53409d;

    /* JADX INFO: renamed from: e */
    public VoiceVirtualLoveTeamInfoView f53410e;

    /* JADX INFO: renamed from: f */
    public VoiceVirtualLoveTeamInfoView f53411f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f53412g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f53413h;

    public VoiceVirtualLoveTravelTwoPairView(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.w2m
    /* JADX INFO: renamed from: S */
    public VoiceVirtualLoveItemInfoView mo78365S(String str) {
        VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoViewM78356d = this.f53410e.m78356d(str);
        if (voiceVirtualLoveItemInfoViewM78356d != null) {
            return voiceVirtualLoveItemInfoViewM78356d;
        }
        VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoViewM78356d2 = this.f53411f.m78356d(str);
        if (voiceVirtualLoveItemInfoViewM78356d2 != null) {
            return voiceVirtualLoveItemInfoViewM78356d2;
        }
        for (int i = 0; i < this.f53413h.getChildCount(); i++) {
            VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = (VoiceVirtualLoveItemInfoView) this.f53413h.getChildAt(i);
            if (voiceVirtualLoveItemInfoView.m78344k0(str)) {
                return voiceVirtualLoveItemInfoView;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m78368b(View view) {
        tfp0.m190957a(this, view);
    }

    @Override // p153l.w2m
    /* JADX INFO: renamed from: f0 */
    public VoiceVirtualLoveItemInfoView mo78367f0(String str) {
        List<VoiceVirtualLoveTeamInfoView> teamViewList = getTeamViewList();
        for (int i = 0; i < teamViewList.size(); i++) {
            if (teamViewList.get(i).f53398d.getBindInfo() != null && TextUtils.equals(teamViewList.get(i).f53398d.getBindInfo().userId, str)) {
                return teamViewList.get(i).f53398d;
            }
            if (teamViewList.get(i).f53399e.getBindInfo() != null && TextUtils.equals(teamViewList.get(i).f53399e.getBindInfo().userId, str)) {
                return teamViewList.get(i).f53399e;
            }
        }
        for (int i2 = 0; i2 < this.f53413h.getChildCount(); i2++) {
            VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = (VoiceVirtualLoveItemInfoView) this.f53413h.getChildAt(i2);
            if (voiceVirtualLoveItemInfoView.getBindInfo() != null && TextUtils.equals(voiceVirtualLoveItemInfoView.getBindInfo().userId, str)) {
                return voiceVirtualLoveItemInfoView;
            }
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView
    public LinearLayout getLineView() {
        return this.f53412g;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView
    public LinearLayout getSingleView() {
        return this.f53413h;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView
    public List<VoiceVirtualLoveTeamInfoView> getTeamViewList() {
        return jyb.m147507f0(this.f53410e, this.f53411f);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView, p153l.w2m
    public int getViewId() {
        return this.f53409d.getId();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78368b(this);
        m78364r();
    }

    public VoiceVirtualLoveTravelTwoPairView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceVirtualLoveTravelTwoPairView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VoiceVirtualLoveTravelTwoPairView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
