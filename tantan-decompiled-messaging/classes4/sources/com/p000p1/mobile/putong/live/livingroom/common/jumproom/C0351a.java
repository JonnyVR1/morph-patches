package com.p000p1.mobile.putong.live.livingroom.common.jumproom;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.e30;
import l.ffw;
import l.gkh0;
import l.lsi0;
import l.vdt;
import p002l.bsm;
import p002l.h4t;
import p002l.ho2;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.jumproom.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0351a extends h4t<ho2, JumpToRoomView> {
    public C0351a(bsm bsmVar, JumpToRoomView jumpToRoomView) {
        super(bsmVar);
        C(jumpToRoomView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m6569P3(Long l2) {
        m6574S3("view dismiss by count down");
        m6572N3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m6570R3(Throwable th) {
        m6574S3("count down error, message:" + th.getMessage());
        m6572N3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: M3 */
    public void m6571M3() {
        JumpRoomData jumpRoomDataMo9894y0 = m25547E2().mo9894y0();
        if (jumpRoomDataMo9894y0 == null || !jumpRoomDataMo9894y0.isOldDataValid()) {
            return;
        }
        m6574S3("click back to old live, live id:" + jumpRoomDataMo9894y0.getOldLiveId());
        m25548F2().FragProxyEvent.jumpRoom().j(new JumpRoomData.C0350a().m6556v(jumpRoomDataMo9894y0.getOldLiveId()).m6557w(jumpRoomDataMo9894y0.getOldRoomId()).m6550p(m14196o3().m27366b()).m6548n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m6555u(jumpRoomDataMo9894y0.getOldSource()).m6547m());
    }

    /* JADX INFO: renamed from: N3 */
    public final void m6572N3() {
        ((JumpToRoomView) ((bwr) this).viewModel).m6563d();
        m25548F2().PlayerEvent.jumpInfoVisible().j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m6573O3(JumpRoomData jumpRoomData) {
        if (TextUtils.isEmpty(jumpRoomData.getToLiveId()) || TextUtils.isEmpty(jumpRoomData.getToRoomId())) {
            lsi0.w(R$string.f3008T);
        } else {
            m25548F2().FragProxyEvent.jumpRoom().j(jumpRoomData);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m6574S3(String str) {
        gkh0.j("[live]jump_to_room", str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v13, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: T */
    public void m6575T() {
        super.T();
        if (vdt.b(2)) {
            duringCreated((c) m25548F2().JumpRoomEvent.jumpRoom().g()).subscribe(ffw.d(new e30() { // from class: l.tqq
                public final void call(Object obj) {
                    this.f20344a.m6573O3((JumpRoomData) obj);
                }
            }));
        }
        if (m25547E2().mo9894y0() == null || !m25547E2().mo9894y0().isOldDataValid()) {
            return;
        }
        if (m25547E2().mo9894y0().getJumpRoomType() != JumpRoomType.CHANGE_SOURCE_WITH_BACK) {
            m6572N3();
            return;
        }
        String oldAnchorName = m25547E2().mo9894y0().getOldAnchorName();
        m6576T3(m25547E2().mo9894y0());
        m6574S3("render view, name:" + oldAnchorName);
        m14186H3(m25547E2().m14578j2(2, TimeUnit.MINUTES)).take(1).subscribe(ffw.e(new e30() { // from class: l.uqq
            public final void call(Object obj) {
                this.f20755a.m6569P3((Long) obj);
            }
        }, new e30() { // from class: l.vqq
            public final void call(Object obj) {
                this.f21271a.m6570R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m6576T3(JumpRoomData jumpRoomData) {
        ((JumpToRoomView) ((bwr) this).viewModel).m6564f(jumpRoomData);
        m25548F2().PlayerEvent.jumpInfoVisible().j(Boolean.TRUE);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        m6572N3();
    }
}
