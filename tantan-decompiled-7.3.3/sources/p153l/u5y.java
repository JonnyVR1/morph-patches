package p153l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\"\u00101\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010 \u001a\u0004\b.\u0010/\"\u0004\b&\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00109\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\u0016\u0010;\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, m88121d2 = {"Ll/u5y;", "Landroid/hardware/SensorEventListener;", "", "pageType", "<init>", "(Ljava/lang/String;)V", "Landroid/content/Context;", "ctx", "", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;)V", "Landroid/hardware/SensorEvent;", NotificationCompat.CATEGORY_EVENT, "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "p0", "", "p1", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "b", "()V", "c", "f", "a", "Ljava/lang/String;", "getPageType", "()Ljava/lang/String;", "I", "SENSOR_RATE_NORMAL", "", "Z", "isDoOrientationChangedSnapshot", "Landroid/os/Handler;", "Landroid/os/Handler;", "UTIL_HANDLER", "Landroid/hardware/SensorManager;", "e", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/Sensor;", "acc_sensor", "g", "mag_sensor", "h", "getFront", "()Z", "(Z)V", "front", "", RXScreenCaptureService.KEY_INDEX, "[F", "accValues", "j", "magValues", "k", "r", BLiveStormDanmakuGiftResourceType.f45292l, "values", "Ljava/lang/Runnable;", "m", "Ljava/lang/Runnable;", "runnable", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class u5y implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String pageType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int SENSOR_RATE_NORMAL;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isDoOrientationChangedSnapshot;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Handler UTIL_HANDLER;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public SensorManager sensorManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Sensor acc_sensor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Sensor mag_sensor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean front;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public float[] accValues;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public float[] magValues;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public float[] r;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public float[] values;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public Runnable runnable;

    public u5y(@NotNull String str) {
        str.getClass();
        this.pageType = str;
        this.SENSOR_RATE_NORMAL = 2000000;
        this.isDoOrientationChangedSnapshot = true;
        this.UTIL_HANDLER = new Handler(Looper.getMainLooper());
        this.front = true;
        this.accValues = new float[3];
        this.magValues = new float[3];
        this.r = new float[9];
        this.values = new float[3];
        this.runnable = new Runnable() { // from class: l.t5y
            @Override // java.lang.Runnable
            public final void run() {
                u5y.m194633a(this.f172273a);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m194633a(u5y u5yVar) {
        u5yVar.isDoOrientationChangedSnapshot = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m194634b() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.UTIL_HANDLER.removeCallbacks(this.runnable);
    }

    /* JADX INFO: renamed from: c */
    public final void m194635c() {
        SensorManager.getRotationMatrix(this.r, null, this.accValues, this.magValues);
        SensorManager.getOrientation(this.r, this.values);
        if (Math.abs(Math.toDegrees(this.values[2])) <= 110.0d || Math.toDegrees(this.values[1]) <= -45.0d || Math.toDegrees(this.values[1]) >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        xa2.INSTANCE.m209830a("handleSensorOrientation", Math.toDegrees(this.values[0]) + ", " + Math.toDegrees(this.values[1]) + "， " + Math.toDegrees(this.values[2]));
        m194638f();
    }

    /* JADX INFO: renamed from: d */
    public final void m194636d(@Nullable Context ctx) {
        if (k8w.INSTANCE.m148752a(ctx)) {
            Object systemService = ctx != null ? ctx.getSystemService("sensor") : null;
            SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
            this.sensorManager = sensorManager;
            this.acc_sensor = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
            SensorManager sensorManager2 = this.sensorManager;
            this.mag_sensor = sensorManager2 != null ? sensorManager2.getDefaultSensor(2) : null;
            SensorManager sensorManager3 = this.sensorManager;
            if (sensorManager3 != null) {
                Sensor sensor = this.acc_sensor;
                int i = this.SENSOR_RATE_NORMAL;
                sensorManager3.registerListener(this, sensor, i, i);
            }
            SensorManager sensorManager4 = this.sensorManager;
            if (sensorManager4 != null) {
                Sensor sensor2 = this.mag_sensor;
                int i2 = this.SENSOR_RATE_NORMAL;
                sensorManager4.registerListener(this, sensor2, i2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m194637e(boolean z) {
        this.front = z;
    }

    /* JADX INFO: renamed from: f */
    public final void m194638f() {
        if (this.isDoOrientationChangedSnapshot && this.front) {
            this.isDoOrientationChangedSnapshot = false;
            this.UTIL_HANDLER.postDelayed(this.runnable, 3000L);
            haw.INSTANCE.m134320a().m134300k1("rotary_snapshot", this.pageType);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@Nullable SensorEvent event) {
        Sensor sensor;
        Sensor sensor2;
        if (event != null && (sensor2 = event.sensor) != null && sensor2.getType() == 1) {
            this.accValues = (float[]) event.values.clone();
        } else {
            if (event == null || (sensor = event.sensor) == null || sensor.getType() != 2) {
                return;
            }
            this.magValues = (float[]) event.values.clone();
            m194635c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@Nullable Sensor p0, int p1) {
    }
}
