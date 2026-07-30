package com.p046p1.mobile.putong.live.livingroom.common.jumproom;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import java.util.concurrent.TimeUnit;
import p149l.bsm;
import p149l.e30;
import p149l.ffw;
import p149l.gkh0;
import p149l.h4t;
import p149l.ho2;
import p149l.lsi0;
import p149l.vdt;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.jumproom.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12762a extends h4t<ho2, JumpToRoomView> {
    public C12762a(bsm bsmVar, JumpToRoomView jumpToRoomView) {
        super(bsmVar);
        mo51532C(jumpToRoomView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m73044P3(Long l2) {
        m73049S3("view dismiss by count down");
        m73047N3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m73045R3(Throwable th) {
        m73049S3("count down error, message:" + th.getMessage());
        m73047N3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: M3 */
    public void m73046M3() {
        JumpRoomData jumpRoomDataMo97491y0 = m206027E2().mo97491y0();
        if (jumpRoomDataMo97491y0 == null || !jumpRoomDataMo97491y0.isOldDataValid()) {
            return;
        }
        m73049S3("click back to old live, live id:" + jumpRoomDataMo97491y0.getOldLiveId());
        m206028F2().FragProxyEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73033v(jumpRoomDataMo97491y0.getOldLiveId()).m73034w(jumpRoomDataMo97491y0.getOldRoomId()).m73027p(m129309o3().m218715b()).m73025n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m73032u(jumpRoomDataMo97491y0.getOldSource()).m73024m());
    }

    /* JADX INFO: renamed from: N3 */
    public final void m73047N3() {
        ((JumpToRoomView) this.viewModel).m73039d();
        m206028F2().PlayerEvent.jumpInfoVisible().mo172463j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m73048O3(JumpRoomData jumpRoomData) {
        if (TextUtils.isEmpty(jumpRoomData.getToLiveId()) || TextUtils.isEmpty(jumpRoomData.getToRoomId())) {
            lsi0.m151593w(R$string.f46966T);
        } else {
            m206028F2().FragProxyEvent.jumpRoom().mo172463j(jumpRoomData);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m73049S3(String str) {
        gkh0.m126627j("[live]jump_to_room", str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v13, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        if (vdt.m198092b(2)) {
            duringCreated(m206028F2().JumpRoomEvent.jumpRoom().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.tqq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171617a.m73048O3((JumpRoomData) obj);
                }
            }));
        }
        if (m206027E2().mo97491y0() == null || !m206027E2().mo97491y0().isOldDataValid()) {
            return;
        }
        if (m206027E2().mo97491y0().getJumpRoomType() != JumpRoomType.CHANGE_SOURCE_WITH_BACK) {
            m73047N3();
            return;
        }
        String oldAnchorName = m206027E2().mo97491y0().getOldAnchorName();
        m73050T3(m206027E2().mo97491y0());
        m73049S3("render view, name:" + oldAnchorName);
        m129299H3(m206027E2().m132142j2(2, TimeUnit.MINUTES)).take(1).subscribe(ffw.m121194e(new e30() { // from class: l.uqq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177766a.m73044P3((Long) obj);
            }
        }, new e30() { // from class: l.vqq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182669a.m73045R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m73050T3(JumpRoomData jumpRoomData) {
        ((JumpToRoomView) this.viewModel).m73040f(jumpRoomData);
        m206028F2().PlayerEvent.jumpInfoVisible().mo172463j(Boolean.TRUE);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m73047N3();
    }
}
