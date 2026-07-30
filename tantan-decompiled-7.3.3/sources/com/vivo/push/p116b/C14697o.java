package com.vivo.push.p116b;

import android.text.TextUtils;
import com.vivo.push.C14680a;
import com.vivo.push.model.UnvarnishedMessage;

/* JADX INFO: renamed from: com.vivo.push.b.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C14697o extends AbstractC14704v {

    /* JADX INFO: renamed from: a */
    protected UnvarnishedMessage f61775a;

    public C14697o() {
        super(3);
    }

    @Override // com.vivo.push.p116b.AbstractC14704v, com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        c14680a.m85887a("msg_v1", this.f61775a.unpackToJson());
    }

    @Override // com.vivo.push.p116b.AbstractC14704v, com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        String strM85883a = c14680a.m85883a("msg_v1");
        if (TextUtils.isEmpty(strM85883a)) {
            return;
        }
        UnvarnishedMessage unvarnishedMessage = new UnvarnishedMessage(strM85883a);
        this.f61775a = unvarnishedMessage;
        unvarnishedMessage.setMsgId(m85951f());
    }

    /* JADX INFO: renamed from: e */
    public final UnvarnishedMessage m85939e() {
        return this.f61775a;
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    public final String toString() {
        return "OnMessageCommand";
    }

    /* JADX INFO: renamed from: d */
    public final String m85938d() {
        UnvarnishedMessage unvarnishedMessage = this.f61775a;
        if (unvarnishedMessage == null) {
            return null;
        }
        return unvarnishedMessage.unpackToJson();
    }
}
