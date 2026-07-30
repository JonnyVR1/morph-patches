package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzCallState;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\u00038\u0010X\u0090D¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014R\u001b\u0010+\u001a\u00020&8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020&8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*¨\u0006/"}, m87232d2 = {"Ll/bp2;", "Ll/jq2;", "Ll/dp2;", "", "buzzType", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ljava/lang/String;Ll/mcr;)V", "", "C0", "()V", "E0", "F0", "D0", "x0", "destroy", "a", "Ljava/lang/String;", "getBuzzType", "()Ljava/lang/String;", "Ll/c4g0;", "b", "Ll/c4g0;", "vbNotifySubscribe", "c", "callStateSubscribe", Constants.INAPP_DATA_TAG, "selfShowFaceSub", "e", "frontSubscribe", "Ll/xwx;", "f", "Ll/xwx;", "snapShotHelper", "g", "A0", "TAG", "Ljava/lang/Runnable;", "h", "Lkotlin/Lazy;", "z0", "()Ljava/lang/Runnable;", "bonusTipsRunnable", RXScreenCaptureService.KEY_INDEX, "y0", "bonusRunnable", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class bp2 extends jq2<dp2> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String buzzType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public c4g0 vbNotifySubscribe;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public c4g0 callStateSubscribe;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public c4g0 selfShowFaceSub;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public c4g0 frontSubscribe;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public xwx snapShotHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy bonusTipsRunnable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy bonusRunnable;

    /* JADX INFO: renamed from: l.bp2$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C15924a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f76597a;

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
            f76597a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp2(@NotNull String str, @NotNull mcr mcrVar) {
        super(mcrVar);
        str.getClass();
        mcrVar.getClass();
        this.buzzType = str;
        this.TAG = "BaseMediaBuzzCallPresenter";
        this.bonusTipsRunnable = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.xo2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bp2.m103020o0(this.f193775a);
            }
        });
        this.bonusRunnable = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.yo2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bp2.m103014i0(this.f199256a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public static void m103010e0(bp2 bp2Var, j760 j760Var) {
        String str = (String) j760Var.f116564a;
        if (Intrinsics.m87488d(str, bp2Var.buzzType + "_prolong_time")) {
            ((dp2) bp2Var.viewModel).mo112862y();
            return;
        }
        if (Intrinsics.m87488d(str, bp2Var.buzzType + "_like_relation")) {
            ((dp2) bp2Var.viewModel).mo112852k();
            return;
        }
        if (Intrinsics.m87488d(str, bp2Var.buzzType + "_peer_like")) {
            ((dp2) bp2Var.viewModel).mo112856p();
            return;
        }
        if (Intrinsics.m87488d(str, bp2Var.buzzType + "_peer_report")) {
            ((dp2) bp2Var.viewModel).mo112857q();
            return;
        }
        if (Intrinsics.m87488d(str, bp2Var.buzzType + "_warn")) {
            ((dp2) bp2Var.viewModel).mo112863z();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m103011f0(bp2 bp2Var, BuzzCallState buzzCallState) {
        switch (buzzCallState == null ? -1 : C15924a.f76597a[buzzCallState.ordinal()]) {
            case 1:
            case 2:
                ((dp2) bp2Var.viewModel).mo112853l();
                break;
            case 3:
                ((dp2) bp2Var.viewModel).mo112854m();
                break;
            case 4:
                ((dp2) bp2Var.viewModel).mo112855n();
                break;
            case 5:
                ((dp2) bp2Var.viewModel).mo112855n();
                break;
            case 6:
                ((dp2) bp2Var.viewModel).mo112855n();
                break;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m103012g0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m103013h0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static Runnable m103014i0(final bp2 bp2Var) {
        return new Runnable() { // from class: l.qo2
            @Override // java.lang.Runnable
            public final void run() {
                bp2.m103025t0(this.f155533a);
            }
        };
    }

    /* JADX INFO: renamed from: j0 */
    public static void m103015j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static void m103016k0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m103017l0(bp2 bp2Var, j760 j760Var) {
        return Boolean.valueOf(!Intrinsics.m87488d(j760Var.f116564a, "intl." + bp2Var.buzzType + ".notify"));
    }

    /* JADX INFO: renamed from: m0 */
    public static void m103018m0(bp2 bp2Var, Boolean bool) {
        if (bool.booleanValue()) {
            ((dp2) bp2Var.viewModel).mo112858s();
            mkd0.m154992z(bp2Var.selfShowFaceSub);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static Runnable m103020o0(final bp2 bp2Var) {
        return new Runnable() { // from class: l.po2
            @Override // java.lang.Runnable
            public final void run() {
                bp2.m103026u0(this.f150446a);
            }
        };
    }

    /* JADX INFO: renamed from: p0 */
    public static Unit m103021p0(bp2 bp2Var) {
        dp2 dp2Var = (dp2) bp2Var.viewModel;
        if (dp2Var != null) {
            dp2Var.mo112851j();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m103023r0(Throwable th) {
    }

    /* JADX INFO: renamed from: s0 */
    public static void m103024s0(bp2 bp2Var, Boolean bool) {
        xwx xwxVar = bp2Var.snapShotHelper;
        if (xwxVar != null) {
            bool.getClass();
            xwxVar.m211429e(bool.booleanValue());
        }
        if (bool.booleanValue()) {
            return;
        }
        j8w.INSTANCE.m140473a().m140453k1(m6w.INSTANCE.m153297b(((dp2) bp2Var.viewModel).getContext()) ? "switch_snapshot" : "lock_snapshot", bp2Var.buzzType);
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m103025t0(bp2 bp2Var) {
        m6w m6wVar = m6w.INSTANCE;
        dp2 dp2Var = (dp2) bp2Var.viewModel;
        if (m6wVar.m153296a(dp2Var != null ? dp2Var.getAct() : null)) {
            bp2Var.m103029D0();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m103026u0(bp2 bp2Var) {
        dp2 dp2Var;
        m6w m6wVar = m6w.INSTANCE;
        dp2 dp2Var2 = (dp2) bp2Var.viewModel;
        if (m6wVar.m153296a(dp2Var2 != null ? dp2Var2.getAct() : null) && (dp2Var = (dp2) bp2Var.viewModel) != null) {
            dp2Var.mo112861x();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A0, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b  */
    /* JADX INFO: renamed from: C0 */
    public final void m103028C0() {
        c4g0 c4g0VarSubscribe;
        C22306c c22306cDuringCreated;
        C22306c c22306cDuringCreated2;
        Act act = act();
        c4g0 c4g0VarSubscribe2 = null;
        if (act == null || (c22306cDuringCreated2 = act.duringCreated((C22306c) j8w.INSTANCE.m140473a().m140419D0(), false)) == null) {
            c4g0VarSubscribe = null;
        } else {
            final Function1 function1 = new Function1() { // from class: l.mo2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return bp2.m103017l0(this.f134822a, (j760) obj);
                }
            };
            C22306c c22306cFilter = c22306cDuringCreated2.filter(new w9j() { // from class: l.so2
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return bp2.m103013h0(function1, obj);
                }
            });
            if (c22306cFilter != null) {
                c4g0VarSubscribe = c22306cFilter.subscribe(mkd0.m154956H(new e30() { // from class: l.to2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        bp2.m103010e0(this.f171314a, (j760) obj);
                    }
                }, new e30() { // from class: l.uo2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        bp2.m103016k0((Throwable) obj);
                    }
                }));
            } else {
                c4g0VarSubscribe = null;
            }
        }
        this.vbNotifySubscribe = c4g0VarSubscribe;
        Act act2 = act();
        if (act2 != null && (c22306cDuringCreated = act2.duringCreated((C22306c) BuzzMediaCallManager.INSTANCE.m46990y(), false)) != null) {
            c4g0VarSubscribe2 = c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.vo2
                @Override // p149l.e30
                public final void call(Object obj) {
                    bp2.m103011f0(this.f182330a, (BuzzCallState) obj);
                }
            }, new e30() { // from class: l.wo2
                @Override // p149l.e30
                public final void call(Object obj) {
                    bp2.m103012g0((Throwable) obj);
                }
            }));
        }
        this.callStateSubscribe = c4g0VarSubscribe2;
        if (h6w.INSTANCE.m129529a(this.buzzType)) {
            mo103032x0();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m103029D0() {
        qa2.INSTANCE.m173681a(getTAG(), "issueBonus");
        j8w.Companion companion = j8w.INSTANCE;
        j8w j8wVarM140473a = companion.m140473a();
        dp2 dp2Var = (dp2) this.viewModel;
        j8w.m140386d0(j8wVarM140473a, dp2Var != null ? dp2Var.getAct() : null, companion.m140473a().m140417B0().getChannelToken(), this.buzzType, new Function0() { // from class: l.ro2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bp2.m103021p0(this.f160347a);
            }
        }, null, 16, null);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m103030E0() {
        C22306c c22306cDuringCreated;
        Act act = act();
        this.selfShowFaceSub = (act == null || (c22306cDuringCreated = act.duringCreated(BuzzMediaCallManager.INSTANCE.m46943G())) == null) ? null : c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.no2
            @Override // p149l.e30
            public final void call(Object obj) {
                bp2.m103018m0(this.f139814a, (Boolean) obj);
            }
        }, new e30() { // from class: l.oo2
            @Override // p149l.e30
            public final void call(Object obj) {
                bp2.m103015j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m103031F0() {
        C22306c c22306cDuringCreated;
        Act act = act();
        this.frontSubscribe = (act == null || (c22306cDuringCreated = act.duringCreated((C22306c) Act.front(), false)) == null) ? null : c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.zo2
            @Override // p149l.e30
            public final void call(Object obj) {
                bp2.m103024s0(this.f204083a, (Boolean) obj);
            }
        }, new e30() { // from class: l.ap2
            @Override // p149l.e30
            public final void call(Object obj) {
                bp2.m103023r0((Throwable) obj);
            }
        }));
        if (this.snapShotHelper == null) {
            xwx xwxVar = new xwx(this.buzzType);
            this.snapShotHelper = xwxVar;
            xwxVar.m211428d(act());
        }
    }

    @Override // p149l.q0m
    public void destroy() {
        xwx xwxVar = this.snapShotHelper;
        if (xwxVar != null) {
            xwxVar.m211426b();
        }
        e51.m114745J(m103034z0());
        e51.m114745J(m103033y0());
        mkd0.m154992z(this.vbNotifySubscribe);
        mkd0.m154992z(this.callStateSubscribe);
        mkd0.m154992z(this.frontSubscribe);
        mkd0.m154992z(this.selfShowFaceSub);
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public final Runnable m103033y0() {
        return (Runnable) this.bonusRunnable.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: z0 */
    public final Runnable m103034z0() {
        return (Runnable) this.bonusTipsRunnable.getValue();
    }

    /* JADX INFO: renamed from: x0 */
    public void mo103032x0() {
    }
}
