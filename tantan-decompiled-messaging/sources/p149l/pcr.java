package p149l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class pcr implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    private SensorManager f148216a;

    /* JADX INFO: renamed from: b */
    private float f148217b;

    /* JADX INFO: renamed from: e */
    private boolean f148220e;

    /* JADX INFO: renamed from: f */
    private float f148221f;

    /* JADX INFO: renamed from: c */
    private int f148218c = -2;

    /* JADX INFO: renamed from: d */
    private Map<String, String> f148219d = new HashMap();

    /* JADX INFO: renamed from: g */
    private int f148222g = 0;

    public pcr(Context context) {
        this.f148217b = -1.0f;
        this.f148220e = false;
        this.f148221f = -1.0f;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f148216a = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(5);
        if (defaultSensor != null) {
            this.f148216a.registerListener(this, defaultSensor, 0);
            float maximumRange = defaultSensor.getMaximumRange();
            this.f148221f = maximumRange;
            this.f148219d.put("MAX_RANGE", String.valueOf(maximumRange));
            if (this.f148221f == 0.0f) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "sensorEx", "maxRange", String.valueOf(this.f148221f));
            }
        } else {
            this.f148220e = true;
            this.f148219d.put("MAX_RANGE", String.valueOf(-1000000));
            this.f148217b = -1000000.0f;
        }
        this.f148219d.put("NO_MOON", String.valueOf(0.001f));
        this.f148219d.put("FULLMOON", String.valueOf(0.25f));
        this.f148219d.put("CLOUDY", String.valueOf(100.0f));
        this.f148219d.put("SUNRISE", String.valueOf(400.0f));
        this.f148219d.put("OVERCAST", String.valueOf(10000.0f));
        this.f148219d.put("SHADE", String.valueOf(20000.0f));
        this.f148219d.put("SUNLIGHT", String.valueOf(110000.0f));
        this.f148219d.put("SUNLIGHT_MAX", String.valueOf(120000.0f));
    }

    /* JADX INFO: renamed from: a */
    public void m168365a() {
        if (this.f148222g > 0) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "sensorEx", "zeroValueCount", String.valueOf(this.f148222g));
        }
        SensorManager sensorManager = this.f148216a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f148216a = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public float m168366b() {
        return this.f148217b;
    }

    /* JADX INFO: renamed from: c */
    public int m168367c() {
        return this.f148218c;
    }

    /* JADX INFO: renamed from: d */
    public String m168368d() {
        return d300.m109844h(this.f148219d);
    }

    /* JADX INFO: renamed from: e */
    public boolean m168369e() {
        return this.f148220e;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        this.f148218c = i;
        if (!this.f148219d.containsKey("SENSOR_INFO")) {
            this.f148219d.put("SENSOR_INFO", sensor.toString());
        }
        this.f148219d.put("SENSOR_ACCURACY", String.valueOf(i));
        if (i < 3) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "sensorEx", "accuracy", String.valueOf(i));
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f148220e = true;
        if (sensorEvent.sensor.getType() == 5) {
            float f = sensorEvent.values[0];
            this.f148217b = f;
            if (f == 0.0f) {
                this.f148222g++;
            }
        }
    }
}
