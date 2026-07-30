package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.p065ui.moments.LikesDetailAct;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class xnr extends ar2<ynr> {

    /* JADX INFO: renamed from: a */
    public String f195465a;

    /* JADX INFO: renamed from: b */
    public String f195466b;

    public xnr(LikesDetailAct likesDetailAct) {
        super(likesDetailAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m212289i0(Bundle bundle) {
        ((ynr) this.viewModel).init();
    }

    /* JADX INFO: renamed from: h0 */
    public void m212290h0() {
        creates(new y20() { // from class: l.unr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179763a.m212289i0((Bundle) obj);
            }
        });
        duringCreated(new pcj() { // from class: l.vnr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f184908a.m212291j0();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.wnr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189974a.m212292k0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ C22421c m212291j0() {
        return FeedModule.f39702c.m61891W3(this.f195465a);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m212292k0(Moment moment) {
        ((ynr) this.viewModel).m216954d(moment);
    }

    /* JADX INFO: renamed from: l0 */
    public void m212293l0(String str, String str2) {
        this.f195465a = str;
        this.f195466b = str2;
    }

    /* JADX INFO: renamed from: m0 */
    public List<Object> m212294m0() {
        return jyb.m147507f0("moment id", this.f195465a, og3.f147188c);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
