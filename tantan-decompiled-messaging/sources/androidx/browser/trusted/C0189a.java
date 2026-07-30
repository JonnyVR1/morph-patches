package androidx.browser.trusted;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;
import p149l.qhg0;

/* JADX INFO: renamed from: androidx.browser.trusted.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0189a {

    /* JADX INFO: renamed from: androidx.browser.trusted.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Parcelable[] f946a;

        public a(Parcelable[] parcelableArr) {
            this.f946a = parcelableArr;
        }

        /* JADX INFO: renamed from: a */
        public Bundle m833a() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f946a);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.browser.trusted.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f947a;

        /* JADX INFO: renamed from: b */
        public final int f948b;

        public b(String str, int i) {
            this.f947a = str;
            this.f948b = i;
        }

        /* JADX INFO: renamed from: a */
        public static b m834a(Bundle bundle) {
            C0189a.m832a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            C0189a.m832a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new b(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    /* JADX INFO: renamed from: androidx.browser.trusted.a$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final String f949a;

        public c(String str) {
            this.f949a = str;
        }

        /* JADX INFO: renamed from: a */
        public static c m835a(Bundle bundle) {
            C0189a.m832a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new c(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* JADX INFO: renamed from: androidx.browser.trusted.a$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final String f950a;

        /* JADX INFO: renamed from: b */
        public final int f951b;

        /* JADX INFO: renamed from: c */
        public final Notification f952c;

        /* JADX INFO: renamed from: d */
        public final String f953d;

        public d(String str, int i, Notification notification, String str2) {
            this.f950a = str;
            this.f951b = i;
            this.f952c = notification;
            this.f953d = str2;
        }

        /* JADX INFO: renamed from: a */
        public static d m836a(Bundle bundle) {
            C0189a.m832a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            C0189a.m832a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            C0189a.m832a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            C0189a.m832a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new d(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* JADX INFO: renamed from: androidx.browser.trusted.a$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final boolean f954a;

        public e(boolean z) {
            this.f954a = z;
        }

        /* JADX INFO: renamed from: a */
        public Bundle m837a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f954a);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m832a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        qhg0.m174539a("Bundle must contain ", str);
    }
}
