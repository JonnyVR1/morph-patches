package p153l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.p051p1.mobile.putong.core.CoreModule;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class kqi {
    /* JADX INFO: renamed from: A */
    public static void m150863A() {
        FirebaseRemoteConfig firebaseRemoteConfig;
        try {
            firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        } catch (Exception unused) {
            firebaseRemoteConfig = null;
        }
        if (NullChecker.m82486a(firebaseRemoteConfig)) {
            firebaseRemoteConfig.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(300L).build());
            firebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener() { // from class: l.ypi
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    kqi.m150868b(task);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m150864B() {
        uqb0.f180371E0.put(Boolean.valueOf(FirebaseRemoteConfig.getInstance().getBoolean("android_network_metrics")));
    }

    /* JADX INFO: renamed from: C */
    public static void m150865C() {
        if (TextUtils.equals("true", FirebaseRemoteConfig.getInstance().getString("purchase_prediction"))) {
            uqb0.m197269e1("purchase_prediction", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m150866D() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_swipes_admob_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            String string2 = JSON.parseObject(string).getString("admob_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            List array = JSON.parseArray(string2, Integer.class);
            if (array.isEmpty() || !jyb.m147520m(array, new qcj() { // from class: l.dqi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || uqb0.f180400f0 == num.intValue());
                }
            })) {
                d79.f85473f = false;
            } else {
                d79.f85473f = true;
            }
            CoreModule.f18264c.f20381e0.f89112R1.m137019l(uxj0.f181467a);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m150868b(Task task) {
        if (task.mo15431p()) {
            l51.m152919y(new Runnable() { // from class: l.bqi
                @Override // java.lang.Runnable
                public final void run() {
                    kqi.m150870d();
                }
            });
        } else {
            CoreModule.f18264c.f20325L1.m105881d3().m137019l(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m150870d() {
        m150891y();
        m150864B();
        m150865C();
        m150879m();
        m150880n();
        m150882p();
        m150883q();
        m150866D();
        m150881o();
        m150884r();
        m150887u();
        m150889w();
        m150892z();
        m150886t();
        m150885s();
        m150890x();
    }

    /* JADX INFO: renamed from: m */
    public static void m150879m() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_chat_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            String string2 = JSON.parseObject(string).getString("admob_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            if (jyb.m147520m(JSON.parseArray(string2, Integer.class), new qcj() { // from class: l.eqi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || uqb0.f180400f0 == num.intValue());
                }
            })) {
                d79.f85468a = true;
            } else {
                d79.f85468a = false;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m150880n() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_androidprofileinfo_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        JSONObject object = JSON.parseObject(string);
        if (NullChecker.m82486a(object)) {
            String string2 = object.getString("admob_off");
            Integer integer = object.getInteger("register_days");
            if (integer != null) {
                d79.f85472e = integer.intValue();
            }
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            if (jyb.m147520m(JSON.parseArray(string2, Integer.class), new qcj() { // from class: l.jqi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || uqb0.f180400f0 == num.intValue());
                }
            })) {
                d79.f85469b = true;
            } else {
                d79.f85469b = false;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m150881o() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_androidprofilephoto2_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            JSONObject object = JSON.parseObject(string);
            String string2 = object.getString("admob_off");
            Integer integer = object.getInteger("register_days");
            if (integer != null) {
                d79.f85475h = integer.intValue();
            }
            Integer integer2 = object.getInteger("max_times");
            if (integer2 != null) {
                d79.f85476i = integer2.intValue();
                wyd0 wyd0Var = CoreModule.f18264c.f20381e0.f89152W1;
                if (!m150888v().equals(wyd0Var.get())) {
                    CoreModule.f18264c.f20381e0.f89144V1.put(integer2);
                    wyd0Var.put(m150888v());
                }
            }
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            if (jyb.m147520m(JSON.parseArray(string2, Integer.class), new qcj() { // from class: l.zpi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || uqb0.f180400f0 == num.intValue());
                }
            })) {
                d79.f85474g = true;
            } else {
                d79.f85474g = false;
            }
            CoreModule.f18264c.f20381e0.f89120S1.m137019l(uxj0.f181467a);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m150882p() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_see_list");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            String string2 = JSON.parseObject(string).getString("admob_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            d79.f85470c = jyb.m147520m(JSON.parseArray(string2, Integer.class), new qcj() { // from class: l.hqi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || uqb0.f180400f0 == num.intValue());
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m150883q() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_visitorlist_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            String string2 = JSON.parseObject(string).getString("admob_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            d79.f85471d = jyb.m147520m(JSON.parseArray(string2, Integer.class), new qcj() { // from class: l.aqi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || uqb0.f180400f0 == num.intValue());
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m150884r() {
        String string = FirebaseRemoteConfig.getInstance().getString("boost_peak_guide_switch_lasted");
        d79.f85481n = string;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            JSONObject object = JSON.parseObject(string);
            String string2 = object.getString("boost_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            if (jyb.m147520m(JSON.parseArray(string2, Integer.class), new qcj() { // from class: l.fqi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || uqb0.f180400f0 == num.intValue());
                }
            })) {
                d79.f85480m = Boolean.TRUE;
                return;
            }
            List<JSONObject> array = JSON.parseArray(object.getString("time_array"), JSONObject.class);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(pzi0.m174454o()));
            int i = calendar.get(7);
            for (JSONObject jSONObject : array) {
                long jLongValue = jSONObject.getLong("starttimestamp").longValue() * 1000;
                long jLongValue2 = jSONObject.getLong("endtimestamp").longValue() * 1000;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(new Date(jLongValue));
                d79.f85479l = jLongValue2 - jLongValue;
                if (i == calendar2.get(7) && d79.f85479l > 0) {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTime(new Date(jLongValue2));
                    d79.f85478k = calendar3;
                    d79.f85477j = calendar2;
                    break;
                }
            }
            d79.f85480m = Boolean.FALSE;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m150885s() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_live_banner_switch");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject object = JSON.parseObject(string);
            if (object.getBoolean("enable").booleanValue() && jyb.m147520m(JSON.parseArray(object.getString("region"), String.class), new qcj() { // from class: l.gqi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(uqb0.f180402h0.toString()));
                }
            })) {
                List array = JSON.parseArray(object.getString("mcc_off"), String.class);
                if (array == null || (NullChecker.m82486a(array) && !array.contains(String.valueOf(uqb0.f180400f0)))) {
                    d79.f85488u = true;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m150886t() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_live_native_switch");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject object = JSON.parseObject(string);
            if (object.getBoolean("enable").booleanValue() && jyb.m147520m(JSON.parseArray(object.getString("region"), String.class), new qcj() { // from class: l.cqi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(uqb0.f180402h0.toString()));
                }
            })) {
                List array = JSON.parseArray(object.getString("mcc_off"), String.class);
                if (array == null || (NullChecker.m82486a(array) && !array.contains(String.valueOf(uqb0.f180400f0)))) {
                    int iIntValue = object.getInteger("ad_index").intValue();
                    d79.f85486s = true;
                    d79.f85487t = iIntValue;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m150887u() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("intl_horoscope_match_switch");
            if (!TextUtils.isEmpty(string)) {
                JSONObject object = JSON.parseObject(string);
                if (object.getBoolean("enable").booleanValue()) {
                    JSONArray jSONArray = object.getJSONArray("area");
                    for (int i = 0; i < jSONArray.size(); i++) {
                        Object obj = jSONArray.get(i);
                        if ((obj instanceof JSONObject) && jyb.m147520m(JSON.parseArray(((JSONObject) obj).getString("mcc"), Integer.class), new qcj() { // from class: l.iqi
                            @Override // p153l.qcj
                            public final Object call(Object obj2) {
                                return Boolean.valueOf(uqb0.f180400f0 == ((Integer) obj2).intValue());
                            }
                        })) {
                            d79.f85483p = ((JSONObject) obj).getIntValue("swipe_count");
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        CoreModule.f18264c.f20325L1.m105881d3().m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: v */
    public static String m150888v() {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        return calendar.get(1) + Constants.SEPARATOR_COMMA + (calendar.get(2) + 1) + Constants.SEPARATOR_COMMA + calendar.get(5);
    }

    /* JADX INFO: renamed from: w */
    public static void m150889w() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("intl_home_card_video");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject object = JSON.parseObject(string);
            if (object.getBoolean("enable").booleanValue()) {
                for (Object obj : object.getJSONArray("users")) {
                    if ((obj instanceof JSONObject) && ((JSONObject) obj).getString("regionTag").equals(uqb0.f180402h0.toString())) {
                        d79.f85484q = ((JSONObject) obj).getJSONArray("user_id");
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m150890x() {
        lhl lhlVar = lhl.INSTANCE;
        lhlVar.m154226s(FirebaseRemoteConfig.getInstance().getString("android_web_use_new_domain"));
        lhlVar.m154224q(FirebaseRemoteConfig.getInstance().getString("android_api_change_domain"));
    }

    /* JADX INFO: renamed from: y */
    public static void m150891y() {
        v1c.f181945d.put(FirebaseRemoteConfig.getInstance().getString("android_http_dns"));
    }

    /* JADX INFO: renamed from: z */
    public static void m150892z() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("intl_enable_pay_config");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String str = uqb0.f180413s;
            if (uqb0.f180415t < JSON.parseObject(string).getIntValue(WBConstants.AUTH_PARAMS_VERSION)) {
                CoreModule.f18264c.f20362X1.f141463T.m137019l(Boolean.TRUE);
            }
        } catch (Exception unused) {
        }
    }
}
