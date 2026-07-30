package p153l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u001c\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0004¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Ll/em3;", "Ll/qpl;", "Ll/hul;", "pMkWebview", "<init>", "(Ll/hul;)V", "Lorg/json/JSONObject;", CommandMessage.PARAMS, "", BLiveStormDanmakuGiftResourceType.f45294s, "(Lorg/json/JSONObject;)V", "", "namespace", FirebaseAnalytics.Param.METHOD, "", "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", Constants.KEY_T, "u", "()V", BLiveStormDanmakuGiftResourceType.f45292l, "c", "Ljava/lang/String;", "senorCallback", "Landroid/hardware/SensorManager;", Constants.INAPP_DATA_TAG, "Landroid/hardware/SensorManager;", "sensorManager", "l/em3$a", "e", "Ll/em3$a;", "sensorEventListener", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class em3 extends qpl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String senorCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private SensorManager sensorManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C16795a sensorEventListener;

    /* JADX INFO: renamed from: l.em3$a */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"l/em3$a", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", NotificationCompat.CATEGORY_EVENT, "", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C16795a implements SensorEventListener {
        public C16795a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(@NotNull Sensor sensor, int accuracy) {
            sensor.getClass();
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(@NotNull SensorEvent event) {
            event.getClass();
            float[] fArr = event.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            if (em3.this.senorCallback != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(BaseSei.f14624X, Float.valueOf(f));
                    jSONObject.put(BaseSei.f14625Y, Float.valueOf(f2));
                    jSONObject.put(BaseSei.f14626Z, Float.valueOf(f3));
                } catch (Exception e) {
                    jzv.m147730c("COMMON", "", e);
                }
                em3 em3Var = em3.this;
                String str = em3Var.senorCallback;
                em3Var.m177463g(str != null ? str : "", jSONObject.toString());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em3(@NotNull hul hulVar) {
        super(hulVar);
        hulVar.getClass();
        this.sensorEventListener = new C16795a();
    }

    /* JADX INFO: renamed from: s */
    private final void m121327s(JSONObject params) {
        long jOptLong;
        Context contextM177460c = m177460c();
        Object systemService = contextM177460c != null ? contextM177460c.getSystemService("vibrator") : null;
        Vibrator vibrator = (Vibrator) (systemService instanceof Vibrator ? systemService : null);
        if (m177460c() == null || vibrator == null) {
            return;
        }
        long j = 50;
        if (params != null) {
            try {
                jOptLong = params.optLong("time", 50L);
            } catch (Exception e) {
                jzv.m147730c(qpl.f158878b, "", e);
                return;
            }
        } else {
            jOptLong = 50;
        }
        if (jOptLong >= 0) {
            j = jOptLong;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(j, C15274a.m88489e(C15274a.m88486b(params != null ? params.optInt("amplitude", -1) : -1, 1), 255)));
        } else {
            vibrator.vibrate(j);
        }
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: l */
    public void mo121328l() {
        super.mo121328l();
        m121330u();
        this.sensorManager = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        if (Intrinsics.m88377d(namespace, "sensor") && m177460c() != null && method != null) {
            switch (method.hashCode()) {
                case -1832227987:
                    if (method.equals("stopAccelerometer")) {
                        m121330u();
                        return true;
                    }
                    break;
                case -334289232:
                    if (method.equals("stopCompass")) {
                        m177467k(namespace, method, params);
                        return true;
                    }
                    break;
                case 137546509:
                    if (method.equals("startAccelerometer")) {
                        m121329t(params);
                        return true;
                    }
                    break;
                case 451310959:
                    if (method.equals("vibrate")) {
                        m121327s(params);
                        return true;
                    }
                    break;
                case 505770473:
                    if (method.equals("getRealLocation")) {
                        m177467k(namespace, method, params);
                        return true;
                    }
                    break;
                case 816037456:
                    if (method.equals("startCompass")) {
                        m177467k(namespace, method, params);
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m121329t(@Nullable JSONObject params) {
        this.senorCallback = params != null ? params.optString("callback") : null;
        if (m177460c() != null && this.sensorManager == null) {
            Context contextM177460c = m177460c();
            Object systemService = contextM177460c != null ? contextM177460c.getSystemService("sensor") : null;
            if (!(systemService instanceof SensorManager)) {
                systemService = null;
            }
            this.sensorManager = (SensorManager) systemService;
        }
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.registerListener(this.sensorEventListener, sensorManager != null ? sensorManager.getDefaultSensor(1) : null, 0);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m121330u() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.sensorEventListener);
        }
    }
}
