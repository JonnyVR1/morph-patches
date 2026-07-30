package p153l;

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
public class qer implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    private SensorManager f157202a;

    /* JADX INFO: renamed from: b */
    private float f157203b;

    /* JADX INFO: renamed from: e */
    private boolean f157206e;

    /* JADX INFO: renamed from: f */
    private float f157207f;

    /* JADX INFO: renamed from: c */
    private int f157204c = -2;

    /* JADX INFO: renamed from: d */
    private Map<String, String> f157205d = new HashMap();

    /* JADX INFO: renamed from: g */
    private int f157208g = 0;

    public qer(Context context) {
        this.f157203b = -1.0f;
        this.f157206e = false;
        this.f157207f = -1.0f;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f157202a = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(5);
        if (defaultSensor != null) {
            this.f157202a.registerListener(this, defaultSensor, 0);
            float maximumRange = defaultSensor.getMaximumRange();
            this.f157207f = maximumRange;
            this.f157205d.put("MAX_RANGE", String.valueOf(maximumRange));
            if (this.f157207f == 0.0f) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "sensorEx", "maxRange", String.valueOf(this.f157207f));
            }
        } else {
            this.f157206e = true;
            this.f157205d.put("MAX_RANGE", String.valueOf(-1000000));
            this.f157203b = -1000000.0f;
        }
        this.f157205d.put("NO_MOON", String.valueOf(0.001f));
        this.f157205d.put("FULLMOON", String.valueOf(0.25f));
        this.f157205d.put("CLOUDY", String.valueOf(100.0f));
        this.f157205d.put("SUNRISE", String.valueOf(400.0f));
        this.f157205d.put("OVERCAST", String.valueOf(10000.0f));
        this.f157205d.put("SHADE", String.valueOf(20000.0f));
        this.f157205d.put("SUNLIGHT", String.valueOf(110000.0f));
        this.f157205d.put("SUNLIGHT_MAX", String.valueOf(120000.0f));
    }

    /* JADX INFO: renamed from: a */
    public void m176259a() {
        if (this.f157208g > 0) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "sensorEx", "zeroValueCount", String.valueOf(this.f157208g));
        }
        SensorManager sensorManager = this.f157202a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f157202a = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public float m176260b() {
        return this.f157203b;
    }

    /* JADX INFO: renamed from: c */
    public int m176261c() {
        return this.f157204c;
    }

    /* JADX INFO: renamed from: d */
    public String m176262d() {
        return ac00.m96789h(this.f157205d);
    }

    /* JADX INFO: renamed from: e */
    public boolean m176263e() {
        return this.f157206e;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        this.f157204c = i;
        if (!this.f157205d.containsKey("SENSOR_INFO")) {
            this.f157205d.put("SENSOR_INFO", sensor.toString());
        }
        this.f157205d.put("SENSOR_ACCURACY", String.valueOf(i));
        if (i < 3) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "sensorEx", "accuracy", String.valueOf(i));
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f157206e = true;
        if (sensorEvent.sensor.getType() == 5) {
            float f = sensorEvent.values[0];
            this.f157203b = f;
            if (f == 0.0f) {
                this.f157208g++;
            }
        }
    }
}
