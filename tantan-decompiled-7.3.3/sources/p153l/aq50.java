package p153l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class aq50 implements s1m {

    /* JADX INFO: renamed from: a */
    private long f72788a = 500;

    @Override // p153l.s1m
    /* JADX INFO: renamed from: a */
    public void mo99413a(i5d0 i5d0Var) throws Throwable {
        if (i5d0Var == null) {
            return;
        }
        xu80.m213120a("tag_oneid", "onResponseSuc");
        try {
            JSONObject jSONObject = new JSONObject(i5d0Var.m138670k().string());
            int i = jSONObject.getInt(NotificationCompat.CATEGORY_STATUS);
            String string = jSONObject.getJSONObject("data").getString("oneid");
            if (TextUtils.isEmpty(string) || i != 0) {
                if (i / 100 == 5) {
                    onFail();
                    return;
                }
                return;
            }
            xp50.m212637i(string);
            m4f0.m157011d(uzi0.m198838a());
            m4f0.m157012e(System.currentTimeMillis());
            Iterator<r1m> it = xp50.f195687c.iterator();
            while (it.hasNext()) {
                it.next().onSuccess(string);
            }
            xp50.f195687c.clear();
        } catch (Exception e) {
            xu80.m213121b(e);
        }
    }

    @Override // p153l.s1m
    public void onFail() {
        if (this.f72788a <= 32000) {
            xu80.m213120a("tag_oneid", "onResponseFail " + this.f72788a);
            kj20.m150007e(this.f72788a, this);
            this.f72788a = this.f72788a * 2;
        }
    }
}
