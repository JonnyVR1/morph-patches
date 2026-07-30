package p149l;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0002\u0007\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, m87232d2 = {"Ll/icl0;", "Landroid/hardware/SensorEventListener;", "<init>", "()V", "Ll/icl0$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "a", "(Ll/icl0$b;)V", "Landroid/hardware/SensorEvent;", NotificationCompat.CATEGORY_EVENT, "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Ll/icl0$b;", "onShakeListener", "Companion", "b", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class icl0 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public InterfaceC17519b onShakeListener;

    /* JADX INFO: renamed from: l.icl0$b */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"Ll/icl0$b;", "", "", "a", "()V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC17519b {
        /* JADX INFO: renamed from: a */
        void mo135360a();
    }

    /* JADX INFO: renamed from: a */
    public final void m135359a(@Nullable InterfaceC17519b listener) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            this.onShakeListener = listener;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@NotNull Sensor sensor, int accuracy) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            sensor.getClass();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent event) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            event.getClass();
            InterfaceC17519b interfaceC17519b = this.onShakeListener;
            if (interfaceC17519b != null) {
                float[] fArr = event.values;
                double d = fArr[0] / 9.80665f;
                double d2 = fArr[1] / 9.80665f;
                double d3 = fArr[2] / 9.80665f;
                if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.3d) {
                    interfaceC17519b.mo135360a();
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
