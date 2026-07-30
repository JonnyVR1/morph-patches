package p149l;

import android.os.Handler;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class enq0 extends eiq0 {
    public enq0(Handler handler, long j, long j2) {
        super(handler, j, j2);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (hrq0.m132696e().m138760c()) {
            str = "[DeviceIdTask] did is done, stop check.";
        } else {
            String strM194563f = hrq0.m132693b().m194563f();
            if (TextUtils.isEmpty(strM194563f) || "0".equals(strM194563f)) {
                m116720b(m116722d());
                str = "[DeviceIdTask] did is null, continue check.";
            } else {
                hrq0.m132696e().m138759b(strM194563f);
                str = "[DeviceIdTask] did is " + strM194563f;
            }
        }
        kwq0.m147628a(str);
    }
}
