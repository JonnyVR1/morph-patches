package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.BulletView;

/* JADX INFO: loaded from: classes5.dex */
public class lol0 extends wh3 {
    public lol0(bsm bsmVar, BulletView bulletView) {
        super(bsmVar, bulletView);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m150783V3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m150785X3(iqv iqvVar) {
        m203101P3();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    @Override // p149l.wxs
    /* JADX INFO: renamed from: R2 */
    public String mo77274R2() {
        return fbp0.m120390f(m206027E2().mo97490p());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h4t
    /* JADX INFO: renamed from: p3 */
    public void mo129310p3(int i, String str) {
        nnn0 nnn0Var = (nnn0) m206027E2();
        String queryParameter = Uri.parse(str).getQueryParameter("liveId");
        if (TextUtils.isEmpty(queryParameter)) {
            m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(100).m206701e(str).m206699c());
            return;
        }
        if (TextUtils.equals(queryParameter, nnn0Var.m149814k())) {
            lsi0.m151595y("已在该房间中");
            return;
        }
        if (alk0.m97309h(nnn0Var.m160249P2().m102063l(ypv.f199493a.m199309D0()))) {
            lsi0.m151595y("正在麦上暂无法进入该房间");
            return;
        }
        String queryParameter2 = Uri.parse(str).getQueryParameter("source");
        if (TextUtils.isEmpty(queryParameter2)) {
            queryParameter2 = "";
        }
        this.f188513f.startActivity(s91.m182688a(ypv.f199497e, AudienceStartData.getBuilder().m67606Q(true).m67594E(queryParameter).m67604O(queryParameter2).m67611u()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    @Override // p149l.wh3, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m149815l().filter(new w9j() { // from class: l.iol0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((iqv) obj).m137794a() == 5);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.jol0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118996a.m150785X3((iqv) obj);
            }
        }, new e30() { // from class: l.kol0
            @Override // p149l.e30
            public final void call(Object obj) {
                lol0.m150783V3((Throwable) obj);
            }
        }));
    }
}
