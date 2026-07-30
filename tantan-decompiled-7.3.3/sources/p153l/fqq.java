package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p051p1.mobile.putong.data.Device;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fqq {

    /* JADX INFO: renamed from: a */
    private WeakReference<hul> f100322a;

    /* JADX INFO: renamed from: b */
    private Map<String, qpl> f100323b;

    /* JADX INFO: renamed from: c */
    private urf f100324c;

    /* JADX INFO: renamed from: l.fqq$a */
    public class RunnableC17034a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ kf3 f100325a;

        public RunnableC17034a(kf3 kf3Var) {
            this.f100325a = kf3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f100325a.m149363l(fqq.this.m126790c().getWebViewUrl());
            this.f100325a.m149361j(fqq.this.m126790c().getBid());
        }
    }

    /* JADX INFO: renamed from: l.fqq$b */
    public class RunnableC17035b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ qpl f100327a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f100328b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f100329c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ JSONObject f100330d;

        public RunnableC17035b(qpl qplVar, String str, String str2, JSONObject jSONObject) {
            this.f100327a = qplVar;
            this.f100328b = str;
            this.f100329c = str2;
            this.f100330d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f100327a.mo18018p(this.f100328b, this.f100329c, this.f100330d)) {
                    return;
                }
                fqq.this.m126789g(this.f100330d);
            } catch (Exception e) {
                Log.e("JsBridgeProcessor", "", e);
            }
        }
    }

    public fqq(hul hulVar) {
        this.f100322a = new WeakReference<>(hulVar);
        HashMap map = new HashMap();
        this.f100323b = map;
        map.put("boost", new n27(hulVar));
        this.f100323b.put("fdt", new tp9(hulVar));
        this.f100323b.put("globalEvent", new wu8(hulVar));
        this.f100323b.put(UserBanAppealSwitch.offline, new i4a(hulVar));
        this.f100323b.put(PlaceTypes.STORAGE, new b1b(hulVar));
        this.f100323b.put(Device.TYPE, new ul8(hulVar));
        this.f100324c = new urf(hulVar);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m126785a(fqq fqqVar, JSONObject jSONObject) {
        fqqVar.getClass();
        try {
            fqqVar.m126789g(jSONObject);
        } catch (Exception e) {
            Log.e("JsBridgeProcessor", "", e);
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m126787e(qpl qplVar, int i, int i2, Intent intent) {
        return qplVar != null && qplVar.mo18017f(i, i2, intent);
    }

    /* JADX INFO: renamed from: f */
    private boolean m126788f(String str, String str2) {
        return "init".equalsIgnoreCase(str) && NotificationStatus.undefined.equalsIgnoreCase(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m126789g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("callbackError");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        JSONObject jSONObjectM177459a = qpl.m177459a(new String[]{"ec", "em"}, new String[]{"1", "BridgeNotFound"});
        WeakReference<hul> weakReference = this.f100322a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f100322a.get().mo17918d(strOptString, jSONObjectM177459a.toString());
    }

    /* JADX INFO: renamed from: c */
    public hul m126790c() {
        WeakReference<hul> weakReference = this.f100322a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m126791d(int i, int i2, Intent intent) {
        if (m126787e(this.f100324c, i, i2, intent)) {
            return true;
        }
        Map<String, qpl> map = this.f100323b;
        if (map == null) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (m126787e(this.f100323b.get(it.next()), i, i2, intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m126792h() {
        hul hulVarM126790c = m126790c();
        return (hulVarM126790c == null || hulVarM126790c.mo17920e() || hulVarM126790c.getWebContext() == null) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public void m126793i() {
        try {
            urf urfVar = this.f100324c;
            if (urfVar != null) {
                urfVar.mo121328l();
            }
        } catch (Throwable th) {
            Log.e("JsBridgeProcessor", "", th);
        }
        try {
            Map<String, qpl> map = this.f100323b;
            if (map != null) {
                Iterator<String> it = map.keySet().iterator();
                while (it.hasNext()) {
                    qpl qplVar = this.f100323b.get(it.next());
                    if (qplVar != null) {
                        qplVar.mo121328l();
                    }
                }
            }
        } catch (Throwable th2) {
            Log.e("JsBridgeProcessor", "", th2);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m126794j() {
        urf urfVar = this.f100324c;
        if (urfVar != null) {
            urfVar.mo177468m();
        }
        Map<String, qpl> map = this.f100323b;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                qpl qplVar = this.f100323b.get(it.next());
                if (qplVar != null) {
                    qplVar.mo177468m();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m126795k() {
        urf urfVar = this.f100324c;
        if (urfVar != null) {
            urfVar.mo177469n();
        }
        Map<String, qpl> map = this.f100323b;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                qpl qplVar = this.f100323b.get(it.next());
                if (qplVar != null) {
                    qplVar.mo177469n();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m126796l(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        urf urfVar = this.f100324c;
        if (urfVar != null) {
            urfVar.mo98811o(i, strArr, iArr);
        }
        Map<String, qpl> map = this.f100323b;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                qpl qplVar = this.f100323b.get(it.next());
                if (qplVar != null) {
                    qplVar.mo98811o(i, strArr, iArr);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m126797m(String str, String str2, final JSONObject jSONObject) throws Exception {
        WeakReference<hul> weakReference;
        WeakReference<hul> weakReference2;
        hul hulVar;
        if (!m126792h()) {
            jzv.m147734g("JsBridgeProcessor", "tang---isCanProcess FALSE");
            return false;
        }
        boolean zM126788f = m126788f(str, str2);
        try {
            if (rs8.m182924o().contains(str2)) {
                MKCoreLogManager.m18427e().m18443A(str, str2);
            }
            if (rs8.m182919j().contains(str + "." + str2)) {
                WeakReference<hul> weakReference3 = this.f100322a;
                if (weakReference3 != null && (hulVar = weakReference3.get()) != null) {
                    hulVar.setWebViewPost(new Runnable() { // from class: l.eqq
                        @Override // java.lang.Runnable
                        public final void run() {
                            fqq.m126785a(this.f95365a, jSONObject);
                        }
                    });
                }
                MKCoreLogManager.m18427e().m18446f(str, str2);
                return true;
            }
            if (!zM126788f) {
                MKCoreLogManager.m18431i(m126790c().getLogSessionKey()).m211428C(str, str2, jSONObject.toString(), lkw.m154658a(m126790c()));
                kf3 kf3Var = new kf3(str, str2, jSONObject);
                if (m126790c() != null) {
                    m126790c().setWebViewPost(new RunnableC17034a(kf3Var));
                }
                lf3.m153970b(kf3Var);
            }
            urf urfVar = this.f100324c;
            if (urfVar != null && urfVar.mo18018p(str, str2, jSONObject)) {
                jzv.m147732e("JsBridgeProcessor", "tang-----额外命令执行 " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + "  " + jSONObject);
                return true;
            }
            jzv.m147732e("JsBridgeProcessor", "tang-----内部命令执行 " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + "  " + jSONObject);
            qpl qplVar = this.f100323b.get(str);
            if (qplVar != null) {
                if ("ui".equalsIgnoreCase(str) && (weakReference2 = this.f100322a) != null && weakReference2.get() != null) {
                    this.f100322a.get().setWebViewPost(new RunnableC17035b(qplVar, str, str2, jSONObject));
                    return true;
                }
                boolean zMo18018p = qplVar.mo18018p(str, str2, jSONObject);
                if (!zMo18018p) {
                    m126789g(jSONObject);
                }
                return zMo18018p;
            }
            try {
                m126789g(jSONObject);
                if (!zM126788f && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (weakReference = this.f100322a) != null && weakReference.get() != null) {
                    MKCoreLogManager.m18431i(this.f100322a.get().getLogSessionKey()).m211429D(str, str2, null);
                }
            } catch (Exception e) {
                Log.e("JsBridgeProcessor", "", e);
            }
            return false;
        } catch (Exception e2) {
            Log.e("JsBridgeProcessor", "", e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m126798n(@NonNull String str, @NonNull qpl qplVar) {
        Map<String, qpl> map = this.f100323b;
        if (map != null) {
            map.put(str, qplVar);
        }
    }
}
