package p149l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.p046p1.mobile.putong.core.CoreModule;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class oni {
    /* JADX INFO: renamed from: A */
    public static void m165181A() {
        FirebaseRemoteConfig firebaseRemoteConfig;
        try {
            firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        } catch (Exception unused) {
            firebaseRemoteConfig = null;
        }
        if (NullChecker.m81303a(firebaseRemoteConfig)) {
            firebaseRemoteConfig.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(300L).build());
            firebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener() { // from class: l.cni
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    oni.m165186b(task);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m165182B() {
        qib0.f154688E0.put(Boolean.valueOf(FirebaseRemoteConfig.getInstance().getBoolean("android_network_metrics")));
    }

    /* JADX INFO: renamed from: C */
    public static void m165183C() {
        if (TextUtils.equals("true", FirebaseRemoteConfig.getInstance().getString("purchase_prediction"))) {
            qib0.m174815e1("purchase_prediction", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m165184D() {
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
            if (array.isEmpty() || !vwb.m200337m(array, new w9j() { // from class: l.hni
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f154717f0 == num.intValue());
                }
            })) {
                u59.f174666f = false;
            } else {
                u59.f174666f = true;
            }
            CoreModule.f17545c.f19639e0.f149255R1.m132487l(roj0.f160388a);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m165186b(Task task) {
        if (task.mo15377p()) {
            e51.m114774y(new Runnable() { // from class: l.fni
                @Override // java.lang.Runnable
                public final void run() {
                    oni.m165188d();
                }
            });
        } else {
            CoreModule.f17545c.f19583L1.m210252d3().m132487l(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m165188d() {
        m165209y();
        m165182B();
        m165183C();
        m165197m();
        m165198n();
        m165200p();
        m165201q();
        m165184D();
        m165199o();
        m165202r();
        m165205u();
        m165207w();
        m165210z();
        m165204t();
        m165203s();
        m165208x();
    }

    /* JADX INFO: renamed from: m */
    public static void m165197m() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_chat_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            String string2 = JSON.parseObject(string).getString("admob_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            if (vwb.m200337m(JSON.parseArray(string2, Integer.class), new w9j() { // from class: l.ini
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f154717f0 == num.intValue());
                }
            })) {
                u59.f174661a = true;
            } else {
                u59.f174661a = false;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m165198n() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_androidprofileinfo_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        JSONObject object = JSON.parseObject(string);
        if (NullChecker.m81303a(object)) {
            String string2 = object.getString("admob_off");
            Integer integer = object.getInteger("register_days");
            if (integer != null) {
                u59.f174665e = integer.intValue();
            }
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            if (vwb.m200337m(JSON.parseArray(string2, Integer.class), new w9j() { // from class: l.nni
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f154717f0 == num.intValue());
                }
            })) {
                u59.f174662b = true;
            } else {
                u59.f174662b = false;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m165199o() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_androidprofilephoto2_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            JSONObject object = JSON.parseObject(string);
            String string2 = object.getString("admob_off");
            Integer integer = object.getInteger("register_days");
            if (integer != null) {
                u59.f174668h = integer.intValue();
            }
            Integer integer2 = object.getInteger("max_times");
            if (integer2 != null) {
                u59.f174669i = integer2.intValue();
                uqd0 uqd0Var = CoreModule.f17545c.f19639e0.f149295W1;
                if (!m165206v().equals(uqd0Var.get())) {
                    CoreModule.f17545c.f19639e0.f149287V1.put(integer2);
                    uqd0Var.put(m165206v());
                }
            }
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            if (vwb.m200337m(JSON.parseArray(string2, Integer.class), new w9j() { // from class: l.dni
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f154717f0 == num.intValue());
                }
            })) {
                u59.f174667g = true;
            } else {
                u59.f174667g = false;
            }
            CoreModule.f17545c.f19639e0.f149263S1.m132487l(roj0.f160388a);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m165200p() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_see_list");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            String string2 = JSON.parseObject(string).getString("admob_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            u59.f174663c = vwb.m200337m(JSON.parseArray(string2, Integer.class), new w9j() { // from class: l.lni
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f154717f0 == num.intValue());
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m165201q() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_visitorlist_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            String string2 = JSON.parseObject(string).getString("admob_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            u59.f174664d = vwb.m200337m(JSON.parseArray(string2, Integer.class), new w9j() { // from class: l.eni
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f154717f0 == num.intValue());
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m165202r() {
        String string = FirebaseRemoteConfig.getInstance().getString("boost_peak_guide_switch_lasted");
        u59.f174674n = string;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            JSONObject object = JSON.parseObject(string);
            String string2 = object.getString("boost_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            if (vwb.m200337m(JSON.parseArray(string2, Integer.class), new w9j() { // from class: l.jni
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f154717f0 == num.intValue());
                }
            })) {
                u59.f174673m = Boolean.TRUE;
                return;
            }
            List<JSONObject> array = JSON.parseArray(object.getString("time_array"), JSONObject.class);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(mqi0.m155944o()));
            int i = calendar.get(7);
            for (JSONObject jSONObject : array) {
                long jLongValue = jSONObject.getLong("starttimestamp").longValue() * 1000;
                long jLongValue2 = jSONObject.getLong("endtimestamp").longValue() * 1000;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(new Date(jLongValue));
                u59.f174672l = jLongValue2 - jLongValue;
                if (i == calendar2.get(7) && u59.f174672l > 0) {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTime(new Date(jLongValue2));
                    u59.f174671k = calendar3;
                    u59.f174670j = calendar2;
                    break;
                }
            }
            u59.f174673m = Boolean.FALSE;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m165203s() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_live_banner_switch");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject object = JSON.parseObject(string);
            if (object.getBoolean("enable").booleanValue() && vwb.m200337m(JSON.parseArray(object.getString("region"), String.class), new w9j() { // from class: l.kni
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(qib0.f154719h0.toString()));
                }
            })) {
                List array = JSON.parseArray(object.getString("mcc_off"), String.class);
                if (array == null || (NullChecker.m81303a(array) && !array.contains(String.valueOf(qib0.f154717f0)))) {
                    u59.f174681u = true;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m165204t() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_live_native_switch");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject object = JSON.parseObject(string);
            if (object.getBoolean("enable").booleanValue() && vwb.m200337m(JSON.parseArray(object.getString("region"), String.class), new w9j() { // from class: l.gni
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(qib0.f154719h0.toString()));
                }
            })) {
                List array = JSON.parseArray(object.getString("mcc_off"), String.class);
                if (array == null || (NullChecker.m81303a(array) && !array.contains(String.valueOf(qib0.f154717f0)))) {
                    int iIntValue = object.getInteger("ad_index").intValue();
                    u59.f174679s = true;
                    u59.f174680t = iIntValue;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m165205u() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("intl_horoscope_match_switch");
            if (!TextUtils.isEmpty(string)) {
                JSONObject object = JSON.parseObject(string);
                if (object.getBoolean("enable").booleanValue()) {
                    JSONArray jSONArray = object.getJSONArray("area");
                    for (int i = 0; i < jSONArray.size(); i++) {
                        Object obj = jSONArray.get(i);
                        if ((obj instanceof JSONObject) && vwb.m200337m(JSON.parseArray(((JSONObject) obj).getString("mcc"), Integer.class), new w9j() { // from class: l.mni
                            @Override // p149l.w9j
                            public final Object call(Object obj2) {
                                return Boolean.valueOf(qib0.f154717f0 == ((Integer) obj2).intValue());
                            }
                        })) {
                            u59.f174676p = ((JSONObject) obj).getIntValue("swipe_count");
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        CoreModule.f17545c.f19583L1.m210252d3().m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: v */
    public static String m165206v() {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        return calendar.get(1) + Constants.SEPARATOR_COMMA + (calendar.get(2) + 1) + Constants.SEPARATOR_COMMA + calendar.get(5);
    }

    /* JADX INFO: renamed from: w */
    public static void m165207w() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("intl_home_card_video");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject object = JSON.parseObject(string);
            if (object.getBoolean("enable").booleanValue()) {
                for (Object obj : object.getJSONArray("users")) {
                    if ((obj instanceof JSONObject) && ((JSONObject) obj).getString("regionTag").equals(qib0.f154719h0.toString())) {
                        u59.f174677q = ((JSONObject) obj).getJSONArray("user_id");
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m165208x() {
        uel.INSTANCE.m193270f(FirebaseRemoteConfig.getInstance().getBoolean("android_use_new_domain"));
    }

    /* JADX INFO: renamed from: y */
    public static void m165209y() {
        i0c.f110276d.put(FirebaseRemoteConfig.getInstance().getString("android_http_dns"));
    }

    /* JADX INFO: renamed from: z */
    public static void m165210z() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("intl_enable_pay_config");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String str = qib0.f154730s;
            if (qib0.f154732t < JSON.parseObject(string).getIntValue(WBConstants.AUTH_PARAMS_VERSION)) {
                CoreModule.f17545c.f19620X1.f90483T.m132487l(Boolean.TRUE);
            }
        } catch (Exception unused) {
        }
    }
}
