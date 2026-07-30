package p153l;

import java.io.File;
import tech.sud.base.utils.Utils;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class sog0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ywg0.m217612b(new File(Utils.getApp().getFilesDir(), "sud/mgp/clog"));
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.file("ReportCacheCLogTask", "ReportCacheCLogTask error:" + LogUtils.getErrorInfo(e));
        }
    }
}
