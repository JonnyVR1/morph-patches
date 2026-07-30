package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.moments.LikesDetailAct;
import java.util.List;
import l.ag3;
import l.e30;
import l.jq2;
import l.mkd0;
import l.v9j;
import l.vwb;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class wlr extends jq2<xlr> {

    /* JADX INFO: renamed from: a */
    public String f14618a;

    /* JADX INFO: renamed from: b */
    public String f14619b;

    public wlr(LikesDetailAct likesDetailAct) {
        super(likesDetailAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m15837i0(Bundle bundle) {
        ((xlr) ((jq2) this).viewModel).init();
    }

    /* JADX INFO: renamed from: h0 */
    public void m15838h0() {
        creates(new e30() { // from class: l.tlr
            public final void call(Object obj) {
                this.f13331a.m15837i0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.ulr
            public final Object call() {
                return this.f13858a.m15839j0();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.vlr
            public final void call(Object obj) {
                this.f14231a.m15840k0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ c m15839j0() {
        return FeedModule.f315c.m1633W3(this.f14618a);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m15840k0(Moment moment) {
        ((xlr) ((jq2) this).viewModel).m16794d(moment);
    }

    /* JADX INFO: renamed from: l0 */
    public void m15841l0(String str, String str2) {
        this.f14618a = str;
        this.f14619b = str2;
    }

    /* JADX INFO: renamed from: m0 */
    public List<Object> m15842m0() {
        return vwb.f0(new Object[]{"moment id", this.f14618a, ag3.c});
    }

    public void destroy() {
    }
}
