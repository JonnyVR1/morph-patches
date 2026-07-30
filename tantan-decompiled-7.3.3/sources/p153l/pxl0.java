package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletView;

/* JADX INFO: loaded from: classes5.dex */
public class pxl0 extends ki3 {
    public pxl0(dum dumVar, BulletView bulletView) {
        super(dumVar, bulletView);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m174234V3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m174236X3(jsv jsvVar) {
        m149855P3();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    @Override // p153l.xzs
    /* JADX INFO: renamed from: R2 */
    public String mo78457R2() {
        return jkp0.m145875f(m213810E2().mo118373p());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.i6t
    /* JADX INFO: renamed from: p3 */
    public void mo138869p3(int i, String str) {
        rwn0 rwn0Var = (rwn0) m213810E2();
        String queryParameter = Uri.parse(str).getQueryParameter("liveId");
        if (TextUtils.isEmpty(queryParameter)) {
            m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(100).m103154e(str).m103152c());
            return;
        }
        if (TextUtils.equals(queryParameter, rwn0Var.m202191k())) {
            o1j0.m165651y("已在该房间中");
            return;
        }
        if (guk0.m132329h(rwn0Var.m183411P2().m136873l(zrv.f205799a.m207631D0()))) {
            o1j0.m165651y("正在麦上暂无法进入该房间");
            return;
        }
        String queryParameter2 = Uri.parse(str).getQueryParameter("source");
        if (TextUtils.isEmpty(queryParameter2)) {
            queryParameter2 = "";
        }
        this.f196919f.startActivity(z91.m219041a(zrv.f205803e, AudienceStartData.getBuilder().m68789Q(true).m68777E(queryParameter).m68787O(queryParameter2).m68794u()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    @Override // p153l.ki3, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m202192l().filter(new qcj() { // from class: l.mxl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((jsv) obj).m146875a() == 5);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.nxl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144156a.m174236X3((jsv) obj);
            }
        }, new y20() { // from class: l.oxl0
            @Override // p153l.y20
            public final void call(Object obj) {
                pxl0.m174234V3((Throwable) obj);
            }
        }));
    }
}
