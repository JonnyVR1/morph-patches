package com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveItemInfoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p149l.c0m;
import p149l.d6p0;
import p149l.hfw;
import p149l.j4p0;
import p149l.j760;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualLovePlanetStepIntroAndChoiceWidgetView extends ConstraintLayout implements c0m {

    /* JADX INFO: renamed from: d */
    public VoiceVirtualLovePlanetStepIntroAndChoiceWidgetView f52566d;

    /* JADX INFO: renamed from: e */
    public Guideline f52567e;

    /* JADX INFO: renamed from: f */
    public Guideline f52568f;

    /* JADX INFO: renamed from: g */
    public Guideline f52569g;

    /* JADX INFO: renamed from: h */
    public Guideline f52570h;

    /* JADX INFO: renamed from: i */
    public VoiceVirtualLoveItemInfoView f52571i;

    /* JADX INFO: renamed from: j */
    public VoiceVirtualLoveItemInfoView f52572j;

    /* JADX INFO: renamed from: k */
    public VoiceVirtualLoveItemInfoView f52573k;

    /* JADX INFO: renamed from: l */
    public VoiceVirtualLoveItemInfoView f52574l;

    /* JADX INFO: renamed from: m */
    public VoiceVirtualLoveItemInfoView f52575m;

    /* JADX INFO: renamed from: n */
    public VoiceVirtualLoveItemInfoView f52576n;

    /* JADX INFO: renamed from: o */
    public j4p0 f52577o;

    /* JADX INFO: renamed from: p */
    public final Map<Integer, VoiceVirtualLoveItemInfoView> f52578p;

    /* JADX INFO: renamed from: q */
    public final Map<Integer, j760<String, String>> f52579q;

    public VoiceVirtualLovePlanetStepIntroAndChoiceWidgetView(Context context) {
        super(context);
        this.f52578p = new HashMap();
        this.f52579q = new HashMap();
    }

    @Override // p149l.c0m
    /* JADX INFO: renamed from: S */
    public VoiceVirtualLoveItemInfoView mo77182S(String str) {
        for (VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView : this.f52578p.values()) {
            if (voiceVirtualLoveItemInfoView.getBindPlayerInfo() != null && TextUtils.equals(str, voiceVirtualLoveItemInfoView.getBindPlayerInfo().userId)) {
                return voiceVirtualLoveItemInfoView;
            }
        }
        return null;
    }

    @Override // p149l.c0m
    /* JADX INFO: renamed from: W */
    public void mo21065i1(j4p0 j4p0Var) {
        this.f52577o = j4p0Var;
    }

    @Override // p149l.c0m
    /* JADX INFO: renamed from: Z */
    public void mo77179Z(BLiveVoiceCall bLiveVoiceCall, boolean z) {
        VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = this.f52578p.get(Integer.valueOf(bLiveVoiceCall.position));
        if (NullChecker.m81303a(voiceVirtualLoveItemInfoView)) {
            voiceVirtualLoveItemInfoView.m77169u0(bLiveVoiceCall, z);
            return;
        }
        hfw.m130790a(VirtualVoiceMotionType.lovePlanet, "renderVolumeWave illegal pos:" + bLiveVoiceCall.position);
    }

    @Override // p149l.c0m
    /* JADX INFO: renamed from: c0 */
    public void mo77180c0(BLiveLovePlanet bLiveLovePlanet) {
        if ("prepare".equals(bLiveLovePlanet.stage.toString()) || "introduction".equals(bLiveLovePlanet.stage.toString())) {
            m77190l0(bLiveLovePlanet.playerInfos);
        } else {
            m77188j0(bLiveLovePlanet.host, bLiveLovePlanet.playerInfos);
        }
    }

    @Override // p149l.c0m
    /* JADX INFO: renamed from: f0 */
    public VoiceVirtualLoveItemInfoView mo77184f0(String str) {
        for (Map.Entry<Integer, VoiceVirtualLoveItemInfoView> entry : this.f52578p.entrySet()) {
            if (entry.getValue().getBindInfo() != null && TextUtils.equals(entry.getValue().getBindInfo().userId, str)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override // p149l.c0m
    public int getViewId() {
        return this.f52566d.getId();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m77187i0(View view) {
        d6p0.m110187a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m77188j0(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo, List<BLiveLovePlanetPlayerInfo> list) {
        HashSet hashSet = new HashSet();
        if (vwb.m200296J(list)) {
            m77189k0(hashSet);
            return;
        }
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo2 = (BLiveLovePlanetPlayerInfo) vwb.m200346r(list, new w9j() { // from class: l.c6p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, ypv.f199493a.m199309D0()));
            }
        });
        for (BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo3 : list) {
            VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = this.f52578p.get(Integer.valueOf(bLiveLovePlanetPlayerInfo3.position));
            boolean zM81303a = NullChecker.m81303a(voiceVirtualLoveItemInfoView);
            int i = bLiveLovePlanetPlayerInfo3.position;
            if (zM81303a) {
                hashSet.add(Integer.valueOf(i));
                j4p0 j4p0Var = this.f52577o;
                j760<String, String> j760Var = this.f52579q.get(Integer.valueOf(bLiveLovePlanetPlayerInfo3.position));
                Objects.requireNonNull(j760Var);
                voiceVirtualLoveItemInfoView.m77166q0(j4p0Var, bLiveLovePlanetPlayerInfo3, j760Var.f116565b);
                voiceVirtualLoveItemInfoView.m77165p0(this.f52577o, bLiveLovePlanetPlayerInfo3, bLiveLovePlanetPlayerInfo == null ? "" : bLiveLovePlanetPlayerInfo.userId, bLiveLovePlanetPlayerInfo2);
            } else {
                hfw.m130790a(VirtualVoiceMotionType.lovePlanet, "renderChoiceStage illegal pos:" + i);
            }
        }
        m77189k0(hashSet);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m77189k0(Set<Integer> set) {
        for (Map.Entry<Integer, VoiceVirtualLoveItemInfoView> entry : this.f52578p.entrySet()) {
            if (!set.contains(entry.getKey())) {
                VoiceVirtualLoveItemInfoView value = entry.getValue();
                if (NullChecker.m81303a(value)) {
                    j760<String, String> j760Var = this.f52579q.get(entry.getKey());
                    Objects.requireNonNull(j760Var);
                    value.m77162l0(j760Var.f116564a);
                    value.m77164o0(entry.getKey().intValue());
                } else {
                    hfw.m130790a(VirtualVoiceMotionType.lovePlanet, "renderEmptySeats illegal pos:" + entry.getKey());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m77190l0(List<BLiveLovePlanetPlayerInfo> list) {
        HashSet hashSet = new HashSet();
        if (NullChecker.m81303a(list)) {
            for (BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo : list) {
                VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView = this.f52578p.get(Integer.valueOf(bLiveLovePlanetPlayerInfo.position));
                boolean zM81303a = NullChecker.m81303a(voiceVirtualLoveItemInfoView);
                int i = bLiveLovePlanetPlayerInfo.position;
                if (zM81303a) {
                    hashSet.add(Integer.valueOf(i));
                    j4p0 j4p0Var = this.f52577o;
                    j760<String, String> j760Var = this.f52579q.get(Integer.valueOf(bLiveLovePlanetPlayerInfo.position));
                    Objects.requireNonNull(j760Var);
                    voiceVirtualLoveItemInfoView.m77166q0(j4p0Var, bLiveLovePlanetPlayerInfo, j760Var.f116565b);
                } else {
                    hfw.m130790a(VirtualVoiceMotionType.lovePlanet, "renderIntroStage illegal pos:" + i);
                }
            }
        }
        m77189k0(hashSet);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77187i0(this);
        this.f52578p.put(1, this.f52571i);
        this.f52578p.put(2, this.f52572j);
        this.f52578p.put(3, this.f52573k);
        this.f52578p.put(4, this.f52574l);
        this.f52578p.put(5, this.f52575m);
        this.f52578p.put(6, this.f52576n);
        this.f52579q.put(1, vwb.m200311Y("https://fe-static.tancdn.com/v1/raw/d4b1debe-1fe6-44b6-ac1e-2ad3569e7fb812.svga", "https://fe-static.tancdn.com/v1/raw/33d9d067-286e-4dde-b289-2c7a2b22c2d913.svga"));
        this.f52579q.put(2, vwb.m200311Y("https://fe-static.tancdn.com/v1/raw/36c64564-b780-4711-8981-73d7b4f7ae7e13.svga", "https://fe-static.tancdn.com/v1/raw/2e81a695-04a4-4021-8708-0b64729bd30c12.svga"));
        this.f52579q.put(3, vwb.m200311Y("https://fe-static.tancdn.com/v1/raw/f6631a76-8f8e-4270-80a9-35eda39fca4e13.svga", "https://fe-static.tancdn.com/v1/raw/5134824b-7680-4a51-be03-5200ffda457a12.svga"));
        this.f52579q.put(4, vwb.m200311Y("https://fe-static.tancdn.com/v1/raw/13db024a-6f9c-4207-95fa-defd1ff8425113.svga", "https://fe-static.tancdn.com/v1/raw/153c6b47-5d6a-4ca6-8249-f6a4a8c214dd12.svga"));
        this.f52579q.put(5, vwb.m200311Y("https://fe-static.tancdn.com/v1/raw/7e5db513-c108-4ad1-85ba-43faaae242c512.svga", "https://fe-static.tancdn.com/v1/raw/9f83c222-e639-42cb-baad-aa55114f2ada13.svga"));
        this.f52579q.put(6, vwb.m200311Y("https://fe-static.tancdn.com/v1/raw/4a66208f-14f1-4c34-bee7-1d157a232b3913.svga", "https://fe-static.tancdn.com/v1/raw/1e64f04a-db2d-4ab2-9bd8-6875451d6f6513.svga"));
    }

    public VoiceVirtualLovePlanetStepIntroAndChoiceWidgetView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52578p = new HashMap();
        this.f52579q = new HashMap();
    }

    public VoiceVirtualLovePlanetStepIntroAndChoiceWidgetView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52578p = new HashMap();
        this.f52579q = new HashMap();
    }
}
