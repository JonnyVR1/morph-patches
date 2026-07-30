package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R?\u0010\u001f\u001a&\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000f0\u000f \u001a*\u0012\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Ll/wgn0;", "Ll/rwn0;", "D", "Ll/hj2;", "Ll/ngn0;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "a4", "()Ll/ngn0;", "", Constants.KEY_T, "()V", "X3", "", RXScreenCaptureService.KEY_INDEX, "b4", "(I)V", FirebaseAnalytics.Param.INDEX, "c4", "k", "Ll/dum;", "Y3", "()Ll/dum;", "Lrx/subjects/b;", "kotlin.jvm.PlatformType", BLiveStormDanmakuGiftResourceType.f45292l, "Lkotlin/Lazy;", "Z3", "()Lrx/subjects/b;", "subject", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wgn0<D extends rwn0> extends hj2<D, ngn0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final dum<D> curInfo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy subject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgn0(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
        this.subject = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.ogn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return wgn0.m206213O3();
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public static C22508b m206213O3() {
        return C22508b.m222767b();
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m206214P3(Integer num) {
        return Boolean.valueOf(num.intValue() > 500);
    }

    /* JADX INFO: renamed from: R3 */
    public static void m206215R3(wgn0 wgn0Var, Boolean bool) {
        ngn0 ngn0Var = (ngn0) wgn0Var.viewModel;
        bool.getClass();
        ngn0Var.m163003L(bool.booleanValue());
    }

    /* JADX INFO: renamed from: S3 */
    public static Integer m206216S3(Throwable th) {
        return 0;
    }

    /* JADX INFO: renamed from: T3 */
    public static Boolean m206217T3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m206218U3(wgn0 wgn0Var, Integer num) {
        num.getClass();
        wgn0Var.m206226c4(num.intValue());
    }

    /* JADX INFO: renamed from: V3 */
    public static Boolean m206219V3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m206220W3(wgn0 wgn0Var, Integer num) {
        V v2 = wgn0Var.viewModel;
        return Boolean.valueOf(v2 != 0 && ((ngn0) v2).isShowing());
    }

    /* JADX INFO: renamed from: X3 */
    public final void m206221X3() {
        V v2 = this.viewModel;
        v2.getClass();
        ((ngn0) v2).mo72910j();
    }

    @NotNull
    /* JADX INFO: renamed from: Y3 */
    public final dum<D> m206222Y3() {
        return this.curInfo;
    }

    /* JADX INFO: renamed from: Z3 */
    public final C22508b<Integer> m206223Z3() {
        return (C22508b) this.subject.getValue();
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: a4, reason: merged with bridge method [inline-methods] */
    public ngn0 mo76862K3() {
        return new ngn0();
    }

    /* JADX INFO: renamed from: b4 */
    public final void m206225b4(int i) {
        m206223Z3().onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m206226c4(int index) {
        fhw.m125605a("[voice][call]", "showFunctionDialogBoard" + index);
        if (index < 0) {
            m206221X3();
            return;
        }
        m135319L3();
        mo135321N3();
        ((ngn0) this.viewModel).m162999E(index);
        ahn0.m97863e(this);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c) m213811F2().VoiceVirtualLiveEvent.showFunctionsDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.pgn0
            @Override // p153l.y20
            public final void call(Object obj) {
                wgn0.m206218U3(this.f152317a, (Integer) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(m206223Z3());
        final Function1 function1 = new Function1() { // from class: l.qgn0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wgn0.m206220W3(this.f157444a, (Integer) obj);
            }
        };
        C22421c c22421cOnErrorReturn = c22421cDuringCreated.filter(new qcj() { // from class: l.rgn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wgn0.m206217T3(function1, obj);
            }
        }).distinctUntilChanged().onErrorReturn(new qcj() { // from class: l.sgn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wgn0.m206216S3((Throwable) obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.tgn0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wgn0.m206214P3((Integer) obj);
            }
        };
        c22421cOnErrorReturn.map(new qcj() { // from class: l.ugn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wgn0.m206219V3(function2, obj);
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.vgn0
            @Override // p153l.y20
            public final void call(Object obj) {
                wgn0.m206215R3(this.f184049a, (Boolean) obj);
            }
        }));
    }
}
