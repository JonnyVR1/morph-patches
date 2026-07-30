package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ytb extends c610<MonitorEvent> {

    /* JADX INFO: renamed from: l.ytb$a */
    public class C21680a implements u4m {
        public C21680a() {
        }

        @Override // p153l.u4m
        /* JADX INFO: renamed from: a */
        public void mo194493a(Thread thread, Throwable th, boolean z) {
            ytb.this.m217300m(thread, th, z);
        }
    }

    /* JADX INFO: renamed from: l.ytb$b */
    public class C21681b implements k5f {
        public C21681b() {
        }

        @Override // p153l.k5f
        /* JADX INFO: renamed from: a */
        public void mo82303a(@NonNull MonitorEvent monitorEvent) {
            String string;
            monitorEvent.setFormat(mod.m159258c().mo107477a());
            monitorEvent.setCacheDir(ytb.this.mo82291c() + "/" + monitorEvent.getEventId());
            try {
                string = new JSONObject(uyd.m198592f(ytb.this.f79923b)).toString();
            } catch (Throwable unused) {
                string = null;
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            monitorEvent.setExtra("virtual machine detection", string);
        }
    }

    @Override // p153l.f0m
    /* JADX INFO: renamed from: a */
    public String mo82290a() {
        return "java";
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: c */
    public String mo82291c() {
        return super.mo82291c() + "/" + getEventType() + "/" + mo82290a();
    }

    @Override // p153l.c610
    @Nullable
    /* JADX INFO: renamed from: d */
    public x2f mo82292d() {
        return mod.m159258c();
    }

    @Override // p153l.c610
    @Nullable
    /* JADX INFO: renamed from: e */
    public k5f mo82293e() {
        return new C21681b();
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: g */
    public void mo82295g(Context context, x3f x3fVar) {
        super.mo82295g(context, x3fVar);
        duj0.m118149d().m118155i(new C21680a());
        new rtb().m183104d();
        this.f79924c = true;
    }

    @Override // p153l.f0m
    public String getEventType() {
        return "crash";
    }

    /* JADX INFO: renamed from: m */
    public final void m217300m(Thread thread, Throwable th, boolean z) {
        if (th == null) {
            return;
        }
        du2.m118062v("[beatles][crash][java]", "java crash detected,throwable:" + th.getClass());
        if (thread.getName().equals(BLiveTraceServerLocation.main)) {
            du2.m118034C(true);
        }
        MonitorEvent monitorEvent = new MonitorEvent(z ? "exception" : getEventType(), z ? "crash" : mo82290a(), th);
        monitorEvent.setCrashThread(thread);
        monitorEvent.setNeedOtherThread(true);
        monitorEvent.setEmergency(!z);
        monitorEvent.setNeedLogcatProcessor(true);
        du2.m118062v("[beatles][crash][java]", "crashInfo:" + xtb.m213048b(th));
        if (z) {
            fo4.m126439a(monitorEvent.getEventId(), th);
        }
        m108092j(monitorEvent);
    }
}
