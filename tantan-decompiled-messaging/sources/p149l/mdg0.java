package p149l;

import java.io.IOException;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class mdg0 implements x74 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sgg0 f133237a;

    public mdg0(sgg0 sgg0Var) {
        this.f133237a = sgg0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m154061a(sgg0 sgg0Var, int i, String str, String str2) {
        if (sgg0Var != null) {
            if (i == 0) {
                sgg0Var.onCompleted(str);
            } else {
                sgg0Var.onFailure(i, str2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m154062b(sgg0 sgg0Var, IOException iOException) {
        if (sgg0Var != null) {
            sgg0Var.onFailure(g6g0.m124589a(iOException), "request error:" + iOException.toString());
        }
    }

    @Override // p149l.x74
    public final void onFailure(sx3 sx3Var, final IOException iOException) {
        LogUtils.file("AiHttpService", "request error：" + LogUtils.getErrorInfo(iOException));
        final sgg0 sgg0Var = this.f133237a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.dag0
            @Override // java.lang.Runnable
            public final void run() {
                mdg0.m154062b(sgg0Var, iOException);
            }
        });
    }

    @Override // p149l.x74
    public final void onResponse(sx3 sx3Var, exc0 exc0Var) throws IOException {
        final String str;
        final int i;
        final String strString = null;
        if (exc0Var.m118597I()) {
            i = 0;
            str = "success";
            if (exc0Var.m118606k() != null) {
                strString = exc0Var.m118606k().string();
            }
        } else {
            str = "http error code：" + exc0Var.m118609q();
            i = -1;
        }
        final sgg0 sgg0Var = this.f133237a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.fag0
            @Override // java.lang.Runnable
            public final void run() {
                mdg0.m154061a(sgg0Var, i, strString, str);
            }
        });
    }
}
