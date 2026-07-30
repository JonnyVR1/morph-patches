package p003l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import l.exc0;
import l.f9g0;
import l.g6g0;
import l.gxc0;
import l.k7g0;
import l.sx3;
import l.ung0;
import l.x74;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class mkg0 implements x74 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ k7g0 f5680a;

    public mkg0(k7g0 k7g0Var) {
        this.f5680a = k7g0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m6405a(k7g0 k7g0Var) {
        ung0 ung0Var;
        if (k7g0Var == null || (ung0Var = (ung0) k7g0Var.a.get()) == null) {
            return;
        }
        ung0Var.onCompleted();
    }

    /* JADX INFO: renamed from: b */
    public static void m6406b(k7g0 k7g0Var, int i, String str) {
        ung0 ung0Var;
        if (k7g0Var == null || (ung0Var = (ung0) k7g0Var.a.get()) == null) {
            return;
        }
        ung0Var.a(f9g0.a(i, k7g0Var.b, str));
    }

    /* JADX INFO: renamed from: c */
    public static void m6407c(k7g0 k7g0Var, IOException iOException) {
        if (k7g0Var != null) {
            int iA = g6g0.a(iOException);
            String str = "request error:" + iOException.toString();
            ung0 ung0Var = (ung0) k7g0Var.a.get();
            if (ung0Var != null) {
                ung0Var.a(f9g0.a(iA, k7g0Var.b, str));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m6408d(k7g0 k7g0Var, String str) {
        ung0 ung0Var;
        if (k7g0Var == null || (ung0Var = (ung0) k7g0Var.a.get()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("request_id", k7g0Var.b);
            jSONObject.put("event", k7g0Var.c);
            jSONObject.put("data", str);
        } catch (Exception e) {
            LogUtils.file("SudAiManager", LogUtils.getErrorInfo(e));
        }
        ung0Var.onSseLine(jSONObject.toString());
    }

    public final void onFailure(sx3 sx3Var, final IOException iOException) {
        LogUtils.file("AiHttpService", "request error：" + LogUtils.getErrorInfo(iOException));
        final k7g0 k7g0Var = this.f5680a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.yhg0
            @Override // java.lang.Runnable
            public final void run() {
                mkg0.m6407c(k7g0Var, iOException);
            }
        });
    }

    public final void onResponse(sx3 sx3Var, exc0 exc0Var) throws IOException {
        if (!exc0Var.I()) {
            final String str = "http error code：" + exc0Var.q();
            final k7g0 k7g0Var = this.f5680a;
            final int i = -1;
            ThreadUtils.postUITask(new Runnable() { // from class: l.fig0
                @Override // java.lang.Runnable
                public final void run() {
                    mkg0.m6406b(k7g0Var, i, str);
                }
            });
            return;
        }
        gxc0 gxc0VarK = exc0Var.k();
        if (gxc0VarK == null) {
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gxc0VarK.byteStream()));
        while (true) {
            try {
                final String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    final k7g0 k7g0Var2 = this.f5680a;
                    ThreadUtils.postUITask(new Runnable() { // from class: l.dig0
                        @Override // java.lang.Runnable
                        public final void run() {
                            mkg0.m6405a(k7g0Var2);
                        }
                    });
                    return;
                } else {
                    LogUtils.file("AiHttpService", "aiSse line:" + line);
                    final k7g0 k7g0Var3 = this.f5680a;
                    ThreadUtils.postUITask(new Runnable() { // from class: l.big0
                        @Override // java.lang.Runnable
                        public final void run() {
                            mkg0.m6408d(k7g0Var3, line);
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
