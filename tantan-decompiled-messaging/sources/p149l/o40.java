package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class o40 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public boolean f141724i;

    /* JADX INFO: renamed from: j */
    public boolean f141725j;

    /* JADX INFO: renamed from: k */
    public c4g0 f141726k;

    /* JADX INFO: renamed from: l */
    public bs5 f141727l;

    public o40(bsm bsmVar) {
        super(bsmVar);
        this.f141725j = true;
        this.f141727l = new bs5();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Boolean m162504N3(Long l2) {
        return Boolean.valueOf(this.f141724i && this.f141725j);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m162505O3(Long l2) {
        m162509T3();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m162506P3(C4319c c4319c) {
        if (c4319c != C4319c.f15550k) {
            if (c4319c == C4319c.f15548i) {
                this.f141724i = false;
                mkd0.m154992z(this.f141726k);
                return;
            }
            return;
        }
        if (this.f141724i) {
            return;
        }
        this.f141724i = true;
        if (this.f141725j) {
            m162508S3();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m162507R3(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "boot":
            case "stop":
            case "pause":
            case "force_stop":
                this.f141725j = false;
                mkd0.m154992z(this.f141726k);
                break;
            case "start":
            case "recover":
                if (!this.f141725j) {
                    this.f141725j = true;
                    if (this.f141724i) {
                        m162508S3();
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m162508S3() {
        c4g0 c4g0VarSubscribe = C22306c.interval(0L, 30L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.m40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f131212a.m162504N3((Long) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.n40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137035a.m162505O3((Long) obj);
            }
        }));
        this.f141726k = c4g0VarSubscribe;
        this.f141727l.m103655a(c4g0VarSubscribe);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m162509T3() {
        zvf0.m220369B("e_active_check", mo77274R2(), vwb.m200311Y("page_id", mo77274R2()));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f141727l.unsubscribe();
        this.f141727l.m103657c();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        this.f141727l.m103656b(lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.k40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120922a.m162506P3((C4319c) obj);
            }
        })), m206027E2().m132156o1(this.f188513f).subscribe(ffw.m121193d(new e30() { // from class: l.l40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125957a.m162507R3((LiveControlMessage) obj);
            }
        })));
    }
}
