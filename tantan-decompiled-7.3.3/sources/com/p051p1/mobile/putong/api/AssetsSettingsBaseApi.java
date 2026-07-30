package com.p051p1.mobile.putong.api;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.AssetsSettingsBaseApi;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.dji;
import p153l.l51;
import p153l.mof0;
import p153l.pcj;
import p153l.psd0;
import p153l.qcj;
import p153l.si20;
import p153l.uqb0;
import p153l.vod;
import p153l.vxd0;
import p153l.wyd0;
import p153l.x1d0;
import p153l.xi5;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class AssetsSettingsBaseApi extends mof0<String> {

    /* JADX INFO: renamed from: i */
    public static C22507a<AssetsSettingsBaseApi> f17816i = C22507a.m222758b();

    /* JADX INFO: renamed from: h */
    public wyd0 f17817h;

    public enum Module {
        COMMON("common"),
        ACCOUNT(SchemeKey.account),
        CORE("core"),
        FEED("feed"),
        LIVE("live");

        private static final String SAVED_BASE_NAME_PREFIX = "assets_settings_";
        final String moduleName;
        final vxd0 savedValue;

        Module(String str) {
            this.moduleName = str;
            vxd0 vxd0Var = new vxd0(SAVED_BASE_NAME_PREFIX + str, 0);
            this.savedValue = vxd0Var;
            final int iIntValue = vxd0Var.get().intValue();
            vxd0Var.obs().subscribe(psd0.m173596G(new y20() { // from class: l.i21
                @Override // p153l.y20
                public final void call(Object obj) {
                    AssetsSettingsBaseApi.Module.m30402a(iIntValue, (Integer) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m30402a(int i, Integer num) {
            AssetsSettingsBaseApi assetsSettingsBaseApi;
            if (num.intValue() <= 0 || num.intValue() == i || (assetsSettingsBaseApi = uqb0.f180393Y) == null) {
                return;
            }
            assetsSettingsBaseApi.m159280q();
        }
    }

    public AssetsSettingsBaseApi() {
        super("assets_settings", new dji(new vod("assets_settings_json_protobuf", null, null), 1, ProtobufAdapter.STRING_ADAPTER), new pcj() { // from class: l.c21
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return AssetsSettingsBaseApi.m30398E();
            }
        });
        this.f17817h = new wyd0("assetHadLoadMd5", (String) null, false);
        l51.m152887G(new Runnable() { // from class: l.d21
            @Override // java.lang.Runnable
            public final void run() {
                this.f84746a.m30401G();
            }
        });
        f17816i.m137019l(this);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m30396C(AssetsSettingsBaseApi assetsSettingsBaseApi, String str, String str2) {
        String strM159276m = assetsSettingsBaseApi.m159276m();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String strOptString = jSONObject.has("md5") ? jSONObject.optString("md5") : null;
            int length = jSONObject.length();
            if (strOptString == null) {
                assetsSettingsBaseApi.f17817h.put(strOptString);
                return str2;
            }
            if (!TextUtils.equals(str, strOptString) && length > 1) {
                assetsSettingsBaseApi.f17817h.put(strOptString);
                return str2;
            }
            return strM159276m;
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return strM159276m;
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ C22421c m30398E() {
        final AssetsSettingsBaseApi assetsSettingsBaseApiM222761e = f17816i.m222761e();
        final String str = assetsSettingsBaseApiM222761e.f17817h.get();
        return new si20(new pcj() { // from class: l.f21
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return AssetsSettingsBaseApi.m30399F(str);
            }
        }, INetParser.STRING_PARSER).filter(new qcj() { // from class: l.g21
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((String) obj));
            }
        }).map(new qcj() { // from class: l.h21
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return AssetsSettingsBaseApi.m30396C(this.f107516a, str, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ x1d0 m30399F(String str) {
        x1d0.C21228a c21228aBasic = uqb0.f180376H.basic();
        String strM211103e = xi5.m211103e("/settings?md5=%s");
        if (str == null) {
            str = "";
        }
        return c21228aBasic.m209043q(String.format(strM211103e, str)).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: H */
    public static void m30400H(Module module, int i) {
        module.savedValue.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m30401G() {
        m159274k().first().map(new qcj() { // from class: l.e21
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).subscribe();
    }
}
