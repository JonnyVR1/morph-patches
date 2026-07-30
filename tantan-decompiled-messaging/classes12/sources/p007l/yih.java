package p007l;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p000p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.bt0;
import l.vwb;
import l.w9j;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class yih {

    /* JADX INFO: renamed from: c */
    public static volatile yih f15442c;

    /* JADX INFO: renamed from: a */
    public ArrayList<AttitudeConfigs> f15443a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public Animator f15444b;

    public yih() {
        m17139e();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m17137d(View view, View view2) {
        view.setScaleX(0.7f);
        view.setAlpha(0.0f);
        view2.setScaleX(1.23f);
        view2.setScaleY(1.23f);
    }

    /* JADX INFO: renamed from: l */
    public static yih m17138l() {
        if (f15442c == null) {
            synchronized (yih.class) {
                try {
                    if (f15442c == null) {
                        f15442c = new yih();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15442c;
    }

    /* JADX INFO: renamed from: e */
    public void m17139e() {
        try {
            String strF = RemoteConfig.x().F("moment_attitude_config");
            if (TextUtils.isEmpty(strF)) {
                return;
            }
            JSONArray jSONArray = new JSONObject(strF).getJSONArray("attitudeConfigs");
            if (vwb.J(this.f15443a) || jSONArray.length() != this.f15443a.size()) {
                this.f15443a.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    AttitudeConfigs attitudeConfigs = new AttitudeConfigs();
                    attitudeConfigs.f676id = jSONObject.getInt("id");
                    attitudeConfigs.name = jSONObject.getString("name");
                    attitudeConfigs.url = jSONObject.getString("url");
                    attitudeConfigs.gifurl = jSONObject.getString("gifurl");
                    this.f15443a.add(attitudeConfigs);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public ArrayList<AttitudeConfigs> m17140f() {
        int[] iArrM17145k = m17145k();
        ArrayList<AttitudeConfigs> arrayList = new ArrayList<>();
        if (NullChecker.a(iArrM17145k) && iArrM17145k.length > 0) {
            for (final int i : iArrM17145k) {
                AttitudeConfigs attitudeConfigs = (AttitudeConfigs) vwb.r(this.f15443a, new w9j() { // from class: l.uih
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((AttitudeConfigs) obj).f676id == i);
                    }
                });
                if (NullChecker.a(attitudeConfigs)) {
                    arrayList.add(attitudeConfigs);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public String m17141g() {
        try {
            String strF = RemoteConfig.x().F("moment_attitude_config");
            if (TextUtils.isEmpty(strF)) {
                return null;
            }
            return new JSONObject(strF).getString("attitudeIcon");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public int m17142h() {
        int i;
        try {
            String strF = RemoteConfig.x().F("moment_attitude_config");
            if (TextUtils.isEmpty(strF) || (i = new JSONObject(strF).getInt("attitudeNumber")) < 0) {
                return 5;
            }
            return i;
        } catch (Exception unused) {
        }
        return 5;
    }

    /* JADX INFO: renamed from: i */
    public boolean m17143i() {
        try {
            String strF = RemoteConfig.x().F("moment_attitude_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).getBoolean("attitudeNumberSwitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public String m17144j(final int i) {
        AttitudeConfigs attitudeConfigs = (AttitudeConfigs) vwb.r(this.f15443a, new w9j() { // from class: l.xih
            public final Object call(Object obj) {
                return Boolean.valueOf(((AttitudeConfigs) obj).f676id == i);
            }
        });
        return NullChecker.a(attitudeConfigs) ? attitudeConfigs.url : "";
    }

    /* JADX INFO: renamed from: k */
    public int[] m17145k() {
        try {
            String strF = RemoteConfig.x().F("moment_attitude_config");
            if (!TextUtils.isEmpty(strF)) {
                JSONArray jSONArray = new JSONObject(strF).getJSONArray("currentAttitude");
                if (jSONArray.length() == 0) {
                    return new int[]{1, 2, 3, 4};
                }
                int[] iArr = new int[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    iArr[i] = jSONArray.getInt(i);
                }
                return iArr;
            }
        } catch (Exception unused) {
        }
        return new int[]{1, 2, 3, 4};
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m17146m(View view, View view2) {
        this.f15444b = null;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        view2.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: n */
    public void m17147n(final View view, final View view2) {
        if (NullChecker.a(this.f15444b)) {
            this.f15444b.cancel();
        }
        Animator animatorZ = bt0.z(new Animator[]{bt0.p(view, "alpha", 0L, 100L, new AccelerateDecelerateInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(view, bt0.i, 0L, 160L, new AccelerateDecelerateInterpolator(), new float[]{0.5691057f, 1.0f}), bt0.l(view, bt0.i, 300L, 160L, new AccelerateDecelerateInterpolator(), new float[]{1.0f, 0.7723577f}), bt0.l(view, bt0.i, 460L, 240L, new AccelerateDecelerateInterpolator(), new float[]{0.7723577f, 0.8130081f})});
        this.f15444b = animatorZ;
        bt0.v(animatorZ, new Runnable() { // from class: l.vih
            @Override // java.lang.Runnable
            public final void run() {
                yih.m17137d(view, view2);
            }
        });
        bt0.f(this.f15444b, new Runnable() { // from class: l.wih
            @Override // java.lang.Runnable
            public final void run() {
                this.f14551a.m17146m(view2, view);
            }
        });
        this.f15444b.start();
    }
}
