package com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetTeamInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.c0m;
import p149l.j4p0;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class VoiceVirtualLoveTravelBaseView extends FrameLayout implements s7m<j4p0>, c0m {

    /* JADX INFO: renamed from: a */
    public j4p0 f52552a;

    /* JADX INFO: renamed from: b */
    public List<VoiceVirtualLoveTeamInfoView> f52553b;

    /* JADX INFO: renamed from: c */
    public List<VoiceVirtualLoveItemInfoView> f52554c;

    public VoiceVirtualLoveTravelBaseView(@NonNull Context context) {
        super(context);
        this.f52553b = new ArrayList();
        this.f52554c = new ArrayList();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(j4p0 j4p0Var) {
        this.f52552a = j4p0Var;
    }

    @Override // p149l.c0m
    /* JADX INFO: renamed from: Z */
    public void mo77179Z(BLiveVoiceCall bLiveVoiceCall, boolean z) {
        for (VoiceVirtualLoveTeamInfoView voiceVirtualLoveTeamInfoView : this.f52553b) {
            if (NullChecker.m81303a(voiceVirtualLoveTeamInfoView)) {
                voiceVirtualLoveTeamInfoView.m77175f(bLiveVoiceCall, z);
            }
        }
        for (VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView : this.f52554c) {
            if (NullChecker.m81303a(voiceVirtualLoveItemInfoView)) {
                if (TextUtils.equals(voiceVirtualLoveItemInfoView.f52536l.getText(), bLiveVoiceCall.position + "")) {
                    voiceVirtualLoveItemInfoView.m77169u0(bLiveVoiceCall, z);
                }
            }
        }
    }

    @Override // p149l.c0m
    /* JADX INFO: renamed from: c0 */
    public void mo77180c0(BLiveLovePlanet bLiveLovePlanet) {
        List<BLiveLovePlanetTeamInfo> list;
        if (NullChecker.m81303a(bLiveLovePlanet) && NullChecker.m81303a(bLiveLovePlanet.teamInfos)) {
            int i = 0;
            while (true) {
                int size = bLiveLovePlanet.teamInfos.size();
                list = bLiveLovePlanet.teamInfos;
                if (i >= size) {
                    break;
                }
                BLiveLovePlanetTeamInfo bLiveLovePlanetTeamInfo = list.get(i);
                VoiceVirtualLoveTeamInfoView voiceVirtualLoveTeamInfoView = this.f52553b.get(i);
                voiceVirtualLoveTeamInfoView.m77174e(this.f52552a, bLiveLovePlanet, bLiveLovePlanetTeamInfo, i == 0);
                xdl0.m208344M(voiceVirtualLoveTeamInfoView, true);
                i++;
            }
            for (int size2 = list.size(); size2 < this.f52553b.size(); size2++) {
                xdl0.m208344M(this.f52553b.get(size2), false);
            }
            getSingleView().removeAllViews();
            this.f52554c.clear();
            if (vwb.m200296J(bLiveLovePlanet.singleUserIds)) {
                xdl0.m208344M(getLineView(), false);
                return;
            }
            xdl0.m208344M(getLineView(), true);
            for (int i2 = 0; i2 < bLiveLovePlanet.singleUserIds.size(); i2++) {
                VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = (VoiceVirtualLoveItemInfoView) LayoutInflater.from(getContext()).inflate(t6c0.f168162Qa, (ViewGroup) null);
                xdl0.m208344M(voiceVirtualLoveItemInfoView.f52530f, true);
                int i3 = xdl0.f192404f;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
                int i4 = t100.f167259h;
                layoutParams.leftMargin = i4;
                layoutParams.rightMargin = i4;
                getSingleView().addView(voiceVirtualLoveItemInfoView, layoutParams);
                this.f52554c.add(voiceVirtualLoveItemInfoView);
                final String str = bLiveLovePlanet.singleUserIds.get(i2);
                voiceVirtualLoveItemInfoView.m77167r0(this.f52552a, (BLiveLovePlanetPlayerInfo) vwb.m200346r(bLiveLovePlanet.playerInfos, new w9j() { // from class: l.n6p0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, str));
                    }
                }));
                xdl0.m208344M(voiceVirtualLoveItemInfoView, true);
            }
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public abstract LinearLayout getLineView();

    public abstract LinearLayout getSingleView();

    public abstract List<VoiceVirtualLoveTeamInfoView> getTeamViewList();

    @Override // p149l.c0m
    public int getViewId() {
        return 0;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m77181r() {
        this.f52553b.clear();
        this.f52553b = getTeamViewList();
        getSingleView().removeAllViews();
        this.f52554c.clear();
    }

    public VoiceVirtualLoveTravelBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52553b = new ArrayList();
        this.f52554c = new ArrayList();
    }

    public VoiceVirtualLoveTravelBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52553b = new ArrayList();
        this.f52554c = new ArrayList();
    }

    public VoiceVirtualLoveTravelBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f52553b = new ArrayList();
        this.f52554c = new ArrayList();
    }
}
