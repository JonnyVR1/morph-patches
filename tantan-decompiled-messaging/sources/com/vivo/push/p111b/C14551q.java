package com.vivo.push.p111b;

import android.text.TextUtils;
import com.vivo.push.C14532a;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.util.C14648q;

/* JADX INFO: renamed from: com.vivo.push.b.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C14551q extends AbstractC14556v {

    /* JADX INFO: renamed from: a */
    protected InsideNotificationItem f60934a;

    /* JADX INFO: renamed from: b */
    private String f60935b;

    public C14551q() {
        super(4);
    }

    @Override // com.vivo.push.p111b.AbstractC14556v, com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        String strM85025b = C14648q.m85025b(this.f60934a);
        this.f60935b = strM85025b;
        c14532a.m84716a("notification_v1", strM85025b);
    }

    @Override // com.vivo.push.p111b.AbstractC14556v, com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        String strM84712a = c14532a.m84712a("notification_v1");
        this.f60935b = strM84712a;
        if (TextUtils.isEmpty(strM84712a)) {
            return;
        }
        InsideNotificationItem insideNotificationItemM85023a = C14648q.m85023a(this.f60935b);
        this.f60934a = insideNotificationItemM85023a;
        if (insideNotificationItemM85023a != null) {
            insideNotificationItemM85023a.setMsgId(m84780f());
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m84773e() {
        if (!TextUtils.isEmpty(this.f60935b)) {
            return this.f60935b;
        }
        InsideNotificationItem insideNotificationItem = this.f60934a;
        if (insideNotificationItem == null) {
            return null;
        }
        return C14648q.m85025b(insideNotificationItem);
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    public final String toString() {
        return "OnNotifyArrivedCommand";
    }

    /* JADX INFO: renamed from: d */
    public final InsideNotificationItem m84772d() {
        return this.f60934a;
    }
}
