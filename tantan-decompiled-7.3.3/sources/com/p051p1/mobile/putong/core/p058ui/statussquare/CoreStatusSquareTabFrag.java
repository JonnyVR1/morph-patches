package com.p051p1.mobile.putong.core.p058ui.statussquare;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Bubbles;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.SquareDataWrapper;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p051p1.mobile.putong.core.p058ui.statussquare.CoreStatusSquareTabFrag;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.StateEmotion;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p137rx.subjects.C22508b;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VPullDownRefreshLayout;
import p151v.VRelative;
import p151v.VText;
import p151v.smart_refresh.constant.RefreshState;
import p151v.smart_refresh.wrapper.RefreshFooterWrapper;
import p153l.a0b;
import p153l.adc0;
import p153l.bnl0;
import p153l.i4g0;
import p153l.ipf0;
import p153l.jyb;
import p153l.l51;
import p153l.ll50;
import p153l.mvc0;
import p153l.o1j0;
import p153l.p9r;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.tm50;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class CoreStatusSquareTabFrag extends PutongFrag {

    /* JADX INFO: renamed from: X */
    public static C22508b<Boolean> f37203X = C22508b.m222767b();

    /* JADX INFO: renamed from: Y */
    public static String f37204Y = "语聊中";

    /* JADX INFO: renamed from: A */
    public VImage f37205A;

    /* JADX INFO: renamed from: B */
    public VImage f37206B;

    /* JADX INFO: renamed from: C */
    public VImage f37207C;

    /* JADX INFO: renamed from: D */
    public VPullDownRefreshLayout f37208D;

    /* JADX INFO: renamed from: E */
    public CoreStateSquareRecycleView f37209E;

    /* JADX INFO: renamed from: F */
    public VLinear f37210F;

    /* JADX INFO: renamed from: H */
    public VText f37212H;

    /* JADX INFO: renamed from: I */
    public VProgressBar f37213I;

    /* JADX INFO: renamed from: J */
    public String f37214J;

    /* JADX INFO: renamed from: O */
    public BaseBubbleItemView f37219O;

    /* JADX INFO: renamed from: P */
    public String f37220P;

    /* JADX INFO: renamed from: T */
    public BubbleInfo f37224T;

    /* JADX INFO: renamed from: U */
    public SquareDataWrapper f37225U;

    /* JADX INFO: renamed from: z */
    public VRelative f37228z;

    /* JADX INFO: renamed from: G */
    public final long f37211G = 86400000;

    /* JADX INFO: renamed from: K */
    public final Queue<SquareDataWrapper> f37215K = new LinkedList();

    /* JADX INFO: renamed from: L */
    public final Queue<SquareDataWrapper> f37216L = new LinkedList();

    /* JADX INFO: renamed from: M */
    public Runnable f37217M = new RunnableC9057a();

    /* JADX INFO: renamed from: N */
    public boolean f37218N = false;

    /* JADX INFO: renamed from: Q */
    public int f37221Q = 0;

    /* JADX INFO: renamed from: R */
    public boolean f37222R = true;

    /* JADX INFO: renamed from: S */
    public int f37223S = 0;

    /* JADX INFO: renamed from: V */
    public int f37226V = 4;

    /* JADX INFO: renamed from: W */
    public int f37227W = 3;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStatusSquareTabFrag$a */
    public class RunnableC9057a implements Runnable {
        public RunnableC9057a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreStatusSquareTabFrag.this.f37226V = 1;
            if (!NullChecker.m82486a(CoreStatusSquareTabFrag.this.f37225U)) {
                CoreStatusSquareTabFrag coreStatusSquareTabFrag = CoreStatusSquareTabFrag.this;
                coreStatusSquareTabFrag.m56926P5(coreStatusSquareTabFrag.f37214J, true);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(CoreStatusSquareTabFrag.this.f37225U);
            CoreStatusSquareTabFrag.this.f37209E.m81325J(arrayList);
            if (TextUtils.isEmpty(CoreStatusSquareTabFrag.this.f37214J) && CoreStatusSquareTabFrag.this.f37215K.size() == 0) {
                if (NullChecker.m82486a(CoreStatusSquareTabFrag.this.f37212H)) {
                    CoreStatusSquareTabFrag.this.f37212H.setText("无更多状态");
                }
                if (NullChecker.m82486a(CoreStatusSquareTabFrag.this.f37213I)) {
                    bnl0.m105524M(CoreStatusSquareTabFrag.this.f37213I, false);
                }
                CoreStatusSquareTabFrag.this.f37208D.m225001G(false);
            }
            CoreStatusSquareTabFrag.this.f37208D.m225016o();
            CoreStatusSquareTabFrag.this.f37225U = null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStatusSquareTabFrag$b */
    public class C9058b extends ipf0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f37230a;

        public C9058b(View view) {
            this.f37230a = view;
        }

        @Override // p153l.ipf0, p153l.tn50
        /* JADX INFO: renamed from: f */
        public void mo56941f(@NonNull @NotNull mvc0 mvc0Var, @NonNull @NotNull RefreshState refreshState, @NonNull @NotNull RefreshState refreshState2) {
            super.mo56941f(mvc0Var, refreshState, refreshState2);
            RefreshState refreshState3 = RefreshState.None;
            if (refreshState2 == refreshState3) {
                CoreStatusSquareTabFrag.this.f37218N = true;
                l51.m152890J(CoreStatusSquareTabFrag.this.f37217M);
                l51.m152888H(CoreStatusSquareTabFrag.this.act(), CoreStatusSquareTabFrag.this.f37217M, 2000L);
            }
            bnl0.m105525M0(this.f37230a, refreshState2 != refreshState3);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStatusSquareTabFrag$c */
    public class C9059c extends RecyclerView.AbstractC0584t {
        public C9059c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                CoreStatusSquareTabFrag.this.f37218N = false;
                l51.m152890J(CoreStatusSquareTabFrag.this.f37217M);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m56882E4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m56928R5();
            if (this.f37218N) {
                l51.m152890J(this.f37217M);
                l51.m152888H(act(), this.f37217M, 2000L);
            }
        }
        if (c4470c == C4470c.f16268j) {
            m56930p5();
            l51.m152890J(this.f37217M);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F5 */
    public /* synthetic */ void m56883F5(pf60 pf60Var) {
        if (!((Boolean) pf60Var.f152156a).booleanValue()) {
            l51.m152890J(this.f37217M);
        } else if (this.f37218N) {
            l51.m152890J(this.f37217M);
            l51.m152888H(act(), this.f37217M, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G5 */
    public /* synthetic */ void m56884G5(boolean z) {
        this.f37218N = true;
        l51.m152890J(this.f37217M);
        l51.m152888H(act(), this.f37217M, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H5 */
    public /* synthetic */ void m56885H5() {
        bnl0.m105524M(this.f37210F, true);
    }

    /* JADX INFO: renamed from: T4 */
    public static /* synthetic */ void m56893T4(Throwable th) {
    }

    /* JADX INFO: renamed from: n5 */
    public static PutongFrag m56912n5(String str, BubbleInfo bubbleInfo, int i) {
        CoreStatusSquareTabFrag coreStatusSquareTabFrag = new CoreStatusSquareTabFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bubbleInfo", bubbleInfo);
        bundle.putInt("footRes", i);
        bundle.putString("from", str);
        coreStatusSquareTabFrag.setArguments(bundle);
        return coreStatusSquareTabFrag;
    }

    /* JADX INFO: renamed from: o5 */
    private boolean m56913o5(BubbleInfo bubbleInfo) {
        return (bubbleInfo.createdTime + 8.64E7d) - ((double) pzi0.m174454o()) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m56914A5(Envelope envelope) {
        if (NullChecker.m82486a(envelope)) {
            List<StateEmotion> list = ((CoreData) envelope.data.getModuleData(CoreData.class)).stateEmotion;
            if (jyb.m147479J(list) || jyb.m147479J(list.get(0).emotions)) {
                this.f37222R = false;
            } else {
                if (!TextUtils.isEmpty(list.get(0).categoryName)) {
                    f37204Y = list.get(0).categoryName;
                }
                this.f37222R = list.get(0).emotions.size() != 0;
                m56927Q5(list.get(0).emotions);
            }
        } else {
            this.f37222R = false;
        }
        m56939y5();
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m56915B5(Throwable th) {
        m56939y5();
        this.f37222R = false;
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m56916C5(Envelope envelope) {
        if (!NullChecker.m82486a(envelope)) {
            bnl0.m105524M(this.f37228z, false);
            bnl0.m105524M(this.f37210F, true);
            this.f37208D.m225001G(false);
            return;
        }
        List<BubbleInfo> list = ((CoreData) envelope.data.getModuleData(CoreData.class)).states;
        if (NullChecker.m82486a(this.f37224T)) {
            for (int i = 0; i < list.size(); i++) {
                BubbleInfo bubbleInfo = list.get(i);
                if (TextUtils.equals(bubbleInfo.f39578id, this.f37224T.f39578id)) {
                    list.remove(bubbleInfo);
                    break;
                }
            }
            list.add(this.f37224T);
        }
        m56940z5(m56938x5(envelope, list), new y20() { // from class: l.qza
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160234a.m56918E5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m56917D5(Throwable th) {
        List<SquareDataWrapper> data = this.f37209E.getData();
        if (data == null || data.size() == 0) {
            bnl0.m105524M(this.f37210F, true);
            this.f37208D.m225001G(false);
        }
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m56918E5(List list) {
        this.f37209E.setDataList(list);
        int size = list.size();
        VRelative vRelative = this.f37228z;
        if (size == 0) {
            bnl0.m105524M(vRelative, false);
            bnl0.m105524M(this.f37210F, true);
            this.f37208D.m225001G(false);
        } else {
            bnl0.m105524M(vRelative, true);
        }
        if (TextUtils.isEmpty(this.f37214J)) {
            if (NullChecker.m82486a(this.f37212H)) {
                this.f37212H.setText("无更多状态");
            }
            if (NullChecker.m82486a(this.f37213I)) {
                bnl0.m105524M(this.f37213I, false);
            }
            this.f37208D.m225016o();
        }
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m56919I5(BaseBubbleItemView baseBubbleItemView) {
        SquareDataWrapper dataWrapper = baseBubbleItemView.getDataWrapper();
        if (dataWrapper.f33508e == SquareDataWrapper.Type.momentChatRoom) {
            i4g0.m138523u("e_live_audio_room_enter", "p_state_explore", pf60.m172085a("anchorId", dataWrapper.f33512i.userId), pf60.m172085a("liveId", dataWrapper.f33512i.liveId), pf60.m172085a("audio_card_type", "state_explore_bubble"), pf60.m172085a("topic_id", dataWrapper.f33512i.topicId), pf60.m172085a("audio_room_label", ""), pf60.m172085a("voice_template", ""));
            i4g0.m138523u("e_state", "p_state_explore", pf60.m172085a("e_state_type", "audio_room"), pf60.m172085a("refer_source", this.f37220P), pf60.m172085a("state_id", ""), pf60.m172085a("owner_id", dataWrapper.f33512i.userId));
            CoreModule.m30934Q().mo68412M6().mo127334e(act(), dataWrapper.f33512i.liveId, "p_state_explore", "");
            baseBubbleItemView.m81302f();
            return;
        }
        if (CoreModule.m30929H().userId().equals(dataWrapper.f178729a.owner.f39651id)) {
            return;
        }
        i4g0.m138523u("e_state", "p_state_explore", pf60.m172085a("e_state_type", "state"), pf60.m172085a("state_id", dataWrapper.f178729a.f39578id), pf60.m172085a("owner_id", dataWrapper.f178729a.owner.f39651id));
        BubbleInfo bubbleInfo = dataWrapper.f178729a;
        if (!m56913o5(bubbleInfo)) {
            o1j0.m165636j("状态已结束");
            this.f37209E.m81330P(dataWrapper, new x20() { // from class: l.wza
                @Override // p153l.x20
                public final void call() {
                    this.f191737a.m56885H5();
                }
            });
        } else {
            this.f37219O = baseBubbleItemView;
            C8523d.a aVar = new C8523d.a(bubbleInfo.owner.f39651id, "p_state_explore");
            aVar.m47101o("p_quickchat,state");
            C8523d.m47075a(act(), aVar);
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ void m56920J5(Boolean bool) {
        if (NullChecker.m82486a(this.f37219O)) {
            this.f37219O.m81302f();
        }
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ void m56921K5(mvc0 mvc0Var) {
        this.f37218N = false;
        l51.m152890J(this.f37217M);
        this.f37226V = m56935u5();
        m56926P5(this.f37214J, false);
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ void m56922L5(List list, y20 y20Var, Envelope envelope) {
        List<StateEmotion> list2 = ((CoreData) envelope.data.getModuleData(CoreData.class)).stateEmotion;
        if (jyb.m147479J(list2) || jyb.m147479J(list2.get(0).emotions)) {
            this.f37222R = false;
        } else {
            this.f37222R = list2.get(0).emotions.size() != 0;
            m56927Q5(list2.get(0).emotions);
        }
        m56940z5(list, y20Var);
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ void m56923M5(List list, y20 y20Var, Throwable th) {
        this.f37222R = false;
        m56940z5(list, y20Var);
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m56924N5(boolean z, List list) {
        if (z && list.size() == 2) {
            this.f37225U = (SquareDataWrapper) list.get(1);
            ArrayList arrayList = new ArrayList();
            arrayList.add((SquareDataWrapper) list.get(0));
            this.f37209E.m81325J(arrayList);
        } else {
            if (z) {
                this.f37225U = null;
            }
            this.f37209E.m81325J(list);
            if (TextUtils.isEmpty(this.f37214J) && this.f37215K.size() == 0) {
                if (NullChecker.m82486a(this.f37212H)) {
                    this.f37212H.setText("无更多状态");
                }
                if (NullChecker.m82486a(this.f37213I)) {
                    bnl0.m105524M(this.f37213I, false);
                }
                this.f37208D.m225001G(false);
            }
        }
        this.f37208D.m225016o();
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ void m56925O5(boolean z, Envelope envelope) {
        List<BubbleInfo> list = ((CoreData) envelope.data.getModuleData(CoreData.class)).states;
        if (NullChecker.m82486a(this.f37224T)) {
            for (int i = 0; i < list.size(); i++) {
                BubbleInfo bubbleInfo = list.get(i);
                if (TextUtils.equals(bubbleInfo.f39578id, this.f37224T.f39578id)) {
                    list.remove(bubbleInfo);
                }
            }
        }
        this.f37215K.addAll(m56938x5(envelope, list));
        m56926P5(this.f37214J, z);
    }

    /* JADX INFO: renamed from: P5 */
    public void m56926P5(String str, final boolean z) {
        if (this.f37215K.size() >= this.f37226V || (this.f37215K.size() > 0 && TextUtils.isEmpty(str))) {
            m56940z5(m56933s5(), new y20() { // from class: l.xza
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196840a.m56924N5(z, (List) obj);
                }
            });
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            duringCreated(CoreModule.m30932N().mo61538gk(str)).subscribe(psd0.m173597H(new y20() { // from class: l.yza
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202180a.m56925O5(z, (Envelope) obj);
                }
            }, new y20() { // from class: l.zza
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreStatusSquareTabFrag.m56893T4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m56927Q5(List<Emotion> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SquareDataWrapper squareDataWrapper = new SquareDataWrapper();
            squareDataWrapper.f33512i = list.get(i);
            squareDataWrapper.f33508e = SquareDataWrapper.Type.momentChatRoom;
            arrayList.add(squareDataWrapper);
        }
        this.f37216L.addAll(arrayList);
    }

    /* JADX INFO: renamed from: R5 */
    public void m56928R5() {
        this.pageHelper.m152782q(pageId());
        this.pageHelper.m152777l();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        duringCreated(lifecycle()).subscribe(psd0.m173596G(new y20() { // from class: l.jza
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123250a.m56882E4((C4470c) obj);
            }
        }));
        duringCreated(CoreModule.m30932N().mo61463H7()).subscribe(psd0.m173596G(new y20() { // from class: l.rza
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165503a.m56883F5((pf60) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f37227W = m56934t5();
        String string = getArguments() == null ? "" : getArguments().getString("from");
        this.f37220P = string;
        this.f37209E.setReferSource(string);
        this.f37209E.setFrom("p_state_explore");
        this.f37209E.setBottomListener(new ll50() { // from class: l.sza
            @Override // p153l.ll50
            /* JADX INFO: renamed from: a */
            public final void mo154701a(boolean z) {
                this.f171369a.m56884G5(z);
            }
        });
        this.f37209E.setClickListener(new y20() { // from class: l.tza
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176748a.m56919I5((BaseBubbleItemView) obj);
            }
        });
        duringCreated(f37203X).subscribe(psd0.m173596G(new y20() { // from class: l.uza
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181715a.m56920J5((Boolean) obj);
            }
        }));
        this.f37208D.mo224404M(new tm50() { // from class: l.vza
            @Override // p153l.tm50
            /* JADX INFO: renamed from: a */
            public final void mo79018a(mvc0 mvc0Var) {
                this.f186457a.m56921K5(mvc0Var);
            }
        });
        View viewInflate = p9r.m171370a(act()).inflate(getArguments().getInt("footRes"), (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(adc0.f70205Xa);
        this.f37212H = m56937w5(linearLayout);
        this.f37213I = m56936v5(linearLayout);
        if (NullChecker.m82486a(this.f37212H)) {
            this.f37212H.setText("正在加载更多状态...");
        }
        this.f37208D.mo224407Q(new RefreshFooterWrapper(viewInflate));
        bnl0.m105525M0(viewInflate, false);
        this.f37208D.m225007N(new C9058b(viewInflate));
        this.f37209E.addOnScrollListener(new C9059c());
        m56932r5();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m56929m5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m5 */
    public View m56929m5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a0b.m95325b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p5 */
    public void m56930p5() {
        this.pageHelper.m152782q(pageId());
        this.pageHelper.m152776k();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_state_explore";
    }

    /* JADX INFO: renamed from: q5 */
    public String m56931q5(BubbleInfo bubbleInfo) {
        String str = bubbleInfo.value;
        if (!TextUtils.isEmpty(str) || !NullChecker.m82486a(bubbleInfo.emotion)) {
            return str;
        }
        String str2 = bubbleInfo.emotion.text;
        if (!CoreModule.m30932N().mo61500Sd().contains(str2)) {
            return str2;
        }
        return "找人一起" + str2;
    }

    /* JADX INFO: renamed from: r5 */
    public final void m56932r5() {
        this.f37224T = getArguments() != null ? (BubbleInfo) getArguments().getSerializable("bubbleInfo") : null;
        duringCreated(CoreModule.f18264c.f20418q1.m34276u3()).subscribe(psd0.m173597H(new y20() { // from class: l.kza
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129395a.m56914A5((Envelope) obj);
            }
        }, new y20() { // from class: l.lza
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134166a.m56915B5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s5 */
    public final List<SquareDataWrapper> m56933s5() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f37226V; i++) {
            arrayList.add(this.f37215K.poll());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t5 */
    public int m56934t5() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_post_status_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                int i = new JSONObject(strM80485F).getInt("insertCount");
                this.f37227W = i;
                if (i == 0) {
                    this.f37227W = 3;
                }
            }
        } catch (Exception unused) {
        }
        return this.f37227W;
    }

    /* JADX INFO: renamed from: u5 */
    public int m56935u5() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_post_status_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return 4;
            }
            return new JSONObject(strM80485F).getInt("stateSquareLimit");
        } catch (Exception unused) {
            return 4;
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final VProgressBar m56936v5(LinearLayout linearLayout) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof VProgressBar) {
                return (VProgressBar) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w5 */
    public VText m56937w5(LinearLayout linearLayout) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof VText) {
                return (VText) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x5 */
    public final List<SquareDataWrapper> m56938x5(Envelope envelope, List<BubbleInfo> list) {
        this.f37214J = envelope.pagination.links.next;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SquareDataWrapper squareDataWrapper = new SquareDataWrapper();
            BubbleInfo bubbleInfo = list.get(i);
            bubbleInfo.value = m56931q5(bubbleInfo);
            Bubbles bubbles = new Bubbles();
            bubbles.userID = bubbleInfo.owner.f39651id;
            User userById = CoreModule.m30932N().getUserById(bubbleInfo.owner.f39651id);
            bubbles.photoURL = userById == null ? "" : userById.m61308fp().profileSmall().formatted();
            squareDataWrapper.f33509f = bubbles;
            squareDataWrapper.f178729a = bubbleInfo;
            arrayList.add(squareDataWrapper);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y5 */
    public void m56939y5() {
        duringCreated(CoreModule.m30932N().mo61538gk(this.f37214J)).subscribe(psd0.m173597H(new y20() { // from class: l.mza
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139493a.m56916C5((Envelope) obj);
            }
        }, new y20() { // from class: l.nza
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144414a.m56917D5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z5 */
    public final void m56940z5(final List<SquareDataWrapper> list, final y20<List<SquareDataWrapper>> y20Var) {
        int i;
        if (jyb.m147479J(list)) {
            y20Var.call(new ArrayList<>());
            return;
        }
        int size = list.size();
        int i2 = this.f37227W;
        if (((size - (i2 - this.f37221Q)) / i2) + 1 > this.f37216L.size() && this.f37222R) {
            duringCreated(CoreModule.f18264c.f20418q1.m34276u3()).subscribe(psd0.m173597H(new y20() { // from class: l.oza
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f149851a.m56922L5(list, y20Var, (Envelope) obj);
                }
            }, new y20() { // from class: l.pza
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f154730a.m56923M5(list, y20Var, (Throwable) obj);
                }
            }));
            return;
        }
        List<SquareDataWrapper> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (true) {
            int size2 = list.size();
            i = this.f37223S;
            if (i3 >= size2) {
                break;
            }
            this.f37223S = i + 1;
            arrayList2.add(list.get(i3));
            if (arrayList2.size() == this.f37227W - this.f37221Q) {
                if (this.f37216L.size() > 0) {
                    int iNextInt = new Random().nextInt(this.f37227W);
                    if (iNextInt == 0) {
                        iNextInt = 1;
                    }
                    if (this.f37221Q != 0) {
                        iNextInt = 0;
                    }
                    arrayList2.add(iNextInt, this.f37216L.poll());
                }
                arrayList.addAll(arrayList2);
                arrayList2.clear();
                this.f37221Q = 0;
                this.f37223S = 0;
            }
            i3++;
        }
        this.f37221Q = i;
        if (arrayList2.size() != 0) {
            arrayList.addAll(arrayList2);
        }
        y20Var.call(arrayList);
    }
}
