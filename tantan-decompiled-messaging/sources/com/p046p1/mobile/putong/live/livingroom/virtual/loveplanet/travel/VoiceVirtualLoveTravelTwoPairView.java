package com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p149l.p6p0;
import p149l.vwb;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualLoveTravelTwoPairView extends VoiceVirtualLoveTravelBaseView {

    /* JADX INFO: renamed from: d */
    public VoiceVirtualLoveTravelTwoPairView f52561d;

    /* JADX INFO: renamed from: e */
    public VoiceVirtualLoveTeamInfoView f52562e;

    /* JADX INFO: renamed from: f */
    public VoiceVirtualLoveTeamInfoView f52563f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f52564g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f52565h;

    public VoiceVirtualLoveTravelTwoPairView(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.c0m
    /* JADX INFO: renamed from: S */
    public VoiceVirtualLoveItemInfoView mo77182S(String str) {
        VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoViewM77173d = this.f52562e.m77173d(str);
        if (voiceVirtualLoveItemInfoViewM77173d != null) {
            return voiceVirtualLoveItemInfoViewM77173d;
        }
        VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoViewM77173d2 = this.f52563f.m77173d(str);
        if (voiceVirtualLoveItemInfoViewM77173d2 != null) {
            return voiceVirtualLoveItemInfoViewM77173d2;
        }
        for (int i = 0; i < this.f52565h.getChildCount(); i++) {
            VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = (VoiceVirtualLoveItemInfoView) this.f52565h.getChildAt(i);
            if (voiceVirtualLoveItemInfoView.m77161k0(str)) {
                return voiceVirtualLoveItemInfoView;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m77185b(View view) {
        p6p0.m167687a(this, view);
    }

    @Override // p149l.c0m
    /* JADX INFO: renamed from: f0 */
    public VoiceVirtualLoveItemInfoView mo77184f0(String str) {
        List<VoiceVirtualLoveTeamInfoView> teamViewList = getTeamViewList();
        for (int i = 0; i < teamViewList.size(); i++) {
            if (teamViewList.get(i).f52550d.getBindInfo() != null && TextUtils.equals(teamViewList.get(i).f52550d.getBindInfo().userId, str)) {
                return teamViewList.get(i).f52550d;
            }
            if (teamViewList.get(i).f52551e.getBindInfo() != null && TextUtils.equals(teamViewList.get(i).f52551e.getBindInfo().userId, str)) {
                return teamViewList.get(i).f52551e;
            }
        }
        for (int i2 = 0; i2 < this.f52565h.getChildCount(); i2++) {
            VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = (VoiceVirtualLoveItemInfoView) this.f52565h.getChildAt(i2);
            if (voiceVirtualLoveItemInfoView.getBindInfo() != null && TextUtils.equals(voiceVirtualLoveItemInfoView.getBindInfo().userId, str)) {
                return voiceVirtualLoveItemInfoView;
            }
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView
    public LinearLayout getLineView() {
        return this.f52564g;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView
    public LinearLayout getSingleView() {
        return this.f52565h;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView
    public List<VoiceVirtualLoveTeamInfoView> getTeamViewList() {
        return vwb.m200324f0(this.f52562e, this.f52563f);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView, p149l.c0m
    public int getViewId() {
        return this.f52561d.getId();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77185b(this);
        m77181r();
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
