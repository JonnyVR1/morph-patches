package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.NetConnectivityReceiver;
import com.tantanapp.beatles.p072v2.data.App;
import com.tantanapp.beatles.p072v2.data.Device;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import com.tantanapp.beatles.p072v2.data.OperatingSystem;
import com.tantanapp.beatles.utils.DeviceUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class rkd implements g4f {

    /* JADX INFO: renamed from: c */
    public static final String f159810c = j7c.m140086e(System.currentTimeMillis());

    /* JADX INFO: renamed from: d */
    public static final long f159811d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: a */
    public Map<String, Object> f159812a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f159813b;

    /* JADX INFO: renamed from: l.rkd$a */
    public class RunnableC19721a implements Runnable {
        public RunnableC19721a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            rkd.this.m179709e();
        }
    }

    public rkd(Context context) {
        this.f159813b = context;
        new Thread(new RunnableC19721a()).start();
    }

    @Override // p149l.g4f
    /* JADX INFO: renamed from: a */
    public void mo81120a(MonitorEvent monitorEvent) {
        App app = monitorEvent.getApp();
        if (app == null) {
            app = new App();
        }
        m179710f(app);
        monitorEvent.setApp(app);
        Device device = monitorEvent.getDevice();
        if (device == null) {
            device = new Device();
        }
        m179707c(device);
        monitorEvent.setDevice(device);
        monitorEvent.setOs(m179708d());
        vx00.m200472b("DefaultAndroidEventProcessor process done!", new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public final Device m179707c(Device device) {
        device.setManufacturer(Build.MANUFACTURER);
        device.setBrand(Build.BRAND);
        device.setFamily(DeviceUtil.m81211d());
        device.setModel(Build.MODEL);
        device.setModelId(Build.ID);
        device.setBootTime(j7c.m140086e(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        device.setConnectionType(NetConnectivityReceiver.getNetType());
        m179711g(device);
        try {
            ActivityManager.MemoryInfo memoryInfoM81213f = DeviceUtil.m81213f(this.f159813b);
            if (memoryInfoM81213f != null) {
                device.setMemorySize(Long.valueOf(DeviceUtil.m81219l(this.f159813b)));
                device.setFreeMemory(Long.valueOf(memoryInfoM81213f.availMem));
                device.setLowMemory(Boolean.valueOf(memoryInfoM81213f.lowMemory));
            }
            File externalFilesDir = this.f159813b.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                StatFs statFs = new StatFs(externalFilesDir.getPath());
                device.setStorageSize(vxf0.m200554h(statFs));
                device.setFreeStorage(vxf0.m200556j(statFs));
            }
            StatFs statFsM200552f = vxf0.m200552f(this.f159813b, externalFilesDir);
            if (statFsM200552f != null) {
                device.setExternalStorageSize(vxf0.m200553g(statFsM200552f));
                device.setExternalFreeStorage(vxf0.m200555i(statFsM200552f));
            }
            device.setScreenWidthPixels(Integer.valueOf(DeviceUtil.m81217j(this.f159813b)));
            device.setScreenHeightPixels(Integer.valueOf(DeviceUtil.m81216i(this.f159813b)));
            device.setScreenDensity(DeviceUtil.m81209b(this.f159813b));
            device.setScreenDpi(DeviceUtil.m81210c(this.f159813b));
        } catch (Throwable unused) {
        }
        return device;
    }

    /* JADX INFO: renamed from: d */
    public final OperatingSystem m179708d() {
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.setName("Android");
        operatingSystem.setVersion(DeviceUtil.m81218k());
        operatingSystem.setBuild(Build.DISPLAY);
        Object obj = this.f159812a.get("rooted");
        if (obj != null) {
            operatingSystem.setRooted((Boolean) obj);
        } else {
            operatingSystem.setRooted(Boolean.FALSE);
        }
        Object obj2 = this.f159812a.get("emulator");
        if (obj2 != null) {
            operatingSystem.setEmulator((Boolean) obj2);
            return operatingSystem;
        }
        operatingSystem.setEmulator(Boolean.FALSE);
        return operatingSystem;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public final void m179709e() {
        HashMap map = new HashMap();
        map.put("rooted", Boolean.valueOf(hed0.m130627c()));
        map.put("emulator", DeviceUtil.m81222o());
        this.f159812a = map;
    }

    /* JADX INFO: renamed from: f */
    public final void m179710f(App app) {
        app.setAppStartTime(f159810c);
        app.setAppIdentifier(p460.m167367c());
        app.setAppVersion(p460.m167370f());
        app.setAppBuild(p460.m167369e() + "");
        app.setForeground(Boolean.valueOf(sy0.m186556c().m186562g()));
        app.setUpDuration((SystemClock.elapsedRealtime() - f159811d) / 1000);
    }

    /* JADX INFO: renamed from: g */
    public final void m179711g(@NonNull Device device) {
        device.setArch(Build.SUPPORTED_ABIS);
        device.setCurrentArch(DeviceUtil.m81208a());
    }
}
