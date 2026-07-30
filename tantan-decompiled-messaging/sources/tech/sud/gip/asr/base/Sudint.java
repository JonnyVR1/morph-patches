package tech.sud.gip.asr.base;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import org.json.JSONObject;
import p149l.asg0;
import p149l.g8g0;
import p149l.mlg0;
import p149l.ymg0;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Sudint {
    public final Sudnew Sudbyte;
    public boolean Sudcase;

    /* JADX INFO: renamed from: Sudchar, reason: collision with root package name */
    public long f210123Sudchar;

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public int f210124Suddo;
    public final long Sudfor;

    /* JADX INFO: renamed from: Sudif, reason: collision with root package name */
    public String f210125Sudif;
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
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f210123Sudchar;
        this.f210123Sudchar = SystemClock.elapsedRealtime();
        if (jElapsedRealtime > Constants.ONE_MIN_IN_MILLIS) {
            return;
        }
        long j = this.Sudlong + jElapsedRealtime;
        this.Sudlong = j;
        int i = this.f210124Suddo + 1;
        this.f210124Suddo = i;
        String str2 = this.f210125Sudif;
        long j2 = this.Sudfor;
        String str3 = this.Sudint;
        String str4 = this.Sudnew;
        String str5 = this.Sudtry;
        long j3 = (j + 999) / 1000;
        Sudif sudif = (Sudif) this.Sudbyte;
        String str6 = sudif.f210122Sudif;
        asg0 asg0Var = mlg0.f134430e;
        if (asg0Var == null || (ymg0Var = asg0Var.f71451c) == null || (g8g0Var = ymg0Var.f199014p) == null || (str = g8g0Var.f101495a) == null) {
            str = null;
        }
        String str7 = str;
        if (TextUtils.isEmpty(str7)) {
            SudLogger.m221573w(sudif.f210121Suddo, "error onReportDuration error because url is null");
            LogUtils.file("CommonAsrBillingListener", "error onReportDuration error because url is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("seq_no", i);
            jSONObject.put("session_id", str2);
            jSONObject.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str6);
            jSONObject.put("mg_id", j2);
            jSONObject.put("platform", 2);
            jSONObject.put("csp", str3);
            jSONObject.put("user_id", str4);
            jSONObject.put("room_id", str5);
            jSONObject.put(BLiveOperationTitleShowType.duration, j3);
        } catch (Exception e) {
            LogUtils.file("error:" + LogUtils.getErrorInfo(e));
            e.printStackTrace();
        }
        mlg0.f134427b.m155908l(str7, jSONObject.toString(), null, new Suddo(), null);
    }
}
