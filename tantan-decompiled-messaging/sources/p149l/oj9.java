package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkState;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class oj9 extends xh5 {
    public oj9(xh5 xh5Var) {
        super(xh5Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Link m164636A(Link link, Envelope envelope) {
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
    public static /* synthetic */ Link m164638y(Envelope envelope) {
        f8c.m119878o().m119897u(envelope);
        return ((CommonData) envelope.getModuleData(CommonData.class)).links.get(0);
    }

    /* JADX INFO: renamed from: B */
    public C22306c<Link> m164640B(final String str) {
        final Link link = new Link();
        link.state = LinkState.get(LinkState.published);
        return now(new la20(new v9j() { // from class: l.mj9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(xh5.m208768p("/links/" + str)).m185892k(utc0.create(Network.JSON, link.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.nj9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return oj9.m164638y((Envelope) obj);
            }
        }).compose(xh5.m208775w()));
    }

    /* JADX INFO: renamed from: C */
    public C22306c<Link> m164641C(final Link link) {
        return now(new la20(new v9j() { // from class: l.kj9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(xh5.m208768p("/links")).m185893l(utc0.create(Network.JSON, link.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.lj9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return oj9.m164636A(link, (Envelope) obj);
            }
        }).compose(xh5.m208775w()));
    }
}
