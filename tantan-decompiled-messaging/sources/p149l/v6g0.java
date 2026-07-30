package p149l;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: loaded from: classes.dex */
public final class v6g0 implements InterfaceC22400a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h8g0 f180191a;

    public v6g0(h8g0 h8g0Var) {
        this.f180191a = h8g0Var;
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a.a
    /* JADX INFO: renamed from: a */
    public final void mo95422a(String str) {
        t6g0 t6g0Var;
        if (qkg0.f155121a != null) {
            LogUtils.file(3, "WXGame", "触发了：onGameANRDetected");
            if (erg0.f92916m) {
                SudLogger.m221573w("WXGame", "触发了：onGameANRDetected");
            }
        }
        icg0 icg0Var = this.f180191a.f106417h;
        if (icg0Var != null) {
            StringBuilder sb = new StringBuilder("onGameANRDetected 调用栈为 \n");
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            StringBuilder sb2 = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb2.append("at ");
                sb2.append(stackTraceElement.getClassName());
                sb2.append(".");
                sb2.append(stackTraceElement.getMethodName());
                sb2.append("(");
                sb2.append(stackTraceElement.getFileName());
                sb2.append(":");
                sb2.append(stackTraceElement.getLineNumber());
                sb2.append(")\n");
            }
            sb.append(sb2.toString());
            LogUtils.file("SUDRealSudFSTAPPImpl", sb.toString());
            kdg0 kdg0Var = icg0Var.f112462a.f92924h;
            if (kdg0Var == null || (t6g0Var = ((oqg0) kdg0Var).f145150m) == null) {
                return;
            }
            v8g0 v8g0Var = t6g0Var.f168615b;
            amg0 amg0Var = v8g0Var.f180521w;
            String str2 = v8g0Var.f180502d;
            long j = v8g0Var.f180503e;
            amg0Var.getClass();
            mcg0 mcg0Var = new mcg0("onGameANRDetected");
            if (str2 != null) {
                mcg0Var.f133120j.put("room_id", str2);
            }
            mcg0Var.f133117g = String.valueOf(j);
            String str3 = mcg0Var.f133113c;
            ThreadUtils.postUITask(new fgg0(mcg0Var.toString(), true, mcg0Var.f133111a, mcg0Var.f133115e));
            ExecutorService executorService = lmg0.f128795a;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("logId", str3);
                jSONObject.put("mgId", j);
                cbg0.m105995a("TechSudMGPGlobal.sp").m105997c("key_upload_anr_log_info", jSONObject.toString(), true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            lmg0.m150589b(j, 1, str3);
        }
    }
}
