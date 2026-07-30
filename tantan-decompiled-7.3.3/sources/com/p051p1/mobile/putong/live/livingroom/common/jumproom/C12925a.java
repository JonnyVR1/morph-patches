package com.p051p1.mobile.putong.live.livingroom.common.jumproom;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import java.util.concurrent.TimeUnit;
import p153l.dhw;
import p153l.dum;
import p153l.i6t;
import p153l.nsh0;
import p153l.o1j0;
import p153l.oo2;
import p153l.wft;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.jumproom.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12925a extends i6t<oo2, JumpToRoomView> {
    public C12925a(dum dumVar, JumpToRoomView jumpToRoomView) {
        super(dumVar);
        mo52715C(jumpToRoomView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m74227P3(Long l2) {
        m74232S3("view dismiss by count down");
        m74230N3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m74228R3(Throwable th) {
        m74232S3("count down error, message:" + th.getMessage());
        m74230N3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: M3 */
    public void m74229M3() {
        JumpRoomData jumpRoomDataMo146616y0 = m213810E2().mo146616y0();
        if (jumpRoomDataMo146616y0 == null || !jumpRoomDataMo146616y0.isOldDataValid()) {
            return;
        }
        m74232S3("click back to old live, live id:" + jumpRoomDataMo146616y0.getOldLiveId());
        m213811F2().FragProxyEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74216v(jumpRoomDataMo146616y0.getOldLiveId()).m74217w(jumpRoomDataMo146616y0.getOldRoomId()).m74210p(m138868o3().m98479b()).m74208n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m74215u(jumpRoomDataMo146616y0.getOldSource()).m74207m());
    }

    /* JADX INFO: renamed from: N3 */
    public final void m74230N3() {
        ((JumpToRoomView) this.viewModel).m74222d();
        m213811F2().PlayerEvent.jumpInfoVisible().mo199273j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m74231O3(JumpRoomData jumpRoomData) {
        if (TextUtils.isEmpty(jumpRoomData.getToLiveId()) || TextUtils.isEmpty(jumpRoomData.getToRoomId())) {
            o1j0.m165649w(R$string.f47814T);
        } else {
            m213811F2().FragProxyEvent.jumpRoom().mo199273j(jumpRoomData);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m74232S3(String str) {
        nsh0.m164608j("[live]jump_to_room", str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v13, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        if (wft.m206159b(2)) {
            duringCreated(m213811F2().JumpRoomEvent.jumpRoom().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.usq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180844a.m74231O3((JumpRoomData) obj);
                }
            }));
        }
        if (m213810E2().mo146616y0() == null || !m213810E2().mo146616y0().isOldDataValid()) {
            return;
        }
        if (m213810E2().mo146616y0().getJumpRoomType() != JumpRoomType.CHANGE_SOURCE_WITH_BACK) {
            m74230N3();
            return;
        }
        String oldAnchorName = m213810E2().mo146616y0().getOldAnchorName();
        m74233T3(m213810E2().mo146616y0());
        m74232S3("render view, name:" + oldAnchorName);
        m138858H3(m213810E2().m168528j2(2, TimeUnit.MINUTES)).take(1).subscribe(dhw.m115826e(new y20() { // from class: l.vsq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185645a.m74227P3((Long) obj);
            }
        }, new y20() { // from class: l.wsq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190667a.m74228R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m74233T3(JumpRoomData jumpRoomData) {
        ((JumpToRoomView) this.viewModel).m74223f(jumpRoomData);
        m213811F2().PlayerEvent.jumpInfoVisible().mo199273j(Boolean.TRUE);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m74230N3();
    }
}
