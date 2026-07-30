package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.Report;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class dva extends ax6 {
    public dva(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ void m113768d3(Throwable th) {
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m113771g3(float f, String str, final AuthData authData) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", "[Appstore Feedback][" + ((int) f) + Constants.AES_SUFFIX + str);
            jSONObject.put(Constants.DEVICE_ID_TAG, dyd.m114055a());
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.f72126Q.now(new la20(new v9j() { // from class: l.bva
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q("https://feedback.tantanapp.com/feedback-mobile/form").m185889h("H5-Authorization", authData.accessToken).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.cva
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: h3 */
    public C22306c<roj0> m113772h3(final String str, final Report report) {
        return this.f72126Q.now(new la20(new v9j() { // from class: l.xua
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, report.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.yua
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: i3 */
    public void m113773i3(final String str, final float f) {
        CoreModule.m29931H().accessOutterToken().subscribe(mkd0.m154956H(new e30() { // from class: l.zua
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204830a.m113771g3(f, str, (AuthData) obj);
            }
        }, new e30() { // from class: l.ava
            @Override // p149l.e30
            public final void call(Object obj) {
                dva.m113768d3((Throwable) obj);
            }
        }));
    }
}
