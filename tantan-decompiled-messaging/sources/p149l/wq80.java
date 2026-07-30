package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p046p1.mobile.putong.data.Envelope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/wq80;", "Ll/ri2;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "s0", "()V", "destroy", "a0", "k0", "", "showPurchaseDialog", "e0", "(Ljava/lang/Boolean;)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class wq80 extends ri2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq80(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: l0 */
    public static C22306c m205028l0(Envelope envelope) {
        return CoreModule.f17545c.f19701y2.m155341P3();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m205029m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static void m205030n0(wq80 wq80Var, PrivateCustomSetting privateCustomSetting) {
        wq80Var.m179475j0(true);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m205031o0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static void m205032p0(wq80 wq80Var, PrivateCustomSetting privateCustomSetting) {
        wq80Var.m179474i0(privateCustomSetting != null ? privateCustomSetting.hasIdealTypesSelected() : false);
        if (privateCustomSetting != null) {
            e0h0 e0h0Var = (e0h0) wq80Var.viewModel;
            PrivateCustomSetting privateCustomSettingMo223809clone = privateCustomSetting.mo223809clone();
            privateCustomSettingMo223809clone.getClass();
            e0h0Var.m114221h0(privateCustomSettingMo223809clone);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static C22306c m205033q0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m205034r0(wq80 wq80Var, Bundle bundle) {
        ((e0h0) wq80Var.viewModel).m114230r();
        wq80Var.m205035s0();
    }

    /* JADX INFO: renamed from: s0 */
    private final void m205035s0() {
        ((e0h0) this.viewModel).m114222i0(1);
        zvf0.m220402x("e_custom_set_start", "p_custom_set_pop");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.pq80
            @Override // p149l.e30
            public final void call(Object obj) {
                wq80.m205034r0(this.f150768a, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19701y2.m155341P3()).subscribe(mkd0.m154956H(new e30() { // from class: l.qq80
            @Override // p149l.e30
            public final void call(Object obj) {
                wq80.m205032p0(this.f155872a, (PrivateCustomSetting) obj);
            }
        }, new e30() { // from class: l.rq80
            @Override // p149l.e30
            public final void call(Object obj) {
                wq80.m205029m0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.ri2
    /* JADX INFO: renamed from: e0 */
    public void mo179471e0(@Nullable Boolean showPurchaseDialog) {
        if (!xma.m210046I3()) {
            Act act = act();
            if (act != null) {
                act.m66873d2();
            }
            if (Intrinsics.m87488d(showPurchaseDialog, Boolean.TRUE)) {
                CoreModule.f17545c.f19701y2.m155346U3();
                return;
            }
            return;
        }
        if (getIsUpdateSuccess() && getHasSetting()) {
            osi0.m165783g("您的定制已更新，将于明天生效");
        }
        Act act2 = act();
        if (act2 != null) {
            act2.m66873d2();
        }
    }

    @Override // p149l.ri2
    /* JADX INFO: renamed from: k0 */
    public void mo179476k0() {
        if (!xma.m210046I3()) {
            CoreModule.f17545c.f19701y2.m155353p3(((e0h0) this.viewModel).m114228p(), ((e0h0) this.viewModel).m114227n());
            return;
        }
        C22306c<T> c22306cDuringCreated = duringCreated(CoreModule.f17545c.f19701y2.m155347V3(((e0h0) this.viewModel).m114231s(), ((e0h0) this.viewModel).m114227n()));
        final Function1 function1 = new Function1() { // from class: l.sq80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wq80.m205028l0((Envelope) obj);
            }
        };
        c22306cDuringCreated.flatMap(new w9j() { // from class: l.tq80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return wq80.m205033q0(function1, obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.uq80
            @Override // p149l.e30
            public final void call(Object obj) {
                wq80.m205030n0(this.f177716a, (PrivateCustomSetting) obj);
            }
        }, new e30() { // from class: l.vq80
            @Override // p149l.e30
            public final void call(Object obj) {
                wq80.m205031o0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
