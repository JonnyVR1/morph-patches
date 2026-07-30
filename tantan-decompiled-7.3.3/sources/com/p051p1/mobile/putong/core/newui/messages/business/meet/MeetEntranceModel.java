package com.p051p1.mobile.putong.core.newui.messages.business.meet;

import android.content.Context;
import android.view.View;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.MyMeetEntryV3;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.newui.meet.MeetAct;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.AbstractC18810n6;
import p153l.AbstractC20482u4;
import p153l.bkj0;
import p153l.bnl0;
import p153l.bzl;
import p153l.c4s;
import p153l.dbc0;
import p153l.dby;
import p153l.dq1;
import p153l.e9y;
import p153l.gra;
import p153l.i4g0;
import p153l.j8y;
import p153l.joa;
import p153l.jyb;
import p153l.kcg0;
import p153l.ner;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.rbb0;
import p153l.rcj;
import p153l.scj;
import p153l.uqb0;
import p153l.uxj0;
import p153l.v83;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "Ll/n6;", "Ll/j8y;", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", OMSTemplateModeType.view, "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "Ll/u4;", "g", "()Ll/u4;", "Ll/ner;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Ll/dq1;", "Lcom/p1/mobile/putong/core/data/Conversation;", "adapter", "", "b", "(Ll/ner;Ll/dq1;)V", "n", "()V", "Lcom/p1/mobile/android/app/Act;", "A", "()Lcom/p1/mobile/android/app/Act;", "", RXScreenCaptureService.KEY_INDEX, "()Z", "B", "a", "D", c4s.C_ZONE, "Ll/kcg0;", "e", "Ll/kcg0;", "meeEntranceSubs", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MeetEntranceModel extends AbstractC18810n6<j8y> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public kcg0 meeEntranceSubs;

    public MeetEntranceModel(@Nullable BusinessConversationView businessConversationView) {
        super(businessConversationView);
    }

    /* JADX INFO: renamed from: p */
    public static bkj0 m43315p(Boolean bool, pf60 pf60Var, uxj0 uxj0Var) {
        return new bkj0(bool, pf60Var.f152156a, pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m43316q(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static void m43317r(MeetEntranceModel meetEntranceModel, View view) {
        i4g0.m138523u("e_red_dot_message_see", OMSDialogPositon.p_messages_view, jyb.m147494Y("guidance_type", "default"));
        if (CoreModule.f18264c.f20429u0.f20007w0 >= 2 || !rbb0.m180746s(null, 1, null) || !v83.m200283c(1)) {
            meetEntranceModel.m43326A().startActivity(MeetAct.m41505Z1(meetEntranceModel.m43326A(), "p_messages_view,e_see_banner,click", "see"));
            return;
        }
        CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
        Context contextM161741f = meetEntranceModel.m161741f();
        contextM161741f.getClass();
        coreBusinessServiceM143405a.mo34537l1((Act) contextM161741f, "p_messages_view,e_see_banner,click");
    }

    /* JADX INFO: renamed from: s */
    public static Boolean m43318s(CoreLikers.C4870a c4870a) {
        return Boolean.valueOf((c4870a != null ? c4870a.f20011a : null) == CoreLikers.LikersTriggerBy.home_tab_msg);
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m43319t(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146361M3());
    }

    /* JADX INFO: renamed from: u */
    public static void m43320u(MeetEntranceModel meetEntranceModel, bkj0 bkj0Var) {
        Object obj = meetEntranceModel.f140410b;
        e9y e9yVar = obj instanceof e9y ? (e9y) obj : null;
        if (e9yVar != null) {
            e9yVar.m119965w();
        }
        meetEntranceModel.m161746m();
        meetEntranceModel.m43329D();
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
    public static Unit m43321v(MeetEntranceModel meetEntranceModel, bkj0 bkj0Var) {
        bkj0Var.getClass();
        j8y j8yVar = new j8y(null, 0 == true ? 1 : 0, null, 7, null);
        j8yVar.m143916d((CoreLikers.C4870a) bkj0Var.f77082b);
        MyMeetEntryV3 myMeetEntryV3 = (MyMeetEntryV3) bkj0Var.f77083c;
        j8yVar.m143918f(myMeetEntryV3 != null ? myMeetEntryV3.oDiamondFeed : null);
        MyMeetEntryV3 myMeetEntryV4 = (MyMeetEntryV3) bkj0Var.f77083c;
        j8yVar.m143917e(myMeetEntryV4 != null ? myMeetEntryV4.nearby : null);
        meetEntranceModel.f140410b.m194461s(j8yVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static void m43322w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static Boolean m43323x(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static bkj0 m43324y(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (bkj0) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: z */
    public static pf60 m43325z(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final Act m43326A() {
        Context contextM161741f = m161741f();
        contextM161741f.getClass();
        return (Act) contextM161741f;
    }

    /* JADX INFO: renamed from: B */
    public final void m43327B() {
        Object obj = this.f140410b;
        e9y e9yVar = obj instanceof e9y ? (e9y) obj : null;
        if (e9yVar != null) {
            e9yVar.m119966x(false);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m43328C() {
        bnl0.m105524M(this.f140409a.f26492x, false);
        bnl0.m105524M(this.f140409a.f26494z, false);
        bnl0.m105524M(this.f140409a.f26484p, false);
        bnl0.m105524M(this.f140409a.f26491w, false);
        bnl0.m105524M(this.f140409a.f26471A, false);
    }

    /* JADX INFO: renamed from: D */
    public final void m43329D() {
        bzl bzlVarM119964v;
        Object obj = this.f140410b;
        e9y e9yVar = obj instanceof e9y ? (e9y) obj : null;
        if (e9yVar == null || (bzlVarM119964v = e9yVar.getCurrentMeetEntranceStrategy()) == null) {
            return;
        }
        i4g0.m138492A("e_red_dot_message_see", OMSDialogPositon.p_messages_view, jyb.m147494Y("guidance_type", bzlVarM119964v.mo107170d()));
    }

    @Override // p153l.AbstractC18810n6, p153l.rpl
    /* JADX INFO: renamed from: a */
    public void mo43330a() {
        super.mo43330a();
        this.f140409a.f26476h.setBackgroundResource(0);
        bnl0.m105558h0(this.f140409a.f26476h, qa00.m175859d(3.0f));
        if (gra.m131778z()) {
            uqb0.f180374G.m127138Y0(this.f140409a.f26476h, dbc0.f86890cf);
        } else {
            uqb0.f180374G.m127138Y0(this.f140409a.f26476h, dbc0.f86857bf);
        }
        this.f140409a.f26490v.setText(dby.m115173a());
        bnl0.m105539W(this.f140409a.f26493y, qa00.m175859d(2.0f));
        this.f140409a.f26493y.setText("快来看看我的心动瞬间吧");
        bnl0.m105509E0(this.f140409a, new View.OnClickListener() { // from class: l.m8y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeetEntranceModel.m43317r(this.f135306a, view);
            }
        });
    }

    @Override // p153l.AbstractC18810n6, p153l.rpl
    /* JADX INFO: renamed from: b */
    public void mo43331b(@NotNull ner lifecycle, @NotNull dq1<Conversation> adapter) {
        lifecycle.getClass();
        adapter.getClass();
        super.mo43331b(lifecycle, adapter);
        if (this.meeEntranceSubs == null) {
            C22421c<UserPrivilege> c22421cM146424v3 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"));
            final Function1 function1 = new Function1() { // from class: l.o8y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MeetEntranceModel.m43319t((UserPrivilege) obj);
                }
            };
            C22421c c22421cDistinctUntilChanged = c22421cM146424v3.map(new qcj() { // from class: l.p8y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MeetEntranceModel.m43316q(function1, obj);
                }
            }).distinctUntilChanged();
            C22421c<CoreLikers.C4870a> c22421cOnBackpressureLatest = CoreModule.f18264c.f20429u0.m31484u7().onBackpressureLatest();
            final Function1 function2 = new Function1() { // from class: l.q8y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MeetEntranceModel.m43318s((CoreLikers.C4870a) obj);
                }
            };
            C22421c<CoreLikers.C4870a> c22421cFilter = c22421cOnBackpressureLatest.filter(new qcj() { // from class: l.r8y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MeetEntranceModel.m43323x(function2, obj);
                }
            });
            C22421c<MyMeetEntryV3> c22421cM35707P4 = CoreModule.f18264c.f20406m1.m35707P4();
            final MeetEntranceModel$initSubscription$3 meetEntranceModel$initSubscription$3 = MeetEntranceModel$initSubscription$3.INSTANCE;
            C22421c c22421cZip = C22421c.zip(c22421cFilter, c22421cM35707P4, new rcj() { // from class: l.s8y
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return MeetEntranceModel.m43325z(meetEntranceModel$initSubscription$3, obj, obj2);
                }
            });
            C22421c<uxj0> c22421cM35705O4 = CoreModule.f18264c.f20406m1.m35705O4();
            final Function3 function3 = new Function3() { // from class: l.t8y
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MeetEntranceModel.m43315p((Boolean) obj, (pf60) obj2, (uxj0) obj3);
                }
            };
            C22421c c22421cDuringCreated = lifecycle.duringCreated(psd0.m173626s(c22421cDistinctUntilChanged, c22421cZip, c22421cM35705O4, new scj() { // from class: l.u8y
                @Override // p153l.scj
                /* JADX INFO: renamed from: a */
                public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                    return MeetEntranceModel.m43324y(function3, obj, obj2, obj3);
                }
            }));
            final Function1 function4 = new Function1() { // from class: l.v8y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MeetEntranceModel.m43321v(this.f182911a, (bkj0) obj);
                }
            };
            this.meeEntranceSubs = c22421cDuringCreated.doOnNext(new y20() { // from class: l.w8y
                @Override // p153l.y20
                public final void call(Object obj) {
                    MeetEntranceModel.m43322w(function4, obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.n8y
                @Override // p153l.y20
                public final void call(Object obj) {
                    MeetEntranceModel.m43320u(this.f140723a, (bkj0) obj);
                }
            }));
        }
    }

    @Override // p153l.AbstractC18810n6
    @NotNull
    /* JADX INFO: renamed from: g */
    public AbstractC20482u4<j8y> mo43332g() {
        return new e9y(m161741f());
    }

    @Override // p153l.AbstractC18810n6
    /* JADX INFO: renamed from: i */
    public boolean mo43333i() {
        bzl bzlVarM119964v;
        Object obj = this.f140410b;
        e9y e9yVar = obj instanceof e9y ? (e9y) obj : null;
        return (e9yVar == null || (bzlVarM119964v = e9yVar.getCurrentMeetEntranceStrategy()) == null) ? super.mo43333i() : bzlVarM119964v.mo107169c();
    }

    @Override // p153l.AbstractC18810n6
    /* JADX INFO: renamed from: n */
    public void mo43334n() {
        bzl bzlVarM119964v;
        m43328C();
        Object obj = this.f140410b;
        e9y e9yVar = obj instanceof e9y ? (e9y) obj : null;
        if (e9yVar == null || (bzlVarM119964v = e9yVar.getCurrentMeetEntranceStrategy()) == null) {
            return;
        }
        BusinessConversationView businessConversationView = this.f140409a;
        businessConversationView.getClass();
        bzlVarM119964v.mo107167a(this, businessConversationView);
    }
}
