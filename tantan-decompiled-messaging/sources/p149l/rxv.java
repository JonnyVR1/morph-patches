package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class rxv implements g4f {

    /* JADX INFO: renamed from: a */
    public yei0 f161512a;

    /* JADX INFO: renamed from: b */
    public o31 f161513b;

    /* JADX INFO: renamed from: l.rxv$a */
    public class RunnableC19811a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f161514a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MonitorEvent f161515b;

        public RunnableC19811a(String str, MonitorEvent monitorEvent) {
            this.f161514a = str;
            this.f161515b = monitorEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                File fileM181649c = rxv.this.m181649c(this.f161514a + File.separator + this.f161515b.getEventId());
                if (fileM181649c == null || !fileM181649c.exists()) {
                    return;
                }
                rxv.this.f161513b.m162344n(Arrays.asList(fileM181649c), this.f161515b);
            } catch (Throwable unused) {
            }
        }
    }

    public rxv(MonitorEvent monitorEvent) {
        o31 o31VarM201300i = w3f.m201297m().m201300i();
        this.f161513b = o31VarM201300i;
        String strM162342l = o31VarM201300i.m162342l();
        yei0 yei0VarM208581c = xei0.m208581c();
        this.f161512a = yei0VarM208581c;
        yei0VarM208581c.m214349a(new RunnableC19811a(strM162342l, monitorEvent));
    }

    /* JADX INFO: renamed from: c */
    public final File m181649c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str, "trace");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            String str2 = "logcat-" + j7c.m140087f(System.currentTimeMillis()) + ".txt";
            vx00.m200472b("prepare logcat file ".concat(str2), new Object[0]);
            try {
                if (qhi.m174556q(sxv.m186546c(), file.getAbsolutePath(), str2)) {
                    return new File(file, str2);
                }
            } catch (Exception unused) {
                vx00.m200472b("failed to generate logcat file ".concat(str2), new Object[0]);
            }
            vx00.m200472b("succeed to generate logcat file ".concat(str2), new Object[0]);
        } else {
            vx00.m200472b("failed to found logcat dir " + str, new Object[0]);
        }
        return null;
    }

    @Override // p149l.g4f
    /* JADX INFO: renamed from: a */
    public void mo81120a(@NonNull MonitorEvent monitorEvent) {
    }
}
