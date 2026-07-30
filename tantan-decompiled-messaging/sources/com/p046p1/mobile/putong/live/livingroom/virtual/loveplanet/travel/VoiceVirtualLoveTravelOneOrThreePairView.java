package com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import p149l.o6p0;
import p149l.vwb;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualLoveTravelOneOrThreePairView extends VoiceVirtualLoveTravelBaseView {

    /* JADX INFO: renamed from: d */
    public VoiceVirtualLoveTravelOneOrThreePairView f52555d;

    /* JADX INFO: renamed from: e */
    public VoiceVirtualLoveTeamInfoView f52556e;

    /* JADX INFO: renamed from: f */
    public VoiceVirtualLoveTeamInfoView f52557f;

    /* JADX INFO: renamed from: g */
    public VoiceVirtualLoveTeamInfoView f52558g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f52559h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f52560i;

    public VoiceVirtualLoveTravelOneOrThreePairView(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.c0m
    /* JADX INFO: renamed from: S */
    public VoiceVirtualLoveItemInfoView mo77182S(String str) {
        Iterator<VoiceVirtualLoveTeamInfoView> it = getTeamViewList().iterator();
        while (it.hasNext()) {
            VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoViewM77173d = it.next().m77173d(str);
            if (voiceVirtualLoveItemInfoViewM77173d != null) {
                return voiceVirtualLoveItemInfoViewM77173d;
            }
        }
        for (int i = 0; i < this.f52560i.getChildCount(); i++) {
            VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = (VoiceVirtualLoveItemInfoView) this.f52560i.getChildAt(i);
            if (voiceVirtualLoveItemInfoView.m77161k0(str)) {
                return voiceVirtualLoveItemInfoView;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m77183b(View view) {
        o6p0.m162939a(this, view);
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
        for (int i2 = 0; i2 < this.f52560i.getChildCount(); i2++) {
            VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = (VoiceVirtualLoveItemInfoView) this.f52560i.getChildAt(i2);
            if (voiceVirtualLoveItemInfoView.getBindInfo() != null && TextUtils.equals(voiceVirtualLoveItemInfoView.getBindInfo().userId, str)) {
                return voiceVirtualLoveItemInfoView;
            }
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView
    public LinearLayout getLineView() {
        return this.f52559h;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView
    public LinearLayout getSingleView() {
        return this.f52560i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView
    public List<VoiceVirtualLoveTeamInfoView> getTeamViewList() {
        return vwb.m200324f0(this.f52556e, this.f52557f, this.f52558g);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView, p149l.c0m
    public int getViewId() {
        return this.f52555d.getId();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77183b(this);
        m77181r();
    }

    public VoiceVirtualLoveTravelOneOrThreePairView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceVirtualLoveTravelOneOrThreePairView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VoiceVirtualLoveTravelOneOrThreePairView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
