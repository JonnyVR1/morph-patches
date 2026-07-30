package p153l;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: loaded from: classes.dex */
public final class dfg0 implements InterfaceC22515a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgg0 f88154a;

    public dfg0(pgg0 pgg0Var) {
        this.f88154a = pgg0Var;
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a.a
    /* JADX INFO: renamed from: a */
    public final void mo106566a(String str) {
        bfg0 bfg0Var;
        if (ysg0.f201404a != null) {
            LogUtils.file(3, "WXGame", "触发了：onGameANRDetected");
            if (mzg0.f139508m) {
                SudLogger.m222819w("WXGame", "触发了：onGameANRDetected");
            }
        }
        qkg0 qkg0Var = this.f88154a.f152271h;
        if (qkg0Var != null) {
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
            slg0 slg0Var = qkg0Var.f158136a.f139516h;
            if (slg0Var == null || (bfg0Var = ((wyg0) slg0Var).f191652m) == null) {
                return;
            }
            dhg0 dhg0Var = bfg0Var.f76491b;
            iug0 iug0Var = dhg0Var.f88523w;
            String str2 = dhg0Var.f88504d;
            long j = dhg0Var.f88505e;
            iug0Var.getClass();
            ukg0 ukg0Var = new ukg0("onGameANRDetected");
            if (str2 != null) {
                ukg0Var.f179401j.put("room_id", str2);
            }
            ukg0Var.f179398g = String.valueOf(j);
            String str3 = ukg0Var.f179394c;
            ThreadUtils.postUITask(new nog0(ukg0Var.toString(), true, ukg0Var.f179392a, ukg0Var.f179396e));
            ExecutorService executorService = tug0.f176192a;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("logId", str3);
                jSONObject.put("mgId", j);
                kjg0.m150043a("TechSudMGPGlobal.sp").m150045c("key_upload_anr_log_info", jSONObject.toString(), true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            tug0.m192750b(j, 1, str3);
        }
    }
}
