package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.concurrent.TimeUnit;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes10.dex */
public class ynl {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m216874a(DownloadTask downloadTask, NetworkInfo networkInfo) {
        tu2.m192703a("[common][download]", "downloadFile waitConnectRetry " + downloadTask.f55314q + ", path = " + downloadTask.m80804v() + ", url = " + downloadTask.m80805w());
        C13274a.m80837u().m80841D(downloadTask);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15111. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: c */
    public static void m216876c(com.p051p1.mobile.putong.p070ui.download.DownloadTask r24) {
        /*
            Method dump skipped, instruction units count: 1511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l.ynl.m216876c(com.p1.mobile.putong.ui.download.DownloadTask):void");
    }

    /* JADX INFO: renamed from: d */
    public static String m216877d(URL url, x1d0 x1d0Var) {
        String strDecode;
        try {
            String file = url.getFile();
            String strSubstring = file.substring(file.lastIndexOf(47) + 1);
            if (strSubstring.toLowerCase().endsWith(ShareConstants.PATCH_SUFFIX)) {
                strDecode = URLDecoder.decode(strSubstring, "UTF-8");
            } else {
                strDecode = x1d0Var.m209018c(HttpHeaders.CONTENT_DISPOSITION);
                if (strDecode != null) {
                    strDecode = URLDecoder.decode(strDecode.split(Constants.PACKNAME_END)[1].split("=")[1].replaceAll("\"", ""), "UTF-8");
                }
            }
        } catch (UnsupportedEncodingException e) {
            CrashHelper.m82479c(e);
            strDecode = null;
        }
        return TextUtils.isEmpty(strDecode) ? "tantan.apk" : strDecode;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m216878e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("ENOSPC") || str.contains("No space left on device");
    }

    /* JADX INFO: renamed from: f */
    public static void m216879f(final DownloadTask downloadTask) {
        int i = downloadTask.f55314q - 1;
        downloadTask.f55314q = i;
        if (i <= 0) {
            return;
        }
        downloadTask.m80785G();
        ConnectivityReceiver.m82473m().filter(new qcj() { // from class: l.wnl
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).take(1).delay(10L, TimeUnit.MILLISECONDS).observeOn(Schedulers.m222739io()).subscribe(new y20() { // from class: l.xnl
            @Override // p153l.y20
            public final void call(Object obj) {
                ynl.m216874a(downloadTask, (NetworkInfo) obj);
            }
        });
    }
}
