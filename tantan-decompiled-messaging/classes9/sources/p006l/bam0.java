package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.VisitorSetting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.jq2;
import l.mkd0;
import l.osi0;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, d2 = {"Ll/bam0;", "Ll/jq2;", "Ll/oam0;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "a0", "()V", "destroy", "", "hasPermission", "n0", "(Z)V", "needPermission", "o0", "Lcom/p1/mobile/putong/core/data/VisitorSetting;", "userMomentSetting", "p0", "(Lcom/p1/mobile/putong/core/data/VisitorSetting;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Z", "m0", "()Z", "setHasPermission", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bam0 extends jq2<oam0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean hasPermission;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bam0(@NotNull Act act) {
        super(act);
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m12584e0(bam0 bam0Var, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        bam0Var.m12596p0(visitorSetting);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m12585f0(bam0 bam0Var, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        bam0Var.m12596p0(visitorSetting);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m12586g0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            osi0.g("此功能24小時只能修改一次");
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m12587h0(VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        return Boolean.valueOf(visitorSetting.visitorPermission);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m12588i0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static void m12589j0(bam0 bam0Var, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        boolean z = visitorSetting.visitorPermission;
        bam0Var.hasPermission = z;
        ((oam0) ((jq2) bam0Var).viewModel).m20463E(z);
        CoreModule.f1534c.f3657n2.m22272g4(bam0Var.hasPermission);
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m12590k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m12591l0(bam0 bam0Var, Bundle bundle) {
        ((oam0) ((jq2) bam0Var).viewModel).m20473r();
    }

    /* JADX INFO: renamed from: a0 */
    public void m12592a0() {
        super.a0();
        creates(new e30() { // from class: l.t9m0
            public final void call(Object obj) {
                bam0.m12591l0(this.f21969a, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f1534c.f3657n2.m22249J3(CoreModule.m1850H().userId())).subscribe(mkd0.H(new e30() { // from class: l.u9m0
            public final void call(Object obj) {
                bam0.m12584e0(this.f23450a, (VisitorSetting) obj);
            }
        }, new e30() { // from class: l.v9m0
            public final void call(Object obj) {
                bam0.m12588i0((Throwable) obj);
            }
        }));
        c cVarDuringCreated = duringCreated(CoreModule.f1534c.f3657n2.f19889S);
        final Function1 function1 = new Function1() { // from class: l.w9m0
            public final Object invoke(Object obj) {
                return bam0.m12587h0((VisitorSetting) obj);
            }
        };
        cVarDuringCreated.distinctUntilChanged(new w9j() { // from class: l.x9m0
            public final Object call(Object obj) {
                return bam0.m12590k0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.y9m0
            public final void call(Object obj) {
                bam0.m12585f0(this.f28087a, (VisitorSetting) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final boolean getHasPermission() {
        return this.hasPermission;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m12594n0(boolean hasPermission) {
        this.hasPermission = hasPermission;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m12595o0(boolean needPermission) {
        if (this.hasPermission ^ needPermission) {
            duringCreated(CoreModule.f1534c.f3657n2.m22273h4(CoreModule.m1850H().userId(), needPermission)).subscribe(mkd0.H(new e30() { // from class: l.z9m0
                public final void call(Object obj) {
                    bam0.m12589j0(this.f28679a, (VisitorSetting) obj);
                }
            }, new e30() { // from class: l.aam0
                public final void call(Object obj) {
                    bam0.m12586g0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m12596p0(VisitorSetting userMomentSetting) {
        if (Intrinsics.d(userMomentSetting.userId, CoreModule.m1850H().userId())) {
            boolean z = this.hasPermission;
            boolean z2 = userMomentSetting.visitorPermission;
            if (z ^ z2) {
                this.hasPermission = z2;
                ((oam0) ((jq2) this).viewModel).m20463E(z2);
            }
        }
    }

    public void destroy() {
    }
}
