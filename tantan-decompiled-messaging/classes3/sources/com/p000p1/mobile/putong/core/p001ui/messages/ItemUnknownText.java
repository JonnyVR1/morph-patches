package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.a1c0;
import l.knb0;
import l.ura;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemUnknownText extends VText implements InterfaceC0102a {
    public ItemUnknownText(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
        if (ura.e().d().I4()) {
            setTextColor(getResources().getColor(a1c0.g));
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: y */
    public void mo1210y(Message message, InterfaceC0102a.a aVar) {
    }

    public ItemUnknownText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemUnknownText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
