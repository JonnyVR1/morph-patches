package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import l.bwr;
import l.e30;
import l.ffw;
import l.lsi0;
import l.osi0;
import l.roj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a0s extends x6s<ho2, uzr> {

    /* JADX INFO: renamed from: j */
    public bp50 f7332j;

    public a0s(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        C(new uzr(act(), this));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        this.f7332j = null;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m9257W3(roj0 roj0Var) {
        ((uzr) ((bwr) this).viewModel).m23696Y(false);
        ((uzr) ((bwr) this).viewModel).mo5216p();
        osi0.g("提交成功，审核通过即可展示，审核失败需重新发送。");
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m9258X3(Throwable th) {
        ((uzr) ((bwr) this).viewModel).mo5216p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.y(coreService.metaMessage);
                return;
            }
        }
        lsi0.w(R$string.f3203c3);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m9259Y3(bp50 bp50Var, BLiveSuperChatDetail bLiveSuperChatDetail) {
        this.f7332j = bp50Var;
        ((uzr) ((bwr) this).viewModel).m23697Z(bLiveSuperChatDetail);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Z3 */
    public void m9260Z3(String str) {
        duringCreated(fcu.m13054b(false, m25547E2().m14576j0(), this.f7332j.getGiftId(), w220.m24290a(), str, m25547E2().m17239o(), m25547E2().m17235k())).subscribe(ffw.e(new e30() { // from class: l.xzr
            public final void call(Object obj) {
                this.f22557a.m9257W3((roj0) obj);
            }
        }, new e30() { // from class: l.yzr
            public final void call(Object obj) {
                this.f23152a.m9258X3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: a4 */
    public final void m9261a4(final bp50 bp50Var) {
        duringCreated(LivingNormalApiProvider.m4786b6(false, m25547E2().m17239o())).subscribe(ffw.h(new e30() { // from class: l.zzr
            public final void call(Object obj) {
                this.f23680a.m9259Y3(bp50Var, (BLiveSuperChatDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m9262t() {
        super.t();
        duringCreated((c) m25548F2().CallCardEventGroup.openCallCardDialog().g()).subscribe(ffw.h(new e30() { // from class: l.wzr
            public final void call(Object obj) {
                this.f22054a.m9261a4((bp50) obj);
            }
        }));
    }
}
