package com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel;

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
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanetTeamInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.iam;
import p153l.jyb;
import p153l.ndp0;
import p153l.qa00;
import p153l.qcj;
import p153l.w2m;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class VoiceVirtualLoveTravelBaseView extends FrameLayout implements iam<ndp0>, w2m {

    /* JADX INFO: renamed from: a */
    public ndp0 f53400a;

    /* JADX INFO: renamed from: b */
    public List<VoiceVirtualLoveTeamInfoView> f53401b;

    /* JADX INFO: renamed from: c */
    public List<VoiceVirtualLoveItemInfoView> f53402c;

    public VoiceVirtualLoveTravelBaseView(@NonNull Context context) {
        super(context);
        this.f53401b = new ArrayList();
        this.f53402c = new ArrayList();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ndp0 ndp0Var) {
        this.f53400a = ndp0Var;
    }

    @Override // p153l.w2m
    /* JADX INFO: renamed from: Z */
    public void mo78362Z(BLiveVoiceCall bLiveVoiceCall, boolean z) {
        for (VoiceVirtualLoveTeamInfoView voiceVirtualLoveTeamInfoView : this.f53401b) {
            if (NullChecker.m82486a(voiceVirtualLoveTeamInfoView)) {
                voiceVirtualLoveTeamInfoView.m78358f(bLiveVoiceCall, z);
            }
        }
        for (VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView : this.f53402c) {
            if (NullChecker.m82486a(voiceVirtualLoveItemInfoView)) {
                if (TextUtils.equals(voiceVirtualLoveItemInfoView.f53384l.getText(), bLiveVoiceCall.position + "")) {
                    voiceVirtualLoveItemInfoView.m78352u0(bLiveVoiceCall, z);
                }
            }
        }
    }

    @Override // p153l.w2m
    /* JADX INFO: renamed from: c0 */
    public void mo78363c0(BLiveLovePlanet bLiveLovePlanet) {
        List<BLiveLovePlanetTeamInfo> list;
        if (NullChecker.m82486a(bLiveLovePlanet) && NullChecker.m82486a(bLiveLovePlanet.teamInfos)) {
            int i = 0;
            while (true) {
                int size = bLiveLovePlanet.teamInfos.size();
                list = bLiveLovePlanet.teamInfos;
                if (i >= size) {
                    break;
                }
                BLiveLovePlanetTeamInfo bLiveLovePlanetTeamInfo = list.get(i);
                VoiceVirtualLoveTeamInfoView voiceVirtualLoveTeamInfoView = this.f53401b.get(i);
                voiceVirtualLoveTeamInfoView.m78357e(this.f53400a, bLiveLovePlanet, bLiveLovePlanetTeamInfo, i == 0);
                bnl0.m105524M(voiceVirtualLoveTeamInfoView, true);
                i++;
            }
            for (int size2 = list.size(); size2 < this.f53401b.size(); size2++) {
                bnl0.m105524M(this.f53401b.get(size2), false);
            }
            getSingleView().removeAllViews();
            this.f53402c.clear();
            if (jyb.m147479J(bLiveLovePlanet.singleUserIds)) {
                bnl0.m105524M(getLineView(), false);
                return;
            }
            bnl0.m105524M(getLineView(), true);
            for (int i2 = 0; i2 < bLiveLovePlanet.singleUserIds.size(); i2++) {
                VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = (VoiceVirtualLoveItemInfoView) LayoutInflater.from(getContext()).inflate(yec0.f198894Qa, (ViewGroup) null);
                bnl0.m105524M(voiceVirtualLoveItemInfoView.f53378f, true);
                int i3 = bnl0.f77545f;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
                int i4 = qa00.f156321h;
                layoutParams.leftMargin = i4;
                layoutParams.rightMargin = i4;
                getSingleView().addView(voiceVirtualLoveItemInfoView, layoutParams);
                this.f53402c.add(voiceVirtualLoveItemInfoView);
                final String str = bLiveLovePlanet.singleUserIds.get(i2);
                voiceVirtualLoveItemInfoView.m78350r0(this.f53400a, (BLiveLovePlanetPlayerInfo) jyb.m147529r(bLiveLovePlanet.playerInfos, new qcj() { // from class: l.rfp0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, str));
                    }
                }));
                bnl0.m105524M(voiceVirtualLoveItemInfoView, true);
            }
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public abstract LinearLayout getLineView();

    public abstract LinearLayout getSingleView();

    public abstract List<VoiceVirtualLoveTeamInfoView> getTeamViewList();

    @Override // p153l.w2m
    public int getViewId() {
        return 0;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m78364r() {
        this.f53401b.clear();
        this.f53401b = getTeamViewList();
        getSingleView().removeAllViews();
        this.f53402c.clear();
    }

    public VoiceVirtualLoveTravelBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53401b = new ArrayList();
        this.f53402c = new ArrayList();
    }

    public VoiceVirtualLoveTravelBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53401b = new ArrayList();
        this.f53402c = new ArrayList();
    }

    public VoiceVirtualLoveTravelBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f53401b = new ArrayList();
        this.f53402c = new ArrayList();
    }
}
