package com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetTeamInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.j4p0;
import p149l.m6p0;
import p149l.vwb;
import p149l.w9j;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualLoveTeamInfoView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f52547a;

    /* JADX INFO: renamed from: b */
    public TextView f52548b;

    /* JADX INFO: renamed from: c */
    public TextView f52549c;

    /* JADX INFO: renamed from: d */
    public VoiceVirtualLoveItemInfoView f52550d;

    /* JADX INFO: renamed from: e */
    public VoiceVirtualLoveItemInfoView f52551e;

    public VoiceVirtualLoveTeamInfoView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m77171b(View view) {
        m6p0.m153263a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public BLiveLovePlanetPlayerInfo m77172c(List<BLiveLovePlanetPlayerInfo> list, final String str) {
        return (BLiveLovePlanetPlayerInfo) vwb.m200346r(list, new w9j() { // from class: l.l6p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, str));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public VoiceVirtualLoveItemInfoView m77173d(String str) {
        if (this.f52550d.m77161k0(str)) {
            return this.f52550d;
        }
        if (this.f52551e.m77161k0(str)) {
            return this.f52551e;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m77174e(j4p0 j4p0Var, BLiveLovePlanet bLiveLovePlanet, BLiveLovePlanetTeamInfo bLiveLovePlanetTeamInfo, boolean z) {
        this.f52547a.m68499i("https://fe-static.tancdn.com/v1/raw/ec27adec-4423-4d55-ab4f-29967dcbbba512.svga", -1, null, true);
        this.f52548b.setText(bLiveLovePlanetTeamInfo.tip);
        xdl0.m208345M0(this.f52548b, z && !TextUtils.isEmpty(bLiveLovePlanetTeamInfo.tip));
        this.f52549c.setText(String.format("星动值: %s", x8u.m207433c(bLiveLovePlanetTeamInfo.totalScore)));
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfoM77172c = m77172c(bLiveLovePlanet.playerInfos, bLiveLovePlanetTeamInfo.userId);
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfoM77172c2 = m77172c(bLiveLovePlanet.playerInfos, bLiveLovePlanetTeamInfo.otherUserId);
        if (TextUtils.equals(bLiveLovePlanetPlayerInfoM77172c.gender, "female") && TextUtils.equals(bLiveLovePlanetPlayerInfoM77172c2.gender, "male")) {
            this.f52550d.m77167r0(j4p0Var, bLiveLovePlanetPlayerInfoM77172c);
            this.f52551e.m77167r0(j4p0Var, bLiveLovePlanetPlayerInfoM77172c2);
            return;
        }
        if (TextUtils.equals(bLiveLovePlanetPlayerInfoM77172c2.gender, "female") && TextUtils.equals(bLiveLovePlanetPlayerInfoM77172c.gender, "male")) {
            this.f52550d.m77167r0(j4p0Var, bLiveLovePlanetPlayerInfoM77172c2);
            this.f52551e.m77167r0(j4p0Var, bLiveLovePlanetPlayerInfoM77172c);
            return;
        }
        int i = bLiveLovePlanetPlayerInfoM77172c.position;
        int i2 = bLiveLovePlanetPlayerInfoM77172c2.position;
        VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = this.f52550d;
        if (i < i2) {
            voiceVirtualLoveItemInfoView.m77167r0(j4p0Var, bLiveLovePlanetPlayerInfoM77172c);
            this.f52551e.m77167r0(j4p0Var, bLiveLovePlanetPlayerInfoM77172c2);
        } else {
            voiceVirtualLoveItemInfoView.m77167r0(j4p0Var, bLiveLovePlanetPlayerInfoM77172c2);
            this.f52551e.m77167r0(j4p0Var, bLiveLovePlanetPlayerInfoM77172c);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m77175f(BLiveVoiceCall bLiveVoiceCall, boolean z) {
        CharSequence text = this.f52550d.f52536l.getText();
        CharSequence text2 = this.f52551e.f52536l.getText();
        if (TextUtils.equals(text, bLiveVoiceCall.position + "")) {
            this.f52550d.m77169u0(bLiveVoiceCall, z);
            return;
        }
        if (TextUtils.equals(text2, bLiveVoiceCall.position + "")) {
            this.f52551e.m77169u0(bLiveVoiceCall, z);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m77176g() {
        if (NullChecker.m81303a(this.f52547a)) {
            this.f52547a.stopAnimation(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77176g();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77171b(this);
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
