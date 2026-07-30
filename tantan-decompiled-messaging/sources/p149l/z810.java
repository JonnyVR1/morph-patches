package p149l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallSwitchToLeadRoleInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"Ll/z810;", "Ll/ho2;", "D", "Ll/pat;", "Ll/bsm;", BaseSei.INFO, "Ll/j510;", "coreModule", "<init>", "(Ll/bsm;Ll/j510;)V", "", Constants.KEY_T, "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "b4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "i4", "", OMSTemplateModeType.toast, "Z3", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;)V", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallSwitchToLeadRoleInviteMessage;", "message", "h4", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallSwitchToLeadRoleInviteMessage;)V", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallSwitchToLeadRoleInvite;", "invite", "c4", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkMultiCallMessage$MultiCallSwitchToLeadRoleInvite;)V", "a4", RXScreenCaptureService.KEY_INDEX, "Ll/j510;", "Ll/dd80;", "j", "Lkotlin/Lazy;", "Y3", "()Ll/dd80;", "inviteDialog", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class z810<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final j510<D> coreModule;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy inviteDialog;

    /* JADX INFO: renamed from: l.z810$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C21647a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f202096a;

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
            f202096a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z810(@NotNull bsm<D> bsmVar, @NotNull j510<D> j510Var) {
        super(bsmVar);
        bsmVar.getClass();
        j510Var.getClass();
        this.coreModule = j510Var;
        this.inviteDialog = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.l810
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z810.m217554J3(this.f126781a);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public static dd80 m217554J3(z810 z810Var) {
        return new dd80.C16336a(z810Var.f188513f).m110961P(false).m110964S(i3c0.f110864T3).m110995x0(R$string.f46587B8, new Object[0]).m110991t0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m110968W(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m110971Z(R$string.f47574v).m110960O();
    }

    /* JADX INFO: renamed from: K3 */
    public static void m217555K3(z810 z810Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        z810Var.m217578i4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m217557M3(z810 z810Var, LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite) {
        z810Var.duringCreated(LivingNormalApiProvider.m71240H6(multiCallSwitchToLeadRoleInvite.getId(), "reject")).subscribe(ffw.m121197h(new e30() { // from class: l.o810
            @Override // p149l.e30
            public final void call(Object obj) {
                z810.m217570f4((BLiveMultiCallSwitchToLeadRoleInvite) obj);
            }
        }));
        zvf0.m220399u("e_video_room_main_mic_confirm", z810Var.mo77274R2(), vwb.m200311Y("main_mic_click_type", "refuse"));
    }

    /* JADX INFO: renamed from: N3 */
    public static void m217558N3(z810 z810Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        z810Var.m217575b4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m217560P3(int i, LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite, z810 z810Var, long j) {
        long j2 = i;
        if (j < j2) {
            z810Var.m217572Y3().m110913U(w8u.m202218u(R$string.f47299i9, Long.valueOf(j2 - j)));
            return;
        }
        LivingNormalApiProvider.m71240H6(multiCallSwitchToLeadRoleInvite.getId(), "reject").subscribe(ffw.m121197h(new e30() { // from class: l.n810
            @Override // p149l.e30
            public final void call(Object obj) {
                z810.m217571g4((BLiveMultiCallSwitchToLeadRoleInvite) obj);
            }
        }));
        z810Var.m217572Y3().dismiss();
        lsi0.m151593w(R$string.f46903Q);
        zvf0.m220399u("e_video_room_main_mic_confirm", z810Var.mo77274R2(), vwb.m200311Y("main_mic_click_type", "auto_refuse"));
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m217562S3(z810 z810Var, Long l2) {
        return Boolean.valueOf(!z810Var.m217572Y3().isShowing());
    }

    /* JADX INFO: renamed from: T3 */
    public static Boolean m217563T3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m217564U3(final z810 z810Var, LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite) {
        z810Var.duringCreated(LivingNormalApiProvider.m71240H6(multiCallSwitchToLeadRoleInvite.getId(), "accept")).subscribe(ffw.m121197h(new e30() { // from class: l.m810
            @Override // p149l.e30
            public final void call(Object obj) {
                z810.m217568d4(this.f132506a, (BLiveMultiCallSwitchToLeadRoleInvite) obj);
            }
        }));
        zvf0.m220399u("e_video_room_main_mic_confirm", z810Var.mo77274R2(), vwb.m200311Y("main_mic_click_type", "accept"));
    }

    /* JADX INFO: renamed from: V3 */
    public static void m217565V3(z810 z810Var, LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage multiCallSwitchToLeadRoleInviteMessage) {
        multiCallSwitchToLeadRoleInviteMessage.getClass();
        z810Var.m217577h4(multiCallSwitchToLeadRoleInviteMessage);
    }

    /* JADX INFO: renamed from: X3 */
    public static void m217567X3(z810 z810Var, u5t u5tVar) {
        BLiveMultiCall bLiveMultiCall = u5tVar.f174754a;
        bLiveMultiCall.getClass();
        z810Var.m217573Z3(bLiveMultiCall, u5tVar.f174755b);
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m217568d4(z810 z810Var, BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite) {
        z810Var.duringCreated(LivingNormalApiProvider.m71322Q7(z810Var.coreModule.m139803e4().f44400id)).subscribe(ffw.m121197h(new e30() { // from class: l.p810
            @Override // p149l.e30
            public final void call(Object obj) {
                z810.m217569e4((BLiveMultiCall) obj);
            }
        }));
        lsi0.m151593w(R$string.f46718H7);
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m217570f4(BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite) {
        lsi0.m151593w(R$string.f46903Q);
    }

    /* JADX INFO: renamed from: Y3 */
    public final dd80 m217572Y3() {
        Object value = this.inviteDialog.getValue();
        value.getClass();
        return (dd80) value;
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m217573Z3(BLiveMultiCall call, String toast) {
        this.coreModule.m139818t4();
        if (toast == null || toast.length() == 0) {
            return;
        }
        lsi0.m151595y(toast);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m217574a4(LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite invite) {
        int i = R$string.f47385m8;
        String toUserName = invite.getToUserName();
        toUserName.getClass();
        lsi0.m151595y(w8u.m202218u(i, r610.m178017x(toUserName, 0, 2, null)));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m217575b4(BLiveMultiCall call) {
        m217572Y3().dismiss();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m217576c4(final LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite invite) {
        final int showSeconds = (int) invite.getShowSeconds();
        m217572Y3().dismiss();
        dd80 dd80VarM217572Y3 = m217572Y3();
        int i = R$string.f47277h9;
        String ownerUserName = invite.getOwnerUserName();
        ownerUserName.getClass();
        dd80VarM217572Y3.m110918Z(w8u.m202218u(i, r610.m178017x(ownerUserName, 0, 2, null)));
        m217572Y3().m110915W(new Runnable() { // from class: l.u810
            @Override // java.lang.Runnable
            public final void run() {
                z810.m217564U3(this.f175090a, invite);
            }
        });
        m217572Y3().m110913U(w8u.m202218u(R$string.f47299i9, Integer.valueOf(showSeconds)));
        m217572Y3().m110914V(new Runnable() { // from class: l.v810
            @Override // java.lang.Runnable
            public final void run() {
                z810.m217557M3(this.f180442a, invite);
            }
        });
        m217572Y3().show();
        C22306c c22306cTake = duringCreated(m129300I3(m206027E2().m132135h2(1, TimeUnit.SECONDS), true)).take(showSeconds);
        final Function1 function1 = new Function1() { // from class: l.w810
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z810.m217562S3(this.f185135a, (Long) obj);
            }
        };
        c22306cTake.takeUntil(new w9j() { // from class: l.x810
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return z810.m217563T3(function1, obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.y810
            @Override // p149l.e30
            public final void call(Object obj) {
                z810.m217560P3(showSeconds, invite, this, ((Long) obj).longValue());
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public final void m217577h4(LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage message) {
        LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage.Type type = message.getType();
        int i = type == null ? -1 : C21647a.f202096a[type.ordinal()];
        if (i == 1) {
            LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite invite = message.getInvite();
            invite.getClass();
            m217576c4(invite);
        } else if (i == 2) {
            LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite invite2 = message.getInvite();
            invite2.getClass();
            m217574a4(invite2);
        } else {
            if (i != 3) {
                return;
            }
            LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInvite invite3 = message.getInvite();
            invite3.getClass();
            m217574a4(invite3);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m217578i4(BLiveMultiCall call) {
        this.coreModule.m139818t4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().MultiCallEvent.receiveInviteLeadRoleMessage(), new e30() { // from class: l.q810
            @Override // p149l.e30
            public final void call(Object obj) {
                z810.m217565V3(this.f153112a, (LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage) obj);
            }
        });
        m129304h3(m206028F2().MultiCallEvent.switchToLeadRole(), new e30() { // from class: l.r810
            @Override // p149l.e30
            public final void call(Object obj) {
                z810.m217555K3(this.f158115a, (BLiveMultiCall) obj);
            }
        });
        m129304h3(m206028F2().MultiCallEvent.cancelLeadRole(), new e30() { // from class: l.s810
            @Override // p149l.e30
            public final void call(Object obj) {
                z810.m217567X3(this.f162980a, (u5t) obj);
            }
        });
        m129304h3(m206028F2().MultiCallEvent.hangUpSelfCall(), new e30() { // from class: l.t810
            @Override // p149l.e30
            public final void call(Object obj) {
                z810.m217558N3(this.f168798a, (BLiveMultiCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m217569e4(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: renamed from: g4 */
    public static final void m217571g4(BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite) {
    }
}
