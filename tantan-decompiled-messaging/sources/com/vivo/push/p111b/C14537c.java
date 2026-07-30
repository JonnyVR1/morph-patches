package com.vivo.push.p111b;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14532a;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14651t;

/* JADX INFO: renamed from: com.vivo.push.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14537c extends AbstractC14621o {

    /* JADX INFO: renamed from: a */
    private String f60909a;

    /* JADX INFO: renamed from: b */
    private String f60910b;

    /* JADX INFO: renamed from: c */
    private long f60911c;

    /* JADX INFO: renamed from: d */
    private int f60912d;

    /* JADX INFO: renamed from: e */
    private int f60913e;

    /* JADX INFO: renamed from: f */
    private String f60914f;

    public C14537c(int i, String str) {
        super(i);
        this.f60911c = -1L;
        this.f60912d = -1;
        this.f60909a = null;
        this.f60910b = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m84747a(Context context) {
        if (this.f60912d == -1) {
            String strM84929a = this.f60910b;
            if (TextUtils.isEmpty(strM84929a)) {
                C14647p.m85008a("BaseAppCommand", "pkg name is null");
                strM84929a = m84929a();
                if (TextUtils.isEmpty(strM84929a)) {
                    C14647p.m85008a("BaseAppCommand", "src is null");
                    return -1;
                }
            }
            this.f60912d = C14651t.m85032b(context, strM84929a);
            if (!TextUtils.isEmpty(this.f60914f)) {
                this.f60912d = 2;
            }
        }
        return this.f60912d;
    }

    /* JADX INFO: renamed from: b */
    public final void m84749b(String str) {
        this.f60909a = str;
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public void mo84743c(C14532a c14532a) {
        c14532a.m84716a("req_id", this.f60909a);
        c14532a.m84716a("package_name", this.f60910b);
        c14532a.m84714a(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, 323L);
        c14532a.m84713a("PUSH_APP_STATUS", this.f60912d);
        if (TextUtils.isEmpty(this.f60914f)) {
            return;
        }
        c14532a.m84716a("BaseAppCommand.EXTRA__HYBRIDVERSION", this.f60914f);
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public void mo84744d(C14532a c14532a) {
        this.f60909a = c14532a.m84712a("req_id");
        this.f60910b = c14532a.m84712a("package_name");
        this.f60911c = c14532a.m84721b(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, 0L);
        this.f60912d = c14532a.m84720b("PUSH_APP_STATUS", 0);
        this.f60914f = c14532a.m84712a("BaseAppCommand.EXTRA__HYBRIDVERSION");
    }

    /* JADX INFO: renamed from: f */
    public final int m84750f() {
        return this.f60913e;
    }

    /* JADX INFO: renamed from: g */
    public final void m84751g() {
        this.f60914f = null;
    }

    /* JADX INFO: renamed from: h */
    public final String m84752h() {
        return this.f60909a;
    }

    @Override // com.vivo.push.AbstractC14621o
    public String toString() {
        return "BaseAppCommand";
    }

    /* JADX INFO: renamed from: a */
    public final void m84748a(int i) {
        this.f60913e = i;
    }
}
