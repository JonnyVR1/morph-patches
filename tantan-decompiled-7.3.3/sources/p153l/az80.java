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
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/az80;", "Ll/yi2;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "s0", "()V", "destroy", "a0", "k0", "", "showPurchaseDialog", "e0", "(Ljava/lang/Boolean;)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class az80 extends yi2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az80(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: l0 */
    public static C22421c m101008l0(Envelope envelope) {
        return CoreModule.f18264c.f20443y2.m216810P3();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m101009m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static void m101010n0(az80 az80Var, PrivateCustomSetting privateCustomSetting) {
        az80Var.m216005j0(true);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m101011o0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static void m101012p0(az80 az80Var, PrivateCustomSetting privateCustomSetting) {
        az80Var.m216004i0(privateCustomSetting != null ? privateCustomSetting.hasIdealTypesSelected() : false);
        if (privateCustomSetting != null) {
            m8h0 m8h0Var = (m8h0) az80Var.viewModel;
            PrivateCustomSetting privateCustomSettingMo225055clone = privateCustomSetting.mo225055clone();
            privateCustomSettingMo225055clone.getClass();
            m8h0Var.m157417h0(privateCustomSettingMo225055clone);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static C22421c m101013q0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m101014r0(az80 az80Var, Bundle bundle) {
        ((m8h0) az80Var.viewModel).m157426r();
        az80Var.m101015s0();
    }

    /* JADX INFO: renamed from: s0 */
    private final void m101015s0() {
        ((m8h0) this.viewModel).m157418i0(1);
        i4g0.m138526x("e_custom_set_start", "p_custom_set_pop");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.ty80
            @Override // p153l.y20
            public final void call(Object obj) {
                az80.m101014r0(this.f176646a, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20443y2.m216810P3()).subscribe(psd0.m173597H(new y20() { // from class: l.uy80
            @Override // p153l.y20
            public final void call(Object obj) {
                az80.m101012p0(this.f181548a, (PrivateCustomSetting) obj);
            }
        }, new y20() { // from class: l.vy80
            @Override // p153l.y20
            public final void call(Object obj) {
                az80.m101009m0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.yi2
    /* JADX INFO: renamed from: e0 */
    public void mo101016e0(@Nullable Boolean showPurchaseDialog) {
        if (!joa.m146360J3()) {
            Act act = act();
            if (act != null) {
                act.m68056e2();
            }
            if (Intrinsics.m88377d(showPurchaseDialog, Boolean.TRUE)) {
                CoreModule.f18264c.f20443y2.m216815U3();
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
        if (!joa.m146360J3()) {
            CoreModule.f18264c.f20443y2.m216822p3(((m8h0) this.viewModel).m157424p(), ((m8h0) this.viewModel).m157423n());
            return;
        }
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20443y2.m216816V3(((m8h0) this.viewModel).m157427s(), ((m8h0) this.viewModel).m157423n()));
        final Function1 function1 = new Function1() { // from class: l.wy80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return az80.m101008l0((Envelope) obj);
            }
        };
        c22421cDuringCreated.flatMap(new qcj() { // from class: l.xy80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return az80.m101013q0(function1, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.yy80
            @Override // p153l.y20
            public final void call(Object obj) {
                az80.m101010n0(this.f202086a, (PrivateCustomSetting) obj);
            }
        }, new y20() { // from class: l.zy80
            @Override // p153l.y20
            public final void call(Object obj) {
                az80.m101011o0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
