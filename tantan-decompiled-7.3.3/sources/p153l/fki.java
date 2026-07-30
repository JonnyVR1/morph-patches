package p153l;

import android.util.Log;
import com.tantanapp.beatles.p077v2.upload.UploadStatus;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class fki {

    /* JADX INFO: renamed from: l.fki$a */
    public class RunnableC16997a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f99511a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f99512b;

        public RunnableC16997a(String str, long j) {
            this.f99511a = str;
            this.f99512b = j;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            StringBuilder sb = new StringBuilder();
            sb.append(du2.m118056p().m110249e());
            String str = File.separator;
            sb.append(str);
            sb.append("upload");
            String string = sb.toString();
            try {
                nki.m163634q(this.f99511a, string, new File(string + str + "content.txt").getName());
            } catch (IOException unused) {
            }
            fki.m126006d(this.f99512b, string, "content");
        }
    }

    /* JADX INFO: renamed from: l.fki$b */
    public class RunnableC16998b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f99513a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f99514b;

        public RunnableC16998b(List list, long j) {
            this.f99513a = list;
            this.f99514b = j;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            String strM171232c = p8c.m171232c();
            String strM163620c = null;
            for (File file : this.f99513a) {
                strM163620c = nki.m163620c(file, new File(du2.m118056p().m110249e(), "upload" + File.separator + strM171232c), file.getName());
            }
            fki.m126006d(this.f99514b, strM163620c, strM171232c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m126004b(String str, long j) {
        u21.m194238b(new RunnableC16997a(str, j));
    }

    /* JADX INFO: renamed from: c */
    public static void m126005c(List<File> list, long j) {
        u21.m194238b(new RunnableC16998b(list, j));
    }

    /* JADX INFO: renamed from: d */
    public static void m126006d(long j, String str, String str2) throws Throwable {
        Throwable th;
        Log.e("testPath", "filePath:" + str);
        r4f r4fVarM110248d = du2.m118056p().m110248d();
        String userId = r4fVarM110248d != null ? r4fVarM110248d.getUserInfo().getUserId() : "";
        File file = null;
        try {
            try {
                File file2 = new File(nki.m163635r(str));
                try {
                    if (du2.m118055o().m175145t(new tyv(vc60.m200791f(), file2.getAbsolutePath(), userId, j, new Date())) == UploadStatus.SUCCESS) {
                        du2.m118062v("[beatles]", "[upload] upload success:" + file2.getAbsolutePath());
                    } else {
                        du2.m118062v("[beatles]", "[upload] upload fail:" + file2.getAbsolutePath());
                    }
                    nki.m163623f(file2);
                } catch (Exception unused) {
                    file = file2;
                    du2.m118062v("[beatles]", "[upload] upload fail:" + str);
                    nki.m163624g(str);
                    if (file != null) {
                        nki.m163623f(file);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    file = file2;
                    if (file == null) {
                        throw th;
                    }
                    nki.m163623f(file);
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
