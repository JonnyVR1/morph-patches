package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.presenter;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.presenter.MultiCallApplyDlgPresenter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.bf10;
import p153l.cd10;
import p153l.dhw;
import p153l.dum;
import p153l.fp10;
import p153l.hj2;
import p153l.jn10;
import p153l.jr10;
import p153l.o1j0;
import p153l.ou40;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.v7t;
import p153l.vb10;
import p153l.xau;
import p153l.y20;
import p153l.y910;
import p153l.yj5;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/presenter/MultiCallApplyDlgPresenter;", "Ll/hj2;", "Ll/ou40;", "Ll/y910;", "Ll/dum;", BaseSei.INFO, "Ll/jn10;", "coreModule", "<init>", "(Ll/dum;Ll/jn10;)V", "Ll/v7t;", "callMessage", "", "f4", "(Ll/v7t;)V", "e4", "()Ll/y910;", Constants.KEY_T, "()V", "", "category", "Z3", "(Ljava/lang/String;)V", "n", "d4", "c4", "", "h4", "(Ll/v7t;)Z", "g4", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "i4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "k", "Ll/jn10;", "getCoreModule", "()Ll/jn10;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "applyMultiCallData", "", "m", "I", "position", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class MultiCallApplyDlgPresenter extends hj2<ou40, y910> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final jn10 coreModule;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public BLiveMultiCall applyMultiCallData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallApplyDlgPresenter(@NotNull dum<ou40> dumVar, @NotNull jn10 jn10Var) {
        super(dumVar);
        dumVar.getClass();
        jn10Var.getClass();
        this.coreModule = jn10Var;
        this.position = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public static void m76849O3(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, pf60 pf60Var) {
        y910 y910Var;
        F f = pf60Var.f152156a;
        f.getClass();
        int iIntValue = ((Number) f).intValue();
        if (bf10.m103804J(multiCallApplyDlgPresenter)) {
            return;
        }
        if (iIntValue >= 0) {
            multiCallApplyDlgPresenter.position = iIntValue;
            multiCallApplyDlgPresenter.m135319L3();
            multiCallApplyDlgPresenter.m76864c4();
            multiCallApplyDlgPresenter.mo135321N3();
            return;
        }
        if (iIntValue != -100 || (y910Var = (y910) multiCallApplyDlgPresenter.viewModel) == null) {
            return;
        }
        y910Var.mo72910j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2] */
    /* JADX INFO: renamed from: P3 */
    public static Unit m76850P3(final MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, String str) {
        String strM103795A = bf10.m103795A(multiCallApplyDlgPresenter);
        ?? M213810E2 = multiCallApplyDlgPresenter.m213810E2();
        M213810E2.getClass();
        String strM202191k = ((ou40) multiCallApplyDlgPresenter.m213810E2()).m202191k();
        strM202191k.getClass();
        String str2 = cd10.f81084l;
        str2.getClass();
        int i = multiCallApplyDlgPresenter.position;
        String strM168449D0 = ((ou40) multiCallApplyDlgPresenter.m213810E2()).m168449D0();
        strM168449D0.getClass();
        multiCallApplyDlgPresenter.m135318J3(LivingNormalApiProvider.m72393E3(bf10.m103838n(M213810E2, strM103795A, strM202191k, "", str, str2, i, strM168449D0, ""))).subscribe(dhw.m115826e(new y20() { // from class: l.ha10
            @Override // p153l.y20
            public final void call(Object obj) {
                MultiCallApplyDlgPresenter.m76859a4(this.f108462a, (BLiveMultiCall) obj);
            }
        }, new y20() { // from class: l.ia10
            @Override // p153l.y20
            public final void call(Object obj) {
                MultiCallApplyDlgPresenter.m76860b4(this.f113541a, (Throwable) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m76851R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m76852S3(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, Throwable th) {
        th.getClass();
        bf10.m103834j(th);
        y910 y910Var = (y910) multiCallApplyDlgPresenter.viewModel;
        if (y910Var != null) {
            y910Var.mo72910j();
        }
        multiCallApplyDlgPresenter.applyMultiCallData = null;
    }

    /* JADX INFO: renamed from: T3 */
    public static void m76853T3(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, BLiveMultiCall bLiveMultiCall) {
        multiCallApplyDlgPresenter.applyMultiCallData = bLiveMultiCall;
        multiCallApplyDlgPresenter.coreModule.f121736m = false;
        multiCallApplyDlgPresenter.m213811F2().MultiCallEvent.refreshCallView().mo199273j(Boolean.FALSE);
        y910 y910Var = (y910) multiCallApplyDlgPresenter.viewModel;
        if (y910Var != null) {
            y910Var.m214812B(bLiveMultiCall);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static void m76854U3(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, v7t v7tVar) {
        v7tVar.getClass();
        multiCallApplyDlgPresenter.m76861f4(v7tVar);
    }

    /* JADX INFO: renamed from: V3 */
    public static pf60 m76855V3(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m76856W3(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, v7t v7tVar) {
        return Boolean.valueOf(multiCallApplyDlgPresenter.coreModule.m190592j4(v7tVar.f182817a));
    }

    /* JADX INFO: renamed from: a4 */
    public static final void m76859a4(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, BLiveMultiCall bLiveMultiCall) {
        multiCallApplyDlgPresenter.applyMultiCallData = bLiveMultiCall;
        multiCallApplyDlgPresenter.coreModule.f121736m = true;
        multiCallApplyDlgPresenter.m213811F2().MultiCallEvent.refreshCallView().mo199273j(Boolean.TRUE);
        if (fp10.m126514a(bLiveMultiCall)) {
            bLiveMultiCall.getClass();
            bf10.m103833i0(multiCallApplyDlgPresenter, bLiveMultiCall, "owner apply");
            if (bf10.m103804J(multiCallApplyDlgPresenter)) {
                o1j0.m165651y(xau.m209910t(R$string.f48256n9));
            }
            ((y910) multiCallApplyDlgPresenter.viewModel).mo72910j();
            return;
        }
        multiCallApplyDlgPresenter.m76869i4(multiCallApplyDlgPresenter.applyMultiCallData);
        if (bf10.m103804J(multiCallApplyDlgPresenter)) {
            o1j0.m165651y(xau.m209910t(R$string.f48256n9));
        } else {
            o1j0.m165651y(xau.m209910t(R$string.f47654L7));
        }
        ((y910) multiCallApplyDlgPresenter.viewModel).m214812B(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m76860b4(MultiCallApplyDlgPresenter multiCallApplyDlgPresenter, Throwable th) {
        ((y910) multiCallApplyDlgPresenter.viewModel).mo72910j();
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: f4 */
    private final void m76861f4(v7t callMessage) {
        y910 y910Var;
        if (yj5.m216389b(this.viewModel) && ((y910) this.viewModel).isShowing() && Intrinsics.m88377d(callMessage.f182819c, cd10.f81056H) && (y910Var = (y910) this.viewModel) != null) {
            y910Var.mo72910j();
        }
        if (m76867g4(callMessage) && m76868h4(callMessage)) {
            this.applyMultiCallData = null;
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m76863Z3(@NotNull final String category) {
        category.getClass();
        jr10.INSTANCE.m146666c("micro_confirm", "join", m213815L2());
        vb10.INSTANCE.m200665o(this, category, new Function0() { // from class: l.ga10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallApplyDlgPresenter.m76850P3(this.f102948a, category);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m76864c4() {
        y910 y910Var = (y910) this.viewModel;
        String str = ((ou40) m213810E2()).m168532l0().m61308fp().url;
        str.getClass();
        y910Var.m214811A(str);
        if (yj5.m216388a(this.applyMultiCallData)) {
            m76869i4(null);
            ((y910) this.viewModel).m214812B(null);
        } else {
            BLiveMultiCall bLiveMultiCall = this.applyMultiCallData;
            bLiveMultiCall.getClass();
            m76869i4(bLiveMultiCall);
            ((y910) this.viewModel).m214812B(bLiveMultiCall);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m76865d4() {
        if (yj5.m216389b(this.applyMultiCallData)) {
            jr10.INSTANCE.m146666c("micro_feedback", "cancel", m213815L2());
            BLiveMultiCall bLiveMultiCall = this.applyMultiCallData;
            bLiveMultiCall.getClass();
            m135318J3(LivingNormalApiProvider.m72519S3(bLiveMultiCall.f45248id)).subscribe(dhw.m115826e(new y20() { // from class: l.ea10
                @Override // p153l.y20
                public final void call(Object obj) {
                    MultiCallApplyDlgPresenter.m76853T3(this.f92724a, (BLiveMultiCall) obj);
                }
            }, new y20() { // from class: l.fa10
                @Override // p153l.y20
                public final void call(Object obj) {
                    MultiCallApplyDlgPresenter.m76852S3(this.f97931a, (Throwable) obj);
                }
            }));
            return;
        }
        y910 y910Var = (y910) this.viewModel;
        if (y910Var != null) {
            y910Var.m214812B(null);
        }
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: e4, reason: merged with bridge method [inline-methods] */
    public y910 mo76862K3() {
        Act act = this.f196918e.f90815a;
        act.getClass();
        return new y910(act);
    }

    /* JADX INFO: renamed from: g4 */
    public final boolean m76867g4(v7t callMessage) {
        BLiveMultiCall bLiveMultiCall = this.applyMultiCallData;
        if (bLiveMultiCall != null) {
            return Intrinsics.m88377d(bLiveMultiCall.f45248id, callMessage.f182817a.f45248id);
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m76868h4(v7t callMessage) {
        return Intrinsics.m88377d(callMessage.f182819c, cd10.f81056H) || Intrinsics.m88377d(callMessage.f182819c, cd10.f81058J) || Intrinsics.m88377d(callMessage.f182819c, cd10.f81059K) || Intrinsics.m88377d(callMessage.f182819c, cd10.f81057I);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m76869i4(BLiveMultiCall call) {
        if (fp10.m126514a(call) || fp10.m126515b(call)) {
            jr10.INSTANCE.m146670o("micro_feedback", m213815L2());
        } else {
            jr10.INSTANCE.m146670o("micro_confirm", m213815L2());
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m76865d4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        C22421c<T> c22421cDuringCreated = duringCreated(((ou40) m213810E2()).m168545q1().m98250R());
        final Function1 function1 = new Function1() { // from class: l.z910
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallApplyDlgPresenter.m76856W3(this.f203438a, (v7t) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.aa10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return MultiCallApplyDlgPresenter.m76851R3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.ba10
            @Override // p153l.y20
            public final void call(Object obj) {
                MultiCallApplyDlgPresenter.m76854U3(this.f75636a, (v7t) obj);
            }
        }));
        C22421c<Integer> c22421cM199270g = m213811F2().MultiCallEvent.openApplyDlg().m199270g();
        C22421c<Boolean> c22421cM199272i = m213811F2().MultiCallEvent.hasGetMultiCallList().m199272i(true);
        final MultiCallApplyDlgPresenter$validState$3 multiCallApplyDlgPresenter$validState$3 = MultiCallApplyDlgPresenter$validState$3.INSTANCE;
        duringCreated(psd0.m173625r(c22421cM199270g, c22421cM199272i, new rcj() { // from class: l.ca10
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return MultiCallApplyDlgPresenter.m76855V3(multiCallApplyDlgPresenter$validState$3, obj, obj2);
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.da10
            @Override // p153l.y20
            public final void call(Object obj) {
                MultiCallApplyDlgPresenter.m76849O3(this.f85833a, (pf60) obj);
            }
        }));
    }
}
