package p006l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.api.C0002b;
import com.p000p1.mobile.putong.api.api.Network;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import l.e30;
import l.hpd0;
import l.mkd0;
import l.utc0;
import l.v9j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class al40 {

    /* JADX INFO: renamed from: c */
    public static al40 f8307c;

    /* JADX INFO: renamed from: a */
    public final hpd0 f8308a;

    /* JADX INFO: renamed from: b */
    public final hpd0 f8309b;

    public al40() {
        Boolean bool = Boolean.FALSE;
        this.f8308a = new hpd0("no_status_user_push_0_send", bool);
        this.f8309b = new hpd0("no_status_user_push_1_send", bool);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11879c(int i, Throwable th) {
        if (i == 1) {
            f8307c = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static al40 m11881e() {
        if (f8307c == null) {
            synchronized (al40.class) {
                try {
                    if (f8307c == null) {
                        f8307c = new al40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8307c;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    public final String m11882f() {
        return "";
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m11883g(int i, Envelope envelope) {
        if (i == 0) {
            this.f8308a.put(Boolean.TRUE);
        } else if (i == 1) {
            this.f8309b.put(Boolean.TRUE);
            f8307c = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m11884h(String str) {
        if (!App.h()) {
            f8307c = null;
        } else {
            if (((Boolean) this.f8308a.get()).booleanValue()) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = m11882f();
            }
            m11885i(str, null, 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11885i(String str, String str2, final int i) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("one_id", sh50.m23745d());
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("user_id", Integer.parseInt(str2));
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("phone_number", str);
            }
            jSONObject.put("status", i);
            AccountModule.f26c.scheduled("no_status_user", -1, new v9j() { // from class: l.wk40
                public final Object call() {
                    return ia20.m16567a(new v9j() { // from class: l.zk40
                        public final Object call() {
                            return qib0.f19784H.basic().q(C0002b.m270e("/no_auth/user_back/no_status")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                        }
                    });
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.xk40
                public final void call(Object obj) {
                    this.f27557a.m11883g(i, (Envelope) obj);
                }
            }, new e30() { // from class: l.yk40
                public final void call(Object obj) {
                    al40.m11879c(i, (Throwable) obj);
                }
            }));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m11886j(String str) {
        if (!((Boolean) this.f8308a.get()).booleanValue() || ((Boolean) this.f8309b.get()).booleanValue()) {
            f8307c = null;
        } else {
            m11885i(str, AccountModule.f26c.m265z2(), 1);
        }
    }
}
