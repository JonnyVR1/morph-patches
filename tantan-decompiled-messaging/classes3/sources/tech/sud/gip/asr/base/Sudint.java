package tech.sud.gip.asr.base;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import l.asg0;
import l.g8g0;
import l.mlg0;
import l.ymg0;
import org.json.JSONObject;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class Sudint {
    public final Sudnew Sudbyte;
    public boolean Sudcase;
    public long Sudchar;
    public int Suddo;
    public final long Sudfor;
    public String Sudif;
    public long Sudlong;
    public final String Sudnew;
    public final String Sudtry;
    public final Sudfor Sudelse = new Sudfor(this);
    public final Handler Sudgoto = new Handler(Looper.getMainLooper());
    public final String Sudint = "volc";

    public Sudint(long j, String str, String str2, Sudnew sudnew) {
        this.Sudfor = j;
        this.Sudnew = str;
        this.Sudtry = str2;
        this.Sudbyte = sudnew;
    }

    public final void Suddo() {
        String str;
        ymg0 ymg0Var;
        g8g0 g8g0Var;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.Sudchar;
        this.Sudchar = SystemClock.elapsedRealtime();
        if (jElapsedRealtime > 60000) {
            return;
        }
        long j = this.Sudlong + jElapsedRealtime;
        this.Sudlong = j;
        int i = this.Suddo + 1;
        this.Suddo = i;
        String str2 = this.Sudif;
        long j2 = this.Sudfor;
        String str3 = this.Sudint;
        String str4 = this.Sudnew;
        String str5 = this.Sudtry;
        long j3 = (j + 999) / 1000;
        Sudif sudif = (Sudif) this.Sudbyte;
        String str6 = sudif.Sudif;
        asg0 asg0Var = mlg0.e;
        if (asg0Var == null || (ymg0Var = asg0Var.c) == null || (g8g0Var = ymg0Var.p) == null || (str = g8g0Var.a) == null) {
            str = null;
        }
        String str7 = str;
        if (TextUtils.isEmpty(str7)) {
            SudLogger.m10040w(sudif.Suddo, "error onReportDuration error because url is null");
            LogUtils.file("CommonAsrBillingListener", "error onReportDuration error because url is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("seq_no", i);
            jSONObject.put("session_id", str2);
            jSONObject.put("app_id", str6);
            jSONObject.put("mg_id", j2);
            jSONObject.put("platform", 2);
            jSONObject.put("csp", str3);
            jSONObject.put("user_id", str4);
            jSONObject.put("room_id", str5);
            jSONObject.put("duration", j3);
        } catch (Exception e) {
            LogUtils.file("error:" + LogUtils.getErrorInfo(e));
            e.printStackTrace();
        }
        mlg0.b.m6437l(str7, jSONObject.toString(), null, new Suddo(), null);
    }
}
