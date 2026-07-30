package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.Report;
import com.tantanapp.common.utils.CrashHelper;
import l.dyd;
import l.e30;
import l.mkd0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dva extends ax6 {
    public dva(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ void m14299d3(Throwable th) {
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m14302g3(float f, String str, final AuthData authData) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", "[Appstore Feedback][" + ((int) f) + "]" + str);
            jSONObject.put("deviceId", dyd.a());
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.f8580Q.now(new la20(new v9j() { // from class: l.bva
            public final Object call() {
                return C0154a.f3483P.auth().q("https://feedback.tantanapp.com/feedback-mobile/form").h("H5-Authorization", authData.accessToken).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.cva
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: h3 */
    public c<roj0> m14303h3(final String str, final Report report) {
        return this.f8580Q.now(new la20(new v9j() { // from class: l.xua
            public final Object call() {
                return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, report.toJson())).b();
            }
        }).map(new w9j() { // from class: l.yua
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: i3 */
    public void m14304i3(final String str, final float f) {
        CoreModule.m1850H().accessOutterToken().subscribe(mkd0.H(new e30() { // from class: l.zua
            public final void call(Object obj) {
                this.f28983a.m14302g3(f, str, (AuthData) obj);
            }
        }, new e30() { // from class: l.ava
            public final void call(Object obj) {
                dva.m14299d3((Throwable) obj);
            }
        }));
    }
}
