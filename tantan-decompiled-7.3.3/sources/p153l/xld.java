package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.NetConnectivityReceiver;
import com.tantanapp.beatles.p077v2.data.App;
import com.tantanapp.beatles.p077v2.data.Device;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import com.tantanapp.beatles.p077v2.data.OperatingSystem;
import com.tantanapp.beatles.utils.DeviceUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class xld implements k5f {

    /* JADX INFO: renamed from: c */
    public static final String f194941c = p8c.m171234e(System.currentTimeMillis());

    /* JADX INFO: renamed from: d */
    public static final long f194942d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: a */
    public Map<String, Object> f194943a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f194944b;

    /* JADX INFO: renamed from: l.xld$a */
    public class RunnableC21372a implements Runnable {
        public RunnableC21372a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xld.this.m211614e();
        }
    }

    public xld(Context context) {
        this.f194944b = context;
        new Thread(new RunnableC21372a()).start();
    }

    @Override // p153l.k5f
    /* JADX INFO: renamed from: a */
    public void mo82303a(MonitorEvent monitorEvent) {
        App app = monitorEvent.getApp();
        if (app == null) {
            app = new App();
        }
        m211615f(app);
        monitorEvent.setApp(app);
        Device device = monitorEvent.getDevice();
        if (device == null) {
            device = new Device();
        }
        m211612c(device);
        monitorEvent.setDevice(device);
        monitorEvent.setOs(m211613d());
        f610.m124264b("DefaultAndroidEventProcessor process done!", new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public final Device m211612c(Device device) {
        device.setManufacturer(Build.MANUFACTURER);
        device.setBrand(Build.BRAND);
        device.setFamily(DeviceUtil.m82394d());
        device.setModel(Build.MODEL);
        device.setModelId(Build.ID);
        device.setBootTime(p8c.m171234e(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        device.setConnectionType(NetConnectivityReceiver.getNetType());
        m211616g(device);
        try {
            ActivityManager.MemoryInfo memoryInfoM82396f = DeviceUtil.m82396f(this.f194944b);
            if (memoryInfoM82396f != null) {
                device.setMemorySize(Long.valueOf(DeviceUtil.m82402l(this.f194944b)));
                device.setFreeMemory(Long.valueOf(memoryInfoM82396f.availMem));
                device.setLowMemory(Boolean.valueOf(memoryInfoM82396f.lowMemory));
            }
            File externalFilesDir = this.f194944b.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                StatFs statFs = new StatFs(externalFilesDir.getPath());
                device.setStorageSize(d6g0.m114436h(statFs));
                device.setFreeStorage(d6g0.m114438j(statFs));
            }
            StatFs statFsM114434f = d6g0.m114434f(this.f194944b, externalFilesDir);
            if (statFsM114434f != null) {
                device.setExternalStorageSize(d6g0.m114435g(statFsM114434f));
                device.setExternalFreeStorage(d6g0.m114437i(statFsM114434f));
            }
            device.setScreenWidthPixels(Integer.valueOf(DeviceUtil.m82400j(this.f194944b)));
            device.setScreenHeightPixels(Integer.valueOf(DeviceUtil.m82399i(this.f194944b)));
            device.setScreenDensity(DeviceUtil.m82392b(this.f194944b));
            device.setScreenDpi(DeviceUtil.m82393c(this.f194944b));
        } catch (Throwable unused) {
        }
        return device;
    }

    /* JADX INFO: renamed from: d */
    public final OperatingSystem m211613d() {
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.setName("Android");
        operatingSystem.setVersion(DeviceUtil.m82401k());
        operatingSystem.setBuild(Build.DISPLAY);
        Object obj = this.f194943a.get("rooted");
        if (obj != null) {
            operatingSystem.setRooted((Boolean) obj);
        } else {
            operatingSystem.setRooted(Boolean.FALSE);
        }
        Object obj2 = this.f194943a.get("emulator");
        if (obj2 != null) {
            operatingSystem.setEmulator((Boolean) obj2);
            return operatingSystem;
        }
        operatingSystem.setEmulator(Boolean.FALSE);
        return operatingSystem;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public final void m211614e() {
        HashMap map = new HashMap();
        map.put("rooted", Boolean.valueOf(jmd0.m146151c()));
        map.put("emulator", DeviceUtil.m82405o());
        this.f194943a = map;
    }

    /* JADX INFO: renamed from: f */
    public final void m211615f(App app) {
        app.setAppStartTime(f194941c);
        app.setAppIdentifier(vc60.m200788c());
        app.setAppVersion(vc60.m200791f());
        app.setAppBuild(vc60.m200790e() + "");
        app.setForeground(Boolean.valueOf(zy0.m222096c().m222102g()));
        app.setUpDuration((SystemClock.elapsedRealtime() - f194942d) / 1000);
    }

    /* JADX INFO: renamed from: g */
    public final void m211616g(@NonNull Device device) {
        device.setArch(Build.SUPPORTED_ABIS);
        device.setCurrentArch(DeviceUtil.m82391a());
    }
}
