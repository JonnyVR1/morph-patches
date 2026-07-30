package p153l;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.p077v2.data.App;
import com.tantanapp.beatles.p077v2.data.Device;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import com.tantanapp.beatles.p077v2.data.Sdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class jsw implements k5f {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final r4f f122536a;

    public jsw(@NonNull r4f r4fVar) {
        this.f122536a = r4fVar;
    }

    @Override // p153l.k5f
    /* JADX INFO: renamed from: a */
    public void mo82303a(MonitorEvent monitorEvent) {
        if (monitorEvent.getPlatform() == null) {
            monitorEvent.setPlatform("android");
        }
        m146887c(monitorEvent);
        m146886b(monitorEvent);
        f610.m124264b("MainEventProcessor process done! eventType:" + monitorEvent.getEventType(), new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m146886b(MonitorEvent monitorEvent) {
        monitorEvent.setUser(this.f122536a.getUserInfo());
        App app = monitorEvent.getApp();
        if (app == null) {
            app = new App();
        }
        app.setChannel(this.f122536a.getChannel());
        app.setBuildType(this.f122536a.mo132267d());
        monitorEvent.setApp(app);
        String strMo132264a = this.f122536a.mo132264a();
        if (!TextUtils.isEmpty(strMo132264a)) {
            Device device = monitorEvent.getDevice();
            if (device == null) {
                device = new Device();
            }
            device.setId(strMo132264a);
            monitorEvent.setDevice(device);
        }
        monitorEvent.setMappingFiles(this.f122536a.mo132270g());
        if (TextUtils.isEmpty(monitorEvent.getTransaction())) {
            monitorEvent.setTransaction(this.f122536a.mo132266c());
        }
        String strMo132268e = this.f122536a.mo132268e();
        if (TextUtils.isEmpty(strMo132268e)) {
            monitorEvent.setEnvironment(du2.m118061u() ? "staging" : "prod");
        } else {
            monitorEvent.setEnvironment(strMo132268e);
        }
        HashMap<String, String> mapMo132265b = this.f122536a.mo132265b(monitorEvent);
        if (mapMo132265b != null) {
            for (Map.Entry<String, String> entry : mapMo132265b.entrySet()) {
                monitorEvent.setTag(entry.getKey(), entry.getValue());
            }
        }
        HashMap<String, String> mapMo132269f = this.f122536a.mo132269f(monitorEvent);
        if (mapMo132269f != null) {
            for (Map.Entry<String, String> entry2 : mapMo132269f.entrySet()) {
                monitorEvent.setExtra(entry2.getKey(), entry2.getValue());
            }
        }
        monitorEvent.setExtra("mobile_time", p8c.m171235f(System.currentTimeMillis()));
        monitorEvent.setExtra("SDK_INT", "" + Build.VERSION.SDK_INT);
    }

    /* JADX INFO: renamed from: c */
    public final void m146887c(MonitorEvent monitorEvent) {
        Sdk sdk = new Sdk();
        sdk.setName("beatles.android");
        sdk.setVersion("1.2.2_ttt");
        monitorEvent.setSdk(sdk);
    }
}
