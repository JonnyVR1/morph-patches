package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class ozv implements k5f {

    /* JADX INFO: renamed from: a */
    public yni0 f149958a;

    /* JADX INFO: renamed from: b */
    public v31 f149959b;

    /* JADX INFO: renamed from: l.ozv$a */
    public class RunnableC19259a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f149960a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MonitorEvent f149961b;

        public RunnableC19259a(String str, MonitorEvent monitorEvent) {
            this.f149960a = str;
            this.f149961b = monitorEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                File fileM170000c = ozv.this.m170000c(this.f149960a + File.separator + this.f149961b.getEventId());
                if (fileM170000c == null || !fileM170000c.exists()) {
                    return;
                }
                ozv.this.f149959b.m199173n(Arrays.asList(fileM170000c), this.f149961b);
            } catch (Throwable unused) {
            }
        }
    }

    public ozv(MonitorEvent monitorEvent) {
        v31 v31VarM96063i = a5f.m96060m().m96063i();
        this.f149959b = v31VarM96063i;
        String strM199171l = v31VarM96063i.m199171l();
        yni0 yni0VarM212211c = xni0.m212211c();
        this.f149958a = yni0VarM212211c;
        yni0VarM212211c.m216870a(new RunnableC19259a(strM199171l, monitorEvent));
    }

    /* JADX INFO: renamed from: c */
    public final File m170000c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str, "trace");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            String str2 = "logcat-" + p8c.m171235f(System.currentTimeMillis()) + ".txt";
            f610.m124264b("prepare logcat file ".concat(str2), new Object[0]);
            try {
                if (nki.m163634q(pzv.m174624c(), file.getAbsolutePath(), str2)) {
                    return new File(file, str2);
                }
            } catch (Exception unused) {
                f610.m124264b("failed to generate logcat file ".concat(str2), new Object[0]);
            }
            f610.m124264b("succeed to generate logcat file ".concat(str2), new Object[0]);
        } else {
            f610.m124264b("failed to found logcat dir " + str, new Object[0]);
        }
        return null;
    }

    @Override // p153l.k5f
    /* JADX INFO: renamed from: a */
    public void mo82303a(@NonNull MonitorEvent monitorEvent) {
    }
}
