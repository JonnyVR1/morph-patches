package com.vivo.push.p116b;

import android.text.TextUtils;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14680a;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.util.C14796q;

/* JADX INFO: renamed from: com.vivo.push.b.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C14698p extends AbstractC14769o {

    /* JADX INFO: renamed from: a */
    private String f61776a;

    /* JADX INFO: renamed from: b */
    private String f61777b;

    /* JADX INFO: renamed from: c */
    private byte[] f61778c;

    /* JADX INFO: renamed from: d */
    private long f61779d;

    /* JADX INFO: renamed from: e */
    private InsideNotificationItem f61780e;

    public C14698p(String str, long j, InsideNotificationItem insideNotificationItem) {
        super(5);
        this.f61776a = str;
        this.f61779d = j;
        this.f61780e = insideNotificationItem;
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        c14680a.m85887a("package_name", this.f61776a);
        c14680a.m85885a("notify_id", this.f61779d);
        c14680a.m85887a("notification_v1", C14796q.m86196b(this.f61780e));
        c14680a.m85887a("open_pkg_name", this.f61777b);
        c14680a.m85890a("open_pkg_name_encode", this.f61778c);
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        this.f61776a = c14680a.m85883a("package_name");
        this.f61779d = c14680a.m85892b("notify_id", -1L);
        this.f61777b = c14680a.m85883a("open_pkg_name");
        this.f61778c = c14680a.m85894b("open_pkg_name_encode");
        String strM85883a = c14680a.m85883a("notification_v1");
        if (!TextUtils.isEmpty(strM85883a)) {
            this.f61780e = C14796q.m86194a(strM85883a);
        }
        InsideNotificationItem insideNotificationItem = this.f61780e;
        if (insideNotificationItem != null) {
            insideNotificationItem.setMsgId(this.f61779d);
        }
    }

    /* JADX INFO: renamed from: e */
    public final long m85941e() {
        return this.f61779d;
    }

    /* JADX INFO: renamed from: f */
    public final InsideNotificationItem m85942f() {
        return this.f61780e;
    }

    @Override // com.vivo.push.AbstractC14769o
    public final String toString() {
        return "OnNotificationClickCommand";
    }

    public C14698p() {
        super(5);
    }

    /* JADX INFO: renamed from: d */
    public final String m85940d() {
        return this.f61776a;
    }
}
