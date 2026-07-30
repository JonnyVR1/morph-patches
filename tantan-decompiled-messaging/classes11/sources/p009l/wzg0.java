package p009l;

import android.os.Bundle;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p1.mobile.putong.data.Envelope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.w9j;
import l.xma;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll/wzg0;", "Ll/ri2;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "s0", "()V", "destroy", "a0", "k0", "", "jumpH5Act", "e0", "(Ljava/lang/Boolean;)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class wzg0 extends ri2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzg0(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: l0 */
    public static void m24588l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static void m24589m0(wzg0 wzg0Var, Bundle bundle) {
        ((e0h0) ((jq2) wzg0Var).viewModel).m13603r();
        wzg0Var.m24595s0();
    }

    /* JADX INFO: renamed from: n0 */
    public static c m24590n0(Envelope envelope) {
        return CoreModule.c.f2.G3();
    }

    /* JADX INFO: renamed from: o0 */
    public static void m24591o0(wzg0 wzg0Var, PrivateCustomSetting privateCustomSetting) {
        wzg0Var.m21665i0(privateCustomSetting != null ? privateCustomSetting.hasIdealTypesSelected() : false);
        e0h0 e0h0Var = (e0h0) ((jq2) wzg0Var).viewModel;
        privateCustomSetting.getClass();
        e0h0Var.m13593h0(privateCustomSetting);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m24592p0(wzg0 wzg0Var, PrivateCustomSetting privateCustomSetting) {
        wzg0Var.m21666j0(true);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m24593q0(Throwable th) {
    }

    /* JADX INFO: renamed from: r0 */
    public static c m24594r0(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m24595s0() {
        ((e0h0) ((jq2) this).viewModel).m13594i0(1);
        zvf0.x("e_custom_set_start", "p_custom_set_pop");
    }

    /* JADX INFO: renamed from: a0 */
    public void m24596a0() {
        super.a0();
        creates(new e30() { // from class: l.pzg0
            public final void call(Object obj) {
                wzg0.m24589m0(this.f18976a, (Bundle) obj);
            }
        });
        c cVarDuringCreated = duringCreated(CoreModule.c.f2.G3());
        if (cVarDuringCreated != null) {
            cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.qzg0
                public final void call(Object obj) {
                    wzg0.m24591o0(this.f19593a, (PrivateCustomSetting) obj);
                }
            }, new e30() { // from class: l.rzg0
                public final void call(Object obj) {
                    wzg0.m24588l0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p009l.ri2
    /* JADX INFO: renamed from: e0 */
    public void mo21662e0(@Nullable Boolean jumpH5Act) {
        if (!xma.N3()) {
            Act act = act();
            if (act != null) {
                act.finish();
            }
            if (Intrinsics.d(jumpH5Act, Boolean.TRUE)) {
                CoreModule.c.f2.w3(act());
                return;
            }
            return;
        }
        if (getIsUpdateSuccess() && getHasSetting()) {
            osi0.g("您的定制已更新，将于明天生效");
        }
        Act act2 = act();
        if (act2 != null) {
            act2.finish();
        }
    }

    @Override // p009l.ri2
    /* JADX INFO: renamed from: k0 */
    public void mo21667k0() {
        c cVarDuringCreated;
        if (xma.N3() && (cVarDuringCreated = duringCreated(CoreModule.c.f2.J3(((e0h0) ((jq2) this).viewModel).m13604s(), ((e0h0) ((jq2) this).viewModel).m13600n()))) != null) {
            final Function1 function1 = new Function1() { // from class: l.szg0
                public final Object invoke(Object obj) {
                    return wzg0.m24590n0((Envelope) obj);
                }
            };
            c cVarFlatMap = cVarDuringCreated.flatMap(new w9j() { // from class: l.tzg0
                public final Object call(Object obj) {
                    return wzg0.m24594r0(function1, obj);
                }
            });
            if (cVarFlatMap != null) {
                cVarFlatMap.subscribe(mkd0.H(new e30() { // from class: l.uzg0
                    public final void call(Object obj) {
                        wzg0.m24592p0(this.f21400a, (PrivateCustomSetting) obj);
                    }
                }, new e30() { // from class: l.vzg0
                    public final void call(Object obj) {
                        wzg0.m24593q0((Throwable) obj);
                    }
                }));
            }
        }
    }

    public void destroy() {
    }
}
