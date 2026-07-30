package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CityCBanner;
import com.p1.mobile.putong.core.data.CityCConfig;
import com.p1.mobile.putong.core.data.CityCData;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Pagination;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import l.d30;
import l.e30;
import l.e51;
import l.hpd0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.q860;
import l.roj0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jn7 extends ax6 {

    /* JADX INFO: renamed from: R */
    public double f15272R;

    /* JADX INFO: renamed from: S */
    public b<CityCData> f15273S;

    /* JADX INFO: renamed from: T */
    public a<q860<Greeting>> f15274T;

    /* JADX INFO: renamed from: U */
    public a<C0896a> f15275U;

    /* JADX INFO: renamed from: V */
    public a<j760<CityCData, CityCBanner>> f15276V;

    /* JADX INFO: renamed from: W */
    public final HashSet<String> f15277W;

    /* JADX INFO: renamed from: X */
    public hpd0 f15278X;

    /* JADX INFO: renamed from: l.jn7$a */
    public static class C0896a {

        /* JADX INFO: renamed from: a */
        public int f15279a;

        /* JADX INFO: renamed from: b */
        public int f15280b;

        /* JADX INFO: renamed from: c */
        public long f15281c;

        /* JADX INFO: renamed from: d */
        public Greeting f15282d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0896a)) {
                return false;
            }
            C0896a c0896a = (C0896a) obj;
            return this.f15279a == c0896a.f15279a && this.f15280b == c0896a.f15280b && this.f15281c == c0896a.f15281c && this.f15282d.equals(c0896a.f15282d);
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f15279a), Integer.valueOf(this.f15280b), Long.valueOf(this.f15281c), this.f15282d);
        }
    }

    public jn7(C0158c c0158c) {
        super(c0158c);
        this.f15272R = -1.0d;
        this.f15273S = b.b();
        this.f15274T = a.b();
        this.f15275U = a.b();
        this.f15276V = a.b();
        this.f15277W = new HashSet<>();
        this.f15278X = new hpd0("received_like_conv_exist" + CoreModule.m1850H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ stc0 m17635q3(Links links, boolean z, long j) {
        String string;
        String strM3130G = C0154a.m3130G("/city-c-users?search=suggest");
        if (!NullChecker.a(links) || TextUtils.isEmpty(links.next)) {
            StringBuilder sb = new StringBuilder();
            sb.append(strM3130G);
            sb.append("&limit=");
            sb.append(z ? 1 : 20);
            sb.append("&last_read_time=");
            sb.append(j);
            string = sb.toString();
        } else {
            string = strM3130G + "&" + links.next;
        }
        return C0154a.f3483P.auth().q(string).f().b();
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ void m17638t3(Envelope envelope) {
        List<Message> list = envelope.getModuleData(CoreData.class).messages;
        if (vwb.J(list)) {
            return;
        }
        for (Message message : list) {
            message.localGreetingId = message.cid;
        }
    }

    /* JADX INFO: renamed from: A3 */
    public c<roj0> m17645A3(final String str, final String str2) {
        return this.f8580Q.scheduled("city_top_buy", -1, new v9j() { // from class: l.sm7
            public final Object call() {
                return this.f21424a.m17652H3(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public void m17646B3() {
        this.f15277W.clear();
    }

    /* JADX INFO: renamed from: C3 */
    public c<CityCConfig> m17647C3() {
        final String strM3130G = C0154a.m3130G("/city-c-config?search=clean");
        return this.f8580Q.scheduled("city-c-config?search=clean", 0, new v9j() { // from class: l.um7
            public final Object call() {
                return new la20(new v9j() { // from class: l.vm7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }).map(new w9j() { // from class: l.wm7
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).cityCConfig;
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public void m17648D3() {
        e51.y(new Runnable() { // from class: l.rm7
            @Override // java.lang.Runnable
            public final void run() {
                this.f20626a.m17653I3();
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public void m17649E3(final boolean z, final long j, final Links links) {
        this.f8580Q.scheduled("get_city_top_greeting", 0, new v9j() { // from class: l.im7
            public final Object call() {
                return this.f14556a.m17657M3(links, z, j);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public Greeting m17650F3(final String str) {
        q860 q860Var = (q860) this.f15274T.e();
        if (!NullChecker.a(q860Var) || vwb.J(q860Var.a)) {
            return null;
        }
        return (Greeting) vwb.r(q860Var.a, new w9j() { // from class: l.in7
            public final Object call(Object obj) {
                return Boolean.valueOf(((Greeting) obj).id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m17651G3(String str, Envelope envelope) {
        boolean zEquals = TextUtils.equals(str, "coin");
        C0158c c0158c = this.f8580Q;
        if (zEquals) {
            c0158c.f3559H0.m27536k5();
        } else {
            c0158c.f3544C0.m27423x4();
        }
        m17664T3();
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ c m17652H3(final String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("token", str2);
        } catch (JSONException unused) {
        }
        return ia20.m16567a(new v9j() { // from class: l.xm7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/city-c-buy")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).doOnNext(new e30() { // from class: l.ym7
            public final void call(Object obj) {
                this.f28297a.m17651G3(str, (Envelope) obj);
            }
        }).map(new w9j() { // from class: l.zm7
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m17653I3() {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.an7
            public final void call() {
                CoreModule.f1534c.f3631f0.m4658Mh("fake_conversation_city_centre_enter");
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ Envelope m17654J3(final Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            this.f8580Q.m3422w3(envelope, new d30() { // from class: l.hn7
                public final void call() {
                    jn7.m17638t3(envelope);
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m17655K3(List list, Greeting greeting) {
        if (this.f15277W.contains(greeting.id)) {
            return;
        }
        this.f15277W.add(greeting.id);
        list.add(greeting);
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ roj0 m17656L3(boolean z, long j, Links links, Envelope envelope) {
        q860 q860Var;
        List list = envelope.getModuleData(CoreData.class).greetings;
        if (z) {
            C0896a c0896a = new C0896a();
            c0896a.f15282d = vwb.J(list) ? null : (Greeting) list.get(0);
            Pagination pagination = envelope.pagination;
            c0896a.f15280b = pagination.total;
            c0896a.f15279a = NullChecker.a(pagination.countInfo) ? envelope.pagination.countInfo.unread : 0;
            c0896a.f15281c = j;
            this.f15275U.onNext(c0896a);
        } else {
            DbLinks dbLinks = new DbLinks();
            dbLinks.links = envelope.pagination.links;
            if (NullChecker.a(this.f15274T.e()) && !vwb.J(list) && NullChecker.a(links)) {
                final List list2 = ((q860) this.f15274T.e()).a;
                dbLinks.total = ((q860) this.f15274T.e()).b.total;
                vwb.z(list, new e30() { // from class: l.jm7
                    public final void call(Object obj) {
                        this.f15264a.m17655K3(list2, (Greeting) obj);
                    }
                });
                q860Var = new q860(list2, dbLinks);
            } else if (this.f15274T.e() == null && this.f15277W.isEmpty() && vwb.J(list)) {
                q860Var = q860.b();
            } else {
                dbLinks.total = envelope.pagination.total;
                this.f15277W.addAll(vwb.Q(list, new w9j() { // from class: l.km7
                    public final Object call(Object obj) {
                        return ((Greeting) obj).id;
                    }
                }));
                q860Var = new q860(list, dbLinks);
            }
            this.f15274T.onNext(q860Var);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ c m17657M3(final Links links, final boolean z, final long j) {
        return ia20.m16571e(new v9j() { // from class: l.tm7
            public final Object call() {
                return jn7.m17635q3(links, z, j);
            }
        }).map(new w9j() { // from class: l.bn7
            public final Object call(Object obj) {
                return this.f8999a.m17654J3((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.cn7
            public final Object call(Object obj) {
                return this.f9740a.m17656L3(z, j, links, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Envelope m17658N3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m17659O3(Envelope envelope) {
        CityCBanner cityCBanner = null;
        CityCData cityCData = !vwb.J(envelope.getModuleData(CoreData.class).cityCData) ? (CityCData) envelope.getModuleData(CoreData.class).cityCData.get(0) : null;
        if (NullChecker.a(envelope.getModuleData(CoreData.class).cityCBanner) && !TextUtils.isEmpty(envelope.getModuleData(CoreData.class).cityCBanner.text) && !TextUtils.isEmpty(envelope.getModuleData(CoreData.class).cityCBanner.title)) {
            cityCBanner = envelope.getModuleData(CoreData.class).cityCBanner;
        }
        this.f15276V.onNext(j760.a(cityCData, cityCBanner));
        this.f8580Q.f3631f0.f3892U1.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ c m17660P3(final String str) {
        return new la20(new v9j() { // from class: l.en7
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.fn7
            public final Object call(Object obj) {
                return this.f12794a.m17658N3((Envelope) obj);
            }
        }).compose(C0154a.m3182T2()).doOnNext(new e30() { // from class: l.gn7
            public final void call(Object obj) {
                this.f13403a.m17659O3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ void m17661Q3(CityCData cityCData) {
        this.f15273S.onNext(cityCData);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ c m17662R3() {
        return ia20.m16571e(new v9j() { // from class: l.nm7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/city-c-broadcast")).f().b();
            }
        }).map(new w9j() { // from class: l.om7
            public final Object call(Object obj) {
                return this.f18281a.m17663S3((Envelope) obj);
            }
        }).filter(new w9j() { // from class: l.pm7
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((CityCData) obj));
            }
        }).compose(mkd0.C()).doOnNext(new e30() { // from class: l.qm7
            public final void call(Object obj) {
                this.f19908a.m17661Q3((CityCData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ CityCData m17663S3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        List list = envelope.getModuleData(CoreData.class).cityCData;
        if (vwb.J(list)) {
            return null;
        }
        return (CityCData) list.get(0);
    }

    /* JADX INFO: renamed from: T3 */
    public void m17664T3() {
        this.f15272R = mqi0.o();
        final String strM27250i = xh5.m27250i("/city-c");
        this.f8580Q.scheduled("load_city_centre", 0, new v9j() { // from class: l.dn7
            public final Object call() {
                return this.f10485a.m17660P3(strM27250i);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public c<CityCData> m17665U3() {
        return this.f8580Q.scheduled("poll_city_top_broadcast", 0, new v9j() { // from class: l.mm7
            public final Object call() {
                return this.f17077a.m17662R3();
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public void m17666V3(final String str) {
        if (NullChecker.a(this.f15274T.e()) && vwb.e0(((q860) this.f15274T.e()).a, new w9j() { // from class: l.lm7
            public final Object call(Object obj) {
                return Boolean.valueOf(((Greeting) obj).id.equals(str));
            }
        })) {
            ((q860) this.f15274T.e()).b.total--;
            if (this.f15277W.contains(str)) {
                this.f15277W.remove(str);
            }
        }
    }
}
