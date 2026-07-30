package com.vivo.push.p116b;

import android.text.TextUtils;
import com.vivo.push.C14680a;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.util.C14796q;

/* JADX INFO: renamed from: com.vivo.push.b.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C14699q extends AbstractC14704v {

    /* JADX INFO: renamed from: a */
    protected InsideNotificationItem f61781a;

    /* JADX INFO: renamed from: b */
    private String f61782b;

    public C14699q() {
        super(4);
    }

    @Override // com.vivo.push.p116b.AbstractC14704v, com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        String strM86196b = C14796q.m86196b(this.f61781a);
        this.f61782b = strM86196b;
        c14680a.m85887a("notification_v1", strM86196b);
    }

    @Override // com.vivo.push.p116b.AbstractC14704v, com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        String strM85883a = c14680a.m85883a("notification_v1");
        this.f61782b = strM85883a;
        if (TextUtils.isEmpty(strM85883a)) {
            return;
        }
        InsideNotificationItem insideNotificationItemM86194a = C14796q.m86194a(this.f61782b);
        this.f61781a = insideNotificationItemM86194a;
        if (insideNotificationItemM86194a != null) {
            insideNotificationItemM86194a.setMsgId(m85951f());
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m85944e() {
        if (!TextUtils.isEmpty(this.f61782b)) {
            return this.f61782b;
        }
        InsideNotificationItem insideNotificationItem = this.f61781a;
        if (insideNotificationItem == null) {
            return null;
        }
        return C14796q.m86196b(insideNotificationItem);
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    public final String toString() {
        return "OnNotifyArrivedCommand";
    }

    /* JADX INFO: renamed from: d */
    public final InsideNotificationItem m85943d() {
        return this.f61781a;
    }
}
