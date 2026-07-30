package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzCallState;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\u00038\u0010X\u0090D¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014R\u001b\u0010+\u001a\u00020&8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020&8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*¨\u0006/"}, m88121d2 = {"Ll/sp2;", "Ll/ar2;", "Ll/up2;", "", "buzzType", "Ll/ner;", "lifecycleProvider", "<init>", "(Ljava/lang/String;Ll/ner;)V", "", "C0", "()V", "E0", "F0", "D0", "x0", "destroy", "a", "Ljava/lang/String;", "getBuzzType", "()Ljava/lang/String;", "Ll/kcg0;", "b", "Ll/kcg0;", "vbNotifySubscribe", "c", "callStateSubscribe", Constants.INAPP_DATA_TAG, "selfShowFaceSub", "e", "frontSubscribe", "Ll/u5y;", "f", "Ll/u5y;", "snapShotHelper", "g", "A0", "TAG", "Ljava/lang/Runnable;", "h", "Lkotlin/Lazy;", "z0", "()Ljava/lang/Runnable;", "bonusTipsRunnable", RXScreenCaptureService.KEY_INDEX, "y0", "bonusRunnable", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class sp2 extends ar2<up2> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String buzzType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public kcg0 vbNotifySubscribe;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public kcg0 callStateSubscribe;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public kcg0 selfShowFaceSub;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public kcg0 frontSubscribe;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public u5y snapShotHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy bonusTipsRunnable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy bonusRunnable;

    /* JADX INFO: renamed from: l.sp2$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C20127a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f170007a;

        static {
            int[] iArr = new int[BuzzCallState.values().length];
            try {
                iArr[BuzzCallState.RECEIVE_PHONE_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BuzzCallState.CONNECTION_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BuzzCallState.MEMBER_LEAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BuzzCallState.PEER_VIDEO_REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BuzzCallState.PEER_VIDEO_JOIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BuzzCallState.RECEIVE_PEER_VIDEO_FIRST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f170007a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp2(@NotNull String str, @NotNull ner nerVar) {
        super(nerVar);
        str.getClass();
        nerVar.getClass();
        this.buzzType = str;
        this.TAG = "BaseMediaBuzzCallPresenter";
        this.bonusTipsRunnable = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.op2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sp2.m187311o0(this.f148410a);
            }
        });
        this.bonusRunnable = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.pp2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sp2.m187305i0(this.f153479a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public static void m187301e0(sp2 sp2Var, pf60 pf60Var) {
        String str = (String) pf60Var.f152156a;
        if (Intrinsics.m88377d(str, sp2Var.buzzType + "_prolong_time")) {
            ((up2) sp2Var.viewModel).mo151615y();
            return;
        }
        if (Intrinsics.m88377d(str, sp2Var.buzzType + "_like_relation")) {
            ((up2) sp2Var.viewModel).mo151607k();
            return;
        }
        if (Intrinsics.m88377d(str, sp2Var.buzzType + "_peer_like")) {
            ((up2) sp2Var.viewModel).mo151611p();
            return;
        }
        if (Intrinsics.m88377d(str, sp2Var.buzzType + "_peer_report")) {
            ((up2) sp2Var.viewModel).mo151612q();
            return;
        }
        if (Intrinsics.m88377d(str, sp2Var.buzzType + "_warn")) {
            ((up2) sp2Var.viewModel).mo151616z();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m187302f0(sp2 sp2Var, BuzzCallState buzzCallState) {
        switch (buzzCallState == null ? -1 : C20127a.f170007a[buzzCallState.ordinal()]) {
            case 1:
            case 2:
                ((up2) sp2Var.viewModel).mo151608l();
                break;
            case 3:
                ((up2) sp2Var.viewModel).mo151609m();
                break;
            case 4:
                ((up2) sp2Var.viewModel).mo155146n();
                break;
            case 5:
                ((up2) sp2Var.viewModel).mo155146n();
                break;
            case 6:
                ((up2) sp2Var.viewModel).mo155146n();
                break;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m187303g0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m187304h0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static Runnable m187305i0(final sp2 sp2Var) {
        return new Runnable() { // from class: l.hp2
            @Override // java.lang.Runnable
            public final void run() {
                sp2.m187316t0(this.f110976a);
            }
        };
    }

    /* JADX INFO: renamed from: j0 */
    public static void m187306j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static void m187307k0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m187308l0(sp2 sp2Var, pf60 pf60Var) {
        return Boolean.valueOf(!Intrinsics.m88377d(pf60Var.f152156a, "intl." + sp2Var.buzzType + ".notify"));
    }

    /* JADX INFO: renamed from: m0 */
    public static void m187309m0(sp2 sp2Var, Boolean bool) {
        if (bool.booleanValue()) {
            ((up2) sp2Var.viewModel).mo155151s();
            psd0.m173633z(sp2Var.selfShowFaceSub);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static Runnable m187311o0(final sp2 sp2Var) {
        return new Runnable() { // from class: l.gp2
            @Override // java.lang.Runnable
            public final void run() {
                sp2.m187317u0(this.f105406a);
            }
        };
    }

    /* JADX INFO: renamed from: p0 */
    public static Unit m187312p0(sp2 sp2Var) {
        up2 up2Var = (up2) sp2Var.viewModel;
        if (up2Var != null) {
            up2Var.mo151606j();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m187314r0(Throwable th) {
    }

    /* JADX INFO: renamed from: s0 */
    public static void m187315s0(sp2 sp2Var, Boolean bool) {
        u5y u5yVar = sp2Var.snapShotHelper;
        if (u5yVar != null) {
            bool.getClass();
            u5yVar.m194637e(bool.booleanValue());
        }
        if (bool.booleanValue()) {
            return;
        }
        haw.INSTANCE.m134320a().m134300k1(k8w.INSTANCE.m148753b(((up2) sp2Var.viewModel).getContext()) ? "switch_snapshot" : "lock_snapshot", sp2Var.buzzType);
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m187316t0(sp2 sp2Var) {
        k8w k8wVar = k8w.INSTANCE;
        up2 up2Var = (up2) sp2Var.viewModel;
        if (k8wVar.m148752a(up2Var != null ? up2Var.getAct() : null)) {
            sp2Var.m187319D0();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m187317u0(sp2 sp2Var) {
        up2 up2Var;
        k8w k8wVar = k8w.INSTANCE;
        up2 up2Var2 = (up2) sp2Var.viewModel;
        if (k8wVar.m148752a(up2Var2 != null ? up2Var2.getAct() : null) && (up2Var = (up2) sp2Var.viewModel) != null) {
            up2Var.mo151614x();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A0, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b  */
    /* JADX INFO: renamed from: C0 */
    public final void m187318C0() {
        kcg0 kcg0VarSubscribe;
        C22421c c22421cDuringCreated;
        C22421c c22421cDuringCreated2;
        Act act = act();
        kcg0 kcg0VarSubscribe2 = null;
        if (act == null || (c22421cDuringCreated2 = act.duringCreated((C22421c) haw.INSTANCE.m134320a().m134266D0(), false)) == null) {
            kcg0VarSubscribe = null;
        } else {
            final Function1 function1 = new Function1() { // from class: l.dp2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return sp2.m187308l0(this.f90023a, (pf60) obj);
                }
            };
            C22421c c22421cFilter = c22421cDuringCreated2.filter(new qcj() { // from class: l.jp2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return sp2.m187304h0(function1, obj);
                }
            });
            if (c22421cFilter != null) {
                kcg0VarSubscribe = c22421cFilter.subscribe(psd0.m173597H(new y20() { // from class: l.kp2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        sp2.m187301e0(this.f127825a, (pf60) obj);
                    }
                }, new y20() { // from class: l.lp2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        sp2.m187307k0((Throwable) obj);
                    }
                }));
            } else {
                kcg0VarSubscribe = null;
            }
        }
        this.vbNotifySubscribe = kcg0VarSubscribe;
        Act act2 = act();
        if (act2 != null && (c22421cDuringCreated = act2.duringCreated((C22421c) BuzzMediaCallManager.INSTANCE.m48173y(), false)) != null) {
            kcg0VarSubscribe2 = c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.mp2
                @Override // p153l.y20
                public final void call(Object obj) {
                    sp2.m187302f0(this.f137866a, (BuzzCallState) obj);
                }
            }, new y20() { // from class: l.np2
                @Override // p153l.y20
                public final void call(Object obj) {
                    sp2.m187303g0((Throwable) obj);
                }
            }));
        }
        this.callStateSubscribe = kcg0VarSubscribe2;
        if (f8w.INSTANCE.m124565a(this.buzzType)) {
            mo106535x0();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m187319D0() {
        xa2.INSTANCE.m209830a(getTAG(), "issueBonus");
        haw.Companion companion = haw.INSTANCE;
        haw hawVarM134320a = companion.m134320a();
        up2 up2Var = (up2) this.viewModel;
        haw.m134233d0(hawVarM134320a, up2Var != null ? up2Var.getAct() : null, companion.m134320a().m134264B0().getChannelToken(), this.buzzType, new Function0() { // from class: l.ip2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sp2.m187312p0(this.f116250a);
            }
        }, null, 16, null);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m187320E0() {
        C22421c c22421cDuringCreated;
        Act act = act();
        this.selfShowFaceSub = (act == null || (c22421cDuringCreated = act.duringCreated(BuzzMediaCallManager.INSTANCE.m48126G())) == null) ? null : c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.ep2
            @Override // p153l.y20
            public final void call(Object obj) {
                sp2.m187309m0(this.f95197a, (Boolean) obj);
            }
        }, new y20() { // from class: l.fp2
            @Override // p153l.y20
            public final void call(Object obj) {
                sp2.m187306j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m187321F0() {
        C22421c c22421cDuringCreated;
        Act act = act();
        this.frontSubscribe = (act == null || (c22421cDuringCreated = act.duringCreated((C22421c) Act.front(), false)) == null) ? null : c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.qp2
            @Override // p153l.y20
            public final void call(Object obj) {
                sp2.m187315s0(this.f158818a, (Boolean) obj);
            }
        }, new y20() { // from class: l.rp2
            @Override // p153l.y20
            public final void call(Object obj) {
                sp2.m187314r0((Throwable) obj);
            }
        }));
        if (this.snapShotHelper == null) {
            u5y u5yVar = new u5y(this.buzzType);
            this.snapShotHelper = u5yVar;
            u5yVar.m194636d(act());
        }
    }

    @Override // p153l.k3m
    public void destroy() {
        u5y u5yVar = this.snapShotHelper;
        if (u5yVar != null) {
            u5yVar.m194634b();
        }
        l51.m152890J(m187323z0());
        l51.m152890J(m187322y0());
        psd0.m173633z(this.vbNotifySubscribe);
        psd0.m173633z(this.callStateSubscribe);
        psd0.m173633z(this.frontSubscribe);
        psd0.m173633z(this.selfShowFaceSub);
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public final Runnable m187322y0() {
        return (Runnable) this.bonusRunnable.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: z0 */
    public final Runnable m187323z0() {
        return (Runnable) this.bonusTipsRunnable.getValue();
    }

    /* JADX INFO: renamed from: x0 */
    public void mo106535x0() {
    }
}
