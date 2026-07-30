package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.knb0;
import l.y4c0;
import p028v.VLinear_FillerMeasure;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemReminder extends VLinear_FillerMeasure implements InterfaceC0102a {

    /* JADX INFO: renamed from: b */
    public VText f1361b;

    public ItemReminder(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f1361b.setText(message.value);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1361b = (VText) findViewById(y4c0.A4);
    }

    public ItemReminder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemReminder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
