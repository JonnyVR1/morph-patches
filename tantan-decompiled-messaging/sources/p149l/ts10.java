package p149l;

import android.os.Build;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ts10 extends bwr<at10> {

    /* JADX INFO: renamed from: a */
    public Frag f171904a;

    public ts10(Frag frag) {
        super(frag);
        this.f171904a = frag;
        tp10.m189947e().m189949f(l9s.m149093o0());
    }

    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ void m190504r2(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: A2 */
    public final void m190506A2(List<IntlMusicBean> list) {
        ((at10) this.viewModel).m98666w(list);
        osi0.m165783g(w8u.m202218u(R$string.f44901g, Integer.valueOf(list == null ? 0 : list.size())));
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m190507u2(List list) {
        ((at10) this.viewModel).m98666w(list);
    }

    /* JADX INFO: renamed from: v2 */
    public void m190508v2() {
        this.f171904a.duringCreated(tp10.m189947e().m189952i()).subscribe(ffw.m121197h(new e30() { // from class: l.ps10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150967a.m190507u2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w2 */
    public void m190509w2() {
        this.f171904a.act().m66873d2();
    }

    /* JADX INFO: renamed from: y2 */
    public void m190510y2() {
        PermissionHelper.m79882c().m79900r(Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE").m79905w(false).m79903u(true).m79892j(true).m79895m(new d30() { // from class: l.qs10
            @Override // p149l.d30
            public final void call() {
                this.f156085a.m190511z2();
            }
        }, new e30() { // from class: l.rs10
            @Override // p149l.e30
            public final void call(Object obj) {
                ts10.m190504r2((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m79891i(this.f171904a.act());
    }

    /* JADX INFO: renamed from: z2 */
    public void m190511z2() {
        this.f171904a.duringCreated(tp10.m189947e().m189953j(this.f171904a.act())).subscribe(ffw.m121197h(new e30() { // from class: l.ss10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166155a.m190506A2((List) obj);
            }
        }));
    }
}
