package p153l;

import android.os.Build;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class b120 extends cyr<i120> {

    /* JADX INFO: renamed from: a */
    public Frag f74316a;

    public b120(Frag frag) {
        super(frag);
        this.f74316a = frag;
        by10.m106946e().m106948f(mbs.m157870o0());
    }

    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ void m101384r2(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: A2 */
    public final void m101386A2(List<IntlMusicBean> list) {
        ((i120) this.viewModel).m138072w(list);
        r1j0.m179420g(xau.m209911u(R$string.f45749g, Integer.valueOf(list == null ? 0 : list.size())));
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m101387u2(List list) {
        ((i120) this.viewModel).m138072w(list);
    }

    /* JADX INFO: renamed from: v2 */
    public void m101388v2() {
        this.f74316a.duringCreated(by10.m106946e().m106951i()).subscribe(dhw.m115829h(new y20() { // from class: l.x020
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191864a.m101387u2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w2 */
    public void m101389w2() {
        this.f74316a.act().m68056e2();
    }

    /* JADX INFO: renamed from: y2 */
    public void m101390y2() {
        PermissionHelper.m81065c().m81083r(Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE").m81088w(false).m81086u(true).m81075j(true).m81078m(new x20() { // from class: l.y020
            @Override // p153l.x20
            public final void call() {
                this.f196945a.m101391z2();
            }
        }, new y20() { // from class: l.z020
            @Override // p153l.y20
            public final void call(Object obj) {
                b120.m101384r2((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m81074i(this.f74316a.act());
    }

    /* JADX INFO: renamed from: z2 */
    public void m101391z2() {
        this.f74316a.duringCreated(by10.m106946e().m106952j(this.f74316a.act())).subscribe(dhw.m115829h(new y20() { // from class: l.a120
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67777a.m101386A2((List) obj);
            }
        }));
    }
}
