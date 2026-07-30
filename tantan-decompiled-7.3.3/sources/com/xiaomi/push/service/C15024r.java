package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import p153l.bvq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.r */
/* JADX INFO: loaded from: classes2.dex */
public class C15024r {

    /* JADX INFO: renamed from: a */
    private static C15024r f63946a;

    /* JADX INFO: renamed from: a */
    private Context f63947a;

    /* JADX INFO: renamed from: a */
    private List<String> f63948a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final List<String> f63949b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final List<String> f63950c = new ArrayList();

    private C15024r(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f63947a = applicationContext;
        if (applicationContext == null) {
            this.f63947a = context;
        }
        SharedPreferences sharedPreferences = this.f63947a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(Constants.SEPARATOR_COMMA)) {
            if (TextUtils.isEmpty(str)) {
                this.f63948a.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(Constants.SEPARATOR_COMMA)) {
            if (!TextUtils.isEmpty(str2)) {
                this.f63949b.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(Constants.SEPARATOR_COMMA)) {
            if (!TextUtils.isEmpty(str3)) {
                this.f63950c.add(str3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87947a(String str) {
        synchronized (this.f63948a) {
            try {
                if (!this.f63948a.contains(str)) {
                    this.f63948a.add(str);
                    this.f63947a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", bvq0.m106590d(this.f63948a, Constants.SEPARATOR_COMMA)).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m87949b(String str) {
        synchronized (this.f63949b) {
            try {
                if (!this.f63949b.contains(str)) {
                    this.f63949b.add(str);
                    this.f63947a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", bvq0.m106590d(this.f63949b, Constants.SEPARATOR_COMMA)).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m87951c(String str) {
        synchronized (this.f63950c) {
            try {
                if (!this.f63950c.contains(str)) {
                    this.f63950c.add(str);
                    this.f63947a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", bvq0.m106590d(this.f63950c, Constants.SEPARATOR_COMMA)).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m87953d(String str) {
        synchronized (this.f63948a) {
            try {
                if (this.f63948a.contains(str)) {
                    this.f63948a.remove(str);
                    this.f63947a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", bvq0.m106590d(this.f63948a, Constants.SEPARATOR_COMMA)).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m87954e(String str) {
        synchronized (this.f63949b) {
            try {
                if (this.f63949b.contains(str)) {
                    this.f63949b.remove(str);
                    this.f63947a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", bvq0.m106590d(this.f63949b, Constants.SEPARATOR_COMMA)).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m87955f(String str) {
        synchronized (this.f63950c) {
            try {
                if (this.f63950c.contains(str)) {
                    this.f63950c.remove(str);
                    this.f63947a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", bvq0.m106590d(this.f63950c, Constants.SEPARATOR_COMMA)).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m87948a(String str) {
        boolean zContains;
        synchronized (this.f63948a) {
            zContains = this.f63948a.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: b */
    public boolean m87950b(String str) {
        boolean zContains;
        synchronized (this.f63949b) {
            zContains = this.f63949b.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: c */
    public boolean m87952c(String str) {
        boolean zContains;
        synchronized (this.f63950c) {
            zContains = this.f63950c.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: a */
    public static C15024r m87946a(Context context) {
        if (f63946a == null) {
            f63946a = new C15024r(context);
        }
        return f63946a;
    }
}
