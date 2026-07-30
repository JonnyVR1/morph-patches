package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p051p1.mobile.putong.data.Envelope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/e8h0;", "Ll/yi2;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "s0", "()V", "destroy", "a0", "k0", "", "jumpH5Act", "e0", "(Ljava/lang/Boolean;)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class e8h0 extends yi2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8h0(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: l0 */
    public static void m119819l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static void m119820m0(e8h0 e8h0Var, Bundle bundle) {
        ((m8h0) e8h0Var.viewModel).m157426r();
        e8h0Var.m119826s0();
    }

    /* JADX INFO: renamed from: n0 */
    public static C22421c m119821n0(Envelope envelope) {
        return CoreModule.f18264c.f20386f2.m214430G3();
    }

    /* JADX INFO: renamed from: o0 */
    public static void m119822o0(e8h0 e8h0Var, PrivateCustomSetting privateCustomSetting) {
        e8h0Var.m216004i0(privateCustomSetting != null ? privateCustomSetting.hasIdealTypesSelected() : false);
        m8h0 m8h0Var = (m8h0) e8h0Var.viewModel;
        privateCustomSetting.getClass();
        m8h0Var.m157417h0(privateCustomSetting);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m119823p0(e8h0 e8h0Var, PrivateCustomSetting privateCustomSetting) {
        e8h0Var.m216005j0(true);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m119824q0(Throwable th) {
    }

    /* JADX INFO: renamed from: r0 */
    public static C22421c m119825r0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m119826s0() {
        ((m8h0) this.viewModel).m157418i0(1);
        i4g0.m138526x("e_custom_set_start", "p_custom_set_pop");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.x7h0
            @Override // p153l.y20
            public final void call(Object obj) {
                e8h0.m119820m0(this.f192720a, (Bundle) obj);
            }
        });
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20386f2.m214430G3());
        if (c22421cDuringCreated != 0) {
            c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.y7h0
                @Override // p153l.y20
                public final void call(Object obj) {
                    e8h0.m119822o0(this.f197781a, (PrivateCustomSetting) obj);
                }
            }, new y20() { // from class: l.z7h0
                @Override // p153l.y20
                public final void call(Object obj) {
                    e8h0.m119819l0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.yi2
    /* JADX INFO: renamed from: e0 */
    public void mo101016e0(@Nullable Boolean jumpH5Act) {
        if (!joa.m146363O3()) {
            Act act = act();
            if (act != null) {
                act.m68056e2();
            }
            if (Intrinsics.m88377d(jumpH5Act, Boolean.TRUE)) {
                CoreModule.f18264c.f20386f2.m214443w3(act());
                return;
            }
            return;
        }
        if (getIsUpdateSuccess() && getHasSetting()) {
            r1j0.m179420g("您的定制已更新，将于明天生效");
        }
        Act act2 = act();
        if (act2 != null) {
            act2.m68056e2();
        }
    }

    @Override // p153l.yi2
    /* JADX INFO: renamed from: k0 */
    public void mo101017k0() {
        C22421c<T> c22421cDuringCreated;
        if (joa.m146363O3() && (c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20386f2.m214433J3(((m8h0) this.viewModel).m157427s(), ((m8h0) this.viewModel).m157423n()))) != 0) {
            final Function1 function1 = new Function1() { // from class: l.a8h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e8h0.m119821n0((Envelope) obj);
                }
            };
            C22421c c22421cFlatMap = c22421cDuringCreated.flatMap(new qcj() { // from class: l.b8h0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return e8h0.m119825r0(function1, obj);
                }
            });
            if (c22421cFlatMap != null) {
                c22421cFlatMap.subscribe(psd0.m173597H(new y20() { // from class: l.c8h0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        e8h0.m119823p0(this.f80216a, (PrivateCustomSetting) obj);
                    }
                }, new y20() { // from class: l.d8h0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        e8h0.m119824q0((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
