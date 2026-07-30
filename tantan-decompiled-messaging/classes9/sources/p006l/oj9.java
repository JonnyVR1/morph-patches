package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.LinkState;
import l.f8c;
import l.utc0;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class oj9 extends xh5 {
    public oj9(xh5 xh5Var) {
        super(xh5Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Link m20683A(Link link, Envelope envelope) {
        Link link2 = (Link) envelope.getModuleData(CommonData.class).links.get(0);
        if (link2.channel == null) {
            link2.channel = link.channel;
        }
        if (link2.intent == null) {
            link2.intent = link.intent;
        }
        return link2;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Link m20685y(Envelope envelope) {
        f8c.o().u(envelope);
        return (Link) envelope.getModuleData(CommonData.class).links.get(0);
    }

    /* JADX INFO: renamed from: B */
    public c<Link> m20687B(final String str) {
        final Link link = new Link();
        link.state = LinkState.get("published");
        return now(new la20(new v9j() { // from class: l.mj9
            public final Object call() {
                return qib0.f19784H.auth().q(xh5.m27257p("/links/" + str)).k(utc0.create(Network.JSON, link.toJson())).b();
            }
        }).map(new w9j() { // from class: l.nj9
            public final Object call(Object obj) {
                return oj9.m20685y((Envelope) obj);
            }
        }).compose(xh5.m27264w()));
    }

    /* JADX INFO: renamed from: C */
    public c<Link> m20688C(final Link link) {
        return now(new la20(new v9j() { // from class: l.kj9
            public final Object call() {
                return qib0.f19784H.auth().q(xh5.m27257p("/links")).l(utc0.create(Network.JSON, link.toJson())).b();
            }
        }).map(new w9j() { // from class: l.lj9
            public final Object call(Object obj) {
                return oj9.m20683A(link, (Envelope) obj);
            }
        }).compose(xh5.m27264w()));
    }
}
