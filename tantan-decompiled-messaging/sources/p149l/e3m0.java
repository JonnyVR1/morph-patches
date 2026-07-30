package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u001d\u0010\u0018\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Ll/e3m0;", "Ll/x6s;", "Ll/ho2;", "Ll/y2m0;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "Ll/l3p0;", "voiceVirtualBgPicData", "Lkotlin/Function0;", "successAction", "Lkotlin/Function1;", "", "failAction", "X3", "(Ll/l3p0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Z3", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceBackGroundPics;", "picList", "Y3", "(Ljava/util/List;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class e3m0 extends x6s<ho2, y2m0> {
    public e3m0(@Nullable bsm<?> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m114617S3(Function0 function0, BLiveVoiceRoom bLiveVoiceRoom) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m114618T3(Throwable th) {
        xtr.m211023c(th);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m114619U3(e3m0 e3m0Var, List list) {
        list.getClass();
        e3m0Var.m114623Y3(list);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m114620V3(Function1 function1, Throwable th) {
        th.getClass();
        function1.invoke(th);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m114621W3(e3m0 e3m0Var, soj0 soj0Var) {
        e3m0Var.m114624Z3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public final void m114622X3(@NotNull l3p0 voiceVirtualBgPicData, @NotNull final Function0<Unit> successAction, @NotNull final Function1<? super Throwable, Unit> failAction) {
        voiceVirtualBgPicData.getClass();
        successAction.getClass();
        failAction.getClass();
        ?? M206027E2 = m206027E2();
        duringCreated(jvn0.m143531j(M206027E2 != 0 ? M206027E2.m149818o() : null, voiceVirtualBgPicData.getVoiceBackGroundPic().f44483id)).subscribe(ffw.m121194e(new e30() { // from class: l.c3m0
            @Override // p149l.e30
            public final void call(Object obj) {
                e3m0.m114617S3(successAction, (BLiveVoiceRoom) obj);
            }
        }, new e30() { // from class: l.d3m0
            @Override // p149l.e30
            public final void call(Object obj) {
                e3m0.m114620V3(failAction, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m114623Y3(List<BLiveVoiceBackGroundPics> picList) {
        if (this.viewModel == 0) {
            Act act = this.f188512e.f77095a;
            act.getClass();
            y2m0 y2m0Var = new y2m0(act, this);
            this.viewModel = y2m0Var;
            mo51532C(y2m0Var);
        }
        y2m0 y2m0Var2 = (y2m0) this.viewModel;
        if (y2m0Var2 != null) {
            y2m0Var2.m212395T(picList);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Z3 */
    public final void m114624Z3() {
        bsm<? extends T> bsmVar = this.f188512e;
        bsmVar.getClass();
        if (btl0.m103863c(bsmVar)) {
            osi0.m165783g(w8u.m202217t(R$string.f46643Dk));
        } else {
            ?? M206027E2 = m206027E2();
            duringCreated(jvn0.m143529h(M206027E2 != 0 ? M206027E2.m149818o() : null, "updateBg")).subscribe(ffw.m121194e(new e30() { // from class: l.a3m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    e3m0.m114619U3(this.f67398a, (List) obj);
                }
            }, new e30() { // from class: l.b3m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    e3m0.m114618T3((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VoiceVirtualLiveEvent.showChangeBgDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.z2m0
            @Override // p149l.e30
            public final void call(Object obj) {
                e3m0.m114621W3(this.f201262a, (soj0) obj);
            }
        }));
    }
}
