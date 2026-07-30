package com.p046p1.mobile.putong.core.p053ui.statussquare;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Bubbles;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.SquareDataWrapper;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.BaseBubbleItemView;
import com.p046p1.mobile.putong.core.p053ui.statussquare.CoreStatusSquareTabFrag;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.StateEmotion;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p133rx.subjects.C22393b;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VPullDownRefreshLayout;
import p147v.VRelative;
import p147v.VText;
import p147v.smart_refresh.constant.RefreshState;
import p147v.smart_refresh.wrapper.RefreshFooterWrapper;
import p149l.ahf0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.ed50;
import p149l.hnc0;
import p149l.j760;
import p149l.lsi0;
import p149l.me50;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o7r;
import p149l.oya;
import p149l.u4c0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreStatusSquareTabFrag extends PutongFrag {

    /* JADX INFO: renamed from: X */
    public static C22393b<Boolean> f36355X = C22393b.m221521b();

    /* JADX INFO: renamed from: Y */
    public static String f36356Y = "语聊中";

    /* JADX INFO: renamed from: A */
    public VImage f36357A;

    /* JADX INFO: renamed from: B */
    public VImage f36358B;

    /* JADX INFO: renamed from: C */
    public VImage f36359C;

    /* JADX INFO: renamed from: D */
    public VPullDownRefreshLayout f36360D;

    /* JADX INFO: renamed from: E */
    public CoreStateSquareRecycleView f36361E;

    /* JADX INFO: renamed from: F */
    public VLinear f36362F;

    /* JADX INFO: renamed from: H */
    public VText f36364H;

    /* JADX INFO: renamed from: I */
    public VProgressBar f36365I;

    /* JADX INFO: renamed from: J */
    public String f36366J;

    /* JADX INFO: renamed from: O */
    public BaseBubbleItemView f36371O;

    /* JADX INFO: renamed from: P */
    public String f36372P;

    /* JADX INFO: renamed from: T */
    public BubbleInfo f36376T;

    /* JADX INFO: renamed from: U */
    public SquareDataWrapper f36377U;

    /* JADX INFO: renamed from: z */
    public VRelative f36380z;

    /* JADX INFO: renamed from: G */
    public final long f36363G = 86400000;

    /* JADX INFO: renamed from: K */
    public final Queue<SquareDataWrapper> f36367K = new LinkedList();

    /* JADX INFO: renamed from: L */
    public final Queue<SquareDataWrapper> f36368L = new LinkedList();

    /* JADX INFO: renamed from: M */
    public Runnable f36369M = new RunnableC8894a();

    /* JADX INFO: renamed from: N */
    public boolean f36370N = false;

    /* JADX INFO: renamed from: Q */
    public int f36373Q = 0;

    /* JADX INFO: renamed from: R */
    public boolean f36374R = true;

    /* JADX INFO: renamed from: S */
    public int f36375S = 0;

    /* JADX INFO: renamed from: V */
    public int f36378V = 4;

    /* JADX INFO: renamed from: W */
    public int f36379W = 3;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStatusSquareTabFrag$a */
    public class RunnableC8894a implements Runnable {
        public RunnableC8894a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreStatusSquareTabFrag.this.f36378V = 1;
            if (!NullChecker.m81303a(CoreStatusSquareTabFrag.this.f36377U)) {
                CoreStatusSquareTabFrag coreStatusSquareTabFrag = CoreStatusSquareTabFrag.this;
                coreStatusSquareTabFrag.m55743P5(coreStatusSquareTabFrag.f36366J, true);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(CoreStatusSquareTabFrag.this.f36377U);
            CoreStatusSquareTabFrag.this.f36361E.m80142J(arrayList);
            if (TextUtils.isEmpty(CoreStatusSquareTabFrag.this.f36366J) && CoreStatusSquareTabFrag.this.f36367K.size() == 0) {
                if (NullChecker.m81303a(CoreStatusSquareTabFrag.this.f36364H)) {
                    CoreStatusSquareTabFrag.this.f36364H.setText("无更多状态");
                }
                if (NullChecker.m81303a(CoreStatusSquareTabFrag.this.f36365I)) {
                    xdl0.m208344M(CoreStatusSquareTabFrag.this.f36365I, false);
                }
                CoreStatusSquareTabFrag.this.f36360D.m223755G(false);
            }
            CoreStatusSquareTabFrag.this.f36360D.m223770o();
            CoreStatusSquareTabFrag.this.f36377U = null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStatusSquareTabFrag$b */
    public class C8895b extends ahf0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f36382a;

        public C8895b(View view) {
            this.f36382a = view;
        }

        @Override // p149l.ahf0, p149l.nf50
        /* JADX INFO: renamed from: f */
        public void mo55758f(@NonNull @NotNull hnc0 hnc0Var, @NonNull @NotNull RefreshState refreshState, @NonNull @NotNull RefreshState refreshState2) {
            super.mo55758f(hnc0Var, refreshState, refreshState2);
            RefreshState refreshState3 = RefreshState.None;
            if (refreshState2 == refreshState3) {
                CoreStatusSquareTabFrag.this.f36370N = true;
                e51.m114745J(CoreStatusSquareTabFrag.this.f36369M);
                e51.m114743H(CoreStatusSquareTabFrag.this.act(), CoreStatusSquareTabFrag.this.f36369M, 2000L);
            }
            xdl0.m208345M0(this.f36382a, refreshState2 != refreshState3);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStatusSquareTabFrag$c */
    public class C8896c extends RecyclerView.AbstractC0582t {
        public C8896c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                CoreStatusSquareTabFrag.this.f36370N = false;
                e51.m114745J(CoreStatusSquareTabFrag.this.f36369M);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m55699E4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m55745R5();
            if (this.f36370N) {
                e51.m114745J(this.f36369M);
                e51.m114743H(act(), this.f36369M, 2000L);
            }
        }
        if (c4319c == C4319c.f15549j) {
            m55747p5();
            e51.m114745J(this.f36369M);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F5 */
    public /* synthetic */ void m55700F5(j760 j760Var) {
        if (!((Boolean) j760Var.f116564a).booleanValue()) {
            e51.m114745J(this.f36369M);
        } else if (this.f36370N) {
            e51.m114745J(this.f36369M);
            e51.m114743H(act(), this.f36369M, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G5 */
    public /* synthetic */ void m55701G5(boolean z) {
        this.f36370N = true;
        e51.m114745J(this.f36369M);
        e51.m114743H(act(), this.f36369M, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H5 */
    public /* synthetic */ void m55702H5() {
        xdl0.m208344M(this.f36362F, true);
    }

    /* JADX INFO: renamed from: T4 */
    public static /* synthetic */ void m55710T4(Throwable th) {
    }

    /* JADX INFO: renamed from: n5 */
    public static PutongFrag m55729n5(String str, BubbleInfo bubbleInfo, int i) {
        CoreStatusSquareTabFrag coreStatusSquareTabFrag = new CoreStatusSquareTabFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bubbleInfo", bubbleInfo);
        bundle.putInt("footRes", i);
        bundle.putString("from", str);
        coreStatusSquareTabFrag.setArguments(bundle);
        return coreStatusSquareTabFrag;
    }

    /* JADX INFO: renamed from: o5 */
    private boolean m55730o5(BubbleInfo bubbleInfo) {
        return (bubbleInfo.createdTime + 8.64E7d) - ((double) mqi0.m155944o()) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m55731A5(Envelope envelope) {
        if (NullChecker.m81303a(envelope)) {
            List<StateEmotion> list = ((CoreData) envelope.data.getModuleData(CoreData.class)).stateEmotion;
            if (vwb.m200296J(list) || vwb.m200296J(list.get(0).emotions)) {
                this.f36374R = false;
            } else {
                if (!TextUtils.isEmpty(list.get(0).categoryName)) {
                    f36356Y = list.get(0).categoryName;
                }
                this.f36374R = list.get(0).emotions.size() != 0;
                m55744Q5(list.get(0).emotions);
            }
        } else {
            this.f36374R = false;
        }
        m55756y5();
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m55732B5(Throwable th) {
        m55756y5();
        this.f36374R = false;
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m55733C5(Envelope envelope) {
        if (!NullChecker.m81303a(envelope)) {
            xdl0.m208344M(this.f36380z, false);
            xdl0.m208344M(this.f36362F, true);
            this.f36360D.m223755G(false);
            return;
        }
        List<BubbleInfo> list = ((CoreData) envelope.data.getModuleData(CoreData.class)).states;
        if (NullChecker.m81303a(this.f36376T)) {
            for (int i = 0; i < list.size(); i++) {
                BubbleInfo bubbleInfo = list.get(i);
                if (TextUtils.equals(bubbleInfo.f38730id, this.f36376T.f38730id)) {
                    list.remove(bubbleInfo);
                    break;
                }
            }
            list.add(this.f36376T);
        }
        m55757z5(m55755x5(envelope, list), new e30() { // from class: l.eya
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93733a.m55735E5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m55734D5(Throwable th) {
        List<SquareDataWrapper> data = this.f36361E.getData();
        if (data == null || data.size() == 0) {
            xdl0.m208344M(this.f36362F, true);
            this.f36360D.m223755G(false);
        }
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m55735E5(List list) {
        this.f36361E.setDataList(list);
        int size = list.size();
        VRelative vRelative = this.f36380z;
        if (size == 0) {
            xdl0.m208344M(vRelative, false);
            xdl0.m208344M(this.f36362F, true);
            this.f36360D.m223755G(false);
        } else {
            xdl0.m208344M(vRelative, true);
        }
        if (TextUtils.isEmpty(this.f36366J)) {
            if (NullChecker.m81303a(this.f36364H)) {
                this.f36364H.setText("无更多状态");
            }
            if (NullChecker.m81303a(this.f36365I)) {
                xdl0.m208344M(this.f36365I, false);
            }
            this.f36360D.m223770o();
        }
    }

    /* JADX INFO: renamed from: I5 */
    public final /* synthetic */ void m55736I5(BaseBubbleItemView baseBubbleItemView) {
        SquareDataWrapper dataWrapper = baseBubbleItemView.getDataWrapper();
        if (dataWrapper.f32660e == SquareDataWrapper.Type.momentChatRoom) {
            zvf0.m220399u("e_live_audio_room_enter", "p_state_explore", j760.m140076a("anchorId", dataWrapper.f32664i.userId), j760.m140076a("liveId", dataWrapper.f32664i.liveId), j760.m140076a("audio_card_type", "state_explore_bubble"), j760.m140076a("topic_id", dataWrapper.f32664i.topicId), j760.m140076a("audio_room_label", ""), j760.m140076a("voice_template", ""));
            zvf0.m220399u("e_state", "p_state_explore", j760.m140076a("e_state_type", "audio_room"), j760.m140076a("refer_source", this.f36372P), j760.m140076a("state_id", ""), j760.m140076a("owner_id", dataWrapper.f32664i.userId));
            CoreModule.m29936Q().mo67229M6().mo102420e(act(), dataWrapper.f32664i.liveId, "p_state_explore", "");
            baseBubbleItemView.m80119f();
            return;
        }
        if (CoreModule.m29931H().userId().equals(dataWrapper.f102323a.owner.f38803id)) {
            return;
        }
        zvf0.m220399u("e_state", "p_state_explore", j760.m140076a("e_state_type", "state"), j760.m140076a("state_id", dataWrapper.f102323a.f38730id), j760.m140076a("owner_id", dataWrapper.f102323a.owner.f38803id));
        BubbleInfo bubbleInfo = dataWrapper.f102323a;
        if (!m55730o5(bubbleInfo)) {
            lsi0.m151580j("状态已结束");
            this.f36361E.m80147P(dataWrapper, new d30() { // from class: l.kya
                @Override // p149l.d30
                public final void call() {
                    this.f125261a.m55702H5();
                }
            });
        } else {
            this.f36371O = baseBubbleItemView;
            C8360d.a aVar = new C8360d.a(bubbleInfo.owner.f38803id, "p_state_explore");
            aVar.m45918o("p_quickchat,state");
            C8360d.m45892a(act(), aVar);
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ void m55737J5(Boolean bool) {
        if (NullChecker.m81303a(this.f36371O)) {
            this.f36371O.m80119f();
        }
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ void m55738K5(hnc0 hnc0Var) {
        this.f36370N = false;
        e51.m114745J(this.f36369M);
        this.f36378V = m55752u5();
        m55743P5(this.f36366J, false);
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ void m55739L5(List list, e30 e30Var, Envelope envelope) {
        List<StateEmotion> list2 = ((CoreData) envelope.data.getModuleData(CoreData.class)).stateEmotion;
        if (vwb.m200296J(list2) || vwb.m200296J(list2.get(0).emotions)) {
            this.f36374R = false;
        } else {
            this.f36374R = list2.get(0).emotions.size() != 0;
            m55744Q5(list2.get(0).emotions);
        }
        m55757z5(list, e30Var);
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ void m55740M5(List list, e30 e30Var, Throwable th) {
        this.f36374R = false;
        m55757z5(list, e30Var);
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m55741N5(boolean z, List list) {
        if (z && list.size() == 2) {
            this.f36377U = (SquareDataWrapper) list.get(1);
            ArrayList arrayList = new ArrayList();
            arrayList.add((SquareDataWrapper) list.get(0));
            this.f36361E.m80142J(arrayList);
        } else {
            if (z) {
                this.f36377U = null;
            }
            this.f36361E.m80142J(list);
            if (TextUtils.isEmpty(this.f36366J) && this.f36367K.size() == 0) {
                if (NullChecker.m81303a(this.f36364H)) {
                    this.f36364H.setText("无更多状态");
                }
                if (NullChecker.m81303a(this.f36365I)) {
                    xdl0.m208344M(this.f36365I, false);
                }
                this.f36360D.m223755G(false);
            }
        }
        this.f36360D.m223770o();
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ void m55742O5(boolean z, Envelope envelope) {
        List<BubbleInfo> list = ((CoreData) envelope.data.getModuleData(CoreData.class)).states;
        if (NullChecker.m81303a(this.f36376T)) {
            for (int i = 0; i < list.size(); i++) {
                BubbleInfo bubbleInfo = list.get(i);
                if (TextUtils.equals(bubbleInfo.f38730id, this.f36376T.f38730id)) {
                    list.remove(bubbleInfo);
                }
            }
        }
        this.f36367K.addAll(m55755x5(envelope, list));
        m55743P5(this.f36366J, z);
    }

    /* JADX INFO: renamed from: P5 */
    public void m55743P5(String str, final boolean z) {
        if (this.f36367K.size() >= this.f36378V || (this.f36367K.size() > 0 && TextUtils.isEmpty(str))) {
            m55757z5(m55750s5(), new e30() { // from class: l.lya
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130516a.m55741N5(z, (List) obj);
                }
            });
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            duringCreated(CoreModule.m29934N().mo60354gk(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.mya
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f136269a.m55742O5(z, (Envelope) obj);
                }
            }, new e30() { // from class: l.nya
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreStatusSquareTabFrag.m55710T4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m55744Q5(List<Emotion> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SquareDataWrapper squareDataWrapper = new SquareDataWrapper();
            squareDataWrapper.f32664i = list.get(i);
            squareDataWrapper.f32660e = SquareDataWrapper.Type.momentChatRoom;
            arrayList.add(squareDataWrapper);
        }
        this.f36368L.addAll(arrayList);
    }

    /* JADX INFO: renamed from: R5 */
    public void m55745R5() {
        this.pageHelper.m109041q(pageId());
        this.pageHelper.m109036l();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        duringCreated(lifecycle()).subscribe(mkd0.m154955G(new e30() { // from class: l.xxa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194847a.m55699E4((C4319c) obj);
            }
        }));
        duringCreated(CoreModule.m29934N().mo60279H7()).subscribe(mkd0.m154955G(new e30() { // from class: l.fya
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99846a.m55700F5((j760) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f36379W = m55751t5();
        String string = getArguments() == null ? "" : getArguments().getString("from");
        this.f36372P = string;
        this.f36361E.setReferSource(string);
        this.f36361E.setFrom("p_state_explore");
        this.f36361E.setBottomListener(new ed50() { // from class: l.gya
            @Override // p149l.ed50
            /* JADX INFO: renamed from: a */
            public final void mo115787a(boolean z) {
                this.f104979a.m55701G5(z);
            }
        });
        this.f36361E.setClickListener(new e30() { // from class: l.hya
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110041a.m55736I5((BaseBubbleItemView) obj);
            }
        });
        duringCreated(f36355X).subscribe(mkd0.m154955G(new e30() { // from class: l.iya
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115438a.m55737J5((Boolean) obj);
            }
        }));
        this.f36360D.mo223158M(new me50() { // from class: l.jya
            @Override // p149l.me50
            /* JADX INFO: renamed from: a */
            public final void mo77835a(hnc0 hnc0Var) {
                this.f120292a.m55738K5(hnc0Var);
            }
        });
        View viewInflate = o7r.m163037a(act()).inflate(getArguments().getInt("footRes"), (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(u4c0.f174082Va);
        this.f36364H = m55754w5(linearLayout);
        this.f36365I = m55753v5(linearLayout);
        if (NullChecker.m81303a(this.f36364H)) {
            this.f36364H.setText("正在加载更多状态...");
        }
        this.f36360D.mo223161Q(new RefreshFooterWrapper(viewInflate));
        xdl0.m208345M0(viewInflate, false);
        this.f36360D.m223761N(new C8895b(viewInflate));
        this.f36361E.addOnScrollListener(new C8896c());
        m55749r5();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m55746m5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m5 */
    public View m55746m5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oya.m166628b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p5 */
    public void m55747p5() {
        this.pageHelper.m109041q(pageId());
        this.pageHelper.m109035k();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_state_explore";
    }

    /* JADX INFO: renamed from: q5 */
    public String m55748q5(BubbleInfo bubbleInfo) {
        String str = bubbleInfo.value;
        if (!TextUtils.isEmpty(str) || !NullChecker.m81303a(bubbleInfo.emotion)) {
            return str;
        }
        String str2 = bubbleInfo.emotion.text;
        if (!CoreModule.m29934N().mo60316Sd().contains(str2)) {
            return str2;
        }
        return "找人一起" + str2;
    }

    /* JADX INFO: renamed from: r5 */
    public final void m55749r5() {
        this.f36376T = getArguments() != null ? (BubbleInfo) getArguments().getSerializable("bubbleInfo") : null;
        duringCreated(CoreModule.f17545c.f19676q1.m33273u3()).subscribe(mkd0.m154956H(new e30() { // from class: l.yxa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200586a.m55731A5((Envelope) obj);
            }
        }, new e30() { // from class: l.zxa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205393a.m55732B5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s5 */
    public final List<SquareDataWrapper> m55750s5() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f36378V; i++) {
            arrayList.add(this.f36367K.poll());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t5 */
    public int m55751t5() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_post_status_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                int i = new JSONObject(strM79302F).getInt("insertCount");
                this.f36379W = i;
                if (i == 0) {
                    this.f36379W = 3;
                }
            }
        } catch (Exception unused) {
        }
        return this.f36379W;
    }

    /* JADX INFO: renamed from: u5 */
    public int m55752u5() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_post_status_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return 4;
            }
            return new JSONObject(strM79302F).getInt("stateSquareLimit");
        } catch (Exception unused) {
            return 4;
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final VProgressBar m55753v5(LinearLayout linearLayout) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof VProgressBar) {
                return (VProgressBar) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w5 */
    public VText m55754w5(LinearLayout linearLayout) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof VText) {
                return (VText) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x5 */
    public final List<SquareDataWrapper> m55755x5(Envelope envelope, List<BubbleInfo> list) {
        this.f36366J = envelope.pagination.links.next;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SquareDataWrapper squareDataWrapper = new SquareDataWrapper();
            BubbleInfo bubbleInfo = list.get(i);
            bubbleInfo.value = m55748q5(bubbleInfo);
            Bubbles bubbles = new Bubbles();
            bubbles.userID = bubbleInfo.owner.f38803id;
            User userById = CoreModule.m29934N().getUserById(bubbleInfo.owner.f38803id);
            bubbles.photoURL = userById == null ? "" : userById.m60124fp().profileSmall().formatted();
            squareDataWrapper.f32661f = bubbles;
            squareDataWrapper.f102323a = bubbleInfo;
            arrayList.add(squareDataWrapper);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y5 */
    public void m55756y5() {
        duringCreated(CoreModule.m29934N().mo60354gk(this.f36366J)).subscribe(mkd0.m154956H(new e30() { // from class: l.aya
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72263a.m55733C5((Envelope) obj);
            }
        }, new e30() { // from class: l.bya
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77894a.m55734D5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z5 */
    public final void m55757z5(final List<SquareDataWrapper> list, final e30<List<SquareDataWrapper>> e30Var) {
        int i;
        if (vwb.m200296J(list)) {
            e30Var.call(new ArrayList<>());
            return;
        }
        int size = list.size();
        int i2 = this.f36379W;
        if (((size - (i2 - this.f36373Q)) / i2) + 1 > this.f36368L.size() && this.f36374R) {
            duringCreated(CoreModule.f17545c.f19676q1.m33273u3()).subscribe(mkd0.m154956H(new e30() { // from class: l.cya
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f82942a.m55739L5(list, e30Var, (Envelope) obj);
                }
            }, new e30() { // from class: l.dya
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f88357a.m55740M5(list, e30Var, (Throwable) obj);
                }
            }));
            return;
        }
        List<SquareDataWrapper> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (true) {
            int size2 = list.size();
            i = this.f36375S;
            if (i3 >= size2) {
                break;
            }
            this.f36375S = i + 1;
            arrayList2.add(list.get(i3));
            if (arrayList2.size() == this.f36379W - this.f36373Q) {
                if (this.f36368L.size() > 0) {
                    int iNextInt = new Random().nextInt(this.f36379W);
                    if (iNextInt == 0) {
                        iNextInt = 1;
                    }
                    if (this.f36373Q != 0) {
                        iNextInt = 0;
                    }
                    arrayList2.add(iNextInt, this.f36368L.poll());
                }
                arrayList.addAll(arrayList2);
                arrayList2.clear();
                this.f36373Q = 0;
                this.f36375S = 0;
            }
            i3++;
        }
        this.f36373Q = i;
        if (arrayList2.size() != 0) {
            arrayList.addAll(arrayList2);
        }
        e30Var.call(arrayList);
    }
}
