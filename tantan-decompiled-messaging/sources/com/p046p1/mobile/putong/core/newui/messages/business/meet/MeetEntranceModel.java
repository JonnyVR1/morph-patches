package com.p046p1.mobile.putong.core.newui.messages.business.meet;

import android.content.Context;
import android.view.View;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.MyMeetEntryV3;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.newui.meet.MeetAct;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p046p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.AbstractC19435q6;
import p149l.AbstractC20796w4;
import p149l.b2s;
import p149l.c4g0;
import p149l.e30;
import p149l.g2y;
import p149l.g83;
import p149l.h0y;
import p149l.j760;
import p149l.jwl;
import p149l.mcr;
import p149l.mkd0;
import p149l.mzx;
import p149l.n3b0;
import p149l.qib0;
import p149l.roj0;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;
import p149l.wp1;
import p149l.x2c0;
import p149l.x9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.xma;
import p149l.y9j;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "Ll/q6;", "Ll/mzx;", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", OMSTemplateModeType.view, "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "Ll/w4;", "g", "()Ll/w4;", "Ll/mcr;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Ll/wp1;", "Lcom/p1/mobile/putong/core/data/Conversation;", "adapter", "", "b", "(Ll/mcr;Ll/wp1;)V", "n", "()V", "Lcom/p1/mobile/android/app/Act;", "A", "()Lcom/p1/mobile/android/app/Act;", "", RXScreenCaptureService.KEY_INDEX, "()Z", "B", "a", "D", b2s.C_ZONE, "Ll/c4g0;", "e", "Ll/c4g0;", "meeEntranceSubs", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MeetEntranceModel extends AbstractC19435q6<mzx> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public c4g0 meeEntranceSubs;

    public MeetEntranceModel(@Nullable BusinessConversationView businessConversationView) {
        super(businessConversationView);
    }

    /* JADX INFO: renamed from: p */
    public static xaj0 m42304p(Boolean bool, j760 j760Var, roj0 roj0Var) {
        return new xaj0(bool, j760Var.f116564a, j760Var.f116565b);
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m42305q(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static void m42306r(MeetEntranceModel meetEntranceModel, View view) {
        zvf0.m220399u("e_red_dot_message_see", OMSDialogPositon.p_messages_view, vwb.m200311Y("guidance_type", "default"));
        if (CoreModule.f17545c.f19687u0.f19265v0 >= 2 || !n3b0.m157744s(null, 1, null) || !g83.m124740c(1)) {
            meetEntranceModel.m42315A().startActivity(MeetAct.m40494Y1(meetEntranceModel.m42315A(), "p_messages_view,e_see_banner,click", "see"));
            return;
        }
        CoreBusinessService coreBusinessServiceM94651a = CoreModule.m29935P().m94651a();
        Context contextM173108f = meetEntranceModel.m173108f();
        contextM173108f.getClass();
        coreBusinessServiceM94651a.mo33534l1((Act) contextM173108f, "p_messages_view,e_see_banner,click");
    }

    /* JADX INFO: renamed from: s */
    public static Boolean m42307s(CoreLikers.C4719a c4719a) {
        return Boolean.valueOf((c4719a != null ? c4719a.f19269a : null) == CoreLikers.LikersTriggerBy.home_tab_msg);
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m42308t(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210047L3());
    }

    /* JADX INFO: renamed from: u */
    public static void m42309u(MeetEntranceModel meetEntranceModel, xaj0 xaj0Var) {
        Object obj = meetEntranceModel.f152839b;
        h0y h0yVar = obj instanceof h0y ? (h0y) obj : null;
        if (h0yVar != null) {
            h0yVar.m128987w();
        }
        meetEntranceModel.m173113m();
        meetEntranceModel.m42318D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v */
    public static Unit m42310v(MeetEntranceModel meetEntranceModel, xaj0 xaj0Var) {
        xaj0Var.getClass();
        mzx mzxVar = new mzx(null, 0 == true ? 1 : 0, null, 7, null);
        mzxVar.m157177d((CoreLikers.C4719a) xaj0Var.f191752b);
        MyMeetEntryV3 myMeetEntryV3 = (MyMeetEntryV3) xaj0Var.f191753c;
        mzxVar.m157179f(myMeetEntryV3 != null ? myMeetEntryV3.oDiamondFeed : null);
        MyMeetEntryV3 myMeetEntryV4 = (MyMeetEntryV3) xaj0Var.f191753c;
        mzxVar.m157178e(myMeetEntryV4 != null ? myMeetEntryV4.nearby : null);
        meetEntranceModel.f152839b.m201444s(mzxVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static void m42311w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static Boolean m42312x(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static xaj0 m42313y(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (xaj0) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: z */
    public static j760 m42314z(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final Act m42315A() {
        Context contextM173108f = m173108f();
        contextM173108f.getClass();
        return (Act) contextM173108f;
    }

    /* JADX INFO: renamed from: B */
    public final void m42316B() {
        Object obj = this.f152839b;
        h0y h0yVar = obj instanceof h0y ? (h0y) obj : null;
        if (h0yVar != null) {
            h0yVar.m128988x(false);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m42317C() {
        xdl0.m208344M(this.f152838a.f25750x, false);
        xdl0.m208344M(this.f152838a.f25752z, false);
        xdl0.m208344M(this.f152838a.f25742p, false);
        xdl0.m208344M(this.f152838a.f25749w, false);
        xdl0.m208344M(this.f152838a.f25729A, false);
    }

    /* JADX INFO: renamed from: D */
    public final void m42318D() {
        jwl jwlVarM128986v;
        Object obj = this.f152839b;
        h0y h0yVar = obj instanceof h0y ? (h0y) obj : null;
        if (h0yVar == null || (jwlVarM128986v = h0yVar.getCurrentMeetEntranceStrategy()) == null) {
            return;
        }
        zvf0.m220368A("e_red_dot_message_see", OMSDialogPositon.p_messages_view, vwb.m200311Y("guidance_type", jwlVarM128986v.mo104778d()));
    }

    @Override // p149l.AbstractC19435q6, p149l.gnl
    /* JADX INFO: renamed from: a */
    public void mo42319a() {
        super.mo42319a();
        this.f152838a.f25734h.setBackgroundResource(0);
        xdl0.m208378h0(this.f152838a.f25734h, t100.m186890d(3.0f));
        if (upa.m194847z()) {
            qib0.f154691G.m102354Y0(this.f152838a.f25734h, x2c0.f190425oe);
        } else {
            qib0.f154691G.m102354Y0(this.f152838a.f25734h, x2c0.f190393ne);
        }
        this.f152838a.f25748v.setText(g2y.m124191a());
        xdl0.m208359W(this.f152838a.f25751y, t100.m186890d(2.0f));
        this.f152838a.f25751y.setText("快来看看我的心动瞬间吧");
        xdl0.m208329E0(this.f152838a, new View.OnClickListener() { // from class: l.pzx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeetEntranceModel.m42306r(this.f151980a, view);
            }
        });
    }

    @Override // p149l.AbstractC19435q6, p149l.gnl
    /* JADX INFO: renamed from: b */
    public void mo42320b(@NotNull mcr lifecycle, @NotNull wp1<Conversation> adapter) {
        lifecycle.getClass();
        adapter.getClass();
        super.mo42320b(lifecycle, adapter);
        if (this.meeEntranceSubs == null) {
            C22306c<UserPrivilege> c22306cM210111u3 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"));
            final Function1 function1 = new Function1() { // from class: l.rzx
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MeetEntranceModel.m42308t((UserPrivilege) obj);
                }
            };
            C22306c c22306cDistinctUntilChanged = c22306cM210111u3.map(new w9j() { // from class: l.szx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MeetEntranceModel.m42305q(function1, obj);
                }
            }).distinctUntilChanged();
            C22306c<CoreLikers.C4719a> c22306cOnBackpressureLatest = CoreModule.f17545c.f19687u0.m30467p7().onBackpressureLatest();
            final Function1 function2 = new Function1() { // from class: l.tzx
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MeetEntranceModel.m42307s((CoreLikers.C4719a) obj);
                }
            };
            C22306c<CoreLikers.C4719a> c22306cFilter = c22306cOnBackpressureLatest.filter(new w9j() { // from class: l.uzx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MeetEntranceModel.m42312x(function2, obj);
                }
            });
            C22306c<MyMeetEntryV3> c22306cM34704P4 = CoreModule.f17545c.f19664m1.m34704P4();
            final MeetEntranceModel$initSubscription$3 meetEntranceModel$initSubscription$3 = MeetEntranceModel$initSubscription$3.INSTANCE;
            C22306c c22306cZip = C22306c.zip(c22306cFilter, c22306cM34704P4, new x9j() { // from class: l.vzx
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return MeetEntranceModel.m42314z(meetEntranceModel$initSubscription$3, obj, obj2);
                }
            });
            C22306c<roj0> c22306cM34702O4 = CoreModule.f17545c.f19664m1.m34702O4();
            final Function3 function3 = new Function3() { // from class: l.wzx
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MeetEntranceModel.m42304p((Boolean) obj, (j760) obj2, (roj0) obj3);
                }
            };
            C22306c c22306cDuringCreated = lifecycle.duringCreated(mkd0.m154985s(c22306cDistinctUntilChanged, c22306cZip, c22306cM34702O4, new y9j() { // from class: l.xzx
                @Override // p149l.y9j
                /* JADX INFO: renamed from: a */
                public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                    return MeetEntranceModel.m42313y(function3, obj, obj2, obj3);
                }
            }));
            final Function1 function4 = new Function1() { // from class: l.yzx
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MeetEntranceModel.m42310v(this.f200921a, (xaj0) obj);
                }
            };
            this.meeEntranceSubs = c22306cDuringCreated.doOnNext(new e30() { // from class: l.zzx
                @Override // p149l.e30
                public final void call(Object obj) {
                    MeetEntranceModel.m42311w(function4, obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.qzx
                @Override // p149l.e30
                public final void call(Object obj) {
                    MeetEntranceModel.m42309u(this.f157117a, (xaj0) obj);
                }
            }));
        }
    }

    @Override // p149l.AbstractC19435q6
    @NotNull
    /* JADX INFO: renamed from: g */
    public AbstractC20796w4<mzx> mo42321g() {
        return new h0y(m173108f());
    }

    @Override // p149l.AbstractC19435q6
    /* JADX INFO: renamed from: i */
    public boolean mo42322i() {
        jwl jwlVarM128986v;
        Object obj = this.f152839b;
        h0y h0yVar = obj instanceof h0y ? (h0y) obj : null;
        return (h0yVar == null || (jwlVarM128986v = h0yVar.getCurrentMeetEntranceStrategy()) == null) ? super.mo42322i() : jwlVarM128986v.mo104777c();
    }

    @Override // p149l.AbstractC19435q6
    /* JADX INFO: renamed from: n */
    public void mo42323n() {
        jwl jwlVarM128986v;
        m42317C();
        Object obj = this.f152839b;
        h0y h0yVar = obj instanceof h0y ? (h0y) obj : null;
        if (h0yVar == null || (jwlVarM128986v = h0yVar.getCurrentMeetEntranceStrategy()) == null) {
            return;
        }
        BusinessConversationView businessConversationView = this.f152838a;
        businessConversationView.getClass();
        jwlVarM128986v.mo104776a(this, businessConversationView);
    }
}
