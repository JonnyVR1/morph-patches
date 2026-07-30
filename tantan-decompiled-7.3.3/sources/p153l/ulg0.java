package p153l;

import java.io.IOException;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class ulg0 implements w84 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ apg0 f179510a;

    public ulg0(apg0 apg0Var) {
        this.f179510a = apg0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m196550a(apg0 apg0Var, int i, String str, String str2) {
        if (apg0Var != null) {
            if (i == 0) {
                apg0Var.onCompleted(str);
            } else {
                apg0Var.onFailure(i, str2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m196551b(apg0 apg0Var, IOException iOException) {
        if (apg0Var != null) {
            apg0Var.onFailure(oeg0.m167366a(iOException), "request error:" + iOException.toString());
        }
    }

    @Override // p153l.w84
    public final void onFailure(ry3 ry3Var, final IOException iOException) {
        LogUtils.file("AiHttpService", "request error：" + LogUtils.getErrorInfo(iOException));
        final apg0 apg0Var = this.f179510a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.lig0
            @Override // java.lang.Runnable
            public final void run() {
                ulg0.m196551b(apg0Var, iOException);
            }
        });
    }

    @Override // p153l.w84
    public final void onResponse(ry3 ry3Var, i5d0 i5d0Var) throws IOException {
        final String str;
        final int i;
        final String strString = null;
        if (i5d0Var.m138661I()) {
            i = 0;
            str = "success";
            if (i5d0Var.m138670k() != null) {
                strString = i5d0Var.m138670k().string();
            }
        } else {
            str = "http error code：" + i5d0Var.m138673q();
            i = -1;
        }
        final apg0 apg0Var = this.f179510a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.nig0
            @Override // java.lang.Runnable
            public final void run() {
                ulg0.m196550a(apg0Var, i, strString, str);
            }
        });
    }
}
