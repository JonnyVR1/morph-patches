package com.vivo.push.p111b;

import android.text.TextUtils;
import com.vivo.push.C14532a;
import com.vivo.push.model.UnvarnishedMessage;

/* JADX INFO: renamed from: com.vivo.push.b.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C14549o extends AbstractC14556v {

    /* JADX INFO: renamed from: a */
    protected UnvarnishedMessage f60928a;

    public C14549o() {
        super(3);
    }

    @Override // com.vivo.push.p111b.AbstractC14556v, com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        c14532a.m84716a("msg_v1", this.f60928a.unpackToJson());
    }

    @Override // com.vivo.push.p111b.AbstractC14556v, com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        String strM84712a = c14532a.m84712a("msg_v1");
        if (TextUtils.isEmpty(strM84712a)) {
            return;
        }
        UnvarnishedMessage unvarnishedMessage = new UnvarnishedMessage(strM84712a);
        this.f60928a = unvarnishedMessage;
        unvarnishedMessage.setMsgId(m84780f());
    }

    /* JADX INFO: renamed from: e */
    public final UnvarnishedMessage m84768e() {
        return this.f60928a;
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    public final String toString() {
        return "OnMessageCommand";
    }

    /* JADX INFO: renamed from: d */
    public final String m84767d() {
        UnvarnishedMessage unvarnishedMessage = this.f60928a;
        if (unvarnishedMessage == null) {
            return null;
        }
        return unvarnishedMessage.unpackToJson();
    }
}
