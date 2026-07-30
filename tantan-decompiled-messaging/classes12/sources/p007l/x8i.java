package p007l;

import android.net.NetworkInfo;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p1.mobile.putong.api.api.Network;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class x8i extends jq2<h9i> {

    /* JADX INFO: renamed from: a */
    public FeedVideoFlowAct f14801a;

    /* JADX INFO: renamed from: b */
    public List<Moment> f14802b;

    /* JADX INFO: renamed from: c */
    public Set<String> f14803c;

    /* JADX INFO: renamed from: d */
    public boolean f14804d;

    /* JADX INFO: renamed from: e */
    public Moment f14805e;

    /* JADX INFO: renamed from: f */
    public u5l0 f14806f;

    /* JADX INFO: renamed from: g */
    public String f14807g;

    /* JADX INFO: renamed from: h */
    public String f14808h;

    public x8i(mcr mcrVar) {
        super(mcrVar);
        this.f14802b = new ArrayList();
        this.f14803c = new HashSet();
    }

    /* JADX INFO: renamed from: a0 */
    public void m16047a0() {
        super.a0();
        m16058s0();
        m16059t0();
    }

    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void m16046C(h9i h9iVar) {
        super.C(h9iVar);
        ((jq2) this).viewModel = h9iVar;
    }

    /* JADX INFO: renamed from: j0 */
    public List<Moment> m16049j0() {
        return this.f14802b;
    }

    /* JADX INFO: renamed from: k0 */
    public void m16050k0(String str) {
        Moment momentM16753w7 = FeedModule.f316d.m16753w7(str);
        this.f14805e = momentM16753w7;
        if (NullChecker.a(momentM16753w7)) {
            this.f14803c.add(((DbObject) this.f14805e).id);
            this.f14802b.add(this.f14805e);
            ((h9i) ((jq2) this).viewModel).m10575f(this.f14802b);
            this.f14801a.f4739e.m8777l(this.f14805e, 0);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m16051l0(j760 j760Var) {
        if (NullChecker.b(j760Var.a)) {
            for (Moment moment : (List) j760Var.a) {
                if (!this.f14803c.contains(((DbObject) moment).id)) {
                    this.f14803c.add(((DbObject) moment).id);
                    this.f14802b.add(moment);
                }
            }
        }
        if (!vwb.J((Collection) j760Var.b)) {
            ((h9i) ((jq2) this).viewModel).m10588z((List) j760Var.b);
        }
        ((h9i) ((jq2) this).viewModel).m10575f(this.f14802b);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m16052m0(Throwable th) {
        this.f14804d = !Network.isConnected(FeedModule.f313a);
        ((h9i) ((jq2) this).viewModel).m10579k();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m16053n0(Moment moment) {
        if (((DbObject) moment).id.equals(((DbObject) this.f14805e).id)) {
            this.f14801a.finish();
            return;
        }
        int iIndexOf = this.f14802b.indexOf(moment);
        if (iIndexOf != -1) {
            this.f14803c.remove(((DbObject) moment).id);
            this.f14802b.remove(moment);
            ((h9i) ((jq2) this).viewModel).m10580l().notifyItemRemoved(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m16054o0(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.g() && this.f14804d) {
            m16055p0();
            this.f14804d = false;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m16055p0() {
        u5l0 u5l0Var = this.f14806f;
        if (u5l0Var == null || u5l0Var.m14771b()) {
            return;
        }
        duringCreated(this.f14806f.mo13696d()).subscribe(mkd0.H(new e30() { // from class: l.v8i
            public final void call(Object obj) {
                this.f14102a.m16051l0((j760) obj);
            }
        }, new e30() { // from class: l.w8i
            public final void call(Object obj) {
                this.f14467a.m16052m0((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public void m16056q0(FeedVideoFlowAct feedVideoFlowAct) {
        this.f14801a = feedVideoFlowAct;
        this.f14807g = feedVideoFlowAct.getIntent().getStringExtra("from");
        this.f14808h = feedVideoFlowAct.getIntent().getStringExtra("VIDEO_FLOW_MOMENT_ID");
    }

    /* JADX INFO: renamed from: r0 */
    public void m16057r0(String str) {
        if ("VIDEOS_LIVE_GROUP".equals(str)) {
            this.f14806f = new qqs();
        } else if (nkg.m12218P()) {
            this.f14806f = new z8i(this.f14807g, this.f14808h);
        } else {
            this.f14806f = new x9i();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m16058s0() {
        duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.t8i
            public final void call(Object obj) {
                this.f13230a.m16053n0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m16059t0() {
        duringCreated(ConnectivityReceiver.m()).subscribe(mkd0.G(new e30() { // from class: l.u8i
            public final void call(Object obj) {
                this.f13592a.m16054o0((NetworkInfo) obj);
            }
        }));
    }

    public void destroy() {
    }
}
