package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.moments.LikesDetailAct;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class wlr extends jq2<xlr> {

    /* JADX INFO: renamed from: a */
    public String f186993a;

    /* JADX INFO: renamed from: b */
    public String f186994b;

    public wlr(LikesDetailAct likesDetailAct) {
        super(likesDetailAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m203882i0(Bundle bundle) {
        ((xlr) this.viewModel).init();
    }

    /* JADX INFO: renamed from: h0 */
    public void m203883h0() {
        creates(new e30() { // from class: l.tlr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171041a.m203882i0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.ulr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f177088a.m203884j0();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.vlr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181977a.m203885k0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ C22306c m203884j0() {
        return FeedModule.f38854c.m60707W3(this.f186993a);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m203885k0(Moment moment) {
        ((xlr) this.viewModel).m209971d(moment);
    }

    /* JADX INFO: renamed from: l0 */
    public void m203886l0(String str, String str2) {
        this.f186993a = str;
        this.f186994b = str2;
    }

    /* JADX INFO: renamed from: m0 */
    public List<Object> m203887m0() {
        return vwb.m200324f0("moment id", this.f186993a, ag3.f69254c);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
