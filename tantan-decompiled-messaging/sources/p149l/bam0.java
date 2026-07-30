package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VisitorSetting;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, m87232d2 = {"Ll/bam0;", "Ll/jq2;", "Ll/oam0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "a0", "()V", "destroy", "", "hasPermission", "n0", "(Z)V", "needPermission", "o0", "Lcom/p1/mobile/putong/core/data/VisitorSetting;", "userMomentSetting", "p0", "(Lcom/p1/mobile/putong/core/data/VisitorSetting;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Z", "m0", "()Z", "setHasPermission", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m100909e0(bam0 bam0Var, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        bam0Var.m100920p0(visitorSetting);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m100910f0(bam0 bam0Var, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        bam0Var.m100920p0(visitorSetting);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m100911g0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            osi0.m165783g("此功能24小時只能修改一次");
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m100912h0(VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        return Boolean.valueOf(visitorSetting.visitorPermission);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m100913i0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static void m100914j0(bam0 bam0Var, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        boolean z = visitorSetting.visitorPermission;
        bam0Var.hasPermission = z;
        ((oam0) bam0Var.viewModel).m163349E(z);
        CoreModule.f17545c.f19668n2.m175456g4(bam0Var.hasPermission);
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m100915k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m100916l0(bam0 bam0Var, Bundle bundle) {
        ((oam0) bam0Var.viewModel).m163358r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.t9m0
            @Override // p149l.e30
            public final void call(Object obj) {
                bam0.m100916l0(this.f169040a, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19668n2.m175433J3(CoreModule.m29931H().userId())).subscribe(mkd0.m154956H(new e30() { // from class: l.u9m0
            @Override // p149l.e30
            public final void call(Object obj) {
                bam0.m100909e0(this.f175469a, (VisitorSetting) obj);
            }
        }, new e30() { // from class: l.v9m0
            @Override // p149l.e30
            public final void call(Object obj) {
                bam0.m100913i0((Throwable) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(CoreModule.f17545c.f19668n2.f155205S);
        final Function1 function1 = new Function1() { // from class: l.w9m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bam0.m100912h0((VisitorSetting) obj);
            }
        };
        c22306cDuringCreated.distinctUntilChanged(new w9j() { // from class: l.x9m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return bam0.m100915k0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.y9m0
            @Override // p149l.e30
            public final void call(Object obj) {
                bam0.m100910f0(this.f196980a, (VisitorSetting) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final boolean getHasPermission() {
        return this.hasPermission;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m100918n0(boolean hasPermission) {
        this.hasPermission = hasPermission;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m100919o0(boolean needPermission) {
        if (this.hasPermission ^ needPermission) {
            duringCreated(CoreModule.f17545c.f19668n2.m175457h4(CoreModule.m29931H().userId(), needPermission)).subscribe(mkd0.m154956H(new e30() { // from class: l.z9m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    bam0.m100914j0(this.f202304a, (VisitorSetting) obj);
                }
            }, new e30() { // from class: l.aam0
                @Override // p149l.e30
                public final void call(Object obj) {
                    bam0.m100911g0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m100920p0(VisitorSetting userMomentSetting) {
        if (Intrinsics.m87488d(userMomentSetting.userId, CoreModule.m29931H().userId())) {
            boolean z = this.hasPermission;
            boolean z2 = userMomentSetting.visitorPermission;
            if (z ^ z2) {
                this.hasPermission = z2;
                ((oam0) this.viewModel).m163349E(z2);
            }
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
