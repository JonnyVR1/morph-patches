package com.p051p1.mobile.putong.core.newui.messages;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConversationListFrag;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.ConversationCounter;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p153l.aw90;
import p153l.bem;
import p153l.bkj0;
import p153l.bnl0;
import p153l.dsc0;
import p153l.gra;
import p153l.gta;
import p153l.ji30;
import p153l.joa;
import p153l.jyb;
import p153l.kec0;
import p153l.l51;
import p153l.mge;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qam;
import p153l.qcj;
import p153l.qmo;
import p153l.rcj;
import p153l.tcj;
import p153l.tr90;
import p153l.uqi;
import p153l.uxj0;
import p153l.vg60;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationListFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public boolean f25710A;

    /* JADX INFO: renamed from: B */
    public boolean f25711B;

    /* JADX INFO: renamed from: E */
    public FrameLayout f25714E;

    /* JADX INFO: renamed from: F */
    public qmo f25715F;

    /* JADX INFO: renamed from: G */
    public qam f25716G;

    /* JADX INFO: renamed from: J */
    public Conversation f25719J;

    /* JADX INFO: renamed from: z */
    public ConversationsList f25722z;

    /* JADX INFO: renamed from: C */
    public boolean f25712C = false;

    /* JADX INFO: renamed from: D */
    public boolean f25713D = false;

    /* JADX INFO: renamed from: H */
    public int f25717H = -1;

    /* JADX INFO: renamed from: I */
    public int f25718I = -1;

    /* JADX INFO: renamed from: K */
    public boolean f25720K = true;

    /* JADX INFO: renamed from: L */
    public final Runnable f25721L = new RunnableC8271a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationListFrag$a */
    public class RunnableC8271a implements Runnable {
        public RunnableC8271a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int firstVisiblePosition = ConversationListFrag.this.f25722z.f25847V.getFirstVisiblePosition();
            if (gra.m131568G0() && firstVisiblePosition > 0) {
                firstVisiblePosition++;
            }
            ConversationListFrag.this.f25720K = !(firstVisiblePosition - ConversationListFrag.this.f25722z.f25847V.getHeaderViewsCount() == ConversationListFrag.this.f25718I);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m42082M4(vg60 vg60Var) {
        List<T> list;
        if (vg60Var == null || (list = vg60Var.f184001a) == 0 || list.size() == 0) {
            C4891g.f20578Y2 = "";
            return;
        }
        String str = ((Conversation) vg60Var.f184001a.get(0)).f56859id;
        if (TextUtils.equals(str, C4891g.f20578Y2)) {
            return;
        }
        C4891g.f20578Y2 = str;
    }

    /* JADX INFO: renamed from: S4 */
    public static /* synthetic */ void m42088S4(Throwable th) {
    }

    /* JADX INFO: renamed from: T4 */
    public static /* synthetic */ void m42089T4(Throwable th) {
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m42091V4(Throwable th) {
    }

    /* JADX INFO: renamed from: i5 */
    public static ConversationListFrag m42103i5(boolean z) {
        ConversationListFrag conversationListFrag = new ConversationListFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isMatchList", z);
        conversationListFrag.setArguments(bundle);
        return conversationListFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n5 */
    public /* synthetic */ void m42104n5(List list) {
        if (jyb.m147479J(list) || ji30.m144964h() != TabName.Msg) {
            return;
        }
        bem bemVar = new bem(act());
        bemVar.m103733U(list, "conversation");
        bemVar.show();
        CoreModule.f18264c.f20422r2.f137257Z.m203841a(1);
        CoreModule.f18264c.f20422r2.f137256Y.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public /* synthetic */ void m42105o5() {
        this.f25722z.m42440E2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m42106p5(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f25715F.m177140c();
        }
        if (c4470c == C4470c.f16270l) {
            this.f25715F.m177139b();
        }
        if (!isHidden() && c4470c == C4470c.f16267i) {
            if (NullChecker.m82486a(null)) {
                throw null;
            }
            C4891g c4891g = CoreModule.f18264c.f20384f0;
            c4891g.f20634R.m170616e(c4891g.f20637S, true);
            if (gra.m131649Y1() && m42120y5()) {
                duringCreated(CoreModule.f18264c.f20422r2.m158741p3("message")).subscribe(psd0.m173597H(new y20() { // from class: l.mg6
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f136695a.m42104n5((List) obj);
                    }
                }, new y20() { // from class: l.ng6
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ConversationListFrag.m42089T4((Throwable) obj);
                    }
                }));
            }
            if (gra.m131757u3() && NullChecker.m82486a(this.f25722z) && CoreModule.f18264c.f20381e0.f89271l1.get().longValue() >= 0 && !pzi0.m174438C(CoreModule.f18264c.f20381e0.f89271l1.get().longValue(), pzi0.m174454o())) {
                l51.m152889I(this, new Runnable() { // from class: l.og6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f147194a.m42105o5();
                    }
                }, 1000L);
            }
            if (CoreModule.m30934Q().mo68412M6().mo127332c()) {
                CoreModule.m30934Q().mo68412M6().mo127344o(act());
            }
        }
        if (CoreModule.m30932N().mo61549ko() && c4470c == C4470c.f16268j) {
            CoreModule.m30932N().mo61456Ea();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public /* synthetic */ void m42107q5(uxj0 uxj0Var) {
        if (isHidden() || this.f25711B || !CoreModule.m30932N().mo61585xa(OMSDialogPositon.p_messages_view) || !this.f25713D) {
            return;
        }
        CoreModule.m30932N().mo61527cj(act(), OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r5 */
    public /* synthetic */ void m42108r5(pf60 pf60Var) {
        if (isHidden() || this.f25711B || pf60Var.f152156a != C4470c.f16267i || !CoreModule.m30932N().mo61585xa(OMSDialogPositon.p_messages_view)) {
            return;
        }
        bkj0 bkj0Var = (bkj0) pf60Var.f152157b;
        Counter counter = (Counter) bkj0Var.f77081a;
        ConversationCounter conversationCounter = (ConversationCounter) bkj0Var.f77082b;
        int iM117723b = dsc0.m117723b(counter, conversationCounter, (Boolean) bkj0Var.f77083c) - gta.m132210e().m132214d().mo34680E7(conversationCounter.conversations);
        this.f25713D = true;
        if (iM117723b == 0) {
            CoreModule.m30932N().mo61527cj(act(), OMSDialogPositon.p_messages_view);
            this.f25713D = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public /* synthetic */ void m42109s5(Boolean bool) {
        if (bool.booleanValue()) {
            m42113l5(false);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: I4 */
    public void mo30635I4() {
        super.mo30635I4();
        m42116u5(0);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f25710A = getArguments().getBoolean("isMatchList", false);
        this.f25715F = new qmo(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.eg6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93905a.m42106p5((C4470c) obj);
            }
        }));
        if (CoreModule.m30932N().mo61549ko() && CoreModule.m30932N().mo61585xa(OMSDialogPositon.p_messages_view)) {
            duringCreated(CoreModule.f18264c.f20384f0.f20651W1).subscribe(psd0.m173597H(new y20() { // from class: l.ug6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178871a.m42107q5((uxj0) obj);
                }
            }, new y20() { // from class: l.vg6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationListFrag.m42088S4((Throwable) obj);
                }
            }));
            duringCreated(psd0.m173627t(lifecycle(), CoreModule.f18264c.m32486n3(), CoreModule.f18264c.f20384f0.m33776Qe(), mge.m158199o().f136705a.map(new qcj() { // from class: l.wg6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(mge.m158199o().m158201k(BannerLoc.get("conversation")));
                }
            }).distinctUntilChanged(), new tcj() { // from class: l.xg6
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return pf60.m172085a((C4470c) obj, bkj0.m104818a((Counter) obj2, (ConversationCounter) obj3, (Boolean) obj4));
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.fg6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f98887a.m42108r5((pf60) obj);
                }
            }, new y20() { // from class: l.gg6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationListFrag.m42091V4((Throwable) obj);
                }
            }));
        }
        if (CoreModule.m30933P().m143410g().mo36057d9() && !joa.m146361M3()) {
            duringCreated(C22421c.combineLatest(m30638L4(), ji30.m144967k().distinctUntilChanged(), new rcj() { // from class: l.rg6
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new pf60((Boolean) obj, (TabName) obj2);
                }
            }).filter(new qcj() { // from class: l.hg6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    pf60 pf60Var = (pf60) obj;
                    return Boolean.valueOf(((Boolean) pf60Var.f152156a).booleanValue() && pf60Var.f152157b == TabName.Msg);
                }
            }).switchMap(new qcj() { // from class: l.ig6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20384f0.m33883Ze();
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.pg6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationListFrag.m42082M4((vg60) obj);
                }
            }, new y20() { // from class: l.qg6
                @Override // p153l.y20
                public final void call(Object obj) {
                    C4891g.f20578Y2 = "";
                }
            }));
        }
        if (CoreModule.m30933P().m143410g().mo36034Sj()) {
            duringCreated(C22421c.combineLatest(m30638L4(), ji30.m144967k().distinctUntilChanged(), new rcj() { // from class: l.rg6
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new pf60((Boolean) obj, (TabName) obj2);
                }
            }).filter(new qcj() { // from class: l.sg6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    pf60 pf60Var = (pf60) obj;
                    return Boolean.valueOf(((Boolean) pf60Var.f152156a).booleanValue() && pf60Var.f152157b == TabName.Msg);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.tg6
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.m30933P().m143410g().mo36065gr();
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        if (CoreModule.m30934Q().mo68398Ei(3)) {
            if (gra.m131617Q1()) {
                return;
            }
            duringCreated(new pcj() { // from class: l.jg6
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.m30934Q().mo68411Lh().mo175949f();
                }
            }, false).subscribe(psd0.m173597H(new y20() { // from class: l.kg6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f126580a.m42109s5((Boolean) obj);
                }
            }, new y20() { // from class: l.lg6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f131942a.m42115t5((Throwable) obj);
                }
            }));
        } else if (CoreModule.m30934Q().mo68438a().mo134411c() || CoreModule.m30934Q().mo68438a().mo134412d()) {
            m42113l5(true);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) getActivity();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LaunchStep launchStep = LaunchStep.MsgTabInflate;
        uqi.m197339f(launchStep);
        this.f25714E = new FrameLayout(act());
        ConversationsList conversationsList = (ConversationsList) act().inflater().inflate(kec0.f125988oe, (ViewGroup) this.f25714E, false);
        this.f25722z = conversationsList;
        conversationsList.m42483p1(false);
        ConversationsList conversationsList2 = this.f25722z;
        conversationsList2.f25860g1 = this.f25710A;
        this.f25714E.addView(conversationsList2);
        uqi.m197337d(launchStep);
        LaunchStep launchStep2 = LaunchStep.MsgTabDataInit;
        uqi.m197339f(launchStep2);
        this.f25722z.m42489s1(this);
        uqi.m197337d(launchStep2);
        return this.f25714E;
    }

    /* JADX INFO: renamed from: j5 */
    public qmo m42111j5() {
        return this.f25715F;
    }

    /* JADX INFO: renamed from: k5 */
    public final void m42112k5() {
    }

    /* JADX INFO: renamed from: l5 */
    public final void m42113l5(boolean z) {
        this.f25716G = CoreModule.m30934Q().mo68411Lh();
        int i = bnl0.f77545f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.setMargins(0, 0, 0, z ? qa00.f156326m : qa00.f156321h);
        layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        qam qamVar = this.f25716G;
        if (z) {
            qamVar.mo175952i(this, this.f25714E, layoutParams);
        } else {
            qamVar.mo175948e(this, this.f25714E, layoutParams);
        }
    }

    /* JADX INFO: renamed from: m5 */
    public boolean m42114m5() {
        return this.f25710A;
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m42115t5(Throwable th) {
        m42112k5();
    }

    /* JADX INFO: renamed from: u5 */
    public void m42116u5(int i) {
        ConversationsList conversationsList;
        ConvCellList convCellList;
        if (!isVisible() || i < 0 || (conversationsList = this.f25722z) == null || (convCellList = conversationsList.f25847V) == null || convCellList.getVisibility() != 0) {
            return;
        }
        this.f25722z.f25847V.smoothScrollToPositionFromTop(i, i);
    }

    /* JADX INFO: renamed from: v5 */
    public void m42117v5() {
        if (NullChecker.m82486a(this.f25722z) && NullChecker.m82486a(this.f25722z.f25847V)) {
            ConvCellList convCellList = this.f25722z.f25847V;
            if (convCellList.getVisibility() == 0) {
                ConversationsList.C8281e conversationsAdapter = this.f25722z.getConversationsAdapter();
                this.f25717H = conversationsAdapter.m42513A();
                if (this.f25720K || (convCellList.getFirstVisiblePosition() == 0 && this.f25717H != 0)) {
                    this.f25718I = -1;
                    this.f25719J = null;
                }
                int iM42515C = conversationsAdapter.m42515C(this.f25719J);
                if (convCellList.getFirstVisiblePosition() == 0 && (iM42515C == 0 || this.f25717H == 0)) {
                    this.f25718I = 0;
                    if (NullChecker.m82486a(conversationsAdapter.getItem(0))) {
                        Conversation conversation = (Conversation) conversationsAdapter.getItem(this.f25718I);
                        this.f25719J = conversation;
                        iM42515C = conversationsAdapter.m42515C(conversation);
                    }
                }
                if (iM42515C >= 0) {
                    m42119x5(iM42515C, true);
                    this.f25720K = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: w5 */
    public void m42118w5(boolean z) {
        this.f25711B = z;
    }

    /* JADX INFO: renamed from: x5 */
    public final void m42119x5(int i, boolean z) {
        int headerViewsCount = this.f25722z.f25847V.getHeaderViewsCount();
        boolean zM131568G0 = gra.m131568G0();
        ConversationsList conversationsList = this.f25722z;
        if (zM131568G0) {
            conversationsList.f25847V.setSelectionFromTop(headerViewsCount + i, qa00.m175859d(44.0f));
        } else {
            conversationsList.f25847V.setSelection(headerViewsCount + i);
        }
        this.f25718I = i;
        this.f25719J = (Conversation) this.f25722z.getConversationsAdapter().getItem(i);
        if (z) {
            this.f25722z.f25847V.post(this.f25721L);
        }
    }

    /* JADX INFO: renamed from: y5 */
    public boolean m42120y5() {
        return NullChecker.m82487b(CoreModule.f18264c.f20381e0.m116600p9()) && !pzi0.m174439D((long) CoreModule.f18264c.f20381e0.m116600p9().createdTime) && !tr90.m192431s(CoreModule.f18264c.f20381e0.m116600p9()) && pzi0.m174439D(CoreModule.f18264c.f20422r2.f137270m0) && CoreModule.f18264c.f20422r2.f137269l0 >= gra.m131694i0() && aw90.m100562F().m100608S() && !CoreModule.f18264c.f20422r2.m158743r3(4);
    }

    /* JADX INFO: renamed from: z5 */
    public void m42121z5() {
        if (NullChecker.m82486a(this.f25722z)) {
            this.f25722z.m42444G2();
        }
    }
}
