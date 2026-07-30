package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.Report;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class pwa extends dy6 {
    public pwa(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ void m174047d3(Throwable th) {
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m174050g3(float f, String str, final AuthData authData) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", "[Appstore Feedback][" + ((int) f) + Constants.AES_SUFFIX + str);
            jSONObject.put(Constants.DEVICE_ID_TAG, qzd.m178768a());
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.f91137Q.now(new ti20(new pcj() { // from class: l.nwa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q("https://feedback.tantanapp.com/feedback-mobile/form").m209034h("H5-Authorization", authData.accessToken).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.owa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: h3 */
    public C22421c<uxj0> m174051h3(final String str, final Report report) {
        return this.f91137Q.now(new ti20(new pcj() { // from class: l.jwa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, report.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.kwa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: i3 */
    public void m174052i3(final String str, final float f) {
        CoreModule.m30929H().accessOutterToken().subscribe(psd0.m173597H(new y20() { // from class: l.lwa
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133791a.m174050g3(f, str, (AuthData) obj);
            }
        }, new y20() { // from class: l.mwa
            @Override // p153l.y20
            public final void call(Object obj) {
                pwa.m174047d3((Throwable) obj);
            }
        }));
    }
}
