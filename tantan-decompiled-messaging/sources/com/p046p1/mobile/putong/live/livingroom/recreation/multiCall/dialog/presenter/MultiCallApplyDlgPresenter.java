package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.presenter;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.presenter.MultiCallApplyDlgPresenter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.am40;
import p149l.bsm;
import p149l.e30;
import p149l.ffw;
import p149l.j760;
import p149l.l310;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o110;
import p149l.r610;
import p149l.s410;
import p149l.u5t;
import p149l.vg10;
import p149l.w8u;
import p149l.w9j;
import p149l.x9j;
import p149l.xi5;
import p149l.ze10;
import p149l.zi10;
import p149l.zi2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/presenter/MultiCallApplyDlgPresenter;", "Ll/zi2;", "Ll/am40;", "Ll/o110;", "Ll/bsm;", BaseSei.INFO, "Ll/ze10;", "coreModule", "<init>", "(Ll/bsm;Ll/ze10;)V", "Ll/u5t;", "callMessage", "", "f4", "(Ll/u5t;)V", "e4", "()Ll/o110;", Constants.KEY_T, "()V", "", "category", "Z3", "(Ljava/lang/String;)V", "n", "d4", "c4", "", "h4", "(Ll/u5t;)Z", "g4", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "i4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "k", "Ll/ze10;", "getCoreModule", "()Ll/ze10;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "applyMultiCallData", "", "m", "I", "position", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class MultiCallApplyDlgPresenter extends zi2<am40, o110> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final ze10 coreModule;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public BLiveMultiCall applyMultiCallData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallApplyDlgPresenter(@NotNull bsm<am40> bsmVar, @NotNull ze10 ze10Var) {
        super(bsmVar);
        bsmVar.getClass();
        ze10Var.getClass();
        this.coreModule = ze10Var;
        this.position = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public static void m75666O3(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, j760 j760Var) {
        o110 o110Var;
        F f = j760Var.f116564a;
        f.getClass();
        int iIntValue = ((Number) f).intValue();
        if (r610.m177975J(multiCallApplyDlgPresenter)) {
            return;
        }
        if (iIntValue >= 0) {
            multiCallApplyDlgPresenter.position = iIntValue;
            multiCallApplyDlgPresenter.m218910L3();
            multiCallApplyDlgPresenter.m75681c4();
            multiCallApplyDlgPresenter.mo168244N3();
            return;
        }
        if (iIntValue != -100 || (o110Var = (o110) multiCallApplyDlgPresenter.viewModel) == null) {
            return;
        }
        o110Var.mo71727j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2] */
    /* JADX INFO: renamed from: P3 */
    public static Unit m75667P3(final MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, String str) {
        String strM177966A = r610.m177966A(multiCallApplyDlgPresenter);
        ?? M206027E2 = multiCallApplyDlgPresenter.m206027E2();
        M206027E2.getClass();
        String strM149814k = ((am40) multiCallApplyDlgPresenter.m206027E2()).m149814k();
        strM149814k.getClass();
        String str2 = s410.f162246l;
        str2.getClass();
        int i = multiCallApplyDlgPresenter.position;
        String strM132060D0 = ((am40) multiCallApplyDlgPresenter.m206027E2()).m132060D0();
        strM132060D0.getClass();
        multiCallApplyDlgPresenter.m218909J3(LivingNormalApiProvider.m71210E3(r610.m178009n(M206027E2, strM177966A, strM149814k, "", str, str2, i, strM132060D0, ""))).subscribe(ffw.m121194e(new e30() { // from class: l.x110
            @Override // p149l.e30
            public final void call(Object obj) {
                MultiCallApplyDlgPresenter.m75676a4(this.f189012a, (BLiveMultiCall) obj);
            }
        }, new e30() { // from class: l.y110
            @Override // p149l.e30
            public final void call(Object obj) {
                MultiCallApplyDlgPresenter.m75677b4(this.f195370a, (Throwable) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m75668R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m75669S3(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, Throwable th) {
        th.getClass();
        r610.m178005j(th);
        o110 o110Var = (o110) multiCallApplyDlgPresenter.viewModel;
        if (o110Var != null) {
            o110Var.mo71727j();
        }
        multiCallApplyDlgPresenter.applyMultiCallData = null;
    }

    /* JADX INFO: renamed from: T3 */
    public static void m75670T3(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, BLiveMultiCall bLiveMultiCall) {
        multiCallApplyDlgPresenter.applyMultiCallData = bLiveMultiCall;
        multiCallApplyDlgPresenter.coreModule.f202763m = false;
        multiCallApplyDlgPresenter.m206028F2().MultiCallEvent.refreshCallView().mo172463j(Boolean.FALSE);
        o110 o110Var = (o110) multiCallApplyDlgPresenter.viewModel;
        if (o110Var != null) {
            o110Var.m162227B(bLiveMultiCall);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static void m75671U3(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, u5t u5tVar) {
        u5tVar.getClass();
        multiCallApplyDlgPresenter.m75678f4(u5tVar);
    }

    /* JADX INFO: renamed from: V3 */
    public static j760 m75672V3(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m75673W3(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, u5t u5tVar) {
        return Boolean.valueOf(multiCallApplyDlgPresenter.coreModule.m139808j4(u5tVar.f174754a));
    }

    /* JADX INFO: renamed from: a4 */
    public static final void m75676a4(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, BLiveMultiCall bLiveMultiCall) {
        multiCallApplyDlgPresenter.applyMultiCallData = bLiveMultiCall;
        multiCallApplyDlgPresenter.coreModule.f202763m = true;
        multiCallApplyDlgPresenter.m206028F2().MultiCallEvent.refreshCallView().mo172463j(Boolean.TRUE);
        if (vg10.m198309a(bLiveMultiCall)) {
            bLiveMultiCall.getClass();
            r610.m178004i0(multiCallApplyDlgPresenter, bLiveMultiCall, "owner apply");
            if (r610.m177975J(multiCallApplyDlgPresenter)) {
                lsi0.m151595y(w8u.m202217t(R$string.f47408n9));
            }
            ((o110) multiCallApplyDlgPresenter.viewModel).mo71727j();
            return;
        }
        multiCallApplyDlgPresenter.m75686i4(multiCallApplyDlgPresenter.applyMultiCallData);
        if (r610.m177975J(multiCallApplyDlgPresenter)) {
            lsi0.m151595y(w8u.m202217t(R$string.f47408n9));
        } else {
            lsi0.m151595y(w8u.m202217t(R$string.f46806L7));
        }
        ((o110) multiCallApplyDlgPresenter.viewModel).m162227B(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m75677b4(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, Throwable th) {
        ((o110) multiCallApplyDlgPresenter.viewModel).mo71727j();
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: f4 */
    private final void m75678f4(u5t callMessage) {
        o110 o110Var;
        if (xi5.m208915b(this.viewModel) && ((o110) this.viewModel).isShowing() && Intrinsics.m87488d(callMessage.f174756c, s410.f162218H) && (o110Var = (o110) this.viewModel) != null) {
            o110Var.mo71727j();
        }
        if (m75684g4(callMessage) && m75685h4(callMessage)) {
            this.applyMultiCallData = null;
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m75680Z3(@NotNull final String category) {
        category.getClass();
        zi10.INSTANCE.m218902c("micro_confirm", "join", m206032L2());
        l310.INSTANCE.m148350o(this, category, new Function0() { // from class: l.w110
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallApplyDlgPresenter.m75667P3(this.f183966a, category);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m75681c4() {
        o110 o110Var = (o110) this.viewModel;
        String str = ((am40) m206027E2()).m132146l0().m60124fp().url;
        str.getClass();
        o110Var.m162226A(str);
        if (xi5.m208914a(this.applyMultiCallData)) {
            m75686i4(null);
            ((o110) this.viewModel).m162227B(null);
        } else {
            BLiveMultiCall bLiveMultiCall = this.applyMultiCallData;
            bLiveMultiCall.getClass();
            m75686i4(bLiveMultiCall);
            ((o110) this.viewModel).m162227B(bLiveMultiCall);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m75682d4() {
        if (xi5.m208915b(this.applyMultiCallData)) {
            zi10.INSTANCE.m218902c("micro_feedback", "cancel", m206032L2());
            BLiveMultiCall bLiveMultiCall = this.applyMultiCallData;
            bLiveMultiCall.getClass();
            m218909J3(LivingNormalApiProvider.m71336S3(bLiveMultiCall.f44400id)).subscribe(ffw.m121194e(new e30() { // from class: l.u110
                @Override // p149l.e30
                public final void call(Object obj) {
                    MultiCallApplyDlgPresenter.m75670T3(this.f172965a, (BLiveMultiCall) obj);
                }
            }, new e30() { // from class: l.v110
                @Override // p149l.e30
                public final void call(Object obj) {
                    MultiCallApplyDlgPresenter.m75669S3(this.f179191a, (Throwable) obj);
                }
            }));
            return;
        }
        o110 o110Var = (o110) this.viewModel;
        if (o110Var != null) {
            o110Var.m162227B(null);
        }
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: e4, reason: merged with bridge method [inline-methods] */
    public o110 mo75679K3() {
        Act act = this.f188512e.f77095a;
        act.getClass();
        return new o110(act);
    }

    /* JADX INFO: renamed from: g4 */
    public final boolean m75684g4(u5t callMessage) {
        BLiveMultiCall bLiveMultiCall = this.applyMultiCallData;
        if (bLiveMultiCall != null) {
            return Intrinsics.m87488d(bLiveMultiCall.f44400id, callMessage.f174754a.f44400id);
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m75685h4(u5t callMessage) {
        return Intrinsics.m87488d(callMessage.f174756c, s410.f162218H) || Intrinsics.m87488d(callMessage.f174756c, s410.f162220J) || Intrinsics.m87488d(callMessage.f174756c, s410.f162221K) || Intrinsics.m87488d(callMessage.f174756c, s410.f162219I);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m75686i4(BLiveMultiCall call) {
        if (vg10.m198309a(call) || vg10.m198310b(call)) {
            zi10.INSTANCE.m218906o("micro_feedback", m206032L2());
        } else {
            zi10.INSTANCE.m218906o("micro_confirm", m206032L2());
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m75682d4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        C22306c<T> c22306cDuringCreated = duringCreated(((am40) m206027E2()).m132160q1().m189068R());
        final Function1 function1 = new Function1() { // from class: l.p110
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallApplyDlgPresenter.m75673W3(this.f146640a, (u5t) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.q110
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return MultiCallApplyDlgPresenter.m75668R3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.r110
            @Override // p149l.e30
            public final void call(Object obj) {
                MultiCallApplyDlgPresenter.m75671U3(this.f157225a, (u5t) obj);
            }
        }));
        C22306c<Integer> c22306cM172460g = m206028F2().MultiCallEvent.openApplyDlg().m172460g();
        C22306c<Boolean> c22306cM172462i = m206028F2().MultiCallEvent.hasGetMultiCallList().m172462i(true);
        final MultiCallApplyDlgPresenter$validState$3 multiCallApplyDlgPresenter$validState$3 = MultiCallApplyDlgPresenter$validState$3.INSTANCE;
        duringCreated(mkd0.m154984r(c22306cM172460g, c22306cM172462i, new x9j() { // from class: l.s110
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return MultiCallApplyDlgPresenter.m75672V3(multiCallApplyDlgPresenter$validState$3, obj, obj2);
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.t110
            @Override // p149l.e30
            public final void call(Object obj) {
                MultiCallApplyDlgPresenter.m75666O3(this.f167281a, (j760) obj);
            }
        }));
    }
}
