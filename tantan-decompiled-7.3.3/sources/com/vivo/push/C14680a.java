package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivo.push.util.C14795p;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.vivo.push.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14680a {

    /* JADX INFO: renamed from: a */
    private Bundle f61737a;

    /* JADX INFO: renamed from: b */
    private String f61738b;

    /* JADX INFO: renamed from: c */
    private String f61739c;

    public C14680a(String str, String str2, Bundle bundle) {
        this.f61738b = str;
        this.f61739c = str2;
        this.f61737a = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX INFO: renamed from: a */
    public static C14680a m85881a(Intent intent) {
        String string;
        if (intent == null) {
            C14795p.m86179a("BundleWapper", "create error : intent is null");
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
            C14795p.m86186b("BundleWapper", "create warning: pkgName is null");
        }
        String str = intent.getPackage();
        if (TextUtils.isEmpty(str)) {
            String packageName = intent.getComponent() != null ? intent.getComponent().getPackageName() : null;
            if (TextUtils.isEmpty(packageName)) {
                C14795p.m86186b("BundleWapper", "create warning: targetPkgName is null");
            }
            str = packageName;
        }
        return new C14680a(string, str, extras);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m85894b(String str) {
        Bundle bundle = this.f61737a;
        if (bundle == null) {
            return null;
        }
        return bundle.getByteArray(str);
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList<String> m85895c(String str) {
        Bundle bundle = this.f61737a;
        if (bundle == null) {
            return null;
        }
        return bundle.getStringArrayList(str);
    }

    /* JADX INFO: renamed from: d */
    public final Serializable m85896d(String str) {
        Bundle bundle = this.f61737a;
        if (bundle == null) {
            return null;
        }
        return bundle.getSerializable(str);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m85897e(String str) {
        Bundle bundle = this.f61737a;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(str, false);
    }

    /* JADX INFO: renamed from: b */
    public final int m85891b(String str, int i) {
        Bundle bundle = this.f61737a;
        return bundle == null ? i : bundle.getInt(str, i);
    }

    /* JADX INFO: renamed from: b */
    public final long m85892b(String str, long j) {
        Bundle bundle = this.f61737a;
        return bundle == null ? j : bundle.getLong(str, j);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m85893b() {
        return this.f61737a;
    }

    /* JADX INFO: renamed from: a */
    public final void m85884a(String str, int i) {
        if (this.f61737a == null) {
            this.f61737a = new Bundle();
        }
        this.f61737a.putInt(str, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m85885a(String str, long j) {
        if (this.f61737a == null) {
            this.f61737a = new Bundle();
        }
        this.f61737a.putLong(str, j);
    }

    /* JADX INFO: renamed from: a */
    public final void m85887a(String str, String str2) {
        if (this.f61737a == null) {
            this.f61737a = new Bundle();
        }
        this.f61737a.putString(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m85890a(String str, byte[] bArr) {
        if (this.f61737a == null) {
            this.f61737a = new Bundle();
        }
        this.f61737a.putByteArray(str, bArr);
    }

    /* JADX INFO: renamed from: a */
    public final void m85886a(String str, Serializable serializable) {
        if (this.f61737a == null) {
            this.f61737a = new Bundle();
        }
        this.f61737a.putSerializable(str, serializable);
    }

    /* JADX INFO: renamed from: a */
    public final void m85889a(String str, boolean z) {
        if (this.f61737a == null) {
            this.f61737a = new Bundle();
        }
        this.f61737a.putBoolean(str, z);
    }

    /* JADX INFO: renamed from: a */
    public final void m85888a(String str, ArrayList<String> arrayList) {
        if (this.f61737a == null) {
            this.f61737a = new Bundle();
        }
        this.f61737a.putStringArrayList(str, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final String m85883a(String str) {
        Bundle bundle = this.f61737a;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    /* JADX INFO: renamed from: a */
    public final String m85882a() {
        return this.f61738b;
    }
}
