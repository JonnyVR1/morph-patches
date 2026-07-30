package p153l;

import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;

/* JADX INFO: renamed from: l.d1 */
/* JADX INFO: loaded from: classes11.dex */
public class C16413d1 extends he20 {
    @Override // p153l.he20, p153l.k5f
    /* JADX INFO: renamed from: a */
    public void mo82303a(@NonNull MonitorEvent monitorEvent) {
        super.mo82303a(monitorEvent);
        if (monitorEvent.getThrowable() != null) {
            monitorEvent.setFormat(mod.m159258c().mo107477a());
        } else {
            monitorEvent.setFormat(C16158c1.m107476d().mo107477a());
        }
        m113474c(monitorEvent);
    }

    /* JADX INFO: renamed from: c */
    public final void m113474c(MonitorEvent monitorEvent) {
        try {
            if (this.f109059a != null) {
                monitorEvent.setExtra("trace", this.f109059a.get("anr short msg") + SignParameters.NEW_LINE + this.f109059a.get("anr log msg"));
            }
        } catch (Exception unused) {
        }
    }
}
