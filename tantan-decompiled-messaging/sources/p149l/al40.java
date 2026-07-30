package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.api.C4576b;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class al40 {

    /* JADX INFO: renamed from: c */
    public static al40 f70403c;

    /* JADX INFO: renamed from: a */
    public final hpd0 f70404a;

    /* JADX INFO: renamed from: b */
    public final hpd0 f70405b;

    public al40() {
        Boolean bool = Boolean.FALSE;
        this.f70404a = new hpd0("no_status_user_push_0_send", bool);
        this.f70405b = new hpd0("no_status_user_push_1_send", bool);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m97269c(int i, Throwable th) {
        if (i == 1) {
            f70403c = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static al40 m97271e() {
        if (f70403c == null) {
            synchronized (al40.class) {
                try {
                    if (f70403c == null) {
                        f70403c = new al40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f70403c;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    public final String m97272f() {
        return "";
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m97273g(int i, Envelope envelope) {
        if (i == 0) {
            this.f70404a.put(Boolean.TRUE);
        } else if (i == 1) {
            this.f70405b.put(Boolean.TRUE);
            f70403c = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m97274h(String str) {
        if (!App.m20428h()) {
            f70403c = null;
        } else {
            if (this.f70404a.get().booleanValue()) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = m97272f();
            }
            m97275i(str, null, 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m97275i(String str, String str2, final int i) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("one_id", sh50.m184159d());
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("user_id", Integer.parseInt(str2));
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("phone_number", str);
            }
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i);
            AccountModule.f16037c.scheduled("no_status_user", -1, new v9j() { // from class: l.wk40
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return ia20.m135117a(new v9j() { // from class: l.zk40
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return qib0.f154693H.basic().m185898q(C4576b.m28375e("/no_auth/user_back/no_status")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                        }
                    });
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.xk40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f193264a.m97273g(i, (Envelope) obj);
                }
            }, new e30() { // from class: l.yk40
                @Override // p149l.e30
                public final void call(Object obj) {
                    al40.m97269c(i, (Throwable) obj);
                }
            }));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m97276j(String str) {
        if (!this.f70404a.get().booleanValue() || this.f70405b.get().booleanValue()) {
            f70403c = null;
        } else {
            m97275i(str, AccountModule.f16037c.m28370z2(), 1);
        }
    }
}
