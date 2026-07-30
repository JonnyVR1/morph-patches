package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import p149l.vlq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.r */
/* JADX INFO: loaded from: classes2.dex */
public class C14876r {

    /* JADX INFO: renamed from: a */
    private static C14876r f63099a;

    /* JADX INFO: renamed from: a */
    private Context f63100a;

    /* JADX INFO: renamed from: a */
    private List<String> f63101a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final List<String> f63102b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final List<String> f63103c = new ArrayList();

    private C14876r(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f63100a = applicationContext;
        if (applicationContext == null) {
            this.f63100a = context;
        }
        SharedPreferences sharedPreferences = this.f63100a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(Constants.SEPARATOR_COMMA)) {
            if (TextUtils.isEmpty(str)) {
                this.f63101a.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(Constants.SEPARATOR_COMMA)) {
            if (!TextUtils.isEmpty(str2)) {
                this.f63102b.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(Constants.SEPARATOR_COMMA)) {
            if (!TextUtils.isEmpty(str3)) {
                this.f63103c.add(str3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86776a(String str) {
        synchronized (this.f63101a) {
            try {
                if (!this.f63101a.contains(str)) {
                    this.f63101a.add(str);
                    this.f63100a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", vlq0.m198841d(this.f63101a, Constants.SEPARATOR_COMMA)).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m86778b(String str) {
        synchronized (this.f63102b) {
            try {
                if (!this.f63102b.contains(str)) {
                    this.f63102b.add(str);
                    this.f63100a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", vlq0.m198841d(this.f63102b, Constants.SEPARATOR_COMMA)).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m86780c(String str) {
        synchronized (this.f63103c) {
            try {
                if (!this.f63103c.contains(str)) {
                    this.f63103c.add(str);
                    this.f63100a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", vlq0.m198841d(this.f63103c, Constants.SEPARATOR_COMMA)).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m86782d(String str) {
        synchronized (this.f63101a) {
            try {
                if (this.f63101a.contains(str)) {
                    this.f63101a.remove(str);
                    this.f63100a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", vlq0.m198841d(this.f63101a, Constants.SEPARATOR_COMMA)).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m86783e(String str) {
        synchronized (this.f63102b) {
            try {
                if (this.f63102b.contains(str)) {
                    this.f63102b.remove(str);
                    this.f63100a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", vlq0.m198841d(this.f63102b, Constants.SEPARATOR_COMMA)).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m86784f(String str) {
        synchronized (this.f63103c) {
            try {
                if (this.f63103c.contains(str)) {
                    this.f63103c.remove(str);
                    this.f63100a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", vlq0.m198841d(this.f63103c, Constants.SEPARATOR_COMMA)).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m86777a(String str) {
        boolean zContains;
        synchronized (this.f63101a) {
            zContains = this.f63101a.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: b */
    public boolean m86779b(String str) {
        boolean zContains;
        synchronized (this.f63102b) {
            zContains = this.f63102b.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: c */
    public boolean m86781c(String str) {
        boolean zContains;
        synchronized (this.f63103c) {
            zContains = this.f63103c.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: a */
    public static C14876r m86775a(Context context) {
        if (f63099a == null) {
            f63099a = new C14876r(context);
        }
        return f63099a;
    }
}
