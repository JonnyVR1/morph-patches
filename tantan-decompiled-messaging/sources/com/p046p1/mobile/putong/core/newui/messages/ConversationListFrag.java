package com.p046p1.mobile.putong.core.newui.messages;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConversationListFrag;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.ConversationCounter;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p149l.a8m;
import p149l.e30;
import p149l.e51;
import p149l.f6c0;
import p149l.ife;
import p149l.j760;
import p149l.lbm;
import p149l.mkd0;
import p149l.mqi0;
import p149l.pj90;
import p149l.q860;
import p149l.qko;
import p149l.roj0;
import p149l.t100;
import p149l.upa;
import p149l.ura;
import p149l.v930;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.wjc0;
import p149l.wn90;
import p149l.x9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.xma;
import p149l.yni;
import p149l.z9j;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationListFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public boolean f24968A;

    /* JADX INFO: renamed from: B */
    public boolean f24969B;

    /* JADX INFO: renamed from: E */
    public FrameLayout f24972E;

    /* JADX INFO: renamed from: F */
    public qko f24973F;

    /* JADX INFO: renamed from: G */
    public a8m f24974G;

    /* JADX INFO: renamed from: J */
    public Conversation f24977J;

    /* JADX INFO: renamed from: z */
    public ConversationsList f24980z;

    /* JADX INFO: renamed from: C */
    public boolean f24970C = false;

    /* JADX INFO: renamed from: D */
    public boolean f24971D = false;

    /* JADX INFO: renamed from: H */
    public int f24975H = -1;

    /* JADX INFO: renamed from: I */
    public int f24976I = -1;

    /* JADX INFO: renamed from: K */
    public boolean f24978K = true;

    /* JADX INFO: renamed from: L */
    public final Runnable f24979L = new RunnableC8120a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationListFrag$a */
    public class RunnableC8120a implements Runnable {
        public RunnableC8120a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int firstVisiblePosition = ConversationListFrag.this.f24980z.f25105V.getFirstVisiblePosition();
            if (upa.m194637G0() && firstVisiblePosition > 0) {
                firstVisiblePosition++;
            }
            ConversationListFrag.this.f24978K = !(firstVisiblePosition - ConversationListFrag.this.f24980z.f25105V.getHeaderViewsCount() == ConversationListFrag.this.f24976I);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m41071M4(q860 q860Var) {
        List<T> list;
        if (q860Var == null || (list = q860Var.f153135a) == 0 || list.size() == 0) {
            C4740g.f19836Y2 = "";
            return;
        }
        String str = ((Conversation) q860Var.f153135a.get(0)).f56011id;
        if (TextUtils.equals(str, C4740g.f19836Y2)) {
            return;
        }
        C4740g.f19836Y2 = str;
    }

    /* JADX INFO: renamed from: S4 */
    public static /* synthetic */ void m41077S4(Throwable th) {
    }

    /* JADX INFO: renamed from: T4 */
    public static /* synthetic */ void m41078T4(Throwable th) {
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m41080V4(Throwable th) {
    }

    /* JADX INFO: renamed from: i5 */
    public static ConversationListFrag m41092i5(boolean z) {
        ConversationListFrag conversationListFrag = new ConversationListFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isMatchList", z);
        conversationListFrag.setArguments(bundle);
        return conversationListFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n5 */
    public /* synthetic */ void m41093n5(List list) {
        if (vwb.m200296J(list) || v930.m197534h() != TabName.Msg) {
            return;
        }
        lbm lbmVar = new lbm(act());
        lbmVar.m149256U(list, "conversation");
        lbmVar.show();
        CoreModule.f17545c.f19680r2.f113519Z.m189988a(1);
        CoreModule.f17545c.f19680r2.f113518Y.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public /* synthetic */ void m41094o5() {
        this.f24980z.m41429E2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m41095p5(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f24973F.m175381c();
        }
        if (c4319c == C4319c.f15551l) {
            this.f24973F.m175380b();
        }
        if (!isHidden() && c4319c == C4319c.f15548i) {
            if (NullChecker.m81303a(null)) {
                throw null;
            }
            C4740g c4740g = CoreModule.f17545c.f19642f0;
            c4740g.f19892R.m143759e(c4740g.f19895S, true);
            if (upa.m194718Y1() && m41109y5()) {
                duringCreated(CoreModule.f17545c.f19680r2.m136526p3("message")).subscribe(mkd0.m154956H(new e30() { // from class: l.jf6
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f117636a.m41093n5((List) obj);
                    }
                }, new e30() { // from class: l.kf6
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ConversationListFrag.m41078T4((Throwable) obj);
                    }
                }));
            }
            if (upa.m194826u3() && NullChecker.m81303a(this.f24980z) && CoreModule.f17545c.f19639e0.f149414l1.get().longValue() >= 0 && !mqi0.m155928C(CoreModule.f17545c.f19639e0.f149414l1.get().longValue(), mqi0.m155944o())) {
                e51.m114744I(this, new Runnable() { // from class: l.lf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f127835a.m41094o5();
                    }
                }, 1000L);
            }
            if (CoreModule.m29936Q().mo67229M6().mo102418c()) {
                CoreModule.m29936Q().mo67229M6().mo102430o(act());
            }
        }
        if (CoreModule.m29934N().mo60365ko() && c4319c == C4319c.f15549j) {
            CoreModule.m29934N().mo60272Ea();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public /* synthetic */ void m41096q5(roj0 roj0Var) {
        if (isHidden() || this.f24969B || !CoreModule.m29934N().mo60401xa(OMSDialogPositon.p_messages_view) || !this.f24971D) {
            return;
        }
        CoreModule.m29934N().mo60343cj(act(), OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r5 */
    public /* synthetic */ void m41097r5(j760 j760Var) {
        if (isHidden() || this.f24969B || j760Var.f116564a != C4319c.f15548i || !CoreModule.m29934N().mo60401xa(OMSDialogPositon.p_messages_view)) {
            return;
        }
        xaj0 xaj0Var = (xaj0) j760Var.f116565b;
        Counter counter = (Counter) xaj0Var.f191751a;
        ConversationCounter conversationCounter = (ConversationCounter) xaj0Var.f191752b;
        int iM203413b = wjc0.m203413b(counter, conversationCounter, (Boolean) xaj0Var.f191753c) - ura.m195053e().m195057d().mo33677E7(conversationCounter.conversations);
        this.f24971D = true;
        if (iM203413b == 0) {
            CoreModule.m29934N().mo60343cj(act(), OMSDialogPositon.p_messages_view);
            this.f24971D = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public /* synthetic */ void m41098s5(Boolean bool) {
        if (bool.booleanValue()) {
            m41102l5(false);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: I4 */
    public void mo29637I4() {
        super.mo29637I4();
        m41105u5(0);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f24968A = getArguments().getBoolean("isMatchList", false);
        this.f24973F = new qko(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.bf6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75275a.m41095p5((C4319c) obj);
            }
        }));
        if (CoreModule.m29934N().mo60365ko() && CoreModule.m29934N().mo60401xa(OMSDialogPositon.p_messages_view)) {
            duringCreated(CoreModule.f17545c.f19642f0.f19909W1).subscribe(mkd0.m154956H(new e30() { // from class: l.rf6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159108a.m41096q5((roj0) obj);
                }
            }, new e30() { // from class: l.sf6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationListFrag.m41077S4((Throwable) obj);
                }
            }));
            duringCreated(mkd0.m154986t(lifecycle(), CoreModule.f17545c.m31483n3(), CoreModule.f17545c.f19642f0.m32773Qe(), ife.m135906o().f112985a.map(new w9j() { // from class: l.tf6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(ife.m135906o().m135908k(BannerLoc.get("conversation")));
                }
            }).distinctUntilChanged(), new z9j() { // from class: l.uf6
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return j760.m140076a((C4319c) obj, xaj0.m207578a((Counter) obj2, (ConversationCounter) obj3, (Boolean) obj4));
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.cf6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80538a.m41097r5((j760) obj);
                }
            }, new e30() { // from class: l.df6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationListFrag.m41080V4((Throwable) obj);
                }
            }));
        }
        if (CoreModule.m29935P().m94656g().mo35054d9() && !xma.m210047L3()) {
            duringCreated(C22306c.combineLatest(m29640L4(), v930.m197537k().distinctUntilChanged(), new x9j() { // from class: l.of6
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new j760((Boolean) obj, (TabName) obj2);
                }
            }).filter(new w9j() { // from class: l.ef6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    j760 j760Var = (j760) obj;
                    return Boolean.valueOf(((Boolean) j760Var.f116564a).booleanValue() && j760Var.f116565b == TabName.Msg);
                }
            }).switchMap(new w9j() { // from class: l.ff6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19642f0.m32880Ze();
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.mf6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationListFrag.m41071M4((q860) obj);
                }
            }, new e30() { // from class: l.nf6
                @Override // p149l.e30
                public final void call(Object obj) {
                    C4740g.f19836Y2 = "";
                }
            }));
        }
        if (CoreModule.m29935P().m94656g().mo35031Sj()) {
            duringCreated(C22306c.combineLatest(m29640L4(), v930.m197537k().distinctUntilChanged(), new x9j() { // from class: l.of6
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new j760((Boolean) obj, (TabName) obj2);
                }
            }).filter(new w9j() { // from class: l.pf6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    j760 j760Var = (j760) obj;
                    return Boolean.valueOf(((Boolean) j760Var.f116564a).booleanValue() && j760Var.f116565b == TabName.Msg);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.qf6
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.m29935P().m94656g().mo35062gr();
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        if (CoreModule.m29936Q().mo67215Ei(3)) {
            if (upa.m194686Q1()) {
                return;
            }
            duringCreated(new v9j() { // from class: l.gf6
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.m29936Q().mo67228Lh().mo95352f();
                }
            }, false).subscribe(mkd0.m154956H(new e30() { // from class: l.hf6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f107452a.m41098s5((Boolean) obj);
                }
            }, new e30() { // from class: l.if6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f112959a.m41104t5((Throwable) obj);
                }
            }));
        } else if (CoreModule.m29936Q().mo67255a().mo124836c() || CoreModule.m29936Q().mo67255a().mo124837d()) {
            m41102l5(true);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) getActivity();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LaunchStep launchStep = LaunchStep.MsgTabInflate;
        yni.m215417f(launchStep);
        this.f24972E = new FrameLayout(act());
        ConversationsList conversationsList = (ConversationsList) act().inflater().inflate(f6c0.f95816he, (ViewGroup) this.f24972E, false);
        this.f24980z = conversationsList;
        conversationsList.m41472p1(false);
        ConversationsList conversationsList2 = this.f24980z;
        conversationsList2.f25118g1 = this.f24968A;
        this.f24972E.addView(conversationsList2);
        yni.m215415d(launchStep);
        LaunchStep launchStep2 = LaunchStep.MsgTabDataInit;
        yni.m215417f(launchStep2);
        this.f24980z.m41478s1(this);
        yni.m215415d(launchStep2);
        return this.f24972E;
    }

    /* JADX INFO: renamed from: j5 */
    public qko m41100j5() {
        return this.f24973F;
    }

    /* JADX INFO: renamed from: k5 */
    public final void m41101k5() {
    }

    /* JADX INFO: renamed from: l5 */
    public final void m41102l5(boolean z) {
        this.f24974G = CoreModule.m29936Q().mo67228Lh();
        int i = xdl0.f192404f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.setMargins(0, 0, 0, z ? t100.f167264m : t100.f167259h);
        layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        a8m a8mVar = this.f24974G;
        if (z) {
            a8mVar.mo95355i(this, this.f24972E, layoutParams);
        } else {
            a8mVar.mo95351e(this, this.f24972E, layoutParams);
        }
    }

    /* JADX INFO: renamed from: m5 */
    public boolean m41103m5() {
        return this.f24968A;
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m41104t5(Throwable th) {
        m41101k5();
    }

    /* JADX INFO: renamed from: u5 */
    public void m41105u5(int i) {
        ConversationsList conversationsList;
        ConvCellList convCellList;
        if (!isVisible() || i < 0 || (conversationsList = this.f24980z) == null || (convCellList = conversationsList.f25105V) == null || convCellList.getVisibility() != 0) {
            return;
        }
        this.f24980z.f25105V.smoothScrollToPositionFromTop(i, i);
    }

    /* JADX INFO: renamed from: v5 */
    public void m41106v5() {
        if (NullChecker.m81303a(this.f24980z) && NullChecker.m81303a(this.f24980z.f25105V)) {
            ConvCellList convCellList = this.f24980z.f25105V;
            if (convCellList.getVisibility() == 0) {
                ConversationsList.C8130e conversationsAdapter = this.f24980z.getConversationsAdapter();
                this.f24975H = conversationsAdapter.m41502A();
                if (this.f24978K || (convCellList.getFirstVisiblePosition() == 0 && this.f24975H != 0)) {
                    this.f24976I = -1;
                    this.f24977J = null;
                }
                int iM41504C = conversationsAdapter.m41504C(this.f24977J);
                if (convCellList.getFirstVisiblePosition() == 0 && (iM41504C == 0 || this.f24975H == 0)) {
                    this.f24976I = 0;
                    if (NullChecker.m81303a(conversationsAdapter.getItem(0))) {
                        Conversation conversation = (Conversation) conversationsAdapter.getItem(this.f24976I);
                        this.f24977J = conversation;
                        iM41504C = conversationsAdapter.m41504C(conversation);
                    }
                }
                if (iM41504C >= 0) {
                    m41108x5(iM41504C, true);
                    this.f24978K = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: w5 */
    public void m41107w5(boolean z) {
        this.f24969B = z;
    }

    /* JADX INFO: renamed from: x5 */
    public final void m41108x5(int i, boolean z) {
        int headerViewsCount = this.f24980z.f25105V.getHeaderViewsCount();
        boolean zM194637G0 = upa.m194637G0();
        ConversationsList conversationsList = this.f24980z;
        if (zM194637G0) {
            conversationsList.f25105V.setSelectionFromTop(headerViewsCount + i, t100.m186890d(44.0f));
        } else {
            conversationsList.f25105V.setSelection(headerViewsCount + i);
        }
        this.f24976I = i;
        this.f24977J = (Conversation) this.f24980z.getConversationsAdapter().getItem(i);
        if (z) {
            this.f24980z.f25105V.post(this.f24979L);
        }
    }

    /* JADX INFO: renamed from: y5 */
    public boolean m41109y5() {
        return NullChecker.m81304b(CoreModule.f17545c.f19639e0.m169527p9()) && !mqi0.m155929D((long) CoreModule.f17545c.f19639e0.m169527p9().createdTime) && !pj90.m169806s(CoreModule.f17545c.f19639e0.m169527p9()) && mqi0.m155929D(CoreModule.f17545c.f19680r2.f113532m0) && CoreModule.f17545c.f19680r2.f113531l0 >= upa.m194763i0() && wn90.m204602F().m204648S() && !CoreModule.f17545c.f19680r2.m136528r3(4);
    }

    /* JADX INFO: renamed from: z5 */
    public void m41110z5() {
        if (NullChecker.m81303a(this.f24980z)) {
            this.f24980z.m41433G2();
        }
    }
}
