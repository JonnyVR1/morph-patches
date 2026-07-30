package p149l;

import androidx.core.app.NotificationCompat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class mkg0 implements x74 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ k7g0 f134327a;

    public mkg0(k7g0 k7g0Var) {
        this.f134327a = k7g0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m155013a(k7g0 k7g0Var) {
        ung0 ung0Var;
        if (k7g0Var == null || (ung0Var = (ung0) k7g0Var.f121575a.get()) == null) {
            return;
        }
        ung0Var.onCompleted();
    }

    /* JADX INFO: renamed from: b */
    public static void m155014b(k7g0 k7g0Var, int i, String str) {
        ung0 ung0Var;
        if (k7g0Var == null || (ung0Var = (ung0) k7g0Var.f121575a.get()) == null) {
            return;
        }
        ung0Var.mo136200a(f9g0.m120080a(i, k7g0Var.f121576b, str));
    }

    /* JADX INFO: renamed from: c */
    public static void m155015c(k7g0 k7g0Var, IOException iOException) {
        if (k7g0Var != null) {
            int iM124589a = g6g0.m124589a(iOException);
            String str = "request error:" + iOException.toString();
            ung0 ung0Var = (ung0) k7g0Var.f121575a.get();
            if (ung0Var != null) {
                ung0Var.mo136200a(f9g0.m120080a(iM124589a, k7g0Var.f121576b, str));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m155016d(k7g0 k7g0Var, String str) {
        ung0 ung0Var;
        if (k7g0Var == null || (ung0Var = (ung0) k7g0Var.f121575a.get()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("request_id", k7g0Var.f121576b);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, k7g0Var.f121577c);
            jSONObject.put("data", str);
        } catch (Exception e) {
            LogUtils.file("SudAiManager", LogUtils.getErrorInfo(e));
        }
        ung0Var.onSseLine(jSONObject.toString());
    }

    @Override // p149l.x74
    public final void onFailure(sx3 sx3Var, final IOException iOException) {
        LogUtils.file("AiHttpService", "request error：" + LogUtils.getErrorInfo(iOException));
        final k7g0 k7g0Var = this.f134327a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.yhg0
            @Override // java.lang.Runnable
            public final void run() {
                mkg0.m155015c(k7g0Var, iOException);
            }
        });
    }

    @Override // p149l.x74
    public final void onResponse(sx3 sx3Var, exc0 exc0Var) throws IOException {
        if (!exc0Var.m118597I()) {
            final String str = "http error code：" + exc0Var.m118609q();
            final k7g0 k7g0Var = this.f134327a;
            final int i = -1;
            ThreadUtils.postUITask(new Runnable() { // from class: l.fig0
                @Override // java.lang.Runnable
                public final void run() {
                    mkg0.m155014b(k7g0Var, i, str);
                }
            });
            return;
        }
        gxc0 gxc0VarM118606k = exc0Var.m118606k();
        if (gxc0VarM118606k == null) {
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gxc0VarM118606k.byteStream()));
        while (true) {
            try {
                final String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    final k7g0 k7g0Var2 = this.f134327a;
                    ThreadUtils.postUITask(new Runnable() { // from class: l.dig0
                        @Override // java.lang.Runnable
                        public final void run() {
                            mkg0.m155013a(k7g0Var2);
                        }
                    });
                    return;
                } else {
                    LogUtils.file("AiHttpService", "aiSse line:" + line);
                    final k7g0 k7g0Var3 = this.f134327a;
                    ThreadUtils.postUITask(new Runnable() { // from class: l.big0
                        @Override // java.lang.Runnable
                        public final void run() {
                            mkg0.m155016d(k7g0Var3, line);
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
