package com.p051p1.mobile.putong.core.p058ui.messages;

import com.p051p1.mobile.putong.core.data.Message;
import java.util.List;
import p153l.ovb0;
import p153l.pol;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.a */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8682a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo49534a();
    }

    /* JADX INFO: renamed from: A */
    void mo43399A(Message message);

    /* JADX INFO: renamed from: J */
    List<ovb0<String, Runnable, Integer, Void>> mo43400J();

    /* JADX INFO: renamed from: m */
    void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase);

    /* JADX INFO: renamed from: y */
    default void mo49313y(Message message, a aVar) {
    }

    /* JADX INFO: renamed from: U */
    default void mo49173U(pol polVar, Message message, a aVar) {
    }
}
