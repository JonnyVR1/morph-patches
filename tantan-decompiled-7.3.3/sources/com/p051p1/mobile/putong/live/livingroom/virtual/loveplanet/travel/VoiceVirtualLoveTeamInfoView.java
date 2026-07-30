package com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanetTeamInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.bnl0;
import p153l.jyb;
import p153l.ndp0;
import p153l.qcj;
import p153l.qfp0;
import p153l.yau;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualLoveTeamInfoView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f53395a;

    /* JADX INFO: renamed from: b */
    public TextView f53396b;

    /* JADX INFO: renamed from: c */
    public TextView f53397c;

    /* JADX INFO: renamed from: d */
    public VoiceVirtualLoveItemInfoView f53398d;

    /* JADX INFO: renamed from: e */
    public VoiceVirtualLoveItemInfoView f53399e;

    public VoiceVirtualLoveTeamInfoView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m78354b(View view) {
        qfp0.m176391a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public BLiveLovePlanetPlayerInfo m78355c(List<BLiveLovePlanetPlayerInfo> list, final String str) {
        return (BLiveLovePlanetPlayerInfo) jyb.m147529r(list, new qcj() { // from class: l.pfp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, str));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public VoiceVirtualLoveItemInfoView m78356d(String str) {
        if (this.f53398d.m78344k0(str)) {
            return this.f53398d;
        }
        if (this.f53399e.m78344k0(str)) {
            return this.f53399e;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m78357e(ndp0 ndp0Var, BLiveLovePlanet bLiveLovePlanet, BLiveLovePlanetTeamInfo bLiveLovePlanetTeamInfo, boolean z) {
        this.f53395a.m69682i("https://fe-static.tancdn.com/v1/raw/ec27adec-4423-4d55-ab4f-29967dcbbba512.svga", -1, null, true);
        this.f53396b.setText(bLiveLovePlanetTeamInfo.tip);
        bnl0.m105525M0(this.f53396b, z && !TextUtils.isEmpty(bLiveLovePlanetTeamInfo.tip));
        this.f53397c.setText(String.format("星动值: %s", yau.m214935c(bLiveLovePlanetTeamInfo.totalScore)));
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfoM78355c = m78355c(bLiveLovePlanet.playerInfos, bLiveLovePlanetTeamInfo.userId);
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfoM78355c2 = m78355c(bLiveLovePlanet.playerInfos, bLiveLovePlanetTeamInfo.otherUserId);
        if (TextUtils.equals(bLiveLovePlanetPlayerInfoM78355c.gender, "female") && TextUtils.equals(bLiveLovePlanetPlayerInfoM78355c2.gender, "male")) {
            this.f53398d.m78350r0(ndp0Var, bLiveLovePlanetPlayerInfoM78355c);
            this.f53399e.m78350r0(ndp0Var, bLiveLovePlanetPlayerInfoM78355c2);
            return;
        }
        if (TextUtils.equals(bLiveLovePlanetPlayerInfoM78355c2.gender, "female") && TextUtils.equals(bLiveLovePlanetPlayerInfoM78355c.gender, "male")) {
            this.f53398d.m78350r0(ndp0Var, bLiveLovePlanetPlayerInfoM78355c2);
            this.f53399e.m78350r0(ndp0Var, bLiveLovePlanetPlayerInfoM78355c);
            return;
        }
        int i = bLiveLovePlanetPlayerInfoM78355c.position;
        int i2 = bLiveLovePlanetPlayerInfoM78355c2.position;
        VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = this.f53398d;
        if (i < i2) {
            voiceVirtualLoveItemInfoView.m78350r0(ndp0Var, bLiveLovePlanetPlayerInfoM78355c);
            this.f53399e.m78350r0(ndp0Var, bLiveLovePlanetPlayerInfoM78355c2);
        } else {
            voiceVirtualLoveItemInfoView.m78350r0(ndp0Var, bLiveLovePlanetPlayerInfoM78355c2);
            this.f53399e.m78350r0(ndp0Var, bLiveLovePlanetPlayerInfoM78355c);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m78358f(BLiveVoiceCall bLiveVoiceCall, boolean z) {
        CharSequence text = this.f53398d.f53384l.getText();
        CharSequence text2 = this.f53399e.f53384l.getText();
        if (TextUtils.equals(text, bLiveVoiceCall.position + "")) {
            this.f53398d.m78352u0(bLiveVoiceCall, z);
            return;
        }
        if (TextUtils.equals(text2, bLiveVoiceCall.position + "")) {
            this.f53399e.m78352u0(bLiveVoiceCall, z);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m78359g() {
        if (NullChecker.m82486a(this.f53395a)) {
            this.f53395a.stopAnimation(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m78359g();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78354b(this);
    }

    public VoiceVirtualLoveTeamInfoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceVirtualLoveTeamInfoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VoiceVirtualLoveTeamInfoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
