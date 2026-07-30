package p153l;

import android.os.Handler;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class kwq0 extends jrq0 {
    public kwq0(Handler handler, long j, long j2) {
        super(handler, j, j2);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (n0r0.m161018e().m166171c()) {
            str = "[DeviceIdTask] did is done, stop check.";
        } else {
            String strM100920f = n0r0.m161015b().m100920f();
            if (TextUtils.isEmpty(strM100920f) || "0".equals(strM100920f)) {
                m146815b(m146817d());
                str = "[DeviceIdTask] did is null, continue check.";
            } else {
                n0r0.m161018e().m166170b(strM100920f);
                str = "[DeviceIdTask] did is " + strM100920f;
            }
        }
        q5r0.m175511a(str);
    }
}
