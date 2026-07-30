package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CityCBanner;
import com.p046p1.mobile.putong.core.data.CityCConfig;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Pagination;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class jn7 extends ax6 {

    /* JADX INFO: renamed from: R */
    public double f118814R;

    /* JADX INFO: renamed from: S */
    public C22393b<CityCData> f118815S;

    /* JADX INFO: renamed from: T */
    public C22392a<q860<Greeting>> f118816T;

    /* JADX INFO: renamed from: U */
    public C22392a<C17824a> f118817U;

    /* JADX INFO: renamed from: V */
    public C22392a<j760<CityCData, CityCBanner>> f118818V;

    /* JADX INFO: renamed from: W */
    public final HashSet<String> f118819W;

    /* JADX INFO: renamed from: X */
    public hpd0 f118820X;

    /* JADX INFO: renamed from: l.jn7$a */
    public static class C17824a {

        /* JADX INFO: renamed from: a */
        public int f118821a;

        /* JADX INFO: renamed from: b */
        public int f118822b;

        /* JADX INFO: renamed from: c */
        public long f118823c;

        /* JADX INFO: renamed from: d */
        public Greeting f118824d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17824a)) {
                return false;
            }
            C17824a c17824a = (C17824a) obj;
            return this.f118821a == c17824a.f118821a && this.f118822b == c17824a.f118822b && this.f118823c == c17824a.f118823c && this.f118824d.equals(c17824a.f118824d);
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f118821a), Integer.valueOf(this.f118822b), Long.valueOf(this.f118823c), this.f118824d);
        }
    }

    public jn7(C4732c c4732c) {
        super(c4732c);
        this.f118814R = -1.0d;
        this.f118815S = C22393b.m221521b();
        this.f118816T = C22392a.m221512b();
        this.f118817U = C22392a.m221512b();
        this.f118818V = C22392a.m221512b();
        this.f118819W = new HashSet<>();
        this.f118820X = new hpd0("received_like_conv_exist" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ stc0 m142324q3(Links links, boolean z, long j) {
        String string;
        String strM31200G = C4728a.m31200G("/city-c-users?search=suggest");
        if (!NullChecker.m81303a(links) || TextUtils.isEmpty(links.next)) {
            StringBuilder sb = new StringBuilder();
            sb.append(strM31200G);
            sb.append("&limit=");
            sb.append(z ? 1 : 20);
            sb.append("&last_read_time=");
            sb.append(j);
            string = sb.toString();
        } else {
            string = strM31200G + "&" + links.next;
        }
        return C4728a.f19494P.auth().m185898q(string).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ void m142327t3(Envelope envelope) {
        List<Message> list = ((CoreData) envelope.getModuleData(CoreData.class)).messages;
        if (vwb.m200296J(list)) {
            return;
        }
        for (Message message : list) {
            message.localGreetingId = message.cid;
        }
    }

    /* JADX INFO: renamed from: A3 */
    public C22306c<roj0> m142334A3(final String str, final String str2) {
        return this.f72126Q.scheduled("city_top_buy", -1, new v9j() { // from class: l.sm7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f165329a.m142341H3(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public void m142335B3() {
        this.f118819W.clear();
    }

    /* JADX INFO: renamed from: C3 */
    public C22306c<CityCConfig> m142336C3() {
        final String strM31200G = C4728a.m31200G("/city-c-config?search=clean");
        return this.f72126Q.scheduled("city-c-config?search=clean", 0, new v9j() { // from class: l.um7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.vm7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.wm7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).cityCConfig;
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public void m142337D3() {
        e51.m114774y(new Runnable() { // from class: l.rm7
            @Override // java.lang.Runnable
            public final void run() {
                this.f160066a.m142342I3();
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public void m142338E3(final boolean z, final long j, final Links links) {
        this.f72126Q.scheduled("get_city_top_greeting", 0, new v9j() { // from class: l.im7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f113897a.m142346M3(links, z, j);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public Greeting m142339F3(final String str) {
        q860<Greeting> q860VarM221515e = this.f118816T.m221515e();
        if (!NullChecker.m81303a(q860VarM221515e) || vwb.m200296J(q860VarM221515e.f153135a)) {
            return null;
        }
        return (Greeting) vwb.m200346r(q860VarM221515e.f153135a, new w9j() { // from class: l.in7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Greeting) obj).f20401id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m142340G3(String str, Envelope envelope) {
        boolean zEquals = TextUtils.equals(str, "coin");
        C4732c c4732c = this.f72126Q;
        if (zEquals) {
            c4732c.f19570H0.m210361k5();
        } else {
            c4732c.f19555C0.m210115x4();
        }
        m142353T3();
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ C22306c m142341H3(final String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("token", str2);
        } catch (JSONException unused) {
        }
        return ia20.m135117a(new v9j() { // from class: l.xm7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/city-c-buy")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.ym7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198964a.m142340G3(str, (Envelope) obj);
            }
        }).map(new w9j() { // from class: l.zm7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m142342I3() {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.an7
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32728Mh("fake_conversation_city_centre_enter");
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ Envelope m142343J3(final Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f72126Q.m31492w3(envelope, new d30() { // from class: l.hn7
                @Override // p149l.d30
                public final void call() {
                    jn7.m142327t3(envelope);
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m142344K3(List list, Greeting greeting) {
        if (this.f118819W.contains(greeting.f20401id)) {
            return;
        }
        this.f118819W.add(greeting.f20401id);
        list.add(greeting);
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ roj0 m142345L3(boolean z, long j, Links links, Envelope envelope) {
        q860<Greeting> q860Var;
        List<Greeting> list = ((CoreData) envelope.getModuleData(CoreData.class)).greetings;
        if (z) {
            C17824a c17824a = new C17824a();
            c17824a.f118824d = vwb.m200296J(list) ? null : list.get(0);
            Pagination pagination = envelope.pagination;
            c17824a.f118822b = pagination.total;
            c17824a.f118821a = NullChecker.m81303a(pagination.countInfo) ? envelope.pagination.countInfo.unread : 0;
            c17824a.f118823c = j;
            this.f118817U.m132487l(c17824a);
        } else {
            DbLinks dbLinks = new DbLinks();
            dbLinks.links = envelope.pagination.links;
            if (NullChecker.m81303a(this.f118816T.m221515e()) && !vwb.m200296J(list) && NullChecker.m81303a(links)) {
                final List<Greeting> list2 = this.f118816T.m221515e().f153135a;
                dbLinks.total = this.f118816T.m221515e().f153136b.total;
                vwb.m200354z(list, new e30() { // from class: l.jm7
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f118616a.m142344K3(list2, (Greeting) obj);
                    }
                });
                q860Var = new q860<>(list2, dbLinks);
            } else if (this.f118816T.m221515e() == null && this.f118819W.isEmpty() && vwb.m200296J(list)) {
                q860Var = q860.m173342b();
            } else {
                dbLinks.total = envelope.pagination.total;
                this.f118819W.addAll(vwb.m200303Q(list, new w9j() { // from class: l.km7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((Greeting) obj).f20401id;
                    }
                }));
                q860Var = new q860<>(list, dbLinks);
            }
            this.f118816T.m132487l(q860Var);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ C22306c m142346M3(final Links links, final boolean z, final long j) {
        return ia20.m135121e(new v9j() { // from class: l.tm7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return jn7.m142324q3(links, z, j);
            }
        }).map(new w9j() { // from class: l.bn7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f76374a.m142343J3((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.cn7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f81648a.m142345L3(z, j, links, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Envelope m142347N3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m142348O3(Envelope envelope) {
        CityCBanner cityCBanner = null;
        CityCData cityCData = !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).cityCData) ? ((CoreData) envelope.getModuleData(CoreData.class)).cityCData.get(0) : null;
        if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).cityCBanner) && !TextUtils.isEmpty(((CoreData) envelope.getModuleData(CoreData.class)).cityCBanner.text) && !TextUtils.isEmpty(((CoreData) envelope.getModuleData(CoreData.class)).cityCBanner.title)) {
            cityCBanner = ((CoreData) envelope.getModuleData(CoreData.class)).cityCBanner;
        }
        this.f118818V.m132487l(j760.m140076a(cityCData, cityCBanner));
        this.f72126Q.f19642f0.f19903U1.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ C22306c m142349P3(final String str) {
        return new la20(new v9j() { // from class: l.en7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.fn7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f98401a.m142347N3((Envelope) obj);
            }
        }).compose(C4728a.m31252T2()).doOnNext(new e30() { // from class: l.gn7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103578a.m142348O3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ void m142350Q3(CityCData cityCData) {
        this.f118815S.m132487l(cityCData);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ C22306c m142351R3() {
        return ia20.m135121e(new v9j() { // from class: l.nm7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/city-c-broadcast")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.om7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144589a.m142352S3((Envelope) obj);
            }
        }).filter(new w9j() { // from class: l.pm7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((CityCData) obj));
            }
        }).compose(mkd0.m154951C()).doOnNext(new e30() { // from class: l.qm7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155285a.m142350Q3((CityCData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ CityCData m142352S3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        List<CityCData> list = ((CoreData) envelope.getModuleData(CoreData.class)).cityCData;
        if (vwb.m200296J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: T3 */
    public void m142353T3() {
        this.f118814R = mqi0.m155944o();
        final String strM208761i = xh5.m208761i("/city-c");
        this.f72126Q.scheduled("load_city_centre", 0, new v9j() { // from class: l.dn7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f87032a.m142349P3(strM208761i);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public C22306c<CityCData> m142354U3() {
        return this.f72126Q.scheduled("poll_city_top_broadcast", 0, new v9j() { // from class: l.mm7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f134555a.m142351R3();
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public void m142355V3(final String str) {
        if (NullChecker.m81303a(this.f118816T.m221515e()) && vwb.m200322e0(this.f118816T.m221515e().f153135a, new w9j() { // from class: l.lm7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Greeting) obj).f20401id.equals(str));
            }
        })) {
            this.f118816T.m221515e().f153136b.total--;
            if (this.f118819W.contains(str)) {
                this.f118819W.remove(str);
            }
        }
    }
}
