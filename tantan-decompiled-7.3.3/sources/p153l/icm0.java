package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u001d\u0010\u0018\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/icm0;", "Ll/y8s;", "Ll/oo2;", "Ll/ccm0;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "Ll/pcp0;", "voiceVirtualBgPicData", "Lkotlin/Function0;", "successAction", "Lkotlin/Function1;", "", "failAction", "X3", "(Ll/pcp0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Z3", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceBackGroundPics;", "picList", "Y3", "(Ljava/util/List;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class icm0 extends y8s<oo2, ccm0> {
    public icm0(@Nullable dum<?> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m139450S3(Function0 function0, BLiveVoiceRoom bLiveVoiceRoom) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m139451T3(Throwable th) {
        yvr.m217557c(th);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m139452U3(icm0 icm0Var, List list) {
        list.getClass();
        icm0Var.m139456Y3(list);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m139453V3(Function1 function1, Throwable th) {
        th.getClass();
        function1.invoke(th);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m139454W3(icm0 icm0Var, vxj0 vxj0Var) {
        icm0Var.m139457Z3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: X3 */
    public final void m139455X3(@NotNull pcp0 voiceVirtualBgPicData, @NotNull final Function0<Unit> successAction, @NotNull final Function1<? super Throwable, Unit> failAction) {
        voiceVirtualBgPicData.getClass();
        successAction.getClass();
        failAction.getClass();
        ?? M213810E2 = m213810E2();
        duringCreated(n4o0.m161578j(M213810E2 != 0 ? M213810E2.m202194o() : null, voiceVirtualBgPicData.getVoiceBackGroundPic().f45331id)).subscribe(dhw.m115826e(new y20() { // from class: l.gcm0
            @Override // p153l.y20
            public final void call(Object obj) {
                icm0.m139450S3(successAction, (BLiveVoiceRoom) obj);
            }
        }, new y20() { // from class: l.hcm0
            @Override // p153l.y20
            public final void call(Object obj) {
                icm0.m139453V3(failAction, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m139456Y3(List<BLiveVoiceBackGroundPics> picList) {
        if (this.viewModel == 0) {
            Act act = this.f196918e.f90815a;
            act.getClass();
            ccm0 ccm0Var = new ccm0(act, this);
            this.viewModel = ccm0Var;
            mo52715C(ccm0Var);
        }
        ccm0 ccm0Var2 = (ccm0) this.viewModel;
        if (ccm0Var2 != null) {
            ccm0Var2.m108727T(picList);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: Z3 */
    public final void m139457Z3() {
        dum<? extends T> dumVar = this.f196918e;
        dumVar.getClass();
        if (f2m0.m123633c(dumVar)) {
            r1j0.m179420g(xau.m209910t(R$string.f47491Dk));
        } else {
            ?? M213810E2 = m213810E2();
            duringCreated(n4o0.m161576h(M213810E2 != 0 ? M213810E2.m202194o() : null, "updateBg")).subscribe(dhw.m115826e(new y20() { // from class: l.ecm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    icm0.m139452U3(this.f93081a, (List) obj);
                }
            }, new y20() { // from class: l.fcm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    icm0.m139451T3((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VoiceVirtualLiveEvent.showChangeBgDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.dcm0
            @Override // p153l.y20
            public final void call(Object obj) {
                icm0.m139454W3(this.f87798a, (vxj0) obj);
            }
        }));
    }
}
