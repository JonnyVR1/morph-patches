package com.p046p1.mobile.putong.api;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.e30;
import p149l.e51;
import p149l.fgf0;
import p149l.ggi;
import p149l.ka20;
import p149l.mkd0;
import p149l.qib0;
import p149l.qnd;
import p149l.stc0;
import p149l.tpd0;
import p149l.uqd0;
import p149l.v9j;
import p149l.w9j;
import p149l.xh5;

/* JADX INFO: loaded from: classes9.dex */
public class AssetsSettingsBaseApi extends fgf0<String> {

    /* JADX INFO: renamed from: i */
    public static C22392a<AssetsSettingsBaseApi> f17097i = C22392a.m221512b();

    /* JADX INFO: renamed from: h */
    public uqd0 f17098h;

    public enum Module {
        COMMON("common"),
        ACCOUNT(SchemeKey.account),
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
            final int iIntValue = tpd0Var.get().intValue();
            tpd0Var.obs().subscribe(mkd0.m154955G(new e30() { // from class: l.b21
                @Override // p149l.e30
                public final void call(Object obj) {
                    AssetsSettingsBaseApi.Module.m29404a(iIntValue, (Integer) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m29404a(int i, Integer num) {
            AssetsSettingsBaseApi assetsSettingsBaseApi;
            if (num.intValue() <= 0 || num.intValue() == i || (assetsSettingsBaseApi = qib0.f154710Y) == null) {
                return;
            }
            assetsSettingsBaseApi.m121236q();
        }
    }

    public AssetsSettingsBaseApi() {
        super("assets_settings", new ggi(new qnd("assets_settings_json_protobuf", null, null), 1, ProtobufAdapter.STRING_ADAPTER), new v9j() { // from class: l.v11
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return AssetsSettingsBaseApi.m29400E();
            }
        });
        this.f17098h = new uqd0("assetHadLoadMd5", (String) null, false);
        e51.m114742G(new Runnable() { // from class: l.w11
            @Override // java.lang.Runnable
            public final void run() {
                this.f183965a.m29403G();
            }
        });
        f17097i.m132487l(this);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m29398C(AssetsSettingsBaseApi assetsSettingsBaseApi, String str, String str2) {
        String strM121232m = assetsSettingsBaseApi.m121232m();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String strOptString = jSONObject.has("md5") ? jSONObject.optString("md5") : null;
            int length = jSONObject.length();
            if (strOptString == null) {
                assetsSettingsBaseApi.f17098h.put(strOptString);
                return str2;
            }
            if (!TextUtils.equals(str, strOptString) && length > 1) {
                assetsSettingsBaseApi.f17098h.put(strOptString);
                return str2;
            }
            return strM121232m;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return strM121232m;
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ C22306c m29400E() {
        final AssetsSettingsBaseApi assetsSettingsBaseApiM221515e = f17097i.m221515e();
        final String str = assetsSettingsBaseApiM221515e.f17098h.get();
        return new ka20(new v9j() { // from class: l.y11
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return AssetsSettingsBaseApi.m29401F(str);
            }
        }, INetParser.STRING_PARSER).filter(new w9j() { // from class: l.z11
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((String) obj));
            }
        }).map(new w9j() { // from class: l.a21
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return AssetsSettingsBaseApi.m29398C(this.f67215a, str, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ stc0 m29401F(String str) {
        stc0.C20027a c20027aBasic = qib0.f154693H.basic();
        String strM208757e = xh5.m208757e("/settings?md5=%s");
        if (str == null) {
            str = "";
        }
        return c20027aBasic.m185898q(String.format(strM208757e, str)).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: H */
    public static void m29402H(Module module, int i) {
        module.savedValue.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m29403G() {
        m121230k().first().map(new w9j() { // from class: l.x11
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).subscribe();
    }
}
