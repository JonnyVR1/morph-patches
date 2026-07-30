package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.InstantMatchGiveCountInfo;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Links;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class v39 extends ax6 {

    /* JADX INFO: renamed from: R */
    public b<roj0> f24109R;

    /* JADX INFO: renamed from: S */
    public List<InstantMatchGiveCountInfo> f24110S;

    public v39(C0158c c0158c) {
        super(c0158c);
        this.f24109R = b.b();
    }

    /* JADX INFO: renamed from: h3 */
    public c<Envelope> m25725h3() {
        final String strM3130G = C0154a.m3130G("/instant-match/superposie/count/config");
        return this.f8580Q.scheduled(strM3130G, 0, new v9j() { // from class: l.r39
            public final Object call() {
                return this.f20281a.m25727j3(strM3130G);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m25726i3(Envelope envelope) {
        this.f24110S = envelope.getModuleData(CoreData.class).instantMatchGiveCountInfo;
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ c m25727j3(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.t39
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).doOnNext(new e30() { // from class: l.u39
            public final void call(Object obj) {
                this.f22450a.m25726i3((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m25728k3(CoreData coreData, String str) {
        this.f8580Q.f3631f0.m4980mq((Conversation) coreData.conversations.get(0));
        DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks).id = str;
        dbLinks.links = new Links();
        CoreModule.f1542k.f11196d.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ void m25729l3(final String str, Envelope envelope) {
        final CoreData moduleData = envelope.getModuleData(CoreData.class);
        if (!NullChecker.a(moduleData) || vwb.J(moduleData.conversations)) {
            return;
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.s39
            public final void call() {
                this.f20995a.m25728k3(moduleData, str);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ c m25730m3(final String str, final JSONObject jSONObject) {
        return ia20.m16571e(new v9j() { // from class: l.p39
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3222e0(str)).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).doOnNext(new e30() { // from class: l.q39
            public final void call(Object obj) {
                this.f19550a.m25729l3(str, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: n3 */
    public c<Envelope> m25731n3(final String str, String str2, String str3) {
        final JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("consumeType", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("coinSign", str3);
            }
        } catch (JSONException unused) {
        }
        return this.f8580Q.scheduled("instant_match_" + str, -1, new v9j() { // from class: l.o39
            public final Object call() {
                return this.f17995a.m25730m3(str, jSONObject);
            }
        });
    }
}
