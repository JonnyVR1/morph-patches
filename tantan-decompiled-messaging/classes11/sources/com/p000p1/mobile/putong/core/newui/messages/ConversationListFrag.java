package com.p000p1.mobile.putong.core.newui.messages;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.messages.ConversationListFrag;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.util.launch.LaunchStep;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.BannerLoc;
import com.p1.mobile.putong.data.ConversationCounter;
import com.p1.mobile.putong.data.Counter;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.e51;
import l.f6c0;
import l.ife;
import l.j760;
import l.mkd0;
import l.roj0;
import l.t100;
import l.upa;
import l.ura;
import l.v930;
import l.v9j;
import l.vwb;
import l.w9j;
import l.wjc0;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.xma;
import l.z9j;
import p009l.a8m;
import p009l.lbm;
import p009l.mqi0;
import p009l.pj90;
import p009l.q860;
import p009l.qko;
import p009l.wn90;
import p009l.yni;
import v.VList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationListFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public boolean f3746A;

    /* JADX INFO: renamed from: B */
    public boolean f3747B;

    /* JADX INFO: renamed from: E */
    public FrameLayout f3750E;

    /* JADX INFO: renamed from: F */
    public qko f3751F;

    /* JADX INFO: renamed from: G */
    public a8m f3752G;

    /* JADX INFO: renamed from: J */
    public Conversation f3755J;

    /* JADX INFO: renamed from: z */
    public ConversationsList f3758z;

    /* JADX INFO: renamed from: C */
    public boolean f3748C = false;

    /* JADX INFO: renamed from: D */
    public boolean f3749D = false;

    /* JADX INFO: renamed from: H */
    public int f3753H = -1;

    /* JADX INFO: renamed from: I */
    public int f3754I = -1;

    /* JADX INFO: renamed from: K */
    public boolean f3756K = true;

    /* JADX INFO: renamed from: L */
    public final Runnable f3757L = new RunnableC0284a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationListFrag$a */
    public class RunnableC0284a implements Runnable {
        public RunnableC0284a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int firstVisiblePosition = ConversationListFrag.this.f3758z.f3883V.getFirstVisiblePosition();
            if (upa.G0() && firstVisiblePosition > 0) {
                firstVisiblePosition++;
            }
            ConversationListFrag.this.f3756K = !(firstVisiblePosition - ConversationListFrag.this.f3758z.f3883V.getHeaderViewsCount() == ConversationListFrag.this.f3754I);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m5173M4(q860 q860Var) {
        List<T> list;
        if (q860Var == null || (list = q860Var.f19068a) == 0 || list.size() == 0) {
            g.Y2 = "";
            return;
        }
        String str = ((DbObject) ((Conversation) q860Var.f19068a.get(0))).id;
        if (TextUtils.equals(str, g.Y2)) {
            return;
        }
        g.Y2 = str;
    }

    /* JADX INFO: renamed from: S4 */
    public static /* synthetic */ void m5179S4(Throwable th) {
    }

    /* JADX INFO: renamed from: T4 */
    public static /* synthetic */ void m5180T4(Throwable th) {
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m5182V4(Throwable th) {
    }

    /* JADX INFO: renamed from: i5 */
    public static ConversationListFrag m5194i5(boolean z) {
        ConversationListFrag conversationListFrag = new ConversationListFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isMatchList", z);
        conversationListFrag.setArguments(bundle);
        return conversationListFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n5 */
    public /* synthetic */ void m5195n5(List list) {
        if (vwb.J(list) || v930.h() != TabName.Msg) {
            return;
        }
        lbm lbmVar = new lbm(act());
        lbmVar.m17808U(list, "conversation");
        lbmVar.show();
        CoreModule.c.r2.Z.a(1);
        CoreModule.c.r2.Y.put(Long.valueOf(mqi0.m18550o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public /* synthetic */ void m5196o5() {
        this.f3758z.m5535E2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m5197p5(c cVar) {
        if (cVar == c.i) {
            this.f3751F.m21083c();
        }
        if (cVar == c.l) {
            this.f3751F.m21082b();
        }
        if (!isHidden() && cVar == c.i) {
            if (NullChecker.a((Object) null)) {
                throw null;
            }
            g gVar = CoreModule.c.f0;
            gVar.R.m17235e(gVar.S, true);
            if (upa.Y1() && m5215y5()) {
                duringCreated(CoreModule.c.r2.p3("message")).subscribe(mkd0.H(new e30() { // from class: l.jf6
                    public final void call(Object obj) {
                        this.f15098a.m5195n5((List) obj);
                    }
                }, new e30() { // from class: l.kf6
                    public final void call(Object obj) {
                        ConversationListFrag.m5180T4((Throwable) obj);
                    }
                }));
            }
            if (upa.u3() && NullChecker.a(this.f3758z) && ((Long) CoreModule.c.e0.l1.get()).longValue() >= 0 && !mqi0.m18534C(((Long) CoreModule.c.e0.l1.get()).longValue(), mqi0.m18550o())) {
                e51.I(this, new Runnable() { // from class: l.lf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16137a.m5196o5();
                    }
                }, 1000L);
            }
            if (CoreModule.Q().m9019M6().m12084c()) {
                CoreModule.Q().m9019M6().m12096o(act());
            }
        }
        if (CoreModule.N().ko() && cVar == c.j) {
            CoreModule.N().Ea();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public /* synthetic */ void m5198q5(roj0 roj0Var) {
        if (isHidden() || this.f3747B || !CoreModule.N().xa("p_messages_view") || !this.f3749D) {
            return;
        }
        CoreModule.N().cj(act(), "p_messages_view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public /* synthetic */ void m5199r5(j760 j760Var) {
        if (isHidden() || this.f3747B || j760Var.a != c.i || !CoreModule.N().xa("p_messages_view")) {
            return;
        }
        xaj0 xaj0Var = (xaj0) j760Var.b;
        Counter counter = (Counter) xaj0Var.a;
        ConversationCounter conversationCounter = (ConversationCounter) xaj0Var.b;
        int iB = wjc0.b(counter, conversationCounter, (Boolean) xaj0Var.c) - ura.e().d().E7(conversationCounter.conversations);
        this.f3749D = true;
        if (iB == 0) {
            CoreModule.N().cj(act(), "p_messages_view");
            this.f3749D = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public /* synthetic */ void m5200s5(Boolean bool) {
        if (bool.booleanValue()) {
            m5208l5(false);
        }
    }

    /* JADX INFO: renamed from: I4 */
    public void m5201I4() {
        super.I4();
        m5211u5(0);
    }

    /* JADX INFO: renamed from: d4 */
    public void m5202d4() {
        super.d4();
        this.f3746A = getArguments().getBoolean("isMatchList", false);
        this.f3751F = new qko(this);
    }

    /* JADX INFO: renamed from: f4 */
    public void m5203f4() {
        super.f4();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.bf6
            public final void call(Object obj) {
                this.f10046a.m5197p5((c) obj);
            }
        }));
        if (CoreModule.N().ko() && CoreModule.N().xa("p_messages_view")) {
            duringCreated(CoreModule.c.f0.W1).subscribe(mkd0.H(new e30() { // from class: l.rf6
                public final void call(Object obj) {
                    this.f19793a.m5198q5((roj0) obj);
                }
            }, new e30() { // from class: l.sf6
                public final void call(Object obj) {
                    ConversationListFrag.m5179S4((Throwable) obj);
                }
            }));
            duringCreated(mkd0.t(lifecycle(), CoreModule.c.n3(), CoreModule.c.f0.Qe(), ife.o().a.map(new w9j() { // from class: l.tf6
                public final Object call(Object obj) {
                    return Boolean.valueOf(ife.o().k(BannerLoc.get("conversation")));
                }
            }).distinctUntilChanged(), new z9j() { // from class: l.uf6
                /* JADX INFO: renamed from: b */
                public final Object m22810b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return j760.a((c) obj, xaj0.a((Counter) obj2, (ConversationCounter) obj3, (Boolean) obj4));
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.cf6
                public final void call(Object obj) {
                    this.f10570a.m5199r5((j760) obj);
                }
            }, new e30() { // from class: l.df6
                public final void call(Object obj) {
                    ConversationListFrag.m5182V4((Throwable) obj);
                }
            }));
        }
        if (CoreModule.P().g().d9() && !xma.L3()) {
            duringCreated(rx.c.combineLatest(L4(), v930.k().distinctUntilChanged(), new x9j() { // from class: l.of6
                public final Object call(Object obj, Object obj2) {
                    return new j760((Boolean) obj, (TabName) obj2);
                }
            }).filter(new w9j() { // from class: l.ef6
                public final Object call(Object obj) {
                    j760 j760Var = (j760) obj;
                    return Boolean.valueOf(((Boolean) j760Var.a).booleanValue() && j760Var.b == TabName.Msg);
                }
            }).switchMap(new w9j() { // from class: l.ff6
                public final Object call(Object obj) {
                    return CoreModule.c.f0.Ze();
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.mf6
                public final void call(Object obj) {
                    ConversationListFrag.m5173M4((q860) obj);
                }
            }, new e30() { // from class: l.nf6
                public final void call(Object obj) {
                    g.Y2 = "";
                }
            }));
        }
        if (CoreModule.P().g().Sj()) {
            duringCreated(rx.c.combineLatest(L4(), v930.k().distinctUntilChanged(), new x9j() { // from class: l.of6
                public final Object call(Object obj, Object obj2) {
                    return new j760((Boolean) obj, (TabName) obj2);
                }
            }).filter(new w9j() { // from class: l.pf6
                public final Object call(Object obj) {
                    j760 j760Var = (j760) obj;
                    return Boolean.valueOf(((Boolean) j760Var.a).booleanValue() && j760Var.b == TabName.Msg);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.qf6
                public final void call(Object obj) {
                    CoreModule.P().g().gr();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m5204g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        if (CoreModule.Q().m9005Ei(3)) {
            if (upa.Q1()) {
                return;
            }
            duringCreated(new v9j() { // from class: l.gf6
                public final Object call() {
                    return CoreModule.Q().m9018Lh().m11268f();
                }
            }, false).subscribe(mkd0.H(new e30() { // from class: l.hf6
                public final void call(Object obj) {
                    this.f14054a.m5200s5((Boolean) obj);
                }
            }, new e30() { // from class: l.if6
                public final void call(Object obj) {
                    this.f14601a.m5210t5((Throwable) obj);
                }
            }));
        } else if (CoreModule.Q().m9040a().m14848c() || CoreModule.Q().m9040a().m14849d()) {
            m5208l5(true);
        }
    }

    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return getActivity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.view.View, com.p1.mobile.putong.core.newui.messages.ConversationsList] */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LaunchStep launchStep = LaunchStep.MsgTabInflate;
        yni.m25474f(launchStep);
        this.f3750E = new FrameLayout(act());
        ConversationsList conversationsList = (ConversationsList) act().inflater().inflate(f6c0.he, (ViewGroup) this.f3750E, false);
        this.f3758z = conversationsList;
        conversationsList.m5578p1(false);
        ?? r5 = this.f3758z;
        r5.f3896g1 = this.f3746A;
        this.f3750E.addView(r5);
        yni.m25472d(launchStep);
        LaunchStep launchStep2 = LaunchStep.MsgTabDataInit;
        yni.m25474f(launchStep2);
        this.f3758z.m5585s1(this);
        yni.m25472d(launchStep2);
        return this.f3750E;
    }

    /* JADX INFO: renamed from: j5 */
    public qko m5206j5() {
        return this.f3751F;
    }

    /* JADX INFO: renamed from: k5 */
    public final void m5207k5() {
    }

    /* JADX INFO: renamed from: l5 */
    public final void m5208l5(boolean z) {
        this.f3752G = CoreModule.Q().m9018Lh();
        int i = xdl0.f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.setMargins(0, 0, 0, z ? t100.m : t100.h);
        layoutParams.gravity = 8388693;
        a8m a8mVar = this.f3752G;
        if (z) {
            a8mVar.m11271i(this, this.f3750E, layoutParams);
        } else {
            a8mVar.m11267e(this, this.f3750E, layoutParams);
        }
    }

    /* JADX INFO: renamed from: m5 */
    public boolean m5209m5() {
        return this.f3746A;
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m5210t5(Throwable th) {
        m5207k5();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: u5 */
    public void m5211u5(int i) {
        ConversationsList conversationsList;
        VList vList;
        if (!isVisible() || i < 0 || (conversationsList = this.f3758z) == null || (vList = conversationsList.f3883V) == null || vList.getVisibility() != 0) {
            return;
        }
        this.f3758z.f3883V.smoothScrollToPositionFromTop(i, i);
    }

    /* JADX INFO: renamed from: v5 */
    public void m5212v5() {
        if (NullChecker.a(this.f3758z) && NullChecker.a(this.f3758z.f3883V)) {
            VList vList = this.f3758z.f3883V;
            if (vList.getVisibility() == 0) {
                ConversationsList.C0294e conversationsAdapter = this.f3758z.getConversationsAdapter();
                this.f3753H = conversationsAdapter.m5609A();
                if (this.f3756K || (vList.getFirstVisiblePosition() == 0 && this.f3753H != 0)) {
                    this.f3754I = -1;
                    this.f3755J = null;
                }
                int iM5611C = conversationsAdapter.m5611C(this.f3755J);
                if (vList.getFirstVisiblePosition() == 0 && (iM5611C == 0 || this.f3753H == 0)) {
                    this.f3754I = 0;
                    if (NullChecker.a(conversationsAdapter.getItem(0))) {
                        Conversation conversation = (Conversation) conversationsAdapter.getItem(this.f3754I);
                        this.f3755J = conversation;
                        iM5611C = conversationsAdapter.m5611C(conversation);
                    }
                }
                if (iM5611C >= 0) {
                    m5214x5(iM5611C, true);
                    this.f3756K = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: w5 */
    public void m5213w5(boolean z) {
        this.f3747B = z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: x5 */
    public final void m5214x5(int i, boolean z) {
        int headerViewsCount = this.f3758z.f3883V.getHeaderViewsCount();
        boolean zG0 = upa.G0();
        ConversationsList conversationsList = this.f3758z;
        if (zG0) {
            conversationsList.f3883V.setSelectionFromTop(headerViewsCount + i, t100.d(44.0f));
        } else {
            conversationsList.f3883V.setSelection(headerViewsCount + i);
        }
        this.f3754I = i;
        this.f3755J = (Conversation) this.f3758z.getConversationsAdapter().getItem(i);
        if (z) {
            this.f3758z.f3883V.post(this.f3757L);
        }
    }

    /* JADX INFO: renamed from: y5 */
    public boolean m5215y5() {
        return NullChecker.b(CoreModule.c.e0.p9()) && !mqi0.m18535D((long) CoreModule.c.e0.p9().createdTime) && !pj90.m20478s(CoreModule.c.e0.p9()) && mqi0.m18535D(CoreModule.c.r2.m0) && CoreModule.c.r2.l0 >= upa.i0() && wn90.m24339F().m24385S() && !CoreModule.c.r2.r3(4);
    }

    /* JADX INFO: renamed from: z5 */
    public void m5216z5() {
        if (NullChecker.a(this.f3758z)) {
            this.f3758z.m5539G2();
        }
    }
}
