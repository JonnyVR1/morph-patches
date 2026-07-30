package com.vivo.push.p116b;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14680a;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14799t;

/* JADX INFO: renamed from: com.vivo.push.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14685c extends AbstractC14769o {

    /* JADX INFO: renamed from: a */
    private String f61756a;

    /* JADX INFO: renamed from: b */
    private String f61757b;

    /* JADX INFO: renamed from: c */
    private long f61758c;

    /* JADX INFO: renamed from: d */
    private int f61759d;

    /* JADX INFO: renamed from: e */
    private int f61760e;

    /* JADX INFO: renamed from: f */
    private String f61761f;

    public C14685c(int i, String str) {
        super(i);
        this.f61758c = -1L;
        this.f61759d = -1;
        this.f61756a = null;
        this.f61757b = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m85918a(Context context) {
        if (this.f61759d == -1) {
            String strM86100a = this.f61757b;
            if (TextUtils.isEmpty(strM86100a)) {
                C14795p.m86179a("BaseAppCommand", "pkg name is null");
                strM86100a = m86100a();
                if (TextUtils.isEmpty(strM86100a)) {
                    C14795p.m86179a("BaseAppCommand", "src is null");
                    return -1;
                }
            }
            this.f61759d = C14799t.m86203b(context, strM86100a);
            if (!TextUtils.isEmpty(this.f61761f)) {
                this.f61759d = 2;
            }
        }
        return this.f61759d;
    }

    /* JADX INFO: renamed from: b */
    public final void m85920b(String str) {
        this.f61756a = str;
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public void mo85914c(C14680a c14680a) {
        c14680a.m85887a("req_id", this.f61756a);
        c14680a.m85887a("package_name", this.f61757b);
        c14680a.m85885a(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, 323L);
        c14680a.m85884a("PUSH_APP_STATUS", this.f61759d);
        if (TextUtils.isEmpty(this.f61761f)) {
            return;
        }
        c14680a.m85887a("BaseAppCommand.EXTRA__HYBRIDVERSION", this.f61761f);
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public void mo85915d(C14680a c14680a) {
        this.f61756a = c14680a.m85883a("req_id");
        this.f61757b = c14680a.m85883a("package_name");
        this.f61758c = c14680a.m85892b(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, 0L);
        this.f61759d = c14680a.m85891b("PUSH_APP_STATUS", 0);
        this.f61761f = c14680a.m85883a("BaseAppCommand.EXTRA__HYBRIDVERSION");
    }

    /* JADX INFO: renamed from: f */
    public final int m85921f() {
        return this.f61760e;
    }

    /* JADX INFO: renamed from: g */
    public final void m85922g() {
        this.f61761f = null;
    }

    /* JADX INFO: renamed from: h */
    public final String m85923h() {
        return this.f61756a;
    }

    @Override // com.vivo.push.AbstractC14769o
    public String toString() {
        return "BaseAppCommand";
    }

    /* JADX INFO: renamed from: a */
    public final void m85919a(int i) {
        this.f61760e = i;
    }
}
