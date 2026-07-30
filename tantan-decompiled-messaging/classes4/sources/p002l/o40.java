package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.android.app.c;
import java.util.concurrent.TimeUnit;
import l.bs5;
import l.c4g0;
import l.e30;
import l.ffw;
import l.j760;
import l.jo0;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o40 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public boolean f16356i;

    /* JADX INFO: renamed from: j */
    public boolean f16357j;

    /* JADX INFO: renamed from: k */
    public c4g0 f16358k;

    /* JADX INFO: renamed from: l */
    public bs5 f16359l;

    public o40(bsm bsmVar) {
        super(bsmVar);
        this.f16357j = true;
        this.f16359l = new bs5();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Boolean m19198N3(Long l2) {
        return Boolean.valueOf(this.f16356i && this.f16357j);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m19199O3(Long l2) {
        m19203T3();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m19200P3(c cVar) {
        if (cVar != c.k) {
            if (cVar == c.i) {
                this.f16356i = false;
                mkd0.z(this.f16358k);
                return;
            }
            return;
        }
        if (this.f16356i) {
            return;
        }
        this.f16356i = true;
        if (this.f16357j) {
            m19202S3();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m19201R3(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "boot":
            case "stop":
            case "pause":
            case "force_stop":
                this.f16357j = false;
                mkd0.z(this.f16358k);
                break;
            case "start":
            case "recover":
                if (!this.f16357j) {
                    this.f16357j = true;
                    if (this.f16356i) {
                        m19202S3();
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m19202S3() {
        c4g0 c4g0VarSubscribe = rx.c.interval(0L, 30L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).filter(new w9j() { // from class: l.m40
            public final Object call(Object obj) {
                return this.f15229a.m19198N3((Long) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.n40
            public final void call(Object obj) {
                this.f15819a.m19199O3((Long) obj);
            }
        }));
        this.f16358k = c4g0VarSubscribe;
        this.f16359l.a(c4g0VarSubscribe);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m19203T3() {
        zvf0.B("e_active_check", mo21430R2(), new j760[]{vwb.Y("page_id", mo21430R2())});
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f16359l.unsubscribe();
        this.f16359l.c();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m19204t() {
        super.t();
        this.f16359l.b(new c4g0[]{lifecycle().subscribe(ffw.d(new e30() { // from class: l.k40
            public final void call(Object obj) {
                this.f14187a.m19200P3((c) obj);
            }
        })), m25547E2().m14592o1(this.f22037f).subscribe(ffw.d(new e30() { // from class: l.l40
            public final void call(Object obj) {
                this.f14667a.m19201R3((LiveControlMessage) obj);
            }
        }))});
    }
}
