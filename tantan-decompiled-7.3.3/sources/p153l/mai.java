package p153l;

import android.net.NetworkInfo;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class mai extends ar2<wai> {

    /* JADX INFO: renamed from: a */
    public FeedVideoFlowAct f135522a;

    /* JADX INFO: renamed from: b */
    public List<Moment> f135523b;

    /* JADX INFO: renamed from: c */
    public Set<String> f135524c;

    /* JADX INFO: renamed from: d */
    public boolean f135525d;

    /* JADX INFO: renamed from: e */
    public Moment f135526e;

    /* JADX INFO: renamed from: f */
    public yel0 f135527f;

    /* JADX INFO: renamed from: g */
    public String f135528g;

    /* JADX INFO: renamed from: h */
    public String f135529h;

    public mai(ner nerVar) {
        super(nerVar);
        this.f135523b = new ArrayList();
        this.f135524c = new HashSet();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m157668s0();
        m157669t0();
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(wai waiVar) {
        super.mo52715C(waiVar);
        this.viewModel = waiVar;
    }

    /* JADX INFO: renamed from: j0 */
    public List<Moment> m157659j0() {
        return this.f135523b;
    }

    /* JADX INFO: renamed from: k0 */
    public void m157660k0(String str) {
        Moment momentM145813w7 = FeedModule.f39703d.m145813w7(str);
        this.f135526e = momentM145813w7;
        if (NullChecker.m82486a(momentM145813w7)) {
            this.f135524c.add(this.f135526e.f56859id);
            this.f135523b.add(this.f135526e);
            ((wai) this.viewModel).m205645f(this.f135523b);
            this.f135522a.f44126e.m175939l(this.f135526e, 0);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m157661l0(pf60 pf60Var) {
        if (NullChecker.m82487b(pf60Var.f152156a)) {
            for (Moment moment : (List) pf60Var.f152156a) {
                if (!this.f135524c.contains(moment.f56859id)) {
                    this.f135524c.add(moment.f56859id);
                    this.f135523b.add(moment);
                }
            }
        }
        if (!jyb.m147479J((Collection) pf60Var.f152157b)) {
            ((wai) this.viewModel).m205657z((List) pf60Var.f152157b);
        }
        ((wai) this.viewModel).m205645f(this.f135523b);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m157662m0(Throwable th) {
        this.f135525d = !Network.isConnected(FeedModule.f39700a);
        ((wai) this.viewModel).m205648k();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m157663n0(Moment moment) {
        if (moment.f56859id.equals(this.f135526e.f56859id)) {
            this.f135522a.m68056e2();
            return;
        }
        int iIndexOf = this.f135523b.indexOf(moment);
        if (iIndexOf != -1) {
            this.f135524c.remove(moment.f56859id);
            this.f135523b.remove(moment);
            ((wai) this.viewModel).m205649l().notifyItemRemoved(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m157664o0(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m82467g() && this.f135525d) {
            m157665p0();
            this.f135525d = false;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m157665p0() {
        yel0 yel0Var = this.f135527f;
        if (yel0Var == null || yel0Var.m215419b()) {
            return;
        }
        duringCreated(this.f135527f.mo157784d()).subscribe(psd0.m173597H(new y20() { // from class: l.kai
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124692a.m157661l0((pf60) obj);
            }
        }, new y20() { // from class: l.lai
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130698a.m157662m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public void m157666q0(FeedVideoFlowAct feedVideoFlowAct) {
        this.f135522a = feedVideoFlowAct;
        this.f135528g = feedVideoFlowAct.getIntent().getStringExtra("from");
        this.f135529h = feedVideoFlowAct.getIntent().getStringExtra("VIDEO_FLOW_MOMENT_ID");
    }

    /* JADX INFO: renamed from: r0 */
    public void m157667r0(String str) {
        if ("VIDEOS_LIVE_GROUP".equals(str)) {
            this.f135527f = new rss();
        } else if (cmg.m111188P()) {
            this.f135527f = new oai(this.f135528g, this.f135529h);
        } else {
            this.f135527f = new mbi();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m157668s0() {
        duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.iai
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113596a.m157663n0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m157669t0() {
        duringCreated(ConnectivityReceiver.m82473m()).subscribe(psd0.m173596G(new y20() { // from class: l.jai
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118986a.m157664o0((NetworkInfo) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
