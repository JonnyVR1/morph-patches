package p149l;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class yih {

    /* JADX INFO: renamed from: c */
    public static volatile yih f198498c;

    /* JADX INFO: renamed from: a */
    public ArrayList<AttitudeConfigs> f198499a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public Animator f198500b;

    public yih() {
        m214910e();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m214908d(View view, View view2) {
        view.setScaleX(0.7f);
        view.setAlpha(0.0f);
        view2.setScaleX(1.23f);
        view2.setScaleY(1.23f);
    }

    /* JADX INFO: renamed from: l */
    public static yih m214909l() {
        if (f198498c == null) {
            synchronized (yih.class) {
                try {
                    if (f198498c == null) {
                        f198498c = new yih();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f198498c;
    }

    /* JADX INFO: renamed from: e */
    public void m214910e() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_attitude_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return;
            }
            JSONArray jSONArray = new JSONObject(strM79302F).getJSONArray("attitudeConfigs");
            if (vwb.m200296J(this.f198499a) || jSONArray.length() != this.f198499a.size()) {
                this.f198499a.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    AttitudeConfigs attitudeConfigs = new AttitudeConfigs();
                    attitudeConfigs.f39215id = jSONObject.getInt("id");
                    attitudeConfigs.name = jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
                    attitudeConfigs.url = jSONObject.getString("url");
                    attitudeConfigs.gifurl = jSONObject.getString("gifurl");
                    this.f198499a.add(attitudeConfigs);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public ArrayList<AttitudeConfigs> m214911f() {
        int[] iArrM214916k = m214916k();
        ArrayList<AttitudeConfigs> arrayList = new ArrayList<>();
        if (NullChecker.m81303a(iArrM214916k) && iArrM214916k.length > 0) {
            for (final int i : iArrM214916k) {
                AttitudeConfigs attitudeConfigs = (AttitudeConfigs) vwb.m200346r(this.f198499a, new w9j() { // from class: l.uih
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((AttitudeConfigs) obj).f39215id == i);
                    }
                });
                if (NullChecker.m81303a(attitudeConfigs)) {
                    arrayList.add(attitudeConfigs);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public String m214912g() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_attitude_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return null;
            }
            return new JSONObject(strM79302F).getString("attitudeIcon");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public int m214913h() {
        int i;
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_attitude_config");
            if (TextUtils.isEmpty(strM79302F) || (i = new JSONObject(strM79302F).getInt("attitudeNumber")) < 0) {
                return 5;
            }
            return i;
        } catch (Exception unused) {
        }
        return 5;
    }

    /* JADX INFO: renamed from: i */
    public boolean m214914i() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_attitude_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).getBoolean("attitudeNumberSwitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public String m214915j(final int i) {
        AttitudeConfigs attitudeConfigs = (AttitudeConfigs) vwb.m200346r(this.f198499a, new w9j() { // from class: l.xih
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AttitudeConfigs) obj).f39215id == i);
            }
        });
        return NullChecker.m81303a(attitudeConfigs) ? attitudeConfigs.url : "";
    }

    /* JADX INFO: renamed from: k */
    public int[] m214916k() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_attitude_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                JSONArray jSONArray = new JSONObject(strM79302F).getJSONArray("currentAttitude");
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
    public final /* synthetic */ void m214917m(View view, View view2) {
        this.f198500b = null;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        view2.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: n */
    public void m214918n(final View view, final View view2) {
        if (NullChecker.m81303a(this.f198500b)) {
            this.f198500b.cancel();
        }
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(view, "alpha", 0L, 100L, new AccelerateDecelerateInterpolator(), 0.0f, 1.0f), bt0.m103739l(view, bt0.f77162i, 0L, 160L, new AccelerateDecelerateInterpolator(), 0.5691057f, 1.0f), bt0.m103739l(view, bt0.f77162i, 300L, 160L, new AccelerateDecelerateInterpolator(), 1.0f, 0.7723577f), bt0.m103739l(view, bt0.f77162i, 460L, 240L, new AccelerateDecelerateInterpolator(), 0.7723577f, 0.8130081f));
        this.f198500b = animatorM103753z;
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.vih
            @Override // java.lang.Runnable
            public final void run() {
                yih.m214908d(view, view2);
            }
        });
        bt0.m103733f(this.f198500b, new Runnable() { // from class: l.wih
            @Override // java.lang.Runnable
            public final void run() {
                this.f186540a.m214917m(view2, view);
            }
        });
        this.f198500b.start();
    }
}
