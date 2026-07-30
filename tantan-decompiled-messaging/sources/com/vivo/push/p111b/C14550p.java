package com.vivo.push.p111b;

import android.text.TextUtils;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14532a;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.util.C14648q;

/* JADX INFO: renamed from: com.vivo.push.b.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C14550p extends AbstractC14621o {

    /* JADX INFO: renamed from: a */
    private String f60929a;

    /* JADX INFO: renamed from: b */
    private String f60930b;

    /* JADX INFO: renamed from: c */
    private byte[] f60931c;

    /* JADX INFO: renamed from: d */
    private long f60932d;

    /* JADX INFO: renamed from: e */
    private InsideNotificationItem f60933e;

    public C14550p(String str, long j, InsideNotificationItem insideNotificationItem) {
        super(5);
        this.f60929a = str;
        this.f60932d = j;
        this.f60933e = insideNotificationItem;
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        c14532a.m84716a("package_name", this.f60929a);
        c14532a.m84714a("notify_id", this.f60932d);
        c14532a.m84716a("notification_v1", C14648q.m85025b(this.f60933e));
        c14532a.m84716a("open_pkg_name", this.f60930b);
        c14532a.m84719a("open_pkg_name_encode", this.f60931c);
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        this.f60929a = c14532a.m84712a("package_name");
        this.f60932d = c14532a.m84721b("notify_id", -1L);
        this.f60930b = c14532a.m84712a("open_pkg_name");
        this.f60931c = c14532a.m84723b("open_pkg_name_encode");
        String strM84712a = c14532a.m84712a("notification_v1");
        if (!TextUtils.isEmpty(strM84712a)) {
            this.f60933e = C14648q.m85023a(strM84712a);
        }
        InsideNotificationItem insideNotificationItem = this.f60933e;
        if (insideNotificationItem != null) {
            insideNotificationItem.setMsgId(this.f60932d);
        }
    }

    /* JADX INFO: renamed from: e */
    public final long m84770e() {
        return this.f60932d;
    }

    /* JADX INFO: renamed from: f */
    public final InsideNotificationItem m84771f() {
        return this.f60933e;
    }

    @Override // com.vivo.push.AbstractC14621o
    public final String toString() {
        return "OnNotificationClickCommand";
    }

    public C14550p() {
        super(5);
    }

    /* JADX INFO: renamed from: d */
    public final String m84769d() {
        return this.f60929a;
    }
}
