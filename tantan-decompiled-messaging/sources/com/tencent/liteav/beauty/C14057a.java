package com.tencent.liteav.beauty;

import android.content.Context;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14057a {

    /* JADX INFO: renamed from: A */
    private static boolean f58528A = false;

    /* JADX INFO: renamed from: B */
    private static boolean f58529B = false;

    /* JADX INFO: renamed from: C */
    private static boolean f58530C = false;

    /* JADX INFO: renamed from: D */
    private static boolean f58531D = false;

    /* JADX INFO: renamed from: E */
    private static boolean f58532E = false;

    /* JADX INFO: renamed from: a */
    private static C14057a f58533a = null;

    /* JADX INFO: renamed from: b */
    private static Context f58534b = null;

    /* JADX INFO: renamed from: c */
    private static boolean f58535c = false;

    /* JADX INFO: renamed from: d */
    private static boolean f58536d = false;

    /* JADX INFO: renamed from: e */
    private static boolean f58537e = false;

    /* JADX INFO: renamed from: f */
    private static boolean f58538f = false;

    /* JADX INFO: renamed from: g */
    private static boolean f58539g = false;

    /* JADX INFO: renamed from: h */
    private static boolean f58540h = false;

    /* JADX INFO: renamed from: i */
    private static boolean f58541i = false;

    /* JADX INFO: renamed from: j */
    private static boolean f58542j = false;

    /* JADX INFO: renamed from: k */
    private static boolean f58543k = false;

    /* JADX INFO: renamed from: l */
    private static boolean f58544l = false;

    /* JADX INFO: renamed from: m */
    private static boolean f58545m = false;

    /* JADX INFO: renamed from: n */
    private static boolean f58546n = false;

    /* JADX INFO: renamed from: o */
    private static boolean f58547o = false;

    /* JADX INFO: renamed from: p */
    private static boolean f58548p = false;

    /* JADX INFO: renamed from: q */
    private static boolean f58549q = false;

    /* JADX INFO: renamed from: r */
    private static boolean f58550r = false;

    /* JADX INFO: renamed from: s */
    private static boolean f58551s = false;

    /* JADX INFO: renamed from: t */
    private static boolean f58552t = false;

    /* JADX INFO: renamed from: u */
    private static boolean f58553u = false;

    /* JADX INFO: renamed from: v */
    private static boolean f58554v = false;

    /* JADX INFO: renamed from: w */
    private static boolean f58555w = false;

    /* JADX INFO: renamed from: x */
    private static boolean f58556x = false;

    /* JADX INFO: renamed from: y */
    private static boolean f58557y = false;

    /* JADX INFO: renamed from: z */
    private static boolean f58558z = false;

    /* JADX INFO: renamed from: F */
    private String f58559F = "ReportDuaManage";

    /* JADX INFO: renamed from: h */
    private void m83067h() {
        TXCLog.m82969i(this.f58559F, "resetReportState");
        f58535c = false;
        f58536d = false;
        f58537e = false;
        f58538f = false;
        f58539g = false;
        f58540h = false;
        f58541i = false;
        f58542j = false;
        f58543k = false;
        f58544l = false;
        f58545m = false;
        f58546n = false;
        f58530C = false;
        f58547o = false;
        f58548p = false;
        f58549q = false;
        f58550r = false;
        f58551s = false;
        f58552t = false;
        f58553u = false;
        f58554v = false;
        f58555w = false;
        f58556x = false;
        f58557y = false;
        f58558z = false;
        f58528A = false;
        f58529B = false;
        f58531D = false;
        f58532E = false;
    }

    /* JADX INFO: renamed from: a */
    public void m83068a(Context context) {
        m83067h();
        f58534b = context.getApplicationContext();
        if (!f58535c) {
            TXCLog.m82969i(this.f58559F, "reportSDKInit");
            TXCDRApi.txReportDAU(f58534b, TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, 0, "reportSDKInit!");
        }
        f58535c = true;
    }

    /* JADX INFO: renamed from: b */
    public void m83069b() {
        if (!f58536d) {
            TXCLog.m82969i(this.f58559F, "reportBeautyDua");
            TXCDRApi.txReportDAU(f58534b, TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY, 0, "reportBeautyDua");
        }
        f58536d = true;
    }

    /* JADX INFO: renamed from: c */
    public void m83070c() {
        if (!f58537e) {
            TXCLog.m82969i(this.f58559F, "reportWhiteDua");
            TXCDRApi.txReportDAU(f58534b, TXLiteAVCode.WARNING_MICROPHONE_NOT_AUTHORIZED, 0, "reportWhiteDua");
        }
        f58537e = true;
    }

    /* JADX INFO: renamed from: d */
    public void m83071d() {
        if (!f58538f) {
            TXCLog.m82969i(this.f58559F, "reportRuddyDua");
            TXCDRApi.txReportDAU(f58534b, TXLiteAVCode.WARNING_MICROPHONE_DEVICE_ABNORMAL, 0, "reportRuddyDua");
        }
        f58538f = true;
    }

    /* JADX INFO: renamed from: e */
    public void m83072e() {
        if (!f58542j) {
            TXCLog.m82969i(this.f58559F, "reportFilterImageDua");
            TXCDRApi.txReportDAU(f58534b, 1208, 0, "reportFilterImageDua");
        }
        f58542j = true;
    }

    /* JADX INFO: renamed from: f */
    public void m83073f() {
        if (!f58544l) {
            TXCLog.m82969i(this.f58559F, "reportSharpDua");
            TXCDRApi.txReportDAU(f58534b, 1210, 0, "reportSharpDua");
        }
        f58544l = true;
    }

    /* JADX INFO: renamed from: g */
    public void m83074g() {
        if (!f58546n) {
            TXCLog.m82969i(this.f58559F, "reportWarterMarkDua");
            TXCDRApi.txReportDAU(f58534b, 1212, 0, "reportWarterMarkDua");
        }
        f58546n = true;
    }

    /* JADX INFO: renamed from: a */
    public static C14057a m83066a() {
        if (f58533a == null) {
            f58533a = new C14057a();
        }
        return f58533a;
    }
}
