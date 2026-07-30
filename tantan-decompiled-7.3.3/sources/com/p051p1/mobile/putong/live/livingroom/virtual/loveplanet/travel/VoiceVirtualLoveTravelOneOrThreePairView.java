package com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import p153l.jyb;
import p153l.sfp0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualLoveTravelOneOrThreePairView extends VoiceVirtualLoveTravelBaseView {

    /* JADX INFO: renamed from: d */
    public VoiceVirtualLoveTravelOneOrThreePairView f53403d;

    /* JADX INFO: renamed from: e */
    public VoiceVirtualLoveTeamInfoView f53404e;

    /* JADX INFO: renamed from: f */
    public VoiceVirtualLoveTeamInfoView f53405f;

    /* JADX INFO: renamed from: g */
    public VoiceVirtualLoveTeamInfoView f53406g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f53407h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f53408i;

    public VoiceVirtualLoveTravelOneOrThreePairView(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.w2m
    /* JADX INFO: renamed from: S */
    public VoiceVirtualLoveItemInfoView mo78365S(String str) {
        Iterator<VoiceVirtualLoveTeamInfoView> it = getTeamViewList().iterator();
        while (it.hasNext()) {
            VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoViewM78356d = it.next().m78356d(str);
            if (voiceVirtualLoveItemInfoViewM78356d != null) {
                return voiceVirtualLoveItemInfoViewM78356d;
            }
        }
        for (int i = 0; i < this.f53408i.getChildCount(); i++) {
            VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = (VoiceVirtualLoveItemInfoView) this.f53408i.getChildAt(i);
            if (voiceVirtualLoveItemInfoView.m78344k0(str)) {
                return voiceVirtualLoveItemInfoView;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m78366b(View view) {
        sfp0.m185660a(this, view);
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
        for (int i2 = 0; i2 < this.f53408i.getChildCount(); i2++) {
            VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = (VoiceVirtualLoveItemInfoView) this.f53408i.getChildAt(i2);
            if (voiceVirtualLoveItemInfoView.getBindInfo() != null && TextUtils.equals(voiceVirtualLoveItemInfoView.getBindInfo().userId, str)) {
                return voiceVirtualLoveItemInfoView;
            }
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView
    public LinearLayout getLineView() {
        return this.f53407h;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView
    public LinearLayout getSingleView() {
        return this.f53408i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView
    public List<VoiceVirtualLoveTeamInfoView> getTeamViewList() {
        return jyb.m147507f0(this.f53404e, this.f53405f, this.f53406g);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelBaseView, p153l.w2m
    public int getViewId() {
        return this.f53403d.getId();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78366b(this);
        m78364r();
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
