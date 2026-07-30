package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.api.C4727b;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ot40 {

    /* JADX INFO: renamed from: c */
    public static ot40 f148924c;

    /* JADX INFO: renamed from: a */
    public final jxd0 f148925a;

    /* JADX INFO: renamed from: b */
    public final jxd0 f148926b;

    public ot40() {
        Boolean bool = Boolean.FALSE;
        this.f148925a = new jxd0("no_status_user_push_0_send", bool);
        this.f148926b = new jxd0("no_status_user_push_1_send", bool);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m169069c(int i, Throwable th) {
        if (i == 1) {
            f148924c = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static ot40 m169071e() {
        if (f148924c == null) {
            synchronized (ot40.class) {
                try {
                    if (f148924c == null) {
                        f148924c = new ot40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f148924c;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    public final String m169072f() {
        return "";
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m169073g(int i, Envelope envelope) {
        if (i == 0) {
            this.f148925a.put(Boolean.TRUE);
        } else if (i == 1) {
            this.f148926b.put(Boolean.TRUE);
            f148924c = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m169074h(String str) {
        if (!App.m21427h()) {
            f148924c = null;
        } else {
            if (this.f148925a.get().booleanValue()) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = m169072f();
            }
            m169075i(str, null, 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m169075i(String str, String str2, final int i) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("one_id", yp50.m217001d());
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("user_id", Integer.parseInt(str2));
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("phone_number", str);
            }
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i);
            AccountModule.f16756c.scheduled("no_status_user", -1, new pcj() { // from class: l.kt40
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return qi20.m176654a(new pcj() { // from class: l.nt40
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return uqb0.f180376H.basic().m209043q(C4727b.m29374e("/no_auth/user_back/no_status")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                        }
                    });
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.lt40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133513a.m169073g(i, (Envelope) obj);
                }
            }, new y20() { // from class: l.mt40
                @Override // p153l.y20
                public final void call(Object obj) {
                    ot40.m169069c(i, (Throwable) obj);
                }
            }));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m169076j(String str) {
        if (!this.f148925a.get().booleanValue() || this.f148926b.get().booleanValue()) {
            f148924c = null;
        } else {
            m169075i(str, AccountModule.f16756c.m29369z2(), 1);
        }
    }
}
