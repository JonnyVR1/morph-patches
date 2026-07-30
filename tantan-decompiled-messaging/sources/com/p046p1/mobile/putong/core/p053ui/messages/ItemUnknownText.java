package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.core.data.Message;
import java.util.List;
import p147v.VText;
import p149l.a1c0;
import p149l.knb0;
import p149l.ura;

/* JADX INFO: loaded from: classes3.dex */
public class ItemUnknownText extends VText implements InterfaceC8519a {
    public ItemUnknownText(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
        if (ura.m195053e().m195057d().mo33699I4()) {
            setTextColor(getResources().getColor(a1c0.f67153g));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: y */
    public void mo48130y(Message message, InterfaceC8519a.a aVar) {
    }

    public ItemUnknownText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemUnknownText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
