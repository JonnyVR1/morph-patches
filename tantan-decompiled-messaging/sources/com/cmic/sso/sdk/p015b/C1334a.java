package com.cmic.sso.sdk.p015b;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.SubscriptionManager;
import com.clevertap.android.sdk.Constants;
import com.cmic.sso.sdk.p022e.C1363c;
import com.cmic.sso.sdk.p022e.C1373m;

/* JADX INFO: renamed from: com.cmic.sso.sdk.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C1334a {

    /* JADX INFO: renamed from: a */
    private static C1334a f5551a;

    /* JADX INFO: renamed from: b */
    private static long f5552b;

    /* JADX INFO: renamed from: c */
    private a f5553c = null;

    private C1334a() {
    }

    /* JADX INFO: renamed from: a */
    private void m7075a(Context context) {
        SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(context.getApplicationContext());
        if (subscriptionManagerFrom != null) {
            try {
                if (this.f5553c.f5554a == -1) {
                    this.f5553c.f5555b = SubscriptionManager.getDefaultDataSubscriptionId();
                    C1363c.m7234b("UMCTelephonyManagement", "android 7.0及以上手机getDefaultDataSubscriptionId适配成功: dataSubId = " + this.f5553c.f5555b);
                    return;
                }
            } catch (Exception unused) {
                C1363c.m7232a("UMCTelephonyManagement", "android 7.0及以上手机getDefaultDataSubscriptionId适配失败");
            }
            try {
                Object objInvoke = subscriptionManagerFrom.getClass().getMethod("getDefaultDataSubId", null).invoke(subscriptionManagerFrom, null);
                if ((objInvoke instanceof Integer) || (objInvoke instanceof Long)) {
                    this.f5553c.f5555b = ((Integer) objInvoke).intValue();
                    C1363c.m7234b("UMCTelephonyManagement", "android 7.0以下手机getDefaultDataSubId适配成功: dataSubId = " + this.f5553c.f5555b);
                    return;
                }
            } catch (Exception unused2) {
                C1363c.m7232a("UMCTelephonyManagement", "readDefaultDataSubId-->getDefaultDataSubId 反射出错");
            }
            try {
                Object objInvoke2 = subscriptionManagerFrom.getClass().getMethod("getDefaultDataSubscriptionId", null).invoke(subscriptionManagerFrom, null);
                if ((objInvoke2 instanceof Integer) || (objInvoke2 instanceof Long)) {
                    this.f5553c.f5555b = ((Integer) objInvoke2).intValue();
                    C1363c.m7234b("UMCTelephonyManagement", "反射getDefaultDataSubscriptionId适配成功: dataSubId = " + this.f5553c.f5555b);
                }
            } catch (Exception unused3) {
                C1363c.m7232a("UMCTelephonyManagement", "getDefaultDataSubscriptionId-->getDefaultDataSubscriptionId 反射出错");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7076b(Context context) {
        C1363c.m7234b("UMCTelephonyManagement", "readSimInfoDbStart");
        Uri uri = Uri.parse("content://telephony/siminfo");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{"_id", "sim_id"}, "sim_id>=?", new String[]{"0"}, null);
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndex("sim_id"));
                        int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                        if (this.f5553c.f5554a == -1 && this.f5553c.f5555b != -1 && this.f5553c.f5555b == i2) {
                            this.f5553c.f5554a = i;
                            C1363c.m7234b("UMCTelephonyManagement", "通过读取sim db获取数据流量卡的卡槽值：" + i);
                        }
                        if (this.f5553c.f5554a == i) {
                            this.f5553c.f5555b = i2;
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception unused) {
                C1363c.m7232a("UMCTelephonyManagement", "readSimInfoDb error");
                if (cursorQuery != null) {
                }
            }
            C1363c.m7234b("UMCTelephonyManagement", "readSimInfoDbEnd");
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: com.cmic.sso.sdk.b.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private int f5554a = -1;

        /* JADX INFO: renamed from: b */
        private int f5555b = -1;

        /* JADX INFO: renamed from: a */
        public int m7083a() {
            return this.f5555b;
        }
    }

    /* JADX INFO: renamed from: b */
    public a m7078b() {
        a aVar = this.f5553c;
        return aVar == null ? new a() : aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m7077a(Context context, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis() - f5552b;
        if (jCurrentTimeMillis >= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS || jCurrentTimeMillis <= 0) {
            this.f5553c = new a();
            if (z) {
                m7075a(context);
                if ((C1373m.m7297e() || C1373m.m7298f()) && C1373m.m7296d()) {
                    C1363c.m7234b("UMCTelephonyManagement", "华为手机兼容性处理");
                    if (this.f5553c.f5555b == 0 || this.f5553c.f5555b == 1) {
                        if (this.f5553c.f5554a == -1) {
                            a aVar = this.f5553c;
                            aVar.f5554a = aVar.f5555b;
                        }
                        this.f5553c.f5555b = -1;
                    }
                    if (this.f5553c.f5554a != -1 || this.f5553c.f5555b != -1) {
                        m7076b(context);
                    }
                }
                f5552b = System.currentTimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1334a m7074a() {
        if (f5551a == null) {
            f5551a = new C1334a();
        }
        return f5551a;
    }
}
