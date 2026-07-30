package com.p000p1.mobile.putong.core.newui.messages.compliment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengWengHeaderView;
import com.p000p1.mobile.putong.core.newui.messages.compliment.WhisperListFrag;
import com.p000p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ConvAdditionalSwiper;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import l.cdq0;
import l.e30;
import l.e51;
import l.f6c0;
import l.j760;
import l.mkd0;
import l.roj0;
import l.u4c0;
import l.u59;
import l.v9j;
import l.vwb;
import l.xdl0;
import l.xp5;
import l.zvf0;
import p009l.awp;
import p009l.h5q0;
import p009l.mqi0;
import p009l.q860;
import v.VList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WhisperListFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VList f4538A;

    /* JADX INFO: renamed from: B */
    public View f4539B;

    /* JADX INFO: renamed from: C */
    public BoostViewContainer f4540C;

    /* JADX INFO: renamed from: D */
    public SceneView f4541D;

    /* JADX INFO: renamed from: E */
    public View f4542E;

    /* JADX INFO: renamed from: F */
    public h5q0 f4543F;

    /* JADX INFO: renamed from: G */
    public List<Conversation> f4544G;

    /* JADX INFO: renamed from: H */
    public boolean f4545H;

    /* JADX INFO: renamed from: I */
    public boolean f4546I;

    /* JADX INFO: renamed from: J */
    public boolean f4547J;

    /* JADX INFO: renamed from: K */
    public long f4548K;

    /* JADX INFO: renamed from: L */
    public awp f4549L;

    /* JADX INFO: renamed from: z */
    public PullQuickChatLayout f4550z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.compliment.WhisperListFrag$a */
    public class C0340a implements AbsListView.OnScrollListener {
        public C0340a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (!WhisperListFrag.this.f4546I || WhisperListFrag.this.f4547J || xp5.l() || i3 <= 10 || i + i2 <= 10) {
                return;
            }
            WhisperListFrag.this.m6504j5();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            WhisperListFrag.this.f4546I = i == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m6476E4(c cVar) {
        if (cVar == c.i) {
            this.f4549L.m11677c();
        }
        if (cVar == c.l) {
            this.f4549L.m11676b();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ String m6478N4() {
        return "p_whisper_tab,e_boost_button,click";
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m6486V4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m6490Z4(Throwable th) {
    }

    /* JADX INFO: renamed from: i5 */
    public static WhisperListFrag m6498i5() {
        return new WhisperListFrag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m6499p5(View view) {
        zvf0.r("e_whisper_unlock_btn_click", "p_messages_view");
        m6515v5();
    }

    /* JADX INFO: renamed from: d4 */
    public void m6500d4() {
        super.d4();
        this.f4549L = new awp(this);
    }

    /* JADX INFO: renamed from: f4 */
    public void m6501f4() {
        super.f4();
        lifecycle().subscribe(mkd0.H(new e30() { // from class: l.i5q0
            public final void call(Object obj) {
                this.f14403a.m6476E4((c) obj);
            }
        }, new e30() { // from class: l.q5q0
            public final void call(Object obj) {
                WhisperListFrag.m6490Z4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m6502g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        h5q0 h5q0Var = new h5q0(getContext());
        this.f4543F = h5q0Var;
        this.f4538A.setAdapter(h5q0Var);
        m6505k5();
        BoostViewContainer boostViewContainer = this.f4540C;
        if (boostViewContainer != null) {
            boostViewContainer.setFromCallback(new v9j() { // from class: l.r5q0
                public final Object call() {
                    return WhisperListFrag.m6478N4();
                }
            });
            SceneView sceneView = this.f4541D;
            if (sceneView != null) {
                this.f4540C.setSceneView(sceneView);
            }
        }
        View view = this.f4542E;
        if (view != null) {
            xdl0.E0(view, new View.OnClickListener() { // from class: l.s5q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f20097a.m6499p5(view2);
                }
            });
        }
        m6518y5();
        duringCreated(CoreModule.c.C0.x3()).subscribe(mkd0.H(new e30() { // from class: l.t5q0
            public final void call(Object obj) {
                this.f20565a.m6510q5((List) obj);
            }
        }, new e30() { // from class: l.u5q0
            public final void call(Object obj) {
                CrashHelper.c((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.f0.rh()).subscribe(mkd0.H(new e30() { // from class: l.v5q0
            public final void call(Object obj) {
                this.f21463a.m6511r5((q860) obj);
            }
        }, new e30() { // from class: l.w5q0
            public final void call(Object obj) {
                CrashHelper.c((Throwable) obj);
            }
        }));
        m6516w5(false);
        this.f4538A.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.x5q0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                this.f22444a.m6512s5(adapterView, view2, i, j);
            }
        });
        this.f4538A.setOnScrollListener(new C0340a());
    }

    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return getActivity();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Uc, viewGroup, false);
        this.f4550z = (PullQuickChatLayout) viewInflate.findViewById(u4c0.Jf);
        this.f4538A = viewInflate.findViewById(u4c0.Ff);
        this.f4539B = viewInflate.findViewById(u4c0.B3);
        this.f4540C = (BoostViewContainer) viewInflate.findViewById(u4c0.Bf);
        this.f4541D = viewInflate.findViewById(u4c0.Cf);
        this.f4542E = viewInflate.findViewById(u4c0.z0);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(u4c0.s6);
        if (frameLayout != null) {
            this.f4549L.m11675a(frameLayout);
        }
        return viewInflate;
    }

    /* JADX INFO: renamed from: j5 */
    public final void m6504j5() {
        this.f4547J = true;
        this.f4538A.post(new Runnable() { // from class: l.n5q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17226a.m6506l5();
            }
        });
        final NewMainAct newMainActAct = act();
        if (newMainActAct == null) {
            return;
        }
        CoreModule.P().a().Lf(newMainActAct, "p_messages_view,e_whisper_lock_cell_click,click", Privilege.premium_compliment, (e30) null, new e30() { // from class: l.o5q0
            public final void call(Object obj) {
                this.f17841a.m6507m5(newMainActAct, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public final void m6505k5() {
        if (this.f4550z == null || act() == null || !u59.E()) {
            return;
        }
        WengWengHeaderView wengWengHeaderView = new WengWengHeaderView(act());
        this.f4550z.addView(wengWengHeaderView, 0, new FrameLayout.LayoutParams(-1, 0));
        wengWengHeaderView.setAct(act());
        wengWengHeaderView.m6386t();
        this.f4550z.setHeadView(wengWengHeaderView);
        wengWengHeaderView.setChangeHeightListrener(new e30() { // from class: l.k5q0
            public final void call(Object obj) {
                this.f15418a.m6508n5((Integer) obj);
            }
        });
        this.f4550z.setCanPullChecker(new Function0() { // from class: l.l5q0
            public final Object invoke() {
                return this.f15955a.m6509o5();
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m6506l5() {
        this.f4538A.smoothScrollToPosition(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m6507m5(NewMainAct newMainAct, Boolean bool) {
        e51.F(newMainAct, new Runnable() { // from class: l.p5q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18399a.m6517x5();
            }
        });
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m6508n5(Integer num) {
        this.f4538A.setTranslationY(num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ Boolean m6509o5() {
        boolean z;
        if (this.f4538A.getCount() != 0) {
            z = false;
            if (this.f4538A.getFirstVisiblePosition() == 0 && this.f4538A.getChildCount() > 0 && this.f4538A.getChildAt(0).getTop() >= this.f4538A.getPaddingTop()) {
                z = true;
            }
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public String pageId() {
        return "p_messages_view";
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m6510q5(List list) {
        m6518y5();
        this.f4543F.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m6511r5(q860 q860Var) {
        List<Conversation> arrayList;
        if (q860Var == null || (arrayList = q860Var.f19068a) == null) {
            arrayList = new ArrayList();
        }
        this.f4544G = new ArrayList();
        for (Conversation conversation : arrayList) {
            if (conversation.localEverHasMessage || conversation.userMessageCount > 0) {
                this.f4544G.add(conversation);
            }
        }
        this.f4543F.m15415k(this.f4544G);
        m6519z5();
        m6518y5();
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m6512s5(AdapterView adapterView, View view, int i, long j) {
        ConvAdditionalSwiper convAdditionalSwiper;
        ConvAdditionalSwiper convAdditionalSwiper2;
        Conversation item = this.f4543F.getItem(i);
        if (item == null) {
            return;
        }
        ConversationAdditional conversationAdditional = item.additional;
        boolean z = (conversationAdditional == null || (convAdditionalSwiper2 = conversationAdditional.swiper) == null || !convAdditionalSwiper2.isFake) ? false : true;
        String str = (conversationAdditional == null || (convAdditionalSwiper = conversationAdditional.swiper) == null) ? null : convAdditionalSwiper.source;
        j760 j760VarY = vwb.Y("is_fake", Boolean.valueOf(z));
        if (str == null) {
            str = "";
        }
        zvf0.u("e_whisper_lock_cell_click", "p_messages_view", new j760[]{j760VarY, vwb.Y("source", str)});
        if (xp5.l()) {
            m6513t5(item);
        } else {
            m6515v5();
        }
    }

    /* JADX INFO: renamed from: t5 */
    public final void m6513t5(Conversation conversation) {
        cdq0 cdq0VarAct = act();
        if (conversation == null || TextUtils.isEmpty(conversation.otherUser) || cdq0VarAct == null || CoreModule.c.e0.Pa(conversation.otherUser) == null) {
            return;
        }
        cdq0VarAct.startActivity(MessagesAct.i2(cdq0VarAct, conversation.otherUser, true, false));
    }

    /* JADX INFO: renamed from: u5 */
    public void m6514u5() {
        e51.y(new Runnable() { // from class: l.m5q0
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.f0.Ke();
            }
        });
        if (getView() == null) {
            return;
        }
        awp awpVar = this.f4549L;
        if (awpVar != null) {
            awpVar.m11677c();
        }
        m6516w5(false);
        this.f4545H = false;
        m6519z5();
    }

    /* JADX INFO: renamed from: v5 */
    public final void m6515v5() {
        NewMainAct newMainActAct = act();
        if (newMainActAct == null) {
            return;
        }
        CoreModule.P().a().pr(newMainActAct, "p_messages_view,e_whisper_lock_cell_click,click", Privilege.premium_compliment);
    }

    /* JADX INFO: renamed from: w5 */
    public final void m6516w5(boolean z) {
        long jM18550o = mqi0.m18550o();
        if (z || jM18550o - this.f4548K >= 5000) {
            this.f4548K = jM18550o;
            duringCreated(CoreModule.c.f0.Fo()).subscribe(mkd0.H(new e30() { // from class: l.y5q0
                public final void call(Object obj) {
                    WhisperListFrag.m6486V4((roj0) obj);
                }
            }, new e30() { // from class: l.j5q0
                public final void call(Object obj) {
                    CrashHelper.c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x5 */
    public final void m6517x5() {
        this.f4547J = false;
        this.f4538A.smoothScrollToPosition(0);
    }

    /* JADX INFO: renamed from: y5 */
    public final void m6518y5() {
        boolean zL = xp5.l();
        xdl0.M(this.f4540C, zL || vwb.J(this.f4544G));
        xdl0.M(this.f4542E, (zL || vwb.J(this.f4544G)) ? false : true);
    }

    /* JADX INFO: renamed from: z5 */
    public final void m6519z5() {
        boolean zJ = vwb.J(this.f4544G);
        xdl0.M(this.f4539B, zJ);
        xdl0.M(this.f4538A, !zJ);
        if (zJ && !this.f4545H) {
            zvf0.x("e_whisper_blank_text_show", "p_messages_view");
            this.f4545H = true;
        } else {
            if (zJ) {
                return;
            }
            this.f4545H = false;
        }
    }
}
