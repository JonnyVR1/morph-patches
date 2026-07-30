package com.cmic.sso.sdk.p016b;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.SubscriptionManager;
import com.clevertap.android.sdk.Constants;
import com.cmic.sso.sdk.p023e.C1386c;
import com.cmic.sso.sdk.p023e.C1396m;

/* JADX INFO: renamed from: com.cmic.sso.sdk.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C1357a {

    /* JADX INFO: renamed from: a */
    private static C1357a f5588a;

    /* JADX INFO: renamed from: b */
    private static long f5589b;

    /* JADX INFO: renamed from: c */
    private a f5590c = null;

    private C1357a() {
    }

    /* JADX INFO: renamed from: a */
    private void m7129a(Context context) {
        SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(context.getApplicationContext());
        if (subscriptionManagerFrom != null) {
            try {
                if (this.f5590c.f5591a == -1) {
                    this.f5590c.f5592b = SubscriptionManager.getDefaultDataSubscriptionId();
                    C1386c.m7288b("UMCTelephonyManagement", "android 7.0及以上手机getDefaultDataSubscriptionId适配成功: dataSubId = " + this.f5590c.f5592b);
                    return;
                }
            } catch (Exception unused) {
                C1386c.m7286a("UMCTelephonyManagement", "android 7.0及以上手机getDefaultDataSubscriptionId适配失败");
            }
            try {
                Object objInvoke = subscriptionManagerFrom.getClass().getMethod("getDefaultDataSubId", null).invoke(subscriptionManagerFrom, null);
                if ((objInvoke instanceof Integer) || (objInvoke instanceof Long)) {
                    this.f5590c.f5592b = ((Integer) objInvoke).intValue();
                    C1386c.m7288b("UMCTelephonyManagement", "android 7.0以下手机getDefaultDataSubId适配成功: dataSubId = " + this.f5590c.f5592b);
                    return;
                }
            } catch (Exception unused2) {
                C1386c.m7286a("UMCTelephonyManagement", "readDefaultDataSubId-->getDefaultDataSubId 反射出错");
            }
            try {
                Object objInvoke2 = subscriptionManagerFrom.getClass().getMethod("getDefaultDataSubscriptionId", null).invoke(subscriptionManagerFrom, null);
                if ((objInvoke2 instanceof Integer) || (objInvoke2 instanceof Long)) {
                    this.f5590c.f5592b = ((Integer) objInvoke2).intValue();
                    C1386c.m7288b("UMCTelephonyManagement", "反射getDefaultDataSubscriptionId适配成功: dataSubId = " + this.f5590c.f5592b);
                }
            } catch (Exception unused3) {
                C1386c.m7286a("UMCTelephonyManagement", "getDefaultDataSubscriptionId-->getDefaultDataSubscriptionId 反射出错");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7130b(Context context) {
        C1386c.m7288b("UMCTelephonyManagement", "readSimInfoDbStart");
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
                        if (this.f5590c.f5591a == -1 && this.f5590c.f5592b != -1 && this.f5590c.f5592b == i2) {
                            this.f5590c.f5591a = i;
                            C1386c.m7288b("UMCTelephonyManagement", "通过读取sim db获取数据流量卡的卡槽值：" + i);
                        }
                        if (this.f5590c.f5591a == i) {
                            this.f5590c.f5592b = i2;
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception unused) {
                C1386c.m7286a("UMCTelephonyManagement", "readSimInfoDb error");
                if (cursorQuery != null) {
                }
            }
            C1386c.m7288b("UMCTelephonyManagement", "readSimInfoDbEnd");
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
        private int f5591a = -1;

        /* JADX INFO: renamed from: b */
        private int f5592b = -1;

        /* JADX INFO: renamed from: a */
        public int m7137a() {
            return this.f5592b;
        }
    }

    /* JADX INFO: renamed from: b */
    public a m7132b() {
        a aVar = this.f5590c;
        return aVar == null ? new a() : aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m7131a(Context context, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis() - f5589b;
        if (jCurrentTimeMillis >= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS || jCurrentTimeMillis <= 0) {
            this.f5590c = new a();
            if (z) {
                m7129a(context);
                if ((C1396m.m7351e() || C1396m.m7352f()) && C1396m.m7350d()) {
                    C1386c.m7288b("UMCTelephonyManagement", "华为手机兼容性处理");
                    if (this.f5590c.f5592b == 0 || this.f5590c.f5592b == 1) {
                        if (this.f5590c.f5591a == -1) {
                            a aVar = this.f5590c;
                            aVar.f5591a = aVar.f5592b;
                        }
                        this.f5590c.f5592b = -1;
                    }
                    if (this.f5590c.f5591a != -1 || this.f5590c.f5592b != -1) {
                        m7130b(context);
                    }
                }
                f5589b = System.currentTimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1357a m7128a() {
        if (f5588a == null) {
            f5588a = new C1357a();
        }
        return f5588a;
    }
}
