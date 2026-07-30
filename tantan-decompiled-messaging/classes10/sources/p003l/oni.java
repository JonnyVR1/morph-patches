package p003l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.p000p1.mobile.putong.core.data.FigureMessageType;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import l.e51;
import l.i0c;
import l.mqi0;
import l.qib0;
import l.roj0;
import l.u59;
import l.uel;
import l.uqd0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class oni {
    /* JADX INFO: renamed from: A */
    public static void m8517A() {
        FirebaseRemoteConfig firebaseRemoteConfig;
        try {
            firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        } catch (Exception unused) {
            firebaseRemoteConfig = null;
        }
        if (NullChecker.a(firebaseRemoteConfig)) {
            firebaseRemoteConfig.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(300L).build());
            firebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener() { // from class: l.cni
                public final void onComplete(Task task) {
                    oni.m8522b(task);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m8518B() {
        qib0.E0.put(Boolean.valueOf(FirebaseRemoteConfig.getInstance().getBoolean("android_network_metrics")));
    }

    /* JADX INFO: renamed from: C */
    public static void m8519C() {
        if (TextUtils.equals("true", FirebaseRemoteConfig.getInstance().getString("purchase_prediction"))) {
            qib0.e1("purchase_prediction", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m8520D() {
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
            if (array.isEmpty() || !vwb.m(array, new w9j() { // from class: l.hni
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f0 == num.intValue());
                }
            })) {
                u59.f = false;
            } else {
                u59.f = true;
            }
            CoreModule.c.e0.R1.onNext(roj0.a);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8522b(Task task) {
        if (task.p()) {
            e51.y(new Runnable() { // from class: l.fni
                @Override // java.lang.Runnable
                public final void run() {
                    oni.m8524d();
                }
            });
        } else {
            CoreModule.c.L1.d3().onNext(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8524d() {
        m8545y();
        m8518B();
        m8519C();
        m8533m();
        m8534n();
        m8536p();
        m8537q();
        m8520D();
        m8535o();
        m8538r();
        m8541u();
        m8543w();
        m8546z();
        m8540t();
        m8539s();
        m8544x();
    }

    /* JADX INFO: renamed from: m */
    public static void m8533m() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_chat_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            String string2 = JSON.parseObject(string).getString("admob_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            if (vwb.m(JSON.parseArray(string2, Integer.class), new w9j() { // from class: l.ini
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f0 == num.intValue());
                }
            })) {
                u59.a = true;
            } else {
                u59.a = false;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m8534n() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_androidprofileinfo_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        JSONObject object = JSON.parseObject(string);
        if (NullChecker.a(object)) {
            String string2 = object.getString("admob_off");
            Integer integer = object.getInteger("register_days");
            if (integer != null) {
                u59.e = integer.intValue();
            }
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            if (vwb.m(JSON.parseArray(string2, Integer.class), new w9j() { // from class: l.nni
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f0 == num.intValue());
                }
            })) {
                u59.b = true;
            } else {
                u59.b = false;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m8535o() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_androidprofilephoto2_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            JSONObject object = JSON.parseObject(string);
            String string2 = object.getString("admob_off");
            Integer integer = object.getInteger("register_days");
            if (integer != null) {
                u59.h = integer.intValue();
            }
            Integer integer2 = object.getInteger("max_times");
            if (integer2 != null) {
                u59.i = integer2.intValue();
                uqd0 uqd0Var = CoreModule.c.e0.W1;
                if (!m8542v().equals((String) uqd0Var.get())) {
                    CoreModule.c.e0.V1.put(integer2);
                    uqd0Var.put(m8542v());
                }
            }
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            if (vwb.m(JSON.parseArray(string2, Integer.class), new w9j() { // from class: l.dni
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f0 == num.intValue());
                }
            })) {
                u59.g = true;
            } else {
                u59.g = false;
            }
            CoreModule.c.e0.S1.onNext(roj0.a);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m8536p() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_see_list");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            String string2 = JSON.parseObject(string).getString("admob_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            u59.c = vwb.m(JSON.parseArray(string2, Integer.class), new w9j() { // from class: l.lni
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f0 == num.intValue());
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m8537q() {
        String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_visitorlist_switch");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            String string2 = JSON.parseObject(string).getString("admob_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            u59.d = vwb.m(JSON.parseArray(string2, Integer.class), new w9j() { // from class: l.eni
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f0 == num.intValue());
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m8538r() {
        String string = FirebaseRemoteConfig.getInstance().getString("boost_peak_guide_switch_lasted");
        u59.n = string;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            JSONObject object = JSON.parseObject(string);
            String string2 = object.getString("boost_off");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            if (vwb.m(JSON.parseArray(string2, Integer.class), new w9j() { // from class: l.jni
                public final Object call(Object obj) {
                    Integer num = (Integer) obj;
                    return Boolean.valueOf(num.intValue() == -1 || qib0.f0 == num.intValue());
                }
            })) {
                u59.m = Boolean.TRUE;
                return;
            }
            List<JSONObject> array = JSON.parseArray(object.getString("time_array"), JSONObject.class);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(mqi0.o()));
            int i = calendar.get(7);
            for (JSONObject jSONObject : array) {
                long jLongValue = jSONObject.getLong("starttimestamp").longValue() * 1000;
                long jLongValue2 = jSONObject.getLong("endtimestamp").longValue() * 1000;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(new Date(jLongValue));
                u59.l = jLongValue2 - jLongValue;
                if (i == calendar2.get(7) && u59.l > 0) {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTime(new Date(jLongValue2));
                    u59.k = calendar3;
                    u59.j = calendar2;
                    break;
                }
            }
            u59.m = Boolean.FALSE;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m8539s() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_live_banner_switch");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject object = JSON.parseObject(string);
            if (object.getBoolean("enable").booleanValue() && vwb.m(JSON.parseArray(object.getString(FigureMessageType.region), String.class), new w9j() { // from class: l.kni
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(qib0.h0.toString()));
                }
            })) {
                List array = JSON.parseArray(object.getString("mcc_off"), String.class);
                if (array == null || (NullChecker.a(array) && !array.contains(String.valueOf(qib0.f0)))) {
                    u59.u = true;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m8540t() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("ad_monetize_live_native_switch");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject object = JSON.parseObject(string);
            if (object.getBoolean("enable").booleanValue() && vwb.m(JSON.parseArray(object.getString(FigureMessageType.region), String.class), new w9j() { // from class: l.gni
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(qib0.h0.toString()));
                }
            })) {
                List array = JSON.parseArray(object.getString("mcc_off"), String.class);
                if (array == null || (NullChecker.a(array) && !array.contains(String.valueOf(qib0.f0)))) {
                    int iIntValue = object.getInteger("ad_index").intValue();
                    u59.s = true;
                    u59.t = iIntValue;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m8541u() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("intl_horoscope_match_switch");
            if (!TextUtils.isEmpty(string)) {
                JSONObject object = JSON.parseObject(string);
                if (object.getBoolean("enable").booleanValue()) {
                    JSONArray jSONArray = object.getJSONArray("area");
                    for (int i = 0; i < jSONArray.size(); i++) {
                        Object obj = jSONArray.get(i);
                        if ((obj instanceof JSONObject) && vwb.m(JSON.parseArray(((JSONObject) obj).getString("mcc"), Integer.class), new w9j() { // from class: l.mni
                            public final Object call(Object obj2) {
                                return Boolean.valueOf(qib0.f0 == ((Integer) obj2).intValue());
                            }
                        })) {
                            u59.p = ((JSONObject) obj).getIntValue("swipe_count");
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        CoreModule.c.L1.d3().onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: v */
    public static String m8542v() {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        return calendar.get(1) + "," + (calendar.get(2) + 1) + "," + calendar.get(5);
    }

    /* JADX INFO: renamed from: w */
    public static void m8543w() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("intl_home_card_video");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject object = JSON.parseObject(string);
            if (object.getBoolean("enable").booleanValue()) {
                for (Object obj : object.getJSONArray("users")) {
                    if ((obj instanceof JSONObject) && ((JSONObject) obj).getString("regionTag").equals(qib0.h0.toString())) {
                        u59.q = ((JSONObject) obj).getJSONArray("user_id");
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m8544x() {
        uel.INSTANCE.f(FirebaseRemoteConfig.getInstance().getBoolean("android_use_new_domain"));
    }

    /* JADX INFO: renamed from: y */
    public static void m8545y() {
        i0c.d.put(FirebaseRemoteConfig.getInstance().getString("android_http_dns"));
    }

    /* JADX INFO: renamed from: z */
    public static void m8546z() {
        try {
            String string = FirebaseRemoteConfig.getInstance().getString("intl_enable_pay_config");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String str = qib0.s;
            if (qib0.t < JSON.parseObject(string).getIntValue("version")) {
                CoreModule.c.X1.T.onNext(Boolean.TRUE);
            }
        } catch (Exception unused) {
        }
    }
}
