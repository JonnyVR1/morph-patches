package com.p046p1.mobile.putong.core.p053ui.messages;

import com.p046p1.mobile.putong.core.data.Message;
import java.util.List;
import p149l.dml;
import p149l.knb0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.a */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8519a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo48351a();
    }

    /* JADX INFO: renamed from: A */
    void mo42388A(Message message);

    /* JADX INFO: renamed from: J */
    List<knb0<String, Runnable, Integer, Void>> mo42389J();

    /* JADX INFO: renamed from: m */
    void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase);

    /* JADX INFO: renamed from: y */
    default void mo48130y(Message message, a aVar) {
    }

    /* JADX INFO: renamed from: U */
    default void mo47990U(dml dmlVar, Message message, a aVar) {
    }
}
