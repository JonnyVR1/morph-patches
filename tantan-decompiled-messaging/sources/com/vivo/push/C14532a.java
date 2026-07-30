package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivo.push.util.C14647p;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.vivo.push.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14532a {

    /* JADX INFO: renamed from: a */
    private Bundle f60890a;

    /* JADX INFO: renamed from: b */
    private String f60891b;

    /* JADX INFO: renamed from: c */
    private String f60892c;

    public C14532a(String str, String str2, Bundle bundle) {
        this.f60891b = str;
        this.f60892c = str2;
        this.f60890a = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX INFO: renamed from: a */
    public static C14532a m84710a(Intent intent) {
        String string;
        if (intent == null) {
            C14647p.m85008a("BundleWapper", "create error : intent is null");
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            string = extras.getString("client_pkgname");
            if (TextUtils.isEmpty(string)) {
                string = null;
            }
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            C14647p.m85015b("BundleWapper", "create warning: pkgName is null");
        }
        String str = intent.getPackage();
        if (TextUtils.isEmpty(str)) {
            String packageName = intent.getComponent() != null ? intent.getComponent().getPackageName() : null;
            if (TextUtils.isEmpty(packageName)) {
                C14647p.m85015b("BundleWapper", "create warning: targetPkgName is null");
            }
            str = packageName;
        }
        return new C14532a(string, str, extras);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m84723b(String str) {
        Bundle bundle = this.f60890a;
        if (bundle == null) {
            return null;
        }
        return bundle.getByteArray(str);
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList<String> m84724c(String str) {
        Bundle bundle = this.f60890a;
        if (bundle == null) {
            return null;
        }
        return bundle.getStringArrayList(str);
    }

    /* JADX INFO: renamed from: d */
    public final Serializable m84725d(String str) {
        Bundle bundle = this.f60890a;
        if (bundle == null) {
            return null;
        }
        return bundle.getSerializable(str);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m84726e(String str) {
        Bundle bundle = this.f60890a;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(str, false);
    }

    /* JADX INFO: renamed from: b */
    public final int m84720b(String str, int i) {
        Bundle bundle = this.f60890a;
        return bundle == null ? i : bundle.getInt(str, i);
    }

    /* JADX INFO: renamed from: b */
    public final long m84721b(String str, long j) {
        Bundle bundle = this.f60890a;
        return bundle == null ? j : bundle.getLong(str, j);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m84722b() {
        return this.f60890a;
    }

    /* JADX INFO: renamed from: a */
    public final void m84713a(String str, int i) {
        if (this.f60890a == null) {
            this.f60890a = new Bundle();
        }
        this.f60890a.putInt(str, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m84714a(String str, long j) {
        if (this.f60890a == null) {
            this.f60890a = new Bundle();
        }
        this.f60890a.putLong(str, j);
    }

    /* JADX INFO: renamed from: a */
    public final void m84716a(String str, String str2) {
        if (this.f60890a == null) {
            this.f60890a = new Bundle();
        }
        this.f60890a.putString(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m84719a(String str, byte[] bArr) {
        if (this.f60890a == null) {
            this.f60890a = new Bundle();
        }
        this.f60890a.putByteArray(str, bArr);
    }

    /* JADX INFO: renamed from: a */
    public final void m84715a(String str, Serializable serializable) {
        if (this.f60890a == null) {
            this.f60890a = new Bundle();
        }
        this.f60890a.putSerializable(str, serializable);
    }

    /* JADX INFO: renamed from: a */
    public final void m84718a(String str, boolean z) {
        if (this.f60890a == null) {
            this.f60890a = new Bundle();
        }
        this.f60890a.putBoolean(str, z);
    }

    /* JADX INFO: renamed from: a */
    public final void m84717a(String str, ArrayList<String> arrayList) {
        if (this.f60890a == null) {
            this.f60890a = new Bundle();
        }
        this.f60890a.putStringArrayList(str, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final String m84712a(String str) {
        Bundle bundle = this.f60890a;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    /* JADX INFO: renamed from: a */
    public final String m84711a() {
        return this.f60891b;
    }
}
