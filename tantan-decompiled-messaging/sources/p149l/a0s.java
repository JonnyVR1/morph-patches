package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class a0s extends x6s<ho2, uzr> {

    /* JADX INFO: renamed from: j */
    public bp50 f67065j;

    public a0s(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        mo51532C(new uzr(act(), this));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        this.f67065j = null;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m94472W3(roj0 roj0Var) {
        ((uzr) this.viewModel).m196453Y(false);
        ((uzr) this.viewModel).mo71838p();
        osi0.m165783g("提交成功，审核通过即可展示，审核失败需重新发送。");
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m94473X3(Throwable th) {
        ((uzr) this.viewModel).mo71838p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151593w(R$string.f47161c3);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m94474Y3(bp50 bp50Var, BLiveSuperChatDetail bLiveSuperChatDetail) {
        this.f67065j = bp50Var;
        ((uzr) this.viewModel).m196454Z(bLiveSuperChatDetail);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Z3 */
    public void m94475Z3(String str) {
        duringCreated(fcu.m120464b(false, m206027E2().m132140j0(), this.f67065j.getGiftId(), w220.m201014a(), str, m206027E2().m149818o(), m206027E2().m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.xzr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195223a.m94472W3((roj0) obj);
            }
        }, new e30() { // from class: l.yzr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200908a.m94473X3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: a4 */
    public final void m94476a4(final bp50 bp50Var) {
        duringCreated(LivingNormalApiProvider.m71420b6(false, m206027E2().m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.zzr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205819a.m94474Y3(bp50Var, (BLiveSuperChatDetail) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().CallCardEventGroup.openCallCardDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.wzr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188758a.m94476a4((bp50) obj);
            }
        }));
    }
}
