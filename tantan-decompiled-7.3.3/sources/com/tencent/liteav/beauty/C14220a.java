package com.tencent.liteav.beauty;

import android.content.Context;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14220a {

    /* JADX INFO: renamed from: A */
    private static boolean f59376A = false;

    /* JADX INFO: renamed from: B */
    private static boolean f59377B = false;

    /* JADX INFO: renamed from: C */
    private static boolean f59378C = false;

    /* JADX INFO: renamed from: D */
    private static boolean f59379D = false;

    /* JADX INFO: renamed from: E */
    private static boolean f59380E = false;

    /* JADX INFO: renamed from: a */
    private static C14220a f59381a = null;

    /* JADX INFO: renamed from: b */
    private static Context f59382b = null;

    /* JADX INFO: renamed from: c */
    private static boolean f59383c = false;

    /* JADX INFO: renamed from: d */
    private static boolean f59384d = false;

    /* JADX INFO: renamed from: e */
    private static boolean f59385e = false;

    /* JADX INFO: renamed from: f */
    private static boolean f59386f = false;

    /* JADX INFO: renamed from: g */
    private static boolean f59387g = false;

    /* JADX INFO: renamed from: h */
    private static boolean f59388h = false;

    /* JADX INFO: renamed from: i */
    private static boolean f59389i = false;

    /* JADX INFO: renamed from: j */
    private static boolean f59390j = false;

    /* JADX INFO: renamed from: k */
    private static boolean f59391k = false;

    /* JADX INFO: renamed from: l */
    private static boolean f59392l = false;

    /* JADX INFO: renamed from: m */
    private static boolean f59393m = false;

    /* JADX INFO: renamed from: n */
    private static boolean f59394n = false;

    /* JADX INFO: renamed from: o */
    private static boolean f59395o = false;

    /* JADX INFO: renamed from: p */
    private static boolean f59396p = false;

    /* JADX INFO: renamed from: q */
    private static boolean f59397q = false;

    /* JADX INFO: renamed from: r */
    private static boolean f59398r = false;

    /* JADX INFO: renamed from: s */
    private static boolean f59399s = false;

    /* JADX INFO: renamed from: t */
    private static boolean f59400t = false;

    /* JADX INFO: renamed from: u */
    private static boolean f59401u = false;

    /* JADX INFO: renamed from: v */
    private static boolean f59402v = false;

    /* JADX INFO: renamed from: w */
    private static boolean f59403w = false;

    /* JADX INFO: renamed from: x */
    private static boolean f59404x = false;

    /* JADX INFO: renamed from: y */
    private static boolean f59405y = false;

    /* JADX INFO: renamed from: z */
    private static boolean f59406z = false;

    /* JADX INFO: renamed from: F */
    private String f59407F = "ReportDuaManage";

    /* JADX INFO: renamed from: h */
    private void m84250h() {
        TXCLog.m84152i(this.f59407F, "resetReportState");
        f59383c = false;
        f59384d = false;
        f59385e = false;
        f59386f = false;
        f59387g = false;
        f59388h = false;
        f59389i = false;
        f59390j = false;
        f59391k = false;
        f59392l = false;
        f59393m = false;
        f59394n = false;
        f59378C = false;
        f59395o = false;
        f59396p = false;
        f59397q = false;
        f59398r = false;
        f59399s = false;
        f59400t = false;
        f59401u = false;
        f59402v = false;
        f59403w = false;
        f59404x = false;
        f59405y = false;
        f59406z = false;
        f59376A = false;
        f59377B = false;
        f59379D = false;
        f59380E = false;
    }

    /* JADX INFO: renamed from: a */
    public void m84251a(Context context) {
        m84250h();
        f59382b = context.getApplicationContext();
        if (!f59383c) {
            TXCLog.m84152i(this.f59407F, "reportSDKInit");
            TXCDRApi.txReportDAU(f59382b, TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, 0, "reportSDKInit!");
        }
        f59383c = true;
    }

    /* JADX INFO: renamed from: b */
    public void m84252b() {
        if (!f59384d) {
            TXCLog.m84152i(this.f59407F, "reportBeautyDua");
            TXCDRApi.txReportDAU(f59382b, TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY, 0, "reportBeautyDua");
        }
        f59384d = true;
    }

    /* JADX INFO: renamed from: c */
    public void m84253c() {
        if (!f59385e) {
            TXCLog.m84152i(this.f59407F, "reportWhiteDua");
            TXCDRApi.txReportDAU(f59382b, TXLiteAVCode.WARNING_MICROPHONE_NOT_AUTHORIZED, 0, "reportWhiteDua");
        }
        f59385e = true;
    }

    /* JADX INFO: renamed from: d */
    public void m84254d() {
        if (!f59386f) {
            TXCLog.m84152i(this.f59407F, "reportRuddyDua");
            TXCDRApi.txReportDAU(f59382b, TXLiteAVCode.WARNING_MICROPHONE_DEVICE_ABNORMAL, 0, "reportRuddyDua");
        }
        f59386f = true;
    }

    /* JADX INFO: renamed from: e */
    public void m84255e() {
        if (!f59390j) {
            TXCLog.m84152i(this.f59407F, "reportFilterImageDua");
            TXCDRApi.txReportDAU(f59382b, 1208, 0, "reportFilterImageDua");
        }
        f59390j = true;
    }

    /* JADX INFO: renamed from: f */
    public void m84256f() {
        if (!f59392l) {
            TXCLog.m84152i(this.f59407F, "reportSharpDua");
            TXCDRApi.txReportDAU(f59382b, 1210, 0, "reportSharpDua");
        }
        f59392l = true;
    }

    /* JADX INFO: renamed from: g */
    public void m84257g() {
        if (!f59394n) {
            TXCLog.m84152i(this.f59407F, "reportWarterMarkDua");
            TXCDRApi.txReportDAU(f59382b, 1212, 0, "reportWarterMarkDua");
        }
        f59394n = true;
    }

    /* JADX INFO: renamed from: a */
    public static C14220a m84249a() {
        if (f59381a == null) {
            f59381a = new C14220a();
        }
        return f59381a;
    }
}
