package p149l;

import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;

/* JADX INFO: renamed from: l.d1 */
/* JADX INFO: loaded from: classes13.dex */
public class C16284d1 extends z520 {
    @Override // p149l.z520, p149l.g4f
    /* JADX INFO: renamed from: a */
    public void mo81120a(@NonNull MonitorEvent monitorEvent) {
        super.mo81120a(monitorEvent);
        if (monitorEvent.getThrowable() != null) {
            monitorEvent.setFormat(hnd.m131888c().mo104783a());
        } else {
            monitorEvent.setFormat(C16035c1.m104782d().mo104783a());
        }
        m109560c(monitorEvent);
    }

    /* JADX INFO: renamed from: c */
    public final void m109560c(MonitorEvent monitorEvent) {
        try {
            if (this.f201747a != null) {
                monitorEvent.setExtra("trace", this.f201747a.get("anr short msg") + SignParameters.NEW_LINE + this.f201747a.get("anr log msg"));
            }
        } catch (Exception unused) {
        }
    }
}
