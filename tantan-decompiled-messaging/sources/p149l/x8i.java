package p149l;

import android.net.NetworkInfo;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class x8i extends jq2<h9i> {

    /* JADX INFO: renamed from: a */
    public FeedVideoFlowAct f191515a;

    /* JADX INFO: renamed from: b */
    public List<Moment> f191516b;

    /* JADX INFO: renamed from: c */
    public Set<String> f191517c;

    /* JADX INFO: renamed from: d */
    public boolean f191518d;

    /* JADX INFO: renamed from: e */
    public Moment f191519e;

    /* JADX INFO: renamed from: f */
    public u5l0 f191520f;

    /* JADX INFO: renamed from: g */
    public String f191521g;

    /* JADX INFO: renamed from: h */
    public String f191522h;

    public x8i(mcr mcrVar) {
        super(mcrVar);
        this.f191516b = new ArrayList();
        this.f191517c = new HashSet();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m207415s0();
        m207416t0();
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(h9i h9iVar) {
        super.mo51532C(h9iVar);
        this.viewModel = h9iVar;
    }

    /* JADX INFO: renamed from: j0 */
    public List<Moment> m207406j0() {
        return this.f191516b;
    }

    /* JADX INFO: renamed from: k0 */
    public void m207407k0(String str) {
        Moment momentM209572w7 = FeedModule.f38855d.m209572w7(str);
        this.f191519e = momentM209572w7;
        if (NullChecker.m81303a(momentM209572w7)) {
            this.f191517c.add(this.f191519e.f56011id);
            this.f191516b.add(this.f191519e);
            ((h9i) this.viewModel).m130014f(this.f191516b);
            this.f191515a.f43278e.m100811l(this.f191519e, 0);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m207408l0(j760 j760Var) {
        if (NullChecker.m81304b(j760Var.f116564a)) {
            for (Moment moment : (List) j760Var.f116564a) {
                if (!this.f191517c.contains(moment.f56011id)) {
                    this.f191517c.add(moment.f56011id);
                    this.f191516b.add(moment);
                }
            }
        }
        if (!vwb.m200296J((Collection) j760Var.f116565b)) {
            ((h9i) this.viewModel).m130026z((List) j760Var.f116565b);
        }
        ((h9i) this.viewModel).m130014f(this.f191516b);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m207409m0(Throwable th) {
        this.f191518d = !Network.isConnected(FeedModule.f38852a);
        ((h9i) this.viewModel).m130017k();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m207410n0(Moment moment) {
        if (moment.f56011id.equals(this.f191519e.f56011id)) {
            this.f191515a.m66873d2();
            return;
        }
        int iIndexOf = this.f191516b.indexOf(moment);
        if (iIndexOf != -1) {
            this.f191517c.remove(moment.f56011id);
            this.f191516b.remove(moment);
            ((h9i) this.viewModel).m130018l().notifyItemRemoved(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m207411o0(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m81284g() && this.f191518d) {
            m207412p0();
            this.f191518d = false;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m207412p0() {
        u5l0 u5l0Var = this.f191520f;
        if (u5l0Var == null || u5l0Var.m191869b()) {
            return;
        }
        duringCreated(this.f191520f.mo175962d()).subscribe(mkd0.m154956H(new e30() { // from class: l.v8i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180535a.m207408l0((j760) obj);
            }
        }, new e30() { // from class: l.w8i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185216a.m207409m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public void m207413q0(FeedVideoFlowAct feedVideoFlowAct) {
        this.f191515a = feedVideoFlowAct;
        this.f191521g = feedVideoFlowAct.getIntent().getStringExtra("from");
        this.f191522h = feedVideoFlowAct.getIntent().getStringExtra("VIDEO_FLOW_MOMENT_ID");
    }

    /* JADX INFO: renamed from: r0 */
    public void m207414r0(String str) {
        if ("VIDEOS_LIVE_GROUP".equals(str)) {
            this.f191520f = new qqs();
        } else if (nkg.m159859P()) {
            this.f191520f = new z8i(this.f191521g, this.f191522h);
        } else {
            this.f191520f = new x9i();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m207415s0() {
        duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.t8i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168922a.m207410n0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m207416t0() {
        duringCreated(ConnectivityReceiver.m81290m()).subscribe(mkd0.m154955G(new e30() { // from class: l.u8i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175138a.m207411o0((NetworkInfo) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
