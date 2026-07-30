package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkState;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class xk9 extends xi5 {
    public xk9(xi5 xi5Var) {
        super(xi5Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Link m211348A(Link link, Envelope envelope) {
        Link link2 = ((CommonData) envelope.getModuleData(CommonData.class)).links.get(0);
        if (link2.channel == null) {
            link2.channel = link.channel;
        }
        if (link2.intent == null) {
            link2.intent = link.intent;
        }
        return link2;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Link m211350y(Envelope envelope) {
        l9c.m153394o().m153413u(envelope);
        return ((CommonData) envelope.getModuleData(CommonData.class)).links.get(0);
    }

    /* JADX INFO: renamed from: B */
    public C22421c<Link> m211352B(final String str) {
        final Link link = new Link();
        link.state = LinkState.get(LinkState.published);
        return now(new ti20(new pcj() { // from class: l.vk9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(xi5.m211114p("/links/" + str)).m209037k(z1d0.create(Network.JSON, link.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.wk9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return xk9.m211350y((Envelope) obj);
            }
        }).compose(xi5.m211121w()));
    }

    /* JADX INFO: renamed from: C */
    public C22421c<Link> m211353C(final Link link) {
        return now(new ti20(new pcj() { // from class: l.tk9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(xi5.m211114p("/links")).m209038l(z1d0.create(Network.JSON, link.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.uk9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return xk9.m211348A(link, (Envelope) obj);
            }
        }).compose(xi5.m211121w()));
    }
}
