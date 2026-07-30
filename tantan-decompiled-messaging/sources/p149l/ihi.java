package p149l;

import android.util.Log;
import com.tantanapp.beatles.p072v2.upload.UploadStatus;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ihi {

    /* JADX INFO: renamed from: l.ihi$a */
    public class RunnableC17547a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f113253a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f113254b;

        public RunnableC17547a(String str, long j) {
            this.f113253a = str;
            this.f113254b = j;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            StringBuilder sb = new StringBuilder();
            sb.append(nt2.m160825p().m202314e());
            String str = File.separator;
            sb.append(str);
            sb.append("upload");
            String string = sb.toString();
            try {
                qhi.m174556q(this.f113253a, string, new File(string + str + "content.txt").getName());
            } catch (IOException unused) {
            }
            ihi.m136205d(this.f113254b, string, "content");
        }
    }

    /* JADX INFO: renamed from: l.ihi$b */
    public class RunnableC17548b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f113255a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f113256b;

        public RunnableC17548b(List list, long j) {
            this.f113255a = list;
            this.f113256b = j;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            String strM140084c = j7c.m140084c();
            String strM174542c = null;
            for (File file : this.f113255a) {
                strM174542c = qhi.m174542c(file, new File(nt2.m160825p().m202314e(), "upload" + File.separator + strM140084c), file.getName());
            }
            ihi.m136205d(this.f113256b, strM174542c, strM140084c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m136203b(String str, long j) {
        n21.m157541b(new RunnableC17547a(str, j));
    }

    /* JADX INFO: renamed from: c */
    public static void m136204c(List<File> list, long j) {
        n21.m157541b(new RunnableC17548b(list, j));
    }

    /* JADX INFO: renamed from: d */
    public static void m136205d(long j, String str, String str2) throws Throwable {
        Throwable th;
        Log.e("testPath", "filePath:" + str);
        m3f m3fVarM202313d = nt2.m160825p().m202313d();
        String userId = m3fVarM202313d != null ? m3fVarM202313d.getUserInfo().getUserId() : "";
        File file = null;
        try {
            try {
                File file2 = new File(qhi.m174557r(str));
                try {
                    if (nt2.m160824o().m161506t(new twv(p460.m167370f(), file2.getAbsolutePath(), userId, j, new Date())) == UploadStatus.SUCCESS) {
                        nt2.m160831v("[beatles]", "[upload] upload success:" + file2.getAbsolutePath());
                    } else {
                        nt2.m160831v("[beatles]", "[upload] upload fail:" + file2.getAbsolutePath());
                    }
                    qhi.m174545f(file2);
                } catch (Exception unused) {
                    file = file2;
                    nt2.m160831v("[beatles]", "[upload] upload fail:" + str);
                    qhi.m174546g(str);
                    if (file != null) {
                        qhi.m174545f(file);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    file = file2;
                    if (file == null) {
                        throw th;
                    }
                    qhi.m174545f(file);
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
