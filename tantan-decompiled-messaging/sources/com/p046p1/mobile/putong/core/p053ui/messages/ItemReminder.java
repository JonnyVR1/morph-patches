package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.core.data.Message;
import java.util.List;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p149l.knb0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemReminder extends VLinear_FillerMeasure implements InterfaceC8519a {

    /* JADX INFO: renamed from: b */
    public VText f31470b;

    public ItemReminder(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31470b.setText(message.value);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31470b = (VText) findViewById(y4c0.f195933A4);
    }

    public ItemReminder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemReminder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
