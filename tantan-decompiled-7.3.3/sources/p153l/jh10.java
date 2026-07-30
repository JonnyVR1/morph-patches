package p153l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallSwitchToLeadRoleInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m88121d2 = {"Ll/jh10;", "Ll/oo2;", "D", "Ll/qct;", "Ll/dum;", BaseSei.INFO, "Ll/td10;", "coreModule", "<init>", "(Ll/dum;Ll/td10;)V", "", Constants.KEY_T, "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "b4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "i4", "", OMSTemplateModeType.toast, "Z3", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;)V", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallSwitchToLeadRoleInviteMessage;", "message", "h4", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallSwitchToLeadRoleInviteMessage;)V", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallSwitchToLeadRoleInvite;", "invite", "c4", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallSwitchToLeadRoleInvite;)V", "a4", RXScreenCaptureService.KEY_INDEX, "Ll/td10;", "Ll/jl80;", "j", "Lkotlin/Lazy;", "Y3", "()Ll/jl80;", "inviteDialog", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class jh10<D extends oo2> extends qct<D> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final td10<D> coreModule;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy inviteDialog;

    /* JADX INFO: renamed from: l.jh10$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C17951a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f120800a;

        static {
            int[] iArr = new int[LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage.Type.values().length];
            try {
                iArr[LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage.Type.switchToLeadRoleInvite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage.Type.switchToLeadRoleReject.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage.Type.switchToLeadRoleTimeout.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f120800a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh10(@NotNull dum<D> dumVar, @NotNull td10<D> td10Var) {
        super(dumVar);
        dumVar.getClass();
        td10Var.getClass();
        this.coreModule = td10Var;
        this.inviteDialog = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.vg10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jh10.m144826J3(this.f183994a);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public static jl80 m144826J3(jh10 jh10Var) {
        return new jl80.C17971a(jh10Var.f196919f).m146021P(false).m146024S(obc0.f146192T3).m146055x0(R$string.f47435B8, new Object[0]).m146051t0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m146028W(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m146031Z(R$string.f48422v).m146020O();
    }

    /* JADX INFO: renamed from: K3 */
    public static void m144827K3(jh10 jh10Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        jh10Var.m144850i4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m144829M3(jh10 jh10Var, LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite) {
        jh10Var.duringCreated(LivingNormalApiProvider.m72423H6(multiCallSwitchToLeadRoleInvite.getId(), "reject")).subscribe(dhw.m115829h(new y20() { // from class: l.yg10
            @Override // p153l.y20
            public final void call(Object obj) {
                jh10.m144842f4((BLiveMultiCallSwitchToLeadRoleInvite) obj);
            }
        }));
        i4g0.m138523u("e_video_room_main_mic_confirm", jh10Var.mo78457R2(), jyb.m147494Y("main_mic_click_type", "refuse"));
    }

    /* JADX INFO: renamed from: N3 */
    public static void m144830N3(jh10 jh10Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        jh10Var.m144847b4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m144832P3(int i, LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite, jh10 jh10Var, long j) {
        long j2 = i;
        if (j < j2) {
            jh10Var.m144844Y3().m145973U(xau.m209911u(R$string.f48147i9, Long.valueOf(j2 - j)));
            return;
        }
        LivingNormalApiProvider.m72423H6(multiCallSwitchToLeadRoleInvite.getId(), "reject").subscribe(dhw.m115829h(new y20() { // from class: l.xg10
            @Override // p153l.y20
            public final void call(Object obj) {
                jh10.m144843g4((BLiveMultiCallSwitchToLeadRoleInvite) obj);
            }
        }));
        jh10Var.m144844Y3().dismiss();
        o1j0.m165649w(R$string.f47751Q);
        i4g0.m138523u("e_video_room_main_mic_confirm", jh10Var.mo78457R2(), jyb.m147494Y("main_mic_click_type", "auto_refuse"));
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m144834S3(jh10 jh10Var, Long l2) {
        return Boolean.valueOf(!jh10Var.m144844Y3().isShowing());
    }

    /* JADX INFO: renamed from: T3 */
    public static Boolean m144835T3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m144836U3(final jh10 jh10Var, LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite) {
        jh10Var.duringCreated(LivingNormalApiProvider.m72423H6(multiCallSwitchToLeadRoleInvite.getId(), "accept")).subscribe(dhw.m115829h(new y20() { // from class: l.wg10
            @Override // p153l.y20
            public final void call(Object obj) {
                jh10.m144840d4(this.f188907a, (BLiveMultiCallSwitchToLeadRoleInvite) obj);
            }
        }));
        i4g0.m138523u("e_video_room_main_mic_confirm", jh10Var.mo78457R2(), jyb.m147494Y("main_mic_click_type", "accept"));
    }

    /* JADX INFO: renamed from: V3 */
    public static void m144837V3(jh10 jh10Var, LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage multiCallSwitchToLeadRoleInviteMessage) {
        multiCallSwitchToLeadRoleInviteMessage.getClass();
        jh10Var.m144849h4(multiCallSwitchToLeadRoleInviteMessage);
    }

    /* JADX INFO: renamed from: X3 */
    public static void m144839X3(jh10 jh10Var, v7t v7tVar) {
        BLiveMultiCall bLiveMultiCall = v7tVar.f182817a;
        bLiveMultiCall.getClass();
        jh10Var.m144845Z3(bLiveMultiCall, v7tVar.f182818b);
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m144840d4(jh10 jh10Var, BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite) {
        jh10Var.duringCreated(LivingNormalApiProvider.m72505Q7(jh10Var.coreModule.m190587e4().f45248id)).subscribe(dhw.m115829h(new y20() { // from class: l.zg10
            @Override // p153l.y20
            public final void call(Object obj) {
                jh10.m144841e4((BLiveMultiCall) obj);
            }
        }));
        o1j0.m165649w(R$string.f47566H7);
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m144842f4(BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite) {
        o1j0.m165649w(R$string.f47751Q);
    }

    /* JADX INFO: renamed from: Y3 */
    public final jl80 m144844Y3() {
        Object value = this.inviteDialog.getValue();
        value.getClass();
        return (jl80) value;
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m144845Z3(BLiveMultiCall call, String toast) {
        this.coreModule.m190602t4();
        if (toast == null || toast.length() == 0) {
            return;
        }
        o1j0.m165651y(toast);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m144846a4(LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite invite) {
        int i = R$string.f48233m8;
        String toUserName = invite.getToUserName();
        toUserName.getClass();
        o1j0.m165651y(xau.m209911u(i, bf10.m103846x(toUserName, 0, 2, null)));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m144847b4(BLiveMultiCall call) {
        m144844Y3().dismiss();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m144848c4(final LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite invite) {
        final int showSeconds = (int) invite.getShowSeconds();
        m144844Y3().dismiss();
        jl80 jl80VarM144844Y3 = m144844Y3();
        int i = R$string.f48125h9;
        String ownerUserName = invite.getOwnerUserName();
        ownerUserName.getClass();
        jl80VarM144844Y3.m145978Z(xau.m209911u(i, bf10.m103846x(ownerUserName, 0, 2, null)));
        m144844Y3().m145975W(new Runnable() { // from class: l.eh10
            @Override // java.lang.Runnable
            public final void run() {
                jh10.m144836U3(this.f93996a, invite);
            }
        });
        m144844Y3().m145973U(xau.m209911u(R$string.f48147i9, Integer.valueOf(showSeconds)));
        m144844Y3().m145974V(new Runnable() { // from class: l.fh10
            @Override // java.lang.Runnable
            public final void run() {
                jh10.m144829M3(this.f99001a, invite);
            }
        });
        m144844Y3().show();
        C22421c c22421cTake = duringCreated(m138859I3(m213810E2().m168521h2(1, TimeUnit.SECONDS), true)).take(showSeconds);
        final Function1 function1 = new Function1() { // from class: l.gh10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return jh10.m144834S3(this.f104062a, (Long) obj);
            }
        };
        c22421cTake.takeUntil(new qcj() { // from class: l.hh10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jh10.m144835T3(function1, obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.ih10
            @Override // p153l.y20
            public final void call(Object obj) {
                jh10.m144832P3(showSeconds, invite, this, ((Long) obj).longValue());
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public final void m144849h4(LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage message) {
        LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage.Type type = message.getType();
        int i = type == null ? -1 : C17951a.f120800a[type.ordinal()];
        if (i == 1) {
            LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite invite = message.getInvite();
            invite.getClass();
            m144848c4(invite);
        } else if (i == 2) {
            LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite invite2 = message.getInvite();
            invite2.getClass();
            m144846a4(invite2);
        } else {
            if (i != 3) {
                return;
            }
            LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite invite3 = message.getInvite();
            invite3.getClass();
            m144846a4(invite3);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m144850i4(BLiveMultiCall call) {
        this.coreModule.m190602t4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().MultiCallEvent.receiveInviteLeadRoleMessage(), new y20() { // from class: l.ah10
            @Override // p153l.y20
            public final void call(Object obj) {
                jh10.m144837V3(this.f71302a, (LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage) obj);
            }
        });
        m138863h3(m213811F2().MultiCallEvent.switchToLeadRole(), new y20() { // from class: l.bh10
            @Override // p153l.y20
            public final void call(Object obj) {
                jh10.m144827K3(this.f76706a, (BLiveMultiCall) obj);
            }
        });
        m138863h3(m213811F2().MultiCallEvent.cancelLeadRole(), new y20() { // from class: l.ch10
            @Override // p153l.y20
            public final void call(Object obj) {
                jh10.m144839X3(this.f81755a, (v7t) obj);
            }
        });
        m138863h3(m213811F2().MultiCallEvent.hangUpSelfCall(), new y20() { // from class: l.dh10
            @Override // p153l.y20
            public final void call(Object obj) {
                jh10.m144830N3(this.f88410a, (BLiveMultiCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m144841e4(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: renamed from: g4 */
    public static final void m144843g4(BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite) {
    }
}
