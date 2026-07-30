package p149l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
class uh50 implements xyl {

    /* JADX INFO: renamed from: a */
    private long f176532a = 500;

    @Override // p149l.xyl
    /* JADX INFO: renamed from: a */
    public void mo193701a(exc0 exc0Var) throws Throwable {
        if (exc0Var == null) {
            return;
        }
        tm80.m189641a("tag_oneid", "onResponseSuc");
        try {
            JSONObject jSONObject = new JSONObject(exc0Var.m118606k().string());
            int i = jSONObject.getInt(NotificationCompat.CATEGORY_STATUS);
            String string = jSONObject.getJSONObject("data").getString("oneid");
            if (TextUtils.isEmpty(string) || i != 0) {
                if (i / 100 == 5) {
                    onFail();
                    return;
                }
                return;
            }
            rh50.m179337i(string);
            fwe0.m123515d(rqi0.m180458a());
            fwe0.m123516e(System.currentTimeMillis());
            Iterator<wyl> it = rh50.f159340c.iterator();
            while (it.hasNext()) {
                it.next().onSuccess(string);
            }
            rh50.f159340c.clear();
        } catch (Exception e) {
            tm80.m189642b(e);
        }
    }

    @Override // p149l.xyl
    public void onFail() {
        if (this.f176532a <= 32000) {
            tm80.m189641a("tag_oneid", "onResponseFail " + this.f176532a);
            bb20.m100944e(this.f176532a, this);
            this.f176532a = this.f176532a * 2;
        }
    }
}
