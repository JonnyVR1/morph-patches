package com.p046p1.mobile.putong.core.newui.messages.compliment;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ConvAdditionalSwiper;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationAdditional;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengWengHeaderView;
import com.p046p1.mobile.putong.core.newui.messages.compliment.WhisperListFrag;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p147v.VList;
import p149l.awp;
import p149l.e30;
import p149l.e51;
import p149l.f6c0;
import p149l.h5q0;
import p149l.j760;
import p149l.mkd0;
import p149l.mqi0;
import p149l.q860;
import p149l.roj0;
import p149l.u4c0;
import p149l.u59;
import p149l.v9j;
import p149l.vwb;
import p149l.xdl0;
import p149l.xp5;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class WhisperListFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VList f25760A;

    /* JADX INFO: renamed from: B */
    public View f25761B;

    /* JADX INFO: renamed from: C */
    public BoostViewContainer f25762C;

    /* JADX INFO: renamed from: D */
    public SceneView f25763D;

    /* JADX INFO: renamed from: E */
    public View f25764E;

    /* JADX INFO: renamed from: F */
    public h5q0 f25765F;

    /* JADX INFO: renamed from: G */
    public List<Conversation> f25766G;

    /* JADX INFO: renamed from: H */
    public boolean f25767H;

    /* JADX INFO: renamed from: I */
    public boolean f25768I;

    /* JADX INFO: renamed from: J */
    public boolean f25769J;

    /* JADX INFO: renamed from: K */
    public long f25770K;

    /* JADX INFO: renamed from: L */
    public awp f25771L;

    /* JADX INFO: renamed from: z */
    public PullQuickChatLayout f25772z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.compliment.WhisperListFrag$a */
    public class C8176a implements AbsListView.OnScrollListener {
        public C8176a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (!WhisperListFrag.this.f25768I || WhisperListFrag.this.f25769J || xp5.m210472l() || i3 <= 10 || i + i2 <= 10) {
                return;
            }
            WhisperListFrag.this.m42349j5();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            WhisperListFrag.this.f25768I = i == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m42324E4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f25771L.m99298c();
        }
        if (c4319c == C4319c.f15551l) {
            this.f25771L.m99297b();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ String m42326N4() {
        return "p_whisper_tab,e_boost_button,click";
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m42334V4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m42338Z4(Throwable th) {
    }

    /* JADX INFO: renamed from: i5 */
    public static WhisperListFrag m42346i5() {
        return new WhisperListFrag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m42347p5(View view) {
        zvf0.m220396r("e_whisper_unlock_btn_click", OMSDialogPositon.p_messages_view);
        m42360v5();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f25771L = new awp(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        lifecycle().subscribe(mkd0.m154956H(new e30() { // from class: l.i5q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111630a.m42324E4((C4319c) obj);
            }
        }, new e30() { // from class: l.q5q0
            @Override // p149l.e30
            public final void call(Object obj) {
                WhisperListFrag.m42338Z4((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        h5q0 h5q0Var = new h5q0(getContext());
        this.f25765F = h5q0Var;
        this.f25760A.setAdapter((ListAdapter) h5q0Var);
        m42350k5();
        BoostViewContainer boostViewContainer = this.f25762C;
        if (boostViewContainer != null) {
            boostViewContainer.setFromCallback(new v9j() { // from class: l.r5q0
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return WhisperListFrag.m42326N4();
                }
            });
            SceneView sceneView = this.f25763D;
            if (sceneView != null) {
                this.f25762C.setSceneView(sceneView);
            }
        }
        View view = this.f25764E;
        if (view != null) {
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.s5q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f162580a.m42347p5(view2);
                }
            });
        }
        m42363y5();
        duringCreated(CoreModule.f17545c.f19555C0.m210114x3()).subscribe(mkd0.m154956H(new e30() { // from class: l.t5q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167845a.m42355q5((List) obj);
            }
        }, new e30() { // from class: l.u5q0
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19642f0.m33106rh()).subscribe(mkd0.m154956H(new e30() { // from class: l.v5q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180105a.m42356r5((q860) obj);
            }
        }, new e30() { // from class: l.w5q0
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c((Throwable) obj);
            }
        }));
        m42361w5(false);
        this.f25760A.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.x5q0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                this.f191180a.m42357s5(adapterView, view2, i, j);
            }
        });
        this.f25760A.setOnScrollListener(new C8176a());
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) getActivity();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95599Uc, viewGroup, false);
        this.f25772z = (PullQuickChatLayout) viewInflate.findViewById(u4c0.f173885Jf);
        this.f25760A = (VList) viewInflate.findViewById(u4c0.f173817Ff);
        this.f25761B = viewInflate.findViewById(u4c0.f173737B3);
        this.f25762C = (BoostViewContainer) viewInflate.findViewById(u4c0.f173749Bf);
        this.f25763D = (SceneView) viewInflate.findViewById(u4c0.f173766Cf);
        this.f25764E = viewInflate.findViewById(u4c0.f174576z0);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(u4c0.f174463s6);
        if (frameLayout != null) {
            this.f25771L.m99296a(frameLayout);
        }
        return viewInflate;
    }

    /* JADX INFO: renamed from: j5 */
    public final void m42349j5() {
        this.f25769J = true;
        this.f25760A.post(new Runnable() { // from class: l.n5q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f137229a.m42351l5();
            }
        });
        final NewMainAct newMainActAct = act();
        if (newMainActAct == null) {
            return;
        }
        CoreModule.m29935P().m94651a().mo33362Lf(newMainActAct, "p_messages_view,e_whisper_lock_cell_click,click", Privilege.premium_compliment, null, new e30() { // from class: l.o5q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141924a.m42352m5(newMainActAct, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public final void m42350k5() {
        if (this.f25772z == null || act() == null || !u59.m191796E()) {
            return;
        }
        WengWengHeaderView wengWengHeaderView = new WengWengHeaderView(act());
        this.f25772z.addView(wengWengHeaderView, 0, new FrameLayout.LayoutParams(-1, 0));
        wengWengHeaderView.setAct(act());
        wengWengHeaderView.m42237t();
        this.f25772z.setHeadView(wengWengHeaderView);
        wengWengHeaderView.setChangeHeightListrener(new e30() { // from class: l.k5q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121220a.m42353n5((Integer) obj);
            }
        });
        this.f25772z.setCanPullChecker(new Function0() { // from class: l.l5q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f126195a.m42354o5();
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m42351l5() {
        this.f25760A.smoothScrollToPosition(0);
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m42352m5(NewMainAct newMainAct, Boolean bool) {
        e51.m114741F(newMainAct, new Runnable() { // from class: l.p5q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147319a.m42362x5();
            }
        });
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m42353n5(Integer num) {
        this.f25760A.setTranslationY(num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ Boolean m42354o5() {
        boolean z;
        if (this.f25760A.getCount() != 0) {
            z = false;
            if (this.f25760A.getFirstVisiblePosition() == 0 && this.f25760A.getChildCount() > 0 && this.f25760A.getChildAt(0).getTop() >= this.f25760A.getPaddingTop()) {
                z = true;
            }
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return OMSDialogPositon.p_messages_view;
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m42355q5(List list) {
        m42363y5();
        this.f25765F.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m42356r5(q860 q860Var) {
        List<Conversation> arrayList;
        if (q860Var == null || (arrayList = q860Var.f153135a) == null) {
            arrayList = new ArrayList();
        }
        this.f25766G = new ArrayList();
        for (Conversation conversation : arrayList) {
            if (conversation.localEverHasMessage || conversation.userMessageCount > 0) {
                this.f25766G.add(conversation);
            }
        }
        this.f25765F.m129452k(this.f25766G);
        m42364z5();
        m42363y5();
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m42357s5(AdapterView adapterView, View view, int i, long j) {
        ConvAdditionalSwiper convAdditionalSwiper;
        ConvAdditionalSwiper convAdditionalSwiper2;
        Conversation item = this.f25765F.getItem(i);
        if (item == null) {
            return;
        }
        ConversationAdditional conversationAdditional = item.additional;
        boolean z = (conversationAdditional == null || (convAdditionalSwiper2 = conversationAdditional.swiper) == null || !convAdditionalSwiper2.isFake) ? false : true;
        String str = (conversationAdditional == null || (convAdditionalSwiper = conversationAdditional.swiper) == null) ? null : convAdditionalSwiper.source;
        j760 j760VarM200311Y = vwb.m200311Y("is_fake", Boolean.valueOf(z));
        if (str == null) {
            str = "";
        }
        zvf0.m220399u("e_whisper_lock_cell_click", OMSDialogPositon.p_messages_view, j760VarM200311Y, vwb.m200311Y("source", str));
        if (xp5.m210472l()) {
            m42358t5(item);
        } else {
            m42360v5();
        }
    }

    /* JADX INFO: renamed from: t5 */
    public final void m42358t5(Conversation conversation) {
        NewMainAct newMainActAct = act();
        if (conversation == null || TextUtils.isEmpty(conversation.otherUser) || newMainActAct == null || CoreModule.f17545c.f19639e0.m169430Pa(conversation.otherUser) == null) {
            return;
        }
        newMainActAct.startActivity(MessagesAct.m48943i2(newMainActAct, conversation.otherUser, true, false));
    }

    /* JADX INFO: renamed from: u5 */
    public void m42359u5() {
        e51.m114774y(new Runnable() { // from class: l.m5q0
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19642f0.m32701Ke();
            }
        });
        if (getView() == null) {
            return;
        }
        awp awpVar = this.f25771L;
        if (awpVar != null) {
            awpVar.m99298c();
        }
        m42361w5(false);
        this.f25767H = false;
        m42364z5();
    }

    /* JADX INFO: renamed from: v5 */
    public final void m42360v5() {
        NewMainAct newMainActAct = act();
        if (newMainActAct == null) {
            return;
        }
        CoreModule.m29935P().m94651a().mo33565pr(newMainActAct, "p_messages_view,e_whisper_lock_cell_click,click", Privilege.premium_compliment);
    }

    /* JADX INFO: renamed from: w5 */
    public final void m42361w5(boolean z) {
        long jM155944o = mqi0.m155944o();
        if (z || jM155944o - this.f25770K >= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            this.f25770K = jM155944o;
            duringCreated(CoreModule.f17545c.f19642f0.m32650Fo()).subscribe(mkd0.m154956H(new e30() { // from class: l.y5q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    WhisperListFrag.m42334V4((roj0) obj);
                }
            }, new e30() { // from class: l.j5q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    CrashHelper.m81296c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x5 */
    public final void m42362x5() {
        this.f25769J = false;
        this.f25760A.smoothScrollToPosition(0);
    }

    /* JADX INFO: renamed from: y5 */
    public final void m42363y5() {
        boolean zM210472l = xp5.m210472l();
        xdl0.m208344M(this.f25762C, zM210472l || vwb.m200296J(this.f25766G));
        xdl0.m208344M(this.f25764E, (zM210472l || vwb.m200296J(this.f25766G)) ? false : true);
    }

    /* JADX INFO: renamed from: z5 */
    public final void m42364z5() {
        boolean zM200296J = vwb.m200296J(this.f25766G);
        xdl0.m208344M(this.f25761B, zM200296J);
        xdl0.m208344M(this.f25760A, !zM200296J);
        if (zM200296J && !this.f25767H) {
            zvf0.m220402x("e_whisper_blank_text_show", OMSDialogPositon.p_messages_view);
            this.f25767H = true;
        } else {
            if (zM200296J) {
                return;
            }
            this.f25767H = false;
        }
    }
}
