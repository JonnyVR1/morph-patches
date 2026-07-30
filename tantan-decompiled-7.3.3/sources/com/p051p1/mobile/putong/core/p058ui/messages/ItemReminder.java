package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.core.data.Message;
import java.util.List;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p153l.edc0;
import p153l.ovb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemReminder extends VLinear_FillerMeasure implements InterfaceC8682a {

    /* JADX INFO: renamed from: b */
    public VText f32318b;

    public ItemReminder(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f32318b.setText(message.value);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32318b = (VText) findViewById(edc0.f93168A4);
    }

    public ItemReminder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemReminder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
