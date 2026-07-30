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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll/wq80;", "Ll/ri2;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "s0", "()V", "destroy", "a0", "k0", "", "showPurchaseDialog", "e0", "(Ljava/lang/Boolean;)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class wq80 extends ri2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq80(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: l0 */
    public static c m24453l0(Envelope envelope) {
        return CoreModule.c.y2.P3();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m24454m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static void m24455n0(wq80 wq80Var, PrivateCustomSetting privateCustomSetting) {
        wq80Var.m21666j0(true);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m24456o0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static void m24457p0(wq80 wq80Var, PrivateCustomSetting privateCustomSetting) {
        wq80Var.m21665i0(privateCustomSetting != null ? privateCustomSetting.hasIdealTypesSelected() : false);
        if (privateCustomSetting != null) {
            e0h0 e0h0Var = (e0h0) ((jq2) wq80Var).viewModel;
            PrivateCustomSetting privateCustomSettingClone = privateCustomSetting.clone();
            privateCustomSettingClone.getClass();
            e0h0Var.m13593h0(privateCustomSettingClone);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static c m24458q0(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m24459r0(wq80 wq80Var, Bundle bundle) {
        ((e0h0) ((jq2) wq80Var).viewModel).m13603r();
        wq80Var.m24460s0();
    }

    /* JADX INFO: renamed from: s0 */
    private final void m24460s0() {
        ((e0h0) ((jq2) this).viewModel).m13594i0(1);
        zvf0.x("e_custom_set_start", "p_custom_set_pop");
    }

    /* JADX INFO: renamed from: a0 */
    public void m24461a0() {
        super.a0();
        creates(new e30() { // from class: l.pq80
            public final void call(Object obj) {
                wq80.m24459r0(this.f18838a, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.y2.P3()).subscribe(mkd0.H(new e30() { // from class: l.qq80
            public final void call(Object obj) {
                wq80.m24457p0(this.f19444a, (PrivateCustomSetting) obj);
            }
        }, new e30() { // from class: l.rq80
            public final void call(Object obj) {
                wq80.m24454m0((Throwable) obj);
            }
        }));
    }

    @Override // p009l.ri2
    /* JADX INFO: renamed from: e0 */
    public void mo21662e0(@Nullable Boolean showPurchaseDialog) {
        if (!xma.I3()) {
            Act act = act();
            if (act != null) {
                act.finish();
            }
            if (Intrinsics.d(showPurchaseDialog, Boolean.TRUE)) {
                CoreModule.c.y2.U3();
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
        if (!xma.I3()) {
            CoreModule.c.y2.p3(((e0h0) ((jq2) this).viewModel).m13601p(), ((e0h0) ((jq2) this).viewModel).m13600n());
            return;
        }
        c cVarDuringCreated = duringCreated(CoreModule.c.y2.V3(((e0h0) ((jq2) this).viewModel).m13604s(), ((e0h0) ((jq2) this).viewModel).m13600n()));
        final Function1 function1 = new Function1() { // from class: l.sq80
            public final Object invoke(Object obj) {
                return wq80.m24453l0((Envelope) obj);
            }
        };
        cVarDuringCreated.flatMap(new w9j() { // from class: l.tq80
            public final Object call(Object obj) {
                return wq80.m24458q0(function1, obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.uq80
            public final void call(Object obj) {
                wq80.m24455n0(this.f21312a, (PrivateCustomSetting) obj);
            }
        }, new e30() { // from class: l.vq80
            public final void call(Object obj) {
                wq80.m24456o0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
