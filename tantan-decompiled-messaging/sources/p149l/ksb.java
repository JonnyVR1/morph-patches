package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ksb extends sx00<MonitorEvent> {

    /* JADX INFO: renamed from: l.ksb$a */
    public class C18068a implements b2m {
        public C18068a() {
        }

        @Override // p149l.b2m
        /* JADX INFO: renamed from: a */
        public void mo99972a(Thread thread, Throwable th, boolean z) {
            ksb.this.m147050m(thread, th, z);
        }
    }

    /* JADX INFO: renamed from: l.ksb$b */
    public class C18069b implements g4f {
        public C18069b() {
        }

        @Override // p149l.g4f
        /* JADX INFO: renamed from: a */
        public void mo81120a(@NonNull MonitorEvent monitorEvent) {
            String string;
            monitorEvent.setFormat(hnd.m131888c().mo104783a());
            monitorEvent.setCacheDir(ksb.this.mo81108c() + "/" + monitorEvent.getEventId());
            try {
                string = new JSONObject(gxd.m128548f(ksb.this.f166773b)).toString();
            } catch (Throwable unused) {
                string = null;
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            monitorEvent.setExtra("virtual machine detection", string);
        }
    }

    @Override // p149l.mxl
    /* JADX INFO: renamed from: a */
    public String mo81107a() {
        return "java";
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: c */
    public String mo81108c() {
        return super.mo81108c() + "/" + getEventType() + "/" + mo81107a();
    }

    @Override // p149l.sx00
    @Nullable
    /* JADX INFO: renamed from: d */
    public s1f mo81109d() {
        return hnd.m131888c();
    }

    @Override // p149l.sx00
    @Nullable
    /* JADX INFO: renamed from: e */
    public g4f mo81110e() {
        return new C18069b();
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: g */
    public void mo81112g(Context context, s2f s2fVar) {
        super.mo81112g(context, s2fVar);
        alj0.m97291d().m97297i(new C18068a());
        new dsb().m113458d();
        this.f166774c = true;
    }

    @Override // p149l.mxl
    public String getEventType() {
        return "crash";
    }

    /* JADX INFO: renamed from: m */
    public final void m147050m(Thread thread, Throwable th, boolean z) {
        if (th == null) {
            return;
        }
        nt2.m160831v("[beatles][crash][java]", "java crash detected,throwable:" + th.getClass());
        if (thread.getName().equals(BLiveTraceServerLocation.main)) {
            nt2.m160803C(true);
        }
        MonitorEvent monitorEvent = new MonitorEvent(z ? "exception" : getEventType(), z ? "crash" : mo81107a(), th);
        monitorEvent.setCrashThread(thread);
        monitorEvent.setNeedOtherThread(true);
        monitorEvent.setEmergency(!z);
        monitorEvent.setNeedLogcatProcessor(true);
        nt2.m160831v("[beatles][crash][java]", "crashInfo:" + jsb.m143009b(th));
        if (z) {
            gn4.m127111a(monitorEvent.getEventId(), th);
        }
        m186395j(monitorEvent);
    }
}
