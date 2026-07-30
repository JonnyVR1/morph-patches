package com.p000p1.mobile.putong.core.newui.messages.business.meet;

import android.view.View;
import com.p000p1.mobile.putong.core.newui.meet.MeetAct;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p000p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.MyMeetEntryV3;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.Counter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import l.c4g0;
import l.e30;
import l.g83;
import l.j760;
import l.mcr;
import l.mkd0;
import l.n3b0;
import l.qib0;
import l.roj0;
import l.t100;
import l.upa;
import l.vwb;
import l.w9j;
import l.wp1;
import l.x2c0;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.xma;
import l.y9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.AbstractC1135q6;
import p009l.AbstractC1278w4;
import p009l.g2y;
import p009l.h0y;
import p009l.jwl;
import p009l.mzx;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "Ll/q6;", "Ll/mzx;", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "view", "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "Ll/w4;", "g", "()Ll/w4;", "Ll/mcr;", "lifecycle", "Ll/wp1;", "Lcom/p1/mobile/putong/core/data/Conversation;", "adapter", "", "b", "(Ll/mcr;Ll/wp1;)V", "n", "()V", "Lcom/p1/mobile/android/app/Act;", "A", "()Lcom/p1/mobile/android/app/Act;", "", "i", "()Z", "B", "a", "D", "C", "Ll/c4g0;", "e", "Ll/c4g0;", "meeEntranceSubs", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MeetEntranceModel extends AbstractC1135q6<mzx> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public c4g0 meeEntranceSubs;

    public MeetEntranceModel(@Nullable BusinessConversationView businessConversationView) {
        super(businessConversationView);
    }

    /* JADX INFO: renamed from: p */
    public static xaj0 m6456p(Boolean bool, j760 j760Var, roj0 roj0Var) {
        return new xaj0(bool, j760Var.a, j760Var.b);
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m6457q(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static void m6458r(MeetEntranceModel meetEntranceModel, View view) {
        zvf0.u("e_red_dot_message_see", "p_messages_view", new j760[]{vwb.Y("guidance_type", "default")});
        if (CoreModule.c.u0.v0 >= 2 || !n3b0.s((Counter) null, 1, (Object) null) || !g83.c(1)) {
            meetEntranceModel.m6467A().startActivity(MeetAct.m4580Y1(meetEntranceModel.m6467A(), "p_messages_view,e_see_banner,click", "see"));
            return;
        }
        CoreBusinessService coreBusinessServiceA = CoreModule.P().a();
        Act actM20812f = meetEntranceModel.m20812f();
        actM20812f.getClass();
        coreBusinessServiceA.l1(actM20812f, "p_messages_view,e_see_banner,click");
    }

    /* JADX INFO: renamed from: s */
    public static Boolean m6459s(CoreLikers.a aVar) {
        return Boolean.valueOf((aVar != null ? aVar.a : null) == CoreLikers.LikersTriggerBy.home_tab_msg);
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m6460t(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.L3());
    }

    /* JADX INFO: renamed from: u */
    public static void m6461u(MeetEntranceModel meetEntranceModel, xaj0 xaj0Var) {
        Object obj = meetEntranceModel.f19042b;
        h0y h0yVar = obj instanceof h0y ? (h0y) obj : null;
        if (h0yVar != null) {
            h0yVar.m15386w();
        }
        meetEntranceModel.m20817m();
        meetEntranceModel.m6470D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: v */
    public static Unit m6462v(MeetEntranceModel meetEntranceModel, xaj0 xaj0Var) {
        xaj0Var.getClass();
        mzx mzxVar = new mzx(null, null, null, 7, null);
        mzxVar.m18730d((CoreLikers.a) xaj0Var.b);
        MyMeetEntryV3 myMeetEntryV3 = (MyMeetEntryV3) xaj0Var.c;
        mzxVar.m18732f(myMeetEntryV3 != null ? myMeetEntryV3.oDiamondFeed : null);
        MyMeetEntryV3 myMeetEntryV4 = (MyMeetEntryV3) xaj0Var.c;
        mzxVar.m18731e(myMeetEntryV4 != null ? myMeetEntryV4.nearby : null);
        meetEntranceModel.f19042b.m23869s((T) mzxVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static void m6463w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static Boolean m6464x(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static xaj0 m6465y(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (xaj0) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: z */
    public static j760 m6466z(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final Act m6467A() {
        Act actM20812f = m20812f();
        actM20812f.getClass();
        return actM20812f;
    }

    /* JADX INFO: renamed from: B */
    public final void m6468B() {
        Object obj = this.f19042b;
        h0y h0yVar = obj instanceof h0y ? (h0y) obj : null;
        if (h0yVar != null) {
            h0yVar.m15387x(false);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m6469C() {
        xdl0.M(this.f19041a.f4528x, false);
        xdl0.M(this.f19041a.f4530z, false);
        xdl0.M(this.f19041a.f4520p, false);
        xdl0.M(this.f19041a.f4527w, false);
        xdl0.M(this.f19041a.f4507A, false);
    }

    /* JADX INFO: renamed from: D */
    public final void m6470D() {
        jwl jwlVarM15385v;
        Object obj = this.f19042b;
        h0y h0yVar = obj instanceof h0y ? (h0y) obj : null;
        if (h0yVar == null || (jwlVarM15385v = h0yVar.getCurrentMeetEntranceStrategy()) == null) {
            return;
        }
        zvf0.A("e_red_dot_message_see", "p_messages_view", new j760[]{vwb.Y("guidance_type", jwlVarM15385v.mo12329d())});
    }

    @Override // p009l.AbstractC1135q6, p009l.gnl
    /* JADX INFO: renamed from: a */
    public void mo6471a() {
        super.mo6471a();
        this.f19041a.f4512h.setBackgroundResource(0);
        xdl0.h0(this.f19041a.f4512h, t100.d(3.0f));
        if (upa.z()) {
            qib0.G.Y0(this.f19041a.f4512h, x2c0.oe);
        } else {
            qib0.G.Y0(this.f19041a.f4512h, x2c0.ne);
        }
        this.f19041a.f4526v.setText(g2y.m14764a());
        xdl0.W(this.f19041a.f4529y, t100.d(2.0f));
        this.f19041a.f4529y.setText("快来看看我的心动瞬间吧");
        xdl0.E0(this.f19041a, new View.OnClickListener() { // from class: l.pzx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeetEntranceModel.m6458r(this.f18979a, view);
            }
        });
    }

    @Override // p009l.AbstractC1135q6, p009l.gnl
    /* JADX INFO: renamed from: b */
    public void mo6472b(@NotNull mcr lifecycle, @NotNull wp1<Conversation> adapter) {
        lifecycle.getClass();
        adapter.getClass();
        super.mo6472b(lifecycle, adapter);
        if (this.meeEntranceSubs == null) {
            c cVarU3 = CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip"));
            final Function1 function1 = new Function1() { // from class: l.rzx
                public final Object invoke(Object obj) {
                    return MeetEntranceModel.m6460t((UserPrivilege) obj);
                }
            };
            c cVarDistinctUntilChanged = cVarU3.map(new w9j() { // from class: l.szx
                public final Object call(Object obj) {
                    return MeetEntranceModel.m6457q(function1, obj);
                }
            }).distinctUntilChanged();
            c cVarOnBackpressureLatest = CoreModule.c.u0.p7().onBackpressureLatest();
            final Function1 function2 = new Function1() { // from class: l.tzx
                public final Object invoke(Object obj) {
                    return MeetEntranceModel.m6459s((CoreLikers.a) obj);
                }
            };
            c cVarFilter = cVarOnBackpressureLatest.filter(new w9j() { // from class: l.uzx
                public final Object call(Object obj) {
                    return MeetEntranceModel.m6464x(function2, obj);
                }
            });
            c cVarP4 = CoreModule.c.m1.P4();
            final MeetEntranceModel$initSubscription$3 meetEntranceModel$initSubscription$3 = MeetEntranceModel$initSubscription$3.INSTANCE;
            c cVarZip = c.zip(cVarFilter, cVarP4, new x9j() { // from class: l.vzx
                public final Object call(Object obj, Object obj2) {
                    return MeetEntranceModel.m6466z(meetEntranceModel$initSubscription$3, obj, obj2);
                }
            });
            c cVarO4 = CoreModule.c.m1.O4();
            final Function3 function3 = new Function3() { // from class: l.wzx
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MeetEntranceModel.m6456p((Boolean) obj, (j760) obj2, (roj0) obj3);
                }
            };
            c cVarDuringCreated = lifecycle.duringCreated(mkd0.s(cVarDistinctUntilChanged, cVarZip, cVarO4, new y9j() { // from class: l.xzx
                /* JADX INFO: renamed from: a */
                public final Object m25100a(Object obj, Object obj2, Object obj3) {
                    return MeetEntranceModel.m6465y(function3, obj, obj2, obj3);
                }
            }));
            final Function1 function4 = new Function1() { // from class: l.yzx
                public final Object invoke(Object obj) {
                    return MeetEntranceModel.m6462v(this.f23309a, (xaj0) obj);
                }
            };
            this.meeEntranceSubs = cVarDuringCreated.doOnNext(new e30() { // from class: l.zzx
                public final void call(Object obj) {
                    MeetEntranceModel.m6463w(function4, obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.qzx
                public final void call(Object obj) {
                    MeetEntranceModel.m6461u(this.f19598a, (xaj0) obj);
                }
            }));
        }
    }

    @Override // p009l.AbstractC1135q6
    @NotNull
    /* JADX INFO: renamed from: g */
    public AbstractC1278w4<mzx> mo6473g() {
        return new h0y(m20812f());
    }

    @Override // p009l.AbstractC1135q6
    /* JADX INFO: renamed from: i */
    public boolean mo6474i() {
        jwl jwlVarM15385v;
        Object obj = this.f19042b;
        h0y h0yVar = obj instanceof h0y ? (h0y) obj : null;
        return (h0yVar == null || (jwlVarM15385v = h0yVar.getCurrentMeetEntranceStrategy()) == null) ? super.mo6474i() : jwlVarM15385v.mo12328c();
    }

    @Override // p009l.AbstractC1135q6
    /* JADX INFO: renamed from: n */
    public void mo6475n() {
        jwl jwlVarM15385v;
        m6469C();
        Object obj = this.f19042b;
        h0y h0yVar = obj instanceof h0y ? (h0y) obj : null;
        if (h0yVar == null || (jwlVarM15385v = h0yVar.getCurrentMeetEntranceStrategy()) == null) {
            return;
        }
        BusinessConversationView businessConversationView = this.f19041a;
        businessConversationView.getClass();
        jwlVarM15385v.mo12327a(this, businessConversationView);
    }
}
