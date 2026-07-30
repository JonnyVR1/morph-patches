package p153l;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class egi0 extends wc00 {
    public egi0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: K */
    public void m120771K(xc00 xc00Var, JSONObject jSONObject) {
        Vibrator vibrator = (Vibrator) m177460c().getSystemService("vibrator");
        if (m177460c() == null || vibrator == null) {
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
            CrashHelper.m82479c(e);
        }
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull @NotNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        if (!"vibrate".equals(str2)) {
            return false;
        }
        m120771K(xc00Var, jSONObject);
        return true;
    }
}
