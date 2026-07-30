package p153l;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class nkh {

    /* JADX INFO: renamed from: c */
    public static volatile nkh f142459c;

    /* JADX INFO: renamed from: a */
    public ArrayList<AttitudeConfigs> f142460a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public Animator f142461b;

    public nkh() {
        m163609e();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m163607d(View view, View view2) {
        view.setScaleX(0.7f);
        view.setAlpha(0.0f);
        view2.setScaleX(1.23f);
        view2.setScaleY(1.23f);
    }

    /* JADX INFO: renamed from: l */
    public static nkh m163608l() {
        if (f142459c == null) {
            synchronized (nkh.class) {
                try {
                    if (f142459c == null) {
                        f142459c = new nkh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f142459c;
    }

    /* JADX INFO: renamed from: e */
    public void m163609e() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_attitude_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return;
            }
            JSONArray jSONArray = new JSONObject(strM80485F).getJSONArray("attitudeConfigs");
            if (jyb.m147479J(this.f142460a) || jSONArray.length() != this.f142460a.size()) {
                this.f142460a.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    AttitudeConfigs attitudeConfigs = new AttitudeConfigs();
                    attitudeConfigs.f40063id = jSONObject.getInt("id");
                    attitudeConfigs.name = jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
                    attitudeConfigs.url = jSONObject.getString("url");
                    attitudeConfigs.gifurl = jSONObject.getString("gifurl");
                    this.f142460a.add(attitudeConfigs);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public ArrayList<AttitudeConfigs> m163610f() {
        int[] iArrM163615k = m163615k();
        ArrayList<AttitudeConfigs> arrayList = new ArrayList<>();
        if (NullChecker.m82486a(iArrM163615k) && iArrM163615k.length > 0) {
            for (final int i : iArrM163615k) {
                AttitudeConfigs attitudeConfigs = (AttitudeConfigs) jyb.m147529r(this.f142460a, new qcj() { // from class: l.jkh
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((AttitudeConfigs) obj).f40063id == i);
                    }
                });
                if (NullChecker.m82486a(attitudeConfigs)) {
                    arrayList.add(attitudeConfigs);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public String m163611g() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_attitude_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return null;
            }
            return new JSONObject(strM80485F).getString("attitudeIcon");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public int m163612h() {
        int i;
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_attitude_config");
            if (TextUtils.isEmpty(strM80485F) || (i = new JSONObject(strM80485F).getInt("attitudeNumber")) < 0) {
                return 5;
            }
            return i;
        } catch (Exception unused) {
        }
        return 5;
    }

    /* JADX INFO: renamed from: i */
    public boolean m163613i() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_attitude_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).getBoolean("attitudeNumberSwitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public String m163614j(final int i) {
        AttitudeConfigs attitudeConfigs = (AttitudeConfigs) jyb.m147529r(this.f142460a, new qcj() { // from class: l.mkh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AttitudeConfigs) obj).f40063id == i);
            }
        });
        return NullChecker.m82486a(attitudeConfigs) ? attitudeConfigs.url : "";
    }

    /* JADX INFO: renamed from: k */
    public int[] m163615k() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_attitude_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                JSONArray jSONArray = new JSONObject(strM80485F).getJSONArray("currentAttitude");
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
    public final /* synthetic */ void m163616m(View view, View view2) {
        this.f142461b = null;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        view2.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: n */
    public void m163617n(final View view, final View view2) {
        if (NullChecker.m82486a(this.f142461b)) {
            this.f142461b.cancel();
        }
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(view, "alpha", 0L, 100L, new AccelerateDecelerateInterpolator(), 0.0f, 1.0f), gt0.m132166l(view, gt0.f106354i, 0L, 160L, new AccelerateDecelerateInterpolator(), 0.5691057f, 1.0f), gt0.m132166l(view, gt0.f106354i, 300L, 160L, new AccelerateDecelerateInterpolator(), 1.0f, 0.7723577f), gt0.m132166l(view, gt0.f106354i, 460L, 240L, new AccelerateDecelerateInterpolator(), 0.7723577f, 0.8130081f));
        this.f142461b = animatorM132180z;
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.kkh
            @Override // java.lang.Runnable
            public final void run() {
                nkh.m163607d(view, view2);
            }
        });
        gt0.m132160f(this.f142461b, new Runnable() { // from class: l.lkh
            @Override // java.lang.Runnable
            public final void run() {
                this.f132469a.m163616m(view2, view);
            }
        });
        this.f142461b.start();
    }
}
