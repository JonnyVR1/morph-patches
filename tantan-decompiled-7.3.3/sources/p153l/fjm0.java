package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VisitorSetting;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, m88121d2 = {"Ll/fjm0;", "Ll/ar2;", "Ll/sjm0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "a0", "()V", "destroy", "", "hasPermission", "n0", "(Z)V", "needPermission", "o0", "Lcom/p1/mobile/putong/core/data/VisitorSetting;", "userMomentSetting", "p0", "(Lcom/p1/mobile/putong/core/data/VisitorSetting;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Z", "m0", "()Z", "setHasPermission", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fjm0 extends ar2<sjm0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean hasPermission;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjm0(@NotNull Act act) {
        super(act);
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m125823e0(fjm0 fjm0Var, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        fjm0Var.m125834p0(visitorSetting);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m125824f0(fjm0 fjm0Var, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        fjm0Var.m125834p0(visitorSetting);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m125825g0(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            r1j0.m179420g("此功能24小時只能修改一次");
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m125826h0(VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        return Boolean.valueOf(visitorSetting.visitorPermission);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m125827i0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static void m125828j0(fjm0 fjm0Var, VisitorSetting visitorSetting) {
        visitorSetting.getClass();
        boolean z = visitorSetting.visitorPermission;
        fjm0Var.hasPermission = z;
        ((sjm0) fjm0Var.viewModel).m186281E(z);
        CoreModule.f18264c.f20410n2.m121487g4(fjm0Var.hasPermission);
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m125829k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m125830l0(fjm0 fjm0Var, Bundle bundle) {
        ((sjm0) fjm0Var.viewModel).m186290r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.xim0
            @Override // p153l.y20
            public final void call(Object obj) {
                fjm0.m125830l0(this.f194470a, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20410n2.m121464J3(CoreModule.m30929H().userId())).subscribe(psd0.m173597H(new y20() { // from class: l.yim0
            @Override // p153l.y20
            public final void call(Object obj) {
                fjm0.m125823e0(this.f200224a, (VisitorSetting) obj);
            }
        }, new y20() { // from class: l.zim0
            @Override // p153l.y20
            public final void call(Object obj) {
                fjm0.m125827i0((Throwable) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20410n2.f94740S);
        final Function1 function1 = new Function1() { // from class: l.ajm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fjm0.m125826h0((VisitorSetting) obj);
            }
        };
        c22421cDuringCreated.distinctUntilChanged(new qcj() { // from class: l.bjm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fjm0.m125829k0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.cjm0
            @Override // p153l.y20
            public final void call(Object obj) {
                fjm0.m125824f0(this.f82203a, (VisitorSetting) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final boolean getHasPermission() {
        return this.hasPermission;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m125832n0(boolean hasPermission) {
        this.hasPermission = hasPermission;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m125833o0(boolean needPermission) {
        if (this.hasPermission ^ needPermission) {
            duringCreated(CoreModule.f18264c.f20410n2.m121488h4(CoreModule.m30929H().userId(), needPermission)).subscribe(psd0.m173597H(new y20() { // from class: l.djm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    fjm0.m125828j0(this.f88926a, (VisitorSetting) obj);
                }
            }, new y20() { // from class: l.ejm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    fjm0.m125825g0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m125834p0(VisitorSetting userMomentSetting) {
        if (Intrinsics.m88377d(userMomentSetting.userId, CoreModule.m30929H().userId())) {
            boolean z = this.hasPermission;
            boolean z2 = userMomentSetting.visitorPermission;
            if (z ^ z2) {
                this.hasPermission = z2;
                ((sjm0) this.viewModel).m186281E(z2);
            }
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
