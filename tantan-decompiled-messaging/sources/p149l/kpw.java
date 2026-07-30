package p149l;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.p072v2.data.App;
import com.tantanapp.beatles.p072v2.data.Device;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import com.tantanapp.beatles.p072v2.data.Sdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class kpw implements g4f {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final m3f f124198a;

    public kpw(@NonNull m3f m3fVar) {
        this.f124198a = m3fVar;
    }

    @Override // p149l.g4f
    /* JADX INFO: renamed from: a */
    public void mo81120a(MonitorEvent monitorEvent) {
        if (monitorEvent.getPlatform() == null) {
            monitorEvent.setPlatform("android");
        }
        m146894c(monitorEvent);
        m146893b(monitorEvent);
        vx00.m200472b("MainEventProcessor process done! eventType:" + monitorEvent.getEventType(), new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m146893b(MonitorEvent monitorEvent) {
        monitorEvent.setUser(this.f124198a.getUserInfo());
        App app = monitorEvent.getApp();
        if (app == null) {
            app = new App();
        }
        app.setChannel(this.f124198a.getChannel());
        app.setBuildType(this.f124198a.mo152852d());
        monitorEvent.setApp(app);
        String strMo152849a = this.f124198a.mo152849a();
        if (!TextUtils.isEmpty(strMo152849a)) {
            Device device = monitorEvent.getDevice();
            if (device == null) {
                device = new Device();
            }
            device.setId(strMo152849a);
            monitorEvent.setDevice(device);
        }
        monitorEvent.setMappingFiles(this.f124198a.mo152855g());
        if (TextUtils.isEmpty(monitorEvent.getTransaction())) {
            monitorEvent.setTransaction(this.f124198a.mo152851c());
        }
        String strMo152853e = this.f124198a.mo152853e();
        if (TextUtils.isEmpty(strMo152853e)) {
            monitorEvent.setEnvironment(nt2.m160830u() ? "staging" : "prod");
        } else {
            monitorEvent.setEnvironment(strMo152853e);
        }
        HashMap<String, String> mapMo152850b = this.f124198a.mo152850b(monitorEvent);
        if (mapMo152850b != null) {
            for (Map.Entry<String, String> entry : mapMo152850b.entrySet()) {
                monitorEvent.setTag(entry.getKey(), entry.getValue());
            }
        }
        HashMap<String, String> mapMo152854f = this.f124198a.mo152854f(monitorEvent);
        if (mapMo152854f != null) {
            for (Map.Entry<String, String> entry2 : mapMo152854f.entrySet()) {
                monitorEvent.setExtra(entry2.getKey(), entry2.getValue());
            }
        }
        monitorEvent.setExtra("mobile_time", j7c.m140087f(System.currentTimeMillis()));
        monitorEvent.setExtra("SDK_INT", "" + Build.VERSION.SDK_INT);
    }

    /* JADX INFO: renamed from: c */
    public final void m146894c(MonitorEvent monitorEvent) {
        Sdk sdk = new Sdk();
        sdk.setName("beatles.android");
        sdk.setVersion("1.2.2_ttt");
        monitorEvent.setSdk(sdk);
    }
}
