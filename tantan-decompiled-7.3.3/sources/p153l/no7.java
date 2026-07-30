package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CityCBanner;
import com.p051p1.mobile.putong.core.data.CityCConfig;
import com.p051p1.mobile.putong.core.data.CityCData;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Pagination;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class no7 extends dy6 {

    /* JADX INFO: renamed from: R */
    public double f142915R;

    /* JADX INFO: renamed from: S */
    public C22508b<CityCData> f142916S;

    /* JADX INFO: renamed from: T */
    public C22507a<vg60<Greeting>> f142917T;

    /* JADX INFO: renamed from: U */
    public C22507a<C18912a> f142918U;

    /* JADX INFO: renamed from: V */
    public C22507a<pf60<CityCData, CityCBanner>> f142919V;

    /* JADX INFO: renamed from: W */
    public final HashSet<String> f142920W;

    /* JADX INFO: renamed from: X */
    public jxd0 f142921X;

    /* JADX INFO: renamed from: l.no7$a */
    public static class C18912a {

        /* JADX INFO: renamed from: a */
        public int f142922a;

        /* JADX INFO: renamed from: b */
        public int f142923b;

        /* JADX INFO: renamed from: c */
        public long f142924c;

        /* JADX INFO: renamed from: d */
        public Greeting f142925d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18912a)) {
                return false;
            }
            C18912a c18912a = (C18912a) obj;
            return this.f142922a == c18912a.f142922a && this.f142923b == c18912a.f142923b && this.f142924c == c18912a.f142924c && this.f142925d.equals(c18912a.f142925d);
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f142922a), Integer.valueOf(this.f142923b), Long.valueOf(this.f142924c), this.f142925d);
        }
    }

    public no7(C4883c c4883c) {
        super(c4883c);
        this.f142915R = -1.0d;
        this.f142916S = C22508b.m222767b();
        this.f142917T = C22507a.m222758b();
        this.f142918U = C22507a.m222758b();
        this.f142919V = C22507a.m222758b();
        this.f142920W = new HashSet<>();
        this.f142921X = new jxd0("received_like_conv_exist" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: q3 */
    public static /* synthetic */ x1d0 m164060q3(Links links, boolean z, long j) {
        String string;
        String strM32203G = C4879a.m32203G("/city-c-users?search=suggest");
        if (!NullChecker.m82486a(links) || TextUtils.isEmpty(links.next)) {
            StringBuilder sb = new StringBuilder();
            sb.append(strM32203G);
            sb.append("&limit=");
            sb.append(z ? 1 : 20);
            sb.append("&last_read_time=");
            sb.append(j);
            string = sb.toString();
        } else {
            string = strM32203G + "&" + links.next;
        }
        return C4879a.f20236P.auth().m209043q(string).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ void m164063t3(Envelope envelope) {
        List<Message> list = ((CoreData) envelope.getModuleData(CoreData.class)).messages;
        if (jyb.m147479J(list)) {
            return;
        }
        for (Message message : list) {
            message.localGreetingId = message.cid;
        }
    }

    /* JADX INFO: renamed from: A3 */
    public C22421c<uxj0> m164070A3(final String str, final String str2) {
        return this.f91137Q.scheduled("city_top_buy", -1, new pcj() { // from class: l.wn7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f189876a.m164077H3(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public void m164071B3() {
        this.f142920W.clear();
    }

    /* JADX INFO: renamed from: C3 */
    public C22421c<CityCConfig> m164072C3() {
        final String strM32203G = C4879a.m32203G("/city-c-config?search=clean");
        return this.f91137Q.scheduled("city-c-config?search=clean", 0, new pcj() { // from class: l.yn7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.zn7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.ao7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).cityCConfig;
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public void m164073D3() {
        l51.m152919y(new Runnable() { // from class: l.vn7
            @Override // java.lang.Runnable
            public final void run() {
                this.f184840a.m164078I3();
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public void m164074E3(final boolean z, final long j, final Links links) {
        this.f91137Q.scheduled("get_city_top_greeting", 0, new pcj() { // from class: l.mn7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f137652a.m164082M3(links, z, j);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public Greeting m164075F3(final String str) {
        vg60<Greeting> vg60VarM222761e = this.f142917T.m222761e();
        if (!NullChecker.m82486a(vg60VarM222761e) || jyb.m147479J(vg60VarM222761e.f184001a)) {
            return null;
        }
        return (Greeting) jyb.m147529r(vg60VarM222761e.f184001a, new qcj() { // from class: l.mo7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Greeting) obj).f21143id.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m164076G3(String str, Envelope envelope) {
        boolean zEquals = TextUtils.equals(str, "coin");
        C4883c c4883c = this.f91137Q;
        if (zEquals) {
            c4883c.f20312H0.m155449k5();
        } else {
            c4883c.f20297C0.m146428y4();
        }
        m164089T3();
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ C22421c m164077H3(final String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("token", str2);
        } catch (JSONException unused) {
        }
        return qi20.m176654a(new pcj() { // from class: l.bo7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/city-c-buy")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.co7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82815a.m164076G3(str, (Envelope) obj);
            }
        }).map(new qcj() { // from class: l.do7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m164078I3() {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.eo7
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33731Mh("fake_conversation_city_centre_enter");
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ Envelope m164079J3(final Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f91137Q.m32495w3(envelope, new x20() { // from class: l.lo7
                @Override // p153l.x20
                public final void call() {
                    no7.m164063t3(envelope);
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m164080K3(List list, Greeting greeting) {
        if (this.f142920W.contains(greeting.f21143id)) {
            return;
        }
        this.f142920W.add(greeting.f21143id);
        list.add(greeting);
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ uxj0 m164081L3(boolean z, long j, Links links, Envelope envelope) {
        vg60<Greeting> vg60Var;
        List<Greeting> list = ((CoreData) envelope.getModuleData(CoreData.class)).greetings;
        if (z) {
            C18912a c18912a = new C18912a();
            c18912a.f142925d = jyb.m147479J(list) ? null : list.get(0);
            Pagination pagination = envelope.pagination;
            c18912a.f142923b = pagination.total;
            c18912a.f142922a = NullChecker.m82486a(pagination.countInfo) ? envelope.pagination.countInfo.unread : 0;
            c18912a.f142924c = j;
            this.f142918U.m137019l(c18912a);
        } else {
            DbLinks dbLinks = new DbLinks();
            dbLinks.links = envelope.pagination.links;
            if (NullChecker.m82486a(this.f142917T.m222761e()) && !jyb.m147479J(list) && NullChecker.m82486a(links)) {
                final List<Greeting> list2 = this.f142917T.m222761e().f184001a;
                dbLinks.total = this.f142917T.m222761e().f184002b.total;
                jyb.m147537z(list, new y20() { // from class: l.nn7
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f142762a.m164080K3(list2, (Greeting) obj);
                    }
                });
                vg60Var = new vg60<>(list2, dbLinks);
            } else if (this.f142917T.m222761e() == null && this.f142920W.isEmpty() && jyb.m147479J(list)) {
                vg60Var = vg60.m201220b();
            } else {
                dbLinks.total = envelope.pagination.total;
                this.f142920W.addAll(jyb.m147486Q(list, new qcj() { // from class: l.on7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((Greeting) obj).f21143id;
                    }
                }));
                vg60Var = new vg60<>(list, dbLinks);
            }
            this.f142917T.m137019l(vg60Var);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ C22421c m164082M3(final Links links, final boolean z, final long j) {
        return qi20.m176658e(new pcj() { // from class: l.xn7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return no7.m164060q3(links, z, j);
            }
        }).map(new qcj() { // from class: l.fo7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f100040a.m164079J3((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.go7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f105266a.m164081L3(z, j, links, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Envelope m164083N3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m164084O3(Envelope envelope) {
        CityCBanner cityCBanner = null;
        CityCData cityCData = !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).cityCData) ? ((CoreData) envelope.getModuleData(CoreData.class)).cityCData.get(0) : null;
        if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).cityCBanner) && !TextUtils.isEmpty(((CoreData) envelope.getModuleData(CoreData.class)).cityCBanner.text) && !TextUtils.isEmpty(((CoreData) envelope.getModuleData(CoreData.class)).cityCBanner.title)) {
            cityCBanner = ((CoreData) envelope.getModuleData(CoreData.class)).cityCBanner;
        }
        this.f142919V.m137019l(pf60.m172085a(cityCData, cityCBanner));
        this.f91137Q.f20384f0.f20645U1.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ C22421c m164085P3(final String str) {
        return new ti20(new pcj() { // from class: l.io7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.jo7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f121974a.m164083N3((Envelope) obj);
            }
        }).compose(C4879a.m32255T2()).doOnNext(new y20() { // from class: l.ko7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127698a.m164084O3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ void m164086Q3(CityCData cityCData) {
        this.f142916S.m137019l(cityCData);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ C22421c m164087R3() {
        return qi20.m176658e(new pcj() { // from class: l.rn7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/city-c-broadcast")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.sn7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f169650a.m164088S3((Envelope) obj);
            }
        }).filter(new qcj() { // from class: l.tn7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((CityCData) obj));
            }
        }).compose(psd0.m173592C()).doOnNext(new y20() { // from class: l.un7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179703a.m164086Q3((CityCData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ CityCData m164088S3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        List<CityCData> list = ((CoreData) envelope.getModuleData(CoreData.class)).cityCData;
        if (jyb.m147479J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: T3 */
    public void m164089T3() {
        this.f142915R = pzi0.m174454o();
        final String strM211107i = xi5.m211107i("/city-c");
        this.f91137Q.scheduled("load_city_centre", 0, new pcj() { // from class: l.ho7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f110872a.m164085P3(strM211107i);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public C22421c<CityCData> m164090U3() {
        return this.f91137Q.scheduled("poll_city_top_broadcast", 0, new pcj() { // from class: l.qn7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f158471a.m164087R3();
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public void m164091V3(final String str) {
        if (NullChecker.m82486a(this.f142917T.m222761e()) && jyb.m147505e0(this.f142917T.m222761e().f184001a, new qcj() { // from class: l.pn7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Greeting) obj).f21143id.equals(str));
            }
        })) {
            this.f142917T.m222761e().f184002b.total--;
            if (this.f142920W.contains(str)) {
                this.f142920W.remove(str);
            }
        }
    }
}
