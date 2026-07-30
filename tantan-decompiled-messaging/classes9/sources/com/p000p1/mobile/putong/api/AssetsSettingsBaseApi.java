package com.p000p1.mobile.putong.api;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e51;
import l.fgf0;
import l.ggi;
import l.mkd0;
import l.roj0;
import l.stc0;
import l.tpd0;
import l.uqd0;
import l.v9j;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ka20;
import p006l.qib0;
import p006l.qnd;
import p006l.xh5;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AssetsSettingsBaseApi extends fgf0<String> {

    /* JADX INFO: renamed from: i */
    public static a<AssetsSettingsBaseApi> f1086i = a.b();

    /* JADX INFO: renamed from: h */
    public uqd0 f1087h;

    public enum Module {
        COMMON("common"),
        ACCOUNT("account"),
        CORE("core"),
        FEED("feed"),
        LIVE("live");

        private static final String SAVED_BASE_NAME_PREFIX = "assets_settings_";
        final String moduleName;
        final tpd0 savedValue;

        Module(String str) {
            this.moduleName = str;
            tpd0 tpd0Var = new tpd0(SAVED_BASE_NAME_PREFIX + str, 0);
            this.savedValue = tpd0Var;
            final int iIntValue = ((Integer) tpd0Var.get()).intValue();
            tpd0Var.obs().subscribe(mkd0.G(new e30() { // from class: l.b21
                public final void call(Object obj) {
                    AssetsSettingsBaseApi.Module.m1310a(iIntValue, (Integer) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m1310a(int i, Integer num) {
            AssetsSettingsBaseApi assetsSettingsBaseApi;
            if (num.intValue() <= 0 || num.intValue() == i || (assetsSettingsBaseApi = qib0.f19801Y) == null) {
                return;
            }
            assetsSettingsBaseApi.z();
        }
    }

    public AssetsSettingsBaseApi() {
        super("assets_settings", new ggi(new qnd("assets_settings_json_protobuf", null, null), 1, ProtobufAdapter.STRING_ADAPTER), new v9j() { // from class: l.v11
            public final Object call() {
                return AssetsSettingsBaseApi.m1306E();
            }
        });
        this.f1087h = new uqd0("assetHadLoadMd5", (String) null, false);
        e51.G(new Runnable() { // from class: l.w11
            @Override // java.lang.Runnable
            public final void run() {
                this.f24755a.m1309G();
            }
        });
        f1086i.onNext(this);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m1304C(AssetsSettingsBaseApi assetsSettingsBaseApi, String str, String str2) {
        String str3 = (String) assetsSettingsBaseApi.m();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String strOptString = jSONObject.has("md5") ? jSONObject.optString("md5") : null;
            int length = jSONObject.length();
            if (strOptString == null) {
                assetsSettingsBaseApi.f1087h.put(strOptString);
                return str2;
            }
            if (!TextUtils.equals(str, strOptString) && length > 1) {
                assetsSettingsBaseApi.f1087h.put(strOptString);
                return str2;
            }
            return str3;
        } catch (JSONException e) {
            CrashHelper.c(e);
            return str3;
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ c m1306E() {
        final AssetsSettingsBaseApi assetsSettingsBaseApi = (AssetsSettingsBaseApi) f1086i.e();
        final String str = (String) assetsSettingsBaseApi.f1087h.get();
        return new ka20(new v9j() { // from class: l.y11
            public final Object call() {
                return AssetsSettingsBaseApi.m1307F(str);
            }
        }, INetParser.STRING_PARSER).filter(new w9j() { // from class: l.z11
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((String) obj));
            }
        }).map(new w9j() { // from class: l.a21
            public final Object call(Object obj) {
                return AssetsSettingsBaseApi.m1304C(this.f8062a, str, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ stc0 m1307F(String str) {
        stc0.a aVarBasic = qib0.f19784H.basic();
        String strM27246e = xh5.m27246e("/settings?md5=%s");
        if (str == null) {
            str = "";
        }
        return aVarBasic.q(String.format(strM27246e, str)).f().b();
    }

    /* JADX INFO: renamed from: H */
    public static void m1308H(Module module, int i) {
        module.savedValue.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m1309G() {
        k().first().map(new w9j() { // from class: l.x11
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).subscribe();
    }
}
