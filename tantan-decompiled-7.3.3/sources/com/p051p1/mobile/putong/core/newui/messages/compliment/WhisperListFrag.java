package com.p051p1.mobile.putong.core.newui.messages.compliment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ConvAdditionalSwiper;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengWengHeaderView;
import com.p051p1.mobile.putong.core.newui.messages.compliment.WhisperListFrag;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p151v.VList;
import p153l.adc0;
import p153l.ayp;
import p153l.bnl0;
import p153l.br5;
import p153l.d79;
import p153l.i4g0;
import p153l.jyb;
import p153l.kec0;
import p153l.l51;
import p153l.leq0;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.uxj0;
import p153l.vg60;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class WhisperListFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VList f26502A;

    /* JADX INFO: renamed from: B */
    public View f26503B;

    /* JADX INFO: renamed from: C */
    public BoostViewContainer f26504C;

    /* JADX INFO: renamed from: D */
    public SceneView f26505D;

    /* JADX INFO: renamed from: E */
    public View f26506E;

    /* JADX INFO: renamed from: F */
    public leq0 f26507F;

    /* JADX INFO: renamed from: G */
    public List<Conversation> f26508G;

    /* JADX INFO: renamed from: H */
    public boolean f26509H;

    /* JADX INFO: renamed from: I */
    public boolean f26510I;

    /* JADX INFO: renamed from: J */
    public boolean f26511J;

    /* JADX INFO: renamed from: K */
    public long f26512K;

    /* JADX INFO: renamed from: L */
    public ayp f26513L;

    /* JADX INFO: renamed from: z */
    public PullQuickChatLayout f26514z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.compliment.WhisperListFrag$a */
    public class C8327a implements AbsListView.OnScrollListener {
        public C8327a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (!WhisperListFrag.this.f26510I || WhisperListFrag.this.f26511J || br5.m106041l() || i3 <= 10 || i + i2 <= 10) {
                return;
            }
            WhisperListFrag.this.m43360j5();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            WhisperListFrag.this.f26510I = i == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m43335E4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f26513L.m100914c();
        }
        if (c4470c == C4470c.f16270l) {
            this.f26513L.m100913b();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ String m43337N4() {
        return "p_whisper_tab,e_boost_button,click";
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m43345V4(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m43349Z4(Throwable th) {
    }

    /* JADX INFO: renamed from: i5 */
    public static WhisperListFrag m43357i5() {
        return new WhisperListFrag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m43358p5(View view) {
        i4g0.m138520r("e_whisper_unlock_btn_click", OMSDialogPositon.p_messages_view);
        m43371v5();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f26513L = new ayp(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        lifecycle().subscribe(psd0.m173597H(new y20() { // from class: l.meq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136557a.m43335E4((C4470c) obj);
            }
        }, new y20() { // from class: l.ueq0
            @Override // p153l.y20
            public final void call(Object obj) {
                WhisperListFrag.m43349Z4((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        leq0 leq0Var = new leq0(getContext());
        this.f26507F = leq0Var;
        this.f26502A.setAdapter((ListAdapter) leq0Var);
        m43361k5();
        BoostViewContainer boostViewContainer = this.f26504C;
        if (boostViewContainer != null) {
            boostViewContainer.setFromCallback(new pcj() { // from class: l.veq0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return WhisperListFrag.m43337N4();
                }
            });
            SceneView sceneView = this.f26505D;
            if (sceneView != null) {
                this.f26504C.setSceneView(sceneView);
            }
        }
        View view = this.f26506E;
        if (view != null) {
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.weq0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f188719a.m43358p5(view2);
                }
            });
        }
        m43374y5();
        duringCreated(CoreModule.f18264c.f20297C0.m146427y3()).subscribe(psd0.m173597H(new y20() { // from class: l.xeq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193975a.m43366q5((List) obj);
            }
        }, new y20() { // from class: l.yeq0
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20384f0.m34109rh()).subscribe(psd0.m173597H(new y20() { // from class: l.zeq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204042a.m43367r5((vg60) obj);
            }
        }, new y20() { // from class: l.afq0
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c((Throwable) obj);
            }
        }));
        m43372w5(false);
        this.f26502A.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.bfq0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                this.f76531a.m43368s5(adapterView, view2, i, j);
            }
        });
        this.f26502A.setOnScrollListener(new C8327a());
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) getActivity();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125767bd, viewGroup, false);
        this.f26514z = (PullQuickChatLayout) viewInflate.findViewById(adc0.f70024Mf);
        this.f26502A = (VList) viewInflate.findViewById(adc0.f69956If);
        this.f26503B = viewInflate.findViewById(adc0.f69859D3);
        this.f26504C = (BoostViewContainer) viewInflate.findViewById(adc0.f69888Ef);
        this.f26505D = (SceneView) viewInflate.findViewById(adc0.f69905Ff);
        this.f26506E = viewInflate.findViewById(adc0.f70667z0);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(adc0.f70588u6);
        if (frameLayout != null) {
            this.f26513L.m100912a(frameLayout);
        }
        return viewInflate;
    }

    /* JADX INFO: renamed from: j5 */
    public final void m43360j5() {
        this.f26511J = true;
        this.f26502A.post(new Runnable() { // from class: l.req0
            @Override // java.lang.Runnable
            public final void run() {
                this.f162667a.m43362l5();
            }
        });
        final NewMainAct newMainActAct = act();
        if (newMainActAct == null) {
            return;
        }
        CoreModule.m30933P().m143405a().mo34365Lf(newMainActAct, "p_messages_view,e_whisper_lock_cell_click,click", Privilege.premium_compliment, null, new y20() { // from class: l.seq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167638a.m43363m5(newMainActAct, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public final void m43361k5() {
        if (this.f26514z == null || act() == null || !d79.m114647F()) {
            return;
        }
        WengWengHeaderView wengWengHeaderView = new WengWengHeaderView(act());
        this.f26514z.addView(wengWengHeaderView, 0, new FrameLayout.LayoutParams(-1, 0));
        wengWengHeaderView.setAct(act());
        wengWengHeaderView.m43248t();
        this.f26514z.setHeadView(wengWengHeaderView);
        wengWengHeaderView.setChangeHeightListrener(new y20() { // from class: l.oeq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147010a.m43364n5((Integer) obj);
            }
        });
        this.f26514z.setCanPullChecker(new Function0() { // from class: l.peq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f152118a.m43365o5();
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m43362l5() {
        this.f26502A.smoothScrollToPosition(0);
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m43363m5(NewMainAct newMainAct, Boolean bool) {
        l51.m152886F(newMainAct, new Runnable() { // from class: l.teq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f173891a.m43373x5();
            }
        });
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m43364n5(Integer num) {
        this.f26502A.setTranslationY(num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ Boolean m43365o5() {
        boolean z;
        if (this.f26502A.getCount() != 0) {
            z = false;
            if (this.f26502A.getFirstVisiblePosition() == 0 && this.f26502A.getChildCount() > 0 && this.f26502A.getChildAt(0).getTop() >= this.f26502A.getPaddingTop()) {
                z = true;
            }
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return OMSDialogPositon.p_messages_view;
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m43366q5(List list) {
        m43374y5();
        this.f26507F.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m43367r5(vg60 vg60Var) {
        List<Conversation> arrayList;
        if (vg60Var == null || (arrayList = vg60Var.f184001a) == null) {
            arrayList = new ArrayList();
        }
        this.f26508G = new ArrayList();
        for (Conversation conversation : arrayList) {
            if (conversation.localEverHasMessage || conversation.userMessageCount > 0) {
                this.f26508G.add(conversation);
            }
        }
        this.f26507F.m153934k(this.f26508G);
        m43375z5();
        m43374y5();
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m43368s5(AdapterView adapterView, View view, int i, long j) {
        ConvAdditionalSwiper convAdditionalSwiper;
        ConvAdditionalSwiper convAdditionalSwiper2;
        Conversation item = this.f26507F.getItem(i);
        if (item == null) {
            return;
        }
        ConversationAdditional conversationAdditional = item.additional;
        boolean z = (conversationAdditional == null || (convAdditionalSwiper2 = conversationAdditional.swiper) == null || !convAdditionalSwiper2.isFake) ? false : true;
        String str = (conversationAdditional == null || (convAdditionalSwiper = conversationAdditional.swiper) == null) ? null : convAdditionalSwiper.source;
        pf60 pf60VarM147494Y = jyb.m147494Y("is_fake", Boolean.valueOf(z));
        if (str == null) {
            str = "";
        }
        i4g0.m138523u("e_whisper_lock_cell_click", OMSDialogPositon.p_messages_view, pf60VarM147494Y, jyb.m147494Y("source", str));
        if (br5.m106041l()) {
            m43369t5(item);
        } else {
            m43371v5();
        }
    }

    /* JADX INFO: renamed from: t5 */
    public final void m43369t5(Conversation conversation) {
        NewMainAct newMainActAct = act();
        if (conversation == null || TextUtils.isEmpty(conversation.otherUser) || newMainActAct == null || CoreModule.f18264c.f20381e0.m116503Pa(conversation.otherUser) == null) {
            return;
        }
        newMainActAct.startActivity(MessagesAct.m50126k2(newMainActAct, conversation.otherUser, true, false));
    }

    /* JADX INFO: renamed from: u5 */
    public void m43370u5() {
        l51.m152919y(new Runnable() { // from class: l.qeq0
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20384f0.m33704Ke();
            }
        });
        if (getView() == null) {
            return;
        }
        ayp aypVar = this.f26513L;
        if (aypVar != null) {
            aypVar.m100914c();
        }
        m43372w5(false);
        this.f26509H = false;
        m43375z5();
    }

    /* JADX INFO: renamed from: v5 */
    public final void m43371v5() {
        NewMainAct newMainActAct = act();
        if (newMainActAct == null) {
            return;
        }
        CoreModule.m30933P().m143405a().mo34568pr(newMainActAct, "p_messages_view,e_whisper_lock_cell_click,click", Privilege.premium_compliment);
    }

    /* JADX INFO: renamed from: w5 */
    public final void m43372w5(boolean z) {
        long jM174454o = pzi0.m174454o();
        if (z || jM174454o - this.f26512K >= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            this.f26512K = jM174454o;
            duringCreated(CoreModule.f18264c.f20384f0.m33653Fo()).subscribe(psd0.m173597H(new y20() { // from class: l.cfq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    WhisperListFrag.m43345V4((uxj0) obj);
                }
            }, new y20() { // from class: l.neq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    CrashHelper.m82479c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x5 */
    public final void m43373x5() {
        this.f26511J = false;
        this.f26502A.smoothScrollToPosition(0);
    }

    /* JADX INFO: renamed from: y5 */
    public final void m43374y5() {
        boolean zM106041l = br5.m106041l();
        bnl0.m105524M(this.f26504C, zM106041l || jyb.m147479J(this.f26508G));
        bnl0.m105524M(this.f26506E, (zM106041l || jyb.m147479J(this.f26508G)) ? false : true);
    }

    /* JADX INFO: renamed from: z5 */
    public final void m43375z5() {
        boolean zM147479J = jyb.m147479J(this.f26508G);
        bnl0.m105524M(this.f26503B, zM147479J);
        bnl0.m105524M(this.f26502A, !zM147479J);
        if (zM147479J && !this.f26509H) {
            i4g0.m138526x("e_whisper_blank_text_show", OMSDialogPositon.p_messages_view);
            this.f26509H = true;
        } else {
            if (zM147479J) {
                return;
            }
            this.f26509H = false;
        }
    }
}
