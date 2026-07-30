package com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveItemInfoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p153l.fhw;
import p153l.hfp0;
import p153l.jyb;
import p153l.ndp0;
import p153l.pf60;
import p153l.qcj;
import p153l.w2m;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualLovePlanetStepIntroAndChoiceWidgetView extends ConstraintLayout implements w2m {

    /* JADX INFO: renamed from: d */
    public VoiceVirtualLovePlanetStepIntroAndChoiceWidgetView f53414d;

    /* JADX INFO: renamed from: e */
    public Guideline f53415e;

    /* JADX INFO: renamed from: f */
    public Guideline f53416f;

    /* JADX INFO: renamed from: g */
    public Guideline f53417g;

    /* JADX INFO: renamed from: h */
    public Guideline f53418h;

    /* JADX INFO: renamed from: i */
    public VoiceVirtualLoveItemInfoView f53419i;

    /* JADX INFO: renamed from: j */
    public VoiceVirtualLoveItemInfoView f53420j;

    /* JADX INFO: renamed from: k */
    public VoiceVirtualLoveItemInfoView f53421k;

    /* JADX INFO: renamed from: l */
    public VoiceVirtualLoveItemInfoView f53422l;

    /* JADX INFO: renamed from: m */
    public VoiceVirtualLoveItemInfoView f53423m;

    /* JADX INFO: renamed from: n */
    public VoiceVirtualLoveItemInfoView f53424n;

    /* JADX INFO: renamed from: o */
    public ndp0 f53425o;

    /* JADX INFO: renamed from: p */
    public final Map<Integer, VoiceVirtualLoveItemInfoView> f53426p;

    /* JADX INFO: renamed from: q */
    public final Map<Integer, pf60<String, String>> f53427q;

    public VoiceVirtualLovePlanetStepIntroAndChoiceWidgetView(Context context) {
        super(context);
        this.f53426p = new HashMap();
        this.f53427q = new HashMap();
    }

    @Override // p153l.w2m
    /* JADX INFO: renamed from: S */
    public VoiceVirtualLoveItemInfoView mo78365S(String str) {
        for (VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView : this.f53426p.values()) {
            if (voiceVirtualLoveItemInfoView.getBindPlayerInfo() != null && TextUtils.equals(str, voiceVirtualLoveItemInfoView.getBindPlayerInfo().userId)) {
                return voiceVirtualLoveItemInfoView;
            }
        }
        return null;
    }

    @Override // p153l.w2m
    /* JADX INFO: renamed from: W */
    public void mo22064i1(ndp0 ndp0Var) {
        this.f53425o = ndp0Var;
    }

    @Override // p153l.w2m
    /* JADX INFO: renamed from: Z */
    public void mo78362Z(BLiveVoiceCall bLiveVoiceCall, boolean z) {
        VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = this.f53426p.get(Integer.valueOf(bLiveVoiceCall.position));
        if (NullChecker.m82486a(voiceVirtualLoveItemInfoView)) {
            voiceVirtualLoveItemInfoView.m78352u0(bLiveVoiceCall, z);
            return;
        }
        fhw.m125605a(VirtualVoiceMotionType.lovePlanet, "renderVolumeWave illegal pos:" + bLiveVoiceCall.position);
    }

    @Override // p153l.w2m
    /* JADX INFO: renamed from: c0 */
    public void mo78363c0(BLiveLovePlanet bLiveLovePlanet) {
        if ("prepare".equals(bLiveLovePlanet.stage.toString()) || "introduction".equals(bLiveLovePlanet.stage.toString())) {
            m78373l0(bLiveLovePlanet.playerInfos);
        } else {
            m78371j0(bLiveLovePlanet.host, bLiveLovePlanet.playerInfos);
        }
    }

    @Override // p153l.w2m
    /* JADX INFO: renamed from: f0 */
    public VoiceVirtualLoveItemInfoView mo78367f0(String str) {
        for (Map.Entry<Integer, VoiceVirtualLoveItemInfoView> entry : this.f53426p.entrySet()) {
            if (entry.getValue().getBindInfo() != null && TextUtils.equals(entry.getValue().getBindInfo().userId, str)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override // p153l.w2m
    public int getViewId() {
        return this.f53414d.getId();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m78370i0(View view) {
        hfp0.m134820a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m78371j0(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo, List<BLiveLovePlanetPlayerInfo> list) {
        HashSet hashSet = new HashSet();
        if (jyb.m147479J(list)) {
            m78372k0(hashSet);
            return;
        }
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo2 = (BLiveLovePlanetPlayerInfo) jyb.m147529r(list, new qcj() { // from class: l.gfp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, zrv.f205799a.m207631D0()));
            }
        });
        for (BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo3 : list) {
            VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = this.f53426p.get(Integer.valueOf(bLiveLovePlanetPlayerInfo3.position));
            boolean zM82486a = NullChecker.m82486a(voiceVirtualLoveItemInfoView);
            int i = bLiveLovePlanetPlayerInfo3.position;
            if (zM82486a) {
                hashSet.add(Integer.valueOf(i));
                ndp0 ndp0Var = this.f53425o;
                pf60<String, String> pf60Var = this.f53427q.get(Integer.valueOf(bLiveLovePlanetPlayerInfo3.position));
                Objects.requireNonNull(pf60Var);
                voiceVirtualLoveItemInfoView.m78349q0(ndp0Var, bLiveLovePlanetPlayerInfo3, pf60Var.f152157b);
                voiceVirtualLoveItemInfoView.m78348p0(this.f53425o, bLiveLovePlanetPlayerInfo3, bLiveLovePlanetPlayerInfo == null ? "" : bLiveLovePlanetPlayerInfo.userId, bLiveLovePlanetPlayerInfo2);
            } else {
                fhw.m125605a(VirtualVoiceMotionType.lovePlanet, "renderChoiceStage illegal pos:" + i);
            }
        }
        m78372k0(hashSet);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m78372k0(Set<Integer> set) {
        for (Map.Entry<Integer, VoiceVirtualLoveItemInfoView> entry : this.f53426p.entrySet()) {
            if (!set.contains(entry.getKey())) {
                VoiceVirtualLoveItemInfoView value = entry.getValue();
                if (NullChecker.m82486a(value)) {
                    pf60<String, String> pf60Var = this.f53427q.get(entry.getKey());
                    Objects.requireNonNull(pf60Var);
                    value.m78345l0(pf60Var.f152156a);
                    value.m78347o0(entry.getKey().intValue());
                } else {
                    fhw.m125605a(VirtualVoiceMotionType.lovePlanet, "renderEmptySeats illegal pos:" + entry.getKey());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m78373l0(List<BLiveLovePlanetPlayerInfo> list) {
        HashSet hashSet = new HashSet();
        if (NullChecker.m82486a(list)) {
            for (BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo : list) {
                VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = this.f53426p.get(Integer.valueOf(bLiveLovePlanetPlayerInfo.position));
                boolean zM82486a = NullChecker.m82486a(voiceVirtualLoveItemInfoView);
                int i = bLiveLovePlanetPlayerInfo.position;
                if (zM82486a) {
                    hashSet.add(Integer.valueOf(i));
                    ndp0 ndp0Var = this.f53425o;
                    pf60<String, String> pf60Var = this.f53427q.get(Integer.valueOf(bLiveLovePlanetPlayerInfo.position));
                    Objects.requireNonNull(pf60Var);
                    voiceVirtualLoveItemInfoView.m78349q0(ndp0Var, bLiveLovePlanetPlayerInfo, pf60Var.f152157b);
                } else {
                    fhw.m125605a(VirtualVoiceMotionType.lovePlanet, "renderIntroStage illegal pos:" + i);
                }
            }
        }
        m78372k0(hashSet);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78370i0(this);
        this.f53426p.put(1, this.f53419i);
        this.f53426p.put(2, this.f53420j);
        this.f53426p.put(3, this.f53421k);
        this.f53426p.put(4, this.f53422l);
        this.f53426p.put(5, this.f53423m);
        this.f53426p.put(6, this.f53424n);
        this.f53427q.put(1, jyb.m147494Y("https://fe-static.tancdn.com/v1/raw/d4b1debe-1fe6-44b6-ac1e-2ad3569e7fb812.svga", "https://fe-static.tancdn.com/v1/raw/33d9d067-286e-4dde-b289-2c7a2b22c2d913.svga"));
        this.f53427q.put(2, jyb.m147494Y("https://fe-static.tancdn.com/v1/raw/36c64564-b780-4711-8981-73d7b4f7ae7e13.svga", "https://fe-static.tancdn.com/v1/raw/2e81a695-04a4-4021-8708-0b64729bd30c12.svga"));
        this.f53427q.put(3, jyb.m147494Y("https://fe-static.tancdn.com/v1/raw/f6631a76-8f8e-4270-80a9-35eda39fca4e13.svga", "https://fe-static.tancdn.com/v1/raw/5134824b-7680-4a51-be03-5200ffda457a12.svga"));
        this.f53427q.put(4, jyb.m147494Y("https://fe-static.tancdn.com/v1/raw/13db024a-6f9c-4207-95fa-defd1ff8425113.svga", "https://fe-static.tancdn.com/v1/raw/153c6b47-5d6a-4ca6-8249-f6a4a8c214dd12.svga"));
        this.f53427q.put(5, jyb.m147494Y("https://fe-static.tancdn.com/v1/raw/7e5db513-c108-4ad1-85ba-43faaae242c512.svga", "https://fe-static.tancdn.com/v1/raw/9f83c222-e639-42cb-baad-aa55114f2ada13.svga"));
        this.f53427q.put(6, jyb.m147494Y("https://fe-static.tancdn.com/v1/raw/4a66208f-14f1-4c34-bee7-1d157a232b3913.svga", "https://fe-static.tancdn.com/v1/raw/1e64f04a-db2d-4ab2-9bd8-6875451d6f6513.svga"));
    }

    public VoiceVirtualLovePlanetStepIntroAndChoiceWidgetView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53426p = new HashMap();
        this.f53427q = new HashMap();
    }

    public VoiceVirtualLovePlanetStepIntroAndChoiceWidgetView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53426p = new HashMap();
        this.f53427q = new HashMap();
    }
}
