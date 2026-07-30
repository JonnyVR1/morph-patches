package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class i40 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public boolean f112800i;

    /* JADX INFO: renamed from: j */
    public boolean f112801j;

    /* JADX INFO: renamed from: k */
    public kcg0 f112802k;

    /* JADX INFO: renamed from: l */
    public ft5 f112803l;

    public i40(dum dumVar) {
        super(dumVar);
        this.f112801j = true;
        this.f112803l = new ft5();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Boolean m138372N3(Long l2) {
        return Boolean.valueOf(this.f112800i && this.f112801j);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m138373O3(Long l2) {
        m138377T3();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m138374P3(C4470c c4470c) {
        if (c4470c != C4470c.f16269k) {
            if (c4470c == C4470c.f16267i) {
                this.f112800i = false;
                psd0.m173633z(this.f112802k);
                return;
            }
            return;
        }
        if (this.f112800i) {
            return;
        }
        this.f112800i = true;
        if (this.f112801j) {
            m138376S3();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m138375R3(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "boot":
            case "stop":
            case "pause":
            case "force_stop":
                this.f112801j = false;
                psd0.m173633z(this.f112802k);
                break;
            case "start":
            case "recover":
                if (!this.f112801j) {
                    this.f112801j = true;
                    if (this.f112800i) {
                        m138376S3();
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m138376S3() {
        kcg0 kcg0VarSubscribe = C22421c.interval(0L, 30L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.g40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f102051a.m138372N3((Long) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.h40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107717a.m138373O3((Long) obj);
            }
        }));
        this.f112802k = kcg0VarSubscribe;
        this.f112803l.m127297a(kcg0VarSubscribe);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m138377T3() {
        i4g0.m138493B("e_active_check", mo78457R2(), jyb.m147494Y("page_id", mo78457R2()));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f112803l.unsubscribe();
        this.f112803l.m127299c();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        this.f112803l.m127298b(lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.e40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92022a.m138374P3((C4470c) obj);
            }
        })), m213810E2().m168541o1(this.f196919f).subscribe(dhw.m115825d(new y20() { // from class: l.f40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97020a.m138375R3((LiveControlMessage) obj);
            }
        })));
    }
}
