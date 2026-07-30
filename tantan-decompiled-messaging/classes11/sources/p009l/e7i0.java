package p009l;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class e7i0 extends e400 {
    public e7i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public void m13792C(f400 f400Var, JSONObject jSONObject) {
        Vibrator vibrator = (Vibrator) a().getSystemService("vibrator");
        if (a() == null || vibrator == null) {
            return;
        }
        try {
            long j = 50;
            long jOptLong = jSONObject.optLong("time", 50L);
            if (jOptLong >= 0) {
                j = jOptLong;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(j, Math.min(Math.max(1, jSONObject.optInt("amplitude", -1)), 255)));
            } else {
                vibrator.vibrate(j);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo10568n(@NonNull @NotNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        if (!"vibrate".equals(str2)) {
            return false;
        }
        m13792C(f400Var, jSONObject);
        return true;
    }
}
