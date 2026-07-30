package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.InstantMatchGiveCountInfo;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class e59 extends dy6 {

    /* JADX INFO: renamed from: R */
    public C22508b<uxj0> f92199R;

    /* JADX INFO: renamed from: S */
    public List<InstantMatchGiveCountInfo> f92200S;

    public e59(C4883c c4883c) {
        super(c4883c);
        this.f92199R = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: h3 */
    public C22421c<Envelope> m119515h3() {
        final String strM32203G = C4879a.m32203G("/instant-match/superposie/count/config");
        return this.f91137Q.scheduled(strM32203G, 0, new pcj() { // from class: l.x49
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f192356a.m119517j3(strM32203G);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m119516i3(Envelope envelope) {
        this.f92200S = ((CoreData) envelope.getModuleData(CoreData.class)).instantMatchGiveCountInfo;
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ C22421c m119517j3(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.z49
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).doOnNext(new y20() { // from class: l.a59
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68518a.m119516i3((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m119518k3(CoreData coreData, String str) {
        this.f91137Q.f20384f0.m34053mq(coreData.conversations.get(0));
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56859id = str;
        dbLinks.links = new Links();
        CoreModule.f18272k.f115536d.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ void m119519l3(final String str, Envelope envelope) {
        final CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (!NullChecker.m82486a(coreData) || jyb.m147479J(coreData.conversations)) {
            return;
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.d59
            @Override // p153l.x20
            public final void call() {
                this.f85140a.m119518k3(coreData, str);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ C22421c m119520m3(final String str, final JSONObject jSONObject) {
        return qi20.m176658e(new pcj() { // from class: l.b59
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32295e0(str)).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.c59
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79813a.m119519l3(str, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: n3 */
    public C22421c<Envelope> m119521n3(final String str, String str2, String str3) {
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
        return this.f91137Q.scheduled("instant_match_" + str, -1, new pcj() { // from class: l.y49
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f197438a.m119520m3(str, jSONObject);
            }
        });
    }
}
