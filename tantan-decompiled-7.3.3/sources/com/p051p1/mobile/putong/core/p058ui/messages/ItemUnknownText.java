package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.core.data.Message;
import java.util.List;
import p151v.VText;
import p153l.g9c0;
import p153l.gta;
import p153l.ovb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemUnknownText extends VText implements InterfaceC8682a {
    public ItemUnknownText(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
        if (gta.m132210e().m132214d().mo34702I4()) {
            setTextColor(getResources().getColor(g9c0.f102817g));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: y */
    public void mo49313y(Message message, InterfaceC8682a.a aVar) {
    }

    public ItemUnknownText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemUnknownText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
