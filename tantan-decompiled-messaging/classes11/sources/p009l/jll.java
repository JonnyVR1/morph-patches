package p009l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p000p1.mobile.putong.p004ui.download.C0513a;
import com.p000p1.mobile.putong.p004ui.download.DownloadTask;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.concurrent.TimeUnit;
import l.du2;
import l.e30;
import l.stc0;
import l.w9j;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jll {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17152a(DownloadTask downloadTask, NetworkInfo networkInfo) {
        du2.a("[common][download]", "downloadFile waitConnectRetry " + downloadTask.f8072q + ", path = " + downloadTask.m9942v() + ", url = " + downloadTask.m9943w());
        C0513a.m9975u().m9979D(downloadTask);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15111. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: c */
    public static void m17154c(com.p000p1.mobile.putong.p004ui.download.DownloadTask r24) {
        /*
            Method dump skipped, instruction units count: 1511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009l.jll.m17154c(com.p1.mobile.putong.ui.download.DownloadTask):void");
    }

    /* JADX INFO: renamed from: d */
    public static String m17155d(URL url, stc0 stc0Var) {
        String strDecode;
        try {
            String file = url.getFile();
            String strSubstring = file.substring(file.lastIndexOf(47) + 1);
            if (strSubstring.toLowerCase().endsWith(".apk")) {
                strDecode = URLDecoder.decode(strSubstring, "UTF-8");
            } else {
                strDecode = stc0Var.c("Content-Disposition");
                if (strDecode != null) {
                    strDecode = URLDecoder.decode(strDecode.split(";")[1].split("=")[1].replaceAll("\"", ""), "UTF-8");
                }
            }
        } catch (UnsupportedEncodingException e) {
            CrashHelper.c(e);
            strDecode = null;
        }
        return TextUtils.isEmpty(strDecode) ? "tantan.apk" : strDecode;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m17156e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("ENOSPC") || str.contains("No space left on device");
    }

    /* JADX INFO: renamed from: f */
    public static void m17157f(final DownloadTask downloadTask) {
        int i = downloadTask.f8072q - 1;
        downloadTask.f8072q = i;
        if (i <= 0) {
            return;
        }
        downloadTask.m9923G();
        ConnectivityReceiver.m().filter(new w9j() { // from class: l.hll
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).take(1).delay(10L, TimeUnit.MILLISECONDS).observeOn(Schedulers.io()).subscribe(new e30() { // from class: l.ill
            public final void call(Object obj) {
                jll.m17152a(downloadTask, (NetworkInfo) obj);
            }
        });
    }
}
