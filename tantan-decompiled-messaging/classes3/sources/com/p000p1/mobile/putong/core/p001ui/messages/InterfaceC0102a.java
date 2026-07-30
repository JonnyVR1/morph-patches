package com.p000p1.mobile.putong.core.p001ui.messages;

import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.knb0;
import p003l.dml;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface InterfaceC0102a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1435a();
    }

    /* JADX INFO: renamed from: A */
    void mo1056A(Message message);

    /* JADX INFO: renamed from: J */
    List<knb0<String, Runnable, Integer, Void>> mo1057J();

    /* JADX INFO: renamed from: m */
    void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase);

    /* JADX INFO: renamed from: y */
    default void mo1210y(Message message, a aVar) {
    }

    /* JADX INFO: renamed from: U */
    default void mo1068U(dml dmlVar, Message message, a aVar) {
    }
}
