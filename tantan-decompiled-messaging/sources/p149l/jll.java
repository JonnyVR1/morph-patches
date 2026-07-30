package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.concurrent.TimeUnit;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public class jll {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m142095a(DownloadTask downloadTask, NetworkInfo networkInfo) {
        du2.m113670a("[common][download]", "downloadFile waitConnectRetry " + downloadTask.f54466q + ", path = " + downloadTask.m79621v() + ", url = " + downloadTask.m79622w());
        C13111a.m79654u().m79658D(downloadTask);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15111. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: c */
    public static void m142097c(com.p046p1.mobile.putong.p065ui.download.DownloadTask r24) {
        /*
            Method dump skipped, instruction units count: 1511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.jll.m142097c(com.p1.mobile.putong.ui.download.DownloadTask):void");
    }

    /* JADX INFO: renamed from: d */
    public static String m142098d(URL url, stc0 stc0Var) {
        String strDecode;
        try {
            String file = url.getFile();
            String strSubstring = file.substring(file.lastIndexOf(47) + 1);
            if (strSubstring.toLowerCase().endsWith(ShareConstants.PATCH_SUFFIX)) {
                strDecode = URLDecoder.decode(strSubstring, "UTF-8");
            } else {
                strDecode = stc0Var.m185873c(HttpHeaders.CONTENT_DISPOSITION);
                if (strDecode != null) {
                    strDecode = URLDecoder.decode(strDecode.split(Constants.PACKNAME_END)[1].split("=")[1].replaceAll("\"", ""), "UTF-8");
                }
            }
        } catch (UnsupportedEncodingException e) {
            CrashHelper.m81296c(e);
            strDecode = null;
        }
        return TextUtils.isEmpty(strDecode) ? "tantan.apk" : strDecode;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m142099e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("ENOSPC") || str.contains("No space left on device");
    }

    /* JADX INFO: renamed from: f */
    public static void m142100f(final DownloadTask downloadTask) {
        int i = downloadTask.f54466q - 1;
        downloadTask.f54466q = i;
        if (i <= 0) {
            return;
        }
        downloadTask.m79602G();
        ConnectivityReceiver.m81290m().filter(new w9j() { // from class: l.hll
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).take(1).delay(10L, TimeUnit.MILLISECONDS).observeOn(Schedulers.m221493io()).subscribe(new e30() { // from class: l.ill
            @Override // p149l.e30
            public final void call(Object obj) {
                jll.m142095a(downloadTask, (NetworkInfo) obj);
            }
        });
    }
}
