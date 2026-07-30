package p153l;

import androidx.core.app.NotificationCompat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class usg0 implements w84 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sfg0 f180776a;

    public usg0(sfg0 sfg0Var) {
        this.f180776a = sfg0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m197877a(sfg0 sfg0Var) {
        cwg0 cwg0Var;
        if (sfg0Var == null || (cwg0Var = (cwg0) sfg0Var.f167696a.get()) == null) {
            return;
        }
        cwg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: b */
    public static void m197878b(sfg0 sfg0Var, int i, String str) {
        cwg0 cwg0Var;
        if (sfg0Var == null || (cwg0Var = (cwg0) sfg0Var.f167696a.get()) == null) {
            return;
        }
        cwg0Var.mo112901a(nhg0.m163092a(i, sfg0Var.f167697b, str));
    }

    /* JADX INFO: renamed from: c */
    public static void m197879c(sfg0 sfg0Var, IOException iOException) {
        if (sfg0Var != null) {
            int iM167366a = oeg0.m167366a(iOException);
            String str = "request error:" + iOException.toString();
            cwg0 cwg0Var = (cwg0) sfg0Var.f167696a.get();
            if (cwg0Var != null) {
                cwg0Var.mo112901a(nhg0.m163092a(iM167366a, sfg0Var.f167697b, str));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m197880d(sfg0 sfg0Var, String str) {
        cwg0 cwg0Var;
        if (sfg0Var == null || (cwg0Var = (cwg0) sfg0Var.f167696a.get()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("request_id", sfg0Var.f167697b);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, sfg0Var.f167698c);
            jSONObject.put("data", str);
        } catch (Exception e) {
            LogUtils.file("SudAiManager", LogUtils.getErrorInfo(e));
        }
        cwg0Var.onSseLine(jSONObject.toString());
    }

    @Override // p153l.w84
    public final void onFailure(ry3 ry3Var, final IOException iOException) {
        LogUtils.file("AiHttpService", "request error：" + LogUtils.getErrorInfo(iOException));
        final sfg0 sfg0Var = this.f180776a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.gqg0
            @Override // java.lang.Runnable
            public final void run() {
                usg0.m197879c(sfg0Var, iOException);
            }
        });
    }

    @Override // p153l.w84
    public final void onResponse(ry3 ry3Var, i5d0 i5d0Var) throws IOException {
        if (!i5d0Var.m138661I()) {
            final String str = "http error code：" + i5d0Var.m138673q();
            final sfg0 sfg0Var = this.f180776a;
            final int i = -1;
            ThreadUtils.postUITask(new Runnable() { // from class: l.nqg0
                @Override // java.lang.Runnable
                public final void run() {
                    usg0.m197878b(sfg0Var, i, str);
                }
            });
            return;
        }
        k5d0 k5d0VarM138670k = i5d0Var.m138670k();
        if (k5d0VarM138670k == null) {
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(k5d0VarM138670k.byteStream()));
        while (true) {
            try {
                final String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    final sfg0 sfg0Var2 = this.f180776a;
                    ThreadUtils.postUITask(new Runnable() { // from class: l.lqg0
                        @Override // java.lang.Runnable
                        public final void run() {
                            usg0.m197877a(sfg0Var2);
                        }
                    });
                    return;
                } else {
                    LogUtils.file("AiHttpService", "aiSse line:" + line);
                    final sfg0 sfg0Var3 = this.f180776a;
                    ThreadUtils.postUITask(new Runnable() { // from class: l.jqg0
                        @Override // java.lang.Runnable
                        public final void run() {
                            usg0.m197880d(sfg0Var3, line);
                        }
                    });
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
