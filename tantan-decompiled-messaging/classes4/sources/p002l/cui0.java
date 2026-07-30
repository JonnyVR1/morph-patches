package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import l.bwr;
import l.e30;
import l.ffw;
import l.lsi0;
import l.osi0;
import l.roj0;
import l.soj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cui0 extends x6s<ho2, vti0> {
    public cui0(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        C(new vti0(act(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m11371a4(soj0 soj0Var) {
        m11372d4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    private void m11372d4() {
        duringCreated(LivingNormalApiProvider.m4786b6(true, m25547E2().m17239o())).subscribe(ffw.h(new e30() { // from class: l.bui0
            public final void call(Object obj) {
                this.f8366a.m11375Z3((BLiveSuperChatDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m11373X3(roj0 roj0Var) {
        ((vti0) ((bwr) this).viewModel).mo5216p();
        osi0.g("提交成功，审核通过即可展示，审核失败需重新发送。");
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m11374Y3(Throwable th) {
        ((vti0) ((bwr) this).viewModel).mo5216p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.y(coreService.metaMessage);
                return;
            }
        }
        lsi0.w(R$string.f3203c3);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m11375Z3(BLiveSuperChatDetail bLiveSuperChatDetail) {
        ((vti0) ((bwr) this).viewModel).m24156c0(bLiveSuperChatDetail);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m11376b4(LongLinkLiveBottomPopup.VideoLiveToast videoLiveToast) {
        if (videoLiveToast.getRoomId().equals(m25547E2().m17239o())) {
            osi0.g(videoLiveToast.getToast());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c4 */
    public void m11377c4(String str, String str2) {
        duringCreated(fcu.m13054b(true, m25547E2().m14576j0(), str, w220.m24290a(), str2, m25547E2().m17239o(), m25547E2().m17235k())).subscribe(ffw.e(new e30() { // from class: l.zti0
            public final void call(Object obj) {
                this.f23585a.m11373X3((roj0) obj);
            }
        }, new e30() { // from class: l.aui0
            public final void call(Object obj) {
                this.f7890a.m11374Y3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m11378t() {
        super.t();
        duringCreated((c) m25548F2().TopChatEventGroup.openTopChatDialog().g()).subscribe(ffw.d(new e30() { // from class: l.xti0
            public final void call(Object obj) {
                this.f22455a.m11371a4((soj0) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().b2).subscribe(ffw.h(new e30() { // from class: l.yti0
            public final void call(Object obj) {
                this.f23098a.m11376b4((LongLinkLiveBottomPopup.VideoLiveToast) obj);
            }
        }));
    }
}
