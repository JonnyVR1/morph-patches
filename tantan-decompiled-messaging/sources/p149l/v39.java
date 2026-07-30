package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.InstantMatchGiveCountInfo;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class v39 extends ax6 {

    /* JADX INFO: renamed from: R */
    public C22393b<roj0> f179756R;

    /* JADX INFO: renamed from: S */
    public List<InstantMatchGiveCountInfo> f179757S;

    public v39(C4732c c4732c) {
        super(c4732c);
        this.f179756R = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: h3 */
    public C22306c<Envelope> m196841h3() {
        final String strM31200G = C4728a.m31200G("/instant-match/superposie/count/config");
        return this.f72126Q.scheduled(strM31200G, 0, new v9j() { // from class: l.r39
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f157513a.m196843j3(strM31200G);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m196842i3(Envelope envelope) {
        this.f179757S = ((CoreData) envelope.getModuleData(CoreData.class)).instantMatchGiveCountInfo;
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ C22306c m196843j3(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.t39
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).doOnNext(new e30() { // from class: l.u39
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173584a.m196842i3((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m196844k3(CoreData coreData, String str) {
        this.f72126Q.f19642f0.m33050mq(coreData.conversations.get(0));
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56011id = str;
        dbLinks.links = new Links();
        CoreModule.f17553k.f91941d.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ void m196845l3(final String str, Envelope envelope) {
        final CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (!NullChecker.m81303a(coreData) || vwb.m200296J(coreData.conversations)) {
            return;
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.s39
            @Override // p149l.d30
            public final void call() {
                this.f162083a.m196844k3(coreData, str);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ C22306c m196846m3(final String str, final JSONObject jSONObject) {
        return ia20.m135121e(new v9j() { // from class: l.p39
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31292e0(str)).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.q39
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152388a.m196845l3(str, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: n3 */
    public C22306c<Envelope> m196847n3(final String str, String str2, String str3) {
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
        return this.f72126Q.scheduled("instant_match_" + str, -1, new v9j() { // from class: l.o39
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f141636a.m196846m3(str, jSONObject);
            }
        });
    }
}
